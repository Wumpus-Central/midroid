package com.discord.sounds

import android.content.Context
import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.media.AudioAttributes.Builder
import android.net.Uri
import com.discord.logging.Log
import java.io.IOException
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal class SoundPlayer  internal constructor(mediaPlayer: MediaPlayer?, soundResIdPrepared: (Int) -> Unit) {
   private final var mediaPlayer: MediaPlayer?
   private final var volume: Float
   public final var numberOfLoops: Int

   public constructor(context: Context, usage: Int, soundResId: Int?, filePath: String?, soundResIdPrepared: (Int) -> Unit) : r.h(var1, "context") {
      r.h(var5, "soundResIdPrepared");
      this(SoundPlayer.Companion.access$createMediaPlayer(Companion, var1, var2, var3, var4), var5);
   }

   init {
      r.h(var2, "soundResIdPrepared");
      super();
      this.mediaPlayer = var1;
      this.volume = 1.0F;
      this.initializeMediaPlayer(var2);
   }

   private fun initializeMediaPlayer(soundResIdPrepared: (Int) -> Unit) {
      if (this.mediaPlayer != null) {
         this.mediaPlayer.setOnCompletionListener(new a(this));
      }

      if (this.mediaPlayer != null) {
         this.mediaPlayer.setOnPreparedListener(new b(var1));
      }

      var var6: MediaPlayer;
      try {
         var6 = this.mediaPlayer;
      } catch (var4: IOException) {
         this.mediaPlayer = null;
         var1.invoke(0);
         return;
      }

      if (var6 != null) {
         try {
            var6.prepare();
         } catch (var3: IOException) {
            this.mediaPlayer = null;
            var1.invoke(0);
         }
      }
   }

   @JvmStatic
   fun `initializeMediaPlayer$lambda$0`(var0: SoundPlayer, var1: MediaPlayer) {
      r.h(var0, "this$0");
      if (var0.numberOfLoops != 0) {
         var0.numberOfLoops--;
         var0.play();
      } else {
         var0.release();
      }
   }

   @JvmStatic
   fun `initializeMediaPlayer$lambda$1`(var0: Function1, var1: MediaPlayer) {
      r.h(var0, "$soundResIdPrepared");
      var0.invoke(var1.getDuration());
   }

   public fun pause() {
      var var1: MediaPlayer;
      try {
         var1 = this.mediaPlayer;
      } catch (var3: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pause.", var3);
         return;
      }

      if (var1 != null) {
         try {
            var1.pause();
         } catch (var2: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pause.", var2);
         }
      }
   }

   public fun play() {
      var var1: MediaPlayer;
      try {
         var1 = this.mediaPlayer;
      } catch (var3: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to start.", var3);
         return;
      }

      if (var1 != null) {
         try {
            var1.start();
         } catch (var2: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to start.", var2);
         }
      }
   }

   public fun release() {
      var var1: MediaPlayer;
      try {
         var1 = this.mediaPlayer;
      } catch (var4: Exception) {
         this.mediaPlayer = null;
         Log.w$default(Log.INSTANCE, SoundManager.Companion.getLogTag(), "Unable to release media player.", null, 4, null);
         return;
      }

      if (var1 != null) {
         try {
            var1.release();
         } catch (var3: Exception) {
            this.mediaPlayer = null;
            Log.w$default(Log.INSTANCE, SoundManager.Companion.getLogTag(), "Unable to release media player.", null, 4, null);
            return;
         }
      }

      try {
         this.mediaPlayer = null;
      } catch (var2: Exception) {
         this.mediaPlayer = null;
         Log.w$default(Log.INSTANCE, SoundManager.Companion.getLogTag(), "Unable to release media player.", null, 4, null);
      }
   }

   public fun setCurrentTime(time: Int) {
      var var2: MediaPlayer;
      try {
         var2 = this.mediaPlayer;
      } catch (var4: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to seek to.", var4);
         return;
      }

      if (var2 != null) {
         try {
            var2.seekTo(var1);
         } catch (var3: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to seek to.", var3);
         }
      }
   }

   public fun setPan(pan: Float) {
      val var15: Float;
      val var4: Byte = (byte)(if ((var15 = var1 - 0.5F) == 0.0F) 0 else (if (var15 < 0.0F) -1 else 1));
      val var13: Float;
      if (var1 >= 0.5F) {
         var var3: Float;
         try {
            var3 = this.volume;
         } catch (var11: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", var11);
            return;
         }

         var13 = var3 * (2 - var1 * 2);
      } else {
         try {
            var13 = this.volume;
         } catch (var10: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", var10);
            return;
         }
      }

      if (var4 >= 0) {
         try {
            var1 = this.volume;
         } catch (var9: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", var9);
            return;
         }
      } else {
         var var14: Float;
         try {
            var14 = this.volume;
         } catch (var8: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", var8);
            return;
         }

         var1 = var1 * 2 * var14;
      }

      var var5: MediaPlayer;
      try {
         var5 = this.mediaPlayer;
      } catch (var7: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", var7);
         return;
      }

      if (var5 != null) {
         try {
            var5.setVolume(var13, var1);
         } catch (var6: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to pan.", var6);
         }
      }
   }

   public fun setVolume(volume: Float) {
      var var2: MediaPlayer;
      try {
         var2 = this.mediaPlayer;
      } catch (var5: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to set volume.", var5);
         return;
      }

      if (var2 != null) {
         try {
            var2.setVolume(var1, var1);
         } catch (var4: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to set volume.", var4);
            return;
         }
      }

      try {
         this.volume = var1;
      } catch (var3: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to set volume.", var3);
      }
   }

   public fun stop() {
      var var1: MediaPlayer;
      try {
         var1 = this.mediaPlayer;
      } catch (var5: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to stop.", var5);
         return;
      }

      if (var1 != null) {
         try {
            var1.pause();
         } catch (var4: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to stop.", var4);
            return;
         }
      }

      try {
         var1 = this.mediaPlayer;
      } catch (var3: Exception) {
         Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to stop.", var3);
         return;
      }

      if (var1 != null) {
         try {
            var1.seekTo(0);
         } catch (var2: Exception) {
            Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to stop.", var2);
         }
      }
   }

   public companion object {
      private fun createMediaPlayer(context: Context, usage: Int, soundResId: Int?, filePath: String?): MediaPlayer {
         val var5: MediaPlayer = new MediaPlayer();
         var5.setAudioAttributes(new Builder().setContentType(4).setUsage(var2).build());
         if (var3 != null) {
            val var7: AssetFileDescriptor = var1.getResources().openRawResourceFd(var3);
            var5.setDataSource(var7.getFileDescriptor(), var7.getStartOffset(), var7.getLength());
         }

         if (var4 != null) {
            try {
               var5.setDataSource(var1, Uri.parse(var4));
            } catch (var6: Exception) {
               Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to set sound.", var6);
            }
         }

         return var5;
      }
   }
}
