package com.discord.image.animated_image.apng

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.widget.m
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.FileDownloader
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.linecorp.apng.ApngDrawable
import java.io.File
import java.security.MessageDigest
import java.util.Arrays
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import mc.K
import mc.d0

public class APNGView(context: Context) : m(var1) {
   public final var onImageLoaded: ((String) -> Unit)?
   private final val apngStateManager: AnimatedImageStateManager<com.discord.image.animated_image.apng.APNGView.Config> =
      new AnimatedImageStateManager(new b(this), new c(this), new d(this), new e(this), new f(this), new g(this))

   @JvmStatic
   fun `apngStateManager$lambda$0`(var0: APNGView): Unit {
      var0.playApngAnimation();
      return Unit.a;
   }

   @JvmStatic
   fun `apngStateManager$lambda$1`(var0: APNGView): Unit {
      var0.pauseApngAnimation();
      return Unit.a;
   }

   @JvmStatic
   fun `apngStateManager$lambda$2`(var0: APNGView): Unit {
      var0.stopApngAnimation();
      return Unit.a;
   }

   @JvmStatic
   fun `apngStateManager$lambda$3`(var0: APNGView, var1: APNGView.Config): Unit {
      recycle$default(var0, false, false, 2, null);
      return Unit.a;
   }

   @JvmStatic
   fun `apngStateManager$lambda$4`(var0: APNGView, var1: APNGView.Config): Boolean {
      val var2: Boolean;
      if (var0.isAttachedToWindow() && APNGView.Companion.access$hasFilename(Companion, var1.getUrl())) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   @JvmStatic
   fun `apngStateManager$lambda$5`(var0: APNGView, var1: APNGView.Config): Unit {
      var0.fetchAPNG(var1);
      return Unit.a;
   }

   private fun fetchAPNG(config: com.discord.image.animated_image.apng.APNGView.Config) {
      mc.f.d(
         CoroutineViewUtilsKt.attachedScope(this, true),
         K.b(),
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, var1, null) {
            final APNGView.Config $config;
            int label;
            final APNGView this$0;

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
               val var3: Any = Oa.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = FileDownloader.INSTANCE;
                  val var4: Context = this.this$0.getContext();
                  val var6: Flow = FileDownloader.downloadFile$default(
                     var1,
                     var4,
                     this.$config.getUrl(),
                     APNGView.Companion.access$getFilename(APNGView.Companion, this.$config.getUrl()),
                     new File(this.this$0.getContext().getCacheDir(), this.$config.getCacheDirectory()),
                     false,
                     16,
                     null
                  );
                  val var7: FlowCollector = new FlowCollector(this.this$0, this.$config) {
                     final APNGView.Config $config;
                     final APNGView this$0;

                     {
                        this.this$0 = var1;
                        this.$config = var2x;
                     }

                     public final Object emit(DownloadState var1, Continuation var2x) {
                        label62: {
                           if (var2x is <unrepresentable>) {
                              val var4x: <unrepresentable> = var2x as <unrepresentable>;
                              if (((var2x as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                                 var4x.label = (var2x as <unrepresentable>).label + Integer.MIN_VALUE;
                                 var14 = var4x;
                                 break label62;
                              }
                           }

                           var14 = new kotlin.coroutines.jvm.internal.d(this, var2x) {
                              Object L$0;
                              int label;
                              Object result;
                              final <unrepresentable><T> this$0;

                              {
                                 super(var2x);
                                 this.this$0 = var1;
                              }

                              public final Object invokeSuspend(Object var1) {
                                 this.result = var1;
                                 this.label |= Integer.MIN_VALUE;
                                 return this.this$0.emit(null, this);
                              }
                           };
                        }

                        var var5: Any = ((<unrepresentable>)var14).result;
                        val var16: Any = Oa.b.e();
                        val var9: <unrepresentable>;
                        if (((<unrepresentable>)var14).label != 0) {
                           if (((<unrepresentable>)var14).label != 1) {
                              if (((<unrepresentable>)var14).label != 2) {
                                 if (((<unrepresentable>)var14).label != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                 }

                                 kotlin.c.b(var5);
                                 return Unit.a;
                              }

                              kotlin.c.b(var5);
                              return Unit.a;
                           }

                           var9 = ((<unrepresentable>)var14).L$0 as <unrepresentable>;

                           try {
                              kotlin.c.b(var5);
                              return Unit.a;
                           } catch (var7x: Exception) {
                           }
                        } else {
                           label82: {
                              kotlin.c.b(var5);
                              if (var1 !is DownloadState.Completed) {
                                 if (var1 is DownloadState.Failure) {
                                    val var13: d0 = K.c();
                                    var5 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, null) {
                                       int label;
                                       final APNGView this$0;

                                       {
                                          super(2, var2x);
                                          this.this$0 = var1;
                                       }

                                       public final Continuation create(Object var1, Continuation var2x) {
                                          return new <anonymous constructor>(this.this$0, var2x);
                                       }

                                       public final Object invoke(CoroutineScope var1, Continuation var2x) {
                                          return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                       }

                                       public final Object invokeSuspend(Object var1) {
                                          Oa.b.e();
                                          if (this.label == 0) {
                                             kotlin.c.b(var1);
                                             AnimatedImageStateManager.onFetchFinished$default(
                                                APNGView.access$getApngStateManager$p(this.this$0), false, false, 2, null
                                             );
                                             return Unit.a;
                                          } else {
                                             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                          }
                                       }
                                    };
                                    ((<unrepresentable>)var14).label = 3;
                                    if (mc.f.g(var13, (Function2)var5, (Continuation)var14) === var16) {
                                       return var16;
                                    }

                                    return Unit.a;
                                 }

                                 return Unit.a;
                              }

                              try {
                                 val var6x: ApngDrawable = com.linecorp.apng.ApngDrawable.b.c(
                                    ApngDrawable.H, (var1 as DownloadState.Completed).getFile(), null, null, 6, null
                                 );
                                 var5 = K.c();
                                 val var11: Function2 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, var6x, this.$config, null) {
                                    final APNGView.Config $config;
                                    final ApngDrawable $drawable;
                                    int label;
                                    final APNGView this$0;

                                    {
                                       super(2, var4x);
                                       this.this$0 = var1;
                                       this.$drawable = var2x;
                                       this.$config = var3x;
                                    }

                                    public final Continuation create(Object var1, Continuation var2) {
                                       return new <anonymous constructor>(this.this$0, this.$drawable, this.$config, var2);
                                    }

                                    public final Object invoke(CoroutineScope var1, Continuation var2x) {
                                       return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                    }

                                    public final Object invokeSuspend(Object var1) {
                                       Oa.b.e();
                                       if (this.label == 0) {
                                          kotlin.c.b(var1);
                                          var1 = null;
                                          this.this$0.setImageDrawable(null);
                                          this.this$0.setImageDrawable(this.$drawable);
                                          this.this$0.setBackground(null);
                                          APNGView.access$getApngStateManager$p(this.this$0).onFetchFinished(true, this.$config.getAnimate());
                                          val var4: Function1 = this.this$0.getOnImageLoaded();
                                          if (var4 != null) {
                                             var4.invoke(this.$config.getUrl());
                                             var1 = Unit.a;
                                          }

                                          return var1;
                                       } else {
                                          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                       }
                                    }
                                 };
                                 ((<unrepresentable>)var14).L$0 = this;
                                 ((<unrepresentable>)var14).label = 1;
                                 var12 = mc.f.g((CoroutineContext)var5, var11, (Continuation)var14);
                              } catch (var8: Exception) {
                                 var9 = this;
                                 break label82;
                              }

                              if (var12 === var16) {
                                 return var16;
                              }

                              return Unit.a;
                           }
                        }

                        var5 = K.c();
                        val var10: Function2 = new Function2<CoroutineScope, Continuation, Object>(var9.this$0, null) {
                           int label;
                           final APNGView this$0;

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
                              Oa.b.e();
                              if (this.label == 0) {
                                 kotlin.c.b(var1);
                                 return kotlin.coroutines.jvm.internal.b.a(
                                    AnimatedImageStateManager.onFetchFinished$default(APNGView.access$getApngStateManager$p(this.this$0), false, false, 2, null)
                                 );
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        ((<unrepresentable>)var14).L$0 = null;
                        ((<unrepresentable>)var14).label = 2;
                        return if (mc.f.g((CoroutineContext)var5, var10, (Continuation)var14) === var16) var16 else Unit.a;
                     }
                  };
                  this.label = 1;
                  if (var6.collect(var7, this) === var3) {
                     return var3;
                  }
               }

               return Unit.a;
            }
         },
         2,
         null
      );
   }

