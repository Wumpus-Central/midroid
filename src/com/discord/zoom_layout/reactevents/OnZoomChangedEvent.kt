package com.discord.zoom_layout.reactevents

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import fl.f0
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
internal data class OnZoomChangedEvent(zoomScale: Float) : ReactEvent {
   public final val zoomScale: Float

   init {
      this.zoomScale = var1;
   }

   public operator fun component1(): Float {
      return this.zoomScale;
   }

   public fun copy(zoomScale: Float = var0.zoomScale): OnZoomChangedEvent {
      return new OnZoomChangedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnZoomChangedEvent) {
         return false;
      } else {
         return java.lang.Float.compare(this.zoomScale, (var1 as OnZoomChangedEvent).zoomScale) == 0;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.zoomScale);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Float = this.zoomScale;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnZoomChangedEvent(zoomScale=");
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
         val var0: OnZoomChangedEvent.$serializer = new OnZoomChangedEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.zoom_layout.reactevents.OnZoomChangedEvent", var0, 1);
         var1.l("zoomScale", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{f0.a};
      }

      public open fun deserialize(decoder: Decoder): OnZoomChangedEvent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         val var6: Boolean = var8.y();
         var var3: Int = 1;
         var var4: Boolean = true;
         var var2: Float;
         if (var6) {
            var2 = var8.G(var7, 0);
         } else {
            var2 = 0.0F;
            var3 = 0;

            while (var4) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     throw new n(var5);
                  }

                  var2 = var8.G(var7, 0);
                  var3 |= 1;
               } else {
                  var4 = false;
               }
            }
         }

         var8.b(var7);
         return new OnZoomChangedEvent(var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: OnZoomChangedEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnZoomChangedEvent.write$Self$zoom_layout_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnZoomChangedEvent> {
         return OnZoomChangedEvent.$serializer.INSTANCE;
      }
   }
}
