package com.discord.notifications.api

import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class Embed(fields: List<EmbedField>? = null) {
   public final val fields: List<EmbedField>?

   fun Embed() {
      this(null, 1, null);
   }

   init {
      this.fields = var1;
   }

   public operator fun component1(): List<EmbedField>? {
      return this.fields;
   }

   public fun copy(fields: List<EmbedField>? = var0.fields): Embed {
      return new Embed(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Embed) {
         return false;
      } else {
         return q.c(this.fields, (var1 as Embed).fields);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.fields == null) {
         var1 = 0;
      } else {
         var1 = this.fields.hashCode();
      }

      return var1;
   }

   public override fun toString(): String {
      val var2: java.util.List = this.fields;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Embed(fields=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Embed> {
         return Embed.$serializer.INSTANCE;
      }
   }
}
