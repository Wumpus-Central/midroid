package com.discord.media.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
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
import xk.f0
import xk.f0.a

@f
internal class PhotoLibraryChangedEvent : ReactEvent {
   @JvmStatic
   public fun `write$Self`(self: PhotoLibraryChangedEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public object `$serializer` : f0<PhotoLibraryChangedEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PhotoLibraryChangedEvent.$serializer = new PhotoLibraryChangedEvent.$serializer();
         INSTANCE = var0;
         descriptor = new PluginGeneratedSerialDescriptor("com.discord.media.react.events.PhotoLibraryChangedEvent", var0, 0);
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[0];
      }

      public open fun deserialize(decoder: Decoder): PhotoLibraryChangedEvent {
         r.h(var1, "decoder");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: c = var1.b(var3);
         if (!var4.p()) {
            for (int var2 = 1; var2; var2 = 0) {
               var2 = var4.o(var3);
               if (var2 != -1) {
                  throw new n(var2);
               }
            }
         }

         var4.c(var3);
         return new PhotoLibraryChangedEvent(0, null);
      }

      public open fun serialize(encoder: Encoder, value: PhotoLibraryChangedEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PhotoLibraryChangedEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PhotoLibraryChangedEvent> {
         return PhotoLibraryChangedEvent.$serializer.INSTANCE;
      }
   }
}
