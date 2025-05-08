package com.discord.react_gesture_handler.nested_touch

import android.content.Context
import android.view.MotionEvent
import android.view.ViewConfiguration
import kotlin.jvm.internal.q

internal class OriginTracker(context: Context) {
   public final val context: Context
   private final var origin: com.discord.react_gesture_handler.nested_touch.OriginTracker.Origin?
   private final var originSupplemental: com.discord.react_gesture_handler.nested_touch.OriginTracker.Origin?
   private final val scaledTouchSlopPx: Int

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.scaledTouchSlopPx = ViewConfiguration.get(var1).getScaledTouchSlop();
   }

   private fun com.discord.react_gesture_handler.nested_touch.OriginTracker.Origin.hasOriginMoved(x: Float, y: Float): Boolean {
      val var4: Boolean;
      if (!(Math.abs(var2 - var1.getXOrigin()) > this.scaledTouchSlopPx) && !(Math.abs(var3 - var1.getYOrigin()) > this.scaledTouchSlopPx)) {
         var4 = false;
      } else {
         var4 = true;
      }

      return var4;
   }

   public fun cleanUp() {
      this.origin = null;
      this.originSupplemental = null;
   }

   public fun hasOriginMoved(isSupplementalEvent: Boolean, event: MotionEvent): Boolean {
      q.h(var2, "event");
      if (var1) {
         if (this.originSupplemental == null) {
            this.originSupplemental = new OriginTracker.Origin(var2.getX(), var2.getY());
         }

         if (this.originSupplemental != null && this.hasOriginMoved(this.originSupplemental, var2.getX(), var2.getY())) {
            return true;
         }
      } else {
         if (this.origin == null) {
            this.origin = new OriginTracker.Origin(var2.getX(), var2.getY());
         }

         if (this.origin != null && this.hasOriginMoved(this.origin, var2.getX(), var2.getY())) {
            return true;
         }
      }

      return false;
   }

   internal data class Origin(xOrigin: Float, yOrigin: Float) {
      public final val xOrigin: Float
      public final val yOrigin: Float

      init {
         this.xOrigin = var1;
         this.yOrigin = var2;
      }

      public operator fun component1(): Float {
         return this.xOrigin;
      }

      public operator fun component2(): Float {
         return this.yOrigin;
      }

      public fun copy(xOrigin: Float = var0.xOrigin, yOrigin: Float = var0.yOrigin): com.discord.react_gesture_handler.nested_touch.OriginTracker.Origin {
         return new OriginTracker.Origin(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is OriginTracker.Origin) {
            return false;
         } else {
            var1 = var1;
            if (java.lang.Float.compare(this.xOrigin, var1.xOrigin) != 0) {
               return false;
            } else {
               return java.lang.Float.compare(this.yOrigin, var1.yOrigin) == 0;
            }
         }
      }

      public override fun hashCode(): Int {
         return java.lang.Float.hashCode(this.xOrigin) * 31 + java.lang.Float.hashCode(this.yOrigin);
      }

      public override fun toString(): String {
         val var2: Float = this.xOrigin;
         val var1: Float = this.yOrigin;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Origin(xOrigin=");
         var3.append(var2);
         var3.append(", yOrigin=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }
   }
}
