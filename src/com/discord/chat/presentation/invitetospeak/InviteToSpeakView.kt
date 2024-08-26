package com.discord.chat.presentation.invitetospeak

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.LinearLayout.LayoutParams
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.Message
import com.discord.chat.databinding.InviteToSpeakViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import f3.a
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public class InviteToSpeakView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: InviteToSpeakViewBinding

   fun InviteToSpeakView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var3: InviteToSpeakViewBinding = InviteToSpeakViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
      this.setOrientation(0);
      this.setLayoutParams(new LayoutParams(-2, -2));
      this.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
      val var4: TextView = var3.inviteToSpeakText;
      r.g(var3.inviteToSpeakText, "_init_$lambda$0");
      var4.setTextColor(ColorUtilsKt.getColorCompat(var4, color.white));
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   @JvmStatic
   fun `setProps$lambda$1`(var0: Function1, var1: Message, var2: View) {
      r.h(var0, "$onInviteToSpeakClicked");
      r.h(var1, "$message");
      var0.invoke(MessageId.box_impl(var1.getId_3Eiw7ao()));
   }

   public fun setProps(message: Message, onInviteToSpeakClicked: (MessageId) -> Unit) {
      r.h(var1, "message");
      r.h(var2, "onInviteToSpeakClicked");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new a(var2, var1), 1, null);
      this.binding.inviteToSpeakText.setText(var1.getButtonLabel());
      val var3: SimpleDraweeView = this.binding.moveToSpeakerIcon;
      r.g(this.binding.moveToSpeakerIcon, "binding.moveToSpeakerIcon");
      ReactAssetUtilsKt.setReactAsset(var3, ReactAsset.MoveToSpeaker);
      val var4: SimpleDraweeView = this.binding.moveToSpeakerIcon;
      r.g(this.binding.moveToSpeakerIcon, "binding.moveToSpeakerIcon");
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getHeaderPrimary());
   }
}
