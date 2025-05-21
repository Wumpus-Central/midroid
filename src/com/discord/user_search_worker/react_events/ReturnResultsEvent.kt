package com.discord.user_search_worker.react_events

import Q8.s
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.user_search_worker.UserSearchWorkerResult
import com.facebook.react.bridge.WritableMap
import java.util.ArrayList
import kotlin.jvm.internal.q

internal data class ReturnResultsEvent(results: List<UserSearchWorkerResult>, query: String, uuid: String, type: String) : ReactEvent {
   public final val results: List<UserSearchWorkerResult>
   public final val query: String
   public final val uuid: String
   public final val type: String

   init {
      q.h(var1, "results");
      q.h(var2, "query");
      q.h(var3, "uuid");
      q.h(var4, "type");
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
      q.h(var1, "results");
      q.h(var2, "query");
      q.h(var3, "uuid");
      q.h(var4, "type");
      return new ReturnResultsEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReturnResultsEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.results, var1.results)) {
            return false;
         } else if (!q.c(this.query, var1.query)) {
            return false;
         } else if (!q.c(this.uuid, var1.uuid)) {
            return false;
         } else {
            return q.c(this.type, var1.type);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.results.hashCode() * 31 + this.query.hashCode()) * 31 + this.uuid.hashCode()) * 31 + this.type.hashCode();
   }

   public override fun serialize(): WritableMap {
      val var4: Pair = s.a("uuid", this.uuid);
      val var3: Pair = s.a("type", this.type);
      val var1: Pair = s.a("query", this.query);
      val var5: java.util.List = this.results;
      val var2: ArrayList = new ArrayList(i.v(this.results, 10));

      for (UserSearchWorkerResult var7 : var5) {
         var2.add(
            NativeMapExtensionsKt.nativeMapOf(
               s.a("id", var7.getId()), s.a("username", var7.getUsername()), s.a("comparator", var7.getComparator()), s.a("score", var7.getScore())
            )
         );
      }

      return NativeMapExtensionsKt.nativeMapOf(
         var4,
         var3,
         s.a("payload", NativeMapExtensionsKt.nativeMapOf(var1, s.a("results", NativeArrayExtensionsKt.toNativeArray$default(var2, null, 1, null))))
      );
   }

   public override fun toString(): String {
      val var3: java.util.List = this.results;
      val var2: java.lang.String = this.query;
      val var4: java.lang.String = this.uuid;
      val var5: java.lang.String = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ReturnResultsEvent(results=");
      var1.append(var3);
      var1.append(", query=");
      var1.append(var2);
      var1.append(", uuid=");
      var1.append(var4);
      var1.append(", type=");
      var1.append(var5);
      var1.append(")");
      return var1.toString();
   }
}
