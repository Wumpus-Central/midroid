package com.discord.media.engine.video.events

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
internal data class OnBroadcastThumbnailEvent(imgdata: String) : ReactEvent {
   public final var imgdata: String
      internal set

   init {
      r.h(var1, "imgdata");
      super();
      this.imgdata = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: OnBroadcastThumbnailEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.imgdata);
   }

   public operator fun component1(): String {
      return this.imgdata;
   }

   public fun copy(imgdata: String = var0.imgdata): OnBroadcastThumbnailEvent {
      r.h(var1, "imgdata");
      return new OnBroadcastThumbnailEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnBroadcastThumbnailEvent) {
         return false;
      } else {
         return r.c(this.imgdata, (var1 as OnBroadcastThumbnailEvent).imgdata);
      }
   }

   public override fun hashCode(): Int {
      return this.imgdata.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.imgdata;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnBroadcastThumbnailEvent(imgdata=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<OnBroadcastThumbnailEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnBroadcastThumbnailEvent.$serializer = new OnBroadcastThumbnailEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media.engine.video.events.OnBroadcastThumbnailEvent", var0, 1
         );
         var1.l("imgdata", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a};
      }

      public open fun deserialize(decoder: Decoder): OnBroadcastThumbnailEvent {
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
         return new OnBroadcastThumbnailEvent(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: OnBroadcastThumbnailEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnBroadcastThumbnailEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnBroadcastThumbnailEvent> {
         return OnBroadcastThumbnailEvent.$serializer.INSTANCE;
      }
   }
}
