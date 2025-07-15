package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView

public class RoleSubscriptionPurchaseViewHolder(roleSubscriptionPurchaseView: RoleSubscriptionPurchaseView) : MessagePartViewHolder {
   private final val roleSubscriptionPurchaseView: RoleSubscriptionPurchaseView

   init {
      kotlin.jvm.internal.r.h(var1, "roleSubscriptionPurchaseView");
      super(var1, null);
      this.roleSubscriptionPurchaseView = var1;
   }

   public fun bind(accessory: RoleSubscriptionPurchaseAccessory, widthPx: Int) {
      kotlin.jvm.internal.r.h(var1, "accessory");
      this.roleSubscriptionPurchaseView.configure(var1.getAuthorUsername(), var1.getAuthorAvatar(), var2);
   }
}
