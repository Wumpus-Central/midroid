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
import kotlin.jvm.internal.q
import nh.r
import nh.s

public object CodeStyle {
   private final val parser: Parser<RenderContext, Node<RenderContext>, Any>
      private final get() {
         val var4: java.util.Map = parsers;
         val var3: java.lang.String = ThemeManagerKt.getTheme().getClass().getSimpleName();
         q.g(var3, "getSimpleName(...)");
         var var2: Any = var4.get(var3);
         var var1: Any = var2;
         if (var2 == null) {
            var2 = CodeStyleProviders.copy$default(staticCodeStyles, new g(), new h(), null, null, null, null, null, null, 252, null);
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


   private final val parsers: MutableMap<String, Parser<RenderContext, Node<RenderContext>, Any>> = new LinkedHashMap()
   private final val staticCodeStyles: CodeStyleProviders<RenderContext> =
      new CodeStyleProviders(null, null, new a(), new b(), new c(), new d(), new e(), new f(), 3, null)

   @JvmStatic
   fun `_get_parser_$lambda$9$lambda$6`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(ThemeManagerKt.getTheme().getHeaderSecondary()));
   }

   @JvmStatic
   fun `_get_parser_$lambda$9$lambda$7`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextMuted()));
   }

   private fun generateAst(node: CodeBlockContentNode): List<Node<RenderContext>> {
      var var3: java.lang.String = kotlin.text.h.X0(var1.getLang()).toString();
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
         val var8: nh.r.a = r.k;
         var7 = r.b(Parser.parse$default(this.getParser(), var3, Unit.a, null, 4, null));
      } catch (var4: java.lang.Throwable) {
         val var11: nh.r.a = r.k;
         var7 = r.b(s.a(var4));
         break label16;
      }

      val var12: java.util.List = i.e(new TextNode(var2));
      var2 = (java.lang.String)var7;
      if (r.g(var7)) {
         var2 = var12;
      }

      return var2 as MutableList<Node<RenderContext>>;
   }

   private fun renderCode(builder: DraweeSpanStringBuilder, node: CodeBlockContentNode, rc: RenderContext) {
      SimpleRenderer.render(var1, this.generateAst(var2), var3);
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$0`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(Color.parseColor("#199A79")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$1`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(Color.parseColor("#7A8E00")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$2`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(Color.parseColor("#4C9CDF")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$3`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(Color.parseColor("#AED581")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$4`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(Color.parseColor("#A77B02")));
   }

   @JvmStatic
   fun `staticCodeStyles$lambda$5`(var0: RenderContext): java.lang.Iterable {
      q.h(var0, "it");
      return i.e(new ForegroundColorSpan(Color.parseColor("#AF8AF4")));
   }

   public fun renderCodeBlock(builder: DraweeSpanStringBuilder, node: CodeBlockContentNode, rc: RenderContext) {
      q.h(var1, "builder");
      q.h(var2, "node");
      q.h(var3, "rc");
      var var4: Int;
      if (var3.spoilerIsHidden()) {
         var4 = var3.getTheme().getSpoilerHiddenBackground();
      } else {
         var4 = var3.getTheme().getBackgroundSecondary();
      }

      val var9: BlockBackgroundSpan = new BlockBackgroundSpan(
         var4,
         var3.getTheme().getBackgroundSecondaryAlt(),
         SizeUtilsKt.getDpToPx(1),
         SizeUtilsKt.getDpToPx(4),
         var3.getInsets().getStart(),
         var3.getInsets().getTop(),
         var3.getInsets().getBottom()
      );
      var4 = SizeUtilsKt.getDpToPx(4);
      val var7: Standard = new Standard(SizeUtilsKt.getDpToPx(8));
      val var6: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
      val var8: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      val var10: DiscordFontSpan = new DiscordFontSpan(var3.getContext(), DiscordFont.CodeNormal);
      SpannableStringBuilderExtensionsKt.ensureNewline$default(var1, null, 1, null);
      val var5: Int = var1.length();
      SpannableStringBuilderExtensionsKt.ensureNewline(var1, new AbsoluteSizeSpan(var4));
      INSTANCE.renderCode(var1, var2, var3);
      SpannableStringBuilderExtensionsKt.ensureNewline(var1, new AbsoluteSizeSpan(var4));

      for (int var13 = 0; var13 < 5; var13++) {
         val var11: Any = new Object[]{var9, var7, var6, var8, var10}[var13];
         if (var11 != null) {
            var1.setSpan(var11, var5, var1.length(), 33);
         }
      }
   }
}
