package com.discord.bundle_updater.react.events

import A9.s
import com.discord.bundle_updater.BundleUpdater
import com.discord.bundle_updater.BundleUpdater.OtaMetric
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import mb.g

@g
@SourceDebugExtension(["SMAP\nOtaCheckAttemptEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaCheckAttemptEvent.kt\ncom/discord/bundle_updater/react/events/OtaCheckAttemptEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1557#2:30\n1628#2,3:31\n*S KotlinDebug\n*F\n+ 1 OtaCheckAttemptEvent.kt\ncom/discord/bundle_updater/react/events/OtaCheckAttemptEvent\n*L\n26#1:30\n26#1:31,3\n*E\n"])
internal data class OtaCheckAttemptEvent(metrics: List<OtaMetric>) : ReactEvent {
   public final val metrics: List<OtaMetric>

   init {
      super();
      this.metrics = var1;
   }

   public operator fun component1(): List<OtaMetric> {
      return this.metrics;
   }

   public fun copy(metrics: List<OtaMetric> = var0.metrics): OtaCheckAttemptEvent {
      return new OtaCheckAttemptEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OtaCheckAttemptEvent) {
         return false;
      } else {
         return this.metrics == (var1 as OtaCheckAttemptEvent).metrics;
      }
   }

   public override fun hashCode(): Int {
      return this.metrics.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      val var2: java.util.List = this.metrics;
      val var1: ArrayList = new ArrayList(CollectionsKt.v(this.metrics, 10));
      val var3: java.util.Iterator = var2.iterator();

      while (var3.hasNext()) {
         var1.add((var3.next() as BundleUpdater.OtaMetric).toNativeMap());
      }

      return NativeMapExtensionsKt.nativeMapOf(s.a("metrics", NativeArrayExtensionsKt.toNativeArray$default(var1, null, 1, null)));
   }

   public override fun toString(): String {
      val var1: java.util.List = this.metrics;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OtaCheckAttemptEvent(metrics=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OtaCheckAttemptEvent> {
         return OtaCheckAttemptEvent.$serializer.INSTANCE;
      }
   }
}
