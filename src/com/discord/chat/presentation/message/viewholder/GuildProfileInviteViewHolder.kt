package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildProfileInviteView

public class GuildProfileInviteViewHolder(guildProfileInviteView: GuildProfileInviteView) : MessagePartViewHolder {
   private final val guildProfileInviteView: GuildProfileInviteView

   init {
      kotlin.jvm.internal.q.h(var1, "guildProfileInviteView");
      super(var1, null);
      this.guildProfileInviteView = var1;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: Int, var3: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      kotlin.jvm.internal.q.h(var1, "$messageId");
      var0.onTapInviteEmbed-AFFcxXc(var1, var2, null, null);
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$1`(var0: ChatEventHandler, var1: java.lang.String, var2: Int, var3: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      kotlin.jvm.internal.q.h(var1, "$messageId");
      var0.onTapInviteEmbedAccept-ntcYbpo(var1, var2);
   }

   public fun bind(inviteAccessory: GuildProfileInviteMessageAccessory, eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.q.h(var1, "inviteAccessory");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      val var4: GuildProfileInviteEmbedImpl = var1.getInvite();
      val var5: java.lang.String = var1.getMessageId-3Eiw7ao();
      val var3: Int = var1.getCodedLinkIndex();
      val var6: GuildProfileInviteView = this.guildProfileInviteView;
      this.guildProfileInviteView.setBanner(var4.getInviteSplash(), var4.getBannerColor(), var4.getBannerColorSecondary());
      var6.setAvatar(var4.getThumbnailUrl(), var4.getThumbnailText());
      var6.setTitle(var4.getTitleText());
      var6.setGuildBadge(var4.getBadgeIconUrl());
      var6.setPresence(var4.getOnlineText(), var4.getMemberText());
      var6.setBody(var4.getBodyText(), var4.getHasProfileOverflow());
      var6.setAcceptButton(var4.getAcceptLabelText());
      var6.setClickListeners(new p(var2, var5, var3), new q(var2, var5, var3));
   }
}
