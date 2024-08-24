package com.discord.media.engine.video.egl_renderer

import kotlin.jvm.internal.r

internal final val rotatedAspectRatio: Float
   internal final get() {
      r.h(var0, "<this>");
      return (float)var0.getRotatedWidth() / var0.getRotatedHeight();
   }

