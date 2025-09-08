package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TapPreviewSharedClientThemeData(messageId: MessageId? = ...) : TapPreviewSharedClientThemeData(var1), ReactEvent {
   public final val messageId: MessageId?

   fun TapPreviewSharedClientThemeData(var1: java.lang.String) {
      this.messageId = var1;
   }

   public operator fun component1(): MessageId? {
      return this.messageId;
   }

   public fun copy(messageId: MessageId? = ...): TapPreviewSharedClientThemeData {
      return new TapPreviewSharedClientThemeData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPreviewSharedClientThemeData) {
         return false;
      } else {
         val var3: TapPreviewSharedClientThemeData = var1 as TapPreviewSharedClientThemeData;
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

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.messageId);
      }

      return var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String;
      if (this.messageId == null) {
         var3 = "null";
      } else {
         var3 = MessageId.toString-impl(this.messageId);
      }

      val var2: StringBuilder = new StringBuilder();
      var2.append("TapPreviewSharedClientThemeData(messageId=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapPreviewSharedClientThemeData> {
         return TapPreviewSharedClientThemeData.$serializer.INSTANCE;
      }
   }
}
