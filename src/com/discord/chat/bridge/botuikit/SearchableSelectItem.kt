package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class SearchableSelectItem(label: String,
      value: String,
      type: SelectOptionType,
      iconSrc: String? = null,
      iconColor: Int? = null,
      iconEmoji: ComponentEmoji? = null
   )
   : SelectItem {
   public open val label: String
   public open val value: String
   public final val type: SelectOptionType
   public final val iconSrc: String?
   public final val iconColor: Int?
   public final val iconEmoji: ComponentEmoji?

   init {
      r.h(var1, "label");
      r.h(var2, "value");
      r.h(var3, "type");
      super(null);
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
      r.h(var1, "label");
      r.h(var2, "value");
      r.h(var3, "type");
      return new SearchableSelectItem(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SearchableSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.label, var1.label)) {
            return false;
         } else if (!r.c(this.value, var1.value)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.iconSrc, var1.iconSrc)) {
            return false;
         } else if (!r.c(this.iconColor, var1.iconColor)) {
            return false;
         } else {
            return r.c(this.iconEmoji, var1.iconEmoji);
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
      val var2: java.lang.String = this.label;
      val var1: java.lang.String = this.value;
      val var4: SelectOptionType = this.type;
      val var5: java.lang.String = this.iconSrc;
      val var6: Int = this.iconColor;
      val var7: ComponentEmoji = this.iconEmoji;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SearchableSelectItem(label=");
      var3.append(var2);
      var3.append(", value=");
      var3.append(var1);
      var3.append(", type=");
      var3.append(var4);
      var3.append(", iconSrc=");
      var3.append(var5);
      var3.append(", iconColor=");
      var3.append(var6);
      var3.append(", iconEmoji=");
      var3.append(var7);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SearchableSelectItem> {
         return SearchableSelectItem.$serializer.INSTANCE;
      }
   }
}
