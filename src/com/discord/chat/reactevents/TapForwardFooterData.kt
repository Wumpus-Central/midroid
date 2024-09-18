package com.discord.chat.reactevents

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
import uk.f
import uk.n
import xk.b2
import xk.g0
import xk.n0
import xk.g0.a

@f
public class TapForwardFooterData(snapshotIndex: Int, channelId: String, messageId: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val snapshotIndex: Int

   init {
      q.h(var2, "channelId");
      q.h(var3, "messageId");
      super();
      this.snapshotIndex = var1;
      this.channelId = var2;
      this.messageId = var3;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapForwardFooterData {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         val var4: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         if (var9.y()) {
            val var2: Int = var9.k(var8, 0);
            var6 = var9.t(var8, 1);
            var10 = var9.t(var8, 2);
            var4 = 7;
            var3 = var2;
         } else {
            var6 = null;
            var var11: java.lang.String = null;
            var var13: Boolean = true;
            var3 = 0;
            var var12: Int = 0;

            while (var13) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var6 = var9.t(var8, 2);
                        var12 |= 4;
                     } else {
                        var11 = var9.t(var8, 1);
                        var12 |= 2;
                     }
                  } else {
                     var3 = var9.k(var8, 0);
                     var12 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var10 = var6;
            var6 = var11;
            var4 = var12;
         }

         var9.b(var8);
         return new TapForwardFooterData(var4, var3, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapForwardFooterData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapForwardFooterData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapForwardFooterData> {
         return TapForwardFooterData.$serializer.INSTANCE;
      }
   }
}
