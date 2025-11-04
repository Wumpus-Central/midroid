package com.discord.phone_verification.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kc.m
import kotlinx.serialization.KSerializer

@m
internal data class VerificationCodeReceivedEvent(code: String) : ReactEvent {
   public final val code: String

   init {
      super();
      this.code = var1;
   }

   public operator fun component1(): String {
      return this.code;
   }

   public fun copy(code: String = var0.code): VerificationCodeReceivedEvent {
      return new VerificationCodeReceivedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VerificationCodeReceivedEvent) {
         return false;
      } else {
         return this.code == (var1 as VerificationCodeReceivedEvent).code;
      }
   }

   public override fun hashCode(): Int {
      return this.code.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.code;
      val var1: StringBuilder = new StringBuilder();
      var1.append("VerificationCodeReceivedEvent(code=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<VerificationCodeReceivedEvent> {
         return VerificationCodeReceivedEvent.$serializer.INSTANCE;
      }
   }
}
