package com.discord.chat.bridge.botuikit

import bl.b2
import bl.g0
import bl.h
import bl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

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
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var4, "customId");
      q.h(var10, "selectedOptions");
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

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component10(): List<SearchableSelectItem> {
      return this.selectedOptions;
   }

   public operator fun component11(): List<Int>? {
      return this.channelTypes;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): ActionComponentState {
      return this.state;
   }

   public operator fun component4(): String {
      return this.customId;
   }

   public operator fun component5(): String? {
      return this.placeholder;
   }

   public operator fun component6(): String? {
      return this.accessibilityLabel;
   }

   public operator fun component7(): Int {
      return this.minValues;
   }

   public operator fun component8(): Int {
      return this.maxValues;
   }

   public operator fun component9(): Boolean {
      return this.disabled;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      state: ActionComponentState = var0.state,
      customId: String = var0.customId,
      placeholder: String? = var0.placeholder,
      accessibilityLabel: String? = var0.accessibilityLabel,
      minValues: Int = var0.minValues,
      maxValues: Int = var0.maxValues,
      disabled: Boolean = var0.disabled,
      selectedOptions: List<SearchableSelectItem> = var0.selectedOptions,
      channelTypes: List<Int>? = var0.channelTypes
   ): ChannelSelectComponent {
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var4, "customId");
      q.h(var10, "selectedOptions");
      return new ChannelSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelSelectComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.state != var1.state) {
            return false;
         } else if (!q.c(this.customId, var1.customId)) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!q.c(this.accessibilityLabel, var1.accessibilityLabel)) {
            return false;
         } else if (this.minValues != var1.minValues) {
            return false;
         } else if (this.maxValues != var1.maxValues) {
            return false;
         } else if (this.disabled != var1.disabled) {
            return false;
         } else if (!q.c(this.selectedOptions, var1.selectedOptions)) {
            return false;
         } else {
            return q.c(this.channelTypes, var1.channelTypes);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.type);
      val var4: Int = this.id.hashCode();
      val var7: Int = this.state.hashCode();
      val var6: Int = this.customId.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.placeholder == null) {
         var1 = 0;
      } else {
         var1 = this.placeholder.hashCode();
      }

      val var2: Int;
      if (this.accessibilityLabel == null) {
         var2 = 0;
      } else {
         var2 = this.accessibilityLabel.hashCode();
      }

      val var10: Int = Integer.hashCode(this.minValues);
      val var8: Int = Integer.hashCode(this.maxValues);
      val var11: Int = java.lang.Boolean.hashCode(this.disabled);
      val var9: Int = this.selectedOptions.hashCode();
      if (this.channelTypes != null) {
         var3 = this.channelTypes.hashCode();
      }

      return (((((((((var5 * 31 + var4) * 31 + var7) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var8) * 31 + var11) * 31 + var9) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: Int = this.type;
      val var11: java.lang.String = this.id;
      val var10: ActionComponentState = this.state;
      val var6: java.lang.String = this.customId;
      val var5: java.lang.String = this.placeholder;
      val var7: java.lang.String = this.accessibilityLabel;
      val var1: Int = this.minValues;
      val var2: Int = this.maxValues;
      val var4: Boolean = this.disabled;
      val var9: java.util.List = this.selectedOptions;
      val var8: java.util.List = this.channelTypes;
      val var12: StringBuilder = new StringBuilder();
      var12.append("ChannelSelectComponent(type=");
      var12.append(var3);
      var12.append(", id=");
      var12.append(var11);
      var12.append(", state=");
      var12.append(var10);
      var12.append(", customId=");
      var12.append(var6);
      var12.append(", placeholder=");
      var12.append(var5);
      var12.append(", accessibilityLabel=");
      var12.append(var7);
      var12.append(", minValues=");
      var12.append(var1);
      var12.append(", maxValues=");
      var12.append(var2);
      var12.append(", disabled=");
      var12.append(var4);
      var12.append(", selectedOptions=");
      var12.append(var9);
      var12.append(", channelTypes=");
      var12.append(var8);
      var12.append(")");
      return var12.toString();
   }

   public object `$serializer` : g0 {
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
         val var1: Array<KSerializer> = ChannelSelectComponent.access$get$childSerializers$cp();
         val var3: n0 = n0.a;
         val var2: b2 = b2.a;
         return new KSerializer[]{n0.a, b2.a, ActionComponentState.Serializer.INSTANCE, b2.a, a.u(b2.a), a.u(var2), var3, var3, h.a, var1[9], a.u(var1[10])};
      }

      public open fun deserialize(decoder: Decoder): ChannelSelectComponent {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.c(var20);
         var var17: Array<KSerializer> = ChannelSelectComponent.access$get$childSerializers$cp();
         val var10: Boolean = var21.y();
         var var8: Byte = 7;
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var15: Any;
         val var16: java.lang.String;
         val var18: java.util.List;
         val var23: java.lang.String;
         if (var10) {
            var3 = var21.k(var20, 0);
            var13 = var21.t(var20, 1);
            var15 = var21.m(var20, 2, ActionComponentState.Serializer.INSTANCE, null) as ActionComponentState;
            val var12: java.lang.String = var21.t(var20, 3);
            val var22: b2 = b2.a;
            var14 = var21.v(var20, 4, b2.a, null) as java.lang.String;
            var23 = var21.v(var20, 5, var22, null) as java.lang.String;
            var4 = var21.k(var20, 6);
            var2 = var21.k(var20, 7);
            var6 = var21.s(var20, 8);
            val var11: java.util.List = var21.m(var20, 9, var17[9], null) as java.util.List;
            var18 = var21.v(var20, 10, var17[10], null) as java.util.List;
            var7 = 2047;
            var16 = var12;
            var5 = var2;
            var17 = var11;
         } else {
            var var29: Boolean = true;
            var3 = 0;
            var5 = 0;
            var4 = 0;
            var var37: java.util.List = null;
            var14 = null;
            var15 = null;
            var13 = null;
            var var33: Any = null;
            var var32: java.lang.String = null;
            var var24: java.lang.String = null;
            var6 = 0;

            while (var29) {
               val var9: Int = var21.x(var20);
               switch (var9) {
                  case -1:
                     var29 = false;
                     break;
                  case 0:
                     var3 = var21.k(var20, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var32 = var21.t(var20, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var33 = var21.m(var20, 2, ActionComponentState.Serializer.INSTANCE, var33) as ActionComponentState;
                     var2 |= 4;
                     break;
                  case 3:
                     var24 = var21.t(var20, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var13 = var21.v(var20, 4, b2.a, var13) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var21.v(var20, 5, b2.a, var14) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var5 = var21.k(var20, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var6 = var21.k(var20, var8);
                     var2 |= 128;
                     continue;
                  case 8:
                     var4 = var21.s(var20, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var15 = var21.m(var20, 9, var17[9], var15) as java.util.List;
                     var2 |= 512;
                     continue;
                  case 10:
                     var37 = var21.v(var20, 10, var17[10], var37) as java.util.List;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var9);
               }

               var8 = 7;
            }

            var18 = var37;
            var17 = (KSerializer[])var15;
            var6 = var4;
            var5 = var6;
            var4 = var5;
            var23 = var14;
            var14 = var13;
            var16 = var24;
            var15 = var33;
            var13 = var32;
            var7 = var2;
         }

         var21.b(var20);
         return new ChannelSelectComponent(var7, var3, var13, (ActionComponentState)var15, var16, var14, var23, var4, var5, (boolean)var6, var17, var18, null);
      }

      public open fun serialize(encoder: Encoder, value: ChannelSelectComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChannelSelectComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelSelectComponent> {
         return ChannelSelectComponent.$serializer.INSTANCE;
      }
   }
}
