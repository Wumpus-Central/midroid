package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.activity_invites.ActivityInviteEmbedView
import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1

public class ActivityInviteEmbedViewHolder(activityInviteEmbedView: ActivityInviteEmbedView) : MessagePartViewHolder {
   private final val activityInviteEmbedView: ActivityInviteEmbedView

   init {
      kotlin.jvm.internal.q.h(var1, "activityInviteEmbedView");
      super(var1, null);
      this.activityInviteEmbedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function1, var1: ActivityInviteEmbedMessageAccessory, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onTapJoinActivity");
      kotlin.jvm.internal.q.h(var1, "$accessory");
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()));
   }

   public fun bind(accessory: ActivityInviteEmbedMessageAccessory, onTapJoinActivity: (MessageId) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapJoinActivity");
      val var3: ActivityInviteEmbed = var1.getActivityInviteEmbed();
      this.activityInviteEmbedView
         .setActivityInviteEmbed(
            var3.getCoverImage(),
            var3.isListening(),
            var3.getHeaderText(),
            var3.getPartyStatus(),
            var3.getAvatarsToRender(),
            var3.getMaxPartySize(),
            var3.getName(),
            var3.getSubtext(),
            var3.getJoinable(),
            var3.getCtaText(),
            new c(var2, var1)
         );
   }
}
