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
internal data class TapActivityInstanceEmbedData(applicationId: String, channelId: String, instanceId: String, messageId: String) : ReactEvent {
   public final val applicationId: String
   public final val channelId: String
   public final val instanceId: String
   public final val messageId: String

   init {
      q.h(var1, "applicationId");
      q.h(var2, "channelId");
      q.h(var3, "instanceId");
      q.h(var4, "messageId");
      super();
      this.applicationId = var1;
      this.channelId = var2;
      this.instanceId = var3;
      this.messageId = var4;
   }

   public operator fun component1(): String {
      return this.applicationId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.instanceId;
   }

   public operator fun component4(): String {
      return this.messageId;
   }

   public fun copy(
      applicationId: String = var0.applicationId,
      channelId: String = var0.channelId,
      instanceId: String = var0.instanceId,
      messageId: String = var0.messageId
   ): TapActivityInstanceEmbedData {
      q.h(var1, "applicationId");
      q.h(var2, "channelId");
      q.h(var3, "instanceId");
      q.h(var4, "messageId");
      return new TapActivityInstanceEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapActivityInstanceEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.applicationId, var1.applicationId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.instanceId, var1.instanceId)) {
            return false;
         } else {
            return q.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.applicationId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.instanceId.hashCode()) * 31 + this.messageId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.applicationId;
      val var5: java.lang.String = this.channelId;
      val var3: java.lang.String = this.instanceId;
      val var2: java.lang.String = this.messageId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapActivityInstanceEmbedData(applicationId=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var5);
      var4.append(", instanceId=");
      var4.append(var3);
      var4.append(", messageId=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapActivityInstanceEmbedData.$serializer = new TapActivityInstanceEmbedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapActivityInstanceEmbedData", var0, 4);
         var1.l("applicationId", false);
         var1.l("channelId", false);
         var1.l("instanceId", false);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapActivityInstanceEmbedData {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         var var13: java.lang.String;
         if (var10.y()) {
            var13 = var10.t(var9, 0);
            var6 = var10.t(var9, 1);
            val var8: java.lang.String = var10.t(var9, 2);
            var11 = var10.t(var9, 3);
            var2 = 15;
            var7 = var13;
            var13 = var8;
         } else {
            var7 = null;
            var6 = null;
            var13 = null;
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
                           var13 = var10.t(var9, 2);
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

            var6 = var12;
            var11 = var6;
         }

         var10.b(var9);
         return new TapActivityInstanceEmbedData(var2, var7, var6, var13, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapActivityInstanceEmbedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapActivityInstanceEmbedData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapActivityInstanceEmbedData> {
         return TapActivityInstanceEmbedData.$serializer.INSTANCE;
      }
   }
}
