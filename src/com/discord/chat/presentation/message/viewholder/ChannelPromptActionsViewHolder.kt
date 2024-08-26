package com.discord.chat.presentation.message.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory
import com.discord.chat.presentation.message.view.ChannelPromptActionsView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function3

public class ChannelPromptActionsViewHolder(channelPromptActionsView: ChannelPromptActionsView) : MessagePartViewHolder {
   private final val channelPromptActionsView: ChannelPromptActionsView

   init {
      kotlin.jvm.internal.r.h(var1, "channelPromptActionsView");
      super(var1, null);
      this.channelPromptActionsView = var1;
      var1.setLayoutParams(new LayoutParams(-2, -2));
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function3, var1: ChannelPromptActionsAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$onTapChannelPromptButton");
      kotlin.jvm.internal.r.h(var1, "$accessory");
      var0.invoke(MessageId.box_impl(var1.getMessageId_3Eiw7ao()), ChannelId.box_impl(var1.getMessage().getChannelId_o4g7jtM()), "camera");
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: Function3, var1: ChannelPromptActionsAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$onTapChannelPromptButton");
      kotlin.jvm.internal.r.h(var1, "$accessory");
      var0.invoke(MessageId.box_impl(var1.getMessageId_3Eiw7ao()), ChannelId.box_impl(var1.getMessage().getChannelId_o4g7jtM()), "emoji");
   }

   @JvmStatic
   fun `bind$lambda$2`(var0: Function3, var1: ChannelPromptActionsAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$onTapChannelPromptButton");
      kotlin.jvm.internal.r.h(var1, "$accessory");
      var0.invoke(MessageId.box_impl(var1.getMessageId_3Eiw7ao()), ChannelId.box_impl(var1.getMessage().getChannelId_o4g7jtM()), "gaming-stats");
   }

   @JvmStatic
   fun `bind$lambda$3`(var0: Function3, var1: ChannelPromptActionsAccessory, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$onTapChannelPromptButton");
      kotlin.jvm.internal.r.h(var1, "$accessory");
      var0.invoke(MessageId.box_impl(var1.getMessageId_3Eiw7ao()), ChannelId.box_impl(var1.getMessage().getChannelId_o4g7jtM()), "gif");
   }

   public fun bind(accessory: ChannelPromptActionsAccessory, onTapChannelPromptButton: (MessageId, ChannelId, String) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "accessory");
      kotlin.jvm.internal.r.h(var2, "onTapChannelPromptButton");
      this.channelPromptActionsView.configure(var1.getMessage(), new f(var2, var1), new g(var2, var1), new h(var2, var1), new i(var2, var1));
   }
}
