package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.MessageAltRemixTagViewBinding
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
import com.discord.theme.R
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class MessageAltRemixTagView(context: Context, attrs: AttributeSet) : FrameLayout {
   private final val binding: MessageAltRemixTagViewBinding

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "attrs");
      super(var1, var2);
      val var3: MessageAltRemixTagViewBinding = MessageAltRemixTagViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      val var5: TextView = var3.altRemixTag;
      kotlin.jvm.internal.q.g(var3.altRemixTag, "altRemixTag");
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      val var4: SimpleDraweeView = var3.remixIcon;
      kotlin.jvm.internal.q.g(var3.remixIcon, "remixIcon");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.Remix);
   }

   @JvmStatic
   fun `configureTagView_e2j04IU$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: Long, var4: java.lang.String, var5: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      kotlin.jvm.internal.q.h(var1, "$messageId");
      var0.onTapTag-Eqy5D80(var1, var2, var4);
   }

   public fun configureTagView(
      tagText: String?,
      tagTextColor: Int?,
      tagBackgroundColor: Int?,
      eventHandler: ChatEventHandler,
      messageId: MessageId,
      channelId: ChannelId,
      tagType: String?
   ) {
      kotlin.jvm.internal.q.h(var4, "eventHandler");
      kotlin.jvm.internal.q.h(var5, "messageId");
      if (var1 != null) {
         this.binding.altRemixTag.setText(var1);
         val var11: TextView = this.binding.altRemixTag;
         var var9: Int;
         if (var2 != null) {
            var9 = var2;
         } else {
            val var10: Context = this.getContext();
            kotlin.jvm.internal.q.g(var10, "getContext(...)");
            var9 = ColorUtilsKt.getColorCompat(var10, R.color.white);
         }

         var11.setTextColor(var9);
         val var12: SimpleDraweeView = this.binding.remixIcon;
         kotlin.jvm.internal.q.g(this.binding.remixIcon, "remixIcon");
         if (var2 != null) {
            var9 = var2;
         } else {
            val var17: Context = this.getContext();
            kotlin.jvm.internal.q.g(var17, "getContext(...)");
            var9 = ColorUtilsKt.getColorCompat(var17, R.color.white);
         }

         ColorUtilsKt.setTintColor(var12, var9);
         val var13: ConstraintLayout = this.binding.layout;
         kotlin.jvm.internal.q.g(this.binding.layout, "layout");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var13, false, new j(var4, var5, var6, var8), 1, null);
         val var14: SimpleDraweeView = this.binding.remixIcon;
         kotlin.jvm.internal.q.g(this.binding.remixIcon, "remixIcon");
         var14.setVisibility(0);
         if (var3 != null) {
            val var15: ConstraintLayout = this.binding.layout;
            kotlin.jvm.internal.q.g(this.binding.layout, "layout");
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(
               var15, ReactColorToAndroidColorKt.reactColorToAndroidColor(var3), SizeUtilsKt.getDpToPx(3), null, 0, 12, null
            );
         } else {
            val var16: ConstraintLayout = this.binding.layout;
            kotlin.jvm.internal.q.g(this.binding.layout, "layout");
            ViewBackgroundUtilsKt.setBackgroundDrawableRes(var16, com.discord.chat.R.drawable.drawable_message_author_tag_bg);
         }
      }
   }
}
