package com.discord.react.utilities

import android.view.View
import android.view.View.MeasureSpec

@JvmSynthetic
fun `access$measureAndLayoutInternal`(var0: View) {
   measureAndLayoutInternal(var0);
}

public fun View.measureAndLayout() {
   ViewLayoutManager.INSTANCE.queueMeasureAndLayout(var0);
}

private fun View.measureAndLayoutInternal() {
   var0.measure(MeasureSpec.makeMeasureSpec(var0.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var0.getHeight(), 1073741824));
   var0.layout(var0.getLeft(), var0.getTop(), var0.getRight(), var0.getBottom());
}
