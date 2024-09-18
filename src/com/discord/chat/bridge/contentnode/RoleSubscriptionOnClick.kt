package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
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
import xk.b2
import xk.g0

@f
public data class RoleSubscriptionOnClick(action: String, guildId: String, messageId: String?, channelId: String?, roleSubscriptionListingId: String?) {
   public final val action: String
   public final val channelId: String?
   public final val guildId: String
   public final val messageId: String?
   public final val roleSubscriptionListingId: String?

   init {
      q.h(var1, "action");
      q.h(var2, "guildId");
      super();
      this.action = var1;
      this.guildId = var2;
      this.messageId = var3;
      this.channelId = var4;
      this.roleSubscriptionListingId = var5;
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): String {
      return this.guildId;
   }

   public operator fun component3(): String? {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.channelId;
   }

   public operator fun component5(): String? {
      return this.roleSubscriptionListingId;
   }

   public fun copy(
      action: String = var0.action,
      guildId: String = var0.guildId,
      messageId: String? = var0.messageId,
      channelId: String? = var0.channelId,
      roleSubscriptionListingId: String? = var0.roleSubscriptionListingId
   ): RoleSubscriptionOnClick {
      q.h(var1, "action");
      q.h(var2, "guildId");
      return new RoleSubscriptionOnClick(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleSubscriptionOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.roleSubscriptionListingId, var1.roleSubscriptionListingId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.action.hashCode();
      val var5: Int = this.guildId.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = this.messageId.hashCode();
      }

      val var2: Int;
      if (this.channelId == null) {
         var2 = 0;
      } else {
         var2 = this.channelId.hashCode();
      }

      if (this.roleSubscriptionListingId != null) {
         var3 = this.roleSubscriptionListingId.hashCode();
      }

      return (((var4 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.action;
      val var2: java.lang.String = this.guildId;
      val var5: java.lang.String = this.messageId;
      val var1: java.lang.String = this.channelId;
      val var6: java.lang.String = this.roleSubscriptionListingId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("RoleSubscriptionOnClick(action=");
      var3.append(var4);
      var3.append(", guildId=");
      var3.append(var2);
      var3.append(", messageId=");
      var3.append(var5);
      var3.append(", channelId=");
      var3.append(var1);
      var3.append(", roleSubscriptionListingId=");
      var3.append(var6);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: RoleSubscriptionOnClick.$serializer = new RoleSubscriptionOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.RoleSubscriptionOnClick", var0, 5);
         var1.l("action", false);
         var1.l("guildId", false);
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("roleSubscriptionListingId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{b2.a, b2.a, a.u(b2.a), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): RoleSubscriptionOnClick {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var5: Boolean = var11.y();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var13: java.lang.String;
         if (var5) {
            var9 = var11.t(var10, 0);
            var8 = var11.t(var10, 1);
            val var12: b2 = b2.a;
            var7 = var11.v(var10, 2, b2.a, null) as java.lang.String;
            var6 = var11.v(var10, 3, var12, null) as java.lang.String;
            var13 = var11.v(var10, 4, var12, null) as java.lang.String;
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;

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

                              var13 = var11.v(var10, 4, b2.a, var13) as java.lang.String;
                              var2 |= 16;
                           } else {
                              var6 = var11.v(var10, 3, b2.a, var6) as java.lang.String;
                              var2 |= 8;
                           }
                        } else {
                           var7 = var11.v(var10, 2, b2.a, var7) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var11.t(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.b(var10);
         return new RoleSubscriptionOnClick(var2, var9, var8, var7, var6, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: RoleSubscriptionOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         RoleSubscriptionOnClick.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return xk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleSubscriptionOnClick> {
         return RoleSubscriptionOnClick.$serializer.INSTANCE;
      }
   }
}
