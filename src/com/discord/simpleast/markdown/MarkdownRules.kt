package com.discord.simpleast.markdown

import android.content.Context
import android.text.style.BulletSpan
import android.text.style.CharacterStyle
import android.text.style.StyleSpan
import android.text.style.TextAppearanceSpan
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import com.discord.simpleast.core.simple.SimpleMarkdownRules
import java.util.ArrayList
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.functions.Function1
import org.jetbrains.annotations.NotNull

public object MarkdownRules {
   public final val PATTERN_HEADER_ITEM: Pattern
   public final val PATTERN_HEADER_ITEM_ALT: Pattern
   public final val PATTERN_HEADER_ITEM_ALT_CLASSED: Pattern =
      new Regex("^\\s*(?:(?:(.+)(?: +\\{([\\w ]*)\\}))|(.*))[ \\t]*\\n *([=\\-]){3,}[ \\t]*(?=\\n|$)").l()
      public final val PATTERN_LIST_ITEM: Pattern

   @JvmStatic
   fun {
      var var0: Pattern = Pattern.compile("^\\*[ \\t](.*)(?=\\n|$)", 0);
      PATTERN_LIST_ITEM = var0;
      var0 = Pattern.compile("^\\s*(#+)[ \\t](.*) *(?=\\n|$)", 0);
      PATTERN_HEADER_ITEM = var0;
      var0 = Pattern.compile("^\\s*(.+)\\n *(=|-){3,} *(?=\\n|$)", 0);
      PATTERN_HEADER_ITEM_ALT = var0;
   }

   @JvmStatic
   public fun <R, S> createHeaderRules(context: Context, headerStyles: List<Int>): List<Rule<R, Node<R>, S>> {
      val var2: Function1 = new Function1<Integer, CharacterStyle>(var0, var1) {
         final Context $context;
         final java.util.List $headerStyles;

         {
            super(1);
            this.$context = var1;
            this.$headerStyles = var2;
         }

         @NotNull
         public final CharacterStyle invoke(int var1) {
            if (var1 == 0) {
               return new TextAppearanceSpan(this.$context, (this.$headerStyles.get(0) as java.lang.Number).intValue());
            } else {
               return (CharacterStyle)(if (1 <= var1 && this.$headerStyles.size() >= var1)
                  new TextAppearanceSpan(this.$context, (this.$headerStyles.get(var1 - 1) as java.lang.Number).intValue())
                  else
                  new StyleSpan(3));
            }
         }
      };
      return CollectionsKt.o(new MarkdownRules.HeaderRule[]{new MarkdownRules.HeaderRule(new Function1<Integer, CharacterStyle>(var2) {
         final <unrepresentable> $spanProvider$1;

         {
            super(1, null, "spanProvider", "invoke(I)Landroid/text/style/CharacterStyle;", 0);
            this.$spanProvider$1 = var1;
         }

         @NotNull
         public final CharacterStyle invoke(int var1) {
            return this.$spanProvider$1.invoke(var1);
         }
      }), new MarkdownRules.HeaderLineRule(null, new Function1<Integer, CharacterStyle>(var2) {
         final <unrepresentable> $spanProvider$1;

         {
            super(1, null, "spanProvider", "invoke(I)Landroid/text/style/CharacterStyle;", 0);
            this.$spanProvider$1 = var1;
         }

         @NotNull
         public final CharacterStyle invoke(int var1) {
            return this.$spanProvider$1.invoke(var1);
         }
      }, 1, null)});
   }

   @JvmStatic
   public fun <R, S> createMarkdownRules(context: Context, headerStyles: List<Int>): List<Rule<R, Node<R>, S>> {
      return CollectionsKt.M0(createHeaderRules(var0, var1), new MarkdownRules.ListItemRule(<unrepresentable>.INSTANCE));
   }

