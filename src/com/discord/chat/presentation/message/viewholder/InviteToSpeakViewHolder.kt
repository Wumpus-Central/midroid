package com.discord.chat.presentation.message.viewholder

import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory
import com.discord.primitives.MessageId

public class InviteToSpeakViewHolder(inviteToSpeakView: InviteToSpeakView, onInviteToSpeakClicked: (MessageId) -> Unit) : MessagePartViewHolder {
   private final val inviteToSpeakView: InviteToSpeakView
   private final val onInviteToSpeakClicked: (MessageId) -> Unit

   init {
      kotlin.jvm.internal.r.h(var1, "inviteToSpeakView");
      kotlin.jvm.internal.r.h(var2, "onInviteToSpeakClicked");
      super(var1, null);
      this.inviteToSpeakView = var1;
      this.onInviteToSpeakClicked = var2;
      var1.setLayoutParams(new LayoutParams(-2, -2));
   }

   public fun bind(inviteToSpeakAccessory: InviteToSpeakAccessory) {
      kotlin.jvm.internal.r.h(var1, "inviteToSpeakAccessory");
      this.inviteToSpeakView.setProps(var1.getMessage(), this.onInviteToSpeakClicked);
   }
}
