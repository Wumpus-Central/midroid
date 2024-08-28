package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.forwarding.ForwardFooterInfo
import com.discord.chat.bridge.forwarding.ForwardInfo
import com.discord.chat.databinding.ForwardBreadcrumbViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function3

public class ForwardBreadcrumbView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   public final val binding: ForwardBreadcrumbViewBinding

   fun ForwardBreadcrumbView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var4: ForwardBreadcrumbViewBinding = ForwardBreadcrumbViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      var4.getRoot().setPadding(0, SizeUtilsKt.getDpToPx(1), 0, SizeUtilsKt.getDpToPx(1));
      val var6: SimpleDraweeView = var4.icon;
      kotlin.jvm.internal.q.g(var4.icon, "icon");
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(4));
      var4.label.setTextColor(ThemeManagerKt.getTheme().getTextLowContrast());
      val var7: TextView = var4.label;
      kotlin.jvm.internal.q.g(var4.label, "label");
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
      var var3: TextView = var4.separator;
      kotlin.jvm.internal.q.g(var4.separator, "separator");
      val var8: DiscordFont = DiscordFont.PrimaryNormal;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryNormal);
      var4.separator.setTextColor(ThemeManagerKt.getTheme().getTextLowContrast());
      var3 = var4.timestamp;
      kotlin.jvm.internal.q.g(var4.timestamp, "timestamp");
      DiscordFontUtilsKt.setDiscordFont(var3, var8);
      var4.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextLowContrast());
      val var9: SimpleDraweeView = var4.arrow;
      kotlin.jvm.internal.q.g(var4.arrow, "arrow");
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.ArrowRight);
      val var5: SimpleDraweeView = var4.arrow;
      kotlin.jvm.internal.q.g(var4.arrow, "arrow");
      ColorUtilsKt.setTintColor(var5, ThemeManagerKt.getTheme().getTextLowContrast());
   }

   @JvmStatic
   fun `configure_JjTCmh4$lambda$0`(var0: Function3, var1: ForwardInfo, var2: Long, var4: java.lang.String, var5: View) {
      kotlin.jvm.internal.q.h(var0, "$onTapForwardFooter");
      kotlin.jvm.internal.q.h(var1, "$info");
      kotlin.jvm.internal.q.h(var4, "$messageId");
      var0.invoke(var1.getSnapshotIndex(), ChannelId.box-impl(var2), MessageId.box-impl(var4));
   }

   public fun configure(channelId: ChannelId, messageId: MessageId, info: ForwardInfo, onTapForwardFooter: (Int, ChannelId, MessageId) -> Unit) {
      kotlin.jvm.internal.q.h(var3, "messageId");
      kotlin.jvm.internal.q.h(var4, "info");
      kotlin.jvm.internal.q.h(var5, "onTapForwardFooter");
      val var8: ForwardFooterInfo = var4.getFooterInfo();
      if (var8 != null) {
         val var9: d0 = new d0(var5, var4, var1, var3);
         var var6: Byte = 1;
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var9, 1, null);
         val var10: SimpleDraweeView = this.binding.icon;
         kotlin.jvm.internal.q.g(this.binding.icon, "icon");
         if (var8.getOriginIconUrl() == null) {
            var6 = 0;
         }

         if (var6) {
            var6 = 0;
         } else {
            var6 = 8;
         }

         var10.setVisibility(var6);
         if (var8.getOriginIconUrl() != null) {
            val var11: SimpleDraweeView = this.binding.icon;
            kotlin.jvm.internal.q.g(this.binding.icon, "icon");
            ReactAssetUtilsKt.setReactImageUrl(var11, var8.getOriginIconUrl());
         }

         this.binding.label.setText(var8.getOriginLabel());
         this.binding.timestamp.setText(var8.getTimestampLabel());
         this.setContentDescription(var8.getAccessibilityLabel());
      }
   }
}
