package com.discord.sticker_picker.react_events

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
import xk.a2
import xk.f0
import xk.f0.a

@f
internal data class OnPressStickerEvent(stickerId: String) : ReactEvent {
   public final val stickerId: String

   init {
      r.h(var1, "stickerId");
      super();
      this.stickerId = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: OnPressStickerEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.stickerId);
   }

   public operator fun component1(): String {
      return this.stickerId;
   }

   public fun copy(stickerId: String = var0.stickerId): OnPressStickerEvent {
      r.h(var1, "stickerId");
      return new OnPressStickerEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPressStickerEvent) {
         return false;
      } else {
         return r.c(this.stickerId, (var1 as OnPressStickerEvent).stickerId);
      }
   }

   public override fun hashCode(): Int {
      return this.stickerId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.stickerId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnPressStickerEvent(stickerId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<OnPressStickerEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnPressStickerEvent.$serializer = new OnPressStickerEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.sticker_picker.react_events.OnPressStickerEvent", var0, 1);
         var1.l("stickerId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a};
      }

      public open fun deserialize(decoder: Decoder): OnPressStickerEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.m(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new OnPressStickerEvent(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: OnPressStickerEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnPressStickerEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnPressStickerEvent> {
         return OnPressStickerEvent.$serializer.INSTANCE;
      }
   }
}
