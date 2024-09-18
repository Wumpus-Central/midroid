package com.discord.image.fresco

import android.net.Uri
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q
import o4.f

public fun SimpleDraweeView.setOptionalImageUrl(imageUrl: String?, autoPlayAnimations: Boolean? = null, controllerListener: ControllerListener<in Any>? = null) {
   var var4: Byte;
   var var5: Boolean;
   var var6: Uri;
   label26: {
      q.h(var0, "<this>");
      var6 = f.o(var1);
      var4 = 0;
      if (var6 != null) {
         val var7: java.lang.String = var6.getLastPathSegment();
         if (var7 != null) {
            var5 = true;
            if (h.s(var7, ".gif", true)) {
               break label26;
            }
         }
      }

      var5 = false;
   }

   val var8: AbstractDraweeControllerBuilder = var0.getControllerBuilder();
   if (var2 != null) {
      var5 = var2;
   }

   var0.setController(var8.B(var5).E(var3).b(var6).c(var0.getController()).a());
   if (var1 == null || h.x(var1)) {
      var4 = 8;
   }

   var0.setVisibility(var4);
}

@JvmSynthetic
fun `setOptionalImageUrl$default`(var0: SimpleDraweeView, var1: java.lang.String, var2: java.lang.Boolean, var3: ControllerListener, var4: Int, var5: Any) {
   if ((var4 and 2) != 0) {
      var2 = null;
   }

   if ((var4 and 4) != 0) {
      var3 = null;
   }

   setOptionalImageUrl(var0, var1, var2, var3);
}
