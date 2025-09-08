package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TapObscuredMediaToggleData(messageId: String, channelId: String, attachmentId: String, embedId: String, isReveal: Boolean) : ReactEvent {
   public final val messageId: String
   public final val channelId: String
   public final val attachmentId: String
   public final val embedId: String
   public final val isReveal: Boolean

   init {
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.attachmentId = var3;
      this.embedId = var4;
      this.isReveal = var5;
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

   public operator fun component5(): Boolean {
      return this.isReveal;
   }

   public fun copy(
      messageId: String = var0.messageId,
      channelId: String = var0.channelId,
      attachmentId: String = var0.attachmentId,
      embedId: String = var0.embedId,
      isReveal: Boolean = var0.isReveal
   ): TapObscuredMediaToggleData {
      return new TapObscuredMediaToggleData(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapObscuredMediaToggleData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.messageId == var1.messageId)) {
            return false;
         } else if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.attachmentId == var1.attachmentId)) {
            return false;
         } else if (!(this.embedId == var1.embedId)) {
            return false;
         } else {
            return this.isReveal == var1.isReveal;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.embedId.hashCode()) * 31
         + java.lang.Boolean.hashCode(this.isReveal);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.messageId;
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.attachmentId;
      val var5: java.lang.String = this.embedId;
      val var1: Boolean = this.isReveal;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapObscuredMediaToggleData(messageId=");
      var4.append(var6);
      var4.append(", channelId=");
      var4.append(var3);
      var4.append(", attachmentId=");
      var4.append(var2);
      var4.append(", embedId=");
      var4.append(var5);
      var4.append(", isReveal=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapObscuredMediaToggleData> {
         return TapObscuredMediaToggleData.$serializer.INSTANCE;
      }
   }
}
