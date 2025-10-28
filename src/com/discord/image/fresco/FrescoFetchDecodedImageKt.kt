@file:SourceDebugExtension(["SMAP\nFrescoFetchDecodedImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrescoFetchDecodedImage.kt\ncom/discord/image/fresco/FrescoFetchDecodedImageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,109:1\n1#2:110\n29#3:111\n29#3:112\n314#4,11:113\n*S KotlinDebug\n*F\n+ 1 FrescoFetchDecodedImage.kt\ncom/discord/image/fresco/FrescoFetchDecodedImageKt\n*L\n28#1:111\n66#1:112\n75#1:113,11\n*E\n"])

package com.discord.image.fresco

import N3.d
import Oa.b
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import com.discord.image.fresco.postprocessors.PostProcessor
import com.facebook.datasource.DataSource
import com.facebook.imagepipeline.core.DefaultExecutorSupplier
import com.facebook.imagepipeline.request.BasePostprocessor
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e

private final val executorSupplier: DefaultExecutorSupplier = new DefaultExecutorSupplier(3)

@JvmSynthetic
fun `access$getExecutorSupplier$p`(): DefaultExecutorSupplier {
   return executorSupplier;
}

public suspend fun Context.fetchDecodedImage(uri: Uri?, postProcessor: PostProcessor? = ..., copyBitmap: Boolean = ...): Bitmap? {
   val var6: e = new e(b.c(var4), 1);
   var6.C();
   if (var1 == null) {
      var6.resumeWith(Result.b(null));
   } else {
      val var7: ImageRequestBuilder = ImageRequestBuilder.x(var1);
      var var10: BasePostprocessor = null;
      if (var2 != null) {
         var10 = var2.create();
      }

      val var8: DataSource = d.a().k(var7.J(var10).a(), var0);
      var8.d(new x4.b(var6, var3) {
         final CancellableContinuation $continuation;
         final boolean $copyBitmap;

         {
            this.$continuation = var1;
            this.$copyBitmap = var2;
         }

         protected void onFailureImpl(DataSource var1) {
            this.$continuation.resumeWith(Result.b(null));
         }

         protected void onNewResultImpl(Bitmap var1) {
            val var2: kotlin.Result.a = Result.e;
            var var4: Bitmap = var1;
            if (this.$copyBitmap) {
               var4 = var1;
               if (var1 != null) {
                  var4 = Bitmap.createBitmap(var1);
               }
            }

            this.$continuation.resumeWith(Result.b(var4));
         }
      }, access$getExecutorSupplier$p().d());
      var6.b(new Function1<java.lang.Throwable, Unit>(var8) {
         final DataSource $imageDataSource;

         {
            this.$imageDataSource = var1;
         }

         public final void invoke(java.lang.Throwable var1) {
            this.$imageDataSource.close();
         }
      });
   }

   val var9: Any = var6.z();
   if (var9 === b.e()) {
      g.c(var4);
   }

   return var9;
}

public suspend fun Context.fetchDecodedImage(uri: String?, postProcessor: PostProcessor? = ..., copyBitmap: Boolean = ...): Bitmap? {
   label38: {
      try {
         val var21: kotlin.Result.a = Result.e;
      } catch (var9: java.lang.Throwable) {
         val var6: kotlin.Result.a = Result.e;
         var19 = Result.b(c.a(var9));
         break label38;
      }

      val var20: Uri;
      if (var1 != null) {
         try {
            var20 = Uri.parse(var1);
         } catch (var8: java.lang.Throwable) {
            val var22: kotlin.Result.a = Result.e;
            var19 = Result.b(c.a(var8));
            break label38;
         }
      } else {
         var20 = null;
      }

      label26:
      try {
         var19 = Result.b(var20);
      } catch (var7: java.lang.Throwable) {
         val var23: kotlin.Result.a = Result.e;
         var19 = Result.b(c.a(var7));
         break label26;
      }
   }

   if (Result.g(var19)) {
      var19 = null;
   }

   return fetchDecodedImage(var0, var19 as Uri, var2, var3, var4);
}

public fun Context.fetchDecodedImage(uri: Uri?, postProcessor: PostProcessor? = null, onDecodedImage: (Bitmap?) -> Unit) {
   if (var1 == null) {
      var3.invoke(null);
   } else {
      val var5: ImageRequestBuilder = ImageRequestBuilder.x(var1);
      var var6: BasePostprocessor = null;
      if (var2 != null) {
         var6 = var2.create();
      }

      d.a().k(var5.J(var6).a(), var0).d(new x4.b(var3) {
         final Function1<Bitmap, Unit> $onDecodedImage;

         {
            this.$onDecodedImage = var1;
         }

         protected void onFailureImpl(DataSource var1) {
            this.$onDecodedImage.invoke(null);
         }

         protected void onNewResultImpl(Bitmap var1) {
            this.$onDecodedImage.invoke(var1);
         }
      }, executorSupplier.d());
   }
}

public fun Context.fetchDecodedImage(uri: String?, postProcessor: PostProcessor? = null, onDecodedImage: (Bitmap?) -> Unit) {
   label38: {
      try {
         val var5: kotlin.Result.a = Result.e;
      } catch (var8: java.lang.Throwable) {
         val var18: kotlin.Result.a = Result.e;
         var19 = Result.b(c.a(var8));
         break label38;
      }

      val var21: Uri;
      if (var1 != null) {
         try {
            var21 = Uri.parse(var1);
         } catch (var7: java.lang.Throwable) {
            val var20: kotlin.Result.a = Result.e;
            var19 = Result.b(c.a(var7));
            break label38;
         }
      } else {
         var21 = null;
      }

      label26:
      try {
         var19 = Result.b(var21);
      } catch (var6: java.lang.Throwable) {
         val var22: kotlin.Result.a = Result.e;
         var19 = Result.b(c.a(var6));
         break label26;
      }
   }

   if (Result.g(var19)) {
      var19 = null;
   }

   fetchDecodedImage(var0, var19 as Uri, var2, var3);
}

@JvmSynthetic
fun `fetchDecodedImage$default`(var0: Context, var1: Uri, var2: PostProcessor, var3: Boolean, var4: Continuation, var5: Int, var6: Any): Any {
   if ((var5 and 2) != 0) {
      var2 = null;
   }

   if ((var5 and 4) != 0) {
      var3 = false;
   }

   return fetchDecodedImage(var0, var1, var2, var3, var4);
}

@JvmSynthetic
fun `fetchDecodedImage$default`(var0: Context, var1: java.lang.String, var2: PostProcessor, var3: Boolean, var4: Continuation, var5: Int, var6: Any): Any {
   if ((var5 and 2) != 0) {
      var2 = null;
   }

   if ((var5 and 4) != 0) {
      var3 = false;
   }

   return fetchDecodedImage(var0, var1, var2, var3, var4);
}

@JvmSynthetic
fun `fetchDecodedImage$default`(var0: Context, var1: Uri, var2: PostProcessor, var3: Function1, var4: Int, var5: Any) {
   if ((var4 and 2) != 0) {
      var2 = null;
   }

   fetchDecodedImage(var0, var1, var2, var3);
}

@JvmSynthetic
fun `fetchDecodedImage$default`(var0: Context, var1: java.lang.String, var2: PostProcessor, var3: Function1, var4: Int, var5: Any) {
   if ((var4 and 2) != 0) {
      var2 = null;
   }

   fetchDecodedImage(var0, var1, var2, var3);
}
