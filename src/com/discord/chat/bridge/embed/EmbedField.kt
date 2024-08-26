package com.discord.chat.bridge.embed

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
public data class EmbedField(rawName: String? = null, rawValue: String? = null, name: StructurableText? = null, value: StructurableText? = null) {
   public final val name: StructurableText?
   public final val rawName: String?
   public final val rawValue: String?
   public final val value: StructurableText?

   fun EmbedField() {
      this(null, null, null, null, 15, null);
   }

   init {
      super();
      this.rawName = var1;
      this.rawValue = var2;
      this.name = var3;
      this.value = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: EmbedField, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.rawName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.rawName);
      }

      if (!var1.A(var2, 1) && var0.rawValue == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.rawValue);
      }

      if (!var1.A(var2, 2) && var0.name == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, StructurableTextSerializer.INSTANCE, var0.name);
      }

      label40: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.value == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, StructurableTextSerializer.INSTANCE, var0.value);
      }
   }

   public operator fun component1(): String? {
      return this.rawName;
   }

   public operator fun component2(): String? {
      return this.rawValue;
   }

   public operator fun component3(): StructurableText? {
      return this.name;
   }

   public operator fun component4(): StructurableText? {
      return this.value;
   }

   public fun copy(
      rawName: String? = var0.rawName,
      rawValue: String? = var0.rawValue,
      name: StructurableText? = var0.name,
      value: StructurableText? = var0.value
   ): EmbedField {
      return new EmbedField(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedField) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.rawName, var1.rawName)) {
            return false;
         } else if (!r.c(this.rawValue, var1.rawValue)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else {
            return r.c(this.value, var1.value);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.rawName == null) {
         var1 = 0;
      } else {
         var1 = this.rawName.hashCode();
      }

      val var2: Int;
      if (this.rawValue == null) {
         var2 = 0;
      } else {
         var2 = this.rawValue.hashCode();
      }

      val var3: Int;
      if (this.name == null) {
         var3 = 0;
      } else {
         var3 = this.name.hashCode();
      }

      if (this.value != null) {
         var4 = this.value.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.rawName;
      val var3: java.lang.String = this.rawValue;
      val var4: StructurableText = this.name;
      val var5: StructurableText = this.value;
      val var1: StringBuilder = new StringBuilder();
      var1.append("EmbedField(rawName=");
      var1.append(var2);
      var1.append(", rawValue=");
      var1.append(var3);
      var1.append(", name=");
      var1.append(var4);
      var1.append(", value=");
      var1.append(var5);
      var1.append(")");
      return var1.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedField", var0, 4);
         var1.l("rawName", true);
         var1.l("rawValue", true);
         var1.l("name", true);
         var1.l("value", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: a2 = a2.a;
         val var1: KSerializer = a.u(a2.a);
         val var3: KSerializer = a.u(var2);
         val var4: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         return new KSerializer[]{var1, var3, a.u(StructurableTextSerializer.INSTANCE), a.u(var4)};
      }

      public open fun deserialize(decoder: Decoder): EmbedField {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: Any = null;
         var var2: Int;
         var var6: Any;
         var var8: Any;
         var var13: Any;
         if (var5) {
            var13 = a2.a;
            var7 = var10.n(var9, 0, a2.a, null);
            var8 = var10.n(var9, 1, (DeserializationStrategy)var13, null);
            var13 = StructurableTextSerializer.INSTANCE;
            var6 = var10.n(var9, 2, StructurableTextSerializer.INSTANCE, null);
            var13 = var10.n(var9, 3, (DeserializationStrategy)var13, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var10.n(var9, 3, StructurableTextSerializer.INSTANCE, var13);
                           var2 |= 8;
                        } else {
                           var6 = var10.n(var9, 2, StructurableTextSerializer.INSTANCE, var6);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var10.n(var9, 1, a2.a, var8);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.n(var9, 0, a2.a, var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new EmbedField(var2, var7 as java.lang.String, var8 as java.lang.String, var6 as StructurableText, var13 as StructurableText, null);
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
