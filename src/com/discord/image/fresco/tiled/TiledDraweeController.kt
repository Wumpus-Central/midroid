package com.discord.image.fresco.tiled

import H2.d
import H2.e
import S9.K
import S9.f
import S9.k0
import V1.c
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
import j8.s
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.v
import p8.b

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
      q.h(var1, "resources");
      q.h(var2, "url");
      q.h(var3, "tileMode");
      super();
      this.resources = var1;
      this.url = var2;
      this.tileMode = var3;
      val var4: CompletableJob = k0.b(null, 1, null);
      this.job = var4;
      this.scope = g.a(var4.R(K.c().Y1()));
   }

   private fun load() {
      f.d(
         this.scope,
         null,
         null,
         new Function2(this, null) {
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
               var var8: DataSource;
               label1424: {
                  var8 = (DataSource)b.e();
                  var var9: Bitmap = null;
                  val var3x: Long;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var3x = this.J$0;
                     var8 = this.L$0 as DataSource;
                     var7 = this.L$0 as DataSource;

                     try {
                        s.b(var1);
                     } catch (var25: java.lang.Throwable) {
                        var8 = var25;
                        break label1424;
                     }
                  } else {
                     s.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                     var3x = System.currentTimeMillis();
                     var7 = ImageRequest.fromUri(TiledDraweeController.access$getUrl$p(this.this$0));
                     val var252: DataSource = c.a().g((ImageRequest)var7, var1);

                     try {
                        val var10: CoroutineDispatcher = K.b();
                        var7 = new Function2(var252, null) {
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
                                 s.b(var1);
                                 return P1.c.c(this.$dataSource);
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        this.L$0 = var252;
                        this.J$0 = var3x;
                        this.label = 1;
                        var7 = f.g(var10, (Function2)var7, this);
                     } catch (var24: java.lang.Throwable) {
                        break label1424;
                     }

                     if (var7 === var8) {
                        return var8;
                     }

                     var8 = var252;
                     var1 = (BitmapDrawable)var7;
                  }

                  var7 = var8;

                  try {
                     var1 = var1 as CloseableReference;
                  } catch (var23: java.lang.Throwable) {
                     var8 = var23;
                     break label1424;
                  }

                  var7 = var8;

                  try {
                     TiledDraweeController.access$setMyImageReference$p(this.this$0, var1);
                  } catch (var22: java.lang.Throwable) {
                     var8 = var22;
                     break label1424;
                  }

                  val var254: e;
                  if (var1 != null) {
                     var7 = var8;

                     try {
                        var254 = var1.M0() as e;
                     } catch (var21: java.lang.Throwable) {
                        var8 = var21;
                        break label1424;
                     }
                  } else {
                     var254 = null;
                  }

                  var7 = var8;

                  label131: {
                     label163: {
                        try {
                           if (var254 !is d) {
                              break label163;
                           }
                        } catch (var20: java.lang.Throwable) {
                           var8 = var20;
                           break label1424;
                        }

                        var7 = var8;

                        try {
                           var1 = var254 as d;
                           break label131;
                        } catch (var19: java.lang.Throwable) {
                           var8 = var19;
                           break label1424;
                        }
                     }

                     var1 = null;
                  }

                  if (var1 != null) {
                     var7 = var8;

                     try {
                        var9 = var1.g1();
                     } catch (var18: java.lang.Throwable) {
                        var8 = var18;
                        break label1424;
                     }
                  }

                  var7 = var8;

                  try {
                     var1 = new BitmapDrawable;
                  } catch (var17: java.lang.Throwable) {
                     var8 = var17;
                     break label1424;
                  }

                  var7 = var8;

                  try {
                     var1./* $VF: Unable to resugar constructor */<init>(TiledDraweeController.access$getResources$p(this.this$0), var9);
                  } catch (var16: java.lang.Throwable) {
                     var8 = var16;
                     break label1424;
                  }

                  var7 = var8;

                  try {
                     var259 = this.this$0;
                  } catch (var15: java.lang.Throwable) {
                     var8 = var15;
                     break label1424;
                  }

                  var7 = var8;

                  try {
                     var1.setTileModeXY(TiledDraweeController.access$getTileMode$p(var259), TiledDraweeController.access$getTileMode$p(var259));
                  } catch (var14: java.lang.Throwable) {
                     var8 = var14;
                     break label1424;
                  }

                  var7 = var8;

                  var var5: Long;
                  try {
                     var5 = System.currentTimeMillis();
                  } catch (var13: java.lang.Throwable) {
                     var8 = var13;
                     break label1424;
                  }

                  var var257: Boolean = false;
                  if (var5 - var3x >= 120L) {
                     var257 = true;
                  }

                  var7 = var8;

                  try {
                     var260 = TiledDraweeController.access$getHierarchy$p(this.this$0);
                  } catch (var12: java.lang.Throwable) {
                     var8 = var12;
                     break label1424;
                  }

                  if (var260 != null) {
                     var7 = var8;

                     try {
                        var260.g(var1, 1.0F, var257 xor true);
                     } catch (var11: java.lang.Throwable) {
                        var8 = var11;
                        break label1424;
                     }
                  }

                  var8.close();
                  return Unit.a;
               }

               ((DataSource)var7).close();
               throw var8;
            }
         },
         3,
         null
      );
   }

   public override fun getAnimatable(): Animatable {
      throw new UnsupportedOperationException();
   }

   public open fun getContentDescription(): String? {
      return this.contentDescription;
   }

   public override fun getHierarchy(): DraweeHierarchy? {
      return this.hierarchy;
   }

   public override fun isSameImageRequest(other: DraweeController?): Boolean {
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

         return q.c(var4, this.url) && this.myImageReference != null && this.myImageReference.f1();
      }
   }

   public override fun onAttach() {
      this.load();
   }

   public override fun onDetach() {
      if (this.hierarchy != null) {
         this.hierarchy.a();
      }

      if (this.myImageReference != null) {
         this.myImageReference.close();
      }

      this.myImageReference = null;
      v.i(this.job, null, 1, null);
   }

   public override fun onTouchEvent(event: MotionEvent?): Boolean {
      return false;
   }

   public open fun onViewportVisibilityHint(isVisibleInViewportHint: Boolean) {
   }

   public open fun setContentDescription(contentDescription: String?) {
      this.contentDescription = var1;
   }

   public override fun setHierarchy(hierarchy: DraweeHierarchy?) {
      val var2: GenericDraweeHierarchy;
      if (var1 != null) {
         var2 = var1 as GenericDraweeHierarchy;
      } else {
         var2 = null;
      }

      this.hierarchy = var2;
   }
}
