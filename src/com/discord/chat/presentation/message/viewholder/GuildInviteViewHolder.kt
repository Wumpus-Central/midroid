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
      kotlin.jvm.internal.q.h(var1, "guildInviteView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.guildInviteView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: GuildInviteViewHolder, var1: GuildInviteMessageAccessory, var2: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "$inviteAccessory");
      var0.eventHandler.onTapInviteEmbed-AFFcxXc(var1.getMessageId-3Eiw7ao(), var1.getCodedLinkIndex(), null, null);
   }

   public fun bind(inviteAccessory: GuildInviteMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "inviteAccessory");
      val var4: GuildInviteEmbedImpl = var1.getInvite();
      val var3: GuildInviteView = this.guildInviteView;
      var var2: java.lang.String = var4.getSubtitle();
      if (var2 != null && !kotlin.text.h.x(var2)) {
         var2 = var4.getSubtitle();
      } else {
         var2 = var4.getChannelIcon();
         if (var2 != null && !kotlin.text.h.x(var2)) {
            var2 = var4.getChannelName();
         } else {
            var2 = null;
         }
      }

      var3.setInviteSplash(var4.getInviteSplash());
      var3.setHeaderText(var4.getHeaderText());
      var3.setHeaderColor(var4.getHeaderColor());
      var3.setTitleText(var4.getTitleText());
      var3.setTitleColor(var4.getTitleColor());
      var3.setPresence(var4.getOnlineText(), var4.getMemberText());
      var3.setGuildImage(var4.getThumbnailUrl(), var4.getThumbnailText(), var4.getThumbnailBackgroundColor());
      var3.setSubtitle(var2);
      var3.setSubtitleColor(var4.getSubtitleColor());
      var3.setSubtitleIcon(var4.getChannelIcon());
      var3.setOnButtonClickListener(new p(this, var1));
      var3.setButtonText(var4.getAcceptLabelText());
      var3.setButtonTextColor(var4.getAcceptLabelColor());
      var3.setButtonBackgroundColor(var4.getAcceptLabelBackgroundColor());
      var3.setBackgroundRectangleColor(var4.getBackgroundColor());
   }
}
