package com.discord.chat.presentation.message.view.voicemessages

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaPlayer.Event

public data class AudioPlayerViewState(accessory: AudioAttachmentMessageAccessory? = null, attached: Boolean = false) {
   public final val accessory: AudioAttachmentMessageAccessory?
   public final val attached: Boolean
   public final val audioSource: AudioSource?

   public final val sourceUrl: String?
      public final get() {
         if (this.accessory != null) {
            val var2: Attachment = this.accessory.getAttachment();
            if (var2 != null) {
               return var2.getUrl();
            }
         }

         return null;
      }


   fun AudioPlayerViewState() {
      this(null, false, 3, null);
   }

   init {
      this.accessory = var1;
      this.attached = var2;
      val var3: AudioPlayerManager.AudioSource;
      if (var1 != null) {
         var3 = AudioPlayerUtilsKt.toAudioSource(var1);
      } else {
         var3 = null;
      }

      this.audioSource = var3;
   }

   public operator fun component1(): AudioAttachmentMessageAccessory? {
      return this.accessory;
   }

   public operator fun component2(): Boolean {
      return this.attached;
   }

   public fun copy(accessory: AudioAttachmentMessageAccessory? = var0.accessory, attached: Boolean = var0.attached): AudioPlayerViewState {
      return new AudioPlayerViewState(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioPlayerViewState) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.r.c(this.accessory, var1.accessory)) {
            return false;
         } else {
            return this.attached == var1.attached;
         }
      }
   }

   internal fun getCurrentProgress(): CurrentProgress? {
      return AudioPlayerManager.INSTANCE.getCurrentProgress(this.audioSource);
   }

   internal fun getMediaState(): Event? {
      return AudioPlayerManager.INSTANCE.getState(this.audioSource);
   }

   internal fun getPlayer(): MediaPlayer? {
      return AudioPlayerManager.INSTANCE.getPlayer(this.audioSource);
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.accessory == null) {
         var1 = 0;
      } else {
         var1 = this.accessory.hashCode();
      }

      var var2: Byte = this.attached;
      if (this.attached != 0) {
         var2 = 1;
      }

      return var1 * 31 + var2;
   }

   internal fun isPlaying(wasPlayingBeforeBeingPaused: Boolean): Boolean {
      var var3: Boolean = true;
      if (!var1) {
         val var5: MediaPlayer = this.getPlayer$chat_release();
         val var2: Boolean;
         if (var5 != null && (var5.shouldPlay() || var5.isPlaying()) && !var5.hasError()) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2) {
            var3 = true;
         } else {
            var3 = false;
         }
      }

      return var3;
   }

   internal fun pause() {
      AudioPlayerManager.INSTANCE.pause(this.audioSource);
   }

   internal fun play() {
      AudioPlayerManager.INSTANCE.play(this.audioSource);
   }

   internal fun releasePlayer() {
      AudioPlayerManager.INSTANCE.releasePlayer(this.audioSource);
   }

   internal fun setCurrentProgress(progress: Float, durationMs: Long): Unit? {
      val var5: Unit;
      if (this.audioSource != null) {
         AudioPlayerManager.INSTANCE.setCurrentProgress(this.audioSource, var1, var2);
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun shouldEmitDuration(): Boolean {
      val var3: MediaPlayer = this.getPlayer$chat_release();
      var var1: Boolean = false;
      if (var3 != null) {
         var1 = false;
         if (var3.shouldPlay()) {
            var1 = true;
         }
      }

      return var1;
   }

   internal fun storeDuration() {
      AudioPlayerManager.INSTANCE.storeDuration(this.audioSource);
   }

   public override fun toString(): String {
      val var2: AudioAttachmentMessageAccessory = this.accessory;
      val var1: Boolean = this.attached;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AudioPlayerViewState(accessory=");
      var3.append(var2);
      var3.append(", attached=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
