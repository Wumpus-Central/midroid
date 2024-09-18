package com.discord.chat.bridge.referencedmessage

import bl.g0
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

@f
public data class LoadedReferencedMessage(message: Message, systemContent: StructurableText? = null) : ReferencedMessage {
   public final val message: Message
   public final val systemContent: StructurableText?

   init {
      q.h(var1, "message");
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
      q.h(var1, "message");
      return new LoadedReferencedMessage(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadedReferencedMessage) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.systemContent, var1.systemContent);
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
      val var1: Message = this.message;
      val var3: StructurableText = this.systemContent;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LoadedReferencedMessage(message=");
      var2.append(var1);
      var2.append(", systemContent=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LoadedReferencedMessage.$serializer = new LoadedReferencedMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage", var0, 2
         );
         var1.l("message", false);
         var1.l("systemContent", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{Message.$serializer.INSTANCE, a.u(StructurableTextSerializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): LoadedReferencedMessage {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: StructurableText;
         var var8: Message;
         if (var7.y()) {
            var8 = var7.m(var6, 0, Message.$serializer.INSTANCE, null) as Message;
            var5 = var7.v(var6, 1, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.v(var6, 1, StructurableTextSerializer.INSTANCE, var5) as StructurableText;
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0, Message.$serializer.INSTANCE, var8) as Message;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new LoadedReferencedMessage(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadedReferencedMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LoadedReferencedMessage.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadedReferencedMessage> {
         return LoadedReferencedMessage.$serializer.INSTANCE;
      }
   }
}
