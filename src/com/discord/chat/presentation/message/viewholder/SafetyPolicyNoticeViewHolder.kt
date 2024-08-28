package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory
import com.discord.chat.presentation.message.view.SafetyPolicyNoticeView

public class SafetyPolicyNoticeViewHolder(safetyPolicyNoticeView: SafetyPolicyNoticeView) : MessagePartViewHolder {
   private final val safetyPolicyNoticeView: SafetyPolicyNoticeView

   init {
      kotlin.jvm.internal.q.h(var1, "safetyPolicyNoticeView");
      super(var1, null);
      this.safetyPolicyNoticeView = var1;
   }

   public fun bind(accessory: SafetyPolicyNoticeMessageAccessory, onTapEmbed: (String) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapEmbed");
      this.safetyPolicyNoticeView
         .setContent(
            var1.getSafetyPolicyNoticeEmbed().getTitleText(),
            var1.getSafetyPolicyNoticeEmbed().getSubtitleText(),
            var1.getSafetyPolicyNoticeEmbed().getDescriptionText(),
            var1.getSafetyPolicyNoticeEmbed().getCtaText(),
            var1.getSafetyPolicyNoticeEmbed().getClassificationId(),
            var2
         );
   }
}
