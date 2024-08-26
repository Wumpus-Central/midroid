package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildInviteView

public class GuildInviteViewHolder(guildInviteView: GuildInviteView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   public final val eventHandler: ChatEventHandler
   private final val guildInviteView: GuildInviteView

   init {
      kotlin.jvm.internal.r.h(var1, "guildInviteView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.guildInviteView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: GuildInviteViewHolder, var1: GuildInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      kotlin.jvm.internal.r.h(var1, "$inviteAccessory");
      var0.eventHandler.onTapInviteEmbed_AFFcxXc(var1.getMessageId_3Eiw7ao(), var1.getCodedLinkIndex(), null, null);
   }

   public fun bind(inviteAccessory: GuildInviteMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "inviteAccessory");
      val var5: GuildInviteEmbedImpl = var1.getInvite();
      val var6: GuildInviteView = this.guildInviteView;
      var var4: java.lang.String = var5.getSubtitle();
      var var2: Boolean;
      if (var4 != null && !kotlin.text.f.x(var4)) {
         var2 = false;
      } else {
         var2 = true;
      }

      if (!var2) {
         var4 = var5.getSubtitle();
      } else {
         label22: {
            var4 = var5.getChannelIcon();
            if (var4 != null) {
               var2 = false;
               if (!kotlin.text.f.x(var4)) {
                  break label22;
               }
            }

            var2 = true;
         }

         if (!var2) {
            var4 = var5.getChannelName();
         } else {
            var4 = null;
         }
      }

      var6.setInviteSplash(var5.getInviteSplash());
      var6.setHeaderText(var5.getHeaderText());
      var6.setHeaderColor(var5.getHeaderColor());
      var6.setTitleText(var5.getTitleText());
      var6.setTitleColor(var5.getTitleColor());
      var6.setPresence(var5.getOnlineText(), var5.getMemberText());
      var6.setGuildImage(var5.getThumbnailUrl(), var5.getThumbnailText(), var5.getThumbnailBackgroundColor());
      var6.setSubtitle(var4);
      var6.setSubtitleColor(var5.getSubtitleColor());
      var6.setSubtitleIcon(var5.getChannelIcon());
      var6.setOnButtonClickListener(new p(this, var1));
      var6.setButtonText(var5.getAcceptLabelText());
      var6.setButtonTextColor(var5.getAcceptLabelColor());
      var6.setButtonBackgroundColor(var5.getAcceptLabelBackgroundColor());
      var6.setBackgroundRectangleColor(var5.getBackgroundColor());
   }
}
