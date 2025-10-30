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
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.request.ImageRequestBuilder
import fm.v
import jp.c1
import jp.f
import jp.k0
import km.b
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import l8.d

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
      (var4.getHierarchy() as GenericDraweeHierarchy).t(com.facebook.drawee.drawable.ScalingUtils.ScaleType.i);
      this.simpleDraweeView = var4;
   }

   private fun View.addToParent() {
      var1.setLayoutParams(new LayoutParams(-1, -1));
      this.addView(var1);
   }

   private fun SimpleDraweeView.loadDefaultBitmap(uri: Uri) {
      var1.setController(
         (d.g().E(ImageRequestBuilder.x(var2).N(ResizeOptions.e.a(var1.getWidth(), var1.getHeight())).a()) as PipelineDraweeControllerBuilder).c()
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
      f.d(
         CoroutineViewUtilsKt.getAttachedScope(this),
         k0.b(),
         null,
         new Function2<CoroutineScope, Continuation, Object>(var2, var3, this, var1, null) {
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

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$widthDp, this.$heightDp, this.this$0, this.$uri, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               val var5: Any = b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     if (this.label != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     c.b(var1);
                  } else {
                     try {
                        c.b(var1);
                     } catch (var8: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           n0.m(new Pair[]{v.a("exception", var8.toString()), v.a("url", this.$uri.toString())}),
                           null,
                           null,
                           12,
                           null
                        );
                        val var25: c1 = k0.c();
                        var1 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, this.$uri, null) {
                           final Uri $uri;
                           int label;
                           final LocalImageThumbnailView this$0;

                           {
                              super(2, var3);
                              this.this$0 = var1;
                              this.$uri = var2x;
                           }

                           public final Continuation create(Object var1, Continuation var2) {
                              return new <anonymous constructor>(this.this$0, this.$uri, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.e();
                              if (this.label == 0) {
                                 c.b(var1);
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
                        if (f.g(var25, var1, this) === var5) {
                           return var5;
                        }
                     }
                  }
               } else {
                  c.b(var1);
                  val var3: Int = SizeUtilsKt.getDpToPx(this.$widthDp);
                  var var19: Int = SizeUtilsKt.getDpToPx(this.$heightDp);
                  if (var3 != 0 && var19 != 0) {
                     var1 = new Size(var3, var19);
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
                        n0.m(new Pair[]{v.a("exception", var11.toString()), v.a("url", this.$uri.toString())}),
                        null,
                        null,
                        12,
                        null
                     );
                     val var6: c1 = k0.c();
                     var1 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, this.$uri, null) {
                        final Uri $uri;
                        int label;
                        final LocalImageThumbnailView this$0;

                        {
                           super(2, var3);
                           this.this$0 = var1;
                           this.$uri = var2x;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.this$0, this.$uri, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.e();
                           if (this.label == 0) {
                              c.b(var1);
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
                     if (f.g(var6, var1, this) === var5) {
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
                           n0.m(new Pair[]{v.a("exception", var10.toString()), v.a("url", this.$uri.toString())}),
                           null,
                           null,
                           12,
                           null
                        );
                        val var23: c1 = k0.c();
                        var1 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, this.$uri, null) {
                           final Uri $uri;
                           int label;
                           final LocalImageThumbnailView this$0;

                           {
                              super(2, var3);
                              this.this$0 = var1;
                              this.$uri = var2x;
                           }

                           public final Continuation create(Object var1, Continuation var2) {
                              return new <anonymous constructor>(this.this$0, this.$uri, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.e();
                              if (this.label == 0) {
                                 c.b(var1);
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
                        if (f.g(var23, var1, this) === var5) {
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
                     val var16: c1 = k0.c();
                     val var26: Function2 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, var4, this.$uri, var22, null) {
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

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.this$0, this.$isBitmapEmpty, this.$uri, this.$bitmap, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.e();
                           if (this.label == 0) {
                              c.b(var1);
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
                     var1 = f.g(var16, var26, this);
                  } catch (var9: Exception) {
                     CrashReporting.addBreadcrumb$default(
                        CrashReporting.INSTANCE,
                        "DCDLocalImageThumbnail - Failed to load thumbnail",
                        n0.m(new Pair[]{v.a("exception", var9.toString()), v.a("url", this.$uri.toString())}),
                        null,
                        null,
                        12,
                        null
                     );
                     val var24: c1 = k0.c();
                     val var15: Function2 = new Function2<CoroutineScope, Continuation, Object>(this.this$0, this.$uri, null) {
                        final Uri $uri;
                        int label;
                        final LocalImageThumbnailView this$0;

                        {
                           super(2, var3);
                           this.this$0 = var1;
                           this.$uri = var2x;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.this$0, this.$uri, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.e();
                           if (this.label == 0) {
                              c.b(var1);
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
                     if (f.g(var24, var15, this) === var5) {
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
