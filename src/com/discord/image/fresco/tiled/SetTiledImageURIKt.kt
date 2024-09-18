package com.discord.image.fresco.tiled

import android.content.res.Resources
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

public fun SimpleDraweeView.setTiledImageURI(uri: String) {
   q.h(var0, "<this>");
   q.h(var1, "uri");
   if ((var0.getHierarchy() as GenericDraweeHierarchy).n() != null) {
      throw new IllegalArgumentException("Somebody forgot to set actualImageScaleType='none'".toString());
   } else {
      val var2: Resources = var0.getResources();
      q.g(var2, "getResources(...)");
      val var4: TiledDraweeController = new TiledDraweeController(var2, var1, null, 4, null);
      val var3: DraweeController = var0.getController();
      if (var3 == null || !var3.isSameImageRequest(var4)) {
         var0.setController(var4);
      }
   }
}
