package com.discord.user_search_worker

import bl.b2
import bl.g0
import bl.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

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
      val var3: java.lang.String = this.guild;
      val var4: java.lang.Boolean = this.friends;
      val var1: java.lang.Boolean = this.strict;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserSearchQuerySetFilters(guild=");
      var2.append(var3);
      var2.append(", friends=");
      var2.append(var4);
      var2.append(", strict=");
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
         val var0: UserSearchQuerySetFilters.$serializer = new UserSearchQuerySetFilters.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetFilters", var0, 3);
         var1.l("guild", true);
         var1.l("friends", true);
         var1.l("strict", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: KSerializer = a.u(b2.a);
         val var2: h = h.a;
         return new KSerializer[]{var1, a.u(h.a), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQuerySetFilters {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var7: java.lang.String = null;
         var var2: Int;
         var var12: java.lang.Boolean;
         var var13: java.lang.Boolean;
         if (var5) {
            val var6: java.lang.String = var10.v(var9, 0, b2.a, null) as java.lang.String;
            val var11: h = h.a;
            val var8: java.lang.Boolean = var10.v(var9, 1, h.a, null) as java.lang.Boolean;
            var12 = var10.v(var9, 2, var11, null) as java.lang.Boolean;
            var2 = 7;
            var7 = var6;
            var13 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var13 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var10.v(var9, 2, h.a, var12) as java.lang.Boolean;
                        var2 |= 4;
                     } else {
                        var13 = var10.v(var9, 1, h.a, var13) as java.lang.Boolean;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.v(var9, 0, b2.a, var7) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new UserSearchQuerySetFilters(var2, var7, var13, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQuerySetFilters) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UserSearchQuerySetFilters.write$Self$user_search_worker_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetFilters> {
         return UserSearchQuerySetFilters.$serializer.INSTANCE;
      }
   }
}
