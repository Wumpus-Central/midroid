package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.R
import com.discord.chat.databinding.MessageTagViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react.utilities.ReactColorToAndroidColorKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class MessageTagView(context: Context, attrs: AttributeSet) : FrameLayout {
   private final val binding: MessageTagViewBinding

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      kotlin.jvm.internal.r.h(var2, "attrs");
      super(var1, var2);
      val var3: MessageTagViewBinding = MessageTagViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      val var5: TextView = var3.tag;
      kotlin.jvm.internal.r.g(var3.tag, "binding.tag");
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      val var6: SimpleDraweeView = var3.verifiedBotIcon;
      kotlin.jvm.internal.r.g(var3.verifiedBotIcon, "binding.verifiedBotIcon");
      ReactAssetUtilsKt.setReactAsset(var6, ReactAsset.Check);
      val var4: SimpleDraweeView = var3.verifiedBotIcon;
      kotlin.jvm.internal.r.g(var3.verifiedBotIcon, "binding.verifiedBotIcon");
      ColorUtilsKt.setTintColor(var4, -1);
   }

   @JvmStatic
   fun `configureTagView_Ul7AT2Q$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: Long, var4: java.lang.String, var5: View) {
      kotlin.jvm.internal.r.h(var1, "$messageId");
      if (var0 != null) {
         var0.onTapTag-Eqy5D80(var1, var2, var4);
      }
   }

   @JvmStatic
   fun `configureTagView_Ul7AT2Q$lambda$1`(var0: ChatEventHandler, var1: View) {
      if (var0 != null) {
         var0.onTapOpTag();
      }
   }

   public fun configureTagView(
      tagText: String?,
      isVerifiedBot: Boolean?,
      tagTextColor: Int?,
      tagBackgroundColor: Int?,
      opTagText: String?,
      eventHandler: ChatEventHandler?,
      messageId: MessageId,
      channelId: ChannelId,
      tagType: String?,
      tagIconUrl: String? = ...
   ) {
      kotlin.jvm.internal.r.h(var7, "messageId");
      if (var1 != null) {
         this.binding.tag.setText(var1);
         val var14: TextView = this.binding.tag;
         val var12: Int;
         if (var3 != null) {
            var12 = var3;
         } else {
            val var28: Context = this.getContext();
            kotlin.jvm.internal.r.g(var28, "context");
            var12 = ColorUtilsKt.getColorCompat(var28, color.white);
         }

         var14.setTextColor(var12);
         val var15: ConstraintLayout = this.binding.layout;
         kotlin.jvm.internal.r.g(this.binding.layout, "binding.layout");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var15, false, new k(var6, var7, var8, var10), 1, null);
         val var16: SimpleDraweeView = this.binding.verifiedBotIcon;
         kotlin.jvm.internal.r.g(this.binding.verifiedBotIcon, "binding.verifiedBotIcon");
         val var29: Byte;
         if (kotlin.jvm.internal.r.c(var2, java.lang.Boolean.TRUE)) {
            var29 = 0;
         } else {
            var29 = 8;
         }

         var16.setVisibility(var29);
         if (var4 != null) {
            val var17: ConstraintLayout = this.binding.layout;
            kotlin.jvm.internal.r.g(this.binding.layout, "binding.layout");
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(
               var17, ReactColorToAndroidColorKt.reactColorToAndroidColor(var4), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
            );
         } else {
            val var18: ConstraintLayout = this.binding.layout;
            kotlin.jvm.internal.r.g(this.binding.layout, "binding.layout");
            ViewBackgroundUtilsKt.setBackgroundDrawableRes(var18, R.drawable.drawable_message_author_tag_bg);
         }

         if (var11 != null) {
            val var19: SimpleDraweeView = this.binding.verifiedBotIcon;
            kotlin.jvm.internal.r.g(this.binding.verifiedBotIcon, "binding.verifiedBotIcon");
            ReactAssetUtilsKt.setOptionalReactImageUrl(var19, var11);
         } else {
            val var20: SimpleDraweeView = this.binding.verifiedBotIcon;
            kotlin.jvm.internal.r.g(this.binding.verifiedBotIcon, "binding.verifiedBotIcon");
            ReactAssetUtilsKt.setReactAsset(var20, ReactAsset.Check);
         }

         val var21: SimpleDraweeView = this.binding.verifiedBotIcon;
         kotlin.jvm.internal.r.g(this.binding.verifiedBotIcon, "binding.verifiedBotIcon");
         ColorUtilsKt.setTintColor(var21, -1);
      } else if (var5 != null) {
         this.binding.tag.setText(var5);
         val var26: TextView = this.binding.tag;
         val var22: Context = this.getContext();
         kotlin.jvm.internal.r.g(var22, "context");
         var26.setTextColor(ColorUtilsKt.getColorCompat(var22, color.brand_560));
         val var23: ConstraintLayout = this.binding.layout;
         kotlin.jvm.internal.r.g(this.binding.layout, "binding.layout");
         val var27: Context = this.getContext();
         kotlin.jvm.internal.r.g(var27, "context");
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(
            var23, ColorUtilsKt.getThemeColor(var27, color.brand_200, color.brand_260), SizeUtilsKt.getDpToPx(8), null, 0, 12, null
         );
         val var24: ConstraintLayout = this.binding.layout;
         kotlin.jvm.internal.r.g(this.binding.layout, "binding.layout");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var24, false, new l(var6), 1, null);
         val var25: SimpleDraweeView = this.binding.verifiedBotIcon;
         kotlin.jvm.internal.r.g(this.binding.verifiedBotIcon, "binding.verifiedBotIcon");
         var25.setVisibility(8);
      }
   }
}
