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
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
internal data class CompressionProgressEvent(uri: String, progress: Int) : ReactEvent {
   public final val progress: Int
   public final val uri: String

   init {
      r.h(var1, "uri");
      super();
      this.uri = var1;
      this.progress = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: CompressionProgressEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.uri);
      var1.w(var2, 1, var0.progress);
   }

   public operator fun component1(): String {
      return this.uri;
   }

   public operator fun component2(): Int {
      return this.progress;
   }

   public fun copy(uri: String = var0.uri, progress: Int = var0.progress): CompressionProgressEvent {
      r.h(var1, "uri");
      return new CompressionProgressEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CompressionProgressEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.uri, var1.uri)) {
            return false;
         } else {
            return this.progress == var1.progress;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uri.hashCode() * 31 + Integer.hashCode(this.progress);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.uri;
      val var1: Int = this.progress;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CompressionProgressEvent(uri=");
      var2.append(var3);
      var2.append(", progress=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<CompressionProgressEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: CompressionProgressEvent.$serializer = new CompressionProgressEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.react.events.CompressionProgressEvent", var0, 2);
         var1.l("uri", false);
         var1.l("progress", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): CompressionProgressEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var3 = var7.i(var6, 1);
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.o(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var3 = var7.i(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.c(var6);
         return new CompressionProgressEvent(var2, var8, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: CompressionProgressEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CompressionProgressEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CompressionProgressEvent> {
         return CompressionProgressEvent.$serializer.INSTANCE;
      }
   }
}
