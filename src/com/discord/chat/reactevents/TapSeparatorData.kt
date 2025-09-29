package com.discord.chat.reactevents

import A9.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap

public data class TapSeparatorData(type: String, context: String? = null) : ReactEvent {
   public final val type: String
   public final val context: String?

   init {
      this.type = var1;
      this.context = var2;
   }

   public operator fun component1(): String {
      return this.type;
   }

   public operator fun component2(): String? {
      return this.context;
   }

   public fun copy(type: String = var0.type, context: String? = var0.context): TapSeparatorData {
      return new TapSeparatorData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSeparatorData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.type == var1.type)) {
            return false;
         } else {
            return this.context == var1.context;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.type.hashCode();
      val var1: Int;
      if (this.context == null) {
         var1 = 0;
      } else {
         var1 = this.context.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun serialize(): WritableMap {
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(s.a("type", this.type));
      if (this.context != null) {
         var1.putString("context", this.context);
      }

      return var1;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.type;
      val var2: java.lang.String = this.context;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapSeparatorData(type=");
      var1.append(var3);
      var1.append(", context=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
