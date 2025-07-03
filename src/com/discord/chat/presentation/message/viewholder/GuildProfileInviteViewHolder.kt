package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory
import com.discord.chat.presentation.message.view.GuildProfileInviteView

public class GuildProfileInviteViewHolder(guildProfileInviteView: GuildProfileInviteView) : MessagePartViewHolder {
   private final val guildProfileInviteView: GuildProfileInviteView

   init {
      kotlin.jvm.internal.r.h(var1, "guildProfileInviteView");
      super(var1, null);
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
      kotlin.jvm.internal.r.h(var1, "inviteAccessory");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      val var7: GuildProfileInviteEmbedImpl = var1.getInvite();
      val var8: java.lang.String = var1.getMessageId-3Eiw7ao();
      val var5: Int = var1.getCodedLinkIndex();
      val var10: GuildProfileInviteView = this.guildProfileInviteView;
      this.guildProfileInviteView.setHeader(var7.getHeaderText());
      val var9: java.lang.String = var7.getInviteSplash();
      val var3: Int = var7.getBannerColor();
      val var4: Int = var7.getBannerColorSecondary();
      val var6: Boolean;
      if (var7.getHeaderText() == null) {
         var6 = true;
      } else {
         var6 = false;
      }

      var10.setBanner(var9, var3, var4, var6);
      var10.setAvatar(var7.getThumbnailUrl(), var7.getThumbnailText());
      var10.setTitle(var7.getTitleText());
      var10.setGuildBadge(var7.getBadgeIconUrl());
      var10.setPresence(var7.getOnlineText(), var7.getMemberText());
      var10.setEstablished(var7.getEstablishedText());
      var10.setBody(var7.getBodyText(), var7.getHasProfileOverflow());
      var10.setAcceptButton(var7.getAcceptLabelText(), var7.getAcceptLabelBackgroundColor());
      var10.setClickListeners(new t(var2, var8, var5), new u(var2, var8, var5));
   }
}
