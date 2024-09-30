package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.b2
import fl.g0
import fl.n0
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
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         val var7: java.lang.String;
         if (var9.y()) {
            var2 = var9.k(var8, 0);
            var7 = var9.t(var8, 1);
            val var10: java.lang.String = var9.t(var8, 2);
            var3 = 7;
            var6 = var10;
         } else {
            var6 = null;
            var var11: java.lang.String = null;
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var6 = var9.t(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var9.k(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var7 = var11;
            var2 = var3;
            var3 = var2;
         }

         var9.b(var8);
         return new TapForwardFooterData(var3, var2, var7, var6, null);
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
