package com.discord.chat.bridge.roleicons

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class RoleIcon(source: String? = null, unicodeEmoji: String? = null, name: String, size: Int, alt: String) {
   public final val source: String?
   public final val unicodeEmoji: String?
   public final val name: String
   public final val size: Int
   public final val alt: String

   init {
      r.h(var3, "name");
      r.h(var5, "alt");
      super();
      this.source = var1;
      this.unicodeEmoji = var2;
      this.name = var3;
      this.size = var4;
      this.alt = var5;
   }

   public operator fun component1(): String? {
      return this.source;
   }

   public operator fun component2(): String? {
      return this.unicodeEmoji;
   }

   public operator fun component3(): String {
      return this.name;
   }

   public operator fun component4(): Int {
      return this.size;
   }

   public operator fun component5(): String {
      return this.alt;
   }

   public fun copy(
      source: String? = var0.source,
      unicodeEmoji: String? = var0.unicodeEmoji,
      name: String = var0.name,
      size: Int = var0.size,
      alt: String = var0.alt
   ): RoleIcon {
      r.h(var3, "name");
      r.h(var5, "alt");
      return new RoleIcon(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleIcon) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.source, var1.source)) {
            return false;
         } else if (!r.c(this.unicodeEmoji, var1.unicodeEmoji)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (this.size != var1.size) {
            return false;
         } else {
            return r.c(this.alt, var1.alt);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.source == null) {
         var1 = 0;
      } else {
         var1 = this.source.hashCode();
      }

      if (this.unicodeEmoji != null) {
         var2 = this.unicodeEmoji.hashCode();
      }

      return (((var1 * 31 + var2) * 31 + this.name.hashCode()) * 31 + Integer.hashCode(this.size)) * 31 + this.alt.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.source;
      val var5: java.lang.String = this.unicodeEmoji;
      val var6: java.lang.String = this.name;
      val var1: Int = this.size;
      val var3: java.lang.String = this.alt;
      val var4: StringBuilder = new StringBuilder();
      var4.append("RoleIcon(source=");
      var4.append(var2);
      var4.append(", unicodeEmoji=");
      var4.append(var5);
      var4.append(", name=");
      var4.append(var6);
      var4.append(", size=");
      var4.append(var1);
      var4.append(", alt=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<RoleIcon> {
         return RoleIcon.$serializer.INSTANCE;
      }
   }
}
