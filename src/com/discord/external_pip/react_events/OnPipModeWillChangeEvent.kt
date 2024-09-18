package com.discord.external_pip.react_events

import bl.g0
import bl.g0.a
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
import yk.f
import yk.n

@f
internal class OnPipModeWillChangeEvent : ReactEvent {
   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnPipModeWillChangeEvent.$serializer = new OnPipModeWillChangeEvent.$serializer();
         INSTANCE = var0;
         descriptor = new PluginGeneratedSerialDescriptor("com.discord.external_pip.react_events.OnPipModeWillChangeEvent", var0, 0);
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[0];
      }

      public open fun deserialize(decoder: Decoder): OnPipModeWillChangeEvent {
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
         return new OnPipModeWillChangeEvent(0, null);
      }

      public open fun serialize(encoder: Encoder, value: OnPipModeWillChangeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnPipModeWillChangeEvent.write$Self$external_pip_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnPipModeWillChangeEvent> {
         return OnPipModeWillChangeEvent.$serializer.INSTANCE;
      }
   }
}