   private fun pauseApngAnimation() {
      val var1: Drawable = this.getDrawable();
      val var2: ApngDrawable;
      if (var1 is ApngDrawable) {
         var2 = var1 as ApngDrawable;
      } else {
         var2 = null;
      }

      if (var2 != null) {
         var2.stop();
      }
   }

   private fun playApngAnimation() {
      val var1: Drawable = this.getDrawable();
      val var2: ApngDrawable;
      if (var1 is ApngDrawable) {
         var2 = var1 as ApngDrawable;
      } else {
         var2 = null;
      }

      if (var2 != null) {
         var2.start();
      }
   }

   private fun stopApngAnimation() {
      val var1: Drawable = this.getDrawable();
      val var2: ApngDrawable;
      if (var1 is ApngDrawable) {
         var2 = var1 as ApngDrawable;
      } else {
         var2 = null;
      }

      if (var2 != null) {
         var2.stop();
         var2.k(0L);
      }
   }

   public fun loadImage(config: com.discord.image.animated_image.apng.APNGView.Config) {
      this.apngStateManager.onTryFetch(var1);
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.apngStateManager.onAttachedToWindow();
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.apngStateManager.onDetachedFromWindow();
   }

   public fun pause() {
      this.apngStateManager.pause();
   }

   public fun play() {
      this.apngStateManager.play();
   }

