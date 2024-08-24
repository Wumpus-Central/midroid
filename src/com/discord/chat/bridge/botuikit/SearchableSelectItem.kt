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
import xk.m0

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
      r.h(var1, "label");
      r.h(var2, "value");
      r.h(var3, "type");
      super(null);
      this.label = var1;
      this.value = var2;
      this.type = var3;
      this.iconSrc = var4;
      this.iconColor = var5;
      this.iconEmoji = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: SearchableSelectItem, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      SelectItem.write$Self(var0, var1, var2);
      var1.z(var2, 0, var0.getLabel());
      var1.z(var2, 1, var0.getValue());
      var1.y(var2, 2, SelectOptionType.Serializer.INSTANCE, var0.type);
      var var3: Boolean;
      if (!var1.A(var2, 3) && var0.iconSrc == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.iconSrc);
      }

      if (!var1.A(var2, 4) && var0.iconColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, m0.a, var0.iconColor);
      }

      label32: {
         if (!var1.A(var2, 5)) {
            var3 = false;
            if (var0.iconEmoji == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, ComponentEmoji.$serializer.INSTANCE, var0.iconEmoji);
      }
   }

   public operator fun component1(): String {
      return this.getLabel();
   }

   public operator fun component2(): String {
      return this.getValue();
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
      label: String = var0.getLabel(),
      value: String = var0.getValue(),
      type: SelectOptionType = var0.type,
      iconSrc: String? = var0.iconSrc,
      iconColor: Int? = var0.iconColor,
      iconEmoji: ComponentEmoji? = var0.iconEmoji
   ): SearchableSelectItem {
      r.h(var1, "label");
      r.h(var2, "value");
      r.h(var3, "type");
      return new SearchableSelectItem(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SearchableSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getLabel(), var1.getLabel())) {
            return false;
         } else if (!r.c(this.getValue(), var1.getValue())) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.iconSrc, var1.iconSrc)) {
            return false;
         } else if (!r.c(this.iconColor, var1.iconColor)) {
            return false;
         } else {
            return r.c(this.iconEmoji, var1.iconEmoji);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.getLabel().hashCode();
      val var5: Int = this.getValue().hashCode();
      val var6: Int = this.type.hashCode();
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

      return ((((var4 * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.getLabel();
      val var6: java.lang.String = this.getValue();
      val var2: SelectOptionType = this.type;
      val var4: java.lang.String = this.iconSrc;
      val var7: Int = this.iconColor;
      val var5: ComponentEmoji = this.iconEmoji;
      val var1: StringBuilder = new StringBuilder();
      var1.append("SearchableSelectItem(label=");
      var1.append(var3);
      var1.append(", value=");
      var1.append(var6);
      var1.append(", type=");
      var1.append(var2);
      var1.append(", iconSrc=");
      var1.append(var4);
      var1.append(", iconColor=");
      var1.append(var7);
      var1.append(", iconEmoji=");
      var1.append(var5);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<SearchableSelectItem> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SearchableSelectItem.$serializer = new SearchableSelectItem.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.SearchableSelectItem", var0, 6);
         var1.l("label", false);
         var1.l("value", false);
         var1.l("type", false);
         var1.l("iconSrc", true);
         var1.l("iconColor", true);
         var1.l("iconEmoji", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, SelectOptionType.Serializer.INSTANCE, a.u(a2.a), a.u(m0.a), a.u(ComponentEmoji.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): SearchableSelectItem {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var7: Any;
         var var9: Any;
         var var10: Any;
         val var11: Any;
         var var16: java.lang.String;
         if (var5) {
            var16 = var13.m(var12, 0);
            val var14: java.lang.String = var13.m(var12, 1);
            var10 = var13.y(var12, 2, SelectOptionType.Serializer.INSTANCE, null);
            var9 = var13.n(var12, 3, a2.a, null);
            var11 = var13.n(var12, 4, m0.a, null);
            var7 = var13.n(var12, 5, ComponentEmoji.$serializer.INSTANCE, null);
            var2 = 63;
            var8 = var16;
            var16 = var14;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var16 = null;
            var10 = null;
            var9 = null;
            var7 = null;
            var var15: Any = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var8 = var13.m(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var16 = var13.m(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var10 = var13.y(var12, 2, SelectOptionType.Serializer.INSTANCE, var10);
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var13.n(var12, 3, a2.a, var9);
                     var2 |= 8;
                     break;
                  case 4:
                     var7 = var13.n(var12, 4, m0.a, var7);
                     var2 |= 16;
                     break;
                  case 5:
                     var15 = var13.n(var12, 5, ComponentEmoji.$serializer.INSTANCE, var15);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var11 = var7;
            var7 = var15;
         }

         var13.c(var12);
         return new SearchableSelectItem(var2, var8, var16, var10 as SelectOptionType, var9 as java.lang.String, var11 as Integer, var7 as ComponentEmoji, null);
      }

      public open fun serialize(encoder: Encoder, value: SearchableSelectItem) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SearchableSelectItem.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectItem> {
         return SearchableSelectItem.$serializer.INSTANCE;
      }
   }
}
