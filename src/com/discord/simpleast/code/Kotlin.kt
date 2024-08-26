package com.discord.simpleast.code

import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.internal.r

public object Kotlin {
   public final val BUILT_INS: Array<String>
   public final val KEYWORDS: Array<String>
   private final val PATTERN_KOTLIN_ANNOTATION: Pattern = Pattern.compile("^@(\\w+)")
   private final val PATTERN_KOTLIN_COMMENTS: Pattern = Pattern.compile("^(?:(?://.*?(?=\\n|$))|(/\\*.*?\\*/))", 32)
   private final val PATTERN_KOTLIN_STRINGS: Pattern = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)")

   internal fun <RC, S> createKotlinCodeRules(codeStyleProviders: CodeStyleProviders<RC>): List<Rule<RC, Node<RC>, S>> {
      r.h(var1, "codeStyleProviders");
      val var2: CodeRules = CodeRules.INSTANCE;
      val var3: Pattern = PATTERN_KOTLIN_COMMENTS;
      r.g(PATTERN_KOTLIN_COMMENTS, "PATTERN_KOTLIN_COMMENTS");
      val var6: Rule = CodeRules.toMatchGroupRule$default(var2, var3, 0, var1.getCommentStyleProvider(), 1, null);
      var var4: Pattern = PATTERN_KOTLIN_STRINGS;
      r.g(PATTERN_KOTLIN_STRINGS, "PATTERN_KOTLIN_STRINGS");
      val var5: Rule = CodeRules.toMatchGroupRule$default(var2, var4, 0, var1.getLiteralStyleProvider(), 1, null);
      var4 = PATTERN_KOTLIN_ANNOTATION;
      r.g(PATTERN_KOTLIN_ANNOTATION, "PATTERN_KOTLIN_ANNOTATION");
      return h.l(
         new Rule[]{
            var6,
            var5,
            CodeRules.toMatchGroupRule$default(var2, var4, 0, var1.getGenericsStyleProvider(), 1, null),
            Kotlin.FieldNode.Companion.createFieldRule(var1),
            Kotlin.FunctionNode.Companion.createFunctionRule(var1)
         }
      );
   }

   public class FieldNode<RC>(definition: String, name: String, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent<RC> {
      init {
         r.h(var1, "definition");
         r.h(var2, "name");
         r.h(var3, "codeStyleProviders");
         super(new StyleNode.TextStyledNode(var1, var3.getKeywordStyleProvider()), new StyleNode.TextStyledNode(var2, var3.getIdentifierStyleProvider()));
      }

      public companion object {
         private final val PATTERN_KOTLIN_FIELD: Pattern

         public fun <RC, S> createFieldRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
            r.h(var1, "codeStyleProviders");
            val var2: Pattern = Kotlin.FieldNode.access$getPATTERN_KOTLIN_FIELD$cp();
            r.g(var2, "PATTERN_KOTLIN_FIELD");
            return new Rule<RC, Node<RC>, S>(this, var1, var2) {
               final CodeStyleProviders $codeStyleProviders;
               final Kotlin.FieldNode.Companion this$0;

               {
                  super(var3);
                  this.this$0 = var1;
                  this.$codeStyleProviders = var2;
               }

               @Override
               public ParseSpec<RC, S> parse(Matcher var1, Parser<RC, ? super Node<RC>, S> var2, S var3) {
                  r.h(var1, "matcher");
                  r.h(var2, "parser");
                  val var6: java.lang.String = var1.group(1);
                  val var4: java.lang.String = var1.group(2);
                  val var5: ParseSpec.Companion = ParseSpec.Companion;
                  r.e(var6);
                  r.e(var4);
                  return (ParseSpec<RC, S>)var5.createTerminal(new Kotlin.FieldNode<>(var6, var4, this.$codeStyleProviders), var3);
               }
            };
         }
      }
   }

   public class FunctionNode<RC>(pre: String, generic: String?, signature: String, params: String, codeStyleProviders: CodeStyleProviders<Any>)
      : Node.Parent<RC> {
      init {
         r.h(var1, "pre");
         r.h(var3, "signature");
         r.h(var4, "params");
         r.h(var5, "codeStyleProviders");
         val var6: StyleNode.TextStyledNode = new StyleNode.TextStyledNode(var1, var5.getKeywordStyleProvider());
         val var7: StyleNode.TextStyledNode;
         if (var2 != null) {
            var7 = new StyleNode.TextStyledNode(var2, var5.getGenericsStyleProvider());
         } else {
            var7 = null;
         }

         super(
            var6,
            var7,
            new StyleNode.TextStyledNode(var3, var5.getIdentifierStyleProvider()),
            new StyleNode.TextStyledNode(var4, var5.getParamsStyleProvider())
         );
      }

      public companion object {
         private final val PATTERN_KOTLIN_FUNC: Pattern

         public fun <RC, S> createFunctionRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
            r.h(var1, "codeStyleProviders");
            return new Rule<RC, Node<RC>, S>(this, var1, Kotlin.FunctionNode.access$getPATTERN_KOTLIN_FUNC$cp()) {
               final CodeStyleProviders $codeStyleProviders;
               final Kotlin.FunctionNode.Companion this$0;

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
                  val var8: java.lang.String = var1.group(2);
                  val var5: java.lang.String = var1.group(3);
                  val var7: java.lang.String = var1.group(4);
                  val var6: ParseSpec.Companion = ParseSpec.Companion;
                  r.e(var4);
                  r.e(var5);
                  r.e(var7);
                  return (ParseSpec<RC, S>)var6.createTerminal(new Kotlin.FunctionNode<>(var4, var8, var5, var7, this.$codeStyleProviders), var3);
               }
            };
         }
      }
   }
}
