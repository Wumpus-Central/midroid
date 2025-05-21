package com.discord.safearea.react.events

import Za.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal data class OnSafeAreaInsetsDidChangeData(top: Float, bottom: Float, left: Float, right: Float) : ReactEvent {
   public final val top: Float
   public final val bottom: Float
   public final val left: Float
   public final val right: Float

   init {
      this.top = var1;
      this.bottom = var2;
      this.left = var3;
      this.right = var4;
   }

   public operator fun component1(): Float {
      return this.top;
   }

   public operator fun component2(): Float {
      return this.bottom;
   }

   public operator fun component3(): Float {
      return this.left;
   }

   public operator fun component4(): Float {
      return this.right;
   }

   public fun copy(top: Float = var0.top, bottom: Float = var0.bottom, left: Float = var0.left, right: Float = var0.right): OnSafeAreaInsetsDidChangeData {
      return new OnSafeAreaInsetsDidChangeData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnSafeAreaInsetsDidChangeData) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.top, var1.top) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.bottom, var1.bottom) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.left, var1.left) != 0) {
            return false;
         } else {
            return java.lang.Float.compare(this.right, var1.right) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.top) * 31 + java.lang.Float.hashCode(this.bottom)) * 31 + java.lang.Float.hashCode(this.left)) * 31
         + java.lang.Float.hashCode(this.right);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Float = this.top;
      val var4: Float = this.bottom;
      val var3: Float = this.left;
      val var2: Float = this.right;
      val var5: StringBuilder = new StringBuilder();
      var5.append("OnSafeAreaInsetsDidChangeData(top=");
      var5.append(var1);
      var5.append(", bottom=");
      var5.append(var4);
      var5.append(", left=");
      var5.append(var3);
      var5.append(", right=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnSafeAreaInsetsDidChangeData> {
         return OnSafeAreaInsetsDidChangeData.$serializer.INSTANCE;
      }
   }
}
