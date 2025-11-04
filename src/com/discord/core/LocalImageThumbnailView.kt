package com.discord.core

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.util.AttributeSet
import android.util.Size
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.FrameLayout.LayoutParams
import android.widget.ImageView.ScaleType
import com.discord.crash_reporting.CrashReporting
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils$ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.request.ImageRequestBuilder
import gu.c1
import gu.m0
import ht.v
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import ot.b

@SourceDebugExtension(["SMAP\nLocalImageThumbnailView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageThumbnailView.kt\ncom/discord/core/LocalImageThumbnailView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,122:1\n257#2,2:123\n257#2,2:125\n*S KotlinDebug\n*F\n+ 1 LocalImageThumbnailView.kt\ncom/discord/core/LocalImageThumbnailView\n*L\n103#1:123,2\n104#1:125,2\n*E\n"])
public class LocalImageThumbnailView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(var1, var2, var3) {
   private final var imageView: ImageView
   private final var simpleDraweeView: SimpleDraweeView

   fun LocalImageThumbnailView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun LocalImageThumbnailView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var5: ImageView = new ImageView(var1);
      this.addToParent(var5);
      var5.setScaleType(ScaleType.CENTER_CROP);
      this.imageView = var5;
      val var4: SimpleDraweeView = new SimpleDraweeView(var1);
      this.addToParent(var4);
      (var4.getHierarchy() as GenericDraweeHierarchy).t(ScalingUtils$ScaleType.i);
      this.simpleDraweeView = var4;
   }

   private fun View.addToParent() {
      var1.setLayoutParams(new LayoutParams(-1, -1));
      this.addView(var1);
   }

   private fun SimpleDraweeView.loadDefaultBitmap(uri: Uri) {
      var1.setController(
         (ja.d.g().E(ImageRequestBuilder.x(var2).N(ResizeOptions.e.a(var1.getWidth(), var1.getHeight())).a()) as PipelineDraweeControllerBuilder).c()
      );
   }

   private fun toggleImages(showSimpleDraweeView: Boolean) {
      var var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      this.simpleDraweeView.setVisibility(var2);
      var2 = 8;
      if (!var1) {
         var2 = 0;
      }

      this.imageView.setVisibility(var2);
   }

   public fun setLocalImageSource(uri: Uri, widthDp: Int, heightDp: Int) {
      gu.g.d(
         CoroutineViewUtilsKt.getAttachedScope(this),
         m0.b(),
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var2, var3, this, var1, null) {
            final int $heightDp;
            final Uri $uri;
            final int $widthDp;
            int label;
            final LocalImageThumbnailView this$0;

            {
               super(2, var5);
               this.$widthDp = var1;
               this.$heightDp = var2x;
               this.this$0 = var3;
               this.$uri = var4;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.$widthDp, this.$heightDp, this.this$0, this.$uri, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               val var5: Any = b.f();
               if (this.label != 0) {
                  if (this.label != 1) {
                     if (this.label != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var1);
                  } else {
                     try {
                        kotlin.c.b(var1);
                     } catch (var8: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           s0.m(new Pair[]{v.a("exception", var8.toString()), v.a("url", this.$uri.toString())}),
                           null,
                           null,
                           12,
                           null
                        );
                        var1 = m0.c();
                        val var25: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.this$0, this.$uri, null) {
                           final Uri $uri;
                           int label;
                           final LocalImageThumbnailView this$0;

                           {
                              super(2, var3);
                              this.this$0 = var1;
                              this.$uri = var2x;
                           }

                           public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                              return new <anonymous constructor>(this.this$0, this.$uri, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.f();
                              if (this.label == 0) {
                                 kotlin.c.b(var1);
                                 LocalImageThumbnailView.access$toggleImages(this.this$0, true);
                                 LocalImageThumbnailView.access$loadDefaultBitmap(
                                    this.this$0, LocalImageThumbnailView.access$getSimpleDraweeView$p(this.this$0), this.$uri
                                 );
                                 return Unit.a;
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        this.label = 2;
                        if (gu.g.g(var1, var25, this) === var5) {
                           return var5;
                        }
                     }
                  }
               } else {
                  kotlin.c.b(var1);
                  var var19: Int = SizeUtilsKt.getDpToPx(this.$widthDp);
                  val var3: Int = SizeUtilsKt.getDpToPx(this.$heightDp);
                  if (var19 != 0 && var3 != 0) {
                     var1 = new Size(var19, var3);
                  } else {
                     var1 = new Size(200, 200);
                  }

                  var var22: Bitmap;
                  try {
                     val var21: ThumbnailLoader = ThumbnailLoader.INSTANCE;
                     val var7: Context = this.this$0.getContext();
                     var22 = var21.loadThumbnail(var7, this.$uri, var1);
                  } catch (var11: Exception) {
                     CrashReporting.addBreadcrumb$default(
                        CrashReporting.INSTANCE,
                        "DCDLocalImageThumbnail - Failed to load thumbnail",
                        s0.m(new Pair[]{v.a("exception", var11.toString()), v.a("url", this.$uri.toString())}),
                        null,
                        null,
                        12,
                        null
                     );
                     var1 = m0.c();
                     val var6: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.this$0, this.$uri, null) {
                        final Uri $uri;
                        int label;
                        final LocalImageThumbnailView this$0;

                        {
                           super(2, var3);
                           this.this$0 = var1;
                           this.$uri = var2x;
                        }

                        public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                           return new <anonymous constructor>(this.this$0, this.$uri, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.f();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              LocalImageThumbnailView.access$toggleImages(this.this$0, true);
                              LocalImageThumbnailView.access$loadDefaultBitmap(
                                 this.this$0, LocalImageThumbnailView.access$getSimpleDraweeView$p(this.this$0), this.$uri
                              );
                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.label = 2;
                     if (gu.g.g(var1, var6, this) === var5) {
                        return var5;
                     }

                     return Unit.a;
                  }

                  if (var22 != null) {
                     try {
                        var19 = var22.getAllocationByteCount();
                     } catch (var10: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           s0.m(new Pair[]{v.a("exception", var10.toString()), v.a("url", this.$uri.toString())}),
                           null,
                           null,
                           12,
                           null
                        );
                        var1 = m0.c();
                        val var23: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.this$0, this.$uri, null) {
                           final Uri $uri;
                           int label;
                           final LocalImageThumbnailView this$0;

                           {
                              super(2, var3);
                              this.this$0 = var1;
                              this.$uri = var2x;
                           }

                           public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                              return new <anonymous constructor>(this.this$0, this.$uri, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.f();
                              if (this.label == 0) {
                                 kotlin.c.b(var1);
                                 LocalImageThumbnailView.access$toggleImages(this.this$0, true);
                                 LocalImageThumbnailView.access$loadDefaultBitmap(
                                    this.this$0, LocalImageThumbnailView.access$getSimpleDraweeView$p(this.this$0), this.$uri
                                 );
                                 return Unit.a;
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        this.label = 2;
                        if (gu.g.g(var1, var23, this) === var5) {
                           return var5;
                        }

                        return Unit.a;
                     }
                  } else {
                     var19 = 0;
                  }

                  val var4: Boolean;
                  if (var19 == 0) {
                     var4 = true;
                  } else {
                     var4 = false;
                  }

                  try {
                     val var26: c1 = m0.c();
                     val var16: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.this$0, var4, this.$uri, var22, null) {
                        final Bitmap $bitmap;
                        final boolean $isBitmapEmpty;
                        final Uri $uri;
                        int label;
                        final LocalImageThumbnailView this$0;

                        {
                           super(2, var5x);
                           this.this$0 = var1;
                           this.$isBitmapEmpty = var2x;
                           this.$uri = var3x;
                           this.$bitmap = var4x;
                        }

                        public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                           return new <anonymous constructor>(this.this$0, this.$isBitmapEmpty, this.$uri, this.$bitmap, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.f();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              LocalImageThumbnailView.access$toggleImages(this.this$0, this.$isBitmapEmpty);
                              if (this.$isBitmapEmpty) {
                                 LocalImageThumbnailView.access$loadDefaultBitmap(
                                    this.this$0, LocalImageThumbnailView.access$getSimpleDraweeView$p(this.this$0), this.$uri
                                 );
                              } else {
                                 LocalImageThumbnailView.access$getImageView$p(this.this$0).setImageBitmap(this.$bitmap);
                              }

                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.label = 1;
                     var1 = gu.g.g(var26, var16, this);
                  } catch (var9: Exception) {
                     CrashReporting.addBreadcrumb$default(
                        CrashReporting.INSTANCE,
                        "DCDLocalImageThumbnail - Failed to load thumbnail",
                        s0.m(new Pair[]{v.a("exception", var9.toString()), v.a("url", this.$uri.toString())}),
                        null,
                        null,
                        12,
                        null
                     );
                     val var15: c1 = m0.c();
                     val var24: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.this$0, this.$uri, null) {
                        final Uri $uri;
                        int label;
                        final LocalImageThumbnailView this$0;

                        {
                           super(2, var3);
                           this.this$0 = var1;
                           this.$uri = var2x;
                        }

                        public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                           return new <anonymous constructor>(this.this$0, this.$uri, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.f();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              LocalImageThumbnailView.access$toggleImages(this.this$0, true);
                              LocalImageThumbnailView.access$loadDefaultBitmap(
                                 this.this$0, LocalImageThumbnailView.access$getSimpleDraweeView$p(this.this$0), this.$uri
                              );
                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.label = 2;
                     if (gu.g.g(var15, var24, this) === var5) {
                        return var5;
                     }

                     return Unit.a;
                  }

                  if (var1 === var5) {
                     return var5;
                  }
               }

               return Unit.a;
            }
         },
         2,
         null
      );
   }

   public companion object {
      private const val DEFAULT_SIZE: Int
   }
}
