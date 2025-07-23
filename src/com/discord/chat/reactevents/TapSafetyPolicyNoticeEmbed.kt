package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class TapSafetyPolicyNoticeEmbed(classificationId: String) : ReactEvent {
   public final val classificationId: String

   init {
      r.h(var1, "classificationId");
      super();
      this.classificationId = var1;
   }

   public operator fun component1(): String {
      return this.classificationId;
   }

   public fun copy(classificationId: String = var0.classificationId): TapSafetyPolicyNoticeEmbed {
      r.h(var1, "classificationId");
      return new TapSafetyPolicyNoticeEmbed(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSafetyPolicyNoticeEmbed) {
         return false;
      } else {
         return r.c(this.classificationId, (var1 as TapSafetyPolicyNoticeEmbed).classificationId);
      }
   }

   public override fun hashCode(): Int {
      return this.classificationId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.classificationId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapSafetyPolicyNoticeEmbed(classificationId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSafetyPolicyNoticeEmbed> {
         return TapSafetyPolicyNoticeEmbed.$serializer.INSTANCE;
      }
   }
}