   public fun recycle(resetState: Boolean = false, showLoading: Boolean = false) {
      val var3: Drawable = this.getDrawable();
      if (var3 is ApngDrawable) {
         val var4: ApngDrawable = var3 as ApngDrawable;
         (var3 as ApngDrawable).stop();
         var4.j();
      }

      this.setImageDrawable(null);
      if (var1) {
         this.apngStateManager.reset();
      }

      if (var2) {
         this.setBackground(null);
      }
   }

   public fun seek(positionMillis: Long) {
      val var3: Drawable = this.getDrawable();
      val var4: ApngDrawable;
      if (var3 is ApngDrawable) {
         var4 = var3 as ApngDrawable;
      } else {
         var4 = null;
      }

      if (var4 != null) {
         var4.k(var1);
      }
   }

   @SourceDebugExtension(["SMAP\nAPNGView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APNGView.kt\ncom/discord/image/animated_image/apng/APNGView$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,170:1\n12834#2,3:171\n*S KotlinDebug\n*F\n+ 1 APNGView.kt\ncom/discord/image/animated_image/apng/APNGView$Companion\n*L\n153#1:171,3\n*E\n"])
   public companion object {
      private fun getFilename(url: String): String {
         val var4: MessageDigest = MessageDigest.getInstance("SHA-256");
         val var7: ByteArray = var1.getBytes(Charsets.UTF_8);
         val var9: ByteArray = var4.digest(var7);
         val var3: Int = var9.length;
         var1 = "";

         for (int var2 = 0; var2 < var3; var2++) {
            val var6: java.lang.String = java.lang.String.format("%02x", Arrays.copyOf(new Object[]{var9[var2]}, 1));
            val var5: StringBuilder = new StringBuilder();
            var5.append(var1);
            var5.append(var6);
            var1 = var5.toString();
         }

         return var1;
      }

      private fun hasFilename(url: String): Boolean {
         return StringsKt.c0(this.getFilename(var1)) xor true;
      }
   }

   public data class Config(url: String, animate: Boolean, showLoading: Boolean = true, widthDp: Int?, heightDp: Int?, cacheDirectory: String) {
      public final val url: String
      public final val animate: Boolean
      public final val showLoading: Boolean
      public final val widthDp: Int?
      public final val heightDp: Int?
      public final val cacheDirectory: String

      init {
         this.url = var1;
         this.animate = var2;
         this.showLoading = var3;
         this.widthDp = var4;
         this.heightDp = var5;
         this.cacheDirectory = var6;
      }

      public operator fun component1(): String {
         return this.url;
      }

      public operator fun component2(): Boolean {
         return this.animate;
      }

      public operator fun component3(): Boolean {
         return this.showLoading;
      }

      public operator fun component4(): Int? {
         return this.widthDp;
      }

      public operator fun component5(): Int? {
         return this.heightDp;
      }

      public operator fun component6(): String {
         return this.cacheDirectory;
      }

      public fun copy(
         url: String = var0.url,
         animate: Boolean = var0.animate,
         showLoading: Boolean = var0.showLoading,
         widthDp: Int? = var0.widthDp,
         heightDp: Int? = var0.heightDp,
         cacheDirectory: String = var0.cacheDirectory
      ): com.discord.image.animated_image.apng.APNGView.Config {
         return new APNGView.Config(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is APNGView.Config) {
            return false;
         } else {
            var1 = var1;
            if (!(this.url == var1.url)) {
               return false;
            } else if (this.animate != var1.animate) {
               return false;
            } else if (this.showLoading != var1.showLoading) {
               return false;
            } else if (!(this.widthDp == var1.widthDp)) {
               return false;
            } else if (!(this.heightDp == var1.heightDp)) {
               return false;
            } else {
               return this.cacheDirectory == var1.cacheDirectory;
            }
         }
      }

      public override fun hashCode(): Int {
         val var5: Int = this.url.hashCode();
         val var3: Int = java.lang.Boolean.hashCode(this.animate);
         val var4: Int = java.lang.Boolean.hashCode(this.showLoading);
         var var2: Int = 0;
         val var1: Int;
         if (this.widthDp == null) {
            var1 = 0;
         } else {
            var1 = this.widthDp.hashCode();
         }

         if (this.heightDp != null) {
            var2 = this.heightDp.hashCode();
         }

         return ((((var5 * 31 + var3) * 31 + var4) * 31 + var1) * 31 + var2) * 31 + this.cacheDirectory.hashCode();
      }

      public override fun toString(): String {
         val var7: java.lang.String = this.url;
         val var1: Boolean = this.animate;
         val var2: Boolean = this.showLoading;
         val var6: Int = this.widthDp;
         val var3: Int = this.heightDp;
         val var4: java.lang.String = this.cacheDirectory;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Config(url=");
         var5.append(var7);
         var5.append(", animate=");
         var5.append(var1);
         var5.append(", showLoading=");
         var5.append(var2);
         var5.append(", widthDp=");
         var5.append(var6);
         var5.append(", heightDp=");
         var5.append(var3);
         var5.append(", cacheDirectory=");
         var5.append(var4);
         var5.append(")");
         return var5.toString();
      }
   }
}
