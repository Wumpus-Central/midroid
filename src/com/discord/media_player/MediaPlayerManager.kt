package com.discord.media_player

import A9.n
import A9.s
import android.content.Context
import cb.I
import cb.K
import cb.T
import cb.d0
import cb.k0
import com.discord.media_player.MediaPlayer.Event
import com.discord.media_player.MediaPlayer.PlayerSettings
import fb.x
import java.lang.ref.WeakReference
import java.util.LinkedHashMap
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.v
import kotlinx.coroutines.flow.MutableStateFlow

@SourceDebugExtension(["SMAP\nMediaPlayerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerManager.kt\ncom/discord/media_player/MediaPlayerManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"])
public object MediaPlayerManager {
   private const val MAX_PLAYER_SIZE: Int = 15
   private final val playerPool: ArrayBlockingQueue<MediaPlayer> = new ArrayBlockingQueue(15)
   private final var acquiredPlayerMap: MutableMap<Double, MediaPlayer> = new LinkedHashMap()
   private final var activePlayerRef: WeakReference<MediaPlayer>?
   private final var activeMonitoringJob: Job?
   private final val scope: CoroutineScope
   internal final val playbackRateFlow: MutableStateFlow<Pair<MediaSource?, Double>> = x.a(s.a(null, 0.0))
   internal final val playbackProgressFlow: MutableStateFlow<com.discord.media_player.MediaPlayerManager.PlaybackProgress> =
      x.a(new MediaPlayerManager.PlaybackProgress(null, 0L, 0L))

   @JvmStatic
   fun {
      val var0: CompletableJob = k0.b(null, 1, null);
      val var1: ExecutorService = Executors.newSingleThreadExecutor();
      scope = kotlinx.coroutines.g.a(var0.Z0(T.b(var1)));
   }

   private fun startProgressMonitor(playerRef: WeakReference<MediaPlayer>): Job {
      return cb.f.d(
         scope,
         K.c(),
         null,
         new Function2<CoroutineScope, Continuation, Object>(var1, null) {
            final WeakReference<MediaPlayer> $playerRef;
            int label;

            {
               super(2, var2x);
               this.$playerRef = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$playerRef, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = F9.b.e();
               if (this.label != 0 && this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               } else {
                  kotlin.c.b(var1);

                  do {
                     var1 = this.$playerRef.get();
                     if (var1 == null || !var1.isPlaying()) {
                        return Unit.a;
                     }

                     MediaPlayerManager.INSTANCE
                        .getPlaybackProgressFlow$media_player_release()
                        .setValue(new MediaPlayerManager.PlaybackProgress(var1.getMediaSource(), var1.currentPositionMs(), var1.durationMs()));
                     this.label = 1;
                  } while (I.a(100L, this) != var3);

                  return var3;
               }
            }
         },
         2,
         null
      );
   }

