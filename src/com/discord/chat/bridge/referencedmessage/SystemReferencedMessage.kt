package com.discord.chat.bridge.referencedmessage

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class SystemReferencedMessage(content: String) : ReferencedMessage() {
   public final val content: String

   init {
      this.content = var1;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): SystemReferencedMessage {
      return new SystemReferencedMessage(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SystemReferencedMessage) {
         return false;
      } else {
         return this.content == (var1 as SystemReferencedMessage).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("SystemReferencedMessage(content=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SystemReferencedMessage> {
         return SystemReferencedMessage.$serializer.INSTANCE;
      }
   }
}