   public open class HeaderLineClassedRule<RC, T, S>(styleSpanProvider: (Int) -> CharacterStyle,
      classSpanProvider: (String) -> Any?,
      innerRules: List<Rule<Any, Node<Any>, Any>>
   ) : MarkdownRules.HeaderLineRule(MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM_ALT_CLASSED(), var1) {
      public final val classSpanProvider: (String) -> Any?
      protected final val innerRules: List<Rule<Any, Node<Any>, Any>>

      public constructor(styleSpanProvider: (Int) -> CharacterStyle, classSpanProvider: (String) -> Any?) : this(
            var1,
            var2,
            CollectionsKt.M0(SimpleMarkdownRules.createSimpleMarkdownRules$default(false, false, 2, null), SimpleMarkdownRules.INSTANCE.createTextRule())
         )
      init {
         this.classSpanProvider = var2;
         this.innerRules = var3;
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         var var4: java.lang.String = var1.group(4);
         val var5: StyleNode = this.createHeaderStyleNode(var4);
         var4 = var1.group(1);
         if (var4 == null) {
            var4 = var1.group(3);
         }
         for (Object var13 : var2.parse(var4, var3, this.innerRules)) {
            if (var13 == null) {
               throw new NullPointerException("null cannot be cast to non-null type com.discord.simpleast.core.node.Node<RC>");
            }

            var5.addChild(var13 as Node);
         }

         label42: {
            val var6: java.lang.String = var1.group(2);
            if (var6 != null) {
               val var7: java.lang.String = StringsKt.i1(var6).toString();
               if (var7 != null) {
                  var8 = StringsKt.J0(var7, new char[]{' '}, false, 0, 6, null);
                  break label42;
               }
            }

            var8 = null;
         }

         var var10: Any;
         if (var8 != null) {
            var10 = var8;
            val var14: ArrayList = new ArrayList();
            val var18: java.util.Iterator = var10.iterator();

            while (true) {
               var10 = var14;
               if (!var18.hasNext()) {
                  break;
               }

               var10 = (java.lang.Iterable)this.classSpanProvider.invoke(var18.next() as java.lang.String);
               if (var10 != null) {
                  var14.add(var10);
               }
            }
         } else {
            var10 = CollectionsKt.l();
         }

         var var15: StyleNode = var5;
         if (!(var10 as java.util.Collection).isEmpty()) {
            var15 = new StyleNode(var10);
            var15.addChild(var5);
         }

         return ParseSpec.Companion.createTerminal(var15, (S)var3);
      }
   }

   public open class HeaderLineRule<R, S>(pattern: Pattern = MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM_ALT(), styleSpanProvider: (Int) -> CharacterStyle) : MarkdownRules.HeaderRule(
         var1, var2
      ) {
      protected override fun createHeaderStyleNode(headerStyleGroup: String): StyleNode<Any, CharacterStyle> {
         val var2: Byte;
         if (var1.hashCode() == 61 && var1.equals("=")) {
            var2 = 1;
         } else {
            var2 = 2;
         }

         return new StyleNode<>(CollectionsKt.e(this.getStyleSpanProvider().invoke(Integer.valueOf(var2))));
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         val var5: ParseSpec.Companion = ParseSpec.Companion;
         val var4: java.lang.String = var1.group(2);
         return var5.createNonterminal(this.createHeaderStyleNode(var4), (S)var3, var1.start(1), var1.end(1));
      }
   }

   public open class HeaderRule<R, S>(pattern: Pattern, styleSpanProvider: (Int) -> CharacterStyle) : Rule.BlockRule(var1) {
      protected final val styleSpanProvider: (Int) -> CharacterStyle

      init {
         this.styleSpanProvider = var2;
      }

      public constructor(styleSpanProvider: (Int) -> CharacterStyle) : this(MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM(), var1)
      protected open fun createHeaderStyleNode(headerStyleGroup: String): StyleNode<Any, CharacterStyle> {
         return new StyleNode<>(CollectionsKt.e(this.styleSpanProvider.invoke(var1.length())));
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         val var4: ParseSpec.Companion = ParseSpec.Companion;
         val var5: java.lang.String = var1.group(1);
         return var4.createNonterminal(this.createHeaderStyleNode(var5), (S)var3, var1.start(2), var1.end(2));
      }
   }

   public class ListItemRule<R, S>(bulletSpanProvider: () -> BulletSpan) : Rule.BlockRule(MarkdownRules.INSTANCE.getPATTERN_LIST_ITEM()) {
      private final val bulletSpanProvider: () -> BulletSpan

      init {
         this.bulletSpanProvider = var1;
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         return ParseSpec.Companion.createNonterminal(new MarkdownListItemNode<>(this.bulletSpanProvider), (S)var3, var1.start(1), var1.end(1));
      }
   }
}
