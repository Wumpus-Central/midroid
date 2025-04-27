package com.discord.chat.presentation.message.viewholder

import android.view.View
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

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: ActivityInstanceEmbed, var1: ActivityInstanceEmbedViewHolder, var2: ActivityInstanceEmbedMessageAccessory, var3: View) {
      kotlin.jvm.internal.q.h(var0, "$activityInstanceEmbed");
      kotlin.jvm.internal.q.h(var1, "this$0");
      kotlin.jvm.internal.q.h(var2, "$activityMessageAccessory");
      var1.eventHandler
         .onTapActivityInstanceEmbed-Ewv8C84(var0.getApplicationId-VavddsQ(), var0.getChannelId-o4g7jtM(), var0.getInstanceId(), var2.getMessageId-3Eiw7ao());
   }

   public fun bind(activityMessageAccessory: ActivityInstanceEmbedMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "activityMessageAccessory");
      val var4: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      val var5: ActivityInstanceEmbedView = this.activityInstanceEmbedView;
      this.activityInstanceEmbedView.setStatusText(var4.getStatusText());
      val var3: java.util.List = var4.getParticipantAvatarUris();
      var var2: java.util.List = var3;
      if (var3 == null) {
         var2 = kotlin.collections.i.k();
      }

      var5.setParticipantAvatarUris(var2);
      var5.setLaunchButton(var4.getButtonLabelText(), var4.getButtonBackgroundColor(), var4.getButtonDisabled() xor true, var4.getSubmitting());
      var5.setOnLaunchButtonClickListener(new b(var4, this, var1));
   }
}
