package com.discord.image.fresco

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import com.discord.image.fresco.postprocessors.PostProcessor
import com.facebook.datasource.DataSource
import com.facebook.imagepipeline.core.DefaultExecutorSupplier
import com.facebook.imagepipeline.request.BasePostprocessor
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kh.r
import kh.s
import kh.r.a
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e
import qh.b
import x4.c

private final val executorSupplier: DefaultExecutorSupplier = new DefaultExecutorSupplier(3)

@JvmSynthetic
fun `access$getExecutorSupplier$p`(): DefaultExecutorSupplier {
   return executorSupplier;
}

public suspend fun Context.fetchDecodedImage(uri: Uri?, postProcessor: PostProcessor? = ..., copyBitmap: Boolean = ...): Bitmap? {
   val var6: e = new e(b.c(var4), 1);
   var6.C();
   if (var1 == null) {
      var6.resumeWith(r.b(null));
   } else {
      val var7: ImageRequestBuilder = ImageRequestBuilder.w(var1);
      var var10: BasePostprocessor = null;
      if (var2 != null) {
         var10 = var2.create();
      }

      val var8: DataSource = c.a().g(var7.H(var10).a(), var0);
      var8.f(new f6.b(var6, var3) {
         final CancellableContinuation $continuation;
         final boolean $copyBitmap;

         {
            this.$continuation = var1;
            this.$copyBitmap = var2;
         }

         protected void onFailureImpl(DataSource var1) {
            q.h(var1, "dataSource");
            this.$continuation.resumeWith(r.b(null));
         }

         protected void onNewResultImpl(Bitmap var1) {
            val var2: a = r.k;
            var var4: Bitmap = var1;
            if (this.$copyBitmap) {
               var4 = var1;
               if (var1 != null) {
                  var4 = Bitmap.createBitmap(var1);
               }
            }

            this.$continuation.resumeWith(r.b(var4));
         }
      }, access$getExecutorSupplier$p().a());
      var6.i(new Function1(var8) {
         final DataSource $imageDataSource;

         {
            super(1);
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
   label15:
   try {
      val var5: a = r.k;
      var9 = r.b(Uri.parse(var1));
   } catch (var6: java.lang.Throwable) {
      val var8: a = r.k;
      var9 = r.b(s.a(var6));
      break label15;
   }

   var var10: Any = var9;
   if (r.g(var9)) {
      var10 = null;
   }

   return fetchDecodedImage(var0, var10 as Uri, var2, var3, var4);
}

public fun Context.fetchDecodedImage(uri: Uri?, postProcessor: PostProcessor? = null, onDecodedImage: (Bitmap?) -> Unit) {
   q.h(var0, "<this>");
   q.h(var3, "onDecodedImage");
   if (var1 == null) {
      var3.invoke(null);
   } else {
      val var5: ImageRequestBuilder = ImageRequestBuilder.w(var1);
      var var6: BasePostprocessor = null;
      if (var2 != null) {
         var6 = var2.create();
      }

      c.a().g(var5.H(var6).a(), var0).f(new f6.b(var3) {
         final Function1 $onDecodedImage;

         {
            this.$onDecodedImage = var1;
         }

         protected void onFailureImpl(DataSource var1) {
            q.h(var1, "dataSource");
            this.$onDecodedImage.invoke(null);
         }

         protected void onNewResultImpl(Bitmap var1) {
            this.$onDecodedImage.invoke(var1);
         }
      }, executorSupplier.a());
   }
}

public fun Context.fetchDecodedImage(uri: String?, postProcessor: PostProcessor? = null, onDecodedImage: (Bitmap?) -> Unit) {
   q.h(var0, "<this>");
   q.h(var3, "onDecodedImage");

   label16:
   try {
      val var8: a = r.k;
      var7 = r.b(Uri.parse(var1));
   } catch (var5: java.lang.Throwable) {
      val var4: a = r.k;
      var7 = r.b(s.a(var5));
      break label16;
   }

   var var9: Any = var7;
   if (r.g(var7)) {
      var9 = null;
   }

   fetchDecodedImage(var0, var9 as Uri, var2, var3);
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
