package com.discord.simpleast.code

import android.text.SpannableStringBuilder
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.StyleNode
import com.discord.simpleast.core.node.TextNode
import com.discord.simpleast.core.node.StyleNode.SpanProvider
import com.discord.simpleast.core.parser.ParseSpec
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import java.util.Arrays
import java.util.regex.Matcher
import java.util.regex.Pattern
import kh.w
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.q
import lh.r

public object CodeRules {
   private const val CODE_BLOCK_BODY_GROUP: Int = 3
   private const val CODE_BLOCK_LANGUAGE_GROUP: Int = 1
   private const val CODE_BLOCK_WS_PREFIX: Int = 2
   public final val PATTERN_CODE_BLOCK: Pattern
   public final val PATTERN_CODE_INLINE: Pattern
   public final val PATTERN_LEADING_WS_CONSUMER: Pattern
   public final val PATTERN_NUMBERS: Pattern
   public final val PATTERN_TEXT: Pattern

   @JvmStatic
   fun {
      var var0: Pattern = Pattern.compile("^```(?:([\\w+\\-.]+?)?(\\s*\\n))?([^\\n].*?)\\n*```", 32);
      q.g(var0, "Pattern.compile(\"\"\"^```(…n*```\"\"\", Pattern.DOTALL)");
      PATTERN_CODE_BLOCK = var0;
      var0 = Pattern.compile("^(``?)([^`]*)\\1", 32);
      q.g(var0, "Pattern.compile(\"\"\"^(``?…]*)\\1\"\"\", Pattern.DOTALL)");
      PATTERN_CODE_INLINE = var0;
      var0 = Pattern.compile("^(?:\\n\\s*)+");
      q.g(var0, "Pattern.compile(\"\"\"^(?:\\n\\s*)+\"\"\")");
      PATTERN_LEADING_WS_CONSUMER = var0;
      var0 = Pattern.compile("^[\\s\\S]+?(?=\\b|[^0-9A-Za-z\\s\\u00c0-\\uffff]|\\n| {2,}\\n|\\w+:\\S|$)");
      q.g(var0, "Pattern.compile(\"\"\"^[\\s\\…|\\n| {2,}\\n|\\w+:\\S|$)\"\"\")");
      PATTERN_TEXT = var0;
      var0 = Pattern.compile("^\\b\\d+?\\b");
      q.g(var0, "Pattern.compile(\"\"\"^\\b\\d+?\\b\"\"\")");
      PATTERN_NUMBERS = var0;
   }

   private fun <R, S> createGenericCodeRules(
      codeStyleProviders: CodeStyleProviders<R>,
      additionalRules: List<Rule<R, Node<R>, S>>,
      definitions: Array<String>,
      builtIns: Array<String>,
      vararg keywords: String
   ): List<Rule<R, Node<R>, S>> {
      val var6: Rule = this.createDefinitionRule(var1, Arrays.copyOf(var3, var3.length));
      val var7: Pattern = this.createWordPattern$simpleast_core_release(Arrays.copyOf(var4, var4.length));
      q.g(var7, "createWordPattern(*builtIns)");
      val var8: Rule = toMatchGroupRule$default(this, var7, 0, var1.getGenericsStyleProvider(), 1, null);
      val var9: Pattern = this.createWordPattern$simpleast_core_release(Arrays.copyOf(var5, var5.length));
      q.g(var9, "createWordPattern(*keywords)");
      return i.z0(
         var2,
         i.n(
            new Rule[]{
               var6,
               var8,
               toMatchGroupRule$default(this, var9, 0, var1.getKeywordStyleProvider(), 1, null),
               toMatchGroupRule$default(this, PATTERN_NUMBERS, 0, var1.getLiteralStyleProvider(), 1, null),
               toMatchGroupRule$default(this, PATTERN_LEADING_WS_CONSUMER, 0, null, 3, null),
               toMatchGroupRule$default(this, PATTERN_TEXT, 0, null, 3, null)
            }
         )
      );
   }

