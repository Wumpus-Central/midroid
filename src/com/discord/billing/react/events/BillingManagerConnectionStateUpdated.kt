package com.discord.billing.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kc.m
import kotlinx.serialization.KSerializer

@m
internal data class BillingManagerConnectionStateUpdated(connectionState: Int) : ReactEvent {
   public final val connectionState: Int

   init {
      this.connectionState = var1;
   }

   public operator fun component1(): Int {
      return this.connectionState;
   }

   public fun copy(connectionState: Int = var0.connectionState): BillingManagerConnectionStateUpdated {
      return new BillingManagerConnectionStateUpdated(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BillingManagerConnectionStateUpdated) {
         return false;
      } else {
         return this.connectionState == (var1 as BillingManagerConnectionStateUpdated).connectionState;
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.connectionState);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionState;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BillingManagerConnectionStateUpdated(connectionState=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerConnectionStateUpdated> {
         return BillingManagerConnectionStateUpdated.$serializer.INSTANCE;
      }
   }
}
