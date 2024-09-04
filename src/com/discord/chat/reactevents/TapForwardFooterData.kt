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
import xk.m0
import xk.f0.a

@f
public class TapForwardFooterData(snapshotIndex: Int, channelId: String, messageId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val snapshotIndex: Int

   init {
      r.h(var2, "channelId");
      r.h(var3, "messageId");
      super();
      this.snapshotIndex = var1;
      this.channelId = var2;
      this.messageId = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: TapForwardFooterData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.snapshotIndex);
      var1.z(var2, 1, var0.channelId);
      var1.z(var2, 2, var0.messageId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public object `$serializer` : f0<TapForwardFooterData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapForwardFooterData.$serializer = new TapForwardFooterData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapForwardFooterData", var0, 3);
         var1.l("snapshotIndex", false);
         var1.l("channelId", false);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapForwardFooterData {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         if (var9.p()) {
            var3 = var9.i(var8, 0);
            var6 = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
         } else {
            var6 = null;
            var var11: java.lang.String = null;
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var6 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var9.i(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var10 = var6;
            var6 = var11;
         }

         var9.c(var8);
         return new TapForwardFooterData(var2, var3, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapForwardFooterData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapForwardFooterData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapForwardFooterData> {
         return TapForwardFooterData.$serializer.INSTANCE;
      }
   }
}
