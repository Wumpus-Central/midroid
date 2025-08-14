package com.discord.chat.bridge.botuikit

import android.graphics.Color

public fun GradientColor.toColorInt(): Int {
   return Color.argb((int)(var0.getA() * (float)255), var0.getR(), var0.getG(), var0.getB());
}
