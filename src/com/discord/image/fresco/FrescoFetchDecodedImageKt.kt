package com.discord.image.fresco

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import ch.r
import ch.s
import ch.r.a
import com.discord.image.fresco.postprocessors.PostProcessor
import com.facebook.datasource.DataSource
import com.facebook.imagepipeline.core.DefaultExecutorSupplier
import com.facebook.imagepipeline.request.BasePostprocessor
import com.facebook.imagepipeline.request.ImageRequestBuilder
import ih.b
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e
import o4.c

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
      val var7: ImageRequestBuilder = ImageRequestBuilder.v(var1);
      var var10: BasePostprocessor = null;
      if (var2 != null) {
         var10 = var2.create();
      }

      val var8: DataSource = c.a().d(var7.F(var10).a(), var0);
      q.g(var8, "fetchDecodedImage(...)");
      var8.e(new t5.b(var6, var3) {
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
      var6.f(new Function1(var8) {
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
      val var9: a = r.k;
      var8 = r.b(Uri.parse(var1));
   } catch (var6: java.lang.Throwable) {
      val var5: a = r.k;
      var8 = r.b(s.a(var6));
      break label15;
   }

   var var10: Any = var8;
   if (r.g(var8)) {
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
      val var5: ImageRequestBuilder = ImageRequestBuilder.v(var1);
      var var7: BasePostprocessor = null;
      if (var2 != null) {
         var7 = var2.create();
      }

      val var6: DataSource = c.a().d(var5.F(var7).a(), var0);
      q.g(var6, "fetchDecodedImage(...)");
      var6.e(new t5.b(var3) {
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
      val var4: a = r.k;
      var8 = r.b(Uri.parse(var1));
   } catch (var5: java.lang.Throwable) {
      val var7: a = r.k;
      var8 = r.b(s.a(var5));
      break label16;
   }

   var var9: Any = var8;
   if (r.g(var8)) {
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
