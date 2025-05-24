package com.discord.notifications.api

import Ka.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
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
         if (!q.c(this.name, var1.name)) {
            return false;
         } else {
            return q.c(this.value, var1.value);
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
      val var1: java.lang.String = this.name;
      val var3: java.lang.String = this.value;
      val var2: StringBuilder = new StringBuilder();
      var2.append("EmbedField(name=");
      var2.append(var1);
      var2.append(", value=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedField> {
         return EmbedField.$serializer.INSTANCE;
      }
   }
}
