package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import m8.w

@f
public class TapInlineForwardData(channelId: String, messageId: String, targetKind: String, embedIndex: Int?, triggerHaptic: Boolean?, location: String?) :
   ReactEvent {
   private final val channelId: String
   private final val embedIndex: Int?
   private final val location: String?
   private final val messageId: String
   private final val targetKind: String
   private final val triggerHaptic: Boolean?

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "targetKind");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.targetKind = var3;
      this.embedIndex = var4;
      this.triggerHaptic = var5;
      this.location = var6;
   }

   public override fun serialize(): WritableMap {
      val var2: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(
         w.a("channelId", this.channelId),
         w.a("messageId", this.messageId),
         w.a("targetKind", this.targetKind),
         w.a("triggerHaptic", this.triggerHaptic),
         w.a("location", this.location)
      );
      if (this.embedIndex != null) {
         NativeMapExtensionsKt.put(var2, "embedIndex", this.embedIndex);
      }

      return var2;
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapInlineForwardData.$serializer = new TapInlineForwardData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapInlineForwardData", var0, 6);
         var1.l("channelId", false);
         var1.l("messageId", false);
         var1.l("targetKind", false);
         var1.l("embedIndex", false);
         var1.l("triggerHaptic", false);
         var1.l("location", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: C0 = C0.a;
         return new KSerializer[]{C0.a, C0.a, C0.a, a.u(N.a), a.u(h.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapInlineForwardData {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.c(var12);
         val var5: Boolean = var13.y();
         var var10: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var9: java.lang.String;
         var var14: java.lang.String;
         var var17: java.lang.String;
         if (var5) {
            var17 = var13.t(var12, 0);
            var9 = var13.t(var12, 1);
            val var11: java.lang.String = var13.t(var12, 2);
            var6 = var13.v(var12, 3, N.a, null) as Int;
            var7 = var13.v(var12, 4, h.a, null) as java.lang.Boolean;
            var14 = var13.v(var12, 5, C0.a, null) as java.lang.String;
            var2 = 63;
            var10 = var17;
            var17 = var11;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var17 = null;
            var7 = null;
            var6 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var13.x(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.t(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.t(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var17 = var13.t(var12, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var13.v(var12, 3, N.a, var7) as Int;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.v(var12, 4, h.a, var6) as java.lang.Boolean;
                     var2 |= 16;
                     break;
                  case 5:
                     var14 = var13.v(var12, 5, C0.a, var14) as java.lang.String;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var7 = var6;
            var6 = var7;
         }

         var13.b(var12);
         return new TapInlineForwardData(var2, var10, var9, var17, (Integer)var6, (java.lang.Boolean)var7, var14, null);
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
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineForwardData> {
         return TapInlineForwardData.$serializer.INSTANCE;
      }
   }
}
