package com.discord.chat.reactevents

import ch.w
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.b2
import xk.g0
import xk.g0.a

@f
public data class TapTimestampEvent(timestamp: String) : ReactEvent {
   public final val timestamp: String

   init {
      q.h(var1, "timestamp");
      super();
      this.timestamp = var1;
   }

   public operator fun component1(): String {
      return this.timestamp;
   }

   public fun copy(timestamp: String = var0.timestamp): TapTimestampEvent {
      q.h(var1, "timestamp");
      return new TapTimestampEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapTimestampEvent) {
         return false;
      } else {
         return q.c(this.timestamp, (var1 as TapTimestampEvent).timestamp);
      }
   }

   public override fun hashCode(): Int {
      return this.timestamp.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("node", NativeMapExtensionsKt.nativeMapOf(w.a("full", this.timestamp))));
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.timestamp;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapTimestampEvent(timestamp=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapTimestampEvent.$serializer = new TapTimestampEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapTimestampEvent", var0, 1);
         var1.l("timestamp", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapTimestampEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.t(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.t(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new TapTimestampEvent(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: TapTimestampEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapTimestampEvent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapTimestampEvent> {
         return TapTimestampEvent.$serializer.INSTANCE;
      }
   }
}
