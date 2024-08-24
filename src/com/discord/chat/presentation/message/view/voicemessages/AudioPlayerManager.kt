package com.discord.chat.presentation.message.view.voicemessages

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioFocusRequest
import android.media.AudioManager
import android.media.AudioAttributes.Builder
import android.media.AudioManager.OnAudioFocusChangeListener
import android.os.Build.VERSION
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.media_player.MediaPlayer.Event
import com.discord.media_player.MediaPlayer.Factory
import com.discord.media_player.MediaPlayer.Event.PlaybackEnded
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import java.util.LinkedHashMap
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import nk.u

public object AudioPlayerManager {
   private final val _currentPlayerSourceFlow: MutableStateFlow<com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?>
   private final lateinit var audioManager: AudioManager

   private final val currentPlayerSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?
      private final get() {
         return _currentPlayerSourceFlow.getValue() as AudioPlayerManager.AudioSource;
      }


   public final val currentPlayerSourceFlow: Flow<com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?>
   private final val currentProgressMap: MutableMap<
      com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource,
      com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress
   > = new LinkedHashMap()
   private final val focusListener: OnAudioFocusChangeListener = new f()
   private final lateinit var focusRequest: AudioFocusRequest
   private final var mediaPlayer: MediaPlayer?
   private final var mediaPlayerState: Event?
   private final val playbackAttributes: AudioAttributes = new Builder().setUsage(2).setContentType(1).build()
   private final var wasPlayingBeforePause: Boolean

   @JvmStatic
   fun {
      val var0: MutableStateFlow = u.a(null);
      _currentPlayerSourceFlow = var0;
      currentPlayerSourceFlow = var0;
   }

   private fun abandonAudioFocus() {
      var var2: AudioManager = null;
      var var3: AudioFocusRequest = null;
      if (VERSION.SDK_INT >= 26) {
         var2 = audioManager;
         if (audioManager == null) {
            r.y("audioManager");
            var2 = null;
         }

         if (focusRequest == null) {
            r.y("focusRequest");
         } else {
            var3 = focusRequest;
         }

         d.a(var2, var3);
      } else {
         if (audioManager == null) {
            r.y("audioManager");
         } else {
            var2 = audioManager;
         }

         var2.abandonAudioFocus(focusListener);
      }
   }

   @JvmStatic
   fun `focusListener$lambda$0`(var0: Int) {
      if (var0 == 1) {
         INSTANCE.maybePlayCurrentPlayer();
      } else {
         INSTANCE.pauseCurrentPlayer(false);
      }
   }

   private fun maybeCreateDuration(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource, durationMs: Long): com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress? {
      val var5: java.util.Map = currentProgressMap;
      if (currentProgressMap.get(var1) != null) {
         return null;
      } else {
         val var4: AudioPlayerManager.CurrentProgress = new AudioPlayerManager.CurrentProgress(0L, var2);
         var5.put(var1, var4);
         return var4;
      }
   }

   private fun pause() {
      if (mediaPlayer != null) {
         mediaPlayer.pause();
      }
   }

   private fun play() {
      if (this.requestAudioFocus() && mediaPlayer != null) {
         mediaPlayer.play();
      }
   }

   private fun requestAudioFocus(): Boolean {
      var var3: AudioManager = null;
      var var4: AudioFocusRequest = null;
      val var6: Int;
      if (VERSION.SDK_INT >= 26) {
         var3 = audioManager;
         if (audioManager == null) {
            r.y("audioManager");
            var3 = null;
         }

         if (focusRequest == null) {
            r.y("focusRequest");
         } else {
            var4 = focusRequest;
         }

         var6 = e.a(var3, var4);
      } else {
         if (audioManager == null) {
            r.y("audioManager");
         } else {
            var3 = audioManager;
         }

         var6 = var3.requestAudioFocus(focusListener, 3, 4);
      }

      var var2: Boolean = true;
      if (var6 != 1) {
         var2 = false;
      }

      return var2;
   }

   public fun getCurrentProgress(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?): com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress? {
      return currentProgressMap.get(var1);
   }

   public fun getPlayer(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?): MediaPlayer? {
      val var2: MediaPlayer;
      if (this.hasCurrentPlayer(var1)) {
         var2 = mediaPlayer;
      } else {
         var2 = null;
      }

      return var2;
   }

   public fun getState(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?): Event? {
      val var2: Event;
      if (this.hasCurrentPlayer(var1)) {
         var2 = mediaPlayerState;
      } else {
         var2 = null;
      }

      return var2;
   }

