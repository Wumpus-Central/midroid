package com.discord.image.fresco

import android.net.Uri
import android.net.Uri.Builder
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import y2.f

public fun SimpleDraweeView.setOptionalImageUrl(
   imageUrl: String?,
   autoPlayAnimations: Boolean? = null,
   srcIsAnimated: Boolean? = java.lang.Boolean.FALSE,
   controllerListener: ControllerListener<in Any>? = null
) {
   if (var1 != null && !StringsKt.c0(var1)) {
      val var8: Uri = f.r(var1);
      if (var8 != null) {
         var var5: Boolean;
         var var7: java.lang.Boolean;
         label58: {
            label57: {
               var7 = java.lang.Boolean.TRUE;
               if (var3 == java.lang.Boolean.TRUE) {
                  val var13: java.lang.String = var8.getLastPathSegment();
                  if (var13 != null && StringsKt.s(var13, ".webp", true)) {
                     break label57;
                  }

                  val var14: java.lang.String = var8.getLastPathSegment();
                  if (var14 != null && StringsKt.s(var14, ".avif", true)) {
                     break label57;
                  }
               }

               var5 = false;
               break label58;
            }

            var5 = true;
         }

         var var6: Boolean;
         label47: {
            if (!(var2 == var7)) {
               val var11: java.lang.String = var8.getLastPathSegment();
               if ((var11 == null || !StringsKt.s(var11, ".gif", true)) && !var5) {
                  var6 = false;
                  break label47;
               }
            }

            var6 = true;
         }

         val var12: Builder = var8.buildUpon();
         var1 = var8.getLastPathSegment();
         if (var1 != null && StringsKt.s(var1, ".avif", true)) {
            var12.appendQueryParameter("format", "webp");
         }

         if (var6 && var5) {
            var12.appendQueryParameter("animated", "true");
         }

         var0.setController(var0.getControllerBuilder().B(var6).E(var4).b(var12.build()).c(var0.getController()).a());
         var0.setVisibility(0);
      }
   } else {
      var0.setVisibility(8);
   }
}

@JvmSynthetic
fun `setOptionalImageUrl$default`(
   var0: SimpleDraweeView, var1: java.lang.String, var2: java.lang.Boolean, var3: java.lang.Boolean, var4: ControllerListener, var5: Int, var6: Any
) {
   if ((var5 and 2) != 0) {
      var2 = null;
   }

   if ((var5 and 4) != 0) {
      var3 = java.lang.Boolean.FALSE;
   }

   if ((var5 and 8) != 0) {
      var4 = null;
   }

   setOptionalImageUrl(var0, var1, var2, var3, var4);
}
