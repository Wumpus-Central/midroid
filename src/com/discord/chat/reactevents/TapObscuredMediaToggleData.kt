package com.discord.chat.reactevents

import ca.f
import ca.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fa.C0
import fa.G
import fa.h
import fa.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TapObscuredMediaToggleData(messageId: String, channelId: String, attachmentId: String, embedId: String, isReveal: Boolean) : ReactEvent {
   public final val attachmentId: String
   public final val channelId: String
   public final val embedId: String
   public final val isReveal: Boolean
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
      this.isReveal = var5;
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

   public operator fun component5(): Boolean {
      return this.isReveal;
   }

   public fun copy(
      messageId: String = var0.messageId,
      channelId: String = var0.channelId,
      attachmentId: String = var0.attachmentId,
      embedId: String = var0.embedId,
      isReveal: Boolean = var0.isReveal
   ): TapObscuredMediaToggleData {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "attachmentId");
      q.h(var4, "embedId");
      return new TapObscuredMediaToggleData(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapObscuredMediaToggleData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.attachmentId, var1.attachmentId)) {
            return false;
         } else if (!q.c(this.embedId, var1.embedId)) {
            return false;
         } else {
            return this.isReveal == var1.isReveal;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.attachmentId.hashCode()) * 31 + this.embedId.hashCode()) * 31
         + java.lang.Boolean.hashCode(this.isReveal);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.messageId;
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.attachmentId;
      val var4: java.lang.String = this.embedId;
      val var1: Boolean = this.isReveal;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapObscuredMediaToggleData(messageId=");
      var5.append(var6);
      var5.append(", channelId=");
      var5.append(var3);
      var5.append(", attachmentId=");
      var5.append(var2);
      var5.append(", embedId=");
      var5.append(var4);
      var5.append(", isReveal=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapObscuredMediaToggleData.$serializer = new TapObscuredMediaToggleData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapObscuredMediaToggleData", var0, 5);
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("attachmentId", false);
         var1.l("embedId", false);
         var1.l("isReveal", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, C0.a, C0.a, C0.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): TapObscuredMediaToggleData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: java.lang.String;
         val var12: java.lang.String;
         if (var11.y()) {
            var8 = var11.t(var10, 0);
            var7 = var11.t(var10, 1);
            var6 = var11.t(var10, 2);
            var12 = var11.t(var10, 3);
            var5 = var11.s(var10, 4);
            var2 = 31;
         } else {
            var8 = null;
            var7 = null;
            var6 = null;
            var var13: java.lang.String = null;
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var5 = var11.s(var10, 4);
                              var2 |= 16;
                           } else {
                              var7 = var11.t(var10, 3);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var11.t(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.t(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var13;
            var12 = var7;
         }

         var11.b(var10);
         return new TapObscuredMediaToggleData(var2, var8, var7, var6, var12, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: TapObscuredMediaToggleData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapObscuredMediaToggleData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapObscuredMediaToggleData> {
         return TapObscuredMediaToggleData.$serializer.INSTANCE;
      }
   }
}
