package com.discord.notifications.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import pc.m

@m
internal data class RegisterEvent(token: String) : ReactEvent {
   public final val token: String

   init {
      super();
      this.token = var1;
   }

   public operator fun component1(): String {
      return this.token;
   }

   public fun copy(token: String = var0.token): RegisterEvent {
      return new RegisterEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RegisterEvent) {
         return false;
      } else {
         return this.token == (var1 as RegisterEvent).token;
      }
   }

   public override fun hashCode(): Int {
      return this.token.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.token;
      val var2: StringBuilder = new StringBuilder();
      var2.append("RegisterEvent(token=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<RegisterEvent> {
         return RegisterEvent.$serializer.INSTANCE;
      }
   }
}
