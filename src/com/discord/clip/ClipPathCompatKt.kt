package com.discord.clip

import android.graphics.Canvas
import android.graphics.Path
import android.graphics.Region.Op
import android.os.Build.VERSION

internal fun Canvas.clipPathCompat(path: Path, op: Op): Boolean {
   if (VERSION.SDK_INT >= 26) {
      return if (var2 === Op.DIFFERENCE) var0.clipOutPath(var1) else var0.clipPath(var1);
   } else {
      return var0.clipPath(var1, var2);
   }
}
