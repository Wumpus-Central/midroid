package com.discord.sounds

import android.content.Context
import java.util.LinkedHashMap
import kotlin.jvm.internal.r

internal class SoundManager(context: Context) {
   private final val context: Context
   private final var soundPlayers: MutableMap<Int, SoundPlayer>

   @JvmStatic
   fun {
      val var0: java.lang.String = SoundManager.class.getSimpleName();
      r.g(var0, "SoundManager::class.java.simpleName");
      logTag = var0;
   }

   init {
      r.h(var1, "context");
      super();
      this.context = var1;
      this.soundPlayers = new LinkedHashMap<>();
   }

   public fun pause(key: Int) {
      val var2: Any = this.soundPlayers.get(var1);
      r.e(var2);
      (var2 as SoundPlayer).pause();
   }

   public fun play(key: Int) {
      val var2: Any = this.soundPlayers.get(var1);
      r.e(var2);
      (var2 as SoundPlayer).play();
   }

   public fun prepare(key: Int, usage: Int, soundResId: Int?, filePath: String?, soundResIdPrepared: (Int) -> Unit) {
      r.h(var5, "soundResIdPrepared");
      if (!this.soundPlayers.containsKey(var1)) {
         this.soundPlayers.put(var1, new SoundPlayer(this.context, var2, var3, var4, var5));
      } else {
         throw new IllegalAccessError("Trying to prepare an already prepared asset.");
      }
   }

   public fun release(key: Int) {
      val var2: Any = this.soundPlayers.get(var1);
      r.e(var2);
      (var2 as SoundPlayer).release();
      this.soundPlayers.remove(var1);
   }

   public fun setCurrentTime(key: Int, time: Int) {
      val var3: Any = this.soundPlayers.get(var1);
      r.e(var3);
      (var3 as SoundPlayer).setCurrentTime(var2);
   }

   public fun setNumberOfLoops(key: Int, numberOfLoops: Int) {
      val var3: Any = this.soundPlayers.get(var1);
      r.e(var3);
      (var3 as SoundPlayer).setNumberOfLoops(var2);
   }

   public fun setPan(key: Int, pan: Float) {
      val var3: Any = this.soundPlayers.get(var1);
      r.e(var3);
      (var3 as SoundPlayer).setPan(var2);
   }

   public fun setVolume(key: Int, volume: Float) {
      val var3: Any = this.soundPlayers.get(var1);
      r.e(var3);
      (var3 as SoundPlayer).setVolume(var2);
   }

   public fun stop(key: Int) {
      val var2: Any = this.soundPlayers.get(var1);
      r.e(var2);
      (var2 as SoundPlayer).stop();
   }

   public companion object {
      public final val logTag: String
   }
}
