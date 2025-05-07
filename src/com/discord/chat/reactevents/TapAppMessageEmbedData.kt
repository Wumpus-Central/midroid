package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fa.f
import fa.n
import ia.C0
import ia.G
import ia.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class TapAppMessageEmbedData(messageId: String, actionId: String, appId: String, embedUrl: String) : ReactEvent {
   public final val actionId: String
   public final val appId: String
   public final val embedUrl: String
   public final val messageId: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "actionId");
      q.h(var3, "appId");
      q.h(var4, "embedUrl");
      super();
      this.messageId = var1;
      this.actionId = var2;
      this.appId = var3;
      this.embedUrl = var4;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.actionId;
   }

   public operator fun component3(): String {
      return this.appId;
   }

   public operator fun component4(): String {
      return this.embedUrl;
   }

   public fun copy(messageId: String = var0.messageId, actionId: String = var0.actionId, appId: String = var0.appId, embedUrl: String = var0.embedUrl): TapAppMessageEmbedData {
      q.h(var1, "messageId");
      q.h(var2, "actionId");
      q.h(var3, "appId");
      q.h(var4, "embedUrl");
      return new TapAppMessageEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAppMessageEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.actionId, var1.actionId)) {
            return false;
         } else if (!q.c(this.appId, var1.appId)) {
            return false;
         } else {
            return q.c(this.embedUrl, var1.embedUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.actionId.hashCode()) * 31 + this.appId.hashCode()) * 31 + this.embedUrl.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.messageId;
      val var4: java.lang.String = this.actionId;
      val var2: java.lang.String = this.appId;
      val var3: java.lang.String = this.embedUrl;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapAppMessageEmbedData(messageId=");
      var5.append(var1);
      var5.append(", actionId=");
      var5.append(var4);
      var5.append(", appId=");
      var5.append(var2);
      var5.append(", embedUrl=");
      var5.append(var3);
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
         val var0: TapAppMessageEmbedData.$serializer = new TapAppMessageEmbedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapAppMessageEmbedData", var0, 4);
         var1.l("messageId", false);
         var1.l("actionId", false);
         var1.l("appId", false);
         var1.l("embedUrl", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, C0.a, C0.a, C0.a};
      }

      public open fun deserialize(decoder: Decoder): TapAppMessageEmbedData {
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
            var5 = var10.t(var9, 1);
            var6 = var10.t(var9, 2);
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

            var6 = var5;
            var5 = var12;
            var11 = var6;
         }

         var10.b(var9);
         return new TapAppMessageEmbedData(var2, var7, var5, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapAppMessageEmbedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapAppMessageEmbedData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapAppMessageEmbedData> {
         return TapAppMessageEmbedData.$serializer.INSTANCE;
      }
   }
}
