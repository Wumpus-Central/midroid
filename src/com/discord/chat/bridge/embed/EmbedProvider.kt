package com.discord.chat.bridge.embed

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class EmbedProvider(name: String) {
   public final val name: String

   init {
      q.h(var1, "name");
      super();
      this.name = var1;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public fun copy(name: String = var0.name): EmbedProvider {
      q.h(var1, "name");
      return new EmbedProvider(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedProvider) {
         return false;
      } else {
         return q.c(this.name, (var1 as EmbedProvider).name);
      }
   }

   public override fun hashCode(): Int {
      return this.name.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.name;
      val var2: StringBuilder = new StringBuilder();
      var2.append("EmbedProvider(name=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedProvider> {
         return EmbedProvider.$serializer.INSTANCE;
      }
   }
}
