package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildProfileInviteView

public class GuildProfileInviteViewHolder(guildProfileInviteView: GuildProfileInviteView) : MessagePartViewHolder(var1) {
   private final val guildProfileInviteView: GuildProfileInviteView

   init {
      this.guildProfileInviteView = var1;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: Int, var3: View) {
      var0.onTapInviteEmbed-AFFcxXc(var1, var2, null, null);
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$1`(var0: ChatEventHandler, var1: java.lang.String, var2: Int, var3: View) {
      var0.onTapInviteEmbedAccept-ntcYbpo(var1, var2);
   }

   public fun bind(inviteAccessory: GuildProfileInviteMessageAccessory, eventHandler: ChatEventHandler) {
      val var7: GuildProfileInviteEmbedImpl = var1.getInvite();
      val var8: java.lang.String = var1.getMessageId-3Eiw7ao();
      val var3: Int = var1.getCodedLinkIndex();
      val var9: GuildProfileInviteView = this.guildProfileInviteView;
      this.guildProfileInviteView.setHeader(var7.getHeaderText());
      val var10: java.lang.String = var7.getInviteSplash();
      val var4: Int = var7.getBannerColor();
      val var5: Int = var7.getBannerColorSecondary();
      val var6: Boolean;
      if (var7.getHeaderText() == null) {
         var6 = true;
      } else {
         var6 = false;
      }

      var9.setBanner(var10, var4, var5, var6);
      var9.setAvatar(var7.getThumbnailUrl(), var7.getThumbnailText());
      var9.setTitle(var7.getTitleText());
      var9.setGuildBadge(var7.getBadgeIconUrl());
      var9.setPresence(var7.getOnlineText(), var7.getMemberText());
      var9.setEstablished(var7.getEstablishedText());
      var9.setBody(var7.getBodyText(), var7.getHasProfileOverflow());
      var9.setAcceptButton(var7.getAcceptLabelText(), var7.getAcceptLabelBackgroundColor());
      var9.setClickListeners(new t(var2, var8, var3), new u(var2, var8, var3));
   }
}
