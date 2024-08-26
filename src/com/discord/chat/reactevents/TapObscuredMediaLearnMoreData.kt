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
public data class TapObscuredMediaLearnMoreData(messageId: String, channelId: String, attachmentId: String, embedId: String) : ReactEvent {
   public final val attachmentId: String
   public final val channelId: String
   public final val embedId: String
   public final val messageId: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      r.h(var3, "attachmentId");
      r.h(var4, "embedId");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.attachmentId = var3;
      this.embedId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapObscuredMediaLearnMoreData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.messageId);
      var1.z(var2, 1, var0.channelId);
      var1.z(var2, 2, var0.attachmentId);
      var1.z(var2, 3, var0.embedId);
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.attachmentId;
   }

   public operator fun component4(): String {
      return this.embedId;
   }

   public fun copy(
      messageId: String = var0.messageId,
      channelId: String = var0.channelId,
      attachmentId: String = var0.attachmentId,
      embedId: String = var0.embedId
   ): TapObscuredMediaLearnMoreData {
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      r.h(var3, "attachmentId");
      r.h(var4, "embedId");
      return new TapObscuredMediaLearnMoreData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapObscuredMediaLearnMoreData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.attachmentId, var1.attachmentId)) {
            return false;
         } else {
            return r.c(this.embedId, var1.embedId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.embedId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.attachmentId;
      val var5: java.lang.String = this.embedId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapObscuredMediaLearnMoreData(messageId=");
      var4.append(var3);
      var4.append(", channelId=");
      var4.append(var2);
      var4.append(", attachmentId=");
      var4.append(var1);
      var4.append(", embedId=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<TapObscuredMediaLearnMoreData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapObscuredMediaLearnMoreData.$serializer = new TapObscuredMediaLearnMoreData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapObscuredMediaLearnMoreData", var0, 4);
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("attachmentId", false);
         var1.l("embedId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapObscuredMediaLearnMoreData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         val var8: java.lang.String;
         val var11: java.lang.String;
         if (var10.p()) {
            var5 = var10.m(var9, 0);
            var8 = var10.m(var9, 1);
            var6 = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
            var2 = 15;
         } else {
            var var7: java.lang.String = null;
            var6 = null;
            var5 = null;
            var var12: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.m(var9, 3);
                           var2 |= 8;
                        } else {
                           var5 = var10.m(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var12;
            var11 = var6;
            var6 = var5;
            var5 = var7;
         }

         var10.c(var9);
         return new TapObscuredMediaLearnMoreData(var2, var5, var8, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapObscuredMediaLearnMoreData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapObscuredMediaLearnMoreData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapObscuredMediaLearnMoreData> {
         return TapObscuredMediaLearnMoreData.$serializer.INSTANCE;
      }
   }
}
