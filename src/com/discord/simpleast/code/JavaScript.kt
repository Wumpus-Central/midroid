package com.discord.simpleast.code

import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.internal.q

public object JavaScript {
   public final val BUILT_INS: Array<String>
   public final val KEYWORDS: Array<String>
   private final val PATTERN_JAVASCRIPT_COMMENTS: Pattern = Pattern.compile("^(?:(?://.*?(?=\\n|$))|(/\\*.*?\\*/))", 32)
   private final val PATTERN_JAVASCRIPT_GENERIC: Pattern = Pattern.compile("^<.*(?<!\\\\)>")
   private final val PATTERN_JAVASCRIPT_REGEX: Pattern = Pattern.compile("^/.+(?<!\\\\)/[dgimsuy]*")
   private final val PATTERN_JAVASCRIPT_STRINGS: Pattern = Pattern.compile("^('.*?(?<!\\\\)'|\".*?(?<!\\\\)\"|`[\\s\\S]*?(?<!\\\\)`)(?=\\W|\\s|$)")

   internal fun <RC, S> createCodeRules(codeStyleProviders: CodeStyleProviders<RC>): List<Rule<RC, Node<RC>, S>> {
      q.h(var1, "codeStyleProviders");
      val var2: CodeRules = CodeRules.INSTANCE;
      val var3: Pattern = PATTERN_JAVASCRIPT_COMMENTS;
      q.g(PATTERN_JAVASCRIPT_COMMENTS, "PATTERN_JAVASCRIPT_COMMENTS");
      val var8: Rule = CodeRules.toMatchGroupRule$default(var2, var3, 0, var1.getCommentStyleProvider(), 1, null);
      val var4: Pattern = PATTERN_JAVASCRIPT_STRINGS;
      q.g(PATTERN_JAVASCRIPT_STRINGS, "PATTERN_JAVASCRIPT_STRINGS");
      val var9: Rule = CodeRules.toMatchGroupRule$default(var2, var4, 0, var1.getLiteralStyleProvider(), 1, null);
      val var5: Rule = JavaScript.ObjectPropertyNode.Companion.createObjectPropertyRule(var1);
      val var6: Pattern = PATTERN_JAVASCRIPT_GENERIC;
      q.g(PATTERN_JAVASCRIPT_GENERIC, "PATTERN_JAVASCRIPT_GENERIC");
      val var10: Rule = CodeRules.toMatchGroupRule$default(var2, var6, 0, var1.getGenericsStyleProvider(), 1, null);
      val var7: Pattern = PATTERN_JAVASCRIPT_REGEX;
      q.g(PATTERN_JAVASCRIPT_REGEX, "PATTERN_JAVASCRIPT_REGEX");
      return i.m(
         new Rule[]{
            var8,
            var9,
            var5,
            var10,
            CodeRules.toMatchGroupRule$default(var2, var7, 0, var1.getLiteralStyleProvider(), 1, null),
            JavaScript.FieldNode.Companion.createFieldRule(var1),
            JavaScript.FunctionNode.Companion.createFunctionRule(var1)
         }
      );
   }

   public class FieldNode<RC>(definition: String, name: String, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent<RC> {
      init {
         q.h(var1, "definition");
         q.h(var2, "name");
         q.h(var3, "codeStyleProviders");
         super(new StyleNode.TextStyledNode(var1, var3.getKeywordStyleProvider()), new StyleNode.TextStyledNode(var2, var3.getIdentifierStyleProvider()));
      }

      public companion object {
         private final val PATTERN_JAVASCRIPT_FIELD: Pattern

         public fun <RC, S> createFieldRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
            q.h(var1, "codeStyleProviders");
            val var2: Pattern = JavaScript.FieldNode.access$getPATTERN_JAVASCRIPT_FIELD$cp();
            q.g(var2, "PATTERN_JAVASCRIPT_FIELD");
            return new Rule<RC, Node<RC>, S>(this, var1, var2) {
               final CodeStyleProviders $codeStyleProviders;
               final JavaScript.FieldNode.Companion this$0;

               {
                  super(var3);
                  this.this$0 = var1;
                  this.$codeStyleProviders = var2;
               }

               @Override
               public ParseSpec<RC, S> parse(Matcher var1, Parser<RC, ? super Node<RC>, S> var2, S var3) {
                  q.h(var1, "matcher");
                  q.h(var2, "parser");
                  val var6: java.lang.String = var1.group(1);
                  val var4: java.lang.String = var1.group(2);
                  val var5: ParseSpec.Companion = ParseSpec.Companion;
                  q.e(var6);
                  q.e(var4);
                  return (ParseSpec<RC, S>)var5.createTerminal(new JavaScript.FieldNode<>(var6, var4, this.$codeStyleProviders), var3);
               }
            };
         }
      }
   }

