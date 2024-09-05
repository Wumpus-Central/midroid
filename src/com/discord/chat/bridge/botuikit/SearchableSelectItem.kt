package com.discord.chat.bridge.botuikit

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
import on.a
import qn.b2
import qn.g0
import qn.n0

@f
public data class SearchableSelectItem(label: String,
      value: String,
      type: SelectOptionType,
      iconSrc: String? = null,
      iconColor: Int? = null,
      iconEmoji: ComponentEmoji? = null
   )
   : SelectItem {
   public final val iconColor: Int?
   public final val iconEmoji: ComponentEmoji?
   public final val iconSrc: String?
   public open val label: String
   public final val type: SelectOptionType
   public open val value: String

   init {
      q.h(var1, "label");
      q.h(var2, "value");
      q.h(var3, "type");
      super(null);
      this.label = var1;
      this.value = var2;
      this.type = var3;
      this.iconSrc = var4;
      this.iconColor = var5;
      this.iconEmoji = var6;
   }

   public operator fun component1(): String {
      return this.label;
   }

   public operator fun component2(): String {
      return this.value;
   }

   public operator fun component3(): SelectOptionType {
      return this.type;
   }

   public operator fun component4(): String? {
      return this.iconSrc;
   }

   public operator fun component5(): Int? {
      return this.iconColor;
   }

   public operator fun component6(): ComponentEmoji? {
      return this.iconEmoji;
   }

   public fun copy(
      label: String = var0.label,
      value: String = var0.value,
      type: SelectOptionType = var0.type,
      iconSrc: String? = var0.iconSrc,
      iconColor: Int? = var0.iconColor,
      iconEmoji: ComponentEmoji? = var0.iconEmoji
   ): SearchableSelectItem {
      q.h(var1, "label");
      q.h(var2, "value");
      q.h(var3, "type");
      return new SearchableSelectItem(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SearchableSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.label, var1.label)) {
            return false;
         } else if (!q.c(this.value, var1.value)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.iconSrc, var1.iconSrc)) {
            return false;
         } else if (!q.c(this.iconColor, var1.iconColor)) {
            return false;
         } else {
            return q.c(this.iconEmoji, var1.iconEmoji);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.label.hashCode();
      val var5: Int = this.value.hashCode();
      val var4: Int = this.type.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.iconSrc == null) {
         var1 = 0;
      } else {
         var1 = this.iconSrc.hashCode();
      }

      val var2: Int;
      if (this.iconColor == null) {
         var2 = 0;
      } else {
         var2 = this.iconColor.hashCode();
      }

      if (this.iconEmoji != null) {
         var3 = this.iconEmoji.hashCode();
      }

      return ((((var6 * 31 + var5) * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.label;
      val var5: java.lang.String = this.value;
      val var6: SelectOptionType = this.type;
      val var4: java.lang.String = this.iconSrc;
      val var3: Int = this.iconColor;
      val var1: ComponentEmoji = this.iconEmoji;
      val var7: StringBuilder = new StringBuilder();
      var7.append("SearchableSelectItem(label=");
      var7.append(var2);
      var7.append(", value=");
      var7.append(var5);
      var7.append(", type=");
      var7.append(var6);
      var7.append(", iconSrc=");
      var7.append(var4);
      var7.append(", iconColor=");
      var7.append(var3);
      var7.append(", iconEmoji=");
      var7.append(var1);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SearchableSelectItem.$serializer = new SearchableSelectItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.SearchableSelectItem", var0, 6);
         var1.c("label", false);
         var1.c("value", false);
         var1.c("type", false);
         var1.c("iconSrc", true);
         var1.c("iconColor", true);
         var1.c("iconEmoji", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, SelectOptionType.Serializer.INSTANCE, a.u(b2.a), a.u(n0.a), a.u(ComponentEmoji.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): SearchableSelectItem {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var10: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         val var8: java.lang.String;
         var var9: java.lang.String;
         val var11: SelectOptionType;
         var var14: Any;
         if (var5) {
            var8 = var13.m(var12, 0);
            var9 = var13.m(var12, 1);
            var11 = var13.y(var12, 2, SelectOptionType.Serializer.INSTANCE, null) as SelectOptionType;
            var7 = var13.n(var12, 3, b2.a, null) as java.lang.String;
            var6 = var13.n(var12, 4, n0.a, null) as Int;
            var14 = var13.n(var12, 5, ComponentEmoji.$serializer.INSTANCE, null) as ComponentEmoji;
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var var15: SelectOptionType = null;
            var7 = null;
            var6 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.m(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.m(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var15 = var13.y(var12, 2, SelectOptionType.Serializer.INSTANCE, var15) as SelectOptionType;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var13.n(var12, 3, b2.a, var7) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.n(var12, 4, n0.a, var6) as Int;
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var13.n(var12, 5, ComponentEmoji.$serializer.INSTANCE, var14) as ComponentEmoji;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var11 = var15;
            var8 = var10;
         }

         var13.c(var12);
         return new SearchableSelectItem(var2, var8, var9, var11, (java.lang.String)var7, (Integer)var6, (ComponentEmoji)var14, null);
      }

      public open fun serialize(encoder: Encoder, value: SearchableSelectItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SearchableSelectItem.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectItem> {
         return SearchableSelectItem.$serializer.INSTANCE;
      }
   }
}
