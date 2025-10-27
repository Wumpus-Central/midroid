package com.discord.chat.bridge.referencedmessage

import kc.m
import kotlinx.serialization.KSerializer

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
      val var1: java.lang.String = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SystemReferencedMessage(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SystemReferencedMessage> {
         return SystemReferencedMessage.$serializer.INSTANCE;
      }
   }
}
