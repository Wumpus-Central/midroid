package com.discord.chat.bridge.referencedmessage

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class LoadedReferencedMessage(message: Message, systemContent: StructurableText? = null) : ReferencedMessage {
   public final val message: Message
   public final val systemContent: StructurableText?

   init {
      r.h(var1, "message");
      super(null);
      this.message = var1;
      this.systemContent = var2;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public operator fun component2(): StructurableText? {
      return this.systemContent;
   }

   public fun copy(message: Message = var0.message, systemContent: StructurableText? = var0.systemContent): LoadedReferencedMessage {
      r.h(var1, "message");
      return new LoadedReferencedMessage(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadedReferencedMessage) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.message, var1.message)) {
            return false;
         } else {
            return r.c(this.systemContent, var1.systemContent);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.message.hashCode();
      val var1: Int;
      if (this.systemContent == null) {
         var1 = 0;
      } else {
         var1 = this.systemContent.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var2: Message = this.message;
      val var1: StructurableText = this.systemContent;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LoadedReferencedMessage(message=");
      var3.append(var2);
      var3.append(", systemContent=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LoadedReferencedMessage> {
         return LoadedReferencedMessage.$serializer.INSTANCE;
      }
   }
}
