package com.discord.emoji_picker.react_events

import Ca.v
import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap

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

   public constructor(data: ScrollEvent) : this(
         SizeUtilsKt.getPxToDp(var1.getX()),
         SizeUtilsKt.getPxToDp(var1.getY()),
         SizeUtilsKt.getPxToDp(var1.getWidth()),
         SizeUtilsKt.getPxToDp(var1.getHeight()),
         SizeUtilsKt.getPxToDp(var1.getContentWidth()),
         SizeUtilsKt.getPxToDp(var1.getContentHeight())
      )
   public open fun serialize(): WritableMap {
      val var1: Int = 0;
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            v.a("contentInset", NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("left", var1), v.a("top", var1), v.a("bottom", var1), v.a("right", var1)})),
            v.a("contentOffset", NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("x", this.x), v.a("y", this.y)})),
            v.a("contentSize", NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("width", this.contentWidth), v.a("height", this.contentHeight)})),
            v.a("layoutMeasurement", NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("width", this.width), v.a("height", this.height)}))
         }
      );
   }
}
