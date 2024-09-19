package com.discord.bundle_updater.react.events

import al.g0
import al.g0.a
import com.discord.bundle_updater.BundleUpdater
import com.discord.bundle_updater.BundleUpdater.OtaMetric
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import fh.w
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n

@f
internal data class OtaCheckAttemptEvent(metrics: List<OtaMetric>) : ReactEvent {
   public final val metrics: List<OtaMetric>

   init {
      q.h(var1, "metrics");
      super();
      this.metrics = var1;
   }

   public operator fun component1(): List<OtaMetric> {
      return this.metrics;
   }

   public fun copy(metrics: List<OtaMetric> = var0.metrics): OtaCheckAttemptEvent {
      q.h(var1, "metrics");
      return new OtaCheckAttemptEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OtaCheckAttemptEvent) {
         return false;
      } else {
         return q.c(this.metrics, (var1 as OtaCheckAttemptEvent).metrics);
      }
   }

   public override fun hashCode(): Int {
      return this.metrics.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      val var2: java.util.List = this.metrics;
      val var1: ArrayList = new ArrayList(i.u(this.metrics, 10));
      val var3: java.util.Iterator = var2.iterator();

      while (var3.hasNext()) {
         var1.add((var3.next() as BundleUpdater.OtaMetric).toNativeMap());
      }

      return NativeMapExtensionsKt.nativeMapOf(w.a("metrics", NativeArrayExtensionsKt.toNativeArray(var1)));
   }

   public override fun toString(): String {
      val var1: java.util.List = this.metrics;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OtaCheckAttemptEvent(metrics=");
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
         val var0: OtaCheckAttemptEvent.$serializer = new OtaCheckAttemptEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.bundle_updater.react.events.OtaCheckAttemptEvent", var0, 1
         );
         var1.l("metrics", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{OtaCheckAttemptEvent.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): OtaCheckAttemptEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = OtaCheckAttemptEvent.access$get$childSerializers$cp();
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: java.util.List;
         if (var5) {
            var9 = var7.m(var6, 0, var8[0], null) as java.util.List;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.m(var6, 0, var8[0], var9) as java.util.List;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new OtaCheckAttemptEvent(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: OtaCheckAttemptEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OtaCheckAttemptEvent.write$Self$bundle_updater_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OtaCheckAttemptEvent> {
         return OtaCheckAttemptEvent.$serializer.INSTANCE;
      }
   }
}
