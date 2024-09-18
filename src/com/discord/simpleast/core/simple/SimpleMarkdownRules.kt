package com.discord.simpleast.core.simple

import android.text.style.CharacterStyle
import android.text.style.StyleSpan
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.node.TextNode
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import java.util.ArrayList
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public object SimpleMarkdownRules {
   public final val PATTERN_BOLD: Pattern = Pattern.compile("^\\*\\*([\\s\\S]+?)\\*\\*(?!\\*)")
   public final val PATTERN_ESCAPE: Pattern = Pattern.compile("^\\\\([^0-9A-Za-z\\s])")
   public final val PATTERN_ITALICS: Pattern =
      Pattern.compile("^\\b_((?:__|\\\\[\\s\\S]|[^\\\\_])+?)_\\b|^\\*(?=\\S)((?:\\*\\*|\\s+(?:[^*\\s]|\\*\\*)|[^\\s*])+?)\\*(?!\\*)")
      public final val PATTERN_NEWLINE: Pattern = Pattern.compile("^(?:\\n *)*\\n")
   public final val PATTERN_STRIKETHRU: Pattern = Pattern.compile("^~~(?=\\S)([\\s\\S]*?\\S)~~")
   public final val PATTERN_TEXT: Pattern = Pattern.compile("^[\\s\\S]+?(?=[^0-9A-Za-z\\s\\u00c0-\\uffff]|\\n| {2,}\\n|\\w+:\\S|$)")
   public final val PATTERN_UNDERLINE: Pattern = Pattern.compile("^__([\\s\\S]+?)__(?!_)")

   @JvmStatic
   fun <R, S> createSimpleMarkdownRules(): MutableList<Rule<R, Node<R>, S>> {
      return createSimpleMarkdownRules$default(false, false, 3, null);
   }

   @JvmStatic
   fun <R, S> createSimpleMarkdownRules(var0: Boolean): MutableList<Rule<R, Node<R>, S>> {
      return createSimpleMarkdownRules$default(var0, false, 2, null);
   }

   @JvmStatic
   public fun <R, S> createSimpleMarkdownRules(includeTextRule: Boolean = true, includeEscapeRule: Boolean = true): MutableList<Rule<R, Node<R>, S>> {
      val var2: ArrayList = new ArrayList();
      if (var1) {
         var2.add(INSTANCE.createEscapeRule());
      }

      val var3: SimpleMarkdownRules = INSTANCE;
      var2.add(INSTANCE.createNewlineRule());
      var2.add(var3.createBoldRule());
      var2.add(var3.createUnderlineRule());
      var2.add(var3.createItalicsRule());
      var2.add(var3.createStrikethruRule());
      if (var0) {
         var2.add(var3.createTextRule());
      }

      return var2;
   }

   @JvmStatic
   public fun <R, S> createSimpleStyleRule(pattern: Pattern, styleFactory: () -> List<CharacterStyle>): Rule<R, Node<R>, S> {
      q.h(var0, "pattern");
      q.h(var1, "styleFactory");
      return new Rule<R, Node<R>, S>(var1, var0, var0) {
         final Pattern $pattern;
         final Function0 $styleFactory;

         {
            super(var3);
            this.$styleFactory = var1;
            this.$pattern = var2;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            return ParseSpec.Companion.createNonterminal(new StyleNode(this.$styleFactory.invoke() as java.util.List), var3, var1.start(1), var1.end(1));
         }
      };
   }

   public fun <R, S> createBoldRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_BOLD;
      q.g(PATTERN_BOLD, "PATTERN_BOLD");
      return createSimpleStyleRule(var1, <unrepresentable>.INSTANCE);
   }

   public fun <R, S> createEscapeRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_ESCAPE;
      q.g(PATTERN_ESCAPE, "PATTERN_ESCAPE");
      return new Rule<R, Node<R>, S>(this, var1) {
         final SimpleMarkdownRules this$0;

         {
            super(var2);
            this.this$0 = var1;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            val var5: ParseSpec.Companion = ParseSpec.Companion;
            val var4: java.lang.String = var1.group(1);
            q.e(var4);
            return var5.createTerminal(new TextNode(var4), var3);
         }
      };
   }

   public fun <R, S> createItalicsRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_ITALICS;
      q.g(PATTERN_ITALICS, "PATTERN_ITALICS");
      return new Rule<R, Node<R>, S>(this, var1) {
         final SimpleMarkdownRules this$0;

         {
            super(var2);
            this.this$0 = var1;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            val var8: java.lang.String = var1.group(2);
            val var4: Int;
            val var5: Int;
            if (var8 != null && var8.length() > 0) {
               var5 = var1.start(2);
               var4 = var1.end(2);
            } else {
               var5 = var1.start(1);
               var4 = var1.end(1);
            }

            val var6: ArrayList = new ArrayList(1);
            var6.add(new StyleSpan(2));
            return ParseSpec.Companion.createNonterminal(new StyleNode(var6), var3, var5, var4);
         }
      };
   }

   public fun <R, S> createNewlineRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_NEWLINE;
      q.g(PATTERN_NEWLINE, "PATTERN_NEWLINE");
      return new Rule.BlockRule<R, Node<R>, S>(this, var1) {
         final SimpleMarkdownRules this$0;

         {
            super(var2);
            this.this$0 = var1;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            return ParseSpec.Companion.createTerminal(new TextNode("\n"), var3);
         }
      };
   }

   public fun <R, S> createStrikethruRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_STRIKETHRU;
      q.g(PATTERN_STRIKETHRU, "PATTERN_STRIKETHRU");
      return createSimpleStyleRule(var1, <unrepresentable>.INSTANCE);
   }

   public fun <R, S> createTextRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_TEXT;
      q.g(PATTERN_TEXT, "PATTERN_TEXT");
      return new Rule<R, Node<R>, S>(this, var1) {
         final SimpleMarkdownRules this$0;

         {
            super(var2);
            this.this$0 = var1;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            val var4: java.lang.String = var1.group();
            q.g(var4, "matcher.group()");
            return ParseSpec.Companion.createTerminal(new TextNode(var4), var3);
         }
      };
   }

   public fun <R, S> createUnderlineRule(): Rule<R, Node<R>, S> {
      val var1: Pattern = PATTERN_UNDERLINE;
      q.g(PATTERN_UNDERLINE, "PATTERN_UNDERLINE");
      return createSimpleStyleRule(var1, <unrepresentable>.INSTANCE);
   }
}
