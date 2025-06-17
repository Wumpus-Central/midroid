package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapChannelPromptButtonData(messageId: String, channelId: String, buttonType: String) : ReactEvent {
   public final val messageId: String
   public final val channelId: String
   public final val buttonType: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "buttonType");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.buttonType = var3;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.buttonType;
   }

   public fun copy(messageId: String = var0.messageId, channelId: String = var0.channelId, buttonType: String = var0.buttonType): TapChannelPromptButtonData {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "buttonType");
      return new TapChannelPromptButtonData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapChannelPromptButtonData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.buttonType, var1.buttonType);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.buttonType.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.messageId;
      val var2: java.lang.String = this.channelId;
      val var3: java.lang.String = this.buttonType;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapChannelPromptButtonData(messageId=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var2);
      var4.append(", buttonType=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapChannelPromptButtonData> {
         return TapChannelPromptButtonData.$serializer.INSTANCE;
      }
   }
}
