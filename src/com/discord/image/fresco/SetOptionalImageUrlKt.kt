package com.discord.image.fresco

import android.net.Uri
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder
import com.facebook.drawee.controller.ControllerListener
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.drawee.view.c
import e4.f
import kotlin.jvm.internal.r

public fun SimpleDraweeView.setOptionalImageUrl(imageUrl: String?, autoPlayAnimations: Boolean? = null, controllerListener: ControllerListener<in Any>? = null) {
   var var5: Byte;
   var var7: Boolean;
   var var8: Uri;
   label29: {
      r.h(var0, "<this>");
      var8 = f.o(var1);
      var5 = 0;
      if (var8 != null) {
         val var9: java.lang.String = var8.getLastPathSegment();
         if (var9 != null && kotlin.text.f.s(var9, ".gif", true)) {
            var7 = true;
            break label29;
         }
      }

      var7 = false;
   }

   val var10: AbstractDraweeControllerBuilder = c.a(var0);
   if (var2 != null) {
      var7 = var2;
   }

   var0.setController(var10.z(var7).C(var3).a(var8).b(var0.getController()).build());
   var var4: Boolean = true;
   if (var1 != null) {
      if (kotlin.text.f.x(var1)) {
         var4 = true;
      } else {
         var4 = false;
      }
   }

   if (var4) {
      var5 = 8;
   }

   var0.setVisibility(var5);
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
