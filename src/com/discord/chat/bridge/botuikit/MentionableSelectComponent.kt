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
public data class MentionableSelectComponent(type: Int,
      id: String,
      state: ActionComponentState,
      customId: String,
      placeholder: String? = null,
      accessibilityLabel: String? = null,
      minValues: Int,
      maxValues: Int,
      disabled: Boolean = false,
      selectedOptions: List<SearchableSelectItem>
   )
   : SearchableSelectComponent {
   public open val accessibilityLabel: String?
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
   }

   @JvmStatic
   public fun `write$Self`(self: MentionableSelectComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
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

      var1.y(var2, 9, new xk.f(SearchableSelectItem.$serializer.INSTANCE), var0.getSelectedOptions());
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component10(): List<SearchableSelectItem> {
      return this.getSelectedOptions();
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
      selectedOptions: List<SearchableSelectItem> = var0.getSelectedOptions()
   ): MentionableSelectComponent {
      r.h(var2, "id");
      r.h(var3, "state");
      r.h(var4, "customId");
      r.h(var10, "selectedOptions");
      return new MentionableSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MentionableSelectComponent) {
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
         } else {
            return r.c(this.getSelectedOptions(), var1.getSelectedOptions());
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = Integer.hashCode(this.getType());
      val var8: Int = this.getId().hashCode();
      val var6: Int = this.getState().hashCode();
      val var5: Int = this.getCustomId().hashCode();
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

      val var9: Int = Integer.hashCode(this.getMinValues());
      val var10: Int = Integer.hashCode(this.getMaxValues());
      val var4: Byte = this.getDisabled();
      var var3: Byte = var4;
      if (var4 != 0) {
         var3 = 1;
      }

      return ((((((((var7 * 31 + var8) * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var9) * 31 + var10) * 31 + var3) * 31
         + this.getSelectedOptions().hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var5: java.lang.String = this.getId();
      val var9: ActionComponentState = this.getState();
      val var7: java.lang.String = this.getCustomId();
      val var10: java.lang.String = this.getPlaceholder();
      val var6: java.lang.String = this.getAccessibilityLabel();
      val var2: Int = this.getMinValues();
      val var3: Int = this.getMaxValues();
      val var4: Boolean = this.getDisabled();
      val var8: java.util.List = this.getSelectedOptions();
      val var11: StringBuilder = new StringBuilder();
      var11.append("MentionableSelectComponent(type=");
      var11.append(var1);
      var11.append(", id=");
      var11.append(var5);
      var11.append(", state=");
      var11.append(var9);
      var11.append(", customId=");
      var11.append(var7);
      var11.append(", placeholder=");
      var11.append(var10);
      var11.append(", accessibilityLabel=");
      var11.append(var6);
      var11.append(", minValues=");
      var11.append(var2);
      var11.append(", maxValues=");
      var11.append(var3);
      var11.append(", disabled=");
      var11.append(var4);
      var11.append(", selectedOptions=");
      var11.append(var8);
      var11.append(")");
      return var11.toString();
   }

   public object `$serializer` : f0<MentionableSelectComponent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MentionableSelectComponent.$serializer = new MentionableSelectComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("7", var0, 10);
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
            new xk.f(SearchableSelectItem.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): MentionableSelectComponent {
         r.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.b(var20);
         val var12: Boolean = var21.p();
         var var8: Byte = 9;
         var var10: Byte = 7;
         var var9: Byte = 6;
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var15: Any;
         var var16: Any;
         var var17: Any;
         val var18: Any;
         val var19: Any;
         var var27: Any;
         if (var12) {
            var5 = var21.i(var20, 0);
            val var22: java.lang.String = var21.m(var20, 1);
            var18 = var21.y(var20, 2, ActionComponentState.Serializer.INSTANCE, null);
            val var13: java.lang.String = var21.m(var20, 3);
            var27 = a2.a;
            var19 = var21.n(var20, 4, a2.a, null);
            var17 = var21.n(var20, 5, (DeserializationStrategy)var27, null);
            var2 = var21.i(var20, 6);
            var4 = var21.i(var20, 7);
            var3 = var21.C(var20, 8);
            var16 = var21.y(var20, 9, new xk.f(SearchableSelectItem.$serializer.INSTANCE), null);
            var7 = 1023;
            var15 = var13;
            var6 = var2;
            var27 = var22;
         } else {
            var var25: Boolean = true;
            var5 = 0;
            var6 = 0;
            var3 = 0;
            var17 = null;
            var16 = null;
            var var23: Any = null;
            var var26: Any = null;
            var27 = null;
            var15 = null;
            var4 = 0;

            while (var25) {
               label38: {
                  label37: {
                     val var11: Int = var21.o(var20);
                     switch (var11) {
                        case -1:
                           var25 = false;
                           break;
                        case 0:
                           var5 = var21.i(var20, 0);
                           var2 |= 1;
                           break label37;
                        case 1:
                           var27 = var21.m(var20, 1);
                           var2 |= 2;
                           break label37;
                        case 2:
                           var26 = var21.y(var20, 2, ActionComponentState.Serializer.INSTANCE, var26);
                           var2 |= 4;
                           break label37;
                        case 3:
                           var15 = var21.m(var20, 3);
                           var2 |= 8;
                           break;
                        case 4:
                           var23 = var21.n(var20, 4, a2.a, var23);
                           var2 |= 16;
                           break;
                        case 5:
                           var17 = var21.n(var20, 5, a2.a, var17);
                           var2 |= 32;
                           var8 = 9;
                           continue;
                        case 6:
                           var6 = var21.i(var20, var9);
                           var2 |= 64;
                           continue;
                        case 7:
                           var4 = var21.i(var20, var10);
                           var2 |= 128;
                           break label38;
                        case 8:
                           var3 = var21.C(var20, 8);
                           var2 |= 256;
                           break label38;
                        case 9:
                           var16 = var21.y(var20, var8, new xk.f(SearchableSelectItem.$serializer.INSTANCE), var16);
                           var2 |= 512;
                           break label38;
                        default:
                           throw new n(var11);
                     }

                     var8 = 9;
                     continue;
                  }

                  var8 = 9;
                  var10 = 7;
                  continue;
               }

               var9 = 6;
            }

            var18 = var26;
            var19 = var23;
            var7 = var2;
         }

         var21.c(var20);
         return new MentionableSelectComponent(
            var7,
            var5,
            (java.lang.String)var27,
            var18 as ActionComponentState,
            (java.lang.String)var15,
            var19 as java.lang.String,
            var17 as java.lang.String,
            var6,
            var4,
            (boolean)var3,
            var16 as java.util.List,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: MentionableSelectComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MentionableSelectComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MentionableSelectComponent> {
         return MentionableSelectComponent.$serializer.INSTANCE;
      }
   }
}
