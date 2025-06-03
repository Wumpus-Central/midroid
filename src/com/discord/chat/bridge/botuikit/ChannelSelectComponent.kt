package com.discord.chat.bridge.botuikit

import Ka.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

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
   public final val channelTypes: List<Int>?

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
      val var4: Int = Integer.hashCode(this.type);
      val var5: Int = this.id.hashCode();
      val var6: Int = this.state.hashCode();
      val var7: Int = this.customId.hashCode();
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

      val var9: Int = Integer.hashCode(this.minValues);
      val var11: Int = Integer.hashCode(this.maxValues);
      val var10: Int = java.lang.Boolean.hashCode(this.disabled);
      val var8: Int = this.selectedOptions.hashCode();
      if (this.channelTypes != null) {
         var3 = this.channelTypes.hashCode();
      }

      return (((((((((var4 * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var9) * 31 + var11) * 31 + var10) * 31 + var8) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: Int = this.type;
      val var11: java.lang.String = this.id;
      val var12: ActionComponentState = this.state;
      val var9: java.lang.String = this.customId;
      val var5: java.lang.String = this.placeholder;
      val var6: java.lang.String = this.accessibilityLabel;
      val var1: Int = this.minValues;
      val var2: Int = this.maxValues;
      val var4: Boolean = this.disabled;
      val var7: java.util.List = this.selectedOptions;
      val var8: java.util.List = this.channelTypes;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ChannelSelectComponent(type=");
      var10.append(var3);
      var10.append(", id=");
      var10.append(var11);
      var10.append(", state=");
      var10.append(var12);
      var10.append(", customId=");
      var10.append(var9);
      var10.append(", placeholder=");
      var10.append(var5);
      var10.append(", accessibilityLabel=");
      var10.append(var6);
      var10.append(", minValues=");
      var10.append(var1);
      var10.append(", maxValues=");
      var10.append(var2);
      var10.append(", disabled=");
      var10.append(var4);
      var10.append(", selectedOptions=");
      var10.append(var7);
      var10.append(", channelTypes=");
      var10.append(var8);
      var10.append(")");
      return var10.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelSelectComponent> {
         return ChannelSelectComponent.$serializer.INSTANCE;
      }
   }
}
