package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView

public class RoleSubscriptionPurchaseViewHolder(roleSubscriptionPurchaseView: RoleSubscriptionPurchaseView) : MessagePartViewHolder(var1) {
   private final val roleSubscriptionPurchaseView: RoleSubscriptionPurchaseView

   init {
      this.roleSubscriptionPurchaseView = var1;
   }

   public fun bind(accessory: RoleSubscriptionPurchaseAccessory, widthPx: Int) {
      this.roleSubscriptionPurchaseView.configure(var1.getAuthorUsername(), var1.getAuthorAvatar(), var2);
   }
}
