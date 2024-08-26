package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory
import com.discord.chat.presentation.message.view.GuildInviteDisabledView
import kotlin.jvm.functions.Function1

public class GuildInviteDisabledViewHolder(guildInviteDisabledView: GuildInviteDisabledView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   public final val eventHandler: ChatEventHandler
   private final val guildInviteDisabledView: GuildInviteDisabledView

   init {
      kotlin.jvm.internal.r.h(var1, "guildInviteDisabledView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.guildInviteDisabledView = var1;
      this.eventHandler = var2;
   }

   public fun bind(inviteAccessory: GuildInviteDisabledMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "inviteAccessory");
      val var2: GuildInviteDisabledEmbedImpl = var1.getInvite();
      val var3: GuildInviteDisabledView = this.guildInviteDisabledView;
      this.guildInviteDisabledView.setHeaderText(var2.getHeaderText());
      var3.setHelpIcon(
         var2.getHelpCenterArticleLabel(),
         var2.getHelpCenterArticleURL(),
         new Function1<java.lang.String, Unit>(this, var1) {
            final GuildInviteDisabledMessageAccessory $inviteAccessory;
            final GuildInviteDisabledViewHolder this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$inviteAccessory = var2;
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "it");
               ChatEventHandler.DefaultImpls.onLinkClicked_u7_MRrM$default(
                  this.this$0.getEventHandler(), this.$inviteAccessory.getMessageId_3Eiw7ao(), var1, null, 4, null
               );
            }
         }
      );
      var3.setHeaderColor(var2.getHeaderColor());
      var3.setTitleText(var2.getTitleText());
      var3.setTitleColor(var2.getTitleColor());
      var3.setGuildImage(var2.getGuildIcon(), var2.getThumbnailText(), var2.getThumbnailBackgroundColor());
      var3.setSubtitle(var2.getSubtitle(), var2.getGuildName());
      var3.setSubtitleColor(var2.getSubtitleColor());
      var3.setBackgroundRectangleColor(var2.getBackgroundColor());
   }
}
