package com.discord.external_pip.react_events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.g0.a

@f
internal class OnPipModeWillChangeEvent : ReactEvent {
   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
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
         val var4: c = var1.b(var3);
         if (!var4.p()) {
            val var2: Int = var4.o(var3);
            if (var2 != -1) {
               throw new n(var2);
            }
         }

         var4.c(var3);
         return new OnPipModeWillChangeEvent(0, null);
      }

      public open fun serialize(encoder: Encoder, value: OnPipModeWillChangeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnPipModeWillChangeEvent.write$Self$external_pip_release(var2, var4, var3);
         var4.c(var3);
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
