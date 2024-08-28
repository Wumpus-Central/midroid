package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.f0
import gn.g0
import gn.n0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class OnVoiceEvent(level: Float, speaking: Int) : ReactEvent {
   public final val level: Float
   public final val speaking: Int

   init {
      this.level = var1;
      this.speaking = var2;
   }

   public operator fun component1(): Float {
      return this.level;
   }

   public operator fun component2(): Int {
      return this.speaking;
   }

   public fun copy(level: Float = var0.level, speaking: Int = var0.speaking): OnVoiceEvent {
      return new OnVoiceEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnVoiceEvent) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.level, var1.level) != 0) {
            return false;
         } else {
            return this.speaking == var1.speaking;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.level) * 31 + Integer.hashCode(this.speaking);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Float = this.level;
      val var2: Int = this.speaking;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnVoiceEvent(level=");
      var3.append(var1);
      var3.append(", speaking=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnVoiceEvent.$serializer = new OnVoiceEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.OnVoiceEvent", var0, 2);
         var1.l("level", false);
         var1.l("speaking", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{f0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): OnVoiceEvent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Float;
         var var3: Int;
         var var4: Int;
         if (var8.p()) {
            var2 = var8.u(var7, 0);
            var4 = var8.i(var7, 1);
            var3 = 3;
         } else {
            var2 = 0.0F;
            var var5: Boolean = true;
            var4 = 0;
            var3 = 0;

            while (var5) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var4 = var8.i(var7, 1);
                     var3 |= 2;
                  } else {
                     var2 = var8.u(var7, 0);
                     var3 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var8.c(var7);
         return new OnVoiceEvent(var3, var2, var4, null);
      }

      public open fun serialize(encoder: Encoder, value: OnVoiceEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnVoiceEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnVoiceEvent> {
         return OnVoiceEvent.$serializer.INSTANCE;
      }
   }
}
