package com.discord.notifications.api

import com.discord.primitives.UserId
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import gn.o1
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class DirectReplyUser(id: UserId, username: String? = ..., discriminator: String? = ..., avatar: String? = ...) : DirectReplyUser(
      var1, var3, var4, var5
   ) {
   public final val avatar: String?
   public final val discriminator: String?
   public final val id: UserId
   public final val username: String?

   fun DirectReplyUser(var1: Int, var2: UserId, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String, var6: SerializationConstructorMarker) {
      if (1 != (var1 and 1)) {
         o1.b(var1, 1, DirectReplyUser.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2.unbox-impl();
      if ((var1 and 2) == 0) {
         this.username = null;
      } else {
         this.username = var3;
      }

      if ((var1 and 4) == 0) {
         this.discriminator = null;
      } else {
         this.discriminator = var4;
      }

      if ((var1 and 8) == 0) {
         this.avatar = null;
      } else {
         this.avatar = var5;
      }
   }

   fun DirectReplyUser(var1: Long, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String) {
      super();
      this.id = var1;
      this.username = var3;
      this.discriminator = var4;
      this.avatar = var5;
   }

   public operator fun component1(): UserId {
      return this.id;
   }

   public operator fun component2(): String? {
      return this.username;
   }

   public operator fun component3(): String? {
      return this.discriminator;
   }

   public operator fun component4(): String? {
      return this.avatar;
   }

   public fun copy(id: UserId = ..., username: String? = ..., discriminator: String? = ..., avatar: String? = ...): DirectReplyUser {
      return new DirectReplyUser(var1, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DirectReplyUser) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.username, var1.username)) {
            return false;
         } else if (!q.c(this.discriminator, var1.discriminator)) {
            return false;
         } else {
            return q.c(this.avatar, var1.avatar);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = UserId.hashCode-impl(this.id);
      var var3: Int = 0;
      val var1: Int;
      if (this.username == null) {
         var1 = 0;
      } else {
         var1 = this.username.hashCode();
      }

      val var2: Int;
      if (this.discriminator == null) {
         var2 = 0;
      } else {
         var2 = this.discriminator.hashCode();
      }

      if (this.avatar != null) {
         var3 = this.avatar.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var5: java.lang.String = UserId.toString-impl(this.id);
      val var3: java.lang.String = this.username;
      val var2: java.lang.String = this.discriminator;
      val var4: java.lang.String = this.avatar;
      val var1: StringBuilder = new StringBuilder();
      var1.append("DirectReplyUser(id=");
      var1.append(var5);
      var1.append(", username=");
      var1.append(var3);
      var1.append(", discriminator=");
      var1.append(var2);
      var1.append(", avatar=");
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
         val var0: DirectReplyUser.$serializer = new DirectReplyUser.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.DirectReplyUser", var0, 4);
         var1.l("id", false);
         var1.l("username", true);
         var1.l("discriminator", true);
         var1.l("avatar", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: b2 = b2.a;
         return new KSerializer[]{UserId.$serializer.INSTANCE, a.u(b2.a), a.u(var2), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): DirectReplyUser {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var8: UserId = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var12: java.lang.String;
         if (var5) {
            var8 = var10.y(var9, 0, UserId.$serializer.INSTANCE, null) as UserId;
            val var11: b2 = b2.a;
            var7 = var10.n(var9, 1, b2.a, null) as java.lang.String;
            var6 = var10.n(var9, 2, var11, null) as java.lang.String;
            var12 = var10.n(var9, 3, var11, null) as java.lang.String;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var10.n(var9, 3, b2.a, var12) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var6 = var10.n(var9, 2, b2.a, var6) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.n(var9, 1, b2.a, var7) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.y(var9, 0, UserId.$serializer.INSTANCE, var8) as UserId;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new DirectReplyUser(var2, var8, var7, var6, var12, null, null);
      }

      public open fun serialize(encoder: Encoder, value: DirectReplyUser) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         DirectReplyUser.write$Self$notification_api_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<DirectReplyUser> {
         return DirectReplyUser.$serializer.INSTANCE;
      }
   }
}
