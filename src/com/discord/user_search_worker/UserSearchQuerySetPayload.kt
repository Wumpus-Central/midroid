package com.discord.user_search_worker

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f
import vb.E0
import vb.U
import vb.y

@f
internal data class UserSearchQuerySetPayload(query: String,
   filters: UserSearchQuerySetFilters? = null,
   blacklist: List<String>? = null,
   whitelist: List<String>? = null,
   boosters: Map<String, Double>,
   boosterFallback: Double,
   limit: Int
) {
   public final val query: String
   public final val filters: UserSearchQuerySetFilters?
   public final val blacklist: List<String>?
   public final val whitelist: List<String>?
   public final val boosters: Map<String, Double>
   public final val boosterFallback: Double
   public final val limit: Int

   @JvmStatic
   fun {
      val var0: E0 = E0.a;
      $childSerializers = new KSerializer[]{null, null, new vb.f(E0.a), new vb.f(var0), new U(var0, y.a), null, null};
   }

   init {
      r.h(var1, "query");
      r.h(var5, "boosters");
      super();
      this.query = var1;
      this.filters = var2;
      this.blacklist = var3;
      this.whitelist = var4;
      this.boosters = var5;
      this.boosterFallback = var6;
      this.limit = var8;
   }

   public operator fun component1(): String {
      return this.query;
   }

   public operator fun component2(): UserSearchQuerySetFilters? {
      return this.filters;
   }

   public operator fun component3(): List<String>? {
      return this.blacklist;
   }

   public operator fun component4(): List<String>? {
      return this.whitelist;
   }

   public operator fun component5(): Map<String, Double> {
      return this.boosters;
   }

   public operator fun component6(): Double {
      return this.boosterFallback;
   }

   public operator fun component7(): Int {
      return this.limit;
   }

   public fun copy(
      query: String = var0.query,
      filters: UserSearchQuerySetFilters? = var0.filters,
      blacklist: List<String>? = var0.blacklist,
      whitelist: List<String>? = var0.whitelist,
      boosters: Map<String, Double> = var0.boosters,
      boosterFallback: Double = var0.boosterFallback,
      limit: Int = var0.limit
   ): UserSearchQuerySetPayload {
      r.h(var1, "query");
      r.h(var5, "boosters");
      return new UserSearchQuerySetPayload(var1, var2, var3, var4, var5, var6, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetPayload) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.query, var1.query)) {
            return false;
         } else if (!r.c(this.filters, var1.filters)) {
            return false;
         } else if (!r.c(this.blacklist, var1.blacklist)) {
            return false;
         } else if (!r.c(this.whitelist, var1.whitelist)) {
            return false;
         } else if (!r.c(this.boosters, var1.boosters)) {
            return false;
         } else if (java.lang.Double.compare(this.boosterFallback, var1.boosterFallback) != 0) {
            return false;
         } else {
            return this.limit == var1.limit;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.query.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.filters == null) {
         var1 = 0;
      } else {
         var1 = this.filters.hashCode();
      }

      val var2: Int;
      if (this.blacklist == null) {
         var2 = 0;
      } else {
         var2 = this.blacklist.hashCode();
      }

      if (this.whitelist != null) {
         var3 = this.whitelist.hashCode();
      }

      return (((((var4 * 31 + var1) * 31 + var2) * 31 + var3) * 31 + this.boosters.hashCode()) * 31 + java.lang.Double.hashCode(this.boosterFallback)) * 31
         + Integer.hashCode(this.limit);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.query;
      val var6: UserSearchQuerySetFilters = this.filters;
      val var5: java.util.List = this.blacklist;
      val var8: java.util.List = this.whitelist;
      val var9: java.util.Map = this.boosters;
      val var1: Double = this.boosterFallback;
      val var3: Int = this.limit;
      val var7: StringBuilder = new StringBuilder();
      var7.append("UserSearchQuerySetPayload(query=");
      var7.append(var4);
      var7.append(", filters=");
      var7.append(var6);
      var7.append(", blacklist=");
      var7.append(var5);
      var7.append(", whitelist=");
      var7.append(var8);
      var7.append(", boosters=");
      var7.append(var9);
      var7.append(", boosterFallback=");
      var7.append(var1);
      var7.append(", limit=");
      var7.append(var3);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetPayload> {
         return UserSearchQuerySetPayload.$serializer.INSTANCE;
      }
   }
}
