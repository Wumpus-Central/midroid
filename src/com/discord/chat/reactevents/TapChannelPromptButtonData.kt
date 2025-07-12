package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapChannelPromptButtonData(messageId: String, channelId: String, buttonType: String) : ReactEvent {
   public final val messageId: String
   public final val channelId: String
   public final val buttonType: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      r.h(var3, "buttonType");
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
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      r.h(var3, "buttonType");
      return new TapChannelPromptButtonData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapChannelPromptButtonData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.buttonType, var1.buttonType);
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
      val var3: java.lang.String = this.messageId;
      val var4: java.lang.String = this.channelId;
      val var2: java.lang.String = this.buttonType;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapChannelPromptButtonData(messageId=");
      var1.append(var3);
      var1.append(", channelId=");
      var1.append(var4);
      var1.append(", buttonType=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapChannelPromptButtonData> {
         return TapChannelPromptButtonData.$serializer.INSTANCE;
      }
   }
}