   public fun hasCurrentPlayer(audioSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?): Boolean {
      val var2: Boolean;
      if (var1 != null && r.c(this.getCurrentPlayerSource(), var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public fun init(context: Context) {
      r.h(var1, "context");
      var var2: Any = var1.getSystemService("audio");
      r.f(var2, "null cannot be cast to non-null type android.media.AudioManager");
      audioManager = var2 as AudioManager;
      if (VERSION.SDK_INT >= 26) {
         var2 = c.a(b.a(a.a(new android.media.AudioFocusRequest.Builder(4), focusListener), playbackAttributes));
         r.g(var2, "Builder(AudioManager.AUD…\n                .build()");
         focusRequest = (AudioFocusRequest)var2;
      }
   }

   public fun maybePlayCurrentPlayer() {
      if (wasPlayingBeforePause) {
         wasPlayingBeforePause = false;
         this.play();
      }
   }

   public fun pause(audioSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?) {
      if (this.hasCurrentPlayer(var1)) {
         this.pause();
      }
   }

   public fun pauseCurrentPlayer(storePauseState: Boolean) {
      if (var1) {
         var1 = false;
         if (mediaPlayer != null) {
            var1 = false;
            if (mediaPlayer.shouldPlay()) {
               var1 = true;
            }
         }

         wasPlayingBeforePause = var1;
      }

      this.pause();
      this.storeDuration(this.getCurrentPlayerSource());
   }

   public fun play(audioSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?) {
      if (this.hasCurrentPlayer(var1)) {
         this.play();
      }
   }

   public fun releasePlayer(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?) {
      if (this.hasCurrentPlayer(var1)) {
         _currentPlayerSourceFlow.setValue(null);
         if (mediaPlayer != null) {
            mediaPlayer.reset();
         }

         mediaPlayerState = null;
         wasPlayingBeforePause = false;
      }
   }

   public fun setCurrentProgress(
      source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource,
      progress: Float,
      durationMs: Long
   ) {
      r.h(var1, "source");
      val var7: java.util.Map = currentProgressMap;
      var var6: AudioPlayerManager.CurrentProgress = currentProgressMap.get(var1);
      var var5: AudioPlayerManager.CurrentProgress = var6;
      if (var6 == null) {
         var6 = this.maybeCreateDuration(var1, var3);
         var5 = var6;
         if (var6 == null) {
            return;
         }
      }

      var7.put(var1, AudioPlayerManager.CurrentProgress.copy$default(var5, (long)(var2 * (float)var3), 0L, 2, null));
   }

   public fun setupPlayer(
      context: Context,
      source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource,
      durationMs: Long,
      onStateChanged: (Event) -> Unit
   ) {
      r.h(var1, "context");
      r.h(var2, "source");
      r.h(var5, "onStateChanged");
      if (mediaPlayer == null) {
         mediaPlayer = Factory.create$default(MediaPlayer.Factory, var1, null, 2, null);
      }

      if (!r.c(var2, this.getCurrentPlayerSource())) {
         this.storeDuration(this.getCurrentPlayerSource());
         mediaPlayerState = null;
         val var12: MutableStateFlow = _currentPlayerSourceFlow;
         _currentPlayerSourceFlow.setValue(var2);
         this.maybeCreateDuration(var2, var3);
         if (this.requestAudioFocus()) {
            var12.setValue(var2);
            val var13: MediaPlayer = mediaPlayer;
            r.e(mediaPlayer);
            val var9: ChannelId = var2.getChannelId-qMVnFVQ();
            val var6: java.lang.String = var2.getMessageId-3Eiw7ao();
            val var10: Int = var2.getIndex();
            val var8: java.lang.String = var2.getUrl();
            val var7: java.lang.String = var2.getUrl();
            val var11: StringBuilder = new StringBuilder();
            var11.append("audio attachment: ");
            var11.append(var7);
            val var17: MediaSource = new MediaSource(var8, null, null, null, var11.toString(), MediaType.AUDIO, false, var9, var6, var10, null, 1102, null);
            val var16: AudioPlayerManager.CurrentProgress = currentProgressMap.get(var2);
            if (var16 != null) {
               var3 = var16.getCurrentProgress();
            } else {
               var3 = 0L;
            }

            MediaPlayer.preparePlayer$default(var13, var17, true, false, var3, null, null, 52, null);
         }
      }

      val var14: MediaPlayer = mediaPlayer;
      r.e(mediaPlayer);
      var14.setEventListener(new Function1<Event, Unit>(var2, var5) {
         final Function1<Event, Unit> $onStateChanged;
         final AudioPlayerManager.AudioSource $source;

         {
            super(1);
            this.$source = var1;
            this.$onStateChanged = var2;
         }

         public final void invoke(Event var1) {
            r.h(var1, "event");
            if (r.c(var1, PlaybackEnded.INSTANCE)) {
               AudioPlayerManager.access$getCurrentProgressMap$p().remove(this.$source);
               AudioPlayerManager.access$abandonAudioFocus(AudioPlayerManager.INSTANCE);
            } else {
               AudioPlayerManager.INSTANCE.storeDuration(this.$source);
            }

            if (!r.c(AudioPlayerManager.access$getMediaPlayerState$p(), var1)) {
               AudioPlayerManager.access$setMediaPlayerState$p(var1);
               this.$onStateChanged.invoke(var1);
            }
         }
      });
      var14.setVolume(1.0F);
   }

   public fun storeDuration(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?) {
      if (this.hasCurrentPlayer(var1)) {
         val var3: MediaPlayer = mediaPlayer;
         if (mediaPlayer != null) {
            val var2: java.util.Map = currentProgressMap;
            r.e(var1);
            val var4: AudioPlayerManager.CurrentProgress = var2.get(var1) as AudioPlayerManager.CurrentProgress;
            if (var4 != null) {
               val var5: AudioPlayerManager.CurrentProgress = AudioPlayerManager.CurrentProgress.copy$default(var4, var3.currentPositionMs(), 0L, 2, null);
               if (var5 != null) {
                  var2.put(var1, var5);
               }
            }
         }
      }
   }

   public data class AudioSource(channelId: ChannelId?, messageId: MessageId, url: String, index: Int? = ...) : AudioPlayerManager.AudioSource(
         var1, var2, var3, var4
      ) {
      public final val channelId: ChannelId?
      public final val index: Int?
      public final val messageId: MessageId
      public final val url: String

      fun AudioSource(var1: ChannelId, var2: java.lang.String, var3: java.lang.String, var4: Int) {
         this.channelId = var1;
         this.messageId = var2;
         this.url = var3;
         this.index = var4;
      }

      public operator fun component1(): ChannelId? {
         return this.channelId;
      }

      public operator fun component2(): MessageId {
         return this.messageId;
      }

      public operator fun component3(): String {
         return this.url;
      }

      public operator fun component4(): Int? {
         return this.index;
      }

      public fun copy(channelId: ChannelId? = ..., messageId: MessageId = ..., url: String = ..., index: Int? = ...): com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource {
         r.h(var2, "messageId");
         r.h(var3, "url");
         return new AudioPlayerManager.AudioSource(var1, var2, var3, var4, null);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is AudioPlayerManager.AudioSource) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.channelId, var1.channelId)) {
               return false;
            } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
               return false;
            } else if (!r.c(this.url, var1.url)) {
               return false;
            } else {
               return r.c(this.index, var1.index);
            }
         }
      }

      public override fun hashCode(): Int {
         var var2: Int = 0;
         val var1: Int;
         if (this.channelId == null) {
            var1 = 0;
         } else {
            var1 = ChannelId.hashCode-impl(this.channelId.unbox-impl());
         }

         val var3: Int = MessageId.hashCode-impl(this.messageId);
         val var4: Int = this.url.hashCode();
         if (this.index != null) {
            var2 = this.index.hashCode();
         }

         return ((var1 * 31 + var3) * 31 + var4) * 31 + var2;
      }

      public override fun toString(): String {
         val var4: ChannelId = this.channelId;
         val var1: java.lang.String = MessageId.toString-impl(this.messageId);
         val var2: java.lang.String = this.url;
         val var3: Int = this.index;
         val var5: StringBuilder = new StringBuilder();
         var5.append("AudioSource(channelId=");
         var5.append(var4);
         var5.append(", messageId=");
         var5.append(var1);
         var5.append(", url=");
         var5.append(var2);
         var5.append(", index=");
         var5.append(var3);
         var5.append(")");
         return var5.toString();
      }
   }

   public data class CurrentProgress(currentProgress: Long, durationMs: Long) {
      public final val currentProgress: Long
      public final val currentProgressPercentage: Float
      public final val durationMs: Long

      init {
         this.currentProgress = var1;
         this.durationMs = var3;
         this.currentProgressPercentage = (float)var1 / (float)var3;
      }

      public operator fun component1(): Long {
         return this.currentProgress;
      }

      public operator fun component2(): Long {
         return this.durationMs;
      }

      public fun copy(currentProgress: Long = var0.currentProgress, durationMs: Long = var0.durationMs): com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress {
         return new AudioPlayerManager.CurrentProgress(var1, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is AudioPlayerManager.CurrentProgress) {
            return false;
         } else {
            var1 = var1;
            if (this.currentProgress != var1.currentProgress) {
               return false;
            } else {
               return this.durationMs == var1.durationMs;
            }
         }
      }

      public override fun hashCode(): Int {
         return java.lang.Long.hashCode(this.currentProgress) * 31 + java.lang.Long.hashCode(this.durationMs);
      }

      public override fun toString(): String {
         val var3: Long = this.currentProgress;
         val var1: Long = this.durationMs;
         val var5: StringBuilder = new StringBuilder();
         var5.append("CurrentProgress(currentProgress=");
         var5.append(var3);
         var5.append(", durationMs=");
         var5.append(var1);
         var5.append(")");
         return var5.toString();
      }
   }
}
