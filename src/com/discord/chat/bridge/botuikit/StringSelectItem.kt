package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class StringSelectItem(label: String,
   value: String,
   emoji: ComponentEmoji? = null,
   description: String? = null,
   default: Boolean? = java.lang.Boolean.FALSE
) : SelectItem() {
   public open val label: String
   public open val value: String
   public final val emoji: ComponentEmoji?
   public final val description: String?
   public final val default: Boolean?

   init {
      this.label = var1;
      this.value = var2;
      this.emoji = var3;
      this.description = var4;
      this.default = var5;
   }

   public operator fun component1(): String {
      return this.label;
   }

   public operator fun component2(): String {
      return this.value;
   }

   public operator fun component3(): ComponentEmoji? {
      return this.emoji;
   }

   public operator fun component4(): String? {
      return this.description;
   }

   public operator fun component5(): Boolean? {
      return this.default;
   }

   public fun copy(
      label: String = var0.label,
      value: String = var0.value,
      emoji: ComponentEmoji? = var0.emoji,
      description: String? = var0.description,
      default: Boolean? = var0.default
   ): StringSelectItem {
      return new StringSelectItem(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StringSelectItem) {
         return false;
      } else {
         var1 = var1;
         if (!(this.label == var1.label)) {
            return false;
         } else if (!(this.value == var1.value)) {
            return false;
         } else if (!(this.emoji == var1.emoji)) {
            return false;
         } else if (!(this.description == var1.description)) {
            return false;
         } else {
            return this.default == var1.default;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.label.hashCode();
      val var4: Int = this.value.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.emoji == null) {
         var1 = 0;
      } else {
         var1 = this.emoji.hashCode();
      }

      val var2: Int;
      if (this.description == null) {
         var2 = 0;
      } else {
         var2 = this.description.hashCode();
      }

      if (this.default != null) {
         var3 = this.default.hashCode();
      }

      return (((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.label;
      val var5: java.lang.String = this.value;
      val var3: ComponentEmoji = this.emoji;
      val var2: java.lang.String = this.description;
      val var1: java.lang.Boolean = this.default;
      val var4: StringBuilder = new StringBuilder();
      var4.append("StringSelectItem(label=");
      var4.append(var6);
      var4.append(", value=");
      var4.append(var5);
      var4.append(", emoji=");
      var4.append(var3);
      var4.append(", description=");
      var4.append(var2);
      var4.append(", default=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<StringSelectItem> {
         return StringSelectItem.$serializer.INSTANCE;
      }
   }
}
