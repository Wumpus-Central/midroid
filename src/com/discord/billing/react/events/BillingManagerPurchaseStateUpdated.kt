package com.discord.billing.react.events

import Ja.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal data class BillingManagerPurchaseStateUpdated(billingResult: Int) : ReactEvent {
   public final val billingResult: Int

   init {
      this.billingResult = var1;
   }

   public operator fun component1(): Int {
      return this.billingResult;
   }

   public fun copy(billingResult: Int = var0.billingResult): BillingManagerPurchaseStateUpdated {
      return new BillingManagerPurchaseStateUpdated(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BillingManagerPurchaseStateUpdated) {
         return false;
      } else {
         return this.billingResult == (var1 as BillingManagerPurchaseStateUpdated).billingResult;
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.billingResult);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.billingResult;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BillingManagerPurchaseStateUpdated(billingResult=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BillingManagerPurchaseStateUpdated> {
         return BillingManagerPurchaseStateUpdated.$serializer.INSTANCE;
      }
   }
}
