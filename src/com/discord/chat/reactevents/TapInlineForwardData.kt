package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import lj.w

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

   public open fun serialize(): WritableMap {
      val var2: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{w.a("channelId", this.channelId), w.a("messageId", this.messageId), w.a("targetKind", this.targetKind)}
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
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var9: java.lang.String;
         var var12: Any;
         if (var5) {
            var6 = var11.m(var10, 0);
            var7 = var11.m(var10, 1);
            var9 = var11.m(var10, 2);
            var12 = var11.n(var10, 3, n0.a, null) as Int;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var11.n(var10, 3, n0.a, var12) as Int;
                           var2 |= 8;
                        } else {
                           var6 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var6;
            var6 = var8;
         }

         var11.c(var10);
         return new TapInlineForwardData(var2, var6, var7, var9, (Integer)var12, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInlineForwardData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapInlineForwardData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineForwardData> {
         return TapInlineForwardData.$serializer.INSTANCE;
      }
   }
}
