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
import eh.s
import java.util.LinkedHashMap
import kotlin.jvm.internal.r

public object CodeStyle {
   private final val parser: Parser<RenderContext, Node<RenderContext>, Any>
      private final get() {
         val var4: java.util.Map = parsers;
         val var3: java.lang.String = ThemeManagerKt.getTheme().getClass().getSimpleName();
         r.g(var3, "Theme::class.java.simpleName");
         var var2: Any = var4.get(var3);
         var var1: Any = var2;
         if (var2 == null) {
            var2 = CodeStyleProviders.copy$default(staticCodeStyles, new g(), new h(), null, null, null, null, null, null, 252, null);
            val var5: CodeRules = CodeRules.INSTANCE;
            var2 = CodeRules.createCodeRule$default(
               CodeRules.INSTANCE, var2.getDefaultStyleProvider(), var5.createCodeLanguageMap((CodeStyleProviders)var2), null, 4, null
            );
            var1 = new Parser(false, 1, null);
            var1.addRule((Rule)var2);
            var4.put(var3, var1);
         }

         return var1 as Parser<RenderContext, Node<RenderContext>, Object>;
      }


   private final val parsers: MutableMap<String, Parser<RenderContext, Node<RenderContext>, Any>> = new LinkedHashMap()
   private final val staticCodeStyles: CodeStyleProviders<RenderContext> =
      new CodeStyleProviders(null, null, new a(), new b(), new c(), new d(), new e(), new f(), 3, null)

   @JvmStatic
   fun `_get_parser_$lambda$9$lambda$6`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(ThemeManagerKt.getTheme().getHeaderSecondary()));
   }

   @JvmStatic
   fun `_get_parser_$lambda$9$lambda$7`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextMuted()));
   }

   private fun generateAst(node: CodeBlockContentNode): List<Node<RenderContext>> {
      var var3: java.lang.String = kotlin.text.f.W0(var1.getLang()).toString();
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
         val var9: eh.r.a = eh.r.k;
         var8 = eh.r.b(Parser.parse$default(this.getParser(), var3, Unit.a, null, 4, null));
      } catch (var4: java.lang.Throwable) {
         val var7: eh.r.a = eh.r.k;
         var8 = eh.r.b(s.a(var4));
         break label16;
      }

      val var12: java.util.List = kotlin.collections.h.d(new TextNode(var2));
      var2 = (java.lang.String)var8;
      if (eh.r.g(var8)) {
         var2 = var12;
      }

      return var2 as java.util.List<Node<RenderContext>>;
   }

   private fun renderCode(builder: DraweeSpanStringBuilder, node: CodeBlockContentNode, rc: RenderContext) {
      SimpleRenderer.render(var1, this.generateAst(var2), var3);
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$0`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(Color.parseColor("#199A79")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$1`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(Color.parseColor("#7A8E00")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$2`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(Color.parseColor("#4C9CDF")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$3`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(Color.parseColor("#AED581")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$4`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(Color.parseColor("#A77B02")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$5`(var0: RenderContext): java.lang.Iterable {
      r.h(var0, "it");
      return kotlin.collections.h.d(new ForegroundColorSpan(Color.parseColor("#AF8AF4")));
   }

   public fun renderCodeBlock(builder: DraweeSpanStringBuilder, node: CodeBlockContentNode, rc: RenderContext) {
      r.h(var1, "builder");
      r.h(var2, "node");
      r.h(var3, "rc");
      var var4: Int;
      if (var3.spoilerIsHidden()) {
         var4 = var3.getTheme().getSpoilerHiddenBackground();
      } else {
         var4 = var3.getTheme().getBackgroundSecondary();
      }

      val var10: BlockBackgroundSpan = new BlockBackgroundSpan(
         var4,
         var3.getTheme().getBackgroundSecondaryAlt(),
         SizeUtilsKt.getDpToPx(1),
         SizeUtilsKt.getDpToPx(4),
         var3.getInsets().getStart(),
         var3.getInsets().getTop(),
         var3.getInsets().getBottom()
      );
      val var6: Int = SizeUtilsKt.getDpToPx(4);
      val var11: Standard = new Standard(SizeUtilsKt.getDpToPx(8));
      val var9: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
      val var7: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      val var8: DiscordFontSpan = new DiscordFontSpan(var3.getContext(), DiscordFont.CodeNormal);
      SpannableStringBuilderExtensionsKt.ensureNewline$default(var1, null, 1, null);
      var4 = 0;
      val var5: Int = var1.length();
      SpannableStringBuilderExtensionsKt.ensureNewline(var1, new AbsoluteSizeSpan(var6));
      INSTANCE.renderCode(var1, var2, var3);
      SpannableStringBuilderExtensionsKt.ensureNewline(var1, new AbsoluteSizeSpan(var6));

      for (; var4 < 5; var4++) {
         val var12: Any = new Object[]{var10, var11, var9, var7, var8}[var4];
         if (var12 != null) {
            var1.setSpan(var12, var5, var1.length(), 33);
         }
      }
   }
}
