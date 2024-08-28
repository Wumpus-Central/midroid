package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.chat.presentation.message.view.SafetySystemNotificationView

public class SafetySystemNotificationViewHolder(safetySystemNotificationView: SafetySystemNotificationView) : MessagePartViewHolder {
   private final val safetySystemNotificationView: SafetySystemNotificationView

   init {
      kotlin.jvm.internal.q.h(var1, "safetySystemNotificationView");
      super(var1, null);
      this.safetySystemNotificationView = var1;
   }

   public fun bind(safetySystemNotificationEmbed: SafetySystemNotificationEmbed, onTapCta: (String, String) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "safetySystemNotificationEmbed");
      kotlin.jvm.internal.q.h(var2, "onTapCta");
      val var10: SafetySystemNotificationView = this.safetySystemNotificationView;
      val var14: java.lang.String = var1.getTitleText();
      val var12: java.lang.String = var1.getTitleIcon();
      val var13: java.lang.String = var1.getSubtitleText();
      val var11: java.lang.String = var1.getDescriptionText();
      var var4: java.lang.String = var1.getPrimaryCtaText();
      var var3: java.lang.String = var4;
      if (var4 == null) {
         var3 = "";
      }

      var var5: java.lang.String = var1.getPrimaryCtaKey();
      var4 = var5;
      if (var5 == null) {
         var4 = "";
      }

      var var6: java.lang.String = var1.getPrimaryCtaType();
      var5 = var6;
      if (var6 == null) {
         var5 = "";
      }

      var var7: java.lang.String = var1.getSecondaryCtaText();
      var6 = var7;
      if (var7 == null) {
         var6 = "";
      }

      var var8: java.lang.String = var1.getSecondaryCtaType();
      var7 = var8;
      if (var8 == null) {
         var7 = "";
      }

      val var9: java.lang.String = var1.getSecondaryCtaKey();
      var8 = var9;
      if (var9 == null) {
         var8 = "";
      }

      var10.setContent(var14, var12, var13, var11, var3, var4, var5, var6, var7, var8, var1.getFooterTheme(), var2);
   }
}
