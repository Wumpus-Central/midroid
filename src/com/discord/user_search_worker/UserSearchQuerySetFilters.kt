package com.discord.user_search_worker

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
import on.a
import qn.b2
import qn.g0
import qn.h

@f
internal data class UserSearchQuerySetFilters(guild: String? = null, friends: Boolean? = null, strict: Boolean? = null) {
   public final val friends: Boolean?
   public final val guild: String?
   public final val strict: Boolean?

   fun UserSearchQuerySetFilters() {
      this(null, null, null, 7, null);
   }

   init {
      this.guild = var1;
      this.friends = var2;
      this.strict = var3;
   }

   public operator fun component1(): String? {
      return this.guild;
   }

   public operator fun component2(): Boolean? {
      return this.friends;
   }

   public operator fun component3(): Boolean? {
      return this.strict;
   }

   public fun copy(guild: String? = var0.guild, friends: Boolean? = var0.friends, strict: Boolean? = var0.strict): UserSearchQuerySetFilters {
      return new UserSearchQuerySetFilters(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetFilters) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guild, var1.guild)) {
            return false;
         } else if (!q.c(this.friends, var1.friends)) {
            return false;
         } else {
            return q.c(this.strict, var1.strict);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.guild == null) {
         var1 = 0;
      } else {
         var1 = this.guild.hashCode();
      }

      val var2: Int;
      if (this.friends == null) {
         var2 = 0;
      } else {
         var2 = this.friends.hashCode();
      }

      if (this.strict != null) {
         var3 = this.strict.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.guild;
      val var2: java.lang.Boolean = this.friends;
      val var1: java.lang.Boolean = this.strict;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UserSearchQuerySetFilters(guild=");
      var3.append(var4);
      var3.append(", friends=");
      var3.append(var2);
      var3.append(", strict=");
      var3.append(var1);
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
         val var0: UserSearchQuerySetFilters.$serializer = new UserSearchQuerySetFilters.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetFilters", var0, 3);
         var1.c("guild", true);
         var1.c("friends", true);
         var1.c("strict", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: KSerializer = a.u(b2.a);
         val var1: h = h.a;
         return new KSerializer[]{var2, a.u(h.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQuerySetFilters {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: java.lang.String = null;
         var var2: Int;
         val var6: java.lang.String;
         val var8: java.lang.Boolean;
         var var12: java.lang.Boolean;
         if (var5) {
            var6 = var10.n(var9, 0, b2.a, null) as java.lang.String;
            val var11: h = h.a;
            var8 = var10.n(var9, 1, h.a, null) as java.lang.Boolean;
            var12 = var10.n(var9, 2, var11, null) as java.lang.Boolean;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var13: java.lang.Boolean = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.n(var9, 2, h.a, var12) as java.lang.Boolean;
                        var2 |= 4;
                     } else {
                        var13 = var10.n(var9, 1, h.a, var13) as java.lang.Boolean;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.n(var9, 0, b2.a, var7) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var13;
            var6 = var7;
         }

         var10.c(var9);
         return new UserSearchQuerySetFilters(var2, var6, var8, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQuerySetFilters) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchQuerySetFilters.write$Self$user_search_worker_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetFilters> {
         return UserSearchQuerySetFilters.$serializer.INSTANCE;
      }
   }
}
