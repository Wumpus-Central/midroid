package com.discord.media_player

import ab.I
import ab.K
import ab.T
import ab.d0
import ab.k0
import android.app.Activity
import android.view.View
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
import db.w
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.UUID
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.time.Duration
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import r9.s

@ReactModule(name = "MediaPlayerManager")
public class MediaPlayerManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val mediaPlayerProgressMap: MutableMap<Double, Job>
   private final val scope: CoroutineScope
   private final var _pausePlayerFlow: MutableStateFlow<String?>
   public final val pausePlayerFlow: Flow<String?>
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.mediaPlayerProgressMap = new LinkedHashMap<>();
      val var2: CompletableJob = k0.b(null, 1, null);
      val var3: ExecutorService = Executors.newSingleThreadExecutor();
      q.g(var3, "newSingleThreadExecutor(...)");
      this.scope = kotlinx.coroutines.g.a(var2.Q(T.b(var3)));
      val var4: MutableStateFlow = w.a(null);
      this._pausePlayerFlow = var4;
      this.pausePlayerFlow = var4;
      this.reactEvents = new ReactEvents(
         s.a("MediaPlayerPlaybackProgressUpdated", G.b(MediaPlayerPlaybackProgressUpdated.class)),
         s.a("MediaPlayerPlaybackRateChanged", G.b(MediaPlayerPlaybackRateChanged.class)),
         s.a("MediaPlayerPlaybackSourceChanged", G.b(MediaPlayerPlaybackSourceChanged.class)),
         s.a("MediaPlayerPause", G.b(MediaPlayerPause.class)),
         s.a("MediaPlayerProgress", G.b(MediaPlayerProgress.class)),
         s.a("MediaPlayerDownloadProgress", G.b(MediaPlayerDownloadProgress.class)),
         s.a("MediaPlayerMuteStateChanged", G.b(MediaPlayerMuteStateChanged.class)),
         s.a("MediaPlayerViewWillAppear", G.b(MediaPlayerViewWillAppear.class)),
         s.a("MediaPlayerViewDidDisappear", G.b(MediaPlayerViewDidDisappear.class))
      );
   }

   @JvmStatic
   fun `changeProgress$lambda$1`(var0: Double, var2: SimpleExoPlayer): Unit {
      q.h(var2, "player");
      val var3: kotlin.time.Duration.a = Duration.k;
      var2.l0(Duration.x(kotlin.time.b.r(var0, Za.b.n)));
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
            val var14: ReactEvents = this.reactEvents;
            val var12: ReactApplicationContext = this.reactContext;
            val var15: kotlin.time.Duration.a = Duration.k;
            val var16: Za.b = Za.b.m;
            var2 = kotlin.time.b.t(var2, Za.b.m);
            val var17: Za.b = Za.b.n;
            var14.emitModuleEvent(var12, new MediaPlayerProgress(var6, Duration.N(var2, Za.b.n), Duration.N(kotlin.time.b.t(var4, var16), var17)));
         }
      }
   }

   @JvmStatic
   fun `setLoopPlayback$lambda$3`(var0: Boolean, var1: SimpleExoPlayer): Unit {
      q.h(var1, "player");
      if (var0) {
         var1.N(1);
      } else {
         var1.N(0);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `setMuted$lambda$2`(var0: Boolean, var1: SimpleExoPlayer): Unit {
      q.h(var1, "player");
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
      q.h(var4, "player");
      if (var0 && var4.F() == 11) {
         var4.l0(0L);
      }

      if (var4.I() == var0) {
         return Unit.a;
      } else {
         var4.z(var0);
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
      q.h(var1, "type");
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
      q.h(var3, "mediaSources");
      return ab.f.d(this.scope, K.c(), null, new Function2(this, var1, var3, null) {
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
            y9.b.e();
            if (this.label != 0) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
               kotlin.c.b(var1);
               var1 = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
               val var7: ReactApplicationContext = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
               val var5: java.lang.String = ChannelId.toString-impl(this.$channelId);
               val var4: Array<MediaSource> = this.$mediaSources;
               val var6: ArrayList = new ArrayList(this.$mediaSources.length);
               val var3: Int = var4.length;

               for (int var2x = 0; var2x < var3; var2x++) {
                  var6.add(MediaPlayerPlaybackSource.Companion.createId(var4[var2x]));
               }

               var1.emitModuleEvent(var7, new MediaPlayerViewDidDisappear(var5, var6));
               return Unit.a;
            }
         }
      }, 2, null);
   }

   public fun onMediaPlayerViewWillAppear(channelId: ChannelId, vararg mediaSources: MediaSource): Job {
      q.h(var3, "mediaSources");
      return ab.f.d(this.scope, K.c(), null, new Function2(this, var1, var3, null) {
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
            y9.b.e();
            if (this.label != 0) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
               kotlin.c.b(var1);
               val var4: ReactEvents = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
               var1 = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
               val var6: java.lang.String = ChannelId.toString-impl(this.$channelId);
               val var7: Array<MediaSource> = this.$mediaSources;
               val var5: ArrayList = new ArrayList(this.$mediaSources.length);
               val var3: Int = var7.length;

               for (int var2x = 0; var2x < var3; var2x++) {
                  var5.add(MediaPlayerPlaybackSource.Companion.createId(var7[var2x]));
               }

               var4.emitModuleEvent(var1, new MediaPlayerViewWillAppear(var6, var5));
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
      q.h(var1, "mediaSource");
      q.h(var2, "mediaPlayer");
      this.stopPlayerProgressInterval(var1);
      this.onMediaPlayerPlaybackProgress(var1, var2.currentPositionMs(), var2.durationMs());
      val var4: java.util.Map = this.mediaPlayerProgressMap;
      val var3: java.lang.Double = var1.getPortal();
      q.e(var3);
      var4.put(
         var3,
         ab.f.d(
            this.scope,
            null,
            null,
            new Function2(var2, this, var1, null) {
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
                  val var4: Any = y9.b.e();
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
                     val var5: Function2 = new Function2(this.$mediaPlayer, this.this$0, this.$mediaSource, null) {
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
                           y9.b.e();
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
                     if (ab.f.g(var8, var5, this) === var4) {
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
      q.h(var1, "mediaSource");
      if (var1.getPortal() != null) {
         val var2: Job = this.mediaPlayerProgressMap.remove(var1.getPortal());
         if (var2 != null) {
            kotlinx.coroutines.Job.a.a(var2, null, 1, null);
         }
      }
   }

   @ReactMethod
   public fun subscribeToPlaybackEvents() {
      ab.f.d(this.scope, null, null, new Function2(this, null) {
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
            val var3: Any = y9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               var1 = db.e.g(db.e.o(MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release(), new Function2(null) {
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

                  public final Object invoke(Pair var1, Continuation var2x) {
                     return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                  }

                  public final Object invokeSuspend(Object var1) {
                     y9.b.e();
                     if (this.label == 0) {
                        kotlin.c.b(var1);
                        return (this.L$0 as Pair).a() as MediaSource;
                     } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }
                  }
               }));
               val var4: Function2 = new Function2(this.this$0, null) {
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
                     y9.b.e();
                     if (this.label == 0) {
                        kotlin.c.b(var1);
                        var1 = this.L$0 as MediaSource;
                        val var2x: ReactEvents = MediaPlayerManagerModule.access$getReactEvents$p(this.this$0);
                        val var3x: ReactApplicationContext = MediaPlayerManagerModule.access$getReactContext$p(this.this$0);
                        val var5: MediaPlayerPlaybackSource;
                        if (var1 != null) {
                           var5 = MediaPlayerPlaybackSource.Companion.fromMediaSource(var1);
                        } else {
                           var5 = null;
                        }

                        var2x.emitModuleEvent(var3x, new MediaPlayerPlaybackSourceChanged(var5));
                        return Unit.a;
                     } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }
                  }
               };
               this.label = 1;
               if (db.e.e(var1, var4, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 3, null);
      ab.f.d(this.scope, null, null, new Function2(this, null) {
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
            val var3: Any = y9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               val var4: MutableStateFlow = MediaPlayerManager.INSTANCE.getPlaybackRateFlow$media_player_release();
               var1 = new Function2(this.this$0, null) {
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

                  public final Object invoke(Pair var1, Continuation var2x) {
                     return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                  }

                  public final Object invokeSuspend(Object var1) {
                     y9.b.e();
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
               if (db.e.e(var4, var1, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 3, null);
      ab.f.d(
         this.scope,
         null,
         null,
         new Function2(this, null) {
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
               val var3: Any = y9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  val var4: MutableStateFlow = MediaPlayerManager.INSTANCE.getPlaybackProgressFlow$media_player_release();
                  var1 = new Function2(this.this$0, null) {
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
                        y9.b.e();
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
                  if (db.e.e(var4, var1, this) === var3) {
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
