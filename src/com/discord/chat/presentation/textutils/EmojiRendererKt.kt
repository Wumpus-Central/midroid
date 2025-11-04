@file:SourceDebugExtension(["SMAP\nEmojiRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiRenderer.kt\ncom/discord/chat/presentation/textutils/EmojiRendererKt\n+ 2 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,73:1\n32#2,4:74\n36#2:81\n13409#3:78\n13410#3:80\n1#4:79\n27#5:82\n27#5:83\n27#5:84\n*S KotlinDebug\n*F\n+ 1 EmojiRenderer.kt\ncom/discord/chat/presentation/textutils/EmojiRendererKt\n*L\n38#1:74,4\n38#1:81\n38#1:78\n38#1:80\n38#1:79\n51#1:82\n64#1:83\n65#1:84\n*E\n"])

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
import kotlin.jvm.internal.SourceDebugExtension

@JvmSynthetic
fun a(var0: RenderContext, var1: EmojiContentNode, var2: View): Unit {
   return renderEmoji$lambda$0(var0, var1, var2);
}

@JvmSynthetic
fun b(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   return renderEmoji$lambda$2$lambda$1(var0, var1);
}

public fun GenericDraweeHierarchyBuilder.handleEmojiSpoiler(rc: RenderContext, revealTransparent: Boolean = false) {
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
   val var10: ClickableSpan = new ClickableSpan(null, null, null, null, 0.0F, null, null, new com.discord.chat.presentation.textutils.i(var2, var1), 127, null);
   val var6: Int = var0.length();
   RenderableEmojiKt.renderEmojiInto(var0, var9, var2.getContext(), var4, var2.getAnimateEmoji(), var5, new com.discord.chat.presentation.textutils.j(var2));

   for (int var12 = 0; var12 < 2; var12++) {
      val var11: Any = new Object[]{var13, var10}[var12];
      if (var11 != null) {
         var0.setSpan(var11, var6, var0.length(), 33);
      }
   }
}

fun `renderEmoji$lambda$0`(var0: RenderContext, var1: EmojiContentNode, var2: View): Unit {
   var0.getOnTapEmoji().invoke(var1);
   return Unit.a;
}

fun `renderEmoji$lambda$2$lambda$1`(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   handleEmojiSpoiler$default(var1, var0, false, 2, null);
   return Unit.a;
}

public fun EmojiContentNode.renderable(): RenderableEmoji {
   if (var0 !is CustomEmojiContentNode) {
      if (var0 is UnicodeEmojiContentNode) {
         return RenderableEmoji.Companion.unicode((var0 as UnicodeEmojiContentNode).getSurrogate());
      } else {
         throw new ht.p();
      }
   } else {
      val var4: RenderableEmoji.Companion = RenderableEmoji.Companion;
      val var5: CustomEmojiContentNode = var0 as CustomEmojiContentNode;
      val var1: Long = (var0 as CustomEmojiContentNode).getId();
      val var3: Boolean;
      if (!StringsKt.i0(var5.getSrc()) && !(var5.getSrc() == var5.getFrozenSrc())) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var4.customWithEmojiId(var1, var3, var5.getAlt());
   }
}
