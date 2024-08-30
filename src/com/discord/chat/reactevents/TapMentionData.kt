package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class TapMentionData(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) : ReactEvent {
   public final val channelId: String
   public final val parsedUserId: String?
   public final val roleName: String?
   public final val userId: String?

   init {
      q.h(var2, "channelId");
      super();
      this.userId = var1;
      this.channelId = var2;
      this.roleName = var3;
      this.parsedUserId = var4;
   }

   public operator fun component1(): String? {
      return this.userId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.roleName;
   }

   public operator fun component4(): String? {
      return this.parsedUserId;
   }

   public fun copy(
      userId: String? = var0.userId,
      channelId: String = var0.channelId,
      roleName: String? = var0.roleName,
      parsedUserId: String? = var0.parsedUserId
   ): TapMentionData {
      q.h(var2, "channelId");
      return new TapMentionData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapMentionData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.roleName, var1.roleName)) {
            return false;
         } else {
            return q.c(this.parsedUserId, var1.parsedUserId);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.userId == null) {
         var1 = 0;
      } else {
         var1 = this.userId.hashCode();
      }

      val var4: Int = this.channelId.hashCode();
      val var2: Int;
      if (this.roleName == null) {
         var2 = 0;
      } else {
         var2 = this.roleName.hashCode();
      }

      if (this.parsedUserId != null) {
         var3 = this.parsedUserId.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.userId;
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.roleName;
      val var4: java.lang.String = this.parsedUserId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapMentionData(userId=");
      var1.append(var5);
      var1.append(", channelId=");
      var1.append(var3);
      var1.append(", roleName=");
      var1.append(var2);
      var1.append(", parsedUserId=");
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
         val var0: TapMentionData.$serializer = new TapMentionData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapMentionData", var0, 4);
         var1.l("userId", false);
         var1.l("channelId", false);
         var1.l("roleName", false);
         var1.l("parsedUserId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), var1, a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapMentionData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         if (var5) {
            val var6: b2 = b2.a;
            var8 = var11.n(var10, 0, b2.a, null) as java.lang.String;
            var7 = var11.m(var10, 1);
            val var12: java.lang.String = var11.n(var10, 2, var6, null) as java.lang.String;
            val var9: java.lang.String = var11.n(var10, 3, var6, null) as java.lang.String;
            var2 = 15;
            var14 = var12;
            var13 = var9;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var14 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.n(var10, 3, b2.a, var13) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var14 = var11.n(var10, 2, b2.a, var14) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.n(var10, 0, b2.a, var8) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.c(var10);
         return new TapMentionData(var2, var8, var7, var14, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: TapMentionData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapMentionData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapMentionData> {
         return TapMentionData.$serializer.INSTANCE;
      }
   }
}
