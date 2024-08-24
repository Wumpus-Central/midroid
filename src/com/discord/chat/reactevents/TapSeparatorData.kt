package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import kotlin.jvm.internal.r

public data class TapSeparatorData(type: String, context: String? = null) : ReactEvent {
   public final val context: String?
   public final val type: String

   init {
      r.h(var1, "type");
      super();
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
      r.h(var1, "type");
      return new TapSeparatorData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSeparatorData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.type, var1.type)) {
            return false;
         } else {
            return r.c(this.context, var1.context);
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

   public open fun serialize(): WritableMap {
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("type", this.type)});
      if (this.context != null) {
         var1.putString("context", this.context);
      }

      return var1;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.type;
      val var1: java.lang.String = this.context;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapSeparatorData(type=");
      var2.append(var3);
      var2.append(", context=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
