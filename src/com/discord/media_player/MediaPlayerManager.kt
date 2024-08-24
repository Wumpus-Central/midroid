package com.discord.media_player

import android.content.Context
import com.discord.media_player.MediaPlayer.PlayerSettings
import java.util.LinkedHashMap
import java.util.concurrent.ArrayBlockingQueue

public object MediaPlayerManager {
   private const val MAX_PLAYER_SIZE: Int = 10
   private final var acquiredPlayerMap: MutableMap<Double, MediaPlayer> = new LinkedHashMap()
   private final val playerPool: ArrayBlockingQueue<MediaPlayer> = new ArrayBlockingQueue(10)

   public fun acquire(context: Context, key: Double, playerSettings: PlayerSettings): MediaPlayer {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 4
      // 0a: ldc "playerSettings"
      // 0c: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 12: dload 2
      // 13: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 16: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1b: checkcast com/discord/media_player/MediaPlayer
      // 1e: astore 6
      // 20: aload 6
      // 22: ifnull 2a
      // 25: aload 0
      // 26: monitorexit
      // 27: aload 6
      // 29: areturn
      // 2a: getstatic com/discord/media_player/MediaPlayerManager.playerPool Ljava/util/concurrent/ArrayBlockingQueue;
      // 2d: astore 6
      // 2f: aload 6
      // 31: invokevirtual java/util/AbstractCollection.isEmpty ()Z
      // 34: ifeq 73
      // 37: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 3a: invokeinterface java/util/Map.size ()I 1
      // 3f: bipush 10
      // 41: if_icmpgt 4a
      // 44: bipush 1
      // 45: istore 5
      // 47: goto 4d
      // 4a: bipush 0
      // 4b: istore 5
      // 4d: iload 5
      // 4f: ifeq 64
      // 52: aload 6
      // 54: getstatic com/discord/media_player/MediaPlayer.Factory Lcom/discord/media_player/MediaPlayer$Factory;
      // 57: aload 1
      // 58: aload 4
      // 5a: invokevirtual com/discord/media_player/MediaPlayer$Factory.create (Landroid/content/Context;Lcom/discord/media_player/MediaPlayer$PlayerSettings;)Lcom/discord/media_player/MediaPlayer;
      // 5d: invokevirtual java/util/concurrent/ArrayBlockingQueue.add (Ljava/lang/Object;)Z
      // 60: pop
      // 61: goto 73
      // 64: new java/lang/IllegalStateException
      // 67: astore 1
      // 68: aload 1
      // 69: ldc "Reached max player size, no more players to initialize"
      // 6b: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 6e: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 71: aload 1
      // 72: athrow
      // 73: aload 6
      // 75: invokevirtual java/util/concurrent/ArrayBlockingQueue.take ()Ljava/lang/Object;
      // 78: checkcast com/discord/media_player/MediaPlayer
      // 7b: astore 7
      // 7d: aload 7
      // 7f: astore 6
      // 81: aload 7
      // 83: aload 4
      // 85: invokevirtual com/discord/media_player/MediaPlayer.hasDifferentSettings (Lcom/discord/media_player/MediaPlayer$PlayerSettings;)Z
      // 88: ifeq 9b
      // 8b: aload 7
      // 8d: invokevirtual com/discord/media_player/MediaPlayer.release ()V
      // 90: getstatic com/discord/media_player/MediaPlayer.Factory Lcom/discord/media_player/MediaPlayer$Factory;
      // 93: aload 1
      // 94: aload 4
      // 96: invokevirtual com/discord/media_player/MediaPlayer$Factory.create (Landroid/content/Context;Lcom/discord/media_player/MediaPlayer$PlayerSettings;)Lcom/discord/media_player/MediaPlayer;
      // 99: astore 6
      // 9b: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 9e: astore 1
      // 9f: aload 6
      // a1: ldc "player"
      // a3: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // a6: aload 1
      // a7: dload 2
      // a8: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // ab: aload 6
      // ad: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b2: pop
      // b3: aload 6
      // b5: ldc "player"
      // b7: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // ba: aload 0
      // bb: monitorexit
      // bc: aload 6
      // be: areturn
      // bf: astore 1
      // c0: aload 0
      // c1: monitorexit
      // c2: aload 1
      // c3: athrow
   }

   public fun release(key: Double?): Boolean {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ifnull 2d
      // 06: aload 1
      // 07: invokevirtual java/lang/Double.doubleValue ()D
      // 0a: pop2
      // 0b: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 0e: aload 1
      // 0f: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 14: checkcast com/discord/media_player/MediaPlayer
      // 17: astore 1
      // 18: aload 1
      // 19: ifnull 24
      // 1c: getstatic com/discord/media_player/MediaPlayerManager.playerPool Ljava/util/concurrent/ArrayBlockingQueue;
      // 1f: aload 1
      // 20: invokevirtual java/util/concurrent/ArrayBlockingQueue.add (Ljava/lang/Object;)Z
      // 23: pop
      // 24: aload 0
      // 25: monitorexit
      // 26: bipush 1
      // 27: ireturn
      // 28: astore 1
      // 29: aload 0
      // 2a: monitorexit
      // 2b: aload 1
      // 2c: athrow
      // 2d: aload 0
      // 2e: monitorexit
      // 2f: bipush 0
      // 30: ireturn
   }
}
