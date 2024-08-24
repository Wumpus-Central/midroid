package com.discord.user_search_worker

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0
import xk.r0
import xk.x

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

   init {
      r.h(var1, "query");
      r.h(var5, "boosters");
      super();
      this.query = var1;
      this.filters = var2;
      this.blacklist = var3;
      this.whitelist = var4;
      this.boosters = var5;
      this.limit = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: UserSearchQuerySetPayload, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.query);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.filters == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, UserSearchQuerySetFilters.$serializer.INSTANCE, var0.filters);
      }

      if (!var1.A(var2, 2) && var0.blacklist == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, new xk.f(a2.a), var0.blacklist);
      }

      label32: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.whitelist == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, new xk.f(a2.a), var0.whitelist);
      }

      var1.y(var2, 4, new r0(a2.a, x.a), var0.boosters);
      var1.w(var2, 5, var0.limit);
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
      r.h(var1, "query");
      r.h(var5, "boosters");
      return new UserSearchQuerySetPayload(var1, var2, var3, var4, var5, var6);
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
      val var2: java.lang.String = this.query;
      val var5: UserSearchQuerySetFilters = this.filters;
      val var7: java.util.List = this.blacklist;
      val var3: java.util.List = this.whitelist;
      val var4: java.util.Map = this.boosters;
      val var1: Int = this.limit;
      val var6: StringBuilder = new StringBuilder();
      var6.append("UserSearchQuerySetPayload(query=");
      var6.append(var2);
      var6.append(", filters=");
      var6.append(var5);
      var6.append(", blacklist=");
      var6.append(var7);
      var6.append(", whitelist=");
      var6.append(var3);
      var6.append(", boosters=");
      var6.append(var4);
      var6.append(", limit=");
      var6.append(var1);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<UserSearchQuerySetPayload> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UserSearchQuerySetPayload.$serializer = new UserSearchQuerySetPayload.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetPayload", var0, 6);
         var1.l("query", false);
         var1.l("filters", true);
         var1.l("blacklist", true);
         var1.l("whitelist", true);
         var1.l("boosters", false);
         var1.l("limit", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, a.u(UserSearchQuerySetFilters.$serializer.INSTANCE), a.u(new xk.f(var1)), a.u(new xk.f(var1)), new r0(var1, x.a), m0.a};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQuerySetPayload {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var7: Boolean = var13.p();
         var var4: Byte = 5;
         var var2: Int;
         var var3: Int;
         var var8: Any;
         var var9: Any;
         var var10: java.lang.String;
         var var11: Any;
         var var15: Any;
         if (var7) {
            var10 = var13.m(var12, 0);
            var11 = var13.n(var12, 1, UserSearchQuerySetFilters.$serializer.INSTANCE, null);
            var15 = a2.a;
            var9 = var13.n(var12, 2, new xk.f(a2.a), null);
            var8 = var13.n(var12, 3, new xk.f((KSerializer)var15), null);
            var15 = var13.y(var12, 4, new r0((KSerializer)var15, x.a), null);
            var2 = var13.i(var12, 5);
            var3 = 63;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var10 = null;
            var11 = null;
            var9 = null;
            var8 = null;
            var15 = null;
            var2 = 0;

            while (var5) {
               label29: {
                  val var6: Int = var13.o(var12);
                  switch (var6) {
                     case -1:
                        var5 = false;
                        break;
                     case 0:
                        var10 = var13.m(var12, 0);
                        var2 |= 1;
                        break;
                     case 1:
                        var11 = var13.n(var12, 1, UserSearchQuerySetFilters.$serializer.INSTANCE, var11);
                        var2 |= 2;
                        var4 = 5;
                        continue;
                     case 2:
                        var9 = var13.n(var12, 2, new xk.f(a2.a), var9);
                        var2 |= 4;
                        break label29;
                     case 3:
                        var8 = var13.n(var12, 3, new xk.f(a2.a), var8);
                        var2 |= 8;
                        break label29;
                     case 4:
                        var15 = var13.y(var12, 4, new r0(a2.a, x.a), var15);
                        var2 |= 16;
                        break label29;
                     case 5:
                        var3 = var13.i(var12, var4);
                        var2 |= 32;
                        continue;
                     default:
                        throw new n(var6);
                  }

                  var4 = 5;
                  continue;
               }

               var4 = 5;
            }

            var3 = var2;
            var2 = var3;
         }

         var13.c(var12);
         return new UserSearchQuerySetPayload(
            var3, var10, var11 as UserSearchQuerySetFilters, var9 as java.util.List, var8 as java.util.List, var15 as java.util.Map, var2, null
         );
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQuerySetPayload) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchQuerySetPayload.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetPayload> {
         return UserSearchQuerySetPayload.$serializer.INSTANCE;
      }
   }
}
