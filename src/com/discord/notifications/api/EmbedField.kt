package com.discord.notifications.api

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class EmbedField(name: String? = null, value: String? = null) {
   public final val name: String?
   public final val value: String?

   fun EmbedField() {
      this(null, null, 3, null);
   }

   init {
      this.name = var1;
      this.value = var2;
   }

   public operator fun component1(): String? {
      return this.name;
   }

   public operator fun component2(): String? {
      return this.value;
   }

   public fun copy(name: String? = var0.name, value: String? = var0.value): EmbedField {
      return new EmbedField(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedField) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.name, var1.name)) {
            return false;
         } else {
            return r.c(this.value, var1.value);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.name == null) {
         var1 = 0;
      } else {
         var1 = this.name.hashCode();
      }

      if (this.value != null) {
         var2 = this.value.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.name;
      val var1: java.lang.String = this.value;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EmbedField(name=");
      var3.append(var2);
      var3.append(", value=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedField> {
         return EmbedField.$serializer.INSTANCE;
      }
   }
}
