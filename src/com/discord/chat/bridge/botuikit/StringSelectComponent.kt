package com.discord.chat.bridge.botuikit

import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.h
import gn.n0
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class StringSelectComponent(type: Int,
      id: String,
      state: ActionComponentState,
      customId: String,
      placeholder: String? = null,
      accessibilityLabel: String? = null,
      minValues: Int,
      maxValues: Int,
      disabled: Boolean = false,
      options: List<StringSelectItem>,
      selectedOptions: List<Int>
   )
   : SelectComponent {
   public open val accessibilityLabel: String?
   public open val customId: String
   public open val disabled: Boolean
   public open val id: String
   public open val maxValues: Int
   public open val minValues: Int
   public final val options: List<StringSelectItem>
   public open val placeholder: String?
   public final val selectedOptions: List<Int>
   public open val state: ActionComponentState
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var4, "customId");
      q.h(var10, "options");
      q.h(var11, "selectedOptions");
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
      this.options = var10;
      this.selectedOptions = var11;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component10(): List<StringSelectItem> {
      return this.options;
   }

   public operator fun component11(): List<Int> {
      return this.selectedOptions;
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
      options: List<StringSelectItem> = var0.options,
      selectedOptions: List<Int> = var0.selectedOptions
   ): StringSelectComponent {
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var4, "customId");
      q.h(var10, "options");
      q.h(var11, "selectedOptions");
      return new StringSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StringSelectComponent) {
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
         } else if (!q.c(this.options, var1.options)) {
            return false;
         } else {
            return q.c(this.selectedOptions, var1.selectedOptions);
         }
      }
   }

   public override fun getSelectedItems(): List<SelectItem> {
      val var3: java.lang.Iterable = this.selectedOptions;
      val var2: ArrayList = new ArrayList(i.u(this.selectedOptions, 10));
      val var4: java.util.Iterator = var3.iterator();

      while (var4.hasNext()) {
         var2.add(this.options.get((var4.next() as java.lang.Number).intValue()));
      }

      return var2;
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.type);
      val var4: Int = this.id.hashCode();
      val var6: Int = this.state.hashCode();
      val var5: Int = this.customId.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.placeholder == null) {
         var1 = 0;
      } else {
         var1 = this.placeholder.hashCode();
      }

      if (this.accessibilityLabel != null) {
         var2 = this.accessibilityLabel.hashCode();
      }

      return (
               (
                        (
                                 ((((((var3 * 31 + var4) * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.minValues)) * 31
                                    + Integer.hashCode(this.maxValues)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.disabled)
                     )
                     * 31
                  + this.options.hashCode()
            )
            * 31
         + this.selectedOptions.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var8: java.lang.String = this.id;
      val var11: ActionComponentState = this.state;
      val var9: java.lang.String = this.customId;
      val var5: java.lang.String = this.placeholder;
      val var7: java.lang.String = this.accessibilityLabel;
      val var2: Int = this.minValues;
      val var3: Int = this.maxValues;
      val var4: Boolean = this.disabled;
      val var10: java.util.List = this.options;
      val var6: java.util.List = this.selectedOptions;
      val var12: StringBuilder = new StringBuilder();
      var12.append("StringSelectComponent(type=");
      var12.append(var1);
      var12.append(", id=");
      var12.append(var8);
      var12.append(", state=");
      var12.append(var11);
      var12.append(", customId=");
      var12.append(var9);
      var12.append(", placeholder=");
      var12.append(var5);
      var12.append(", accessibilityLabel=");
      var12.append(var7);
      var12.append(", minValues=");
      var12.append(var2);
      var12.append(", maxValues=");
      var12.append(var3);
      var12.append(", disabled=");
      var12.append(var4);
      var12.append(", options=");
      var12.append(var10);
      var12.append(", selectedOptions=");
      var12.append(var6);
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
         val var0: StringSelectComponent.$serializer = new StringSelectComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("3", var0, 11);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("state", false);
         var1.l("customId", false);
         var1.l("placeholder", true);
         var1.l("accessibilityLabel", true);
         var1.l("minValues", false);
         var1.l("maxValues", false);
         var1.l("disabled", true);
         var1.l("options", false);
         var1.l("selectedOptions", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: Array<KSerializer> = StringSelectComponent.access$get$childSerializers$cp();
         val var1: n0 = n0.a;
         val var3: b2 = b2.a;
         return new KSerializer[]{n0.a, b2.a, ActionComponentState.Serializer.INSTANCE, b2.a, a.u(b2.a), a.u(var3), var1, var1, h.a, var2[9], var2[10]};
      }

      public open fun deserialize(decoder: Decoder): StringSelectComponent {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.b(var20);
         var var17: Array<KSerializer> = StringSelectComponent.access$get$childSerializers$cp();
         val var10: Boolean = var21.p();
         var var8: Byte = 7;
         var var2: Int = 0;
         var var3: Int;
         var var5: Int;
         val var6: Int;
         var var7: Int;
         var var12: Any;
         var var14: java.lang.String;
         var var15: java.lang.String;
         var var16: java.util.List;
         val var18: java.lang.String;
         val var23: java.lang.String;
         var var27: Int;
         if (var10) {
            var27 = var21.i(var20, 0);
            var15 = var21.m(var20, 1);
            var12 = var21.y(var20, 2, ActionComponentState.Serializer.INSTANCE, null) as ActionComponentState;
            var14 = var21.m(var20, 3);
            val var22: b2 = b2.a;
            val var11: java.lang.String = var21.n(var20, 4, b2.a, null) as java.lang.String;
            var23 = var21.n(var20, 5, var22, null) as java.lang.String;
            var7 = var21.i(var20, 6);
            var2 = var21.i(var20, 7);
            var5 = var21.C(var20, 8);
            val var13: java.util.List = var21.y(var20, 9, var17[9], null) as java.util.List;
            var16 = var21.y(var20, 10, var17[10], null) as java.util.List;
            var3 = 2047;
            var6 = var27;
            var18 = var11;
            var27 = var2;
            var17 = var13;
         } else {
            var var30: Boolean = true;
            var3 = 0;
            var5 = 0;
            var27 = 0;
            var16 = null;
            var14 = null;
            var15 = null;
            var var34: java.lang.String = null;
            var12 = null;
            var var33: java.lang.String = null;
            var var24: java.lang.String = null;
            var7 = 0;

            while (var30) {
               val var9: Int = var21.o(var20);
               switch (var9) {
                  case -1:
                     var30 = false;
                     break;
                  case 0:
                     var3 = var21.i(var20, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var33 = var21.m(var20, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var12 = var21.y(var20, 2, ActionComponentState.Serializer.INSTANCE, var12) as ActionComponentState;
                     var2 |= 4;
                     break;
                  case 3:
                     var24 = var21.m(var20, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var34 = var21.n(var20, 4, b2.a, var34) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var21.n(var20, 5, b2.a, var14) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var5 = var21.i(var20, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var7 = var21.i(var20, var8);
                     var2 |= 128;
                     continue;
                  case 8:
                     var27 = var21.C(var20, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var15 = var21.y(var20, 9, var17[9], var15) as java.util.List;
                     var2 |= 512;
                     continue;
                  case 10:
                     var16 = var21.y(var20, 10, var17[10], var16) as java.util.List;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var9);
               }

               var8 = 7;
            }

            var17 = var15;
            var5 = var27;
            var27 = var7;
            var7 = var5;
            var23 = var14;
            var18 = var34;
            var14 = var24;
            var15 = var33;
            var6 = var3;
            var3 = var2;
         }

         var21.c(var20);
         return new StringSelectComponent(var3, var6, var15, (ActionComponentState)var12, var14, var18, var23, var7, var27, (boolean)var5, var17, var16, null);
      }

      public open fun serialize(encoder: Encoder, value: StringSelectComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         StringSelectComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StringSelectComponent> {
         return StringSelectComponent.$serializer.INSTANCE;
      }
   }
}
