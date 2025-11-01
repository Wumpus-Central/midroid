package com.discord.device.react_events

import android.util.DisplayMetrics
import androidx.window.layout.WindowMetrics
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import com.facebook.react.uimanager.DisplayMetricsHolder
import ht.v

internal data class MetricsSize(widthPixels: Int, heightPixels: Int) : ReactEvent {
   private final val widthPixels: Int
   private final val heightPixels: Int

   init {
      this.widthPixels = var1;
      this.heightPixels = var2;
   }

   public constructor(metrics: DisplayMetrics) : this(var1.widthPixels, var1.heightPixels)
   public constructor(metrics: WindowMetrics) : this(var1.a().width(), var1.a().height())
   private operator fun component1(): Int {
      return this.widthPixels;
   }

   private operator fun component2(): Int {
      return this.heightPixels;
   }

   public fun copy(widthPixels: Int = var0.widthPixels, heightPixels: Int = var0.heightPixels): MetricsSize {
      return new MetricsSize(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MetricsSize) {
         return false;
      } else {
         var1 = var1;
         if (this.widthPixels != var1.widthPixels) {
            return false;
         } else {
            return this.heightPixels == var1.heightPixels;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.widthPixels) * 31 + Integer.hashCode(this.heightPixels);
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(v.a("width", SizeUtilsKt.getPxToDp(this.widthPixels)), v.a("height", SizeUtilsKt.getPxToDp(this.heightPixels)));
   }

   public override fun toString(): String {
      val var1: Int = this.widthPixels;
      val var2: Int = this.heightPixels;
      val var3: StringBuilder = new StringBuilder();
      var3.append("MetricsSize(widthPixels=");
      var3.append(var1);
      var3.append(", heightPixels=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun createScreenFallback(): WritableNativeMap {
         return new MetricsSize(DisplayMetricsHolder.getScreenDisplayMetrics()).serialize();
      }

      public fun createWindowFallback(): WritableNativeMap {
         return new MetricsSize(DisplayMetricsHolder.getWindowDisplayMetrics()).serialize();
      }
   }
}