   private fun createSingleLineCommentPattern(prefix: String): Pattern {
      val var2: StringBuilder = new StringBuilder();
      var2.append("^(?:");
      var2.append(var1);
      var2.append(".*?(?=\\n|$))");
      return Pattern.compile(var2.toString());
   }

   public fun <R, S> createCodeLanguageMap(codeStyleProviders: CodeStyleProviders<R>): Map<String, List<Rule<R, Node<R>, S>>> {
      q.h(var1, "codeStyleProviders");
      val var4: Kotlin = Kotlin.INSTANCE;
      var var2: java.util.List = Kotlin.INSTANCE.createKotlinCodeRules$simpleast_core_release(var1);
      val var18: Array<java.lang.String> = var4.getKEYWORDS();
      var2 = this.createGenericCodeRules(
         var1, var2, new java.lang.String[]{"object", "class", "interface"}, var4.getBUILT_INS(), Arrays.copyOf(var18, var18.length)
      );
      var var15: Pattern = this.createSingleLineCommentPattern("//");
      q.g(var15, "createSingleLineCommentPattern(\"//\")");
      val var20: Rule = toMatchGroupRule$default(this, var15, 0, var1.getCommentStyleProvider(), 1, null);
      var15 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
      q.g(var15, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
      val var17: java.util.List = this.createGenericCodeRules(
         var1,
         i.n(new Rule[]{var20, toMatchGroupRule$default(this, var15, 0, var1.getLiteralStyleProvider(), 1, null)}),
         new java.lang.String[]{"message|enum|extend|service"},
         new java.lang.String[]{"true|false", "string|bool|double|float|bytes", "int32|uint32|sint32|int64|unit64|sint64", "map"},
         "required|repeated|optional|option|oneof|default|reserved",
         "package|import",
         "rpc|returns"
      );
      val var21: Pattern = this.createSingleLineCommentPattern("#");
      q.g(var21, "createSingleLineCommentPattern(\"#\")");
      val var22: Rule = toMatchGroupRule$default(this, var21, 0, var1.getCommentStyleProvider(), 1, null);
      var var5: Pattern = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
      q.g(var5, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
      val var24: Rule = toMatchGroupRule$default(this, var5, 0, var1.getLiteralStyleProvider(), 1, null);
      var var6: Pattern = Pattern.compile("^'[\\s\\S]*?(?<!\\\\)'(?=\\W|\\s|$)");
      q.g(var6, "Pattern.compile(\"\"\"^'[\\s…*?(?<!\\\\)'(?=\\W|\\s|$)\"\"\")");
      val var28: Rule = toMatchGroupRule$default(this, var6, 0, var1.getLiteralStyleProvider(), 1, null);
      var var7: Pattern = Pattern.compile("^@(\\w+)");
      q.g(var7, "Pattern.compile(\"\"\"^@(\\w+)\"\"\")");
      val var23: java.util.List = this.createGenericCodeRules(
         var1,
         i.n(new Rule[]{var22, var24, var28, toMatchGroupRule$default(this, var7, 0, var1.getGenericsStyleProvider(), 1, null)}),
         new java.lang.String[]{"class", "def", "lambda"},
         new java.lang.String[]{"True|False|None"},
         "from|import|global|nonlocal",
         "async|await|class|self|cls|def|lambda",
         "for|while|if|else|elif|break|continue|return",
         "try|except|finally|raise|pass|yeild",
         "in|as|is|del",
         "and|or|not|assert"
      );
      var5 = this.createSingleLineCommentPattern("//");
      q.g(var5, "createSingleLineCommentPattern(\"//\")");
      val var26: Rule = toMatchGroupRule$default(this, var5, 0, var1.getCommentStyleProvider(), 1, null);
      var6 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
      q.g(var6, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
      val var30: Rule = toMatchGroupRule$default(this, var6, 0, var1.getLiteralStyleProvider(), 1, null);
      var7 = Pattern.compile("^#!?\\[.*?\\]\\n");
      q.g(var7, "Pattern.compile(\"\"\"^#!?\\[.*?\\]\\n\"\"\")");
      val var27: java.util.List = this.createGenericCodeRules(
         var1,
         i.n(new Rule[]{var26, var30, toMatchGroupRule$default(this, var7, 0, var1.getGenericsStyleProvider(), 1, null)}),
         new java.lang.String[]{"struct", "trait", "mod"},
         new java.lang.String[]{
            "Self|Result|Ok|Err|Option|None|Some",
            "Copy|Clone|Eq|Hash|Send|Sync|Sized|Debug|Display",
            "Arc|Rc|Box|Pin|Future",
            "true|false|bool|usize|i64|u64|u32|i32|str|String"
         },
         "let|mut|static|const|unsafe",
         "crate|mod|extern|pub|pub(super)|use",
         "struct|enum|trait|type|where|impl|dyn|async|await|move|self|fn",
         "for|while|loop|if|else|match|break|continue|return|try",
         "in|as|ref"
      );
      val var34: Xml = Xml.INSTANCE;
      val var31: Rule = toMatchGroupRule$default(this, Xml.INSTANCE.getPATTERN_XML_COMMENT(), 0, var1.getCommentStyleProvider(), 1, null);
      var var10: Rule = var34.createTagRule(var1);
      val var8: Pattern = PATTERN_LEADING_WS_CONSUMER;
      var var9: Rule = toMatchGroupRule$default(this, PATTERN_LEADING_WS_CONSUMER, 0, null, 3, null);
      var7 = PATTERN_TEXT;
      val var32: java.util.List = i.n(new Rule[]{var31, var10, var9, toMatchGroupRule$default(this, PATTERN_TEXT, 0, null, 3, null)});
      val var39: Pattern = this.createSingleLineCommentPattern("#");
      q.g(var39, "createSingleLineCommentPattern(\"#\")");
      var9 = toMatchGroupRule$default(this, var39, 0, var1.getCommentStyleProvider(), 1, null);
      val var43: Pattern = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
      q.g(var43, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
      var10 = toMatchGroupRule$default(this, var43, 0, var1.getLiteralStyleProvider(), 1, null);
      val var11: java.lang.String = this.createWordPattern$simpleast_core_release("true|false|null").pattern();
      q.g(var11, "createWordPattern(\"true|false|null\").pattern()");
      val var49: Pattern = Pattern.compile(var11, 2);
      q.g(var49, "java.util.regex.Pattern.compile(this, flags)");
      val var50: Rule = toMatchGroupRule$default(this, var49, 0, var1.getGenericsStyleProvider(), 1, null);
      val var12: java.lang.String = this.createWordPattern$simpleast_core_release(
            "select|from|join|where|and|as|distinct|count|avg", "order by|group by|desc|sum|min|max", "like|having|in|is|not"
         )
         .pattern();
      q.g(var12, "createWordPattern(\n     …ing|in|is|not\").pattern()");
      val var54: Pattern = Pattern.compile(var12, 2);
      q.g(var54, "java.util.regex.Pattern.compile(this, flags)");
      val var36: java.util.List = i.n(
         new Rule[]{
            var9,
            var10,
            var50,
            toMatchGroupRule$default(this, var54, 0, var1.getKeywordStyleProvider(), 1, null),
            toMatchGroupRule$default(this, PATTERN_NUMBERS, 0, var1.getLiteralStyleProvider(), 1, null),
            toMatchGroupRule$default(this, var8, 0, null, 3, null),
            toMatchGroupRule$default(this, var7, 0, null, 3, null)
         }
      );
      val var45: Crystal = Crystal.INSTANCE;
      val var41: java.util.List = Crystal.INSTANCE.createCrystalCodeRules$simpleast_core_release(var1);
      val var46: Array<java.lang.String> = var45.getKEYWORDS();
      val var38: java.util.List = this.createGenericCodeRules(
         var1, var41, new java.lang.String[]{"def", "class"}, var45.getBUILT_INS(), Arrays.copyOf(var46, var46.length)
      );
      val var51: JavaScript = JavaScript.INSTANCE;
      val var42: java.util.List = JavaScript.INSTANCE.createCodeRules$simpleast_core_release(var1);
      val var52: Array<java.lang.String> = var51.getKEYWORDS();
      val var13: java.util.List = this.createGenericCodeRules(
         var1, var42, new java.lang.String[]{"class"}, var51.getBUILT_INS(), Arrays.copyOf(var52, var52.length)
      );
      return r.l(
         new Pair[]{
            w.a("kt", var2),
            w.a("kotlin", var2),
            w.a("protobuf", var17),
            w.a("proto", var17),
            w.a("pb", var17),
            w.a("py", var23),
            w.a("python", var23),
            w.a("rs", var27),
            w.a("rust", var27),
            w.a("cql", var36),
            w.a("sql", var36),
            w.a("xml", var32),
            w.a("http", var32),
            w.a("cr", var38),
            w.a("crystal", var38),
            w.a("js", var13),
            w.a("javascript", var13)
         }
      );
   }

   public fun <R, S> createCodeRule(
      textStyleProvider: SpanProvider<R>,
      languageMap: Map<String, List<Rule<R, Node<R>, S>>>,
      wrapperNodeProvider: (CodeNode<R>, Boolean, S) -> Node<R> = <unrepresentable>.INSTANCE
   ): Rule<R, Node<R>, S> {
      q.h(var1, "textStyleProvider");
      q.h(var2, "languageMap");
      q.h(var3, "wrapperNodeProvider");
      return new Rule<R, Node<R>, S>(this, var2, var1, var3, PATTERN_CODE_BLOCK) {
         final java.util.Map $languageMap;
         final StyleNode.SpanProvider $textStyleProvider;
         final Function3 $wrapperNodeProvider;
         final CodeRules this$0;

         {
            super(var5);
            this.this$0 = var1;
            this.$languageMap = var2;
            this.$textStyleProvider = var3;
            this.$wrapperNodeProvider = var4;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            val var6: java.lang.String = var1.group(1);
            var var5: java.lang.String = var1.group(3);
            if (var5 == null) {
               var5 = "";
            }

            val var7: java.lang.String = var1.group(2);
            var var8: java.util.List = null;
            var var4: Boolean = false;
            if (var7 != null) {
               var4 = h.L(var7, '\n', false, 2, null);
            }

            if (var6 != null) {
               var8 = this.$languageMap.get(var6) as java.util.List;
            }

            var var10: Any;
            if (var8 != null) {
               var10 = var2.parse(var5, var3, var8);
               if (var10 == null) {
                  throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.discord.simpleast.core.node.Node<R>>");
               }

               var10 = new CodeNode.Content.Parsed(var5, (java.util.List)var10);
            } else {
               var10 = new CodeNode.Content.Raw(var5);
            }

            return ParseSpec.Companion
               .createTerminal(this.$wrapperNodeProvider.invoke(new CodeNode((CodeNode.Content)var10, var6, this.$textStyleProvider), var4, var3) as Node, var3);
         }
      };
   }

   public fun <R, S> createDefinitionRule(codeStyleProviders: CodeStyleProviders<R>, vararg identifiers: String): Rule<R, Node<R>, S> {
      q.h(var1, "codeStyleProviders");
      q.h(var2, "identifiers");
      val var3: StringBuilder = new StringBuilder();
      var3.append("^\\b(");
      var3.append(c.f0(var2, "|", null, null, 0, null, null, 62, null));
      var3.append(")(\\s+\\w+)");
      val var4: Pattern = Pattern.compile(var3.toString());
      q.g(var4, "Pattern.compile(\"\"\"^\\b($…String(\"|\")})(\\s+\\w+)\"\"\")");
      return new Rule<R, Node<R>, S>(var1, var2, var4) {
         final CodeStyleProviders $codeStyleProviders;
         final java.lang.String[] $identifiers;

         {
            super(var3);
            this.$codeStyleProviders = var1;
            this.$identifiers = var2;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            val var5: java.lang.String = var1.group(1);
            q.e(var5);
            val var4: java.lang.String = var1.group(2);
            q.e(var4);
            return ParseSpec.Companion.createTerminal(new CodeNode.DefinitionNode(var5, var4, this.$codeStyleProviders), var3);
         }
      };
   }

   public fun <R, S> createInlineCodeRule(textStyleProvider: SpanProvider<R>, bgStyleProvider: SpanProvider<R>): Rule<R, Node<R>, S> {
      q.h(var1, "textStyleProvider");
      q.h(var2, "bgStyleProvider");
      return new Rule<R, Node<R>, S>(this, var1, var2, PATTERN_CODE_INLINE) {
         final StyleNode.SpanProvider $bgStyleProvider;
         final StyleNode.SpanProvider $textStyleProvider;
         final CodeRules this$0;

         {
            super(var4);
            this.this$0 = var1;
            this.$textStyleProvider = var2;
            this.$bgStyleProvider = var3;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            var var7: java.lang.String = var1.group(2);
            if (var7 == null) {
               var7 = "";
            }

            if (var7.length() == 0) {
               val var8: ParseSpec.Companion = ParseSpec.Companion;
               val var6: java.lang.String = var1.group();
               q.g(var6, "matcher.group()");
               return var8.createTerminal(new TextNode(var6), var3);
            } else {
               val var4: CodeNode = new CodeNode(new CodeNode.Content.Raw(var7), null, this.$textStyleProvider);
               return ParseSpec.Companion.createTerminal(new Node.Parent<R>(this, var4, new Node[]{var4}) {
                  final CodeNode $codeNode;
                  final <unrepresentable> this$0;

                  {
                     super(var3x);
                     this.this$0 = var1;
                     this.$codeNode = var2x;
                  }

                  @Override
                  public void render(SpannableStringBuilder var1, R var2x) {
                     q.h(var1, "builder");
                     val var3x: Int = var1.length();
                     super.render(var1, var2x);
                     var2x = this.this$0.$bgStyleProvider.get(var2x).iterator();

                     while (var2x.hasNext()) {
                        var1.setSpan(var2x.next(), var3x, var1.length(), 33);
                     }
                  }
               }, var3);
            }
         }
      };
   }

   internal fun createWordPattern(vararg words: String): Pattern {
      q.h(var1, "words");
      val var2: StringBuilder = new StringBuilder();
      var2.append("^\\b(?:");
      var2.append(c.f0(var1, "|", null, null, 0, null, null, 62, null));
      var2.append(")\\b");
      return Pattern.compile(var2.toString());
   }

   public fun <R, S> Pattern.toMatchGroupRule(group: Int = 0, stylesProvider: SpanProvider<R>? = null): Rule<R, Node<R>, S> {
      q.h(var1, "$this$toMatchGroupRule");
      return new Rule<R, Node<R>, S>(var1, var2, var3, var1) {
         final int $group;
         final StyleNode.SpanProvider $stylesProvider;
         final Pattern $this_toMatchGroupRule;

         {
            super(var4);
            this.$this_toMatchGroupRule = var1;
            this.$group = var2;
            this.$stylesProvider = var3;
         }

         @Override
         public ParseSpec<R, S> parse(Matcher var1, Parser<R, ? super Node<R>, S> var2, S var3) {
            q.h(var1, "matcher");
            q.h(var2, "parser");
            var var4: java.lang.String = var1.group(this.$group);
            if (var4 == null) {
               var4 = "";
            }

            val var5: Any;
            if (this.$stylesProvider != null) {
               var5 = new StyleNode.TextStyledNode(var4, this.$stylesProvider);
            } else {
               var5 = new TextNode(var4);
            }

            return ParseSpec.Companion.createTerminal((Node)var5, var3);
         }
      };
   }
}
