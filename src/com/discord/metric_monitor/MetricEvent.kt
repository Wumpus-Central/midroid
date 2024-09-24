package com.discord.metric_monitor

import cl.f
import cl.n
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableMap
import dl.a
import fl.b2
import fl.g0
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var2: Pair = w.a("name", this.name);
      val var3: ReadableNativeArray;
      if (this.tags != null) {
         var3 = NativeArrayExtensionsKt.toNativeArray(this.tags);
      } else {
         var3 = null;
      }

      return NativeMapExtensionsKt.nativeMapOf(w.a("data", NativeMapExtensionsKt.nativeMapOf(var2, w.a("tags", var3))));
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.name;
      val var3: java.util.List = this.tags;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MetricEvent(name=");
      var2.append(var1);
      var2.append(", tags=");
      var2.append(var3);
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
         val var0: MetricEvent.$serializer = new MetricEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.metric_monitor.MetricEvent", var0, 2);
         var1.l("name", false);
         var1.l("tags", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, a.u(MetricEvent.access$get$childSerializers$cp()[1])};
      }

      public open fun deserialize(decoder: Decoder): MetricEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = MetricEvent.access$get$childSerializers$cp();
         var var2: Int;
         var var5: java.util.List;
         var var9: java.lang.String;
         if (var7.y()) {
            var9 = var7.t(var6, 0);
            var5 = var7.v(var6, 1, var8[1], null) as java.util.List;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var5 = null;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.v(var6, 1, var8[1], var5) as java.util.List;
                     var2 |= 2;
                  } else {
                     var9 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new MetricEvent(var2, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: MetricEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MetricEvent.write$Self$metric_monitor_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MetricEvent> {
         return MetricEvent.$serializer.INSTANCE;
      }
   }
}
