package com.discord.phone_verification.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@f
internal data class VerificationCodeReceivedEvent(code: String) : ReactEvent {
   public final val code: String

   init {
      r.h(var1, "code");
      super();
      this.code = var1;
   }

   public operator fun component1(): String {
      return this.code;
   }

   public fun copy(code: String = var0.code): VerificationCodeReceivedEvent {
      r.h(var1, "code");
      return new VerificationCodeReceivedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VerificationCodeReceivedEvent) {
         return false;
      } else {
         return r.c(this.code, (var1 as VerificationCodeReceivedEvent).code);
      }
   }

   public override fun hashCode(): Int {
      return this.code.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.code;
      val var2: StringBuilder = new StringBuilder();
      var2.append("VerificationCodeReceivedEvent(code=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<VerificationCodeReceivedEvent> {
         return VerificationCodeReceivedEvent.$serializer.INSTANCE;
      }
   }
}
