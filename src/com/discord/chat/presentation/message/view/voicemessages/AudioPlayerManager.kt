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
import com.discord.media_player.MediaPlayer.Event
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import java.util.LinkedHashMap
import kotlin.jvm.functions.Function1
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

public object AudioPlayerManager {
   private final lateinit var audioManager: AudioManager
   private final val focusListener: OnAudioFocusChangeListener = new g()
   private final val playbackAttributes: AudioAttributes = new Builder().setUsage(2).setContentType(1).build()
   private final lateinit var focusRequest: AudioFocusRequest
   private final val currentProgressMap: MutableMap<
      com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource,
      com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress
   > = new LinkedHashMap()
   private final var mediaPlayerState: Event?
   private final var mediaPlayer: MediaPlayer?
   private final val _currentPlayerSourceFlow: MutableStateFlow<com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?>

   private final val currentPlayerSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?
      private final get() {
         return _currentPlayerSourceFlow.getValue() as AudioPlayerManager.AudioSource;
      }


   public final val currentPlayerSourceFlow: Flow<com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?>
   private final var wasPlayingBeforePause: Boolean

   @JvmStatic
   fun {
      val var0: MutableStateFlow = Da.w.a(null);
      _currentPlayerSourceFlow = var0;
      currentPlayerSourceFlow = var0;
   }

