package com.discord.image.fresco

import android.net.Uri
import android.net.Uri.Builder
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView

public fun SimpleDraweeView.setOptionalImageUrl(
   imageUrl: String?,
   autoPlayAnimations: Boolean? = null,
   srcIsAnimated: Boolean? = java.lang.Boolean.FALSE,
   controllerListener: ControllerListener<in Any>? = null
) {
   if (var1 != null && !StringsKt.i0(var1)) {
      val var10: Uri = ba.f.r(var1);
      if (var10 != null) {
         val var11: java.lang.String = var10.getLastPathSegment();
         var var8: Boolean = var10.getScheme() == "content";
         var1 = null;
         if (var8) {
            try {
               var1 = var0.getContext().getContentResolver().getType(var10);
            } catch (var12: Exception) {
               var1 = null;
            }
         }

         val var5: Boolean;
         if (var1 == "image/gif" || var11 != null && StringsKt.x(var11, ".gif", true)) {
            var5 = true;
         } else {
            var5 = false;
         }

         var var6: Boolean;
         if (var1 == "image/webp" || var11 != null && StringsKt.x(var11, ".webp", true)) {
            var6 = true;
         } else {
            var6 = false;
         }

         val var7: Boolean;
         if (var1 == "image/avif" || var11 != null && StringsKt.x(var11, ".avif", true)) {
            var7 = true;
         } else {
            var7 = false;
         }

         if (!(var3 == java.lang.Boolean.TRUE) || !var6 && !var7) {
            var6 = false;
         } else {
            var6 = true;
         }

         if ((var5 || var6) && !(var2 == java.lang.Boolean.FALSE)) {
            var8 = true;
         } else {
            var8 = false;
         }

         val var14: Builder = var10.buildUpon();
         val var16: java.lang.String = var10.getLastPathSegment();
         if (var16 != null && StringsKt.x(var16, ".avif", true)) {
            var14.appendQueryParameter("format", "webp");
         }

         if (var8 && var6) {
            var14.appendQueryParameter("animated", "true");
         }

         var0.setController(var0.getControllerBuilder().A(var8).D(var4).a(var14.build()).b(var0.getController()).build());
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
