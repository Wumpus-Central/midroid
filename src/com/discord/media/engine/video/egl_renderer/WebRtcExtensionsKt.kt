package com.discord.media.engine.video.egl_renderer

import kotlin.jvm.internal.q

internal final val rotatedAspectRatio: Float
   internal final get() {
      q.h(var0, "<this>");
      return (float)var0.getRotatedWidth() / var0.getRotatedHeight();
   }

