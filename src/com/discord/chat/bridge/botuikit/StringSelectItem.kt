package com.discord.chat.bridge.botuikit

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      q.h(var1, "label");
      q.h(var2, "value");
      super(null);
      this.label = var1;
      this.value = var2;
      this.emoji = var3;
      this.description = var4;
      this.default = var5;
   }

   public operator fun component1(): String {
      return this.label;
   }

   public operator fun component2(): String {
      return this.value;
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
      label: String = var0.label,
      value: String = var0.value,
      emoji: ComponentEmoji? = var0.emoji,
      description: String? = var0.description,
      default: Boolean? = var0.default
   ): StringSelectItem {
      q.h(var1, "label");
      q.h(var2, "value");
      return new StringSelectItem(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StringSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.label, var1.label)) {
            return false;
         } else if (!q.c(this.value, var1.value)) {
            return false;
         } else if (!q.c(this.emoji, var1.emoji)) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else {
            return q.c(this.default, var1.default);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.label.hashCode();
      val var5: Int = this.value.hashCode();
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
      val var4: java.lang.String = this.label;
      val var1: java.lang.String = this.value;
      val var5: ComponentEmoji = this.emoji;
      val var6: java.lang.String = this.description;
      val var2: java.lang.Boolean = this.default;
      val var3: StringBuilder = new StringBuilder();
      var3.append("StringSelectItem(label=");
      var3.append(var4);
      var3.append(", value=");
      var3.append(var1);
      var3.append(", emoji=");
      var3.append(var5);
      var3.append(", description=");
      var3.append(var6);
      var3.append(", default=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
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
         val var1: b2 = b2.a;
         return new KSerializer[]{b2.a, b2.a, a.u(ComponentEmoji.$serializer.INSTANCE), a.u(var1), a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): StringSelectItem {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var5: Boolean = var12.y();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var8: java.lang.String;
         var var13: Any;
         var var14: ComponentEmoji;
         if (var5) {
            val var7: java.lang.String = var12.t(var11, 0);
            var8 = var12.t(var11, 1);
            val var10: ComponentEmoji = var12.v(var11, 2, ComponentEmoji.$serializer.INSTANCE, null) as ComponentEmoji;
            var6 = var12.v(var11, 3, b2.a, null) as java.lang.String;
            var13 = var12.v(var11, 4, h.a, null) as java.lang.Boolean;
            var2 = 31;
            var9 = var7;
            var14 = var10;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var14 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var12.v(var11, 4, h.a, var13) as java.lang.Boolean;
                              var2 |= 16;
                           } else {
                              var6 = var12.v(var11, 3, b2.a, var6) as java.lang.String;
                              var2 |= 8;
                           }
                        } else {
                           var14 = var12.v(var11, 2, ComponentEmoji.$serializer.INSTANCE, var14) as ComponentEmoji;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.t(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var12.b(var11);
         return new StringSelectItem(var2, var9, var8, var14, (java.lang.String)var6, (java.lang.Boolean)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: StringSelectItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         StringSelectItem.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StringSelectItem> {
         return StringSelectItem.$serializer.INSTANCE;
      }
   }
}
