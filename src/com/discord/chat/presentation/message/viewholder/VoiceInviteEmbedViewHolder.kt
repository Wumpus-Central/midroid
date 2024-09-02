package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.chat.presentation.message.view.VoiceInviteEmbedView
import kotlin.jvm.functions.Function3

public class VoiceInviteEmbedViewHolder(embedView: VoiceInviteEmbedView) : MessagePartViewHolder {
   private final val embedView: VoiceInviteEmbedView

   init {
      kotlin.jvm.internal.q.h(var1, "embedView");
      super(var1, null);
      this.embedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function3, var1: VoiceInviteEmbed, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onTapChannel");
      kotlin.jvm.internal.q.h(var1, "$embed");
      var0.invoke(var1.getChannelId(), var1.getGuildId(), null);
   }

   public fun bind(embed: VoiceInviteEmbed, onTapChannel: (String, String, String?) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "embed");
      kotlin.jvm.internal.q.h(var2, "onTapChannel");
      this.embedView.setContent(var1.getTitleText(), var1.getBodyText(), var1.getJoinText(), var1.getJoinIcon(), var1.getJoinDisabled(), new a0(var2, var1));
   }
}
