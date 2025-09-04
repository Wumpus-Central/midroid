package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class SearchableSelectItem(label: String,
   value: String,
   type: SelectOptionType,
   iconSrc: String? = null,
   iconColor: Int? = null,
   iconEmoji: ComponentEmoji? = null
) : SelectItem() {
   public open val label: String
   public open val value: String
   public final val type: SelectOptionType
   public final val iconSrc: String?
   public final val iconColor: Int?
   public final val iconEmoji: ComponentEmoji?

   init {
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
      return new SearchableSelectItem(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SearchableSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!(this.label == var1.label)) {
            return false;
         } else if (!(this.value == var1.value)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!(this.iconSrc == var1.iconSrc)) {
            return false;
         } else if (!(this.iconColor == var1.iconColor)) {
            return false;
         } else {
            return this.iconEmoji == var1.iconEmoji;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.label.hashCode();
      val var5: Int = this.value.hashCode();
      val var6: Int = this.type.hashCode();
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

      return ((((var4 * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.label;
      val var5: java.lang.String = this.value;
      val var4: SelectOptionType = this.type;
      val var1: java.lang.String = this.iconSrc;
      val var6: Int = this.iconColor;
      val var2: ComponentEmoji = this.iconEmoji;
      val var7: StringBuilder = new StringBuilder();
      var7.append("SearchableSelectItem(label=");
      var7.append(var3);
      var7.append(", value=");
      var7.append(var5);
      var7.append(", type=");
      var7.append(var4);
      var7.append(", iconSrc=");
      var7.append(var1);
      var7.append(", iconColor=");
      var7.append(var6);
      var7.append(", iconEmoji=");
      var7.append(var2);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectItem> {
         return SearchableSelectItem.$serializer.INSTANCE;
      }
   }
}
