package com.discord.user_search_worker.react_events

import A9.s
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.user_search_worker.UserSearchWorkerResult
import com.facebook.react.bridge.WritableMap
import java.util.ArrayList
import kotlin.jvm.internal.r

internal data class ReturnResultsEvent(results: List<UserSearchWorkerResult>, query: String, uuid: String, type: String) : ReactEvent {
   public final val results: List<UserSearchWorkerResult>
   public final val query: String
   public final val uuid: String
   public final val type: String

   init {
      r.h(var1, "results");
      r.h(var2, "query");
      r.h(var3, "uuid");
      r.h(var4, "type");
      super();
      this.results = var1;
      this.query = var2;
      this.uuid = var3;
      this.type = var4;
   }

   public operator fun component1(): List<UserSearchWorkerResult> {
      return this.results;
   }

   public operator fun component2(): String {
      return this.query;
   }

   public operator fun component3(): String {
      return this.uuid;
   }

   public operator fun component4(): String {
      return this.type;
   }

   public fun copy(results: List<UserSearchWorkerResult> = var0.results, query: String = var0.query, uuid: String = var0.uuid, type: String = var0.type): ReturnResultsEvent {
      r.h(var1, "results");
      r.h(var2, "query");
      r.h(var3, "uuid");
      r.h(var4, "type");
      return new ReturnResultsEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReturnResultsEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.results, var1.results)) {
            return false;
         } else if (!r.c(this.query, var1.query)) {
            return false;
         } else if (!r.c(this.uuid, var1.uuid)) {
            return false;
         } else {
            return r.c(this.type, var1.type);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.results.hashCode() * 31 + this.query.hashCode()) * 31 + this.uuid.hashCode()) * 31 + this.type.hashCode();
   }

   public override fun serialize(): WritableMap {
      val var1: Pair = s.a("uuid", this.uuid);
      val var4: Pair = s.a("type", this.type);
      val var2: Pair = s.a("query", this.query);
      val var5: java.util.List = this.results;
      val var3: ArrayList = new ArrayList(i.v(this.results, 10));

      for (UserSearchWorkerResult var7 : var5) {
         var3.add(
            NativeMapExtensionsKt.nativeMapOf(
               s.a("id", var7.getId()), s.a("username", var7.getUsername()), s.a("comparator", var7.getComparator()), s.a("score", var7.getScore())
            )
         );
      }

      return NativeMapExtensionsKt.nativeMapOf(
         var1,
         var4,
         s.a("payload", NativeMapExtensionsKt.nativeMapOf(var2, s.a("results", NativeArrayExtensionsKt.toNativeArray$default(var3, null, 1, null))))
      );
   }

   public override fun toString(): String {
      val var4: java.util.List = this.results;
      val var1: java.lang.String = this.query;
      val var2: java.lang.String = this.uuid;
      val var3: java.lang.String = this.type;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ReturnResultsEvent(results=");
      var5.append(var4);
      var5.append(", query=");
      var5.append(var1);
      var5.append(", uuid=");
      var5.append(var2);
      var5.append(", type=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }
}
