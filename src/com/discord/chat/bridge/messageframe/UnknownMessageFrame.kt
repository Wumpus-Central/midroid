package com.discord.chat.bridge.messageframe

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class UnknownMessageFrame(type: MessageFrameType) : MessageFrame {
   public open val type: MessageFrameType

   init {
      r.h(var1, "type");
      super(null);
      this.type = var1;
   }

   public operator fun component1(): MessageFrameType {
      return this.type;
   }

   public fun copy(type: MessageFrameType = var0.type): UnknownMessageFrame {
      r.h(var1, "type");
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
      val var1: MessageFrameType = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UnknownMessageFrame(type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UnknownMessageFrame> {
         return UnknownMessageFrame.$serializer.INSTANCE;
      }
   }
}
