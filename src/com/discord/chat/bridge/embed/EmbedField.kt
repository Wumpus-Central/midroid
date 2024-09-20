package com.discord.chat.bridge.embed

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
public data class EmbedField(rawName: String? = null, rawValue: String? = null, name: StructurableText? = null, value: StructurableText? = null) {
   public final val name: StructurableText?
   public final val rawName: String?
   public final val rawValue: String?
   public final val value: StructurableText?

   fun EmbedField() {
      this(null, null, null, null, 15, null);
   }

   init {
      this.rawName = var1;
      this.rawValue = var2;
      this.name = var3;
      this.value = var4;
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
         if (!q.c(this.rawName, var1.rawName)) {
            return false;
         } else if (!q.c(this.rawValue, var1.rawValue)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else {
            return q.c(this.value, var1.value);
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
      val var1: StructurableText = this.value;
      val var5: StringBuilder = new StringBuilder();
      var5.append("EmbedField(rawName=");
      var5.append(var2);
      var5.append(", rawValue=");
      var5.append(var3);
      var5.append(", name=");
      var5.append(var4);
      var5.append(", value=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.embed.EmbedField", var0, 4);
         var1.l("rawName", true);
         var1.l("rawValue", true);
         var1.l("name", true);
         var1.l("value", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: b2 = b2.a;
         val var1: KSerializer = a.u(b2.a);
         val var3: KSerializer = a.u(var2);
         val var4: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
         return new KSerializer[]{var1, var3, a.u(StructurableTextSerializer.INSTANCE), a.u(var4)};
      }

      public open fun deserialize(decoder: Decoder): EmbedField {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var5: Boolean = var11.y();
         var var8: java.lang.String = null;
         var var2: Int;
         val var6: java.lang.String;
         val var9: StructurableText;
         var var14: StructurableText;
         if (var5) {
            val var12: b2 = b2.a;
            var8 = var11.v(var10, 0, b2.a, null) as java.lang.String;
            var6 = var11.v(var10, 1, var12, null) as java.lang.String;
            val var13: StructurableTextSerializer = StructurableTextSerializer.INSTANCE;
            val var7: StructurableText = var11.v(var10, 2, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var14 = var11.v(var10, 3, var13, null) as StructurableText;
            var2 = 15;
            var9 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var16: java.lang.String = null;
            var var15: StructurableText = null;
            var14 = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var14 = var11.v(var10, 3, StructurableTextSerializer.INSTANCE, var14) as StructurableText;
                           var2 |= 8;
                        } else {
                           var15 = var11.v(var10, 2, StructurableTextSerializer.INSTANCE, var15) as StructurableText;
                           var2 |= 4;
                        }
                     } else {
                        var16 = var11.v(var10, 1, b2.a, var16) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.v(var10, 0, b2.a, var8) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var15;
            var6 = var16;
         }

         var11.b(var10);
         return new EmbedField(var2, var8, var6, var9, var14, null);
      }

      public open fun serialize(encoder: Encoder, value: EmbedField) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EmbedField.write$Self$chat_release(var2, var4, var3);
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
