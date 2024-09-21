package com.discord.notifications.api

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class EmbedField(name: String? = null, value: String? = null) {
   public final val name: String?
   public final val value: String?

   fun EmbedField() {
      this(null, null, 3, null);
   }

   init {
      this.name = var1;
      this.value = var2;
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
         if (!q.c(this.name, var1.name)) {
            return false;
         } else {
            return q.c(this.value, var1.value);
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
      val var3: java.lang.String = this.name;
      val var1: java.lang.String = this.value;
      val var2: StringBuilder = new StringBuilder();
      var2.append("EmbedField(name=");
      var2.append(var3);
      var2.append(", value=");
      var2.append(var1);
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
         val var0: EmbedField.$serializer = new EmbedField.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.EmbedField", var0, 2);
         var1.l("name", true);
         var1.l("value", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): EmbedField {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var9: java.lang.String;
         if (var7.y()) {
            val var8: b2 = b2.a;
            var5 = var7.v(var6, 0, b2.a, null) as java.lang.String;
            var9 = var7.v(var6, 1, var8, null) as java.lang.String;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var7.v(var6, 1, b2.a, var9) as java.lang.String;
                     var2 |= 2;
                  } else {
                     var5 = var7.v(var6, 0, b2.a, var5) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new EmbedField(var2, var5, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: EmbedField) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EmbedField.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedField> {
         return EmbedField.$serializer.INSTANCE;
      }
   }
}
