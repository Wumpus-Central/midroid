package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class MlsFailureCallbackEvent(connectionId: Int, source: String, reason: String) : ReactEvent {
   public final val connectionId: Int
   public final val source: String
   public final val reason: String

   init {
      r.h(var2, "source");
      r.h(var3, "reason");
      super();
      this.connectionId = var1;
      this.source = var2;
      this.reason = var3;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.source;
   }

   public operator fun component3(): String {
      return this.reason;
   }

   public fun copy(connectionId: Int = var0.connectionId, source: String = var0.source, reason: String = var0.reason): MlsFailureCallbackEvent {
      r.h(var2, "source");
      r.h(var3, "reason");
      return new MlsFailureCallbackEvent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MlsFailureCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!r.c(this.source, var1.source)) {
            return false;
         } else {
            return r.c(this.reason, var1.reason);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.connectionId) * 31 + this.source.hashCode()) * 31 + this.reason.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var2: java.lang.String = this.source;
      val var4: java.lang.String = this.reason;
      val var3: StringBuilder = new StringBuilder();
      var3.append("MlsFailureCallbackEvent(connectionId=");
      var3.append(var1);
      var3.append(", source=");
      var3.append(var2);
      var3.append(", reason=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MlsFailureCallbackEvent> {
         return MlsFailureCallbackEvent.$serializer.INSTANCE;
      }
   }
}
