package com.discord.media.engine.video.events

import cl.f
import cl.n
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import fl.g0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal class OnReadyEvent : ReactEvent {
   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnReadyEvent.$serializer = new OnReadyEvent.$serializer();
         INSTANCE = var0;
         descriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.OnReadyEvent", var0, 0);
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[0];
      }

      public open fun deserialize(decoder: Decoder): OnReadyEvent {
         q.h(var1, "decoder");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: c = var1.c(var3);
         if (!var4.y()) {
            val var2: Int = var4.x(var3);
            if (var2 != -1) {
               throw new n(var2);
            }
         }

         var4.b(var3);
         return new OnReadyEvent(0, null);
      }

      public open fun serialize(encoder: Encoder, value: OnReadyEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnReadyEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnReadyEvent> {
         return OnReadyEvent.$serializer.INSTANCE;
      }
   }
}
