package com.discord.chat.presentation.textutils

import android.graphics.drawable.ColorDrawable
import android.view.View
import com.discord.chat.bridge.contentnode.CustomEmojiContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.span.utilities.spannable.ClickableSpan
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan
import com.discord.theme.DiscordThemeObject
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder

@JvmSynthetic
fun a(var0: RenderContext, var1: EmojiContentNode, var2: View): Unit {
   return renderEmoji$lambda$0(var0, var1, var2);
}

@JvmSynthetic
fun b(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   return renderEmoji$lambda$2$lambda$1(var0, var1);
}

public fun GenericDraweeHierarchyBuilder.handleEmojiSpoiler(rc: RenderContext, revealTransparent: Boolean = false) {
   kotlin.jvm.internal.q.h(var0, "<this>");
   kotlin.jvm.internal.q.h(var1, "rc");
   var var4: Int = 0;
   var0.D(new ColorDrawable(0));
   var0.z(0);
   if (var1.spoilerExists()) {
      val var5: Boolean = var1.spoilerIsRevealed();
      val var3: Int;
      if (var5 && var2) {
         var3 = 0;
      } else if (var5) {
         var3 = ThemeManagerKt.getTheme().getSpoilerRevealedBackground();
      } else {
         var3 = ThemeManagerKt.getTheme().getSpoilerHiddenBackground();
      }

      val var6: DiscordThemeObject = ThemeManagerKt.getTheme();
      if (var5) {
         var6.getSpoilerRevealedBackground();
      } else {
         var6.getSpoilerHiddenBackground();
      }

      if (!var5) {
         var4 = ThemeManagerKt.getTheme().getSpoilerHiddenBackground();
      }

      var0.x(new ColorDrawable(var3));
      var0.C(new ColorDrawable(var4));
   }
}

@JvmSynthetic
fun `handleEmojiSpoiler$default`(var0: GenericDraweeHierarchyBuilder, var1: RenderContext, var2: Boolean, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   handleEmojiSpoiler(var0, var1, var2);
}

public fun renderEmoji(builder: DraweeSpanStringBuilder, emoji: EmojiContentNode, rc: RenderContext) {
   kotlin.jvm.internal.q.h(var0, "builder");
   kotlin.jvm.internal.q.h(var1, "emoji");
   kotlin.jvm.internal.q.h(var2, "rc");
   val var7: Boolean = var1.getJumboable();
   val var4: Int;
   if (var7) {
      var4 = SizeUtilsKt.getDpToPx(48);
   } else {
      val var8: java.lang.Float = var2.getEmojiBaselineHeightOverridePx();
      val var3: Float;
      if (var8 != null) {
         var3 = var8;
      } else {
         var3 = var2.getBaselineHeightPx();
      }

      var4 = TextUtilsKt.getIconSize("_emoji", var3);
   }

   val var5: Byte;
   if (var7) {
      var5 = 1;
   } else {
      var5 = 2;
   }

   val var9: RenderableEmoji = renderable(var1);
   val var13: EmojiAccessibilitySpan = new EmojiAccessibilitySpan(var9.getContentDescription());
   val var10: ClickableSpan = new ClickableSpan(null, null, null, null, 0.0F, null, null, new i(var2, var1), 127, null);
   val var6: Int = var0.length();
   RenderableEmojiKt.renderEmojiInto(var0, var9, var2.getContext(), var4, var2.getAnimateEmoji(), var5, new j(var2));

   for (int var12 = 0; var12 < 2; var12++) {
      val var11: Any = new Object[]{var13, var10}[var12];
      if (var11 != null) {
         var0.setSpan(var11, var6, var0.length(), 33);
      }
   }
}

fun `renderEmoji$lambda$0`(var0: RenderContext, var1: EmojiContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapEmoji().invoke(var1);
   return Unit.a;
}

fun `renderEmoji$lambda$2$lambda$1`(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   kotlin.jvm.internal.q.h(var1, "$this$renderEmojiInto");
   handleEmojiSpoiler$default(var1, var0, false, 2, null);
   return Unit.a;
}

public fun EmojiContentNode.renderable(): RenderableEmoji {
   kotlin.jvm.internal.q.h(var0, "<this>");
   val var6: Any;
   if (var0 is CustomEmojiContentNode) {
      val var4: RenderableEmoji.Companion = RenderableEmoji.Companion;
      val var5: CustomEmojiContentNode = var0 as CustomEmojiContentNode;
      val var2: Long = (var0 as CustomEmojiContentNode).getId();
      val var1: Boolean;
      if (!kotlin.text.h.c0(var5.getSrc()) && !kotlin.jvm.internal.q.c(var5.getSrc(), var5.getFrozenSrc())) {
         var1 = true;
      } else {
         var1 = false;
      }

      var6 = var4.customWithEmojiId(var2, var1, var5.getAlt());
   } else {
      if (var0 !is UnicodeEmojiContentNode) {
         throw new s9.n();
      }

      var6 = RenderableEmoji.Companion.unicode((var0 as UnicodeEmojiContentNode).getSurrogate());
   }

   return (RenderableEmoji)var6;
}
