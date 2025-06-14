package com.discord.sticker.sticker_types

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import cb.K
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.FileDownloader
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.rlottie.RLottieDrawable
import com.discord.theme.ThemeManagerKt
import java.io.File
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

internal class RLottieImageView(context: Context) : com.discord.rlottie.RLottieImageView {
   private final val placeholder: ShapeDrawable
   private final val rLottieStateManager: AnimatedImageStateManager<com.discord.sticker.sticker_types.RLottieImageView.Config>

   init {
      q.h(var1, "context");
      super(var1);
      val var2: ShapeDrawable = new ShapeDrawable();
      var2.setShape(new OvalShape());
      var2.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      this.placeholder = var2;
      this.rLottieStateManager = new AnimatedImageStateManager<>(new a(this), new b(this), null, new c(this), new d(this), new e(this), 4, null);
   }

   private fun fetchSticker(config: com.discord.sticker.sticker_types.RLottieImageView.Config) {
      cb.f.d(
         CoroutineViewUtilsKt.getAttachedScope(this),
         K.b(),
         null,
         new Function2(this, var1, null) {
            final RLottieImageView.Config $config;
            int label;
            final RLottieImageView this$0;

            {
               super(2, var3);
               this.this$0 = var1;
               this.$config = var2x;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, this.$config, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = A9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     if (this.label != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var1);
                     return Unit.a;
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = K.c();
                  val var4: Function2 = new Function2(this.this$0, null) {
                     int label;
                     final RLottieImageView this$0;

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
                        A9.b.e();
                        if (this.label == 0) {
                           kotlin.c.b(var1);
                           this.this$0.clearAnimation();
                           return Unit.a;
                        } else {
                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                     }
                  };
                  this.label = 1;
                  if (cb.f.g(var1, var4, this) === var3) {
                     return var3;
                  }
               }

               val var5: FileDownloader = FileDownloader.INSTANCE;
               val var11: Context = this.this$0.getContext();
               q.g(var11, "getContext(...)");
               val var6: java.lang.String = this.$config.getUrl();
               val var7: java.lang.String = this.$config.getAsset();
               val var9: StringBuilder = new StringBuilder();
               var9.append(var7);
               var9.append(".json");
               val var12: Flow = FileDownloader.downloadFile$default(
                  var5, var11, var6, var9.toString(), new File(this.this$0.getContext().getCacheDir(), "stickers"), false, 16, null
               );
               val var10: FlowCollector = new FlowCollector(this.this$0, this.$config) {
                  final RLottieImageView.Config $config;
                  final RLottieImageView this$0;

                  {
                     this.this$0 = var1;
                     this.$config = var2x;
                  }

                  public final Object emit(DownloadState var1, Continuation var2x) {
                     if (var1 is DownloadState.Completed) {
                        val var4x: Any = cb.f.g(K.c(), new Function2(this.this$0, var1, this.$config, null) {
                           final RLottieImageView.Config $config;
                           final DownloadState $downloadState;
                           int label;
                           final RLottieImageView this$0;

                           {
                              super(2, var4x);
                              this.this$0 = var1;
                              this.$downloadState = var2x;
                              this.$config = var3x;
                           }

                           public final Continuation create(Object var1, Continuation var2x) {
                              return new <anonymous constructor>(this.this$0, this.$downloadState, this.$config, var2x);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              A9.b.e();
                              if (this.label == 0) {
                                 kotlin.c.b(var1);
                                 this.this$0.setImageDrawable(null);
                                 val var6: RLottieImageView = this.this$0;
                                 val var5: Context = this.this$0.getContext();
                                 q.g(var5, "getContext(...)");
                                 val var7: File = (this.$downloadState as DownloadState.Completed).getFile();
                                 val var2x: Int = SizeUtilsKt.getDpToPx(this.$config.getWidthDp());
                                 val var3: Int = SizeUtilsKt.getDpToPx(this.$config.getHeightDp());
                                 val var4x: Int = this.$config.getRenderMode();
                                 if (var4x != 0) {
                                    if (var4x != 1) {
                                       var1 = RLottieDrawable.PlaybackMode.ONCE;
                                    } else {
                                       var1 = RLottieDrawable.PlaybackMode.FREEZE;
                                    }
                                 } else {
                                    var1 = RLottieDrawable.PlaybackMode.LOOP;
                                 }

                                 var6.setAnimation(var5, var7, var2x, var3, var1);
                                 this.this$0.setBackground(null);
                                 RLottieImageView.access$getRLottieStateManager$p(this.this$0).onFetchFinished(true, this.$config.getAnimate());
                                 return Unit.a;
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        }, var2x);
                        return if (var4x === A9.b.e()) var4x else Unit.a;
                     } else if (var1 is DownloadState.Failure) {
                        val var3x: Any = cb.f.g(
                           K.c(),
                           new Function2(this.this$0, null) {
                              int label;
                              final RLottieImageView this$0;

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
                                 A9.b.e();
                                 if (this.label == 0) {
                                    kotlin.c.b(var1);
                                    AnimatedImageStateManager.onFetchFinished$default(
                                       RLottieImageView.access$getRLottieStateManager$p(this.this$0), false, false, 2, null
                                    );
                                    return Unit.a;
                                 } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                 }
                              }
                           },
                           var2x
                        );
                        return if (var3x === A9.b.e()) var3x else Unit.a;
                     } else {
                        return Unit.a;
                     }
                  }
               };
               this.label = 2;
               return if (var12.collect(var10, this) === var3) var3 else Unit.a;
            }
         },
         2,
         null
      );
   }

   @JvmStatic
   fun `rLottieStateManager$lambda$1`(var0: RLottieImageView): Unit {
      var0.playAnimation();
      return Unit.a;
   }

   @JvmStatic
   fun `rLottieStateManager$lambda$2`(var0: RLottieImageView): Unit {
      var0.pauseAnimation();
      return Unit.a;
   }

   @JvmStatic
   fun `rLottieStateManager$lambda$3`(var0: RLottieImageView, var1: RLottieImageView.Config): Unit {
      q.h(var1, "it");
      var0.recycle(false);
      return Unit.a;
   }

   @JvmStatic
   fun `rLottieStateManager$lambda$4`(var0: RLottieImageView, var1: RLottieImageView.Config): Boolean {
      q.h(var1, "it");
      return var0.isAttachedToWindow();
   }

   @JvmStatic
   fun `rLottieStateManager$lambda$5`(var0: RLottieImageView, var1: RLottieImageView.Config): Unit {
      q.h(var1, "config");
      var0.fetchSticker(var1);
      return Unit.a;
   }

   public fun loadImage(config: com.discord.sticker.sticker_types.RLottieImageView.Config) {
      q.h(var1, "config");
      this.rLottieStateManager.onTryFetch(var1);
   }

   protected override fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.rLottieStateManager.onAttachedToWindow();
   }

   protected override fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.rLottieStateManager.onDetachedFromWindow();
   }

   public fun recycle(resetState: Boolean = false) {
      val var2: Drawable = this.getDrawable();
      if (var2 is RLottieDrawable) {
         val var3: RLottieDrawable = var2 as RLottieDrawable;
         (var2 as RLottieDrawable).stop();
         var3.recycle();
      }

      this.setImageDrawable(null);
      if (var1) {
         this.rLottieStateManager.reset();
      }

      this.setBackground(this.placeholder);
   }

   public data class Config(url: String, animate: Boolean, widthDp: Int, heightDp: Int, asset: String, renderMode: Int) {
      public final val url: String
      public final val animate: Boolean
      public final val widthDp: Int
      public final val heightDp: Int
      public final val asset: String
      public final val renderMode: Int

      init {
         q.h(var1, "url");
         q.h(var5, "asset");
         super();
         this.url = var1;
         this.animate = var2;
         this.widthDp = var3;
         this.heightDp = var4;
         this.asset = var5;
         this.renderMode = var6;
      }

      public operator fun component1(): String {
         return this.url;
      }

      public operator fun component2(): Boolean {
         return this.animate;
      }

      public operator fun component3(): Int {
         return this.widthDp;
      }

      public operator fun component4(): Int {
         return this.heightDp;
      }

      public operator fun component5(): String {
         return this.asset;
      }

      public operator fun component6(): Int {
         return this.renderMode;
      }

      public fun copy(
         url: String = var0.url,
         animate: Boolean = var0.animate,
         widthDp: Int = var0.widthDp,
         heightDp: Int = var0.heightDp,
         asset: String = var0.asset,
         renderMode: Int = var0.renderMode
      ): com.discord.sticker.sticker_types.RLottieImageView.Config {
         q.h(var1, "url");
         q.h(var5, "asset");
         return new RLottieImageView.Config(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is RLottieImageView.Config) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.url, var1.url)) {
               return false;
            } else if (this.animate != var1.animate) {
               return false;
            } else if (this.widthDp != var1.widthDp) {
               return false;
            } else if (this.heightDp != var1.heightDp) {
               return false;
            } else if (!q.c(this.asset, var1.asset)) {
               return false;
            } else {
               return this.renderMode == var1.renderMode;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (
                           ((this.url.hashCode() * 31 + java.lang.Boolean.hashCode(this.animate)) * 31 + Integer.hashCode(this.widthDp)) * 31
                              + Integer.hashCode(this.heightDp)
                        )
                        * 31
                     + this.asset.hashCode()
               )
               * 31
            + Integer.hashCode(this.renderMode);
      }

      public override fun toString(): String {
         val var7: java.lang.String = this.url;
         val var4: Boolean = this.animate;
         val var1: Int = this.widthDp;
         val var3: Int = this.heightDp;
         val var5: java.lang.String = this.asset;
         val var2: Int = this.renderMode;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Config(url=");
         var6.append(var7);
         var6.append(", animate=");
         var6.append(var4);
         var6.append(", widthDp=");
         var6.append(var1);
         var6.append(", heightDp=");
         var6.append(var3);
         var6.append(", asset=");
         var6.append(var5);
         var6.append(", renderMode=");
         var6.append(var2);
         var6.append(")");
         return var6.toString();
      }
   }
}
