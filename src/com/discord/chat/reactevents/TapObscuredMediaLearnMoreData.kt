package com.discord.chat.reactevents

import bl.b2
import bl.g0
import bl.g0.a
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
import yk.f
import yk.n

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
      val var3: java.lang.String = this.messageId;
      val var2: java.lang.String = this.channelId;
      val var5: java.lang.String = this.attachmentId;
      val var4: java.lang.String = this.embedId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapObscuredMediaLearnMoreData(messageId=");
      var1.append(var3);
      var1.append(", channelId=");
      var1.append(var2);
      var1.append(", attachmentId=");
      var1.append(var5);
      var1.append(", embedId=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
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
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         if (var10.y()) {
            var7 = var10.t(var9, 0);
            var6 = var10.t(var9, 1);
            var5 = var10.t(var9, 2);
            var11 = var10.t(var9, 3);
            var2 = 15;
         } else {
            var7 = null;
            var6 = null;
            var5 = null;
            var var12: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.t(var9, 3);
                           var2 |= 8;
                        } else {
                           var5 = var10.t(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var11 = var6;
            var6 = var12;
         }

         var10.b(var9);
         return new TapObscuredMediaLearnMoreData(var2, var7, var6, var5, var11, null);
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
