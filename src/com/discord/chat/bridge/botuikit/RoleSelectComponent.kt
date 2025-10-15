package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class RoleSelectComponent(type: Int,
   id: String,
   state: ActionComponentState,
   customId: String,
   placeholder: String? = null,
   accessibilityLabel: String? = null,
   minValues: Int,
   maxValues: Int,
   disabled: Boolean = false,
   selectedOptions: List<SearchableSelectItem>
) : SearchableSelectComponent() {
   public open val type: Int
   public open val id: String
   public open val state: ActionComponentState
   public open val customId: String
   public open val placeholder: String?
   public open val accessibilityLabel: String?
   public open val minValues: Int
   public open val maxValues: Int
   public open val disabled: Boolean
   public open val selectedOptions: List<SearchableSelectItem>

   init {
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
   ): RoleSelectComponent {
      return new RoleSelectComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleSelectComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!(this.id == var1.id)) {
            return false;
         } else if (this.state != var1.state) {
            return false;
         } else if (!(this.customId == var1.customId)) {
            return false;
         } else if (!(this.placeholder == var1.placeholder)) {
            return false;
         } else if (!(this.accessibilityLabel == var1.accessibilityLabel)) {
            return false;
         } else if (this.minValues != var1.minValues) {
            return false;
         } else if (this.maxValues != var1.maxValues) {
            return false;
         } else if (this.disabled != var1.disabled) {
            return false;
         } else {
            return this.selectedOptions == var1.selectedOptions;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.type);
      val var5: Int = this.id.hashCode();
      val var3: Int = this.state.hashCode();
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
                        ((((((var4 * 31 + var5) * 31 + var3) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.minValues)) * 31
                           + Integer.hashCode(this.maxValues)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.disabled)
            )
            * 31
         + this.selectedOptions.hashCode();
   }

   public override fun toString(): String {
      val var3: Int = this.type;
      val var11: java.lang.String = this.id;
      val var10: ActionComponentState = this.state;
      val var6: java.lang.String = this.customId;
      val var5: java.lang.String = this.placeholder;
      val var9: java.lang.String = this.accessibilityLabel;
      val var2: Int = this.minValues;
      val var1: Int = this.maxValues;
      val var4: Boolean = this.disabled;
      val var7: java.util.List = this.selectedOptions;
      val var8: StringBuilder = new StringBuilder();
      var8.append("RoleSelectComponent(type=");
      var8.append(var3);
      var8.append(", id=");
      var8.append(var11);
      var8.append(", state=");
      var8.append(var10);
      var8.append(", customId=");
      var8.append(var6);
      var8.append(", placeholder=");
      var8.append(var5);
      var8.append(", accessibilityLabel=");
      var8.append(var9);
      var8.append(", minValues=");
      var8.append(var2);
      var8.append(", maxValues=");
      var8.append(var1);
      var8.append(", disabled=");
      var8.append(var4);
      var8.append(", selectedOptions=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<RoleSelectComponent> {
         return RoleSelectComponent.$serializer.INSTANCE;
      }
   }
}
