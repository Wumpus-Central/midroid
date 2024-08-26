package com.discord.simpleast.code

import android.text.SpannableStringBuilder
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import eh.w
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public object Xml {
   public final val PATTERN_XML_COMMENT: Pattern
   public final val PATTERN_XML_TAG: Pattern
   public const val PATTERN_XML_TAG_CLOSING_GROUP: Int = 3
   public const val PATTERN_XML_TAG_CONTENT_GROUP: Int = 2
   public const val PATTERN_XML_TAG_OPENING_GROUP: Int = 1

   @JvmStatic
   fun {
      var var0: Pattern = Pattern.compile("^<!--[\\s\\S]*?-->", 32);
      r.g(var0, "Pattern.compile(\"\"\"^<!--…*?-->\"\"\", Pattern.DOTALL)");
      PATTERN_XML_COMMENT = var0;
      var0 = Pattern.compile("^<([\\s\\S]+?)(?:>(.*?)<\\/([\\s\\S]+?))?>", 32);
      r.g(var0, "Pattern.compile(\n      \"…?))?>\"\"\", Pattern.DOTALL)");
      PATTERN_XML_TAG = var0;
   }

   public fun <RC, S> createTagRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
      r.h(var1, "codeStyleProviders");
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
            r.h(var1, "matcher");
            r.h(var2, "parser");
            val var4: java.lang.String = var1.group(1);
            r.e(var4);
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
         r.h(var1, "opening");
         r.h(var3, "codeStyleProviders");
         super();
         this.opening = var1;
         this.closing = var2;
         this.codeStyleProviders = var3;
      }

      public override fun render(builder: SpannableStringBuilder, renderContext: Any) {
         r.h(var1, "builder");
         var var8: java.lang.String = this.opening;
         val var7: Int = this.opening.length();
         var var4: Int = 0;

         while (true) {
            if (var4 >= var7) {
               var4 = -1;
               break;
            }

            val var3: Char = var8.charAt(var4);
            val var5: Boolean;
            if (!a.c(var3) && var3 != '/') {
               var5 = false;
            } else {
               var5 = true;
            }

            if (var5) {
               break;
            }

            var4++;
         }

         val var19: Pair;
         if (var4 != -1) {
            if (this.opening == null) {
               throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            var8 = this.opening.substring(0, var4);
            r.g(var8, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (this.opening == null) {
               throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }

            val var21: java.lang.String = this.opening.substring(var4);
            r.g(var21, "(this as java.lang.String).substring(startIndex)");
            var19 = w.a(var8, var21);
         } else {
            var19 = w.a(this.opening, "");
         }

         val var10: java.lang.String = var19.a() as java.lang.String;
         val var22: java.lang.String = var19.b() as java.lang.String;
         val var20: Function1 = new Function1<RC, java.lang.Iterable<?>>(this.codeStyleProviders.getGenericsStyleProvider()) {
            {
               super(1, var1, StyleNode.SpanProvider::class.java, "get", "get(Ljava/lang/Object;)Ljava/lang/Iterable;", 0);
            }

            public final java.lang.Iterable<?> invoke(RC var1) {
               return (super.receiver as StyleNode.SpanProvider).get(var1);
            }
         };
         var4 = var1.length();
         val var11: StringBuilder = new StringBuilder();
         var11.append('<');
         var11.append(var10);
         var1.append(var11.toString());
         val var27: java.util.Iterator = (var20.invoke(var2) as java.lang.Iterable).iterator();

         while (var27.hasNext()) {
            var1.setSpan(var27.next(), var4, var1.length(), 33);
         }

         var4 = var1.length();
         val var28: StringBuilder = new StringBuilder();
         var28.append(var22);
         var28.append('>');
         var1.append(var28.toString());
         val var23: java.util.Iterator = this.codeStyleProviders.getParamsStyleProvider().get((RC)var2).iterator();

         while (var23.hasNext()) {
            var1.setSpan(var23.next(), var4, var1.length() - 1, 33);
         }

         val var24: java.util.Iterator = (var20.invoke(var2) as java.lang.Iterable).iterator();

         while (var24.hasNext()) {
            var1.setSpan(var24.next(), var1.length() - 1, var1.length(), 33);
         }

         label55: {
            super.render(var1, var2);
            if (this.closing != null) {
               var15 = false;
               if (this.closing.length() != 0) {
                  break label55;
               }
            }

            var15 = true;
         }

         if (!var15) {
            var4 = var1.length();
            val var26: StringBuilder = new StringBuilder();
            var26.append("</");
            var26.append(this.closing);
            var26.append('>');
            var1.append(var26.toString());
            var2 = (var20.invoke(var2) as java.lang.Iterable).iterator();

            while (var2.hasNext()) {
               var1.setSpan(var2.next(), var4 + 1, var1.length(), 33);
            }
         }
      }
   }
}
