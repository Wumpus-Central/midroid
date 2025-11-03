package com.discord.react_fork_overrides.forks

import android.net.Uri
import com.facebook.react.views.imagehelper.ImageSource
import java.io.File
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nImageSourceOverride.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSourceOverride.kt\ncom/discord/react_fork_overrides/forks/ImageSourceOverride\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,48:1\n29#2:49\n*S KotlinDebug\n*F\n+ 1 ImageSourceOverride.kt\ncom/discord/react_fork_overrides/forks/ImageSourceOverride\n*L\n26#1:49\n*E\n"])
internal object ImageSourceOverride {
   @JvmStatic
   fun `override$lambda$0`(var0: java.lang.String): java.lang.String {
      val var1: ImageSourceOverride = INSTANCE;
      return var1.resolvedOTAAssetOrDefaultToDrawable(var0);
   }

   private fun resolvedOTAAssetOrDefaultToDrawable(mSource: String): String {
      val var2: Uri = Uri.parse(var1);
      if (var2.getPathSegments().contains("otas")) {
         val var3: java.lang.String = var2.getPath();
         if (var3 != null) {
            val var4: File = new File(var3);
            if (!var4.exists()) {
               return tt.j.t(var4);
            }
         }
      }

      return var1;
   }

   public fun override() {
      ImageSource.Companion.setSourceOverride(new l());
      com.airbnb.android.react.lottie.h.r
         .a(
            new Function1<java.lang.String, java.lang.String>(this) {
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
                  return ImageSourceOverride.access$resolvedOTAAssetOrDefaultToDrawable(super.receiver as ImageSourceOverride, var1);
               }
            }
         );
   }
}
