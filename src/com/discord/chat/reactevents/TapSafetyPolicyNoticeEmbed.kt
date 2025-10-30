package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
public data class TapSafetyPolicyNoticeEmbed(classificationId: String) : ReactEvent {
   public final val classificationId: String

   init {
      super();
      this.classificationId = var1;
   }

   public operator fun component1(): String {
      return this.classificationId;
   }

   public fun copy(classificationId: String = var0.classificationId): TapSafetyPolicyNoticeEmbed {
      return new TapSafetyPolicyNoticeEmbed(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSafetyPolicyNoticeEmbed) {
         return false;
      } else {
         return this.classificationId == (var1 as TapSafetyPolicyNoticeEmbed).classificationId;
      }
   }

   public override fun hashCode(): Int {
      return this.classificationId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.classificationId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapSafetyPolicyNoticeEmbed(classificationId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSafetyPolicyNoticeEmbed> {
         return TapSafetyPolicyNoticeEmbed.$serializer.INSTANCE;
      }
   }
}
