package com.discord.external_pip.react_events

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
import vk.f
import vk.n
import yk.g0
import yk.h
import yk.g0.a

@f
internal data class OnPipModeChangedEvent(isInPipMode: Boolean) : ReactEvent {
   public final val isInPipMode: Boolean

   init {
      super();
      this.isInPipMode = var1;
   }

   public operator fun component1(): Boolean {
      return this.isInPipMode;
   }

   public fun copy(isInPipMode: Boolean = var0.isInPipMode): OnPipModeChangedEvent {
      return new OnPipModeChangedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPipModeChangedEvent) {
         return false;
      } else {
         return this.isInPipMode == (var1 as OnPipModeChangedEvent).isInPipMode;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.isInPipMode);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.isInPipMode;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnPipModeChangedEvent(isInPipMode=");
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
         val var0: OnPipModeChangedEvent.$serializer = new OnPipModeChangedEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.external_pip.react_events.OnPipModeChangedEvent", var0, 1);
         var1.l("isInPipMode", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{h.a};
      }

      public open fun deserialize(decoder: Decoder): OnPipModeChangedEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         if (var5) {
            var5 = var7.s(var6, 0);
         } else {
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var5 = var7.s(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new OnPipModeChangedEvent(var2, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: OnPipModeChangedEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnPipModeChangedEvent.write$Self$external_pip_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnPipModeChangedEvent> {
         return OnPipModeChangedEvent.$serializer.INSTANCE;
      }
   }
}
