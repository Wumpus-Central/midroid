package com.discord.media_player

import B9.s
import android.app.Activity
import android.view.View
import com.discord.logging.Log
import com.discord.media_player.reactevents.MediaPlayerDownloadProgress
import com.discord.media_player.reactevents.MediaPlayerMuteStateChanged
import com.discord.media_player.reactevents.MediaPlayerPause
import com.discord.media_player.reactevents.MediaPlayerPlaybackProgressUpdated
import com.discord.media_player.reactevents.MediaPlayerPlaybackRateChanged
import com.discord.media_player.reactevents.MediaPlayerPlaybackSource
import com.discord.media_player.reactevents.MediaPlayerPlaybackSourceChanged
import com.discord.media_player.reactevents.MediaPlayerProgress
import com.discord.media_player.reactevents.MediaPlayerViewDidDisappear
import com.discord.media_player.reactevents.MediaPlayerViewWillAppear
import com.discord.portals.from_native.PortalFromNativeContextManager
import com.discord.primitives.ChannelId
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView
import db.I
import db.K
import db.T
import db.d0
import db.k0
import gb.x
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.UUID
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.time.Duration
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

@ReactModule(name = "MediaPlayerManager")
@SourceDebugExtension(["SMAP\nMediaPlayerManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerManagerModule.kt\ncom/discord/media_player/MediaPlayerManagerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,342:1\n1#2:343\n8#3:344\n8#3:345\n*S KotlinDebug\n*F\n+ 1 MediaPlayerManagerModule.kt\ncom/discord/media_player/MediaPlayerManagerModule\n*L\n213#1:344\n215#1:345\n*E\n"])
public class MediaPlayerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext
   private final val mediaPlayerProgressMap: MutableMap<Double, Job>
   private final val scope: CoroutineScope
   private final var _pausePlayerFlow: MutableStateFlow<String?>
   public final val pausePlayerFlow: Flow<String?>
   private final val reactEvents: ReactEvents

   init {
      this.reactContext = var1;
      this.mediaPlayerProgressMap = new LinkedHashMap<>();
      val var2: CompletableJob = k0.b(null, 1, null);
      val var3: ExecutorService = Executors.newSingleThreadExecutor();
      this.scope = kotlinx.coroutines.g.a(var2.X0(T.b(var3)));
      val var4: MutableStateFlow = x.a(null);
      this._pausePlayerFlow = var4;
      this.pausePlayerFlow = var4;
      this.reactEvents = new ReactEvents(
         s.a("MediaPlayerPlaybackProgressUpdated", MediaPlayerPlaybackProgressUpdated::class),
         s.a("MediaPlayerPlaybackRateChanged", MediaPlayerPlaybackRateChanged::class),
         s.a("MediaPlayerPlaybackSourceChanged", MediaPlayerPlaybackSourceChanged::class),
         s.a("MediaPlayerPause", MediaPlayerPause::class),
         s.a("MediaPlayerProgress", MediaPlayerProgress::class),
         s.a("MediaPlayerDownloadProgress", MediaPlayerDownloadProgress::class),
         s.a("MediaPlayerMuteStateChanged", MediaPlayerMuteStateChanged::class),
         s.a("MediaPlayerViewWillAppear", MediaPlayerViewWillAppear::class),
         s.a("MediaPlayerViewDidDisappear", MediaPlayerViewDidDisappear::class)
      );
   }

   @JvmStatic
   fun `changeProgress$lambda$1`(var0: Double, var2: SimpleExoPlayer): Unit {
      val var7: kotlin.time.Duration.a = Duration.e;
      val var5: Long = Duration.w(kotlin.time.b.r(var0, cb.b.n));
      val var3: Long = var2.getDuration();
      if (var3 > 0L && var5 >= 0L && var5 <= var3) {
         try {
            var2.l0(var5);
         } catch (var9: IllegalArgumentException) {
            val var11: Log = Log.INSTANCE;
            val var8: StringBuilder = new StringBuilder();
            var8.append("Invalid seek position: ");
            var8.append(var5);
            var8.append(", duration: ");
            var8.append(var3);
            var11.e("MediaPlayerManager", var8.toString(), var9);
         }
      } else {
         val var10: Log = Log.INSTANCE;
         val var12: StringBuilder = new StringBuilder();
         var12.append("Invalid seek attempt: position=");
         var12.append(var5);
         var12.append(", duration=");
         var12.append(var3);
         Log.w$default(var10, "MediaPlayerManager", var12.toString(), null, 4, null);
      }

      return Unit.a;
   }

   private fun onMediaPlayerDownloadProgress(portal: Double, bufferedPosition: Long, duration: Long) {
      this.reactEvents
         .emitModuleEvent(
            this.reactContext,
            new MediaPlayerDownloadProgress(
               var1,
               (double)TimeUnit.MILLISECONDS.toSeconds(var3),
               kotlin.ranges.d.j((double)var3 / (double)var5, 0.0, 1.0),
               (double)TimeUnit.MILLISECONDS.toSeconds(var5)
            )
         );
   }

   private fun onMediaPlayerPlaybackProgress(mediaSource: MediaSource?, timeMs: Long, durationMs: Long) {
      val var8: MediaPlayerPlaybackSource;
      if (var1 != null) {
         var8 = MediaPlayerPlaybackSource.Companion.fromMediaSource(var1);
      } else {
         var8 = null;
      }

      this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerPlaybackProgressUpdated(var8, var2, var4));
      if (var1 != null) {
         val var11: java.lang.Double = var1.getPortal();
         if (var11 != null) {
            val var6: Double = var11.doubleValue();
            val var12: ReactEvents = this.reactEvents;
            val var14: ReactApplicationContext = this.reactContext;
            val var15: kotlin.time.Duration.a = Duration.e;
            val var17: cb.b = cb.b.m;
            var2 = kotlin.time.b.t(var2, cb.b.m);
            val var16: cb.b = cb.b.n;
            var12.emitModuleEvent(var14, new MediaPlayerProgress(var6, Duration.L(var2, cb.b.n), Duration.L(kotlin.time.b.t(var4, var17), var16)));
         }
      }
   }

   @JvmStatic
   fun `setLoopPlayback$lambda$3`(var0: Boolean, var1: SimpleExoPlayer): Unit {
      if (var0) {
         var1.S(1);
      } else {
         var1.S(0);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `setMuted$lambda$2`(var0: Boolean, var1: SimpleExoPlayer): Unit {
      val var2: Float;
      if (var0) {
         var2 = 0.0F;
      } else {
         var2 = 1.0F;
      }

      var1.F0(var2);
      return Unit.a;
   }

   @JvmStatic
   fun `toggle$lambda$0`(var0: Boolean, var1: MediaPlayerManagerModule, var2: Double, var4: SimpleExoPlayer): Unit {
      if (var0 && var4.P() == 11) {
         try {
            var4.l0(0L);
         } catch (var6: IllegalArgumentException) {
            Log.INSTANCE.e("MediaPlayerManager", "Failed to seek to beginning", var6);
         }
      }

      if (var4.Q() == var0) {
         return Unit.a;
      } else {
         var4.o(var0);
         var1.reactEvents.emitModuleEvent(var1.reactContext, new MediaPlayerPause(var2, var0 xor true));
         return Unit.a;
      }
   }

   private fun withPlayer(portal: Double, callback: (SimpleExoPlayer) -> Unit) {
      val var4: Activity = this.getCurrentActivity();
      if (var4 != null) {
         var4.runOnUiThread(new f(var1, var3));
      }
   }

   @JvmStatic
   fun `withPlayer$lambda$6`(var0: Double, var2: Function1) {
      var var4: View = PortalFromNativeContextManager.INSTANCE.getView(var0);
      if (var4 != null) {
         if (var4 !is PlayerView) {
            var4 = null;
         }

         val var6: PlayerView = var4 as PlayerView;
         if (var4 as PlayerView != null) {
            var var7: Player = var6.getPlayer();
            if (var7 != null) {
               if (var7 !is SimpleExoPlayer) {
                  var7 = null;
               }

               val var8: SimpleExoPlayer = var7 as SimpleExoPlayer;
               if (var7 as SimpleExoPlayer != null) {
                  var2.invoke(var8);
               }
            }
         }
      }
   }

   @ReactMethod
   public fun addListener(type: String) {
   }

   @ReactMethod
   public fun changeProgress(portal: Double, seekToSec: Double) {
      this.withPlayer(var1, new i(var3));
   }

   public open fun getName(): String {
      return "MediaPlayerManager";
   }

   public open fun invalidate() {
      kotlinx.coroutines.g.f(this.scope, null, 1, null);
      super.invalidate();
   }

   public fun onMediaPlayerViewDetached(channelId: ChannelId, vararg mediaSources: MediaSource): Job {
      return db.f.d(this.scope, K.c(), null, new Function2<CoroutineScope, Continuation, Object>(this, var1, var3, null) {
         final long $channelId;
         final MediaSource[] $mediaSources;
         int label;
         final MediaPlayerManagerModule this$0;

         {
            super(2, var5);
            this.this$0 = var1;
            this.$channelId = var2x;
            this.$mediaSources = var4;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, this.$channelId, this.$mediaSources, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            G9.b.e();
            if (this.label != 0) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
               kotlin.c.b(var1);
               val var4: ReactEvents = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
               val var8: ReactApplicationContext = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
               val var6: java.lang.String = ChannelId.toString-impl(this.$channelId);
               val var5: Array<MediaSource> = this.$mediaSources;
               var1 = new ArrayList(this.$mediaSources.length);
               val var3: Int = var5.length;

               for (int var2x = 0; var2x < var3; var2x++) {
                  var1.add(MediaPlayerPlaybackSource.Companion.createId(var5[var2x]));
               }

               var4.emitModuleEvent(var8, new MediaPlayerViewDidDisappear(var6, var1));
               return Unit.a;
            }
         }
      }, 2, null);
   }

   public fun onMediaPlayerViewWillAppear(channelId: ChannelId, vararg mediaSources: MediaSource): Job {
      return db.f.d(this.scope, K.c(), null, new Function2<CoroutineScope, Continuation, Object>(this, var1, var3, null) {
         final long $channelId;
         final MediaSource[] $mediaSources;
         int label;
         final MediaPlayerManagerModule this$0;

         {
            super(2, var5);
            this.this$0 = var1;
            this.$channelId = var2x;
            this.$mediaSources = var4;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, this.$channelId, this.$mediaSources, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            G9.b.e();
            if (this.label != 0) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
               kotlin.c.b(var1);
               val var7: ReactEvents = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
               val var4: ReactApplicationContext = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
               val var8: java.lang.String = ChannelId.toString-impl(this.$channelId);
               val var6: Array<MediaSource> = this.$mediaSources;
               val var5: ArrayList = new ArrayList(this.$mediaSources.length);
               val var3: Int = var6.length;

               for (int var2x = 0; var2x < var3; var2x++) {
                  var5.add(MediaPlayerPlaybackSource.Companion.createId(var6[var2x]));
               }

               var7.emitModuleEvent(var4, new MediaPlayerViewWillAppear(var8, var5));
               return Unit.a;
            }
         }
      }, 2, null);
   }

   public fun onMuteToggle(portal: Double, isMuted: Boolean) {
      this.reactEvents.emitModuleEvent(this.reactContext, new MediaPlayerMuteStateChanged(var1, var3));
   }

   @ReactMethod
   public fun pauseAllMediaPlayers() {
      this._pausePlayerFlow.setValue(UUID.randomUUID().toString());
   }

   @ReactMethod
   public fun pauseCurrentPlayer() {
      MediaPlayerManager.INSTANCE.pauseActivePlayer();
   }

   @ReactMethod
   public fun playCurrentPlayer() {
      MediaPlayerManager.INSTANCE.playActivePlayer();
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setLoopPlayback(portal: Double, loop: Boolean) {
      this.withPlayer(var1, new h(var3));
   }

   @ReactMethod
   public fun setMuted(portal: Double, muted: Boolean) {
      this.withPlayer(var1, new g(var3));
   }

   public fun startPlayerProgressInterval(mediaSource: MediaSource, mediaPlayer: MediaPlayer) {
      this.stopPlayerProgressInterval(var1);
      this.onMediaPlayerPlaybackProgress(var1, var2.currentPositionMs(), var2.durationMs());
      val var3: java.util.Map = this.mediaPlayerProgressMap;
      val var4: java.lang.Double = var1.getPortal();
      var3.put(
         var4,
         db.f.d(
            this.scope,
            null,
            null,
            new Function2<CoroutineScope, Continuation, Object>(var2, this, var1, null) {
               final MediaPlayer $mediaPlayer;
               final MediaSource $mediaSource;
               private Object L$0;
               int label;
               final MediaPlayerManagerModule this$0;

               {
                  super(2, var4);
                  this.$mediaPlayer = var1;
                  this.this$0 = var2x;
                  this.$mediaSource = var3x;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  val var3: Function2 = new <anonymous constructor>(this.$mediaPlayer, this.this$0, this.$mediaSource, var2);
                  var3.L$0 = var1;
                  return var3;
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               // $VF: Irreducible bytecode was duplicated to produce valid code
               public final Object invokeSuspend(Object var1) {
                  val var4: Any = G9.b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        if (this.label != 2) {
                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        val var3x: CoroutineScope = this.L$0 as CoroutineScope;
                        kotlin.c.b(var1);
                        var1 = var3x;
                     } else {
                        val var7: CoroutineScope = this.L$0 as CoroutineScope;
                        kotlin.c.b(var1);
                        var1 = var7;
                        this.L$0 = var7;
                        this.label = 2;
                        if (I.a(100L, this) === var4) {
                           return var4;
                        }
                     }
                  } else {
                     kotlin.c.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                  }

                  while (kotlinx.coroutines.g.i(var1)) {
                     val var8: d0 = K.c();
                     val var5: Function2 = new Function2<CoroutineScope, Continuation, Object>(this.$mediaPlayer, this.this$0, this.$mediaSource, null) {
                        final MediaPlayer $mediaPlayer;
                        final MediaSource $mediaSource;
                        int label;
                        final MediaPlayerManagerModule this$0;

                        {
                           super(2, var4x);
                           this.$mediaPlayer = var1;
                           this.this$0 = var2x;
                           this.$mediaSource = var3;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.$mediaPlayer, this.this$0, this.$mediaSource, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           G9.b.e();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              if (this.$mediaPlayer.isPlaying()) {
                                 MediaPlayerManagerModule.access$onMediaPlayerPlaybackProgress(
                                    this.this$0, this.$mediaSource, this.$mediaPlayer.currentPositionMs(), this.$mediaPlayer.durationMs()
                                 );
                              }

                              if (this.$mediaPlayer.durationMs() > 0L && (this.$mediaPlayer.isPlaying() || this.$mediaPlayer.isBuffering())) {
                                 MediaPlayerManagerModule.access$onMediaPlayerDownloadProgress(
                                    this.this$0, this.$mediaSource.getPortal(), this.$mediaPlayer.bufferedPositionMs(), this.$mediaPlayer.durationMs()
                                 );
                              }

                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.L$0 = var1;
                     this.label = 1;
                     if (db.f.g(var8, var5, this) === var4) {
                        return var4;
                     }

                     this.L$0 = var1;
                     this.label = 2;
                     if (I.a(100L, this) === var4) {
                        return var4;
                     }
                  }

                  return Unit.a;
               }
            },
            3,
            null
         )
      );
   }

   public fun stopPlayerProgressInterval(mediaSource: MediaSource) {
      if (var1.getPortal() != null) {
         val var2: Job = this.mediaPlayerProgressMap.remove(var1.getPortal());
         if (var2 != null) {
            kotlinx.coroutines.Job.a.a(var2, null, 1, null);
         }
      }
   }

   @ReactMethod
   public fun subscribeToPlaybackEvents() {
      db.f.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, null) {
            int label;
            final MediaPlayerManagerModule this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = gb.e.g(
                     gb.e.p(
                        MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release(),
                        new Function2<Pair<? extends MediaSource, ? extends java.lang.Double>, Continuation, Object>(null) {
                           Object L$0;
                           int label;

                           {
                              super(2, var1);
                           }

                           public final Continuation create(Object var1, Continuation var2) {
                              val var3x: Function2 = new <anonymous constructor>(var2);
                              var3x.L$0 = var1;
                              return var3x;
                           }

                           public final Object invoke(Pair<MediaSource, java.lang.Double> var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              G9.b.e();
                              if (this.label == 0) {
                                 kotlin.c.b(var1);
                                 return (this.L$0 as Pair).a() as MediaSource;
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        }
                     )
                  );
                  val var4: Function2 = new Function2<MediaSource, Continuation, Object>(this.this$0, null) {
                     Object L$0;
                     int label;
                     final MediaPlayerManagerModule this$0;

                     {
                        super(2, var2x);
                        this.this$0 = var1;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
                        var3.L$0 = var1;
                        return var3;
                     }

                     public final Object invoke(MediaSource var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        G9.b.e();
                        if (this.label == 0) {
                           kotlin.c.b(var1);
                           var1 = this.L$0 as MediaSource;
                           val var3x: ReactEvents = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
                           val var2x: ReactApplicationContext = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
                           val var5: MediaPlayerPlaybackSource;
                           if (var1 != null) {
                              var5 = MediaPlayerPlaybackSource.Companion.fromMediaSource(var1);
                           } else {
                              var5 = null;
                           }

                           var3x.emitModuleEvent(var2x, new MediaPlayerPlaybackSourceChanged(var5));
                           return Unit.a;
                        } else {
                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                     }
                  };
                  this.label = 1;
                  if (gb.e.e(var1, var4, this) === var3) {
                     return var3;
                  }
               }

               return Unit.a;
            }
         },
         3,
         null
      );
      db.f.d(this.scope, null, null, new Function2<CoroutineScope, Continuation, Object>(this, null) {
         int label;
         final MediaPlayerManagerModule this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = G9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               val var4: MutableStateFlow = MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release();
               var1 = new Function2<Pair<? extends MediaSource, ? extends java.lang.Double>, Continuation, Object>(this.this$0, null) {
                  Object L$0;
                  int label;
                  final MediaPlayerManagerModule this$0;

                  {
                     super(2, var2x);
                     this.this$0 = var1;
                  }

                  public final Continuation create(Object var1, Continuation var2) {
                     val var3x: Function2 = new <anonymous constructor>(this.this$0, var2);
                     var3x.L$0 = var1;
                     return var3x;
                  }

                  public final Object invoke(Pair<MediaSource, java.lang.Double> var1, Continuation var2x) {
                     return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                  }

                  public final Object invokeSuspend(Object var1) {
                     G9.b.e();
                     if (this.label == 0) {
                        kotlin.c.b(var1);
                        val var4: Pair = this.L$0 as Pair;
                        var1 = (this.L$0 as Pair).a() as MediaSource;
                        val var2x: Double = (var4.b() as java.lang.Number).doubleValue();
                        val var8: ReactEvents = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
                        val var5: ReactApplicationContext = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
                        val var7: MediaPlayerPlaybackSource;
                        if (var1 != null) {
                           var7 = MediaPlayerPlaybackSource.Companion.fromMediaSource(var1);
                        } else {
                           var7 = null;
                        }

                        var8.emitModuleEvent(var5, new MediaPlayerPlaybackRateChanged(var7, var2x));
                        return Unit.a;
                     } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }
                  }
               };
               this.label = 1;
               if (gb.e.e(var4, var1, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 3, null);
      db.f.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, null) {
            int label;
            final MediaPlayerManagerModule this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = MediaPlayerManager.INSTANCE.getPlaybackProgressFlow$media_player_release();
                  val var4: Function2 = new Function2<MediaPlayerManager.PlaybackProgress, Continuation, Object>(this.this$0, null) {
                     Object L$0;
                     int label;
                     final MediaPlayerManagerModule this$0;

                     {
                        super(2, var2x);
                        this.this$0 = var1;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        val var3x: Function2 = new <anonymous constructor>(this.this$0, var2);
                        var3x.L$0 = var1;
                        return var3x;
                     }

                     public final Object invoke(MediaPlayerManager.PlaybackProgress var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        G9.b.e();
                        if (this.label == 0) {
                           kotlin.c.b(var1);
                           var1 = this.L$0 as MediaPlayerManager.PlaybackProgress;
                           MediaPlayerManagerModule.access$onMediaPlayerPlaybackProgress(
                              this.this$0, (this.L$0 as MediaPlayerManager.PlaybackProgress).getSource(), var1.getTimeMs(), var1.getDurationMs()
                           );
                           return Unit.a;
                        } else {
                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                     }
                  };
                  this.label = 1;
                  if (gb.e.e(var1, var4, this) === var3) {
                     return var3;
                  }
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }

   @ReactMethod
   public fun toggle(portal: Double, play: Boolean) {
      this.withPlayer(var1, new e(var3, this, var1));
   }

   public companion object {
      internal const val NAME: String
   }
}
