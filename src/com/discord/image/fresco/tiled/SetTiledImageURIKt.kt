package com.discord.image.fresco.tiled

import android.content.res.Resources
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.r

public fun SimpleDraweeView.setTiledImageURI(uri: String) {
   r.h(var0, "<this>");
   r.h(var1, "uri");
   var var2: Boolean;
   if ((var0.getHierarchy() as GenericDraweeHierarchy).m() == null) {
      var2 = true;
   } else {
      var2 = false;
   }

   if (!var2) {
      throw new IllegalArgumentException("Somebody forgot to set actualImageScaleType='none'".toString());
   } else {
      val var7: Resources = var0.getResources();
      r.g(var7, "resources");
      val var8: TiledDraweeController = new TiledDraweeController(var7, var1, null, 4, null);
      val var5: DraweeController = var0.getController();
      if (var5 != null && var5.isSameImageRequest(var8)) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (!var2) {
         var0.setController(var8);
      }
   }
}
