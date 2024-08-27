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
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), null, null);
   }

   public fun bind(inviteAccessory: GuildInviteMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "inviteAccessory");
      val var6: GuildInviteEmbedImpl = var1.getInvite();
      val var5: GuildInviteView = this.guildInviteView;
      var var4: java.lang.String = var6.getSubtitle();
      var var2: Boolean;
      if (var4 != null && !kotlin.text.f.x(var4)) {
         var2 = false;
      } else {
         var2 = true;
      }

      if (!var2) {
         var4 = var6.getSubtitle();
      } else {
         label22: {
            var4 = var6.getChannelIcon();
            if (var4 != null) {
               var2 = false;
               if (!kotlin.text.f.x(var4)) {
                  break label22;
               }
            }

            var2 = true;
         }

         if (!var2) {
            var4 = var6.getChannelName();
         } else {
            var4 = null;
         }
      }

      var5.setInviteSplash(var6.getInviteSplash());
      var5.setHeaderText(var6.getHeaderText());
      var5.setHeaderColor(var6.getHeaderColor());
      var5.setTitleText(var6.getTitleText());
      var5.setTitleColor(var6.getTitleColor());
      var5.setPresence(var6.getOnlineText(), var6.getMemberText());
      var5.setGuildImage(var6.getThumbnailUrl(), var6.getThumbnailText(), var6.getThumbnailBackgroundColor());
      var5.setSubtitle(var4);
      var5.setSubtitleColor(var6.getSubtitleColor());
      var5.setSubtitleIcon(var6.getChannelIcon());
      var5.setOnButtonClickListener(new o(this, var1));
      var5.setButtonText(var6.getAcceptLabelText());
      var5.setButtonTextColor(var6.getAcceptLabelColor());
      var5.setButtonBackgroundColor(var6.getAcceptLabelBackgroundColor());
      var5.setBackgroundRectangleColor(var6.getBackgroundColor());
   }
}
