package com.discord.image.fresco

import android.net.Uri
import android.net.Uri.Builder
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import y3.f

public fun SimpleDraweeView.setOptionalImageUrl(
   imageUrl: String?,
   autoPlayAnimations: Boolean? = null,
   srcIsAnimated: Boolean? = java.lang.Boolean.FALSE,
   controllerListener: ControllerListener<in Any>? = null
) {
   if (var1 != null && !StringsKt.c0(var1)) {
      val var10: Uri = f.r(var1);
      if (var10 != null) {
         val var9: java.lang.String = var10.getLastPathSegment();
         val var5: Boolean;
         if (var9 != null && StringsKt.s(var9, ".gif", true)) {
            var5 = true;
         } else {
            var5 = false;
         }

         var var6: Boolean;
         if (var9 != null && StringsKt.s(var9, ".webp", true)) {
            var6 = true;
         } else {
            var6 = false;
         }

         val var7: Boolean;
         if (var9 != null && StringsKt.s(var9, ".avif", true)) {
            var7 = true;
         } else {
            var7 = false;
         }

         if (!(var3 == java.lang.Boolean.TRUE) || !var6 && !var7) {
            var6 = false;
         } else {
            var6 = true;
         }

         val var8: Boolean;
         if ((var5 || var6) && !(var2 == java.lang.Boolean.FALSE)) {
            var8 = true;
         } else {
            var8 = false;
         }

         val var13: Builder = var10.buildUpon();
         var1 = var10.getLastPathSegment();
         if (var1 != null && StringsKt.s(var1, ".avif", true)) {
            var13.appendQueryParameter("format", "webp");
         }

         if (var8 && var6) {
            var13.appendQueryParameter("animated", "true");
         }

         var0.setController(var0.getControllerBuilder().B(var8).E(var4).b(var13.build()).c(var0.getController()).a());
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
