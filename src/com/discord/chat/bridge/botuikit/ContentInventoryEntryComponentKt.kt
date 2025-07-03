package com.discord.chat.bridge.botuikit

import android.graphics.Color
import kotlin.jvm.internal.r

public fun GradientColor.toColorInt(): Int {
   r.h(var0, "<this>");
   return Color.argb((int)(var0.getA() * (float)255), var0.getR(), var0.getG(), var0.getB());
}
