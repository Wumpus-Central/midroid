package com.discord.user_search_worker

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class UserSearchQuerySetFilters(guild: String? = null, friends: Boolean? = null, strict: Boolean? = null) {
   public final val guild: String?
   public final val friends: Boolean?
   public final val strict: Boolean?

   fun UserSearchQuerySetFilters() {
      this(null, null, null, 7, null);
   }

   init {
      this.guild = var1;
      this.friends = var2;
      this.strict = var3;
   }

   public operator fun component1(): String? {
      return this.guild;
   }

   public operator fun component2(): Boolean? {
      return this.friends;
   }

   public operator fun component3(): Boolean? {
      return this.strict;
   }

   public fun copy(guild: String? = var0.guild, friends: Boolean? = var0.friends, strict: Boolean? = var0.strict): UserSearchQuerySetFilters {
      return new UserSearchQuerySetFilters(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetFilters) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guild, var1.guild)) {
            return false;
         } else if (!r.c(this.friends, var1.friends)) {
            return false;
         } else {
            return r.c(this.strict, var1.strict);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.guild == null) {
         var1 = 0;
      } else {
         var1 = this.guild.hashCode();
      }

      val var2: Int;
      if (this.friends == null) {
         var2 = 0;
      } else {
         var2 = this.friends.hashCode();
      }

      if (this.strict != null) {
         var3 = this.strict.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.guild;
      val var1: java.lang.Boolean = this.friends;
      val var3: java.lang.Boolean = this.strict;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserSearchQuerySetFilters(guild=");
      var2.append(var4);
      var2.append(", friends=");
      var2.append(var1);
      var2.append(", strict=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetFilters> {
         return UserSearchQuerySetFilters.$serializer.INSTANCE;
      }
   }
}
