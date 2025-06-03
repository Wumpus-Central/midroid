package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapSafetySystemNotificationCta(ctaType: String, ctaKey: String) : ReactEvent {
   public final val ctaType: String
   public final val ctaKey: String

   init {
      q.h(var1, "ctaType");
      q.h(var2, "ctaKey");
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
      q.h(var1, "ctaType");
      q.h(var2, "ctaKey");
      return new TapSafetySystemNotificationCta(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSafetySystemNotificationCta) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.ctaType, var1.ctaType)) {
            return false;
         } else {
            return q.c(this.ctaKey, var1.ctaKey);
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
      val var1: java.lang.String = this.ctaType;
      val var3: java.lang.String = this.ctaKey;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapSafetySystemNotificationCta(ctaType=");
      var2.append(var1);
      var2.append(", ctaKey=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSafetySystemNotificationCta> {
         return TapSafetySystemNotificationCta.$serializer.INSTANCE;
      }
   }
}
