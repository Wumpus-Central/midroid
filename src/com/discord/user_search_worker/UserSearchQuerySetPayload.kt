package com.discord.user_search_worker

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.n0
import qn.s0
import qn.y

@f
internal data class UserSearchQuerySetPayload(query: String,
   filters: UserSearchQuerySetFilters? = null,
   blacklist: List<String>? = null,
   whitelist: List<String>? = null,
   boosters: Map<String, Double>,
   limit: Int
) {
   public final val blacklist: List<String>?
   public final val boosters: Map<String, Double>
   public final val filters: UserSearchQuerySetFilters?
   public final val limit: Int
   public final val query: String
   public final val whitelist: List<String>?

   @JvmStatic
   fun {
      val var0: b2 = b2.a;
      $childSerializers = new KSerializer[]{null, null, new qn.f(b2.a), new qn.f(var0), new s0(var0, y.a), null};
   }

   init {
      q.h(var1, "query");
      q.h(var5, "boosters");
      super();
      this.query = var1;
      this.filters = var2;
      this.blacklist = var3;
      this.whitelist = var4;
      this.boosters = var5;
      this.limit = var6;
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

   public operator fun component6(): Int {
      return this.limit;
   }

   public fun copy(
      query: String = var0.query,
      filters: UserSearchQuerySetFilters? = var0.filters,
      blacklist: List<String>? = var0.blacklist,
      whitelist: List<String>? = var0.whitelist,
      boosters: Map<String, Double> = var0.boosters,
      limit: Int = var0.limit
   ): UserSearchQuerySetPayload {
      q.h(var1, "query");
      q.h(var5, "boosters");
      return new UserSearchQuerySetPayload(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetPayload) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.query, var1.query)) {
            return false;
         } else if (!q.c(this.filters, var1.filters)) {
            return false;
         } else if (!q.c(this.blacklist, var1.blacklist)) {
            return false;
         } else if (!q.c(this.whitelist, var1.whitelist)) {
            return false;
         } else if (!q.c(this.boosters, var1.boosters)) {
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

      return ((((var4 * 31 + var1) * 31 + var2) * 31 + var3) * 31 + this.boosters.hashCode()) * 31 + Integer.hashCode(this.limit);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.query;
      val var7: UserSearchQuerySetFilters = this.filters;
      val var3: java.util.List = this.blacklist;
      val var5: java.util.List = this.whitelist;
      val var6: java.util.Map = this.boosters;
      val var1: Int = this.limit;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserSearchQuerySetPayload(query=");
      var2.append(var4);
      var2.append(", filters=");
      var2.append(var7);
      var2.append(", blacklist=");
      var2.append(var3);
      var2.append(", whitelist=");
      var2.append(var5);
      var2.append(", boosters=");
      var2.append(var6);
      var2.append(", limit=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UserSearchQuerySetPayload.$serializer = new UserSearchQuerySetPayload.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetPayload", var0, 6);
         var1.c("query", false);
         var1.c("filters", true);
         var1.c("blacklist", true);
         var1.c("whitelist", true);
         var1.c("boosters", false);
         var1.c("limit", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = UserSearchQuerySetPayload.access$get$childSerializers$cp();
         return new KSerializer[]{b2.a, a.u(UserSearchQuerySetFilters.$serializer.INSTANCE), a.u(var1[2]), a.u(var1[3]), var1[4], n0.a};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQuerySetPayload {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var12: Array<KSerializer> = UserSearchQuerySetPayload.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: Any;
         var var8: UserSearchQuerySetFilters;
         var var9: java.lang.String;
         var var13: Any;
         if (var11.p()) {
            var9 = var11.m(var10, 0);
            var8 = var11.n(var10, 1, UserSearchQuerySetFilters.$serializer.INSTANCE, null) as UserSearchQuerySetFilters;
            var7 = var11.n(var10, 2, var12[2], null) as java.util.List;
            var6 = var11.n(var10, 3, var12[3], null) as java.util.List;
            var13 = var11.y(var10, 4, var12[4], null) as java.util.Map;
            var3 = var11.i(var10, 5);
            var2 = 63;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var9 = null;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var11.o(var10);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var9 = var11.m(var10, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var8 = var11.n(var10, 1, UserSearchQuerySetFilters.$serializer.INSTANCE, var8) as UserSearchQuerySetFilters;
                     var2 |= 2;
                     break;
                  case 2:
                     var7 = var11.n(var10, 2, var12[2], var7) as java.util.List;
                     var2 |= 4;
                     break;
                  case 3:
                     var6 = var11.n(var10, 3, var12[3], var6) as java.util.List;
                     var2 |= 8;
                     break;
                  case 4:
                     var13 = var11.y(var10, 4, var12[4], var13) as java.util.Map;
                     var2 |= 16;
                     break;
                  case 5:
                     var3 = var11.i(var10, 5);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }
         }

         var11.c(var10);
         return new UserSearchQuerySetPayload(var2, var9, var8, (java.util.List)var7, (java.util.List)var6, (java.util.Map)var13, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQuerySetPayload) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchQuerySetPayload.write$Self$user_search_worker_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetPayload> {
         return UserSearchQuerySetPayload.$serializer.INSTANCE;
      }
   }
}
