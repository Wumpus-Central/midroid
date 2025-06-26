package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.view.ActivityInstanceEmbedView

public class ActivityInstanceEmbedViewHolder(activityInstanceEmbedView: ActivityInstanceEmbedView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val activityInstanceEmbedView: ActivityInstanceEmbedView
   public final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.q.h(var1, "activityInstanceEmbedView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.activityInstanceEmbedView = var1;
      this.eventHandler = var2;
   }

   public fun bind(activityMessageAccessory: ActivityInstanceEmbedMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "activityMessageAccessory");
      val var4: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      val var3: ActivityInstanceEmbedView = this.activityInstanceEmbedView;
      this.activityInstanceEmbedView.initAppMessageEmbed(var4.getAppMessageEmbedModel(), this.eventHandler, var1.getConstrainedWidth());
      val var2: java.util.List = var4.getParticipantAvatarUris();
      var var5: java.util.List = var2;
      if (var2 == null) {
         var5 = kotlin.collections.i.k();
      }

      var3.setParticipantAvatarUris(var5);
      if (var4.getParticipantsDescription() != null) {
         var3.setParticipantText(var4.getParticipantsDescription());
      }
   }
}
