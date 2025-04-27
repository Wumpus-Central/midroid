package com.discord.device

import android.content.Context
import android.graphics.Rect

public object ReactRootViewProxy {
   public final var setSystemGestureExclusionRects: ((Context, List<Rect>) -> Unit)?
}
