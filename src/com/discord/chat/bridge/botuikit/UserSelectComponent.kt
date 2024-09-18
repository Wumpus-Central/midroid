package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.q
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
import xk.b2
import xk.g0
import xk.h
import xk.n0

@f
public data class UserSelectComponent(type: Int,
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
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component10(): List<SearchableSelectItem> {
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
      selectedOptions: List<SearchableSelectItem> = var0.selectedOptions
   ): UserSelectComponent {
      q.h(var2, "id");
      q.h(var3, "state");
      q.h(var4, "customId");
      q.h(var10, "selectedOptions");
      return new UserSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSelectComponent) {
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
         } else {
            return q.c(this.selectedOptions, var1.selectedOptions);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.type);
      val var3: Int = this.id.hashCode();
      val var4: Int = this.state.hashCode();
      val var6: Int = this.customId.hashCode();
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
                        ((((((var5 * 31 + var3) * 31 + var4) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.minValues)) * 31
                           + Integer.hashCode(this.maxValues)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.disabled)
            )
            * 31
         + this.selectedOptions.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var11: java.lang.String = this.id;
      val var5: ActionComponentState = this.state;
      val var6: java.lang.String = this.customId;
      val var9: java.lang.String = this.placeholder;
      val var7: java.lang.String = this.accessibilityLabel;
      val var2: Int = this.minValues;
      val var3: Int = this.maxValues;
      val var4: Boolean = this.disabled;
      val var10: java.util.List = this.selectedOptions;
      val var8: StringBuilder = new StringBuilder();
      var8.append("UserSelectComponent(type=");
      var8.append(var1);
      var8.append(", id=");
      var8.append(var11);
      var8.append(", state=");
      var8.append(var5);
      var8.append(", customId=");
      var8.append(var6);
      var8.append(", placeholder=");
      var8.append(var9);
      var8.append(", accessibilityLabel=");
      var8.append(var7);
      var8.append(", minValues=");
      var8.append(var2);
      var8.append(", maxValues=");
      var8.append(var3);
      var8.append(", disabled=");
      var8.append(var4);
      var8.append(", selectedOptions=");
      var8.append(var10);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UserSelectComponent.$serializer = new UserSelectComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("5", var0, 10);
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
         val var3: Array<KSerializer> = UserSelectComponent.access$get$childSerializers$cp();
         val var2: n0 = n0.a;
         val var1: b2 = b2.a;
         return new KSerializer[]{n0.a, b2.a, ActionComponentState.Serializer.INSTANCE, b2.a, a.u(b2.a), a.u(var1), var2, var2, h.a, var3[9]};
      }

      public open fun deserialize(decoder: Decoder): UserSelectComponent {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.c(var19);
         val var17: Array<KSerializer> = UserSelectComponent.access$get$childSerializers$cp();
         val var11: Boolean = var20.y();
         var var8: Byte = 7;
         var var9: Byte = 6;
         var var2: Int = 0;
         var var3: Int;
         var var5: Int;
         val var7: Int;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         val var22: java.lang.String;
         var var26: Int;
         var var29: Int;
         val var33: java.util.List;
         if (var11) {
            var26 = var20.k(var19, 0);
            var12 = var20.t(var19, 1);
            var13 = var20.m(var19, 2, ActionComponentState.Serializer.INSTANCE, null) as ActionComponentState;
            var15 = var20.t(var19, 3);
            val var21: b2 = b2.a;
            var14 = var20.v(var19, 4, b2.a, null) as java.lang.String;
            var22 = var20.v(var19, 5, var21, null) as java.lang.String;
            var29 = var20.k(var19, 6);
            var2 = var20.k(var19, 7);
            var5 = var20.s(var19, 8);
            var33 = var20.m(var19, 9, var17[9], null) as java.util.List;
            var3 = 1023;
            var7 = var26;
            var26 = var29;
            var29 = var2;
         } else {
            var var30: Boolean = true;
            var3 = 0;
            var5 = 0;
            var26 = 0;
            var var16: java.lang.String = null;
            var15 = null;
            var14 = null;
            var13 = null;
            var12 = null;
            var var23: Any = null;
            var29 = 0;

            while (var30) {
               label41: {
                  val var10: Int = var20.x(var19);
                  switch (var10) {
                     case -1:
                        var30 = false;
                        break label41;
                     case 0:
                        var3 = var20.k(var19, 0);
                        var2 |= 1;
                        break;
                     case 1:
                        var12 = var20.t(var19, 1);
                        var2 |= 2;
                        break;
                     case 2:
                        var13 = var20.m(var19, 2, ActionComponentState.Serializer.INSTANCE, var13) as ActionComponentState;
                        var2 |= 4;
                        break;
                     case 3:
                        var23 = var20.t(var19, 3);
                        var2 |= 8;
                        break label41;
                     case 4:
                        var14 = var20.v(var19, 4, b2.a, var14) as java.lang.String;
                        var2 |= 16;
                        break label41;
                     case 5:
                        var16 = var20.v(var19, 5, b2.a, var16) as java.lang.String;
                        var2 |= 32;
                        var8 = 7;
                        continue;
                     case 6:
                        var5 = var20.k(var19, var9);
                        var2 |= 64;
                        continue;
                     case 7:
                        var29 = var20.k(var19, var8);
                        var2 |= 128;
                        continue;
                     case 8:
                        var26 = var20.s(var19, 8);
                        var2 |= 256;
                        continue;
                     case 9:
                        var15 = var20.m(var19, 9, var17[9], var15) as java.util.List;
                        var2 |= 512;
                        continue;
                     default:
                        throw new n(var10);
                  }

                  var8 = 7;
                  var9 = 6;
                  continue;
               }

               var8 = 7;
            }

            var33 = (java.util.List)var15;
            var5 = var26;
            var26 = var5;
            var22 = var16;
            var15 = var23;
            var7 = var3;
            var3 = var2;
         }

         var20.b(var19);
         return new UserSelectComponent(
            var3,
            var7,
            (java.lang.String)var12,
            (ActionComponentState)var13,
            (java.lang.String)var15,
            (java.lang.String)var14,
            var22,
            var26,
            var29,
            (boolean)var5,
            var33,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: UserSelectComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UserSelectComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return xk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSelectComponent> {
         return UserSelectComponent.$serializer.INSTANCE;
      }
   }
}
