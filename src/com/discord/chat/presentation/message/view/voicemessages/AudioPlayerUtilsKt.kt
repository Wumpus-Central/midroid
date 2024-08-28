package com.discord.chat.presentation.message.view.voicemessages

import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.r

internal const val ANIMATION_LENGTH_MS: Int = 500
internal const val EMIT_EVENT_FREQUENCY_MS: Long = 50L

internal fun AudioAttachmentMessageAccessory.toAudioSource(): AudioSource {
   r.h(var0, "<this>");
   return new AudioPlayerManager.AudioSource(
      ChannelId.box-impl(var0.getChannelId-o4g7jtM()), var0.getMessageId-3Eiw7ao(), var0.getAttachment().getUrl(), var0.getAttachmentIndex(), null
   );
}
