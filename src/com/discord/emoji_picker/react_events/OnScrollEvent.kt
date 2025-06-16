package com.discord.emoji_picker.react_events

import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import t9.s

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
         s.a("contentInset", NativeMapExtensionsKt.nativeMapOf(s.a("left", var1), s.a("top", var1), s.a("bottom", var1), s.a("right", var1))),
         s.a("contentOffset", NativeMapExtensionsKt.nativeMapOf(s.a("x", this.x), s.a("y", this.y))),
         s.a("contentSize", NativeMapExtensionsKt.nativeMapOf(s.a("width", this.contentWidth), s.a("height", this.contentHeight))),
         s.a("layoutMeasurement", NativeMapExtensionsKt.nativeMapOf(s.a("width", this.width), s.a("height", this.height)))
      );
   }
}
