package com.discord.user_search_worker

import dn.f
import dn.n
import gn.g0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class UserSearchUpdateUsersData(payload: List<UserSearchTransformedUser>) : UserSearchData {
   public final val payload: List<UserSearchTransformedUser>

   init {
      q.h(var1, "payload");
      super(null);
      this.payload = var1;
   }

   public operator fun component1(): List<UserSearchTransformedUser> {
      return this.payload;
   }

   public fun copy(payload: List<UserSearchTransformedUser> = var0.payload): UserSearchUpdateUsersData {
      q.h(var1, "payload");
      return new UserSearchUpdateUsersData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchUpdateUsersData) {
         return false;
      } else {
         return q.c(this.payload, (var1 as UserSearchUpdateUsersData).payload);
      }
   }

   public override fun hashCode(): Int {
      return this.payload.hashCode();
   }

   public override fun toString(): String {
      val var2: java.util.List = this.payload;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UserSearchUpdateUsersData(payload=");
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
         val var0: UserSearchUpdateUsersData.$serializer = new UserSearchUpdateUsersData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchUpdateUsersData", var0, 1);
         var1.l("payload", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{UserSearchUpdateUsersData.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): UserSearchUpdateUsersData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var8: Array<KSerializer> = UserSearchUpdateUsersData.access$get$childSerializers$cp();
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: java.util.List;
         if (var5) {
            var9 = var7.y(var6, 0, var8[0], null) as java.util.List;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.y(var6, 0, var8[0], var9) as java.util.List;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new UserSearchUpdateUsersData(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchUpdateUsersData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchUpdateUsersData.write$Self$user_search_worker_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchUpdateUsersData> {
         return UserSearchUpdateUsersData.$serializer.INSTANCE;
      }
   }
}
