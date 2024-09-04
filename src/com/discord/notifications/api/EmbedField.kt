package com.discord.notifications.api

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
import xk.a2
import xk.f0

@f
public data class EmbedField(name: String? = null, value: String? = null) {
   public final val name: String?
   public final val value: String?

   fun EmbedField() {
      this(null, null, 3, null);
   }

   init {
      super();
      this.name = var1;
      this.value = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: EmbedField, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.name == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.name);
      }

      label24: {
         if (!var1.A(var2, 1)) {
            var3 = false;
            if (var0.value == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.value);
      }
   }

   public operator fun component1(): String? {
      return this.name;
   }

   public operator fun component2(): String? {
      return this.value;
   }

   public fun copy(name: String? = var0.name, value: String? = var0.value): EmbedField {
      return new EmbedField(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedField) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.name, var1.name)) {
            return false;
         } else {
            return r.c(this.value, var1.value);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.name == null) {
         var1 = 0;
      } else {
         var1 = this.name.hashCode();
      }

      if (this.value != null) {
         var2 = this.value.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.name;
      val var1: java.lang.String = this.value;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EmbedField(name=");
      var3.append(var2);
      var3.append(", value=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<EmbedField> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbedField.$serializer = new EmbedField.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.EmbedField", var0, 2);
         var1.l("name", true);
         var1.l("value", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): EmbedField {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var9: Any;
         if (var7.p()) {
            var9 = a2.a;
            var5 = var7.n(var6, 0, a2.a, null);
            var9 = var7.n(var6, 1, (DeserializationStrategy)var9, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var7.n(var6, 1, a2.a, var9);
                     var2 |= 2;
                  } else {
                     var5 = var7.n(var6, 0, a2.a, var5);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new EmbedField(var2, var5 as java.lang.String, var9 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: EmbedField) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EmbedField.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedField> {
         return EmbedField.$serializer.INSTANCE;
      }
   }
}
