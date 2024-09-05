package com.discord.react_fork_overrides.forks

import android.net.Uri
import com.facebook.react.views.imagehelper.ImageSource
import java.io.File
import kotlin.jvm.functions.Function1

internal object ImageSourceOverride {
   @JvmStatic
   fun `override$lambda$0`(var0: java.lang.String): java.lang.String {
      val var1: ImageSourceOverride = INSTANCE;
      kotlin.jvm.internal.q.e(var0);
      return var1.resolvedOTAAssetOrDefaultToDrawable(var0);
   }

   private fun resolvedOTAAssetOrDefaultToDrawable(mSource: String): String {
      val var2: Uri = Uri.parse(var1);
      if (!var2.getPathSegments().contains("otas")) {
         return var1;
      } else {
         val var3: java.lang.String = var2.getPath();
         if (var3 == null) {
            return var1;
         } else {
            val var4: File = new File(var3);
            return if (var4.exists()) var1 else gk.j.k(var4);
         }
      }
   }

   public fun override() {
      ImageSource.mSourceOverride = new q();
      com.airbnb.android.react.lottie.h.r
         .a(
            new Function1(this) {
               {
                  super(
                     1,
                     var1,
                     ImageSourceOverride::class.java,
                     "resolvedOTAAssetOrDefaultToDrawable",
                     "resolvedOTAAssetOrDefaultToDrawable(Ljava/lang/String;)Ljava/lang/String;",
                     0
                  );
               }

               public final java.lang.String invoke(java.lang.String var1) {
                  kotlin.jvm.internal.q.h(var1, "p0");
                  return ImageSourceOverride.access$resolvedOTAAssetOrDefaultToDrawable(super.receiver as ImageSourceOverride, var1);
               }
            }
         );
   }
}
