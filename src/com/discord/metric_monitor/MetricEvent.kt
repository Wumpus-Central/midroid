package com.discord.metric_monitor

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.ReadableNativeArray
import com.facebook.react.bridge.WritableMap
import eh.w
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

@f
public data class MetricEvent(name: String, tags: List<String>? = null) : ReactEvent {
   public final val name: String
   public final val tags: List<String>?

   init {
      r.h(var1, "name");
      super();
      this.name = var1;
      this.tags = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: MetricEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.z(var2, 0, var0.name);
      if (var1.A(var2, 1) || var0.tags != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, new xk.f(a2.a), var0.tags);
      }
   }

   public operator fun component1(): String {
      return this.name;
   }

   public operator fun component2(): List<String>? {
      return this.tags;
   }

   public fun copy(name: String = var0.name, tags: List<String>? = var0.tags): MetricEvent {
      r.h(var1, "name");
      return new MetricEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MetricEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.name, var1.name)) {
            return false;
         } else {
            return r.c(this.tags, var1.tags);
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

   public open fun serialize(): WritableMap {
      val var2: Pair = w.a("name", this.name);
      val var3: ReadableNativeArray;
      if (this.tags != null) {
         var3 = NativeArrayExtensionsKt.toNativeArray(this.tags);
      } else {
         var3 = null;
      }

      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("data", NativeMapExtensionsKt.nativeMapOf(new Pair[]{var2, w.a("tags", var3)}))});
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

   public object `$serializer` : f0<MetricEvent> {
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
         return new KSerializer[]{a2.a, a.u(new xk.f(a2.a))};
      }

      public open fun deserialize(decoder: Decoder): MetricEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.n(var6, 1, new xk.f(a2.a), null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.n(var6, 1, new xk.f(a2.a), var5);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new MetricEvent(var2, var8, var5 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: MetricEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MetricEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MetricEvent> {
         return MetricEvent.$serializer.INSTANCE;
      }
   }
}
