package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.view.ActivityInstanceEmbedView

public class ActivityInstanceEmbedViewHolder(activityInstanceEmbedView: ActivityInstanceEmbedView, eventHandler: ChatEventHandler) : MessagePartViewHolder(var1) {
   private final val activityInstanceEmbedView: ActivityInstanceEmbedView
   public final val eventHandler: ChatEventHandler

   init {
      this.activityInstanceEmbedView = var1;
      this.eventHandler = var2;
   }

   public fun bind(activityMessageAccessory: ActivityInstanceEmbedMessageAccessory) {
      val var3: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      val var4: ActivityInstanceEmbedView = this.activityInstanceEmbedView;
      this.activityInstanceEmbedView.initAppMessageEmbed(var3.getAppMessageEmbedModel(), this.eventHandler, var1.getConstrainedWidth());
      val var2: java.util.List = var3.getParticipantAvatarUris();
      var var5: java.util.List = var2;
      if (var2 == null) {
         var5 = CollectionsKt.k();
      }

      var4.setParticipantAvatarUris(var5);
      if (var3.getParticipantsDescription() != null) {
         var4.setParticipantText(var3.getParticipantsDescription());
      }
   }
}
