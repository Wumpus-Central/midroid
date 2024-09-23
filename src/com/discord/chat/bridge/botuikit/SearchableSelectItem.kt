package com.discord.chat.bridge.botuikit

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var4: Int = this.value.hashCode();
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
      val var5: java.lang.String = this.label;
      val var6: java.lang.String = this.value;
      val var2: SelectOptionType = this.type;
      val var1: java.lang.String = this.iconSrc;
      val var3: Int = this.iconColor;
      val var7: ComponentEmoji = this.iconEmoji;
      val var4: StringBuilder = new StringBuilder();
      var4.append("SearchableSelectItem(label=");
      var4.append(var5);
      var4.append(", value=");
      var4.append(var6);
      var4.append(", type=");
      var4.append(var2);
      var4.append(", iconSrc=");
      var4.append(var1);
      var4.append(", iconColor=");
      var4.append(var3);
      var4.append(", iconEmoji=");
      var4.append(var7);
      var4.append(")");
      return var4.toString();
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
         var1.l("label", false);
         var1.l("value", false);
         var1.l("type", false);
         var1.l("iconSrc", true);
         var1.l("iconColor", true);
         var1.l("iconEmoji", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, SelectOptionType.Serializer.INSTANCE, a.u(b2.a), a.u(n0.a), a.u(ComponentEmoji.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): SearchableSelectItem {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var5: Boolean = var12.y();
         var var10: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var8: SelectOptionType;
         var var9: java.lang.String;
         var var13: Any;
         if (var5) {
            var10 = var12.t(var11, 0);
            var9 = var12.t(var11, 1);
            var8 = var12.m(var11, 2, SelectOptionType.Serializer.INSTANCE, null) as SelectOptionType;
            var7 = var12.v(var11, 3, b2.a, null) as java.lang.String;
            var6 = var12.v(var11, 4, n0.a, null) as Int;
            var13 = var12.v(var11, 5, ComponentEmoji.$serializer.INSTANCE, null) as ComponentEmoji;
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var12.t(var11, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var12.t(var11, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var12.m(var11, 2, SelectOptionType.Serializer.INSTANCE, var8) as SelectOptionType;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var12.v(var11, 3, b2.a, var7) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var12.v(var11, 4, n0.a, var6) as Int;
                     var2 |= 16;
                     break;
                  case 5:
                     var13 = var12.v(var11, 5, ComponentEmoji.$serializer.INSTANCE, var13) as ComponentEmoji;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }
         }

         var12.b(var11);
         return new SearchableSelectItem(var2, var10, var9, var8, (java.lang.String)var7, (Integer)var6, (ComponentEmoji)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: SearchableSelectItem) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         SearchableSelectItem.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectItem> {
         return SearchableSelectItem.$serializer.INSTANCE;
      }
   }
}
