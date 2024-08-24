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
public data class TapConnectionsRoleTagData(userId: String, guildId: String, channelId: String, roleId: String) : ReactEvent {
   public final val channelId: String
   public final val guildId: String
   public final val roleId: String
   public final val userId: String

   init {
      r.h(var1, "userId");
      r.h(var2, "guildId");
      r.h(var3, "channelId");
      r.h(var4, "roleId");
      super();
      this.userId = var1;
      this.guildId = var2;
      this.channelId = var3;
      this.roleId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapConnectionsRoleTagData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.userId);
      var1.z(var2, 1, var0.guildId);
      var1.z(var2, 2, var0.channelId);
      var1.z(var2, 3, var0.roleId);
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
      r.h(var1, "userId");
      r.h(var2, "guildId");
      r.h(var3, "channelId");
      r.h(var4, "roleId");
      return new TapConnectionsRoleTagData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapConnectionsRoleTagData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.userId, var1.userId)) {
            return false;
         } else if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.roleId, var1.roleId);
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
      val var1: java.lang.String = this.userId;
      val var3: java.lang.String = this.guildId;
      val var4: java.lang.String = this.channelId;
      val var5: java.lang.String = this.roleId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapConnectionsRoleTagData(userId=");
      var2.append(var1);
      var2.append(", guildId=");
      var2.append(var3);
      var2.append(", channelId=");
      var2.append(var4);
      var2.append(", roleId=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<TapConnectionsRoleTagData> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapConnectionsRoleTagData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         if (var10.p()) {
            var7 = var10.m(var9, 0);
            var6 = var10.m(var9, 1);
            var5 = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
            var2 = 15;
         } else {
            var7 = null;
            var6 = null;
            var5 = null;
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
                           var5 = var10.m(var9, 2);
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

            var11 = var6;
            var6 = var12;
         }

         var10.c(var9);
         return new TapConnectionsRoleTagData(var2, var7, var6, var5, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapConnectionsRoleTagData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapConnectionsRoleTagData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapConnectionsRoleTagData> {
         return TapConnectionsRoleTagData.$serializer.INSTANCE;
      }
   }
}
