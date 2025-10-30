package com.discord.chat.bridge.embed

import kotlinx.serialization.KSerializer
import tp.m

@m
public data class EmbedProvider(name: String) {
   public final val name: String

   init {
      super();
      this.name = var1;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public fun copy(name: String = var0.name): EmbedProvider {
      return new EmbedProvider(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedProvider) {
         return false;
      } else {
         return this.name == (var1 as EmbedProvider).name;
      }
   }

   public override fun hashCode(): Int {
      return this.name.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.name;
      val var1: StringBuilder = new StringBuilder();
      var1.append("EmbedProvider(name=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedProvider> {
         return EmbedProvider.$serializer.INSTANCE;
      }
   }
}
