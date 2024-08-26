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
internal data class TapActivityInstanceEmbedData(applicationId: String, channelId: String, instanceId: String, messageId: String) : ReactEvent {
   public final val applicationId: String
   public final val channelId: String
   public final val instanceId: String
   public final val messageId: String

   init {
      r.h(var1, "applicationId");
      r.h(var2, "channelId");
      r.h(var3, "instanceId");
      r.h(var4, "messageId");
      super();
      this.applicationId = var1;
      this.channelId = var2;
      this.instanceId = var3;
      this.messageId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapActivityInstanceEmbedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.applicationId);
      var1.z(var2, 1, var0.channelId);
      var1.z(var2, 2, var0.instanceId);
      var1.z(var2, 3, var0.messageId);
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
      r.h(var1, "applicationId");
      r.h(var2, "channelId");
      r.h(var3, "instanceId");
      r.h(var4, "messageId");
      return new TapActivityInstanceEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapActivityInstanceEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.applicationId, var1.applicationId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.instanceId, var1.instanceId)) {
            return false;
         } else {
            return r.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.applicationId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.instanceId.hashCode()) * 31 + this.messageId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.applicationId;
      val var3: java.lang.String = this.channelId;
      val var4: java.lang.String = this.instanceId;
      val var2: java.lang.String = this.messageId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapActivityInstanceEmbedData(applicationId=");
      var5.append(var1);
      var5.append(", channelId=");
      var5.append(var3);
      var5.append(", instanceId=");
      var5.append(var4);
      var5.append(", messageId=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<TapActivityInstanceEmbedData> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapActivityInstanceEmbedData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var7: java.lang.String;
         val var8: java.lang.String;
         val var11: java.lang.String;
         var var13: java.lang.String;
         if (var10.p()) {
            var13 = var10.m(var9, 0);
            var8 = var10.m(var9, 1);
            val var6: java.lang.String = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
            var2 = 15;
            var7 = var13;
            var13 = var6;
         } else {
            var7 = null;
            var var14: java.lang.String = null;
            var13 = null;
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

                           var14 = var10.m(var9, 3);
                           var2 |= 8;
                        } else {
                           var13 = var10.m(var9, 2);
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
            var11 = var14;
         }

         var10.c(var9);
         return new TapActivityInstanceEmbedData(var2, var7, var8, var13, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapActivityInstanceEmbedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapActivityInstanceEmbedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapActivityInstanceEmbedData> {
         return TapActivityInstanceEmbedData.$serializer.INSTANCE;
      }
   }
}
