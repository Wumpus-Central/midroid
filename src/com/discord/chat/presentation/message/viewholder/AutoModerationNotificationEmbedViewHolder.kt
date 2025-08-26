package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory
import com.discord.chat.presentation.message.view.AutoModerationNotificationEmbedView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function2

public class AutoModerationNotificationEmbedViewHolder(notificationEmbedView: AutoModerationNotificationEmbedView) : MessagePartViewHolder(var1) {
   private final val notificationEmbedView: AutoModerationNotificationEmbedView

   init {
      this.notificationEmbedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function2, var1: java.lang.String, var2: Long, var4: View) {
      var0.invoke(MessageId.box-impl(var1), ChannelId.box-impl(var2));
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: Function2, var1: java.lang.String, var2: Long, var4: View) {
      var0.invoke(MessageId.box-impl(var1), ChannelId.box-impl(var2));
   }

   public fun bind(
      notificationEmbedAccessory: AutoModerationNotificationEmbedAccessory,
      onTapAutoModerationActions: (MessageId, ChannelId) -> Unit,
      onTapAutoModerationFeedback: (MessageId, ChannelId) -> Unit
   ) {
      val var4: Long = var1.getMessage().getChannelId-o4g7jtM();
      val var6: java.lang.String = var1.getMessage().getId-3Eiw7ao();
      this.notificationEmbedView.configure(var1.getModerationContext(), new d(var2, var6, var4), new e(var3, var6, var4));
   }
}
