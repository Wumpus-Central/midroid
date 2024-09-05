package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.g0.a

@f
public data class TapConnectionsRoleTagData(userId: String, guildId: String, channelId: String, roleId: String) : ReactEvent {
   public final val channelId: String
   public final val guildId: String
   public final val roleId: String
   public final val userId: String

   init {
      q.h(var1, "userId");
      q.h(var2, "guildId");
      q.h(var3, "channelId");
      q.h(var4, "roleId");
      super();
      this.userId = var1;
      this.guildId = var2;
      this.channelId = var3;
      this.roleId = var4;
   }

   public operator fun component1(): String {
      return this.userId;
   }

   public operator fun component2(): String {
      return this.guildId;
   }

   public operator fun component3(): String {
      return this.channelId;
   }

   public operator fun component4(): String {
      return this.roleId;
   }

   public fun copy(userId: String = var0.userId, guildId: String = var0.guildId, channelId: String = var0.channelId, roleId: String = var0.roleId): TapConnectionsRoleTagData {
      q.h(var1, "userId");
      q.h(var2, "guildId");
      q.h(var3, "channelId");
      q.h(var4, "roleId");
      return new TapConnectionsRoleTagData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapConnectionsRoleTagData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.roleId, var1.roleId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.userId.hashCode() * 31 + this.guildId.hashCode()) * 31 + this.channelId.hashCode()) * 31 + this.roleId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.userId;
      val var4: java.lang.String = this.guildId;
      val var5: java.lang.String = this.channelId;
      val var1: java.lang.String = this.roleId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapConnectionsRoleTagData(userId=");
      var2.append(var3);
      var2.append(", guildId=");
      var2.append(var4);
      var2.append(", channelId=");
      var2.append(var5);
      var2.append(", roleId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapConnectionsRoleTagData.$serializer = new TapConnectionsRoleTagData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapConnectionsRoleTagData", var0, 4);
         var1.c("userId", false);
         var1.c("guildId", false);
         var1.c("channelId", false);
         var1.c("roleId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapConnectionsRoleTagData {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         var var13: java.lang.String;
         if (var10.p()) {
            var13 = var10.m(var9, 0);
            var6 = var10.m(var9, 1);
            val var8: java.lang.String = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
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

            var6 = var12;
            var11 = var6;
         }

         var10.c(var9);
         return new TapConnectionsRoleTagData(var2, var7, var6, var13, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapConnectionsRoleTagData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapConnectionsRoleTagData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapConnectionsRoleTagData> {
         return TapConnectionsRoleTagData.$serializer.INSTANCE;
      }
   }
}
