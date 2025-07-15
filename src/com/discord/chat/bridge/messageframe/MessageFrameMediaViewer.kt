package com.discord.chat.bridge.messageframe

import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@f
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
      val var1: MessageFrameType = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MessageFrameMediaViewer(type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageFrameMediaViewer> {
         return MessageFrameMediaViewer.$serializer.INSTANCE;
      }
   }
}
