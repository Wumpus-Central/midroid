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
      kotlin.jvm.internal.q.h(var1, "guildInviteDisabledView");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      super(var1, null);
      this.guildInviteDisabledView = var1;
      this.eventHandler = var2;
   }

   public fun bind(inviteAccessory: GuildInviteDisabledMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "inviteAccessory");
      val var3: GuildInviteDisabledEmbedImpl = var1.getInvite();
      val var2: GuildInviteDisabledView = this.guildInviteDisabledView;
      this.guildInviteDisabledView.setHeaderText(var3.getHeaderText());
      var2.setHelpIcon(
         var3.getHelpCenterArticleLabel(),
         var3.getHelpCenterArticleURL(),
         new Function1(this, var1) {
            final GuildInviteDisabledMessageAccessory $inviteAccessory;
            final GuildInviteDisabledViewHolder this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$inviteAccessory = var2;
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "it");
               ChatEventHandler.DefaultImpls.onLinkClicked-u7_MRrM$default(
                  this.this$0.getEventHandler(), this.$inviteAccessory.getMessageId-3Eiw7ao(), var1, null, 4, null
               );
            }
         }
      );
      var2.setHeaderColor(var3.getHeaderColor());
      var2.setTitleText(var3.getTitleText());
      var2.setTitleColor(var3.getTitleColor());
      var2.setGuildImage(var3.getGuildIcon(), var3.getThumbnailText(), var3.getThumbnailBackgroundColor());
      var2.setSubtitle(var3.getSubtitle(), var3.getGuildName());
      var2.setSubtitleColor(var3.getSubtitleColor());
      var2.setBackgroundRectangleColor(var3.getBackgroundColor());
   }
}
