package com.discord.chat.bridge.contentnode

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
      val var2: java.lang.String = this.action;
      val var5: java.lang.String = this.guildId;
      val var1: java.lang.String = this.messageId;
      val var3: java.lang.String = this.channelId;
      val var6: java.lang.String = this.roleSubscriptionListingId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("RoleSubscriptionOnClick(action=");
      var4.append(var2);
      var4.append(", guildId=");
      var4.append(var5);
      var4.append(", messageId=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var3);
      var4.append(", roleSubscriptionListingId=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
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
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var8: java.lang.String;
         var var13: Any;
         if (var5) {
            var9 = var11.m(var10, 0);
            var8 = var11.m(var10, 1);
            var13 = a2.a;
            var7 = var11.n(var10, 2, a2.a, null);
            var6 = var11.n(var10, 3, (DeserializationStrategy)var13, null);
            var13 = var11.n(var10, 4, (DeserializationStrategy)var13, null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var11.n(var10, 4, a2.a, var13);
                              var2 |= 16;
                           } else {
                              var6 = var11.n(var10, 3, a2.a, var6);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var11.n(var10, 2, a2.a, var7);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.c(var10);
         return new RoleSubscriptionOnClick(var2, var9, var8, var7 as java.lang.String, var6 as java.lang.String, var13 as java.lang.String, null);
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
