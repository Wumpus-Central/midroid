package com.discord.js_watchdog

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class StallReport(stallTime: Int, sessionId: String, trace: String?) : ReactEvent {
   public final val stallTime: Int
   public final val sessionId: String
   public final val trace: String?

   init {
      r.h(var2, "sessionId");
      super();
      this.stallTime = var1;
      this.sessionId = var2;
      this.trace = var3;
   }

   public operator fun component1(): Int {
      return this.stallTime;
   }

   public operator fun component2(): String {
      return this.sessionId;
   }

   public operator fun component3(): String? {
      return this.trace;
   }

   public fun copy(stallTime: Int = var0.stallTime, sessionId: String = var0.sessionId, trace: String? = var0.trace): StallReport {
      r.h(var2, "sessionId");
      return new StallReport(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StallReport) {
         return false;
      } else {
         var1 = var1;
         if (this.stallTime != var1.stallTime) {
            return false;
         } else if (!r.c(this.sessionId, var1.sessionId)) {
            return false;
         } else {
            return r.c(this.trace, var1.trace);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = Integer.hashCode(this.stallTime);
      val var3: Int = this.sessionId.hashCode();
      val var1: Int;
      if (this.trace == null) {
         var1 = 0;
      } else {
         var1 = this.trace.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.stallTime;
      val var4: java.lang.String = this.sessionId;
      val var3: java.lang.String = this.trace;
      val var2: StringBuilder = new StringBuilder();
      var2.append("StallReport(stallTime=");
      var2.append(var1);
      var2.append(", sessionId=");
      var2.append(var4);
      var2.append(", trace=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<StallReport> {
         return StallReport.$serializer.INSTANCE;
      }
   }
}
