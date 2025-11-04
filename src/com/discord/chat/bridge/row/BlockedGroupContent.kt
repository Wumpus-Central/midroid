package com.discord.chat.bridge.row

import com.discord.chat.bridge.MessageBase
import kc.m
import kotlinx.serialization.KSerializer

@m
public data class BlockedGroupContent(message: MessageBase) {
   @m(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   init {
      super();
      this.message = var1;
   }

   public operator fun component1(): MessageBase {
      return this.message;
   }

   public fun copy(message: MessageBase = var0.message): BlockedGroupContent {
      return new BlockedGroupContent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupContent) {
         return false;
      } else {
         return this.message == (var1 as BlockedGroupContent).message;
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: MessageBase = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockedGroupContent(message=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupContent> {
         return BlockedGroupContent.$serializer.INSTANCE;
      }
   }
}
