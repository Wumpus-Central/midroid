package com.discord.image.fresco.tiled

import F9.b
import G2.d
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Shader.TileMode
import android.graphics.drawable.Animatable
import android.graphics.drawable.BitmapDrawable
import android.view.MotionEvent
import cb.K
import cb.f
import cb.k0
import com.facebook.common.references.CloseableReference
import com.facebook.datasource.DataSource
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.interfaces.DraweeHierarchy
import com.facebook.imagepipeline.request.ImageRequest
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.v
import u3.e

@SourceDebugExtension(["SMAP\nTiledDraweeController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiledDraweeController.kt\ncom/discord/image/fresco/tiled/TiledDraweeController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"])
public class TiledDraweeController(resources: Resources, url: String, tileMode: TileMode = TileMode.REPEAT) : DraweeController {
   private final val resources: Resources
   private final val url: String
   private final val tileMode: TileMode
   private final val job: CompletableJob
   private final val scope: CoroutineScope
   private final var myImageReference: CloseableReference<e>?
   private final var hierarchy: GenericDraweeHierarchy?
   private final var contentDescription: String?

   init {
      this.resources = var1;
      this.url = var2;
      this.tileMode = var3;
      val var4: CompletableJob = k0.b(null, 1, null);
      this.job = var4;
      this.scope = g.a(var4.Z0(K.c().Z1()));
   }

   private fun load() {
      f.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, null) {
            long J$0;
            private Object L$0;
            int label;
            final TiledDraweeController this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               var var7: Any;
               var var258: DataSource;
               label1440: {
                  var7 = b.e();
                  val var3x: Long;
                  var var9: Any;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var3x = this.J$0;
                     var258 = this.L$0 as DataSource;

                     try {
                        c.b(var1);
                     } catch (var25: java.lang.Throwable) {
                        var258 = this.L$0 as DataSource;
                        var7 = var25;
                        break label1440;
                     }

                     var9 = var1;
                  } else {
                     c.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                     var3x = System.currentTimeMillis();
                     var258 = ImageRequest.fromUri(TiledDraweeController.access$getUrl$p(this.this$0));
                     val var252: DataSource = d.a().k(var258, var1);

                     try {
                        var9 = K.b();
                        var258 = new Function2<CoroutineScope, Continuation, Object>(var252, null) {
                           final DataSource $dataSource;
                           int label;

                           {
                              super(2, var2x);
                              this.$dataSource = var1;
                           }

                           public final Continuation create(Object var1, Continuation var2) {
                              return new <anonymous constructor>(this.$dataSource, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.e();
                              if (this.label == 0) {
                                 c.b(var1);
                                 return A2.c.c(this.$dataSource);
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        this.L$0 = var252;
                        this.J$0 = var3x;
                        this.label = 1;
                        var9 = (GenericDraweeHierarchy)f.g((CoroutineContext)var9, var258, this);
                     } catch (var24: java.lang.Throwable) {
                        break label1440;
                     }

                     if (var9 === var7) {
                        return var7;
                     }

                     var258 = var252;
                  }

                  try {
                     var1 = var9 as CloseableReference;
                  } catch (var23: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var23;
                     break label1440;
                  }

                  try {
                     TiledDraweeController.access$setMyImageReference$p(this.this$0, var1);
                  } catch (var22: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var22;
                     break label1440;
                  }

                  val var254: e;
                  if (var1 != null) {
                     try {
                        var254 = var1.w0() as e;
                     } catch (var21: java.lang.Throwable) {
                        var258 = var258;
                        var7 = var21;
                        break label1440;
                     }
                  } else {
                     var254 = null;
                  }

                  label131: {
                     label164: {
                        try {
                           if (var254 !is u3.d) {
                              break label164;
                           }
                        } catch (var20: java.lang.Throwable) {
                           var258 = var258;
                           var7 = var20;
                           break label1440;
                        }

                        try {
                           var1 = var254 as u3.d;
                           break label131;
                        } catch (var19: java.lang.Throwable) {
                           var258 = var258;
                           var7 = var19;
                           break label1440;
                        }
                     }

                     var1 = null;
                  }

                  var9 = null;
                  if (var1 != null) {
                     try {
                        var9 = var1.B1();
                     } catch (var18: java.lang.Throwable) {
                        var258 = var258;
                        var7 = var18;
                        break label1440;
                     }
                  }

                  try {
                     var1 = new BitmapDrawable;
                  } catch (var17: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var17;
                     break label1440;
                  }

                  try {
                     var1./* $VF: Unable to resugar constructor */<init>(TiledDraweeController.access$getResources$p(this.this$0), (Bitmap)var9);
                  } catch (var16: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var16;
                     break label1440;
                  }

                  try {
                     var9 = this.this$0;
                  } catch (var15: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var15;
                     break label1440;
                  }

                  try {
                     var1.setTileModeXY(
                        TiledDraweeController.access$getTileMode$p((TiledDraweeController)var9),
                        TiledDraweeController.access$getTileMode$p((TiledDraweeController)var9)
                     );
                  } catch (var14: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var14;
                     break label1440;
                  }

                  var var5: Long;
                  try {
                     var5 = System.currentTimeMillis();
                  } catch (var13: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var13;
                     break label1440;
                  }

                  var var257: Boolean = false;
                  if (var5 - var3x >= 120L) {
                     var257 = true;
                  }

                  try {
                     var9 = TiledDraweeController.access$getHierarchy$p(this.this$0);
                  } catch (var12: java.lang.Throwable) {
                     var258 = var258;
                     var7 = var12;
                     break label1440;
                  }

                  if (var9 != null) {
                     try {
                        var9.f(var1, 1.0F, var257 xor true);
                     } catch (var11: java.lang.Throwable) {
                        var258 = var258;
                        var7 = var11;
                        break label1440;
                     }
                  }

                  var258.close();
                  return Unit.a;
               }

               var258.close();
               throw var7;
            }
         },
         3,
         null
      );
   }

   public open fun getAnimatable(): Animatable {
      throw new UnsupportedOperationException();
   }

   public open fun getContentDescription(): String? {
      return this.contentDescription;
   }

   public open fun getHierarchy(): DraweeHierarchy? {
      return this.hierarchy;
   }

   public open fun isSameImageRequest(other: DraweeController?): Boolean {
      label27: {
         val var2: Boolean = var1 is TiledDraweeController;
         var var4: java.lang.String = null;
         val var5: TiledDraweeController;
         if (var2) {
            var5 = var1 as TiledDraweeController;
         } else {
            var5 = null;
         }

         if (var5 != null) {
            var4 = var5.url;
         }

         return var4 == this.url && this.myImageReference != null && this.myImageReference.A0();
      }
   }

   public open fun onAttach() {
      this.load();
   }

   public open fun onDetach() {
      if (this.hierarchy != null) {
         this.hierarchy.a();
      }

      if (this.myImageReference != null) {
         this.myImageReference.close();
      }

      this.myImageReference = null;
      v.i(this.job, null, 1, null);
   }

   public open fun onTouchEvent(event: MotionEvent?): Boolean {
      return false;
   }

   public open fun onViewportVisibilityHint(isVisibleInViewportHint: Boolean) {
   }

   public open fun setContentDescription(contentDescription: String?) {
      this.contentDescription = var1;
   }

   public open fun setHierarchy(hierarchy: DraweeHierarchy?) {
      val var2: GenericDraweeHierarchy;
      if (var1 != null) {
         var2 = var1 as GenericDraweeHierarchy;
      } else {
         var2 = null;
      }

      this.hierarchy = var2;
   }
}
