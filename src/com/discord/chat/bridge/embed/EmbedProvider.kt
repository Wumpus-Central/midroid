package com.discord.chat.bridge.embed

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.g0.a

@f
public data class EmbedProvider(name: String) {
   public final val name: String

   init {
      q.h(var1, "name");
      super();
      this.name = var1;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public fun copy(name: String = var0.name): EmbedProvider {
      q.h(var1, "name");
      return new EmbedProvider(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedProvider) {
         return false;
      } else {
         return q.c(this.name, (var1 as EmbedProvider).name);
      }
   }

   public override fun hashCode(): Int {
      return this.name.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.name;
      val var1: StringBuilder = new StringBuilder();
      var1.append("EmbedProvider(name=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedProvider.$serializer = new EmbedProvider.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedProvider", var0, 1);
         var1.c("name", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): EmbedProvider {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.m(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new EmbedProvider(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: EmbedProvider) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbedProvider.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedProvider> {
         return EmbedProvider.$serializer.INSTANCE;
      }
   }
}
