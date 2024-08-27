package com.discord.user_search_worker

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
import xk.h

@f
internal data class UserSearchQuerySetFilters(guild: String? = null, friends: Boolean? = null, strict: Boolean? = null) {
   public final val friends: Boolean?
   public final val guild: String?
   public final val strict: Boolean?

   fun UserSearchQuerySetFilters() {
      this(null, null, null, 7, null);
   }

   init {
      super();
      this.guild = var1;
      this.friends = var2;
      this.strict = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: UserSearchQuerySetFilters, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.guild == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.guild);
      }

      if (!var1.A(var2, 1) && var0.friends == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, h.a, var0.friends);
      }

      label32: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (var0.strict == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, h.a, var0.strict);
      }
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
         if (!r.c(this.guild, var1.guild)) {
            return false;
         } else if (!r.c(this.friends, var1.friends)) {
            return false;
         } else {
            return r.c(this.strict, var1.strict);
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
      val var1: java.lang.String = this.guild;
      val var4: java.lang.Boolean = this.friends;
      val var2: java.lang.Boolean = this.strict;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UserSearchQuerySetFilters(guild=");
      var3.append(var1);
      var3.append(", friends=");
      var3.append(var4);
      var3.append(", strict=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<UserSearchQuerySetFilters> {
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
         val var1: KSerializer = a.u(a2.a);
         val var2: h = h.a;
         return new KSerializer[]{var1, a.u(h.a), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQuerySetFilters {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var6: Any = null;
         var var2: Int;
         var var7: Any;
         var var11: Any;
         if (var5) {
            var6 = var9.n(var8, 0, a2.a, null);
            var11 = h.a;
            var7 = var9.n(var8, 1, h.a, null);
            var11 = var9.n(var8, 2, (DeserializationStrategy)var11, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var9.n(var8, 2, h.a, var11);
                        var2 |= 4;
                     } else {
                        var7 = var9.n(var8, 1, h.a, var7);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.n(var8, 0, a2.a, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new UserSearchQuerySetFilters(var2, var6 as java.lang.String, var7 as java.lang.Boolean, var11 as java.lang.Boolean, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQuerySetFilters) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchQuerySetFilters.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetFilters> {
         return UserSearchQuerySetFilters.$serializer.INSTANCE;
      }
   }
}
