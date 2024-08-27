package com.discord.chat.bridge.contentnode

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
import vk.a
import xk.a2
import xk.f0

@f
public data class RoleSubscriptionOnClick(action: String, guildId: String, messageId: String?, channelId: String?, roleSubscriptionListingId: String?) {
   public final val action: String
   public final val channelId: String?
   public final val guildId: String
   public final val messageId: String?
   public final val roleSubscriptionListingId: String?

   init {
      r.h(var1, "action");
      r.h(var2, "guildId");
      super();
      this.action = var1;
      this.guildId = var2;
      this.messageId = var3;
      this.channelId = var4;
      this.roleSubscriptionListingId = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: RoleSubscriptionOnClick, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.z(var2, 1, var0.guildId);
      val var3: a2 = a2.a;
      var1.m(var2, 2, a2.a, var0.messageId);
      var1.m(var2, 3, var3, var0.channelId);
      var1.m(var2, 4, var3, var0.roleSubscriptionListingId);
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
      r.h(var1, "action");
      r.h(var2, "guildId");
      return new RoleSubscriptionOnClick(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleSubscriptionOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.roleSubscriptionListingId, var1.roleSubscriptionListingId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.action.hashCode();
      val var4: Int = this.guildId.hashCode();
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

      return (((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.action;
      val var2: java.lang.String = this.guildId;
      val var3: java.lang.String = this.messageId;
      val var6: java.lang.String = this.channelId;
      val var4: java.lang.String = this.roleSubscriptionListingId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("RoleSubscriptionOnClick(action=");
      var5.append(var1);
      var5.append(", guildId=");
      var5.append(var2);
      var5.append(", messageId=");
      var5.append(var3);
      var5.append(", channelId=");
      var5.append(var6);
      var5.append(", roleSubscriptionListingId=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<RoleSubscriptionOnClick> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, a2.a, a.u(a2.a), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): RoleSubscriptionOnClick {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         val var10: Any;
         val var14: java.lang.String;
         if (var5) {
            val var13: java.lang.String = var12.m(var11, 0);
            val var8: java.lang.String = var12.m(var11, 1);
            val var17: a2 = a2.a;
            var7 = var12.n(var11, 2, a2.a, null);
            var6 = var12.n(var11, 3, var17, null);
            var10 = var12.n(var11, 4, var17, null);
            var2 = 31;
            var9 = var13;
            var14 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var16: java.lang.String = null;
            var7 = null;
            var6 = null;
            var var15: Any = null;

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

                              var15 = var12.n(var11, 4, a2.a, var15);
                              var2 |= 16;
                           } else {
                              var6 = var12.n(var11, 3, a2.a, var6);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.n(var11, 2, a2.a, var7);
                           var2 |= 4;
                        }
                     } else {
                        var16 = var12.m(var11, 1);
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

            var10 = var15;
            var14 = var16;
         }

         var12.c(var11);
         return new RoleSubscriptionOnClick(var2, var9, var14, var7 as java.lang.String, var6 as java.lang.String, var10 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: RoleSubscriptionOnClick) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         RoleSubscriptionOnClick.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleSubscriptionOnClick> {
         return RoleSubscriptionOnClick.$serializer.INSTANCE;
      }
   }
}
