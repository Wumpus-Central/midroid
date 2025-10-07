package com.discord.clip

import android.graphics.Canvas
import android.graphics.Path
import android.graphics.Region.Op
import android.os.Build.VERSION
import com.discord.chat.presentation.list.x

internal fun Canvas.clipPathCompat(path: Path, op: Op): Boolean {
   val var3: Boolean;
   if (VERSION.SDK_INT >= 26) {
      if (var2 === Op.DIFFERENCE) {
         var3 = x.a(var0, var1);
      } else {
         var3 = var0.clipPath(var1);
      }
   } else {
      var3 = var0.clipPath(var1, var2);
   }

   return var3;
}
