package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapReferralRedeemData(referralId: String?) : ReactEvent {
   public final val referralId: String?

   init {
      super();
      this.referralId = var1;
   }

   public operator fun component1(): String? {
      return this.referralId;
   }

   public fun copy(referralId: String? = var0.referralId): TapReferralRedeemData {
      return new TapReferralRedeemData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapReferralRedeemData) {
         return false;
      } else {
         return q.c(this.referralId, (var1 as TapReferralRedeemData).referralId);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.referralId == null) {
         var1 = 0;
      } else {
         var1 = this.referralId.hashCode();
      }

      return var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.referralId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapReferralRedeemData(referralId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapReferralRedeemData> {
         return TapReferralRedeemData.$serializer.INSTANCE;
      }
   }
}
