package com.discord.chat.presentation.message.view.voicemessages

import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.primitives.ChannelId

internal const val ANIMATION_LENGTH_MS: Int = 500
internal const val EMIT_EVENT_FREQUENCY_MS: Long = 50L

internal fun AudioAttachmentMessageAccessory.toAudioSource(): AudioSource {
   kotlin.jvm.internal.q.h(var0, "<this>");
   return new AudioPlayerManager.AudioSource(
      ChannelId.box-impl(var0.getChannelId-o4g7jtM()), var0.getMessageId-3Eiw7ao(), var0.getAttachment().getUrl(), var0.getAttachmentIndex(), null
   );
}

internal fun AudioSource.toMediaSource(featureTag: String? = null): MediaSource {
   kotlin.jvm.internal.q.h(var0, "<this>");
   val var3: ChannelId = var0.getChannelId-qMVnFVQ();
   val var2: java.lang.String = var0.getMessageId-3Eiw7ao();
   val var5: Int = var0.getIndex();
   val var4: java.lang.String = var0.getUrl();
   if (var1 == null) {
      val var6: java.lang.String = var0.getUrl();
      val var7: StringBuilder = new StringBuilder();
      var7.append("audio attachment: ");
      var7.append(var6);
      var1 = var7.toString();
   }

   return new MediaSource(var4, null, null, null, var1, MediaType.AUDIO, false, var3, var2, var5, null, 1102, null);
}

@JvmSynthetic
fun `toMediaSource$default`(var0: AudioPlayerManager.AudioSource, var1: java.lang.String, var2: Int, var3: Any): MediaSource {
   if ((var2 and 1) != 0) {
      var1 = null;
   }

   return toMediaSource(var0, var1);
}
