package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TapGiftCodeEmbedData(giftCode: String) : ReactEvent {
   public final val giftCode: String

   init {
      super();
      this.giftCode = var1;
   }

   public operator fun component1(): String {
      return this.giftCode;
   }

   public fun copy(giftCode: String = var0.giftCode): TapGiftCodeEmbedData {
      return new TapGiftCodeEmbedData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGiftCodeEmbedData) {
         return false;
      } else {
         return this.giftCode == (var1 as TapGiftCodeEmbedData).giftCode;
      }
   }

   public override fun hashCode(): Int {
      return this.giftCode.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.giftCode;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapGiftCodeEmbedData(giftCode=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapGiftCodeEmbedData> {
         return TapGiftCodeEmbedData.$serializer.INSTANCE;
      }
   }
}
