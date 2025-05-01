package com.discord.chat.reactevents

import aa.f
import aa.n
import ba.a
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import da.C0
import da.G
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class TapActivityBookmarkEmbedData(applicationId: String, channelId: String, referrerId: String, customId: String?) : ReactEvent {
   public final val applicationId: String
   public final val channelId: String
   public final val customId: String?
   public final val referrerId: String

   init {
      q.h(var1, "applicationId");
      q.h(var2, "channelId");
      q.h(var3, "referrerId");
      super();
      this.applicationId = var1;
      this.channelId = var2;
      this.referrerId = var3;
      this.customId = var4;
   }

   public operator fun component1(): String {
      return this.applicationId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.referrerId;
   }

   public operator fun component4(): String? {
      return this.customId;
   }

   public fun copy(
      applicationId: String = var0.applicationId,
      channelId: String = var0.channelId,
      referrerId: String = var0.referrerId,
      customId: String? = var0.customId
   ): TapActivityBookmarkEmbedData {
      q.h(var1, "applicationId");
      q.h(var2, "channelId");
      q.h(var3, "referrerId");
      return new TapActivityBookmarkEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapActivityBookmarkEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.applicationId, var1.applicationId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.referrerId, var1.referrerId)) {
            return false;
         } else {
            return q.c(this.customId, var1.customId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.applicationId.hashCode();
      val var2: Int = this.channelId.hashCode();
      val var4: Int = this.referrerId.hashCode();
      val var1: Int;
      if (this.customId == null) {
         var1 = 0;
      } else {
         var1 = this.customId.hashCode();
      }

      return ((var3 * 31 + var2) * 31 + var4) * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.applicationId;
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.referrerId;
      val var4: java.lang.String = this.customId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapActivityBookmarkEmbedData(applicationId=");
      var5.append(var2);
      var5.append(", channelId=");
      var5.append(var3);
      var5.append(", referrerId=");
      var5.append(var1);
      var5.append(", customId=");
      var5.append(var4);
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
         val var0: TapActivityBookmarkEmbedData.$serializer = new TapActivityBookmarkEmbedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapActivityBookmarkEmbedData", var0, 4);
         var1.l("applicationId", false);
         var1.l("channelId", false);
         var1.l("referrerId", false);
         var1.l("customId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, C0.a, C0.a, a.u(C0.a)};
      }

      public open fun deserialize(decoder: Decoder): TapActivityBookmarkEmbedData {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var11: java.lang.String;
         if (var5) {
            var8 = var10.t(var9, 0);
            var7 = var10.t(var9, 1);
            var6 = var10.t(var9, 2);
            var11 = var10.v(var9, 3, C0.a, null) as java.lang.String;
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

                           var11 = var10.v(var9, 3, C0.a, var11) as java.lang.String;
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
         return new TapActivityBookmarkEmbedData(var2, var8, var7, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapActivityBookmarkEmbedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapActivityBookmarkEmbedData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapActivityBookmarkEmbedData> {
         return TapActivityBookmarkEmbedData.$serializer.INSTANCE;
      }
   }
}
