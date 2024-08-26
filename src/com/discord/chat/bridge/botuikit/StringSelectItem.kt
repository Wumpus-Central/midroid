package com.discord.chat.bridge.botuikit

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
import xk.a2
import xk.f0
import xk.h

@f
public data class StringSelectItem(label: String,
      value: String,
      emoji: ComponentEmoji? = null,
      description: String? = null,
      default: Boolean? = java.lang.Boolean.FALSE
   )
   : SelectItem {
   public final val default: Boolean?
   public final val description: String?
   public final val emoji: ComponentEmoji?
   public open val label: String
   public open val value: String

   init {
      r.h(var1, "label");
      r.h(var2, "value");
      super(null);
      this.label = var1;
      this.value = var2;
      this.emoji = var3;
      this.description = var4;
      this.default = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: StringSelectItem, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      SelectItem.write$Self(var0, var1, var2);
      var1.z(var2, 0, var0.getLabel());
      var1.z(var2, 1, var0.getValue());
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.emoji == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, ComponentEmoji.$serializer.INSTANCE, var0.emoji);
      }

      if (!var1.A(var2, 3) && var0.description == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.description);
      }

      label32: {
         if (!var1.A(var2, 4)) {
            var3 = false;
            if (r.c(var0.default, java.lang.Boolean.FALSE)) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, h.a, var0.default);
      }
   }

   public operator fun component1(): String {
      return this.getLabel();
   }

   public operator fun component2(): String {
      return this.getValue();
   }

   public operator fun component3(): ComponentEmoji? {
      return this.emoji;
   }

   public operator fun component4(): String? {
      return this.description;
   }

   public operator fun component5(): Boolean? {
      return this.default;
   }

   public fun copy(
      label: String = var0.getLabel(),
      value: String = var0.getValue(),
      emoji: ComponentEmoji? = var0.emoji,
      description: String? = var0.description,
      default: Boolean? = var0.default
   ): StringSelectItem {
      r.h(var1, "label");
      r.h(var2, "value");
      return new StringSelectItem(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StringSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getLabel(), var1.getLabel())) {
            return false;
         } else if (!r.c(this.getValue(), var1.getValue())) {
            return false;
         } else if (!r.c(this.emoji, var1.emoji)) {
            return false;
         } else if (!r.c(this.description, var1.description)) {
            return false;
         } else {
            return r.c(this.default, var1.default);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.getLabel().hashCode();
      val var5: Int = this.getValue().hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.emoji == null) {
         var1 = 0;
      } else {
         var1 = this.emoji.hashCode();
      }

      val var2: Int;
      if (this.description == null) {
         var2 = 0;
      } else {
         var2 = this.description.hashCode();
      }

      if (this.default != null) {
         var3 = this.default.hashCode();
      }

      return (((var4 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.getLabel();
      val var4: java.lang.String = this.getValue();
      val var1: ComponentEmoji = this.emoji;
      val var6: java.lang.String = this.description;
      val var5: java.lang.Boolean = this.default;
      val var3: StringBuilder = new StringBuilder();
      var3.append("StringSelectItem(label=");
      var3.append(var2);
      var3.append(", value=");
      var3.append(var4);
      var3.append(", emoji=");
      var3.append(var1);
      var3.append(", description=");
      var3.append(var6);
      var3.append(", default=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<StringSelectItem> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: StringSelectItem.$serializer = new StringSelectItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.StringSelectItem", var0, 5);
         var1.l("label", false);
         var1.l("value", false);
         var1.l("emoji", true);
         var1.l("description", true);
         var1.l("default", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, a2.a, a.u(ComponentEmoji.$serializer.INSTANCE), a.u(var1), a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): StringSelectItem {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var8: java.lang.String;
         var var13: Any;
         if (var5) {
            var9 = var12.m(var11, 0);
            var8 = var12.m(var11, 1);
            var13 = var12.n(var11, 2, ComponentEmoji.$serializer.INSTANCE, null);
            var6 = var12.n(var11, 3, a2.a, null);
            var7 = var12.n(var11, 4, h.a, null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var12.n(var11, 4, h.a, var13);
                              var2 |= 16;
                           } else {
                              var6 = var12.n(var11, 3, a2.a, var6);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.n(var11, 2, ComponentEmoji.$serializer.INSTANCE, var7);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.m(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.m(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = var7;
            var7 = var13;
         }

         var12.c(var11);
         return new StringSelectItem(var2, var9, var8, var13 as ComponentEmoji, var6 as java.lang.String, var7 as java.lang.Boolean, null);
      }

      public open fun serialize(encoder: Encoder, value: StringSelectItem) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         StringSelectItem.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StringSelectItem> {
         return StringSelectItem.$serializer.INSTANCE;
      }
   }
}
