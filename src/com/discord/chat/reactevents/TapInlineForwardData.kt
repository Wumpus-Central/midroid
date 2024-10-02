package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import dl.a
import fl.b2
import fl.g0
import fl.n0
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public class TapInlineForwardData(channelId: String, messageId: String, targetKind: String, embedIndex: Int?) : ReactEvent {
   private final val channelId: String
   private final val embedIndex: Int?
   private final val messageId: String
   private final val targetKind: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "targetKind");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.targetKind = var3;
      this.embedIndex = var4;
   }

   public override fun serialize(): WritableMap {
      val var2: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(
         w.a("channelId", this.channelId), w.a("messageId", this.messageId), w.a("targetKind", this.targetKind)
      );
      if (this.embedIndex != null) {
         NativeMapExtensionsKt.put(var2, "embedIndex", this.embedIndex);
      }

      return var2;
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapInlineForwardData.$serializer = new TapInlineForwardData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapInlineForwardData", var0, 4);
         var1.l("channelId", false);
         var1.l("messageId", false);
         var1.l("targetKind", false);
         var1.l("embedIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, a.u(n0.a)};
      }

      public open fun deserialize(decoder: Decoder): TapInlineForwardData {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var5: Boolean = var12.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         val var9: java.lang.String;
         val var10: java.lang.String;
         var var13: Any;
         if (var5) {
            var6 = var12.t(var11, 0);
            var10 = var12.t(var11, 1);
            val var7: java.lang.String = var12.t(var11, 2);
            var13 = var12.v(var11, 3, n0.a, null) as Int;
            var2 = 15;
            var9 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var15: java.lang.String = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var12.v(var11, 3, n0.a, var13) as Int;
                           var2 |= 8;
                        } else {
                           var6 = var12.t(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var15 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var12.t(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var6;
            var10 = var15;
            var6 = var8;
         }

         var12.b(var11);
         return new TapInlineForwardData(var2, var6, var10, var9, (Integer)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInlineForwardData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapInlineForwardData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineForwardData> {
         return TapInlineForwardData.$serializer.INSTANCE;
      }
   }
}