   private fun abandonAudioFocus() {
      var var2: AudioManager = null;
      var var3: AudioFocusRequest = null;
      if (VERSION.SDK_INT >= 26) {
         var2 = audioManager;
         if (audioManager == null) {
            kotlin.jvm.internal.q.y("audioManager");
            var2 = null;
         }

         if (focusRequest == null) {
            kotlin.jvm.internal.q.y("focusRequest");
         } else {
            var3 = focusRequest;
         }

         e.a(var2, var3);
      } else {
         if (audioManager == null) {
            kotlin.jvm.internal.q.y("audioManager");
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
      val var4: java.util.Map = currentProgressMap;
      if (currentProgressMap.get(var1) != null) {
         return null;
      } else {
         val var5: AudioPlayerManager.CurrentProgress = new AudioPlayerManager.CurrentProgress(0L, var2);
         var4.put(var1, var5);
         return var5;
      }
   }

   private fun pause() {
      if (mediaPlayer != null) {
         mediaPlayer.pause();
      }
   }

   private fun playOrReset() {
      if (this.requestAudioFocus() && mediaPlayer != null) {
         mediaPlayer.playOrReset();
      }
   }

   private fun requestAudioFocus(): Boolean {
      var var3: AudioManager = null;
      var var4: AudioFocusRequest = null;
      val var6: Int;
      if (VERSION.SDK_INT >= 26) {
         var3 = audioManager;
         if (audioManager == null) {
            kotlin.jvm.internal.q.y("audioManager");
            var3 = null;
         }

         if (focusRequest == null) {
            kotlin.jvm.internal.q.y("focusRequest");
         } else {
            var4 = focusRequest;
         }

         var6 = d.a(var3, var4);
      } else {
         if (audioManager == null) {
            kotlin.jvm.internal.q.y("audioManager");
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

   @JvmStatic
   fun `setupPlayer$lambda$2$lambda$1`(var0: AudioPlayerManager.AudioSource, var1: Function1, var2: MediaPlayer.Event): Unit {
      kotlin.jvm.internal.q.h(var2, "event");
      if (kotlin.jvm.internal.q.c(var2, MediaPlayer.Event.PlaybackEnded.INSTANCE)) {
         currentProgressMap.remove(var0);
         INSTANCE.abandonAudioFocus();
      } else {
         INSTANCE.storeDuration(var0);
      }

      if (!kotlin.jvm.internal.q.c(mediaPlayerState, var2)) {
         mediaPlayerState = var2;
         var1.invoke(var2);
      }

      return Unit.a;
   }

   public fun getCurrentProgress(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?): com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.CurrentProgress? {
      if (kotlin.jvm.internal.q.c(this.getCurrentPlayerSource(), var1)) {
         val var4: MediaPlayer = mediaPlayer;
         if (mediaPlayer != null) {
            kotlin.jvm.internal.q.e(mediaPlayer);
            val var2: Long = var4.currentPositionMs();
            val var5: MediaPlayer = mediaPlayer;
            kotlin.jvm.internal.q.e(mediaPlayer);
            return new AudioPlayerManager.CurrentProgress(var2, var5.durationMs());
         }
      }

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
      val var2: MediaPlayer.Event;
      if (this.hasCurrentPlayer(var1)) {
         var2 = mediaPlayerState;
      } else {
         var2 = null;
      }

      return var2;
   }

   public fun hasCurrentPlayer(audioSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?): Boolean {
      val var2: Boolean;
      if (var1 != null && kotlin.jvm.internal.q.c(this.getCurrentPlayerSource(), var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public fun init(context: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      val var2: Any = var1.getSystemService("audio");
      kotlin.jvm.internal.q.f(var2, "null cannot be cast to non-null type android.media.AudioManager");
      audioManager = var2 as AudioManager;
      if (VERSION.SDK_INT >= 26) {
         focusRequest = c.a(b.a(a.a(f.a(4), focusListener), playbackAttributes));
      }
   }

   public fun maybePlayCurrentPlayer() {
      if (wasPlayingBeforePause) {
         wasPlayingBeforePause = false;
         this.playOrReset();
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

   public fun playOrReset(audioSource: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?) {
      if (this.hasCurrentPlayer(var1)) {
         this.playOrReset();
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
      kotlin.jvm.internal.q.h(var1, "source");
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
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "source");
      kotlin.jvm.internal.q.h(var5, "onStateChanged");
      if (mediaPlayer == null) {
         mediaPlayer = MediaPlayer.Factory.create$default(MediaPlayer.Factory, var1, null, 2, null);
      }

      if (!kotlin.jvm.internal.q.c(var2, this.getCurrentPlayerSource())) {
         this.storeDuration(this.getCurrentPlayerSource());
         mediaPlayerState = null;
         val var8: MutableStateFlow = _currentPlayerSourceFlow;
         _currentPlayerSourceFlow.setValue(var2);
         this.maybeCreateDuration(var2, var3);
         if (this.requestAudioFocus()) {
            var8.setValue(var2);
            val var9: MediaPlayer = mediaPlayer;
            kotlin.jvm.internal.q.e(mediaPlayer);
            val var7: MediaSource = AudioPlayerUtilsKt.toMediaSource$default(var2, null, 1, null);
            val var6: AudioPlayerManager.CurrentProgress = currentProgressMap.get(var2);
            if (var6 != null) {
               var3 = var6.getCurrentProgress();
            } else {
               var3 = 0L;
            }

            MediaPlayer.preparePlayer$default(var9, var7, true, false, var3, null, null, 52, null);
         }
      }

      val var10: MediaPlayer = mediaPlayer;
      kotlin.jvm.internal.q.e(mediaPlayer);
      var10.setEventListener(new h(var2, var5));
      var10.setVolume(1.0F);
   }

   public fun storeDuration(source: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager.AudioSource?) {
      if (this.hasCurrentPlayer(var1)) {
         val var4: MediaPlayer = mediaPlayer;
         if (mediaPlayer != null) {
            val var2: java.util.Map = currentProgressMap;
            kotlin.jvm.internal.q.e(var1);
            var var3: AudioPlayerManager.CurrentProgress = var2.get(var1) as AudioPlayerManager.CurrentProgress;
            if (var3 != null) {
               var3 = AudioPlayerManager.CurrentProgress.copy$default(var3, var4.currentPositionMs(), 0L, 2, null);
               if (var3 != null) {
                  var2.put(var1, var3);
               }
            }
         }
      }
   }

   public data class AudioSource(channelId: ChannelId?, messageId: MessageId, url: String, index: Int? = ...) : AudioPlayerManager.AudioSource(
         var1, var2, var3, var4
      ) {
      public final val channelId: ChannelId?
      public final val messageId: MessageId
      public final val url: String
      public final val index: Int?

      fun AudioSource(var1: ChannelId, var2: java.lang.String, var3: java.lang.String, var4: Int) {
         kotlin.jvm.internal.q.h(var2, "messageId");
         kotlin.jvm.internal.q.h(var3, "url");
         super();
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
         kotlin.jvm.internal.q.h(var2, "messageId");
         kotlin.jvm.internal.q.h(var3, "url");
         return new AudioPlayerManager.AudioSource(var1, var2, var3, var4, null);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is AudioPlayerManager.AudioSource) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.q.c(this.channelId, var1.channelId)) {
               return false;
            } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.url, var1.url)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.index, var1.index);
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

         val var4: Int = MessageId.hashCode-impl(this.messageId);
         val var3: Int = this.url.hashCode();
         if (this.index != null) {
            var2 = this.index.hashCode();
         }

         return ((var1 * 31 + var4) * 31 + var3) * 31 + var2;
      }

      public override fun toString(): String {
         val var4: ChannelId = this.channelId;
         val var5: java.lang.String = MessageId.toString-impl(this.messageId);
         val var1: java.lang.String = this.url;
         val var3: Int = this.index;
         val var2: StringBuilder = new StringBuilder();
         var2.append("AudioSource(channelId=");
         var2.append(var4);
         var2.append(", messageId=");
         var2.append(var5);
         var2.append(", url=");
         var2.append(var1);
         var2.append(", index=");
         var2.append(var3);
         var2.append(")");
         return var2.toString();
      }
   }

   public data class CurrentProgress(currentProgress: Long, durationMs: Long) {
      public final val currentProgress: Long
      public final val durationMs: Long
      public final val currentProgressPercentage: Float

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