   public class FunctionNode<RC>(pre: String, signature: String?, params: String, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent<RC> {
      init {
         q.h(var1, "pre");
         q.h(var3, "params");
         q.h(var4, "codeStyleProviders");
         val var5: StyleNode.TextStyledNode = new StyleNode.TextStyledNode(var1, var4.getKeywordStyleProvider());
         val var6: StyleNode.TextStyledNode;
         if (var2 != null) {
            var6 = new StyleNode.TextStyledNode(var2, var4.getIdentifierStyleProvider());
         } else {
            var6 = null;
         }

         super(var5, var6, new StyleNode.TextStyledNode(var3, var4.getParamsStyleProvider()));
      }

      public companion object {
         private final val PATTERN_JAVASCRIPT_FUNC: Pattern

         public fun <RC, S> createFunctionRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
            q.h(var1, "codeStyleProviders");
            return new Rule<RC, Node<RC>, S>(this, var1, JavaScript.FunctionNode.access$getPATTERN_JAVASCRIPT_FUNC$cp()) {
               final CodeStyleProviders $codeStyleProviders;
               final JavaScript.FunctionNode.Companion this$0;

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
                  val var7: java.lang.String = var1.group(2);
                  val var6: java.lang.String = var1.group(3);
                  val var5: ParseSpec.Companion = ParseSpec.Companion;
                  q.e(var4);
                  q.e(var6);
                  return (ParseSpec<RC, S>)var5.createTerminal(new JavaScript.FunctionNode<>(var4, var7, var6, this.$codeStyleProviders), var3);
               }
            };
         }
      }
   }

   public class ObjectPropertyNode<RC>(prefix: String, property: String, suffix: String, codeStyleProviders: CodeStyleProviders<Any>) : Node.Parent<RC> {
      init {
         q.h(var1, "prefix");
         q.h(var2, "property");
         q.h(var3, "suffix");
         q.h(var4, "codeStyleProviders");
         super(
            new StyleNode.TextStyledNode(var1, var4.getDefaultStyleProvider()),
            new StyleNode.TextStyledNode(var2, var4.getIdentifierStyleProvider()),
            new StyleNode.TextStyledNode(var3, var4.getDefaultStyleProvider())
         );
      }

      public companion object {
         private final val PATTERN_JAVASCRIPT_OBJECT_PROPERTY: Pattern

         public fun <RC, S> createObjectPropertyRule(codeStyleProviders: CodeStyleProviders<RC>): Rule<RC, Node<RC>, S> {
            q.h(var1, "codeStyleProviders");
            val var2: Pattern = JavaScript.ObjectPropertyNode.access$getPATTERN_JAVASCRIPT_OBJECT_PROPERTY$cp();
            q.g(var2, "PATTERN_JAVASCRIPT_OBJECT_PROPERTY");
            return new Rule<RC, Node<RC>, S>(this, var1, var2) {
               final CodeStyleProviders $codeStyleProviders;
               final JavaScript.ObjectPropertyNode.Companion this$0;

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
                  val var5: java.lang.String = var1.group(3);
                  val var6: ParseSpec.Companion = ParseSpec.Companion;
                  q.e(var7);
                  q.e(var4);
                  q.e(var5);
                  return (ParseSpec<RC, S>)var6.createTerminal(new JavaScript.ObjectPropertyNode<>(var7, var4, var5, this.$codeStyleProviders), var3);
               }
            };
         }
      }
   }
}
