package com.discord.chat.reactevents

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
internal data class TapActivityBookmarkEmbedData(applicationId: String, channelId: String) : ReactEvent {
   public final val applicationId: String
   public final val channelId: String

   init {
      r.h(var1, "applicationId");
      r.h(var2, "channelId");
      super();
      this.applicationId = var1;
      this.channelId = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: TapActivityBookmarkEmbedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.applicationId);
      var1.z(var2, 1, var0.channelId);
   }

   public operator fun component1(): String {
      return this.applicationId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public fun copy(applicationId: String = var0.applicationId, channelId: String = var0.channelId): TapActivityBookmarkEmbedData {
      r.h(var1, "applicationId");
      r.h(var2, "channelId");
      return new TapActivityBookmarkEmbedData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapActivityBookmarkEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.applicationId, var1.applicationId)) {
            return false;
         } else {
            return r.c(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.applicationId.hashCode() * 31 + this.channelId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.applicationId;
      val var2: java.lang.String = this.channelId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapActivityBookmarkEmbedData(applicationId=");
      var1.append(var3);
      var1.append(", channelId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<TapActivityBookmarkEmbedData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapActivityBookmarkEmbedData.$serializer = new TapActivityBookmarkEmbedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapActivityBookmarkEmbedData", var0, 2);
         var1.l("applicationId", false);
         var1.l("channelId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapActivityBookmarkEmbedData {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapActivityBookmarkEmbedData(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: TapActivityBookmarkEmbedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapActivityBookmarkEmbedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapActivityBookmarkEmbedData> {
         return TapActivityBookmarkEmbedData.$serializer.INSTANCE;
      }
   }
}
