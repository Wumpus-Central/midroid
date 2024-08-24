package com.discord.notifications.api

import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.n1

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
         n1.b(var1, 1, DirectReplyUser.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: DirectReplyUser, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, UserId.$serializer.INSTANCE, UserId.box-impl(var0.id));
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.username == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.username);
      }

      if (!var1.A(var2, 2) && var0.discriminator == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.discriminator);
      }

      label32: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.avatar == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.avatar);
      }
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
         } else if (!r.c(this.username, var1.username)) {
            return false;
         } else if (!r.c(this.discriminator, var1.discriminator)) {
            return false;
         } else {
            return r.c(this.avatar, var1.avatar);
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
      val var4: java.lang.String = UserId.toString-impl(this.id);
      val var5: java.lang.String = this.username;
      val var3: java.lang.String = this.discriminator;
      val var1: java.lang.String = this.avatar;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DirectReplyUser(id=");
      var2.append(var4);
      var2.append(", username=");
      var2.append(var5);
      var2.append(", discriminator=");
      var2.append(var3);
      var2.append(", avatar=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<DirectReplyUser> {
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

      public override fun childSerializers(): Array<KSerializer<*>> {
         val var2: a2 = a2.a;
         return new KSerializer[]{UserId.$serializer.INSTANCE, vk.a.u(a2.a), vk.a.u(var2), vk.a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): DirectReplyUser {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var7: Any = null;
         var var2: Int;
         var var6: Any;
         var var8: Any;
         val var9: Any;
         var var12: Any;
         if (var5) {
            var12 = var11.y(var10, 0, UserId.$serializer.INSTANCE, null);
            var7 = a2.a;
            var9 = var11.n(var10, 1, a2.a, null);
            var6 = var11.n(var10, 2, (DeserializationStrategy)var7, null);
            var8 = var11.n(var10, 3, (DeserializationStrategy)var7, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var11.n(var10, 3, a2.a, (java.lang.String)var12);
                           var2 |= 8;
                        } else {
                           var6 = var11.n(var10, 2, a2.a, (java.lang.String)var6);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var11.n(var10, 1, a2.a, (java.lang.String)var8);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var11.y(var10, 0, UserId.$serializer.INSTANCE, (UserId)var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var8;
            var8 = var12;
            var12 = var7;
         }

         var11.c(var10);
         return new DirectReplyUser(var2, var12 as UserId, var9 as java.lang.String, var6 as java.lang.String, var8 as java.lang.String, null, null);
      }

      public open fun serialize(encoder: Encoder, value: DirectReplyUser) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         DirectReplyUser.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<DirectReplyUser> {
         return DirectReplyUser.$serializer.INSTANCE;
      }
   }
}
