package com.discord.fastest_list.react_events

import com.discord.fastest_list.android.scroll.FastestListScrollOffset.Data
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import ht.v

internal open class OnScrollEvent private constructor(x: Float, y: Float, width: Float, height: Float, contentWidth: Float, contentHeight: Float) : ReactEvent {
   private final val x: Float
   private final val y: Float
   private final val width: Float
   private final val height: Float
   private final val contentWidth: Float
   private final val contentHeight: Float

   init {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
      this.contentWidth = var5;
      this.contentHeight = var6;
   }

   public constructor(data: Data) : this(
         SizeUtilsKt.getPxToDp(var1.getX()),
         SizeUtilsKt.getPxToDp(var1.getY()),
         SizeUtilsKt.getPxToDp(var1.getWidth()),
         SizeUtilsKt.getPxToDp(var1.getHeight()),
         SizeUtilsKt.getPxToDp(var1.getContentWidth()),
         SizeUtilsKt.getPxToDp(var1.getContentHeight())
      )
   public override fun serialize(): WritableMap {
      val var1: Int = 0;
      return NativeMapExtensionsKt.nativeMapOf(
         v.a("contentInset", NativeMapExtensionsKt.nativeMapOf(v.a("left", var1), v.a("top", var1), v.a("bottom", var1), v.a("right", var1))),
         v.a("contentOffset", NativeMapExtensionsKt.nativeMapOf(v.a("x", this.x), v.a("y", this.y))),
         v.a("contentSize", NativeMapExtensionsKt.nativeMapOf(v.a("width", this.contentWidth), v.a("height", this.contentHeight))),
         v.a("layoutMeasurement", NativeMapExtensionsKt.nativeMapOf(v.a("width", this.width), v.a("height", this.height)))
      );
   }
}
