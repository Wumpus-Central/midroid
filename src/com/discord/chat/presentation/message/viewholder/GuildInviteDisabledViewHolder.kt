package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory
import com.discord.chat.presentation.message.view.GuildInviteDisabledView

public class GuildInviteDisabledViewHolder(guildInviteDisabledView: GuildInviteDisabledView, eventHandler: ChatEventHandler) : MessagePartViewHolder(var1) {
   private final val guildInviteDisabledView: GuildInviteDisabledView
   public final val eventHandler: ChatEventHandler

   init {
      this.guildInviteDisabledView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: GuildInviteDisabledViewHolder, var1: GuildInviteDisabledMessageAccessory, var2: java.lang.String): Unit {
      ChatEventHandler.DefaultImpls.onLinkClicked-u7_MRrM$default(var0.eventHandler, var1.getMessageId-3Eiw7ao(), var2, null, 4, null);
      return Unit.a;
   }

   public fun bind(inviteAccessory: GuildInviteDisabledMessageAccessory) {
      val var2: GuildInviteDisabledEmbedImpl = var1.getInvite();
      val var3: GuildInviteDisabledView = this.guildInviteDisabledView;
      this.guildInviteDisabledView.setHeaderText(var2.getHeaderText());
      var3.setHelpIcon(var2.getHelpCenterArticleLabel(), var2.getHelpCenterArticleURL(), new r(this, var1));
      var3.setHeaderColor(var2.getHeaderColor());
      var3.setTitleText(var2.getTitleText());
      var3.setTitleColor(var2.getTitleColor());
      var3.setGuildImage(var2.getGuildIcon(), var2.getThumbnailText(), var2.getThumbnailBackgroundColor());
      var3.setSubtitle(var2.getSubtitle(), var2.getGuildName());
      var3.setSubtitleColor(var2.getSubtitleColor());
      var3.setBackgroundRectangleColor(var2.getBackgroundColor());
   }
}
