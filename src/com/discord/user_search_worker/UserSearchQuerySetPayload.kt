package com.discord.user_search_worker

import kotlinx.serialization.KSerializer
import nb.g
import qb.E0
import qb.U
import qb.f
import qb.y

@g
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
      $childSerializers = new KSerializer[]{null, null, new f(E0.a), new f(var0), new U(var0, y.a), null, null};
   }

   init {
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
      return new UserSearchQuerySetPayload(var1, var2, var3, var4, var5, var6, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetPayload) {
         return false;
      } else {
         var1 = var1;
         if (!(this.query == var1.query)) {
            return false;
         } else if (!(this.filters == var1.filters)) {
            return false;
         } else if (!(this.blacklist == var1.blacklist)) {
            return false;
         } else if (!(this.whitelist == var1.whitelist)) {
            return false;
         } else if (!(this.boosters == var1.boosters)) {
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
      val var6: java.lang.String = this.query;
      val var9: UserSearchQuerySetFilters = this.filters;
      val var4: java.util.List = this.blacklist;
      val var8: java.util.List = this.whitelist;
      val var7: java.util.Map = this.boosters;
      val var1: Double = this.boosterFallback;
      val var3: Int = this.limit;
      val var5: StringBuilder = new StringBuilder();
      var5.append("UserSearchQuerySetPayload(query=");
      var5.append(var6);
      var5.append(", filters=");
      var5.append(var9);
      var5.append(", blacklist=");
      var5.append(var4);
      var5.append(", whitelist=");
      var5.append(var8);
      var5.append(", boosters=");
      var5.append(var7);
      var5.append(", boosterFallback=");
      var5.append(var1);
      var5.append(", limit=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetPayload> {
         return UserSearchQuerySetPayload.$serializer.INSTANCE;
      }
   }
}
