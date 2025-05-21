package com.discord.chat.bridge.messageframe

import Za.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class UnknownMessageFrame(type: MessageFrameType) : MessageFrame {
   public open val type: MessageFrameType

   init {
      q.h(var1, "type");
      super(null);
      this.type = var1;
   }

   public operator fun component1(): MessageFrameType {
      return this.type;
   }

   public fun copy(type: MessageFrameType = var0.type): UnknownMessageFrame {
      q.h(var1, "type");
      return new UnknownMessageFrame(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnknownMessageFrame) {
         return false;
      } else {
         return this.type === (var1 as UnknownMessageFrame).type;
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageFrameType = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UnknownMessageFrame(type=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UnknownMessageFrame> {
         return UnknownMessageFrame.$serializer.INSTANCE;
      }
   }
}