   public fun acquire(context: Context, key: Double, playerSettings: PlayerSettings): MediaPlayer {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 4
      // 0a: ldc "playerSettings"
      // 0c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 12: dload 2
      // 13: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 16: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1b: checkcast com/discord/media_player/MediaPlayer
      // 1e: astore 5
      // 20: aload 5
      // 22: ifnull 2a
      // 25: aload 0
      // 26: monitorexit
      // 27: aload 5
      // 29: areturn
      // 2a: getstatic com/discord/media_player/MediaPlayerManager.playerPool Ljava/util/concurrent/ArrayBlockingQueue;
      // 2d: astore 7
      // 2f: aload 7
      // 31: invokevirtual java/util/concurrent/ArrayBlockingQueue.poll ()Ljava/lang/Object;
      // 34: checkcast com/discord/media_player/MediaPlayer
      // 37: astore 6
      // 39: aload 6
      // 3b: astore 5
      // 3d: aload 6
      // 3f: ifnonnull a5
      // 42: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 45: invokeinterface java/util/Map.size ()I 1
      // 4a: bipush 15
      // 4c: if_icmplt 87
      // 4f: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 52: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 57: invokestatic kotlin/collections/CollectionsKt.i0 (Ljava/lang/Iterable;)Ljava/lang/Object;
      // 5a: checkcast java/lang/Double
      // 5d: astore 5
      // 5f: aload 5
      // 61: ifnull 87
      // 64: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 67: aload 5
      // 69: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6e: checkcast com/discord/media_player/MediaPlayer
      // 71: astore 5
      // 73: aload 5
      // 75: ifnull 87
      // 78: aload 7
      // 7a: aload 5
      // 7c: invokevirtual java/util/concurrent/ArrayBlockingQueue.offer (Ljava/lang/Object;)Z
      // 7f: pop
      // 80: goto 87
      // 83: astore 1
      // 84: goto d7
      // 87: aload 7
      // 89: invokevirtual java/util/concurrent/ArrayBlockingQueue.poll ()Ljava/lang/Object;
      // 8c: checkcast com/discord/media_player/MediaPlayer
      // 8f: astore 6
      // 91: aload 6
      // 93: astore 5
      // 95: aload 6
      // 97: ifnonnull a5
      // 9a: getstatic com/discord/media_player/MediaPlayer.Factory Lcom/discord/media_player/MediaPlayer$Factory;
      // 9d: aload 1
      // 9e: aload 4
      // a0: invokevirtual com/discord/media_player/MediaPlayer$Factory.create (Landroid/content/Context;Lcom/discord/media_player/MediaPlayer$PlayerSettings;)Lcom/discord/media_player/MediaPlayer;
      // a3: astore 5
      // a5: aload 5
      // a7: astore 6
      // a9: aload 5
      // ab: aload 4
      // ad: invokevirtual com/discord/media_player/MediaPlayer.hasDifferentSettings (Lcom/discord/media_player/MediaPlayer$PlayerSettings;)Z
      // b0: ifeq c3
      // b3: aload 5
      // b5: invokevirtual com/discord/media_player/MediaPlayer.release ()V
      // b8: getstatic com/discord/media_player/MediaPlayer.Factory Lcom/discord/media_player/MediaPlayer$Factory;
      // bb: aload 1
      // bc: aload 4
      // be: invokevirtual com/discord/media_player/MediaPlayer$Factory.create (Landroid/content/Context;Lcom/discord/media_player/MediaPlayer$PlayerSettings;)Lcom/discord/media_player/MediaPlayer;
      // c1: astore 6
      // c3: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // c6: dload 2
      // c7: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // ca: aload 6
      // cc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // d1: pop
      // d2: aload 0
      // d3: monitorexit
      // d4: aload 6
      // d6: areturn
      // d7: aload 0
      // d8: monitorexit
      // d9: aload 1
      // da: athrow
   }

