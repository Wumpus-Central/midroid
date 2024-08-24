package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.LinearLayout
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.channelprompt.ChannelPromptData
import com.discord.chat.databinding.ChannelPromptActionsViewBinding
import com.discord.core.DCDButton
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.ThemeManagerKt

public class ChannelPromptActionsView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: ChannelPromptActionsViewBinding

   fun ChannelPromptActionsView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: ChannelPromptActionsViewBinding = ChannelPromptActionsViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
   }

   public fun configure(
      message: Message,
      onTapCameraButton: OnClickListener,
      onTapEmojiButton: OnClickListener,
      onTapGamingStatsButton: OnClickListener,
      onTapGifButton: OnClickListener
   ) {
      kotlin.jvm.internal.r.h(var1, "message");
      kotlin.jvm.internal.r.h(var2, "onTapCameraButton");
      kotlin.jvm.internal.r.h(var3, "onTapEmojiButton");
      kotlin.jvm.internal.r.h(var4, "onTapGamingStatsButton");
      kotlin.jvm.internal.r.h(var5, "onTapGifButton");
      val var8: DCDButton = this.binding.cameraButton;
      val var6: ChannelPromptData = var1.getChannelPromptData();
      val var17: java.lang.String;
      if (var6 != null) {
         var17 = var6.getCameraButtonIcon();
      } else {
         var17 = null;
      }

      if (var17 != null) {
         var8.setIcon(var1.getChannelPromptData().getCameraButtonIcon(), SizeUtilsKt.getDpToPx(24));
         var8.setText(var1.getChannelPromptData().getCameraButtonText());
         kotlin.jvm.internal.r.g(var8, "configure$lambda$0");
         var8.setVisibility(0);
      } else {
         kotlin.jvm.internal.r.g(var8, "configure$lambda$0");
         var8.setVisibility(8);
      }

      var8.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
      var8.setOnClickButtonListener(var2);
      val var18: DCDButton = this.binding.gifButton;
      val var9: ChannelPromptData = var1.getChannelPromptData();
      val var10: java.lang.String;
      if (var9 != null) {
         var10 = var9.getGifButtonIcon();
      } else {
         var10 = null;
      }

      if (var10 != null) {
         var18.setIcon(var1.getChannelPromptData().getGifButtonIcon(), SizeUtilsKt.getDpToPx(24));
         var18.setText(var1.getChannelPromptData().getGifButtonText());
         kotlin.jvm.internal.r.g(var18, "configure$lambda$1");
         var18.setVisibility(0);
      } else {
         kotlin.jvm.internal.r.g(var18, "configure$lambda$1");
         var18.setVisibility(8);
      }

      var18.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
      var18.setOnClickButtonListener(var5);
      val var15: DCDButton = this.binding.emojiButton;
      val var11: ChannelPromptData = var1.getChannelPromptData();
      val var12: java.lang.String;
      if (var11 != null) {
         var12 = var11.getEmojiButtonIcon();
      } else {
         var12 = null;
      }

      if (var12 != null) {
         var15.setIcon(var1.getChannelPromptData().getEmojiButtonIcon(), SizeUtilsKt.getDpToPx(24));
         var15.setText(var1.getChannelPromptData().getEmojiButtonText());
         kotlin.jvm.internal.r.g(var15, "configure$lambda$2");
         var15.setVisibility(0);
      } else {
         kotlin.jvm.internal.r.g(var15, "configure$lambda$2");
         var15.setVisibility(8);
      }

      var15.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
      var15.setOnClickButtonListener(var3);
      val var14: DCDButton = this.binding.gamingStatsButton;
      val var16: ChannelPromptData = var1.getChannelPromptData();
      var var13: java.lang.String = null;
      if (var16 != null) {
         var13 = var16.getGamingStatsButtonText();
      }

      if (var13 != null) {
         var14.setText(var1.getChannelPromptData().getGamingStatsButtonText());
         kotlin.jvm.internal.r.g(var14, "configure$lambda$3");
         var14.setVisibility(0);
      } else {
         kotlin.jvm.internal.r.g(var14, "configure$lambda$3");
         var14.setVisibility(8);
      }

      var14.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
      var14.setOnClickButtonListener(var4);
   }
}
