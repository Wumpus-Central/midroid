package com.discord.misc.utilities.measure

import android.content.Context
import android.util.Size
import android.view.View
import com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds
import kotlin.jvm.internal.r

public fun <T : View> Context.measureHeadlessView(clazz: Class<T>, configureView: (T) -> Unit, measureBounds: MeasureBounds): Size {
   r.h(var0, "<this>");
   r.h(var1, "clazz");
   r.h(var2, "configureView");
   r.h(var3, "measureBounds");
   return new HeadlessViewMeasurer(var1).measure$misc_utilities_release(var0, var2, var3);
}

@JvmSynthetic
public inline fun <reified T : View> Context.measureHeadlessView(noinline configureView: (T) -> Unit, measureBounds: MeasureBounds): Size {
   r.h(var0, "<this>");
   r.h(var1, "configureView");
   r.h(var2, "measureBounds");
   r.m(4, "T");
   return measureHeadlessView(var0, View.class, var1, var2);
}
