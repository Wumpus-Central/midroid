package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0

@f
internal data class TapMentionData(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) : ReactEvent {
   public final val channelId: String
   public final val parsedUserId: String?
   public final val roleName: String?
   public final val userId: String?

   init {
      r.h(var2, "channelId");
      super();
      this.userId = var1;
      this.channelId = var2;
      this.roleName = var3;
      this.parsedUserId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapMentionData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: a2 = a2.a;
      var1.m(var2, 0, a2.a, var0.userId);
      var1.z(var2, 1, var0.channelId);
      var1.m(var2, 2, var3, var0.roleName);
      var1.m(var2, 3, var3, var0.parsedUserId);
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
      r.h(var2, "channelId");
      return new TapMentionData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapMentionData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.userId, var1.userId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.roleName, var1.roleName)) {
            return false;
         } else {
            return r.c(this.parsedUserId, var1.parsedUserId);
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
      val var4: java.lang.String = this.userId;
      val var1: java.lang.String = this.channelId;
      val var2: java.lang.String = this.roleName;
      val var3: java.lang.String = this.parsedUserId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapMentionData(userId=");
      var5.append(var4);
      var5.append(", channelId=");
      var5.append(var1);
      var5.append(", roleName=");
      var5.append(var2);
      var5.append(", parsedUserId=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<TapMentionData> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), var1, a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapMentionData {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: Any = null;
         var var2: Int;
         var var7: Any;
         val var9: java.lang.String;
         var var14: Any;
         if (var5) {
            var14 = a2.a;
            var8 = var11.n(var10, 0, a2.a, null);
            var9 = var11.m(var10, 1);
            val var12: Any = var11.n(var10, 2, (DeserializationStrategy)var14, null);
            var14 = var11.n(var10, 3, (DeserializationStrategy)var14, null);
            var2 = 15;
            var7 = var12;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var13: java.lang.String = null;
            var7 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var14 = var11.n(var10, 3, a2.a, var14);
                           var2 |= 8;
                        } else {
                           var7 = var11.n(var10, 2, a2.a, var7);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.n(var10, 0, a2.a, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var13;
         }

         var11.c(var10);
         return new TapMentionData(var2, var8 as java.lang.String, var9, var7 as java.lang.String, var14 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: TapMentionData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapMentionData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapMentionData> {
         return TapMentionData.$serializer.INSTANCE;
      }
   }
}
