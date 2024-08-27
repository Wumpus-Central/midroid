package com.discord.chat.presentation.message.view.voicemessages

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaPlayer.Event
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class AudioPlayerViewState(messageId: MessageId? = ..., sourceUrl: String? = ..., attached: Boolean = ...) : AudioPlayerViewState(var1, var2, var3) {
   public final val attached: Boolean
   public final val audioSource: AudioSource?
   public final val messageId: MessageId?
   public final val sourceUrl: String?

   fun AudioPlayerViewState(var1: java.lang.String, var2: java.lang.String, var3: Boolean) {
      this.messageId = var1;
      this.sourceUrl = var2;
      this.attached = var3;
      val var4: AudioPlayerManager.AudioSource;
      if (var1 != null && var2 != null) {
         var4 = new AudioPlayerManager.AudioSource(var1, var2, null, 4, null);
      } else {
         var4 = null;
      }

      this.audioSource = var4;
   }

   public operator fun component1(): MessageId? {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.sourceUrl;
   }

   public operator fun component3(): Boolean {
      return this.attached;
   }

   public fun copy(messageId: MessageId? = ..., sourceUrl: String? = ..., attached: Boolean = ...): AudioPlayerViewState {
      return new AudioPlayerViewState(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioPlayerViewState) {
         return false;
      } else {
         var var2: Boolean;
         var var3: AudioPlayerViewState;
         label32: {
            var3 = var1 as AudioPlayerViewState;
            if (this.messageId == null) {
               if (var3.messageId == null) {
                  var2 = true;
                  break label32;
               }
            } else if (var3.messageId != null) {
               var2 = MessageId.equals-impl0(this.messageId, var3.messageId);
               break label32;
            }

            var2 = false;
         }

         if (!var2) {
            return false;
         } else if (!r.c(this.sourceUrl, var3.sourceUrl)) {
            return false;
         } else {
            return this.attached == var3.attached;
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
      var var2: Int = 0;
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.messageId);
      }

      if (this.sourceUrl != null) {
         var2 = this.sourceUrl.hashCode();
      }

      var var3: Byte = this.attached;
      if (this.attached != 0) {
         var3 = 1;
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   internal fun isPlaying(wasPlayingBeforeBeingPaused: Boolean): Boolean {
      val var5: MediaPlayer = this.getPlayer$chat_release();
      val var2: Boolean;
      if (var5 != null && (var5.shouldPlay() || var5.isPlaying()) && !var5.hasError()) {
         var2 = true;
      } else {
         var2 = false;
      }

      var var3: Boolean = true;
      if (!var2) {
         if (var1) {
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
      val var5: java.lang.String;
      if (this.messageId == null) {
         var5 = "null";
      } else {
         var5 = MessageId.toString-impl(this.messageId);
      }

      val var4: java.lang.String = this.sourceUrl;
      val var1: Boolean = this.attached;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AudioPlayerViewState(messageId=");
      var3.append(var5);
      var3.append(", sourceUrl=");
      var3.append(var4);
      var3.append(", attached=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
