package com.discord.image.fresco.tiled

import B4.e
import N3.d
import Oa.b
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Shader.TileMode
import android.graphics.drawable.Animatable
import android.graphics.drawable.BitmapDrawable
import android.view.MotionEvent
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
import mc.K
import mc.f
import mc.k0

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
      this.scope = g.a(var4.W0(K.c().a2()));
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
               var var7: DataSource;
               var var8: Any;
               label1549: {
                  var7 = (DataSource)b.e();
                  var var9: BitmapDrawable = null;
                  val var3x: Long;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var3x = this.J$0;
                     var7 = this.L$0 as DataSource;
                     var8 = this.L$0 as DataSource;

                     try {
                        c.b(var1);
                     } catch (var26: java.lang.Throwable) {
                        var7 = var26;
                        break label1549;
                     }
                  } else {
                     c.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                     var3x = System.currentTimeMillis();
                     var8 = ImageRequest.fromUri(TiledDraweeController.access$getUrl$p(this.this$0));
                     val var284: DataSource = d.a().k((ImageRequest)var8, var1);

                     try {
                        var8 = K.b();
                        val var10: Function2 = new Function2<CoroutineScope, Continuation, Object>(var284, null) {
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
                                 return H3.c.c(this.$dataSource);
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        this.L$0 = var284;
                        this.J$0 = var3x;
                        this.label = 1;
                        var8 = f.g((CoroutineContext)var8, var10, this);
                     } catch (var25: java.lang.Throwable) {
                        break label1549;
                     }

                     if (var8 === var7) {
                        return var7;
                     }

                     var7 = var284;
                     var1 = (GenericDraweeHierarchy)var8;
                  }

                  var8 = var7;

                  try {
                     var1 = var1 as CloseableReference;
                  } catch (var24: java.lang.Throwable) {
                     var7 = var24;
                     break label1549;
                  }

                  var8 = var7;

                  try {
                     TiledDraweeController.access$setMyImageReference$p(this.this$0, var1);
                  } catch (var23: java.lang.Throwable) {
                     var7 = var23;
                     break label1549;
                  }

                  val var286: e;
                  if (var1 != null) {
                     var8 = var7;

                     try {
                        var286 = var1.v0() as e;
                     } catch (var22: java.lang.Throwable) {
                        var7 = var22;
                        break label1549;
                     }
                  } else {
                     var286 = null;
                  }

                  var8 = var7;

                  label139: {
                     label171: {
                        try {
                           if (var286 !is B4.d) {
                              break label171;
                           }
                        } catch (var21: java.lang.Throwable) {
                           var7 = var21;
                           break label1549;
                        }

                        var8 = var7;

                        try {
                           var1 = var286 as B4.d;
                           break label139;
                        } catch (var20: java.lang.Throwable) {
                           var7 = var20;
                           break label1549;
                        }
                     }

                     var1 = null;
                  }

                  val var288: Bitmap;
                  if (var1 != null) {
                     var8 = var7;

                     try {
                        var288 = var1.B1();
                     } catch (var19: java.lang.Throwable) {
                        var7 = var19;
                        break label1549;
                     }
                  } else {
                     var288 = null;
                  }

                  if (var288 != null) {
                     var8 = var7;

                     var var293: Resources;
                     try {
                        var293 = TiledDraweeController.access$getResources$p(this.this$0);
                     } catch (var18: java.lang.Throwable) {
                        var7 = var18;
                        break label1549;
                     }

                     var8 = var7;

                     try {
                        var9 = new BitmapDrawable;
                     } catch (var17: java.lang.Throwable) {
                        var7 = var17;
                        break label1549;
                     }

                     var8 = var7;

                     try {
                        var9./* $VF: Unable to resugar constructor */<init>(var293, var288);
                     } catch (var16: java.lang.Throwable) {
                        var7 = var16;
                        break label1549;
                     }

                     var8 = var7;

                     try {
                        var1 = this.this$0;
                     } catch (var15: java.lang.Throwable) {
                        var7 = var15;
                        break label1549;
                     }

                     var8 = var7;

                     try {
                        var9.setTileModeXY(TiledDraweeController.access$getTileMode$p(var1), TiledDraweeController.access$getTileMode$p(var1));
                     } catch (var14: java.lang.Throwable) {
                        var7 = var14;
                        break label1549;
                     }
                  }

                  var8 = var7;

                  var var5: Long;
                  try {
                     var5 = System.currentTimeMillis();
                  } catch (var13: java.lang.Throwable) {
                     var7 = var13;
                     break label1549;
                  }

                  var var291: Boolean = false;
                  if (var5 - var3x >= 120L) {
                     var291 = true;
                  }

                  var8 = var7;

                  try {
                     var1 = TiledDraweeController.access$getHierarchy$p(this.this$0);
                  } catch (var12: java.lang.Throwable) {
                     var7 = var12;
                     break label1549;
                  }

                  if (var1 != null) {
                     var8 = var7;

                     try {
                        var1.f(var9, 1.0F, var291 xor true);
                     } catch (var11: java.lang.Throwable) {
                        var7 = var11;
                        break label1549;
                     }
                  }

                  var7.close();
                  return Unit.a;
               }

               var8.close();
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

         return var4 == this.url && this.myImageReference != null && this.myImageReference.z0();
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
