package com.discord.metric_monitor

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f
import t9.s

@f
public data class MetricEvent(name: String, tags: List<String>? = null) : ReactEvent {
   public final val name: String
   public final val tags: List<String>?

   init {
      q.h(var1, "name");
      super();
      this.name = var1;
      this.tags = var2;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public operator fun component2(): List<String>? {
      return this.tags;
   }

   public fun copy(name: String = var0.name, tags: List<String>? = var0.tags): MetricEvent {
      q.h(var1, "name");
      return new MetricEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MetricEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.name, var1.name)) {
            return false;
         } else {
            return q.c(this.tags, var1.tags);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.name.hashCode();
      val var1: Int;
      if (this.tags == null) {
         var1 = 0;
      } else {
         var1 = this.tags.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun serialize(): WritableMap {
      val var2: Pair = s.a("name", this.name);
      var var1: ReadableNativeArray = null;
      if (this.tags != null) {
         var1 = NativeArrayExtensionsKt.toNativeArray$default(this.tags, null, 1, null);
      }

      return NativeMapExtensionsKt.nativeMapOf(s.a("data", NativeMapExtensionsKt.nativeMapOf(var2, s.a("tags", var1))));
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.name;
      val var1: java.util.List = this.tags;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MetricEvent(name=");
      var2.append(var3);
      var2.append(", tags=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MetricEvent> {
         return MetricEvent.$serializer.INSTANCE;
      }
   }
}
