package com.discord.notifications.api

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
public data class Embed(fields: List<EmbedField>? = null) {
   public final val fields: List<EmbedField>?

   fun Embed() {
      this(null, 1, null);
   }

   init {
      super();
      this.fields = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: Embed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Boolean = var1.A(var2, 0);
      var var3: Boolean = true;
      if (!var4 && var0.fields == null) {
         var3 = false;
      }

      if (var3) {
         var1.m(var2, 0, new xk.f(EmbedField.$serializer.INSTANCE), var0.fields);
      }
   }

   public operator fun component1(): List<EmbedField>? {
      return this.fields;
   }

   public fun copy(fields: List<EmbedField>? = var0.fields): Embed {
      return new Embed(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Embed) {
         return false;
      } else {
         return r.c(this.fields, (var1 as Embed).fields);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.fields == null) {
         var1 = 0;
      } else {
         var1 = this.fields.hashCode();
      }

      return var1;
   }

   public override fun toString(): String {
      val var2: java.util.List = this.fields;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Embed(fields=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<Embed> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Embed.$serializer = new Embed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.Embed", var0, 1);
         var1.l("fields", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(new xk.f(EmbedField.$serializer.INSTANCE))};
      }

      public open fun deserialize(decoder: Decoder): Embed {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.n(var6, 0, new xk.f(EmbedField.$serializer.INSTANCE), null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.n(var6, 0, new xk.f(EmbedField.$serializer.INSTANCE), var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new Embed(var2, var8 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: Embed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Embed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
