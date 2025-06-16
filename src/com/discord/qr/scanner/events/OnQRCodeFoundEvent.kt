package com.discord.qr.scanner.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
internal data class OnQRCodeFoundEvent(status: String, result: String? = null) : ReactEvent {
   public final val status: String
   public final val result: String?

   init {
      q.h(var1, "status");
      super();
      this.status = var1;
      this.result = var2;
   }

   public operator fun component1(): String {
      return this.status;
   }

   public operator fun component2(): String? {
      return this.result;
   }

   public fun copy(status: String = var0.status, result: String? = var0.result): OnQRCodeFoundEvent {
      q.h(var1, "status");
      return new OnQRCodeFoundEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnQRCodeFoundEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.status, var1.status)) {
            return false;
         } else {
            return q.c(this.result, var1.result);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.status.hashCode();
      val var1: Int;
      if (this.result == null) {
         var1 = 0;
      } else {
         var1 = this.result.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.status;
      val var3: java.lang.String = this.result;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnQRCodeFoundEvent(status=");
      var1.append(var2);
      var1.append(", result=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnQRCodeFoundEvent> {
         return OnQRCodeFoundEvent.$serializer.INSTANCE;
      }
   }
}
