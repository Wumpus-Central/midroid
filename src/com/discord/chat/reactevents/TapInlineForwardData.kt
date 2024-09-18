package com.discord.chat.reactevents

import bl.b2
import bl.g0
import bl.n0
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import gh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

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
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var11: Any;
         if (var5) {
            var8 = var10.t(var9, 0);
            var7 = var10.t(var9, 1);
            var6 = var10.t(var9, 2);
            var11 = var10.v(var9, 3, n0.a, null) as Int;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var11 = var10.v(var9, 3, n0.a, var11) as Int;
                           var2 |= 8;
                        } else {
                           var6 = var10.t(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new TapInlineForwardData(var2, var8, var7, var6, (Integer)var11, null);
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
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineForwardData> {
         return TapInlineForwardData.$serializer.INSTANCE;
      }
   }
}
