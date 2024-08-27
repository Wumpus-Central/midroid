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
      val var6: Int = this.getLabel().hashCode();
      val var4: Int = this.getValue().hashCode();
      val var5: Int = this.type.hashCode();
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

      return ((((var6 * 31 + var4) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.getLabel();
      val var4: java.lang.String = this.getValue();
      val var6: SelectOptionType = this.type;
      val var5: java.lang.String = this.iconSrc;
      val var1: Int = this.iconColor;
      val var2: ComponentEmoji = this.iconEmoji;
      val var7: StringBuilder = new StringBuilder();
      var7.append("SearchableSelectItem(label=");
      var7.append(var3);
      var7.append(", value=");
      var7.append(var4);
      var7.append(", type=");
      var7.append(var6);
      var7.append(", iconSrc=");
      var7.append(var5);
      var7.append(", iconColor=");
      var7.append(var1);
      var7.append(", iconEmoji=");
      var7.append(var2);
      var7.append(")");
      return var7.toString();
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
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: java.lang.String;
         var var9: Any;
         var var10: Any;
         var var13: Any;
         if (var5) {
            var8 = var12.m(var11, 0);
            var7 = var12.m(var11, 1);
            var10 = var12.y(var11, 2, SelectOptionType.Serializer.INSTANCE, null);
            var9 = var12.n(var11, 3, a2.a, null);
            var6 = var12.n(var11, 4, m0.a, null);
            var13 = var12.n(var11, 5, ComponentEmoji.$serializer.INSTANCE, null);
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var10 = null;
            var9 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var8 = var12.m(var11, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var7 = var12.m(var11, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var10 = var12.y(var11, 2, SelectOptionType.Serializer.INSTANCE, var10);
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var12.n(var11, 3, a2.a, var9);
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var12.n(var11, 4, m0.a, var6);
                     var2 |= 16;
                     break;
                  case 5:
                     var13 = var12.n(var11, 5, ComponentEmoji.$serializer.INSTANCE, var13);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }
         }

         var12.c(var11);
         return new SearchableSelectItem(var2, var8, var7, var10 as SelectOptionType, var9 as java.lang.String, var6 as Integer, var13 as ComponentEmoji, null);
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
