package com.discord.chat.presentation.textutils

import android.graphics.Color
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.LeadingMarginSpan.Standard
import com.discord.chat.bridge.contentnode.CodeBlockContentNode
import com.discord.fonts.DiscordFont
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.simpleast.code.CodeRules
import com.discord.simpleast.code.CodeStyleProviders
import com.discord.simpleast.core.node.Node
import com.discord.simpleast.core.node.TextNode
import com.discord.simpleast.core.parser.Parser
import com.discord.simpleast.core.parser.Rule
import com.discord.simpleast.core.simple.SimpleRenderer
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt
import com.discord.span.utilities.spannable.BlockBackgroundSpan
import com.discord.span.utilities.spannable.VerticalPaddingSpan
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCodeStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeStyle.kt\ncom/discord/chat/presentation/textutils/CodeStyle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n381#2,3:95\n384#2,4:99\n1#3:98\n1#3:108\n32#4,4:103\n36#4:110\n13409#5:107\n13410#5:109\n*S KotlinDebug\n*F\n+ 1 CodeStyle.kt\ncom/discord/chat/presentation/textutils/CodeStyle\n*L\n38#1:95,3\n38#1:99,4\n79#1:108\n79#1:103,4\n79#1:110\n79#1:107\n79#1:109\n*E\n"])
public object CodeStyle {
   private final val staticCodeStyles: CodeStyleProviders<RenderContext> =
      new CodeStyleProviders(null, null, new c(), new d(), new e(), new f(), new g(), new h(), 3, null)
      private final val parsers: MutableMap<String, Parser<RenderContext, Node<RenderContext>, Any>> = new LinkedHashMap()

   private final val parser: Parser<RenderContext, Node<RenderContext>, Any>
      private final get() {
         val var4: java.util.Map = parsers;
         val var3: java.lang.String = ThemeManagerKt.getTheme().getClass().getSimpleName();
         var var2: Any = var4.get(var3);
         var var1: Any = var2;
         if (var2 == null) {
            var2 = CodeStyleProviders.copy$default(staticCodeStyles, new a(), new b(), null, null, null, null, null, null, 252, null);
            val var5: CodeRules = CodeRules.INSTANCE;
            var2 = CodeRules.createCodeRule$default(
               CodeRules.INSTANCE, ((CodeStyleProviders)var2).getDefaultStyleProvider(), var5.createCodeLanguageMap((CodeStyleProviders)var2), null, 4, null
            );
            var1 = new Parser(false, 1, null);
            ((Parser)var1).addRule((Rule)var2);
            var4.put(var3, var1);
         }

         return var1 as Parser<RenderContext, Node<RenderContext>, Object>;
      }


   @JvmStatic
   fun `_get_parser_$lambda$9$lambda$6`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(ThemeManagerKt.getTheme().getHeaderSecondary()));
   }

   @JvmStatic
   fun `_get_parser_$lambda$9$lambda$7`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextMuted()));
   }

   private fun generateAst(node: CodeBlockContentNode): List<Node<RenderContext>> {
      var var3: java.lang.String = StringsKt.Y0(var1.getLang()).toString();
      var var2: java.lang.String = var1.getContent();
      val var6: StringBuilder = new StringBuilder();
      var6.append("```");
      var6.append(var3);
      var6.append("\n");
      var6.append(var2);
      var6.append("\n```");
      var3 = var6.toString();

      label16:
      try {
         val var9: kotlin.Result.a = Result.e;
         var8 = Result.b(Parser.parse$default(this.getParser(), var3, Unit.a, null, 4, null));
      } catch (var4: java.lang.Throwable) {
         val var7: kotlin.Result.a = Result.e;
         var8 = Result.b(kotlin.c.a(var4));
         break label16;
      }

      val var12: java.util.List = CollectionsKt.e(new TextNode(var2));
      var2 = (java.lang.String)var8;
      if (Result.g(var8)) {
         var2 = var12;
      }

      return var2 as MutableList<Node<RenderContext>>;
   }

   private fun renderCode(builder: DraweeSpanStringBuilder, node: CodeBlockContentNode, rc: RenderContext) {
      SimpleRenderer.render(var1, this.generateAst(var2), var3);
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$0`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(Color.parseColor("#199A79")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$1`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(Color.parseColor("#7A8E00")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$2`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(Color.parseColor("#4C9CDF")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$3`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(Color.parseColor("#AED581")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$4`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(Color.parseColor("#A77B02")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$5`(var0: RenderContext): java.lang.Iterable {
      return CollectionsKt.e(new ForegroundColorSpan(Color.parseColor("#AF8AF4")));
   }

   public fun renderCodeBlock(builder: DraweeSpanStringBuilder, node: CodeBlockContentNode, rc: RenderContext, isLastContentNode: Boolean) {
      var var5: Int;
      if (var3.spoilerIsHidden()) {
         var5 = var3.getTheme().getSpoilerHiddenBackground();
      } else {
         var5 = var3.getTheme().getBackgroundSecondary();
      }

      val var7: BlockBackgroundSpan = new BlockBackgroundSpan(
         var5,
         var3.getTheme().getBackgroundSecondaryAlt(),
         SizeUtilsKt.getDpToPx(1),
         SizeUtilsKt.getDpToPx(4),
         var3.getInsets().getStart(),
         var3.getInsets().getTop(),
         var3.getInsets().getBottom()
      );
      var5 = SizeUtilsKt.getDpToPx(4);
      val var10: Standard = new Standard(SizeUtilsKt.getDpToPx(8));
      val var11: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
      val var9: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      val var8: DiscordFontSpan = new DiscordFontSpan(var3.getContext(), DiscordFont.CodeNormal);
      SpannableStringBuilderExtensionsKt.ensureNewline$default(var1, null, 1, null);
      val var6: Int = var1.length();
      SpannableStringBuilderExtensionsKt.ensureNewline(var1, new AbsoluteSizeSpan(var5));
      INSTANCE.renderCode(var1, var2, var3);
      if (!var4) {
         SpannableStringBuilderExtensionsKt.ensureNewline(var1, new AbsoluteSizeSpan(var5));
      }

      for (int var14 = 0; var14 < 5; var14++) {
         val var12: Any = new Object[]{var7, var10, var11, var9, var8}[var14];
         if (var12 != null) {
            var1.setSpan(var12, var6, var1.length(), 33);
         }
      }
   }
}
