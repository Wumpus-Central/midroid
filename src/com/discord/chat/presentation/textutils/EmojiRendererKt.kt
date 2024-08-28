package com.discord.chat.presentation.textutils

import android.graphics.drawable.ColorDrawable
import android.view.View
import com.discord.chat.bridge.contentnode.CustomEmojiContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.UnicodeEmojiContentNode
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.emoji.RenderableEmoji.Companion
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.span.utilities.spannable.ClickableSpan
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan
import com.discord.theme.DiscordThemeObject
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import eh.p
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public fun renderEmoji(builder: DraweeSpanStringBuilder, emoji: EmojiContentNode, rc: RenderContext) {
   r.h(var0, "builder");
   r.h(var1, "emoji");
   r.h(var2, "rc");
   val var8: Boolean = var1.getJumboable();
   val var4: Int;
   if (var8) {
      var4 = SizeUtilsKt.getDpToPx(48);
   } else {
      val var9: java.lang.Float = var2.getEmojiBaselineHeightOverridePx();
      val var3: Float;
      if (var9 != null) {
         var3 = var9;
      } else {
         var3 = var2.getBaselineHeightPx();
      }

      var4 = TextUtilsKt.getIconSize("_emoji", var3);
   }

   val var5: Byte;
   if (var8) {
      var5 = 1;
   } else {
      var5 = 2;
   }

   val var10: RenderableEmoji = renderable(var1);
   val var14: EmojiAccessibilitySpan = new EmojiAccessibilitySpan(var10.getContentDescription());
   val var11: ClickableSpan = new ClickableSpan(null, null, null, null, new Function1<View, Unit>(var2, var1) {
      final EmojiContentNode $emoji;
      final RenderContext $rc;

      {
         super(1);
         this.$rc = var1;
         this.$emoji = var2;
      }

      public final void invoke(View var1) {
         r.h(var1, "it");
         this.$rc.getOnTapEmoji().invoke(this.$emoji);
      }
   }, 15, null);
   val var7: Int = var0.length();
   RenderableEmojiKt.renderEmojiInto(
      var0, var10, var2.getContext(), var4, var2.getAnimateEmoji(), var5, new Function1<GenericDraweeHierarchyBuilder, Unit>(var2) {
         final RenderContext $rc;

         {
            super(1);
            this.$rc = var1;
         }

         public final void invoke(GenericDraweeHierarchyBuilder var1) {
            r.h(var1, "$this$renderEmojiInto");
            var var3: Int = 0;
            var1.D(new ColorDrawable(0));
            var1.z(0);
            if (this.$rc.spoilerExists()) {
               val var4: Boolean = this.$rc.spoilerIsRevealed();
               val var5: DiscordThemeObject = ThemeManagerKt.getTheme();
               val var2: Int;
               if (var4) {
                  var2 = var5.getSpoilerRevealedBackground();
               } else {
                  var2 = var5.getSpoilerHiddenBackground();
               }

               if (!var4) {
                  var3 = ThemeManagerKt.getTheme().getSpoilerHiddenBackground();
               }

               var1.x(new ColorDrawable(var2));
               var1.C(new ColorDrawable(var3));
            }
         }
      }
   );

   for (int var13 = 0; var13 < 2; var13++) {
      val var12: Any = new Object[]{var14, var11}[var13];
      if (var12 != null) {
         var0.setSpan(var12, var7, var0.length(), 33);
      }
   }
}

public fun EmojiContentNode.renderable(): RenderableEmoji {
   r.h(var0, "<this>");
   val var7: Any;
   if (var0 is CustomEmojiContentNode) {
      val var5: Companion = RenderableEmoji.Companion;
      val var6: CustomEmojiContentNode = var0 as CustomEmojiContentNode;
      val var3: Long = (var0 as CustomEmojiContentNode).getId();
      val var2: Boolean = kotlin.text.f.x((var0 as CustomEmojiContentNode).getSrc());
      var var1: Boolean = true;
      if (!(var2 xor true) || r.c(var6.getSrc(), var6.getFrozenSrc())) {
         var1 = false;
      }

      var7 = var5.customWithEmojiId(var3, var1, var6.getAlt());
   } else {
      if (var0 !is UnicodeEmojiContentNode) {
         throw new p();
      }

      var7 = RenderableEmoji.Companion.unicode((var0 as UnicodeEmojiContentNode).getSurrogate());
   }

   return (RenderableEmoji)var7;
}
