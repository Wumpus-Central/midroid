package com.discord.chat.bridge.messageframe

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class MessageFrameMediaViewer(type: MessageFrameType) : MessageFrame {
   public open val type: MessageFrameType

   init {
      r.h(var1, "type");
      super(null);
      this.type = var1;
   }

   public operator fun component1(): MessageFrameType {
      return this.type;
   }

   public fun copy(type: MessageFrameType = var0.type): MessageFrameMediaViewer {
      r.h(var1, "type");
      return new MessageFrameMediaViewer(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageFrameMediaViewer) {
         return false;
      } else {
         return this.type === (var1 as MessageFrameMediaViewer).type;
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageFrameType = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageFrameMediaViewer(type=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameMediaViewer> {
         return MessageFrameMediaViewer.$serializer.INSTANCE;
      }
   }
}
