package com.discord.chat.bridge.row

import com.discord.chat.bridge.MessageBase
import kotlinx.serialization.KSerializer
import pc.m

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
      val var1: MessageBase = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BlockedGroupContent(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupContent> {
         return BlockedGroupContent.$serializer.INSTANCE;
      }
   }
}
