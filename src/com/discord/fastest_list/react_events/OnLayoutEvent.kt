package com.discord.fastest_list.react_events

import A9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class OnLayoutEvent(x: Float, y: Float, width: Float, height: Float) : ReactEvent {
   public final val x: Float
   public final val y: Float
   public final val width: Float
   public final val height: Float

   init {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
   }

   public operator fun component1(): Float {
      return this.x;
   }

   public operator fun component2(): Float {
      return this.y;
   }

   public operator fun component3(): Float {
      return this.width;
   }

   public operator fun component4(): Float {
      return this.height;
   }

   public fun copy(x: Float = var0.x, y: Float = var0.y, width: Float = var0.width, height: Float = var0.height): OnLayoutEvent {
      return new OnLayoutEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnLayoutEvent) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.x, var1.x) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.y, var1.y) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.width, var1.width) != 0) {
            return false;
         } else {
            return java.lang.Float.compare(this.height, var1.height) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height);
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("layout", NativeMapExtensionsKt.nativeMapOf(s.a("x", this.x), s.a("y", this.y), s.a("width", this.width), s.a("height", this.height)))
      );
   }

   public override fun toString(): String {
      val var1: Float = this.x;
      val var4: Float = this.y;
      val var2: Float = this.width;
      val var3: Float = this.height;
      val var5: StringBuilder = new StringBuilder();
      var5.append("OnLayoutEvent(x=");
      var5.append(var1);
      var5.append(", y=");
      var5.append(var4);
      var5.append(", width=");
      var5.append(var2);
      var5.append(", height=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnLayoutEvent> {
         return OnLayoutEvent.$serializer.INSTANCE;
      }
   }
}
