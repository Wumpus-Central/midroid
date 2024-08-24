package com.discord.bundle_updater.react.events

import com.discord.bundle_updater.BundleUpdater
import com.discord.bundle_updater.BundleUpdater.OtaMetric
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import java.lang.annotation.Annotation
import java.util.ArrayList
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.c
import uk.f
import uk.n
import xk.f0
import xk.f0.a

@f
internal data class OtaCheckAttemptEvent(metrics: List<OtaMetric>) : ReactEvent {
   public final val metrics: List<OtaMetric>

   init {
      r.h(var1, "metrics");
      super();
      this.metrics = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: OtaCheckAttemptEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new xk.f(new c(h0.b(BundleUpdater.OtaMetric.class), new Annotation[0])), var0.metrics);
   }

   public operator fun component1(): List<OtaMetric> {
      return this.metrics;
   }

   public fun copy(metrics: List<OtaMetric> = var0.metrics): OtaCheckAttemptEvent {
      r.h(var1, "metrics");
      return new OtaCheckAttemptEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OtaCheckAttemptEvent) {
         return false;
      } else {
         return r.c(this.metrics, (var1 as OtaCheckAttemptEvent).metrics);
      }
   }

   public override fun hashCode(): Int {
      return this.metrics.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      val var2: java.util.List = this.metrics;
      val var1: ArrayList = new ArrayList(h.t(this.metrics, 10));
      val var3: java.util.Iterator = var2.iterator();

      while (var3.hasNext()) {
         var1.add((var3.next() as BundleUpdater.OtaMetric).toNativeMap());
      }

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("metrics", NativeArrayExtensionsKt.toNativeArray(var1))});
   }

   public override fun toString(): String {
      val var2: java.util.List = this.metrics;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OtaCheckAttemptEvent(metrics=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<OtaCheckAttemptEvent> {
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
         return new KSerializer[]{new xk.f(new c(h0.b(BundleUpdater.OtaMetric.class), new Annotation[0]))};
      }

      public open fun deserialize(decoder: Decoder): OtaCheckAttemptEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: kotlinx.serialization.encoding.c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, new xk.f(new c(h0.b(BundleUpdater.OtaMetric.class), new Annotation[0])), null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, new xk.f(new c(h0.b(BundleUpdater.OtaMetric.class), new Annotation[0])), var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new OtaCheckAttemptEvent(var2, var8 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: OtaCheckAttemptEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OtaCheckAttemptEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OtaCheckAttemptEvent> {
         return OtaCheckAttemptEvent.$serializer.INSTANCE;
      }
   }
}
