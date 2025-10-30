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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMessageTagView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageTagView.kt\ncom/discord/chat/presentation/message/MessageTagView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,87:1\n257#2,2:88\n257#2,2:90\n*S KotlinDebug\n*F\n+ 1 MessageTagView.kt\ncom/discord/chat/presentation/message/MessageTagView\n*L\n56#1:88,2\n83#1:90,2\n*E\n"])
public class MessageTagView(context: Context, attrs: AttributeSet) : FrameLayout(var1, var2) {
   private final val binding: MessageTagViewBinding

   init {
      val var3: MessageTagViewBinding = MessageTagViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      val var5: TextView = var3.tag;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      val var6: SimpleDraweeView = var3.verifiedBotIcon;
      ReactAssetUtilsKt.setReactAsset(var6, ReactAsset.Check);
      val var4: SimpleDraweeView = var3.verifiedBotIcon;
      ColorUtilsKt.setTintColor(var4, -1);
   }

   @JvmStatic
   fun `configureTagView_Ul7AT2Q$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: Long, var4: java.lang.String, var5: View) {
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
      if (var1 != null) {
         this.binding.tag.setText(var1);
         val var18: TextView = this.binding.tag;
         val var12: Int;
         if (var3 != null) {
            var12 = var3;
         } else {
            val var28: Context = this.getContext();
            var12 = ColorUtilsKt.getColorCompat(var28, color.white);
         }

         var18.setTextColor(var12);
         val var19: ConstraintLayout = this.binding.layout;
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var19, false, new r0(var6, var7, var8, var10), 1, null);
         val var20: SimpleDraweeView = this.binding.verifiedBotIcon;
         var var29: Byte = 8;
         if (var2 == java.lang.Boolean.TRUE) {
            var29 = 0;
         }

         var20.setVisibility(var29);
         if (var4 != null) {
            val var21: ConstraintLayout = this.binding.layout;
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(
               var21, ReactColorToAndroidColorKt.reactColorToAndroidColor(var4), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
            );
         } else {
            val var22: ConstraintLayout = this.binding.layout;
            ViewBackgroundUtilsKt.setBackgroundDrawableRes(var22, R.drawable.drawable_message_author_tag_bg);
         }

         if (var11 != null) {
            val var23: SimpleDraweeView = this.binding.verifiedBotIcon;
            ReactAssetUtilsKt.setOptionalReactImageUrl(var23, var11);
         } else {
            val var24: SimpleDraweeView = this.binding.verifiedBotIcon;
            ReactAssetUtilsKt.setReactAsset(var24, ReactAsset.Check);
         }

         val var25: SimpleDraweeView = this.binding.verifiedBotIcon;
         ColorUtilsKt.setTintColor(var25, -1);
      } else {
         if (var5 != null) {
            this.binding.tag.setText(var5);
            val var14: TextView = this.binding.tag;
            val var26: Context = this.getContext();
            var14.setTextColor(ColorUtilsKt.getColorCompat(var26, color.brand_560));
            val var15: ConstraintLayout = this.binding.layout;
            val var27: Context = this.getContext();
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(
               var15, ColorUtilsKt.getThemeColor(var27, color.brand_200, color.brand_260), SizeUtilsKt.getDpToPx(8), null, 0, 12, null
            );
            val var16: ConstraintLayout = this.binding.layout;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var16, false, new s0(var6), 1, null);
            val var17: SimpleDraweeView = this.binding.verifiedBotIcon;
            var17.setVisibility(8);
         }
      }
   }
}
