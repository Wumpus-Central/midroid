package com.discord.chat.bridge.botuikit

import java.util.ArrayList
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
import xk.m0

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
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var4, "customId");
      r.h(var10, "options");
      r.h(var11, "selectedOptions");
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

   @JvmStatic
   public fun `write$Self`(self: StringSelectComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      SelectComponent.write$Self(var0, var1, var2);
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

      label32: {
         var1.w(var2, 6, var0.getMinValues());
         var1.w(var2, 7, var0.getMaxValues());
         if (!var1.A(var2, 8)) {
            var5 = false;
            if (!var0.getDisabled()) {
               break label32;
            }
         }

         var5 = true;
      }

      if (var5) {
         var1.x(var2, 8, var0.getDisabled());
      }

      var1.y(var2, 9, new xk.f(StringSelectItem.$serializer.INSTANCE), var0.options);
      var1.y(var2, 10, new xk.f(m0.a), var0.selectedOptions);
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component10(): List<StringSelectItem> {
      return this.options;
   }

   public operator fun component11(): List<Int> {
      return this.selectedOptions;
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
      options: List<StringSelectItem> = var0.options,
      selectedOptions: List<Int> = var0.selectedOptions
   ): StringSelectComponent {
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var4, "customId");
      r.h(var10, "options");
      r.h(var11, "selectedOptions");
      return new StringSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StringSelectComponent) {
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
         } else if (!r.c(this.options, var1.options)) {
            return false;
         } else {
            return r.c(this.selectedOptions, var1.selectedOptions);
         }
      }
   }

   public override fun getSelectedItems(): List<SelectItem> {
      val var3: java.util.List = this.selectedOptions;
      val var2: ArrayList = new ArrayList(h.t(this.selectedOptions, 10));
      val var4: java.util.Iterator = var3.iterator();

      while (var4.hasNext()) {
         var2.add(this.options.get((var4.next() as java.lang.Number).intValue()));
      }

      return var2;
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.getType());
      val var5: Int = this.getId().hashCode();
      val var7: Int = this.getState().hashCode();
      val var8: Int = this.getCustomId().hashCode();
      val var11: java.lang.String = this.getPlaceholder();
      var var2: Int = 0;
      val var1: Int;
      if (var11 == null) {
         var1 = 0;
      } else {
         var1 = this.getPlaceholder().hashCode();
      }

      if (this.getAccessibilityLabel() != null) {
         var2 = this.getAccessibilityLabel().hashCode();
      }

      val var10: Int = Integer.hashCode(this.getMinValues());
      val var9: Int = Integer.hashCode(this.getMaxValues());
      val var4: Byte = this.getDisabled();
      var var3: Byte = var4;
      if (var4 != 0) {
         var3 = 1;
      }

      return (
               ((((((((var6 * 31 + var5) * 31 + var7) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var10) * 31 + var9) * 31 + var3) * 31
                  + this.options.hashCode()
            )
            * 31
         + this.selectedOptions.hashCode();
   }

   public override fun toString(): String {
      val var2: Int = this.getType();
      val var7: java.lang.String = this.getId();
      val var9: ActionComponentState = this.getState();
      val var11: java.lang.String = this.getCustomId();
      val var10: java.lang.String = this.getPlaceholder();
      val var8: java.lang.String = this.getAccessibilityLabel();
      val var1: Int = this.getMinValues();
      val var3: Int = this.getMaxValues();
      val var4: Boolean = this.getDisabled();
      val var12: java.util.List = this.options;
      val var5: java.util.List = this.selectedOptions;
      val var6: StringBuilder = new StringBuilder();
      var6.append("StringSelectComponent(type=");
      var6.append(var2);
      var6.append(", id=");
      var6.append(var7);
      var6.append(", state=");
      var6.append(var9);
      var6.append(", customId=");
      var6.append(var11);
      var6.append(", placeholder=");
      var6.append(var10);
      var6.append(", accessibilityLabel=");
      var6.append(var8);
      var6.append(", minValues=");
      var6.append(var1);
      var6.append(", maxValues=");
      var6.append(var3);
      var6.append(", disabled=");
      var6.append(var4);
      var6.append(", options=");
      var6.append(var12);
      var6.append(", selectedOptions=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<StringSelectComponent> {
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
         val var2: m0 = m0.a;
         val var1: a2 = a2.a;
         return new KSerializer[]{
            m0.a,
            a2.a,
            ActionComponentState.Serializer.INSTANCE,
            a2.a,
            a.u(a2.a),
            a.u(var1),
            var2,
            var2,
            xk.h.a,
            new xk.f(StringSelectItem.$serializer.INSTANCE),
            new xk.f(var2)
         };
      }

      public open fun deserialize(decoder: Decoder): StringSelectComponent {
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
         var var15: Any;
         val var17: Any;
         var var21: Any;
         var var26: Any;
         var var29: Any;
         if (var10) {
            var6 = var20.i(var19, 0);
            var15 = var20.m(var19, 1);
            val var16: Any = var20.y(var19, 2, ActionComponentState.Serializer.INSTANCE, null);
            var21 = var20.m(var19, 3);
            var26 = a2.a;
            var29 = var20.n(var19, 4, a2.a, null);
            var13 = var20.n(var19, 5, (DeserializationStrategy)var26, null);
            var4 = var20.i(var19, 6);
            var2 = var20.i(var19, 7);
            var3 = var20.C(var19, 8);
            var12 = var20.y(var19, 9, new xk.f(StringSelectItem.$serializer.INSTANCE), null);
            var26 = var20.y(var19, 10, new xk.f(m0.a), null);
            var5 = 2047;
            var17 = var29;
            var29 = var16;
            var7 = var2;
         } else {
            var var25: Boolean = true;
            var6 = 0;
            var4 = 0;
            var3 = 0;
            var26 = null;
            var var30: Any = null;
            var21 = null;
            var13 = null;
            var29 = null;
            var15 = null;
            var12 = null;
            var5 = 0;

            while (var25) {
               val var9: Int = var20.o(var19);
               switch (var9) {
                  case -1:
                     var25 = false;
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
                     var29 = var20.y(var19, 2, ActionComponentState.Serializer.INSTANCE, var29);
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
                     var30 = var20.n(var19, 5, a2.a, var30);
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
                     var21 = var20.y(var19, 9, new xk.f(StringSelectItem.$serializer.INSTANCE), var21);
                     var2 |= 512;
                     break;
                  case 10:
                     var26 = var20.y(var19, 10, new xk.f(m0.a), var26);
                     var2 |= 1024;
                     break;
                  default:
                     throw new n(var9);
               }

               var8 = 7;
            }

            var21 = var12;
            var7 = var5;
            var17 = var13;
            var5 = var2;
            var13 = var30;
            var12 = var21;
         }

         var20.c(var19);
         return new StringSelectComponent(
            var5,
            var6,
            (java.lang.String)var15,
            var29 as ActionComponentState,
            (java.lang.String)var21,
            var17 as java.lang.String,
            var13 as java.lang.String,
            var4,
            var7,
            (boolean)var3,
            var12 as java.util.List,
            var26 as java.util.List,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: StringSelectComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         StringSelectComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StringSelectComponent> {
         return StringSelectComponent.$serializer.INSTANCE;
      }
   }
}
