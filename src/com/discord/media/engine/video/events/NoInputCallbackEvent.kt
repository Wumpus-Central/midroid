package com.discord.media.engine.video.events

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
import qn.h
import qn.g0.a

@f
internal data class NoInputCallbackEvent(input: Boolean) : ReactEvent {
   public final val input: Boolean

   init {
      super();
      this.input = var1;
   }

   public operator fun component1(): Boolean {
      return this.input;
   }

   public fun copy(input: Boolean = var0.input): NoInputCallbackEvent {
      return new NoInputCallbackEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NoInputCallbackEvent) {
         return false;
      } else {
         return this.input == (var1 as NoInputCallbackEvent).input;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.input);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.input;
      val var2: StringBuilder = new StringBuilder();
      var2.append("NoInputCallbackEvent(input=");
      var2.append(var1);
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
         val var0: NoInputCallbackEvent.$serializer = new NoInputCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.NoInputCallbackEvent", var0, 1);
         var1.c("input", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{h.a};
      }

      public open fun deserialize(decoder: Decoder): NoInputCallbackEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         if (var5) {
            var5 = var7.C(var6, 0);
         } else {
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var5 = var7.C(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new NoInputCallbackEvent(var2, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: NoInputCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         NoInputCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<NoInputCallbackEvent> {
         return NoInputCallbackEvent.$serializer.INSTANCE;
      }
   }
}
