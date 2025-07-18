package com.discord.chat.bridge.embed

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class EmbedField(rawName: String? = null, rawValue: String? = null, name: StructurableText? = null, value: StructurableText? = null) {
   public final val rawName: String?
   public final val rawValue: String?
   public final val name: StructurableText?
   public final val value: StructurableText?

   fun EmbedField() {
      this(null, null, null, null, 15, null);
   }

   init {
      this.rawName = var1;
      this.rawValue = var2;
      this.name = var3;
      this.value = var4;
   }

   public operator fun component1(): String? {
      return this.rawName;
   }

   public operator fun component2(): String? {
      return this.rawValue;
   }

   public operator fun component3(): StructurableText? {
      return this.name;
   }

   public operator fun component4(): StructurableText? {
      return this.value;
   }

   public fun copy(
      rawName: String? = var0.rawName,
      rawValue: String? = var0.rawValue,
      name: StructurableText? = var0.name,
      value: StructurableText? = var0.value
   ): EmbedField {
      return new EmbedField(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedField) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.rawName, var1.rawName)) {
            return false;
         } else if (!r.c(this.rawValue, var1.rawValue)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else {
            return r.c(this.value, var1.value);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.rawName == null) {
         var1 = 0;
      } else {
         var1 = this.rawName.hashCode();
      }

      val var2: Int;
      if (this.rawValue == null) {
         var2 = 0;
      } else {
         var2 = this.rawValue.hashCode();
      }

      val var3: Int;
      if (this.name == null) {
         var3 = 0;
      } else {
         var3 = this.name.hashCode();
      }

      if (this.value != null) {
         var4 = this.value.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.rawName;
      val var3: java.lang.String = this.rawValue;
      val var5: StructurableText = this.name;
      val var4: StructurableText = this.value;
      val var1: StringBuilder = new StringBuilder();
      var1.append("EmbedField(rawName=");
      var1.append(var2);
      var1.append(", rawValue=");
      var1.append(var3);
      var1.append(", name=");
      var1.append(var5);
      var1.append(", value=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedField> {
         return EmbedField.$serializer.INSTANCE;
      }
   }
}
