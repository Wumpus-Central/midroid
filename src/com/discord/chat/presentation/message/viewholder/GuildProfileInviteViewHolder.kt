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
      val var8: GuildProfileInviteEmbedImpl = var1.getInvite();
      val var7: java.lang.String = var1.getMessageId-3Eiw7ao();
      val var4: Int = var1.getCodedLinkIndex();
      val var10: GuildProfileInviteView = this.guildProfileInviteView;
      this.guildProfileInviteView.setHeader(var8.getHeaderText());
      val var9: java.lang.String = var8.getInviteSplash();
      val var3: Int = var8.getBannerColor();
      val var5: Int = var8.getBannerColorSecondary();
      val var6: Boolean;
      if (var8.getHeaderText() == null) {
         var6 = true;
      } else {
         var6 = false;
      }

      var10.setBanner(var9, var3, var5, var6);
      var10.setAvatar(var8.getThumbnailUrl(), var8.getThumbnailText());
      var10.setTitle(var8.getTitleText());
      var10.setGuildBadge(var8.getBadgeIconUrl());
      var10.setPresence(var8.getOnlineText(), var8.getMemberText());
      var10.setEstablished(var8.getEstablishedText());
      var10.setBody(var8.getBodyText(), var8.getHasProfileOverflow());
      var10.setAcceptButton(var8.getAcceptLabelText(), var8.getAcceptLabelBackgroundColor());
      var10.setClickListeners(new u(var2, var7, var4), new v(var2, var7, var4));
   }
}
