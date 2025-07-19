package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildInviteView

public class GuildInviteViewHolder(guildInviteView: GuildInviteView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val guildInviteView: GuildInviteView
   public final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.r.h(var1, "guildInviteView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.guildInviteView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$0`(var0: GuildInviteViewHolder, var1: GuildInviteMessageAccessory, var2: View) {
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), null, null);
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$1`(var0: GuildInviteViewHolder, var1: GuildInviteMessageAccessory, var2: View) {
      var0.eventHandler.onTapInviteEmbedAccept-ntcYbpo(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex());
   }

   public fun bind(inviteAccessory: GuildInviteMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "inviteAccessory");
      val var3: GuildInviteEmbedImpl = var1.getInvite();
      val var4: GuildInviteView = this.guildInviteView;
      var var2: java.lang.String = var3.getSubtitle();
      if (var2 != null && !kotlin.text.h.c0(var2)) {
         var2 = var3.getSubtitle();
      } else {
         var2 = var3.getChannelIcon();
         if (var2 != null && !kotlin.text.h.c0(var2)) {
            var2 = var3.getChannelName();
         } else {
            var2 = null;
         }
      }

      var4.setInviteSplash(var3.getInviteSplash());
      var4.setHeaderText(var3.getHeaderText());
      var4.setHeaderColor(var3.getHeaderColor());
      var4.setTitleText(var3.getTitleText());
      var4.setGuildBadge(var3.getBadgeIconUrl());
      var4.setTitleColor(var3.getTitleColor());
      var4.setPresence(var3.getOnlineText(), var3.getMemberText());
      var4.setGuildImage(var3.getThumbnailUrl(), var3.getThumbnailText(), var3.getThumbnailBackgroundColor(), var3.getThumbnailCornerRadius());
      var4.setSubtitle(var2);
      var4.setSubtitleColor(var3.getSubtitleColor());
      var4.setSubtitleIcon(var3.getChannelIcon());
      var4.setClickListeners(var3.getCanBeAccepted(), new r(this, var1), new s(this, var1));
      var4.setButtonText(var3.getAcceptLabelText());
      var4.setButtonTextColor(var3.getAcceptLabelColor());
      var4.setButtonBackgroundColor(var3.getAcceptLabelBackgroundColor());
      var4.setBackgroundRectangleColor(var3.getBackgroundColor());
   }
}
