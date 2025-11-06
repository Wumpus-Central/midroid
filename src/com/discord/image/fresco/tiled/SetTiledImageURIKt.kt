package com.discord.image.fresco.tiled

import android.content.res.Resources
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView

public fun SimpleDraweeView.setTiledImageURI(uri: String) {
   if ((var0.getHierarchy() as GenericDraweeHierarchy).m() == null) {
      val var2: Resources = var0.getResources();
      val var3: TiledDraweeController = new TiledDraweeController(var2, var1, null, 4, null);
      val var4: DraweeController = var0.getController();
      if (var4 == null || !var4.isSameImageRequest(var3)) {
         var0.setController(var3);
      }
   } else {
      throw new IllegalArgumentException("Somebody forgot to set actualImageScaleType='none'");
   }
}
