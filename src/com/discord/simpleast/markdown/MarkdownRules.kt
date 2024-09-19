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
import kotlin.jvm.internal.q

public object MarkdownRules {
   public final val PATTERN_HEADER_ITEM: Pattern
   public final val PATTERN_HEADER_ITEM_ALT: Pattern
   public final val PATTERN_HEADER_ITEM_ALT_CLASSED: Pattern =
      new Regex("^\\s*(?:(?:(.+)(?: +\\{([\\w ]*)\\}))|(.*))[ \\t]*\\n *([=\\-]){3,}[ \\t]*(?=\\n|$)").k()
      public final val PATTERN_LIST_ITEM: Pattern

   @JvmStatic
   fun {
      var var0: Pattern = Pattern.compile("^\\*[ \\t](.*)(?=\\n|$)", 0);
      q.g(var0, "java.util.regex.Pattern.compile(this, flags)");
      PATTERN_LIST_ITEM = var0;
      var0 = Pattern.compile("^\\s*(#+)[ \\t](.*) *(?=\\n|$)", 0);
      q.g(var0, "java.util.regex.Pattern.compile(this, flags)");
      PATTERN_HEADER_ITEM = var0;
      var0 = Pattern.compile("^\\s*(.+)\\n *(=|-){3,} *(?=\\n|$)", 0);
      q.g(var0, "java.util.regex.Pattern.compile(this, flags)");
      PATTERN_HEADER_ITEM_ALT = var0;
   }

   @JvmStatic
   public fun <R, S> createHeaderRules(context: Context, headerStyles: List<Int>): List<Rule<R, Node<R>, S>> {
      q.h(var0, "context");
      q.h(var1, "headerStyles");
      val var2: Function1 = new Function1(var0, var1) {
         final Context $context;
         final java.util.List $headerStyles;

         {
            super(1);
            this.$context = var1;
            this.$headerStyles = var2;
         }

         public final CharacterStyle invoke(int var1) {
            val var3: Any;
            if (var1 == 0) {
               var3 = new TextAppearanceSpan(this.$context, (this.$headerStyles.get(0) as java.lang.Number).intValue());
            } else if (1 <= var1 && this.$headerStyles.size() >= var1) {
               var3 = new TextAppearanceSpan(this.$context, (this.$headerStyles.get(var1 - 1) as java.lang.Number).intValue());
            } else {
               var3 = new StyleSpan(3);
            }

            return (CharacterStyle)var3;
         }
      };
      return i.n(new MarkdownRules.HeaderRule[]{new MarkdownRules.HeaderRule(new Function1(var2) {
         final <unrepresentable> $spanProvider$1;

         {
            super(1, null, "spanProvider", "invoke(I)Landroid/text/style/CharacterStyle;", 0);
            this.$spanProvider$1 = var1;
         }

         public final CharacterStyle invoke(int var1) {
            return this.$spanProvider$1.invoke(var1);
         }
      }), new MarkdownRules.HeaderLineRule(null, new Function1(var2) {
         final <unrepresentable> $spanProvider$1;

         {
            super(1, null, "spanProvider", "invoke(I)Landroid/text/style/CharacterStyle;", 0);
            this.$spanProvider$1 = var1;
         }

         public final CharacterStyle invoke(int var1) {
            return this.$spanProvider$1.invoke(var1);
         }
      }, 1, null)});
   }

   @JvmStatic
   public fun <R, S> createMarkdownRules(context: Context, headerStyles: List<Int>): List<Rule<R, Node<R>, S>> {
      q.h(var0, "context");
      q.h(var1, "headerStyles");
      return i.A0(createHeaderRules(var0, var1), new MarkdownRules.ListItemRule(<unrepresentable>.INSTANCE));
   }

