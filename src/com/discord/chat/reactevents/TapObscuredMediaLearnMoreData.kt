package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import il.b2
import il.g0
import il.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TapObscuredMediaLearnMoreData(messageId: String, channelId: String, attachmentId: String, embedId: String) : ReactEvent {
   public final val attachmentId: String
   public final val channelId: String
   public final val embedId: String
   public final val messageId: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "attachmentId");
      q.h(var4, "embedId");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.attachmentId = var3;
      this.embedId = var4;
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
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "attachmentId");
      q.h(var4, "embedId");
      return new TapObscuredMediaLearnMoreData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapObscuredMediaLearnMoreData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.attachmentId, var1.attachmentId)) {
            return false;
         } else {
            return q.c(this.embedId, var1.embedId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.embedId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.messageId;
      val var4: java.lang.String = this.channelId;
      val var1: java.lang.String = this.attachmentId;
      val var3: java.lang.String = this.embedId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapObscuredMediaLearnMoreData(messageId=");
      var5.append(var2);
      var5.append(", channelId=");
      var5.append(var4);
      var5.append(", attachmentId=");
      var5.append(var1);
      var5.append(", embedId=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapObscuredMediaLearnMoreData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         val var8: java.lang.String;
         val var12: java.lang.String;
         if (var11.y()) {
            var5 = var11.t(var10, 0);
            var6 = var11.t(var10, 1);
            var8 = var11.t(var10, 2);
            var12 = var11.t(var10, 3);
            var2 = 15;
         } else {
            var var7: java.lang.String = null;
            var6 = null;
            var5 = null;
            var var13: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var11.t(var10, 3);
                           var2 |= 8;
                        } else {
                           var5 = var11.t(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var11.t(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var12 = var6;
            var8 = var5;
            var6 = var13;
            var5 = var7;
         }

         var11.b(var10);
         return new TapObscuredMediaLearnMoreData(var2, var5, var6, var8, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: TapObscuredMediaLearnMoreData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapObscuredMediaLearnMoreData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapObscuredMediaLearnMoreData> {
         return TapObscuredMediaLearnMoreData.$serializer.INSTANCE;
      }
   }
}
