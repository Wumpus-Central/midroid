package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.ActivityBookmarkMessageAccessory
import com.discord.chat.presentation.message.view.ActivityBookmarkView

public class ActivityBookmarkViewHolder(activityBookmarkView: ActivityBookmarkView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val activityBookmarkView: ActivityBookmarkView
   public final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.r.h(var1, "activityBookmarkView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.activityBookmarkView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: ActivityBookmarkEmbedImpl, var1: ActivityBookmarkViewHolder, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$activityBookmarkEmbed");
      kotlin.jvm.internal.r.h(var1, "this$0");
      var1.eventHandler.onTapActivityBookmarkEmbed_uU1mFKc(var0.getApplicationId_VavddsQ(), var0.getChannelId_o4g7jtM());
   }

   public fun bind(activityMessageAccessory: ActivityBookmarkMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "activityMessageAccessory");
      val var3: ActivityBookmarkEmbedImpl = var1.getActivityBookmarkEmbed();
      val var2: ActivityBookmarkView = this.activityBookmarkView;
      this.activityBookmarkView.setSplash(var3.getSplashUrl(), var1.getConstrainedWidth());
      var2.setHeaderText(var3.getHeaderText());
      var2.setLaunchButton(var3.getAcceptLabelText(), var3.getAcceptLabelBackgroundColor());
      var2.setDescription(var3.getDescription());
      var2.setAvatarUris(var3.getParticipantAvatarUris());
      var2.setParticipantsText(var3.getParticipantsText());
      var2.setOnLaunchButtonClickListener(new a(var3, this));
   }
}
