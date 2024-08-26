package com.discord.chat.bridge.botuikit

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
import xk.h
import xk.m0

@f
public data class ChannelSelectComponent(type: Int,
      id: String,
      state: ActionComponentState,
      customId: String,
      placeholder: String? = null,
      accessibilityLabel: String? = null,
      minValues: Int,
      maxValues: Int,
      disabled: Boolean = false,
      selectedOptions: List<SearchableSelectItem>,
      channelTypes: List<Int>? = null
   )
   : SearchableSelectComponent {
   public open val accessibilityLabel: String?
   public final val channelTypes: List<Int>?
   public open val customId: String
   public open val disabled: Boolean
   public open val id: String
   public open val maxValues: Int
   public open val minValues: Int
   public open val placeholder: String?
   public open val selectedOptions: List<SearchableSelectItem>
   public open val state: ActionComponentState
   public open val type: Int

   init {
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var4, "customId");
      r.h(var10, "selectedOptions");
      super(null);
      this.type = var1;
      this.id = var2;
      this.state = var3;
      this.customId = var4;
      this.placeholder = var5;
      this.accessibilityLabel = var6;
      this.minValues = var7;
      this.maxValues = var8;
      this.disabled = var9;
      this.selectedOptions = var10;
      this.channelTypes = var11;
   }

   @JvmStatic
   public fun `write$Self`(self: ChannelSelectComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      SearchableSelectComponent.write$Self(var0, var1, var2);
      var1.w(var2, 0, var0.getType());
      var1.z(var2, 1, var0.getId());
      var1.y(var2, 2, ActionComponentState.Serializer.INSTANCE, var0.getState());
      var1.z(var2, 3, var0.getCustomId());
      var var5: Boolean;
      if (!var1.A(var2, 4) && var0.getPlaceholder() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 4, a2.a, var0.getPlaceholder());
      }

      if (!var1.A(var2, 5) && var0.getAccessibilityLabel() == null) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.m(var2, 5, a2.a, var0.getAccessibilityLabel());
      }

      var1.w(var2, 6, var0.getMinValues());
      var1.w(var2, 7, var0.getMaxValues());
      if (!var1.A(var2, 8) && !var0.getDisabled()) {
         var5 = false;
      } else {
         var5 = true;
      }

      if (var5) {
         var1.x(var2, 8, var0.getDisabled());
      }

      label40: {
         var1.y(var2, 9, new xk.f(SearchableSelectItem.$serializer.INSTANCE), var0.getSelectedOptions());
         if (!var1.A(var2, 10)) {
            var5 = false;
            if (var0.channelTypes == null) {
               break label40;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.m(var2, 10, new xk.f(m0.a), var0.channelTypes);
      }
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component10(): List<SearchableSelectItem> {
      return this.getSelectedOptions();
   }

   public operator fun component11(): List<Int>? {
      return this.channelTypes;
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): ActionComponentState {
      return this.getState();
   }

   public operator fun component4(): String {
      return this.getCustomId();
   }

   public operator fun component5(): String? {
      return this.getPlaceholder();
   }

   public operator fun component6(): String? {
      return this.getAccessibilityLabel();
   }

   public operator fun component7(): Int {
      return this.getMinValues();
   }

   public operator fun component8(): Int {
      return this.getMaxValues();
   }

   public operator fun component9(): Boolean {
      return this.getDisabled();
   }

   public fun copy(
      type: Int = var0.getType(),
      id: String = var0.getId(),
      state: ActionComponentState = var0.getState(),
      customId: String = var0.getCustomId(),
      placeholder: String? = var0.getPlaceholder(),
      accessibilityLabel: String? = var0.getAccessibilityLabel(),
      minValues: Int = var0.getMinValues(),
      maxValues: Int = var0.getMaxValues(),
      disabled: Boolean = var0.getDisabled(),
      selectedOptions: List<SearchableSelectItem> = var0.getSelectedOptions(),
      channelTypes: List<Int>? = var0.channelTypes
   ): ChannelSelectComponent {
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var4, "customId");
      r.h(var10, "selectedOptions");
      return new ChannelSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelSelectComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (this.getState() != var1.getState()) {
            return false;
         } else if (!r.c(this.getCustomId(), var1.getCustomId())) {
            return false;
         } else if (!r.c(this.getPlaceholder(), var1.getPlaceholder())) {
            return false;
         } else if (!r.c(this.getAccessibilityLabel(), var1.getAccessibilityLabel())) {
            return false;
         } else if (this.getMinValues() != var1.getMinValues()) {
            return false;
         } else if (this.getMaxValues() != var1.getMaxValues()) {
            return false;
         } else if (this.getDisabled() != var1.getDisabled()) {
            return false;
         } else if (!r.c(this.getSelectedOptions(), var1.getSelectedOptions())) {
            return false;
         } else {
            return r.c(this.channelTypes, var1.channelTypes);
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = Integer.hashCode(this.getType());
      val var6: Int = this.getId().hashCode();
      val var7: Int = this.getState().hashCode();
      val var9: Int = this.getCustomId().hashCode();
      val var12: java.lang.String = this.getPlaceholder();
      var var4: Int = 0;
      val var1: Int;
      if (var12 == null) {
         var1 = 0;
      } else {
         var1 = this.getPlaceholder().hashCode();
      }

      val var2: Int;
      if (this.getAccessibilityLabel() == null) {
         var2 = 0;
      } else {
         var2 = this.getAccessibilityLabel().hashCode();
      }

      val var10: Int = Integer.hashCode(this.getMinValues());
      val var11: Int = Integer.hashCode(this.getMaxValues());
      var var5: Int = this.getDisabled();
      var var3: Byte = (byte)var5;
      if (var5 != 0) {
         var3 = 1;
      }

      var5 = this.getSelectedOptions().hashCode();
      if (this.channelTypes != null) {
         var4 = this.channelTypes.hashCode();
      }

      return (((((((((var8 * 31 + var6) * 31 + var7) * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var11) * 31 + var3) * 31 + var5) * 31 + var4;
   }

   public override fun toString(): String {
      val var3: Int = this.getType();
      val var11: java.lang.String = this.getId();
      val var10: ActionComponentState = this.getState();
      val var8: java.lang.String = this.getCustomId();
      val var5: java.lang.String = this.getPlaceholder();
      val var12: java.lang.String = this.getAccessibilityLabel();
      val var2: Int = this.getMinValues();
      val var1: Int = this.getMaxValues();
      val var4: Boolean = this.getDisabled();
      val var7: java.util.List = this.getSelectedOptions();
      val var6: java.util.List = this.channelTypes;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ChannelSelectComponent(type=");
      var9.append(var3);
      var9.append(", id=");
      var9.append(var11);
      var9.append(", state=");
      var9.append(var10);
      var9.append(", customId=");
      var9.append(var8);
      var9.append(", placeholder=");
      var9.append(var5);
      var9.append(", accessibilityLabel=");
      var9.append(var12);
      var9.append(", minValues=");
      var9.append(var2);
      var9.append(", maxValues=");
      var9.append(var1);
      var9.append(", disabled=");
      var9.append(var4);
      var9.append(", selectedOptions=");
      var9.append(var7);
      var9.append(", channelTypes=");
      var9.append(var6);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : f0<ChannelSelectComponent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChannelSelectComponent.$serializer = new ChannelSelectComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("8", var0, 11);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("state", false);
         var1.l("customId", false);
         var1.l("placeholder", true);
         var1.l("accessibilityLabel", true);
         var1.l("minValues", false);
         var1.l("maxValues", false);
         var1.l("disabled", true);
         var1.l("selectedOptions", false);
         var1.l("channelTypes", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: m0 = m0.a;
         val var2: a2 = a2.a;
         return new KSerializer[]{
            m0.a,
            a2.a,
            ActionComponentState.Serializer.INSTANCE,
            a2.a,
            a.u(a2.a),
            a.u(var2),
            var1,
            var1,
            h.a,
            new xk.f(SearchableSelectItem.$serializer.INSTANCE),
            a.u(new xk.f(var1))
         };
      }

      public open fun deserialize(decoder: Decoder): ChannelSelectComponent {
         r.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.b(var19);
         val var10: Boolean = var20.p();
         var var8: Byte = 7;
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         val var17: Any;
         val var18: Any;
         var var25: Any;
         if (var10) {
            var6 = var20.i(var19, 0);
            var17 = var20.m(var19, 1);
            var15 = var20.y(var19, 2, ActionComponentState.Serializer.INSTANCE, null);
            val var21: java.lang.String = var20.m(var19, 3);
            var25 = a2.a;
            var13 = var20.n(var19, 4, a2.a, null);
            var14 = var20.n(var19, 5, (DeserializationStrategy)var25, null);
            var4 = var20.i(var19, 6);
            var2 = var20.i(var19, 7);
            var3 = var20.C(var19, 8);
            var12 = var20.y(var19, 9, new xk.f(SearchableSelectItem.$serializer.INSTANCE), null);
            var25 = var20.n(var19, 10, new xk.f(m0.a), null);
            var7 = 2047;
            var5 = var2;
            var18 = var21;
         } else {
            var var24: Boolean = true;
            var6 = 0;
            var4 = 0;
            var3 = 0;
            var25 = null;
            var var16: Any = null;
            var var22: Any = null;
            var13 = null;
            var14 = null;
            var15 = null;
            var12 = null;
            var5 = 0;

            while (var24) {
               val var9: Int = var20.o(var19);
               switch (var9) {
                  case -1:
                     var24 = false;
                     continue;
                  case 0:
                     var6 = var20.i(var19, 0);
                     var2 |= 1;
                     continue;
                  case 1:
                     var15 = var20.m(var19, 1);
                     var2 |= 2;
                     continue;
                  case 2:
                     var14 = var20.y(var19, 2, ActionComponentState.Serializer.INSTANCE, var14);
                     var2 |= 4;
                     continue;
                  case 3:
                     var12 = var20.m(var19, 3);
                     var2 |= 8;
                     continue;
                  case 4:
                     var13 = var20.n(var19, 4, a2.a, var13);
                     var2 |= 16;
                     continue;
                  case 5:
                     var16 = var20.n(var19, 5, a2.a, var16);
                     var2 |= 32;
                     continue;
                  case 6:
                     var4 = var20.i(var19, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var5 = var20.i(var19, var8);
                     var2 |= 128;
                     continue;
                  case 8:
                     var3 = var20.C(var19, 8);
                     var2 |= 256;
                     break;
                  case 9:
                     var22 = var20.y(var19, 9, new xk.f(SearchableSelectItem.$serializer.INSTANCE), var22);
                     var2 |= 512;
                     break;
                  case 10:
                     var25 = var20.n(var19, 10, new xk.f(m0.a), var25);
                     var2 |= 1024;
                     break;
                  default:
                     throw new n(var9);
               }

               var8 = 7;
            }

            var17 = var15;
            var18 = var12;
            var15 = var14;
            var7 = var2;
            var14 = var16;
            var12 = var22;
         }

         var20.c(var19);
         return new ChannelSelectComponent(
            var7,
            var6,
            (java.lang.String)var17,
            var15 as ActionComponentState,
            (java.lang.String)var18,
            var13 as java.lang.String,
            var14 as java.lang.String,
            var4,
            var5,
            (boolean)var3,
            var12 as java.util.List,
            var25 as java.util.List,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: ChannelSelectComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChannelSelectComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelSelectComponent> {
         return ChannelSelectComponent.$serializer.INSTANCE;
      }
   }
}
