package com.discord.user_search_worker.react_events

import A9.s
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.discord.user_search_worker.UserSearchWorkerResult
import com.facebook.react.bridge.WritableMap
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReturnResultsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReturnResultsEvent.kt\ncom/discord/user_search_worker/react_events/ReturnResultsEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1557#2:34\n1628#2,3:35\n*S KotlinDebug\n*F\n+ 1 ReturnResultsEvent.kt\ncom/discord/user_search_worker/react_events/ReturnResultsEvent\n*L\n22#1:34\n22#1:35,3\n*E\n"])
internal data class ReturnResultsEvent(results: List<UserSearchWorkerResult>, query: String, uuid: String, type: String) : ReactEvent {
   public final val results: List<UserSearchWorkerResult>
   public final val query: String
   public final val uuid: String
   public final val type: String

   init {
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
      return new ReturnResultsEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReturnResultsEvent) {
         return false;
      } else {
         var1 = var1;
         if (!(this.results == var1.results)) {
            return false;
         } else if (!(this.query == var1.query)) {
            return false;
         } else if (!(this.uuid == var1.uuid)) {
            return false;
         } else {
            return this.type == var1.type;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.results.hashCode() * 31 + this.query.hashCode()) * 31 + this.uuid.hashCode()) * 31 + this.type.hashCode();
   }

   public override fun serialize(): WritableMap {
      val var3: Pair = s.a("uuid", this.uuid);
      val var2: Pair = s.a("type", this.type);
      val var4: Pair = s.a("query", this.query);
      val var5: java.util.List = this.results;
      val var1: ArrayList = new ArrayList(CollectionsKt.v(this.results, 10));

      for (UserSearchWorkerResult var6 : var5) {
         var1.add(
            NativeMapExtensionsKt.nativeMapOf(
               s.a("id", var6.getId()), s.a("username", var6.getUsername()), s.a("comparator", var6.getComparator()), s.a("score", var6.getScore())
            )
         );
      }

      return NativeMapExtensionsKt.nativeMapOf(
         var3,
         var2,
         s.a("payload", NativeMapExtensionsKt.nativeMapOf(var4, s.a("results", NativeArrayExtensionsKt.toNativeArray$default(var1, null, 1, null))))
      );
   }

   public override fun toString(): String {
      val var4: java.util.List = this.results;
      val var3: java.lang.String = this.query;
      val var1: java.lang.String = this.uuid;
      val var2: java.lang.String = this.type;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ReturnResultsEvent(results=");
      var5.append(var4);
      var5.append(", query=");
      var5.append(var3);
      var5.append(", uuid=");
      var5.append(var1);
      var5.append(", type=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }
}
