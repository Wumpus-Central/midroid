package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.discord.chat.databinding.CtaButtonBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.theme.R
import kotlin.jvm.functions.Function3

public class CtaButtonView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   public final val binding: CtaButtonBinding

   fun CtaButtonView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: CtaButtonBinding = CtaButtonBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      var3.ctaButton.setDiscordFont(DiscordFont.PrimaryNormal);
   }

   private fun setButtonCallback(channelId: ChannelId, messageId: MessageId, callback: String?, onTapCtaButton: (ChannelId, MessageId, String) -> Unit) {
      if (var4 != null && !kotlin.text.h.x(var4)) {
         this.binding.ctaButton.setOnClickButtonListener(new j(var5, var1, var3, var4));
         this.binding.ctaButton.setEnabled(true);
         this.binding.ctaButton.setAlpha(1.0F);
      } else {
         this.binding.ctaButton.setOnClickButtonListener(new k());
         this.binding.ctaButton.setEnabled(false);
         this.binding.ctaButton.setAlpha(0.5F);
      }
   }

   @JvmStatic
   fun `setButtonCallback_JjTCmh4$lambda$0`(var0: Function3, var1: Long, var3: java.lang.String, var4: java.lang.String, var5: View) {
      kotlin.jvm.internal.q.h(var0, "$onTapCtaButton");
      kotlin.jvm.internal.q.h(var3, "$messageId");
      var0.invoke(ChannelId.box-impl(var1), MessageId.box-impl(var3), var4);
   }

   @JvmStatic
   fun `setButtonCallback_JjTCmh4$lambda$1`(var0: View) {
   }

   public fun setContent(
      channelId: ChannelId,
      messageId: MessageId,
      text: String,
      textColor: Int? = ...,
      backgroundColor: Int? = ...,
      callback: String? = ...,
      onTapCtaButton: (ChannelId, MessageId, String) -> Unit
   ) {
      kotlin.jvm.internal.q.h(var3, "messageId");
      kotlin.jvm.internal.q.h(var4, "text");
      kotlin.jvm.internal.q.h(var8, "onTapCtaButton");
      this.binding.ctaButton.setText(var4);
      var var9: Int;
      if (var5 != null) {
         var9 = var5;
      } else {
         var9 = -1;
      }

      this.binding.ctaButton.setTextColor(var9);
      val var11: DCDButton = this.binding.ctaButton;
      if (var6 != null) {
         var9 = var6;
      } else {
         var9 = this.getContext().getColor(R.color.brand_500);
      }

      var11.setBackgroundColor(var9);
      this.setButtonCallback-JjTCmh4(var1, var3, var7, var8);
   }
}
