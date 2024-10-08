package com.discord.emoji_picker.react_events

import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kh.w
import kotlin.jvm.internal.q

internal open class OnScrollEvent private constructor(x: Float, y: Float, width: Float, height: Float, contentWidth: Float, contentHeight: Float) : ReactEvent {
   private final val contentHeight: Float
   private final val contentWidth: Float
   private final val height: Float
   private final val width: Float
   private final val x: Float
   private final val y: Float

   init {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
      this.contentWidth = var5;
      this.contentHeight = var6;
   }

   public constructor(data: ScrollEvent) : q.h(var1, "data") {
      this(
         SizeUtilsKt.getPxToDp(var1.getX()),
         SizeUtilsKt.getPxToDp(var1.getY()),
         SizeUtilsKt.getPxToDp(var1.getWidth()),
         SizeUtilsKt.getPxToDp(var1.getHeight()),
         SizeUtilsKt.getPxToDp(var1.getContentWidth()),
         SizeUtilsKt.getPxToDp(var1.getContentHeight())
      );
   }

   public override fun serialize(): WritableMap {
      val var1: Int = 0;
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("contentInset", NativeMapExtensionsKt.nativeMapOf(w.a("left", var1), w.a("top", var1), w.a("bottom", var1), w.a("right", var1))),
         w.a("contentOffset", NativeMapExtensionsKt.nativeMapOf(w.a("x", this.x), w.a("y", this.y))),
         w.a("contentSize", NativeMapExtensionsKt.nativeMapOf(w.a("width", this.contentWidth), w.a("height", this.contentHeight))),
         w.a("layoutMeasurement", NativeMapExtensionsKt.nativeMapOf(w.a("width", this.width), w.a("height", this.height)))
      );
   }
}
