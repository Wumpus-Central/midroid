package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import eh.w
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
import vk.a
import xk.a2
import xk.f0
import xk.m0

@f
public class TapInlineForwardData(channelId: String, messageId: String, targetKind: String, embedIndex: Int?) : ReactEvent {
   private final val channelId: String
   private final val embedIndex: Int?
   private final val messageId: String
   private final val targetKind: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "targetKind");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.targetKind = var3;
      this.embedIndex = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapInlineForwardData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.channelId);
      var1.z(var2, 1, var0.messageId);
      var1.z(var2, 2, var0.targetKind);
      var1.m(var2, 3, m0.a, var0.embedIndex);
   }

   public open fun serialize(): WritableMap {
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{w.a("channelId", this.channelId), w.a("messageId", this.messageId), w.a("targetKind", this.targetKind)}
      );
      if (this.embedIndex != null) {
         NativeMapExtensionsKt.put(var1, "embedIndex", this.embedIndex);
      }

      return var1;
   }

   public object `$serializer` : f0<TapInlineForwardData> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a, a.u(m0.a)};
      }

      public open fun deserialize(decoder: Decoder): TapInlineForwardData {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: Any;
         val var12: java.lang.String;
         if (var5) {
            var8 = var11.m(var10, 0);
            var6 = var11.m(var10, 1);
            var12 = var11.m(var10, 2);
            var7 = var11.n(var10, 3, m0.a, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var var13: Any = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.n(var10, 3, m0.a, var13);
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

            var12 = var6;
            var6 = (java.lang.String)var7;
            var7 = var13;
         }

         var11.c(var10);
         return new TapInlineForwardData(var2, var8, var6, var12, var7 as Integer, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInlineForwardData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapInlineForwardData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineForwardData> {
         return TapInlineForwardData.$serializer.INSTANCE;
      }
   }
}
