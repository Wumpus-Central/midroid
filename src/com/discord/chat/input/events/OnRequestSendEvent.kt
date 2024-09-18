package com.discord.chat.input.events

import bl.g0
import bl.g0.a
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
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
internal class OnRequestSendEvent : ReactEvent {
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
         val var0: OnRequestSendEvent.$serializer = new OnRequestSendEvent.$serializer();
         INSTANCE = var0;
         descriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnRequestSendEvent", var0, 0);
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[0];
      }

      public open fun deserialize(decoder: Decoder): OnRequestSendEvent {
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
         return new OnRequestSendEvent(0, null);
      }

      public open fun serialize(encoder: Encoder, value: OnRequestSendEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnRequestSendEvent.write$Self$chat_input_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnRequestSendEvent> {
         return OnRequestSendEvent.$serializer.INSTANCE;
      }
   }
}
