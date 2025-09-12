package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class TapTagData(messageId: MessageId, channelId: ChannelId, tagType: String?) : TapTagData(var1, var2, var4), ReactEvent {
   public final val messageId: MessageId
   public final val channelId: ChannelId
   public final val tagType: String?

   fun TapTagData(var1: java.lang.String, var2: Long, var4: java.lang.String) {
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.tagType = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.tagType;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ..., tagType: String? = ...): TapTagData {
      return new TapTagData(var1, var2, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapTagData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return this.tagType == var1.tagType;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.tagType == null) {
         var1 = 0;
      } else {
         var1 = this.tagType.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: java.lang.String = this.tagType;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapTagData(messageId=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var3);
      var4.append(", tagType=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapTagData> {
         return TapTagData.$serializer.INSTANCE;
      }
   }
}
