package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TapObscuredMediaLearnMoreData(messageId: String, channelId: String, attachmentId: String, embedId: String) : ReactEvent {
   public final val messageId: String
   public final val channelId: String
   public final val attachmentId: String
   public final val embedId: String

   init {
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.attachmentId = var3;
      this.embedId = var4;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.attachmentId;
   }

   public operator fun component4(): String {
      return this.embedId;
   }

   public fun copy(
      messageId: String = var0.messageId,
      channelId: String = var0.channelId,
      attachmentId: String = var0.attachmentId,
      embedId: String = var0.embedId
   ): TapObscuredMediaLearnMoreData {
      return new TapObscuredMediaLearnMoreData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapObscuredMediaLearnMoreData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.messageId == var1.messageId)) {
            return false;
         } else if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.attachmentId == var1.attachmentId)) {
            return false;
         } else {
            return this.embedId == var1.embedId;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.embedId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.messageId;
      val var3: java.lang.String = this.channelId;
      val var5: java.lang.String = this.attachmentId;
      val var2: java.lang.String = this.embedId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapObscuredMediaLearnMoreData(messageId=");
      var1.append(var4);
      var1.append(", channelId=");
      var1.append(var3);
      var1.append(", attachmentId=");
      var1.append(var5);
      var1.append(", embedId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapObscuredMediaLearnMoreData> {
         return TapObscuredMediaLearnMoreData.$serializer.INSTANCE;
      }
   }
}
