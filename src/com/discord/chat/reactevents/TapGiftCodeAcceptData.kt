package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class TapGiftCodeAcceptData(giftCode: String, messageId: MessageId?) : TapGiftCodeAcceptData(var1, var2), ReactEvent {
   public final val giftCode: String
   public final val messageId: MessageId?

   fun TapGiftCodeAcceptData(var1: java.lang.String, var2: java.lang.String) {
      super();
      this.giftCode = var1;
      this.messageId = var2;
   }

   public operator fun component1(): String {
      return this.giftCode;
   }

   public operator fun component2(): MessageId? {
      return this.messageId;
   }

   public fun copy(giftCode: String = ..., messageId: MessageId? = ...): TapGiftCodeAcceptData {
      return new TapGiftCodeAcceptData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGiftCodeAcceptData) {
         return false;
      } else {
         val var3: TapGiftCodeAcceptData = var1 as TapGiftCodeAcceptData;
         if (!(this.giftCode == (var1 as TapGiftCodeAcceptData).giftCode)) {
            return false;
         } else {
            if (this.messageId == null) {
               if (var3.messageId == null) {
                  return true;
               }
            } else if (var3.messageId != null) {
               return MessageId.equals-impl0(this.messageId, var3.messageId);
            }

            return false;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.giftCode.hashCode();
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.messageId);
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.giftCode;
      val var4: java.lang.String;
      if (this.messageId == null) {
         var4 = "null";
      } else {
         var4 = MessageId.toString-impl(this.messageId);
      }

      val var3: StringBuilder = new StringBuilder();
      var3.append("TapGiftCodeAcceptData(giftCode=");
      var3.append(var2);
      var3.append(", messageId=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapGiftCodeAcceptData> {
         return TapGiftCodeAcceptData.$serializer.INSTANCE;
      }
   }
}
