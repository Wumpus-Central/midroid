package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class TapGiftCodeEmbedData(giftCode: String) : ReactEvent {
   public final val giftCode: String

   init {
      q.h(var1, "giftCode");
      super();
      this.giftCode = var1;
   }

   public operator fun component1(): String {
      return this.giftCode;
   }

   public fun copy(giftCode: String = var0.giftCode): TapGiftCodeEmbedData {
      q.h(var1, "giftCode");
      return new TapGiftCodeEmbedData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGiftCodeEmbedData) {
         return false;
      } else {
         return q.c(this.giftCode, (var1 as TapGiftCodeEmbedData).giftCode);
      }
   }

   public override fun hashCode(): Int {
      return this.giftCode.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.giftCode;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapGiftCodeEmbedData(giftCode=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapGiftCodeEmbedData> {
         return TapGiftCodeEmbedData.$serializer.INSTANCE;
      }
   }
}
