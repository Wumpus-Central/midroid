package com.discord.chat.bridge.referencedmessage

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.f0

@f
public data class LoadedReferencedMessage(message: Message, systemContent: StructurableText? = null) : ReferencedMessage {
   public final val message: Message
   public final val systemContent: StructurableText?

   init {
      r.h(var1, "message");
      super(null);
      this.message = var1;
      this.systemContent = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: LoadedReferencedMessage, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.y(var2, 0, Message.$serializer.INSTANCE, var0.message);
      if (var1.A(var2, 1) || var0.systemContent != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, StructurableTextSerializer.INSTANCE, var0.systemContent);
      }
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

   public object `$serializer` : f0<LoadedReferencedMessage> {
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
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: Any;
         if (var7.p()) {
            var8 = var7.y(var6, 0, Message.$serializer.INSTANCE, null);
            var5 = var7.n(var6, 1, StructurableTextSerializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.n(var6, 1, StructurableTextSerializer.INSTANCE, var5);
                     var2 |= 2;
                  } else {
                     var8 = var7.y(var6, 0, Message.$serializer.INSTANCE, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new LoadedReferencedMessage(var2, var8 as Message, var5 as StructurableText, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadedReferencedMessage) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LoadedReferencedMessage.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadedReferencedMessage> {
         return LoadedReferencedMessage.$serializer.INSTANCE;
      }
   }
}
