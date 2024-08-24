package com.discord.misc.utilities.view

import android.graphics.Point
import android.view.View
import kotlin.jvm.internal.r

public fun View.getLocationInWindow(): Point {
   r.h(var0, "<this>");
   val var1: IntArray = new int[2];
   var0.getLocationInWindow(var1);
   return new Point(var1[0], var1[1]);
}