   internal fun mediaPlayerEventHandler(event: Event, mediaPlayer: MediaPlayer): Job {
      return cb.f.d(
         scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(var2, var1, null) {
            final MediaPlayer.Event $event;
            final MediaPlayer $mediaPlayer;
            Object L$0;
            Object L$1;
            int label;

            {
               super(2, var3);
               this.$mediaPlayer = var1;
               this.$event = var2x;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$mediaPlayer, this.$event, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               var var15: MediaSource;
               label85: {
                  var var5: Any = F9.b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     val var4: MediaPlayer = this.L$1 as MediaPlayer;
                     var15 = this.L$0 as MediaSource;
                     kotlin.c.b(var1);
                     var1 = var15;
                  } else {
                     kotlin.c.b(var1);
                     var1 = this.$mediaPlayer.getMediaSource();
                     val var6: MediaPlayerManager = MediaPlayerManager.INSTANCE;
                     val var3: Boolean = (MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release().getValue() as Pair).a() as MediaSource == var1;
                     val var14: MediaPlayer.Event = this.$event;
                     if (this.$event == MediaPlayer.Event.Paused.INSTANCE) {
                        if (!var3) {
                           return Unit.a;
                        }

                        val var26: MutableStateFlow = var6.getPlaybackRateFlow$media_player_release();

                        do {
                           var15 = (MediaSource)var26.getValue();
                           var5 = var15 as Pair;
                        } while (!var26.b(var15, s.a(var1, kotlin.coroutines.jvm.internal.b.c(0.0))));

                        return Unit.a;
                     }

                     if (!(var14 == MediaPlayer.Event.StartedPlaying.INSTANCE)) {
                        if (var14 == MediaPlayer.Event.PlaybackEnded.INSTANCE) {
                           if (!var3) {
                              return Unit.a;
                           }

                           var6.getPlaybackRateFlow$media_player_release().setValue(s.a(var1, kotlin.coroutines.jvm.internal.b.c(0.0)));
                           val var18: MutableStateFlow = var6.getPlaybackProgressFlow$media_player_release();

                           do {
                              var1 = var18.getValue();
                           } while (
                              !var18.b(
                                 var1,
                                 MediaPlayerManager.PlaybackProgress.copy$default(
                                    (MediaPlayerManager.PlaybackProgress)var1, null, ((MediaPlayerManager.PlaybackProgress)var1).getDurationMs(), 0L, 5, null
                                 )
                              )
                           );

                           var1 = MediaPlayerManager.access$getActiveMonitoringJob$p();
                           if (var1 != null) {
                              v.f(var1, "playback ended", null, 2, null);
                           }

                           MediaPlayerManager.access$setActiveMonitoringJob$p(null);
                        } else if (!(var14 == MediaPlayer.Event.BufferEnd.INSTANCE)
                           && !(var14 == MediaPlayer.Event.BufferStart.INSTANCE)
                           && var14 !is MediaPlayer.Event.PlaybackError) {
                           throw new n();
                        }

                        return Unit.a;
                     }

                     var15 = var1;
                     if (var3) {
                        break label85;
                     }

                     val var23: WeakReference = MediaPlayerManager.access$getActivePlayerRef$p();
                     var15 = var1;
                     if (var23 == null) {
                        break label85;
                     }

                     val var24: MediaPlayer = var23.get() as MediaPlayer;
                     var15 = var1;
                     if (var24 == null) {
                        break label85;
                     }

                     var15 = var1;
                     if (var24 == this.$mediaPlayer) {
                        break label85;
                     }

                     val var7: d0 = K.c();
                     val var16: Function2 = new Function2<CoroutineScope, Continuation, Object>(var24, null) {
                        final MediaPlayer $prevMediaPlayer;
                        int label;

                        {
                           super(2, var2x);
                           this.$prevMediaPlayer = var1;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.$prevMediaPlayer, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           F9.b.e();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              this.$prevMediaPlayer.pause();
                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.L$0 = var1;
                     this.L$1 = var24;
                     this.label = 1;
                     if (cb.f.g(var7, var16, this) === var5) {
                        return var5;
                     }
                  }

                  var15 = var1;
               }

               val var20: MutableStateFlow = MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release();

               val var25: Any;
               do {
                  var25 = var20.getValue();
                  val var9: Pair = var25 as Pair;
               } while (!var20.b(var25, s.a(var15, kotlin.coroutines.jvm.internal.b.c(1.0))));

               val var10: WeakReference = new WeakReference<>(this.$mediaPlayer);
               MediaPlayerManager.access$setActivePlayerRef$p(var10);
               val var17: Job = MediaPlayerManager.access$getActiveMonitoringJob$p();
               if (var17 != null) {
                  v.f(var17, "New progress monitor override", null, 2, null);
               }

               MediaPlayerManager.access$setActiveMonitoringJob$p(MediaPlayerManager.access$startProgressMonitor(MediaPlayerManager.INSTANCE, var10));
               return Unit.a;
            }
         },
         3,
         null
      );
   }

   public fun pauseActivePlayer(): Job {
      return cb.f.d(scope, K.c(), null, new Function2<CoroutineScope, Continuation, Object>(null) {
         int label;

         {
            super(2, var1);
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            F9.b.e();
            if (this.label == 0) {
               kotlin.c.b(var1);
               var1 = MediaPlayerManager.access$getActivePlayerRef$p();
               if (var1 != null) {
                  val var3: MediaPlayer = var1.get() as MediaPlayer;
                  if (var3 != null) {
                     var3.pause();
                  }
               }

               return Unit.a;
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }, 2, null);
   }

   public fun playActivePlayer(): Job {
      return cb.f.d(scope, K.c(), null, new Function2<CoroutineScope, Continuation, Object>(null) {
         int label;

         {
            super(2, var1);
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            F9.b.e();
            if (this.label == 0) {
               kotlin.c.b(var1);
               var1 = MediaPlayerManager.access$getActivePlayerRef$p();
               if (var1 != null) {
                  val var3: MediaPlayer = var1.get() as MediaPlayer;
                  if (var3 != null) {
                     var3.playOrReset();
                  }
               }

               return Unit.a;
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }, 2, null);
   }

   public fun release(key: Double?): Boolean {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ifnull 34
      // 06: getstatic com/discord/media_player/MediaPlayerManager.acquiredPlayerMap Ljava/util/Map;
      // 09: aload 1
      // 0a: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f: checkcast com/discord/media_player/MediaPlayer
      // 12: astore 1
      // 13: aload 1
      // 14: ifnull 2c
      // 17: getstatic com/discord/media_player/MediaPlayerManager.playerPool Ljava/util/concurrent/ArrayBlockingQueue;
      // 1a: aload 1
      // 1b: invokevirtual java/util/concurrent/ArrayBlockingQueue.offer (Ljava/lang/Object;)Z
      // 1e: ifne 2c
      // 21: aload 1
      // 22: invokevirtual com/discord/media_player/MediaPlayer.release ()V
      // 25: goto 2c
      // 28: astore 1
      // 29: goto 30
      // 2c: aload 0
      // 2d: monitorexit
      // 2e: bipush 1
      // 2f: ireturn
      // 30: aload 0
      // 31: monitorexit
      // 32: aload 1
      // 33: athrow
      // 34: aload 0
      // 35: monitorexit
      // 36: bipush 0
      // 37: ireturn
   }

   public data class PlaybackProgress(source: MediaSource?, timeMs: Long, durationMs: Long) {
      public final val source: MediaSource?
      public final val timeMs: Long
      public final val durationMs: Long

      init {
         this.source = var1;
         this.timeMs = var2;
         this.durationMs = var4;
      }

      public operator fun component1(): MediaSource? {
         return this.source;
      }

      public operator fun component2(): Long {
         return this.timeMs;
      }

      public operator fun component3(): Long {
         return this.durationMs;
      }

      public fun copy(source: MediaSource? = var0.source, timeMs: Long = var0.timeMs, durationMs: Long = var0.durationMs): com.discord.media_player.MediaPlayerManager.PlaybackProgress {
         return new MediaPlayerManager.PlaybackProgress(var1, var2, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaPlayerManager.PlaybackProgress) {
            return false;
         } else {
            var1 = var1;
            if (!(this.source == var1.source)) {
               return false;
            } else if (this.timeMs != var1.timeMs) {
               return false;
            } else {
               return this.durationMs == var1.durationMs;
            }
         }
      }

      public override fun hashCode(): Int {
         val var1: Int;
         if (this.source == null) {
            var1 = 0;
         } else {
            var1 = this.source.hashCode();
         }

         return (var1 * 31 + java.lang.Long.hashCode(this.timeMs)) * 31 + java.lang.Long.hashCode(this.durationMs);
      }

      public override fun toString(): String {
         val var5: MediaSource = this.source;
         val var3: Long = this.timeMs;
         val var1: Long = this.durationMs;
         val var6: StringBuilder = new StringBuilder();
         var6.append("PlaybackProgress(source=");
         var6.append(var5);
         var6.append(", timeMs=");
         var6.append(var3);
         var6.append(", durationMs=");
         var6.append(var1);
         var6.append(")");
         return var6.toString();
      }
   }
}