   public open class HeaderLineClassedRule<RC, T, S>(styleSpanProvider: (Int) -> CharacterStyle,
         classSpanProvider: (String) -> Any?,
         innerRules: List<Rule<Any, Node<Any>, Any>>
      )
      : MarkdownRules.HeaderLineRule<RC, S> {
      public final val classSpanProvider: (String) -> Any?
      protected final val innerRules: List<Rule<Any, Node<Any>, Any>>

      public constructor(styleSpanProvider: (Int) -> CharacterStyle, classSpanProvider: (String) -> Any?) : q.h(var1, "styleSpanProvider") {
         q.h(var2, "classSpanProvider");
         this(var1, var2, i.A0(SimpleMarkdownRules.createSimpleMarkdownRules$default(false, false, 2, null), SimpleMarkdownRules.INSTANCE.createTextRule()));
      }

      init {
         q.h(var1, "styleSpanProvider");
         q.h(var2, "classSpanProvider");
         q.h(var3, "innerRules");
         super(MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM_ALT_CLASSED(), var1);
         this.classSpanProvider = var2;
         this.innerRules = var3;
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         q.h(var1, "matcher");
         q.h(var2, "parser");
         var var4: java.lang.String = var1.group(4);
         q.g(var4, "matcher.group(4)");
         val var5: StyleNode = this.createHeaderStyleNode(var4);
         var4 = var1.group(1);
         if (var4 == null) {
            var4 = var1.group(3);
         }

         q.g(var4, "headerBody");

         for (var4 : var2.parse(var4, var3, this.innerRules)) {
            if (var4 == null) {
               throw new NullPointerException("null cannot be cast to non-null type com.discord.simpleast.core.node.Node<RC>");
            }

            var5.addChild(var4 as Node);
         }

         label42: {
            val var6: java.lang.String = var1.group(2);
            if (var6 != null) {
               val var7: java.lang.String = h.X0(var6).toString();
               if (var7 != null) {
                  var8 = h.y0(var7, new char[]{' '}, false, 0, 6, null);
                  break label42;
               }
            }

            var8 = null;
         }

         var var9: Any;
         if (var8 != null) {
            val var13: ArrayList = new ArrayList();
            val var17: java.util.Iterator = var8.iterator();

            while (true) {
               var9 = var13;
               if (!var17.hasNext()) {
                  break;
               }

               var9 = this.classSpanProvider.invoke(var17.next() as java.lang.String);
               if (var9 != null) {
                  var13.add(var9);
               }
            }
         } else {
            var9 = i.k();
         }

         var var14: StyleNode = var5;
         if (var9.isEmpty() xor true) {
            var14 = new StyleNode((java.util.List<? extends T>)var9);
            var14.addChild(var5);
         }

         return ParseSpec.Companion.createTerminal(var14, (S)var3);
      }
   }

   public open class HeaderLineRule<R, S>(pattern: Pattern = MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM_ALT(), styleSpanProvider: (Int) -> CharacterStyle)
      : MarkdownRules.HeaderRule<R, S> {
      init {
         q.h(var1, "pattern");
         q.h(var2, "styleSpanProvider");
         super(var1, var2);
      }

      protected override fun createHeaderStyleNode(headerStyleGroup: String): StyleNode<Any, CharacterStyle> {
         q.h(var1, "headerStyleGroup");
         val var2: Byte;
         if (var1.hashCode() == 61 && var1.equals("=")) {
            var2 = 1;
         } else {
            var2 = 2;
         }

         return new StyleNode<>(i.e(this.getStyleSpanProvider().invoke(Integer.valueOf(var2))));
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         q.h(var1, "matcher");
         q.h(var2, "parser");
         val var4: ParseSpec.Companion = ParseSpec.Companion;
         val var5: java.lang.String = var1.group(2);
         q.g(var5, "matcher.group(2)");
         return var4.createNonterminal(this.createHeaderStyleNode(var5), (S)var3, var1.start(1), var1.end(1));
      }
   }

   public open class HeaderRule<R, S>(pattern: Pattern, styleSpanProvider: (Int) -> CharacterStyle) : Rule.BlockRule<R, Node<R>, S> {
      protected final val styleSpanProvider: (Int) -> CharacterStyle

      init {
         q.h(var1, "pattern");
         q.h(var2, "styleSpanProvider");
         super(var1);
         this.styleSpanProvider = var2;
      }

      public constructor(styleSpanProvider: (Int) -> CharacterStyle) : q.h(var1, "styleSpanProvider") {
         this(MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM(), var1);
      }

      protected open fun createHeaderStyleNode(headerStyleGroup: String): StyleNode<Any, CharacterStyle> {
         q.h(var1, "headerStyleGroup");
         return new StyleNode<>(i.e(this.styleSpanProvider.invoke(var1.length())));
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         q.h(var1, "matcher");
         q.h(var2, "parser");
         val var4: ParseSpec.Companion = ParseSpec.Companion;
         val var5: java.lang.String = var1.group(1);
         q.g(var5, "matcher.group(1)");
         return var4.createNonterminal(this.createHeaderStyleNode(var5), (S)var3, var1.start(2), var1.end(2));
      }
   }

   public class ListItemRule<R, S>(bulletSpanProvider: () -> BulletSpan) : Rule.BlockRule<R, Node<R>, S> {
      private final val bulletSpanProvider: () -> BulletSpan

      init {
         q.h(var1, "bulletSpanProvider");
         super(MarkdownRules.INSTANCE.getPATTERN_LIST_ITEM());
         this.bulletSpanProvider = var1;
      }

      public override fun parse(matcher: Matcher, parser: Parser<Any, in Node<Any>, Any>, state: Any): ParseSpec<Any, Any> {
         q.h(var1, "matcher");
         q.h(var2, "parser");
         return ParseSpec.Companion.createNonterminal(new MarkdownListItemNode<>(this.bulletSpanProvider), (S)var3, var1.start(1), var1.end(1));
      }
   }
}
