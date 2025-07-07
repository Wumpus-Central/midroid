package com.discord.core

import A9.q
import G9.b
import H2.d
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build.VERSION
import android.provider.MediaStore.Images.Thumbnails
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
import ib.K
import ib.d0
import ib.f
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineScope
import z9.s

public class LocalImageThumbnailView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout {
   private final var imageView: ImageView
   private final var simpleDraweeView: SimpleDraweeView

   fun LocalImageThumbnailView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun LocalImageThumbnailView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var5: ImageView = new ImageView(var1);
      this.addToParent(var5);
      var5.setScaleType(ScaleType.CENTER_CROP);
      this.imageView = var5;
      val var4: SimpleDraweeView = new SimpleDraweeView(var1);
      this.addToParent(var4);
      (var4.getHierarchy() as GenericDraweeHierarchy).u(ScalingUtils$ScaleType.i);
      this.simpleDraweeView = var4;
   }

   private fun View.addToParent() {
      var1.setLayoutParams(new LayoutParams(-1, -1));
      this.addView(var1);
   }

   private fun SimpleDraweeView.loadDefaultBitmap(uri: Uri) {
      var1.setController(
         (d.g().F(ImageRequestBuilder.x(var2).N(ResizeOptions.e.a(var1.getWidth(), var1.getHeight())).a()) as PipelineDraweeControllerBuilder).d()
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
      r.h(var1, "uri");
      f.d(
         CoroutineViewUtilsKt.getAttachedScope(this),
         K.b(),
         null,
         new Function2(var2, var3, this, var1, null) {
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
                  if (this.label == 1) {
                     try {
                        c.b(var1);
                        return Unit.a;
                     } catch (var8: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           q.l(new Pair[]{s.a("exception", var8.toString()), s.a("url", this.$uri.toString())}),
                           null,
                           4,
                           null
                        );
                        var1 = K.c();
                        val var6: Function2 = new Function2(this.this$0, this.$uri, null) {
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
                        return if (f.g(var1, var6, this) != var5) Unit.a else var5;
                     }
                  } else if (this.label != 2) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  } else {
                     c.b(var1);
                     return Unit.a;
                  }
               } else {
                  c.b(var1);
                  var var22: Int = SizeUtilsKt.getDpToPx(this.$widthDp);
                  val var3: Int = SizeUtilsKt.getDpToPx(this.$heightDp);
                  if (var22 != 0 && var3 != 0) {
                     var1 = new Size(var22, var3);
                  } else {
                     var1 = new Size(200, 200);
                  }

                  label74: {
                     try {
                        if (VERSION.SDK_INT >= 29) {
                           var1 = a.a(this.this$0.getContext().getContentResolver(), this.$uri, var1, null);
                           break label74;
                        }
                     } catch (var12: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           q.l(new Pair[]{s.a("exception", var12.toString()), s.a("url", this.$uri.toString())}),
                           null,
                           4,
                           null
                        );
                        val var15: d0 = K.c();
                        val var24: Function2 = new Function2(this.this$0, this.$uri, null) {
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
                        if (f.g(var15, var24, this) != var5) {
                           return Unit.a;
                        }

                        return var5;
                     }

                     try {
                        val var26: ContentResolver = this.this$0.getContext().getContentResolver();
                        val var17: java.lang.String = this.$uri.getLastPathSegment();
                        r.e(var17);
                        var1 = Thumbnails.getThumbnail(var26, java.lang.Long.parseLong(var17), 1, null);
                     } catch (var11: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           q.l(new Pair[]{s.a("exception", var11.toString()), s.a("url", this.$uri.toString())}),
                           null,
                           4,
                           null
                        );
                        val var16: d0 = K.c();
                        val var25: Function2 = new Function2(this.this$0, this.$uri, null) {
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
                        if (f.g(var16, var25, this) != var5) {
                           return Unit.a;
                        }

                        return var5;
                     }
                  }

                  if (var1 != null) {
                     try {
                        var22 = var1.getAllocationByteCount();
                     } catch (var10: Exception) {
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "DCDLocalImageThumbnail - Failed to load thumbnail",
                           q.l(new Pair[]{s.a("exception", var10.toString()), s.a("url", this.$uri.toString())}),
                           null,
                           4,
                           null
                        );
                        val var19: d0 = K.c();
                        val var27: Function2 = new Function2(this.this$0, this.$uri, null) {
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
                        if (f.g(var19, var27, this) != var5) {
                           return Unit.a;
                        }

                        return var5;
                     }
                  } else {
                     var22 = 0;
                  }

                  val var4: Boolean;
                  if (var22 == 0) {
                     var4 = true;
                  } else {
                     var4 = false;
                  }

                  try {
                     val var7: d0 = K.c();
                     val var29: Function2 = new Function2(this.this$0, var4, this.$uri, var1, null) {
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
                     var1 = f.g(var7, var29, this);
                  } catch (var9: Exception) {
                     CrashReporting.addBreadcrumb$default(
                        CrashReporting.INSTANCE,
                        "DCDLocalImageThumbnail - Failed to load thumbnail",
                        q.l(new Pair[]{s.a("exception", var9.toString()), s.a("url", this.$uri.toString())}),
                        null,
                        4,
                        null
                     );
                     val var20: d0 = K.c();
                     val var28: Function2 = new Function2(this.this$0, this.$uri, null) {
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
                     if (f.g(var20, var28, this) != var5) {
                        return Unit.a;
                     }

                     return var5;
                  }

                  return if (var1 === var5) var5 else Unit.a;
               }
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
