package com.discord.user_search_worker.react_events

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.user_search_worker.UserSearchWorkerResult
import com.facebook.react.bridge.WritableMap
import java.util.ArrayList
import kotlin.jvm.internal.q
import lj.w

internal data class ReturnResultsEvent(results: List<UserSearchWorkerResult>, query: String, uuid: String, type: String) : ReactEvent {
   public final val query: String
   public final val results: List<UserSearchWorkerResult>
   public final val type: String
   public final val uuid: String

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
      val var1: Pair = w.a("uuid", this.uuid);
      val var4: Pair = w.a("type", this.type);
      val var2: Pair = w.a("query", this.query);
      val var5: java.lang.Iterable = this.results;
      val var3: ArrayList = new ArrayList(i.u(this.results, 10));

      for (UserSearchWorkerResult var6 : var5) {
         var3.add(
            NativeMapExtensionsKt.nativeMapOf(
               w.a("id", var6.getId()), w.a("username", var6.getUsername()), w.a("comparator", var6.getComparator()), w.a("score", var6.getScore())
            )
         );
      }

      return NativeMapExtensionsKt.nativeMapOf(
         var1, var4, w.a("payload", NativeMapExtensionsKt.nativeMapOf(var2, w.a("results", NativeArrayExtensionsKt.toNativeArray(var3))))
      );
   }

   public override fun toString(): String {
      val var5: java.util.List = this.results;
      val var3: java.lang.String = this.query;
      val var4: java.lang.String = this.uuid;
      val var1: java.lang.String = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ReturnResultsEvent(results=");
      var2.append(var5);
      var2.append(", query=");
      var2.append(var3);
      var2.append(", uuid=");
      var2.append(var4);
      var2.append(", type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
