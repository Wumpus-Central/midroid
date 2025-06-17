package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapSelectActionComponent(messageId: MessageId, componentId: String) : TapSelectActionComponent(var1, var2), ReactEvent {
   public final val messageId: MessageId
   public final val componentId: String

   fun TapSelectActionComponent(var1: java.lang.String, var2: java.lang.String) {
      q.h(var1, "messageId");
      q.h(var2, "componentId");
      super();
      this.messageId = var1;
      this.componentId = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.componentId;
   }

   public fun copy(messageId: MessageId = ..., componentId: String = ...): TapSelectActionComponent {
      q.h(var1, "messageId");
      q.h(var2, "componentId");
      return new TapSelectActionComponent(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSelectActionComponent) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.componentId, var1.componentId);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.componentId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: java.lang.String = this.componentId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapSelectActionComponent(messageId=");
      var2.append(var3);
      var2.append(", componentId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapSelectActionComponent> {
         return TapSelectActionComponent.$serializer.INSTANCE;
      }
   }
}
