package com.discord.simpleast.code

import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.internal.q

public object Crystal {
   public final val BUILT_INS: Array<String>
   public final val KEYWORDS: Array<String>
   private final val PATTERN_CRYSTAL_ANNOTATION: Pattern = Pattern.compile("^@\\[(\\w+)(?:\\(.+\\))?]")
   private final val PATTERN_CRYSTAL_COMMENTS: Pattern = Pattern.compile("^(#.*)")
   private final val PATTERN_CRYSTAL_REGEX: Pattern = Pattern.compile("^/.*?/[imx]?")
   private final val PATTERN_CRYSTAL_STRINGS: Pattern = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)")
   private final val PATTERN_CRYSTAL_SYMBOL: Pattern =
      Pattern.compile(
         "^(:\"?(?:[+-/%&^|]|\\*\\*?|\\w+|(?:<(?=[<=\\s])[<=]?(?:(?<==)>)?|>(?=[>=\\s])[>=]?(?:(?<==)>)?)|\\[][?=]?|(?:!(?=[=~\\s])[=~]?|=?(?:~|==?)))(?:(?<!\\\\)\"(?=\\s|$))?)"
      )

   internal fun <RC, S> createCrystalCodeRules(codeStyleProviders: CodeStyleProviders<RC>): List<Rule<RC, Node<RC>, S>> {
      q.h(var1, "codeStyleProviders");
      val var2: CodeRules = CodeRules.INSTANCE;
      val var3: Pattern = PATTERN_CRYSTAL_COMMENTS;
      q.g(PATTERN_CRYSTAL_COMMENTS, "PATTERN_CRYSTAL_COMMENTS");
      val var8: Rule = CodeRules.toMatchGroupRule$default(var2, var3, 0, var1.getCommentStyleProvider(), 1, null);
      val var4: Pattern = PATTERN_CRYSTAL_STRINGS;
      q.g(PATTERN_CRYSTAL_STRINGS, "PATTERN_CRYSTAL_STRINGS");
      val var9: Rule = CodeRules.toMatchGroupRule$default(var2, var4, 0, var1.getLiteralStyleProvider(), 1, null);
      val var5: Pattern = PATTERN_CRYSTAL_REGEX;
      q.g(PATTERN_CRYSTAL_REGEX, "PATTERN_CRYSTAL_REGEX");
      val var10: Rule = CodeRules.toMatchGroupRule$default(var2, var5, 0, var1.getLiteralStyleProvider(), 1, null);
      var var6: Pattern = PATTERN_CRYSTAL_ANNOTATION;
      q.g(PATTERN_CRYSTAL_ANNOTATION, "PATTERN_CRYSTAL_ANNOTATION");
      val var7: Rule = CodeRules.toMatchGroupRule$default(var2, var6, 0, var1.getGenericsStyleProvider(), 1, null);
      var6 = PATTERN_CRYSTAL_SYMBOL;
      q.g(PATTERN_CRYSTAL_SYMBOL, "PATTERN_CRYSTAL_SYMBOL");
      return i.n(
         new Rule[]{
            var8,
            var9,
            var10,
            var7,
            CodeRules.toMatchGroupRule$default(var2, var6, 0, var1.getLiteralStyleProvider(), 1, null),
            Crystal.FunctionNode.Companion.createFunctionRule(var1)
         }
      );
   }

   public class FunctionNode<RC>(pre: String, signature: String, params: String?, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent<RC> {
      init {
         q.h(var1, "pre");
         q.h(var2, "signature");
         q.h(var4, "codeStyleProviders");
         val var5: StyleNode.TextStyledNode = new StyleNode.TextStyledNode(var1, var4.getKeywordStyleProvider());
         val var7: StyleNode.TextStyledNode = new StyleNode.TextStyledNode(var2, var4.getIdentifierStyleProvider());
         val var6: StyleNode.TextStyledNode;
         if (var3 != null) {
            var6 = new StyleNode.TextStyledNode(var3, var4.getParamsStyleProvider());
         } else {
            var6 = null;
         }

         super(var5, var7, var6);
      }

      public companion object {
         private final val PATTERN_CRYSTAL_FUNC: Pattern

         public fun <RC, S> createFunctionRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
            q.h(var1, "codeStyleProviders");
            val var2: Pattern = Crystal.FunctionNode.access$getPATTERN_CRYSTAL_FUNC$cp();
            q.g(var2, "PATTERN_CRYSTAL_FUNC");
            return new Rule<RC, Node<RC>, S>(this, var1, var2) {
               final CodeStyleProviders $codeStyleProviders;
               final Crystal.FunctionNode.Companion this$0;

               {
                  super(var3);
                  this.this$0 = var1;
                  this.$codeStyleProviders = var2;
               }

               @Override
               public ParseSpec<RC, S> parse(Matcher var1, Parser<RC, ? super Node<RC>, S> var2, S var3) {
                  q.h(var1, "matcher");
                  q.h(var2, "parser");
                  val var7: java.lang.String = var1.group(1);
                  val var4: java.lang.String = var1.group(2);
                  val var6: java.lang.String = var1.group(3);
                  val var5: ParseSpec.Companion = ParseSpec.Companion;
                  q.e(var7);
                  q.e(var4);
                  return (ParseSpec<RC, S>)var5.createTerminal(new Crystal.FunctionNode<>(var7, var4, var6, this.$codeStyleProviders), var3);
               }
            };
         }
      }
   }
}
