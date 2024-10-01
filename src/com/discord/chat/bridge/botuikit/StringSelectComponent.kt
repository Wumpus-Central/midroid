package com.discord.chat.bridge.botuikit

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import il.n0
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
      val var3: java.util.List = this.selectedOptions;
      val var2: ArrayList = new ArrayList(i.v(this.selectedOptions, 10));
      val var4: java.util.Iterator = var3.iterator();

      while (var4.hasNext()) {
         var2.add(this.options.get((var4.next() as java.lang.Number).intValue()));
      }

      return var2;
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.type);
      val var3: Int = this.id.hashCode();
      val var5: Int = this.state.hashCode();
      val var4: Int = this.customId.hashCode();
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
                                 ((((((var6 * 31 + var3) * 31 + var5) * 31 + var4) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.minValues)) * 31
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
      val var2: Int = this.type;
      val var5: java.lang.String = this.id;
      val var10: ActionComponentState = this.state;
      val var11: java.lang.String = this.customId;
      val var8: java.lang.String = this.placeholder;
      val var6: java.lang.String = this.accessibilityLabel;
      val var1: Int = this.minValues;
      val var3: Int = this.maxValues;
      val var4: Boolean = this.disabled;
      val var7: java.util.List = this.options;
      val var9: java.util.List = this.selectedOptions;
      val var12: StringBuilder = new StringBuilder();
      var12.append("StringSelectComponent(type=");
      var12.append(var2);
      var12.append(", id=");
      var12.append(var5);
      var12.append(", state=");
      var12.append(var10);
      var12.append(", customId=");
      var12.append(var11);
      var12.append(", placeholder=");
      var12.append(var8);
      var12.append(", accessibilityLabel=");
      var12.append(var6);
      var12.append(", minValues=");
      var12.append(var1);
      var12.append(", maxValues=");
      var12.append(var3);
      var12.append(", disabled=");
      var12.append(var4);
      var12.append(", options=");
      var12.append(var7);
      var12.append(", selectedOptions=");
      var12.append(var9);
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
         val var3: Array<KSerializer> = StringSelectComponent.access$get$childSerializers$cp();
         val var2: n0 = n0.a;
         val var1: b2 = b2.a;
         return new KSerializer[]{n0.a, b2.a, ActionComponentState.Serializer.INSTANCE, b2.a, a.u(b2.a), a.u(var1), var2, var2, h.a, var3[9], var3[10]};
      }

      public open fun deserialize(decoder: Decoder): StringSelectComponent {
         q.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.c(var18);
         val var17: Array<KSerializer> = StringSelectComponent.access$get$childSerializers$cp();
         val var10: Boolean = var19.y();
         var var8: Byte = 7;
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var7: Int;
         var var11: java.lang.String;
         var var12: Any;
         var var14: java.lang.String;
         var var15: Any;
         val var21: java.lang.String;
         var var27: java.lang.String;
         var var29: java.util.List;
         if (var10) {
            var3 = var19.k(var18, 0);
            var11 = var19.t(var18, 1);
            var12 = var19.m(var18, 2, ActionComponentState.Serializer.INSTANCE, null) as ActionComponentState;
            var27 = var19.t(var18, 3);
            val var20: b2 = b2.a;
            val var16: java.lang.String = var19.v(var18, 4, b2.a, null) as java.lang.String;
            var21 = var19.v(var18, 5, var20, null) as java.lang.String;
            var5 = var19.k(var18, 6);
            var2 = var19.k(var18, 7);
            var6 = var19.s(var18, 8);
            var15 = var19.m(var18, 9, var17[9], null) as java.util.List;
            val var30: java.util.List = var19.m(var18, 10, var17[10], null) as java.util.List;
            var7 = 2047;
            var14 = var27;
            var27 = var16;
            var4 = var2;
            var29 = var30;
         } else {
            var var25: Boolean = true;
            var3 = 0;
            var5 = 0;
            var4 = 0;
            var29 = null;
            var14 = null;
            var15 = null;
            var27 = null;
            var12 = null;
            var11 = null;
            var var22: java.lang.String = null;
            var7 = 0;

            while (var25) {
               val var9: Int = var19.x(var18);
               switch (var9) {
                  case -1:
                     var25 = false;
                     break;
                  case 0:
                     var3 = var19.k(var18, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var11 = var19.t(var18, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var12 = var19.m(var18, 2, ActionComponentState.Serializer.INSTANCE, var12) as ActionComponentState;
                     var2 |= 4;
                     break;
                  case 3:
                     var22 = var19.t(var18, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var27 = var19.v(var18, 4, b2.a, var27) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var19.v(var18, 5, b2.a, var14) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var5 = var19.k(var18, 6);
                     var2 |= 64;
                     continue;
                  case 7:
                     var7 = var19.k(var18, var8);
                     var2 |= 128;
                     continue;
                  case 8:
                     var4 = var19.s(var18, 8);
                     var2 |= 256;
                     continue;
                  case 9:
                     var15 = var19.m(var18, 9, var17[9], var15) as java.util.List;
                     var2 |= 512;
                     continue;
                  case 10:
                     var29 = var19.m(var18, 10, var17[10], var29) as java.util.List;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var9);
               }

               var8 = 7;
            }

            var6 = var4;
            var4 = var7;
            var21 = var14;
            var14 = var22;
            var7 = var2;
         }

         var19.b(var18);
         return new StringSelectComponent(
            var7, var3, var11, (ActionComponentState)var12, var14, var27, var21, var5, var4, (boolean)var6, (java.util.List)var15, var29, null
         );
      }

      public open fun serialize(encoder: Encoder, value: StringSelectComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         StringSelectComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StringSelectComponent> {
         return StringSelectComponent.$serializer.INSTANCE;
      }
   }
}
