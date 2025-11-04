package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class TapSafetySystemNotificationCta(ctaType: String, ctaKey: String) : ReactEvent {
   public final val ctaType: String
   public final val ctaKey: String

   init {
      super();
      this.ctaType = var1;
      this.ctaKey = var2;
   }

   public operator fun component1(): String {
      return this.ctaType;
   }

   public operator fun component2(): String {
      return this.ctaKey;
   }

   public fun copy(ctaType: String = var0.ctaType, ctaKey: String = var0.ctaKey): TapSafetySystemNotificationCta {
      return new TapSafetySystemNotificationCta(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSafetySystemNotificationCta) {
         return false;
      } else {
         var1 = var1;
         if (!(this.ctaType == var1.ctaType)) {
            return false;
         } else {
            return this.ctaKey == var1.ctaKey;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.ctaType.hashCode() * 31 + this.ctaKey.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.ctaType;
      val var3: java.lang.String = this.ctaKey;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapSafetySystemNotificationCta(ctaType=");
      var1.append(var2);
      var1.append(", ctaKey=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSafetySystemNotificationCta> {
         return TapSafetySystemNotificationCta.$serializer.INSTANCE;
      }
   }
}
