package com.discord.chat.bridge.contentnode

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
      val var5: java.lang.String = this.action;
      val var3: java.lang.String = this.guildId;
      val var4: java.lang.String = this.messageId;
      val var6: java.lang.String = this.channelId;
      val var2: java.lang.String = this.roleSubscriptionListingId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("RoleSubscriptionOnClick(action=");
      var1.append(var5);
      var1.append(", guildId=");
      var1.append(var3);
      var1.append(", messageId=");
      var1.append(var4);
      var1.append(", channelId=");
      var1.append(var6);
      var1.append(", roleSubscriptionListingId=");
      var1.append(var2);
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
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var8: java.lang.String;
         val var13: java.lang.String;
         var var15: java.lang.String;
         if (var5) {
            var9 = var12.m(var11, 0);
            var8 = var12.m(var11, 1);
            val var6: b2 = b2.a;
            var7 = var12.n(var11, 2, b2.a, null) as java.lang.String;
            var13 = var12.n(var11, 3, var6, null) as java.lang.String;
            var15 = var12.n(var11, 4, var6, null) as java.lang.String;
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var15 = null;
            var var14: java.lang.String = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var14 = var12.n(var11, 4, b2.a, var14) as java.lang.String;
                              var2 |= 16;
                           } else {
                              var15 = var12.n(var11, 3, b2.a, var15) as java.lang.String;
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.n(var11, 2, b2.a, var7) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.m(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.m(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var15 = var14;
            var13 = var15;
         }

         var12.c(var11);
         return new RoleSubscriptionOnClick(var2, var9, var8, var7, var13, var15, null);
      }

      public open fun serialize(encoder: Encoder, value: RoleSubscriptionOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         RoleSubscriptionOnClick.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleSubscriptionOnClick> {
         return RoleSubscriptionOnClick.$serializer.INSTANCE;
      }
   }
}
