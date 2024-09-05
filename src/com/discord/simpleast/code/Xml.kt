package com.discord.simpleast.code

import android.text.SpannableStringBuilder
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import vj.w

public object Xml {
   public final val PATTERN_XML_COMMENT: Pattern
   public final val PATTERN_XML_TAG: Pattern
   public const val PATTERN_XML_TAG_CLOSING_GROUP: Int = 3
   public const val PATTERN_XML_TAG_CONTENT_GROUP: Int = 2
   public const val PATTERN_XML_TAG_OPENING_GROUP: Int = 1

   @JvmStatic
   fun {
      var var0: Pattern = Pattern.compile("^<!--[\\s\\S]*?-->", 32);
      q.g(var0, "Pattern.compile(\"\"\"^<!--…*?-->\"\"\", Pattern.DOTALL)");
      PATTERN_XML_COMMENT = var0;
      var0 = Pattern.compile("^<([\\s\\S]+?)(?:>(.*?)<\\/([\\s\\S]+?))?>", 32);
      q.g(var0, "Pattern.compile(\n      \"…?))?>\"\"\", Pattern.DOTALL)");
      PATTERN_XML_TAG = var0;
   }

   public fun <RC, S> createTagRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
      q.h(var1, "codeStyleProviders");
      return new Rule<RC, Node<RC>, S>(this, var1, PATTERN_XML_TAG) {
         final CodeStyleProviders $codeStyleProviders;
         final Xml this$0;

         {
            super(var3);
            this.this$0 = var1;
            this.$codeStyleProviders = var2;
         }

         @Override
         public ParseSpec<RC, S> parse(Matcher var1, Parser<RC, ? super Node<RC>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            val var4: java.lang.String = var1.group(1);
            q.e(var4);
            val var6: java.lang.String = var1.group(3);
            val var5: ParseSpec;
            if (var1.group(2) != null) {
               var5 = ParseSpec.Companion.createNonterminal(new Xml.TagNode(var4, var6, this.$codeStyleProviders), var3, var1.start(2), var1.end(2));
            } else {
               var5 = ParseSpec.Companion.createTerminal(new Xml.TagNode(var4, var6, this.$codeStyleProviders), var3);
            }

            return var5;
         }
      };
   }

   public class TagNode<RC>(opening: String, closing: String?, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent<RC> {
      public final val closing: String?
      private final val codeStyleProviders: CodeStyleProviders<Any>
      public final val opening: String

      init {
         q.h(var1, "opening");
         q.h(var3, "codeStyleProviders");
         super();
         this.opening = var1;
         this.closing = var2;
         this.codeStyleProviders = var3;
      }

      public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
         q.h(var1, "builder");
         var var7: java.lang.String = this.opening;
         val var6: Int = this.opening.length();
         var var4: Int = 0;

         var var5: Int;
         while (true) {
            if (var4 >= var6) {
               var5 = -1;
               break;
            }

            val var3: Char = var7.charAt(var4);
            var5 = var4;
            if (a.c(var3)) {
               break;
            }

            if (var3 == '/') {
               var5 = var4;
               break;
            }

            var4++;
         }

         val var17: Pair;
         if (var5 != -1) {
            if (this.opening == null) {
               throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            var7 = this.opening.substring(0, var5);
            q.g(var7, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (this.opening == null) {
               throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            val var19: java.lang.String = this.opening.substring(var5);
            q.g(var19, "(this as java.lang.String).substring(startIndex)");
            var17 = w.a(var7, var19);
         } else {
            var17 = w.a(this.opening, "");
         }

         val var9: java.lang.String = var17.a() as java.lang.String;
         val var20: java.lang.String = var17.b() as java.lang.String;
         val var18: Function1 = new Function1(this.codeStyleProviders.getGenericsStyleProvider()) {
            {
               super(1, var1, StyleNode.SpanProvider::class.java, "get", "get(Ljava/lang/Object;)Ljava/lang/Iterable;", 0);
            }

            public final java.lang.Iterable<?> invoke(RC var1) {
               return (super.receiver as StyleNode.SpanProvider).get(var1);
            }
         };
         var4 = var1.length();
         val var10: StringBuilder = new StringBuilder();
         var10.append('<');
         var10.append(var9);
         var1.append(var10.toString());
         val var25: java.util.Iterator = (var18.invoke(var2) as java.lang.Iterable).iterator();

         while (var25.hasNext()) {
            var1.setSpan(var25.next(), var4, var1.length(), 33);
         }

         var4 = var1.length();
         val var26: StringBuilder = new StringBuilder();
         var26.append(var20);
         var26.append('>');
         var1.append(var26.toString());
         val var21: java.util.Iterator = this.codeStyleProviders.getParamsStyleProvider().get((RC)var2).iterator();

         while (var21.hasNext()) {
            var1.setSpan(var21.next(), var4, var1.length() - 1, 33);
         }

         val var22: java.util.Iterator = (var18.invoke(var2) as java.lang.Iterable).iterator();

         while (var22.hasNext()) {
            var1.setSpan(var22.next(), var1.length() - 1, var1.length(), 33);
         }

         super.render(var1, var2);
         if (this.closing != null && this.closing.length() != 0) {
            var4 = var1.length();
            val var24: StringBuilder = new StringBuilder();
            var24.append("</");
            var24.append(this.closing);
            var24.append('>');
            var1.append(var24.toString());
            var2 = (var18.invoke(var2) as java.lang.Iterable).iterator();

            while (var2.hasNext()) {
               var1.setSpan(var2.next(), var4 + 1, var1.length(), 33);
            }
         }
      }
   }
}
