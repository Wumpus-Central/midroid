package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory
import com.discord.chat.presentation.message.view.FlaggedMessageActionBarView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function2

public class FlaggedMessageActionBarViewHolder(actionBarView: FlaggedMessageActionBarView) : MessagePartViewHolder(var1) {
   private final val actionBarView: FlaggedMessageActionBarView

   init {
      this.actionBarView = var1;
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
      messageActionBarAccessory: FlaggedMessageActionBarAccessory,
      onTapAutoModerationActions: (MessageId, ChannelId) -> Unit,
      onTapAutoModerationFeedback: (MessageId, ChannelId) -> Unit
   ) {
      val var6: AutoModerationContext = var1.getAutoModerationContext();
      val var4: Long = var1.getMessage().getChannelId-o4g7jtM();
      val var7: java.lang.String = var1.getMessage().getId-3Eiw7ao();
      this.actionBarView.setActions(var6, new m(var2, var7, var4), new n(var3, var7, var4));
   }
}
