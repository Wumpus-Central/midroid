package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory
import com.discord.chat.presentation.message.view.GuildInviteDisabledView

public class GuildInviteDisabledViewHolder(guildInviteDisabledView: GuildInviteDisabledView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val guildInviteDisabledView: GuildInviteDisabledView
   public final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.q.h(var1, "guildInviteDisabledView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.guildInviteDisabledView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: GuildInviteDisabledViewHolder, var1: GuildInviteDisabledMessageAccessory, var2: java.lang.String): Unit {
      kotlin.jvm.internal.q.h(var2, "it");
      ChatEventHandler.DefaultImpls.onLinkClicked-u7_MRrM$default(var0.eventHandler, var1.getMessageId-3Eiw7ao(), var2, null, 4, null);
      return Unit.a;
   }

   public fun bind(inviteAccessory: GuildInviteDisabledMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "inviteAccessory");
      val var3: GuildInviteDisabledEmbedImpl = var1.getInvite();
      val var2: GuildInviteDisabledView = this.guildInviteDisabledView;
      this.guildInviteDisabledView.setHeaderText(var3.getHeaderText());
      var2.setHelpIcon(var3.getHelpCenterArticleLabel(), var3.getHelpCenterArticleURL(), new q(this, var1));
      var2.setHeaderColor(var3.getHeaderColor());
      var2.setTitleText(var3.getTitleText());
      var2.setTitleColor(var3.getTitleColor());
      var2.setGuildImage(var3.getGuildIcon(), var3.getThumbnailText(), var3.getThumbnailBackgroundColor());
      var2.setSubtitle(var3.getSubtitle(), var3.getGuildName());
      var2.setSubtitleColor(var3.getSubtitleColor());
      var2.setBackgroundRectangleColor(var3.getBackgroundColor());
   }
}
