package com.discord.chat.reactevents

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
import vk.f
import vk.n
import yk.b2
import yk.g0
import yk.g0.a

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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.userId;
      val var1: java.lang.String = this.guildId;
      val var5: java.lang.String = this.channelId;
      val var3: java.lang.String = this.roleId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapConnectionsRoleTagData(userId=");
      var4.append(var2);
      var4.append(", guildId=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var5);
      var4.append(", roleId=");
      var4.append(var3);
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
         val var0: TapConnectionsRoleTagData.$serializer = new TapConnectionsRoleTagData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapConnectionsRoleTagData", var0, 4);
         var1.l("userId", false);
         var1.l("guildId", false);
         var1.l("channelId", false);
         var1.l("roleId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapConnectionsRoleTagData {
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

            var5 = var12;
            var11 = var6;
            var6 = var5;
         }

         var10.b(var9);
         return new TapConnectionsRoleTagData(var2, var7, var5, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapConnectionsRoleTagData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapConnectionsRoleTagData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
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
