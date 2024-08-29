package com.discord.user_search_worker

import dn.f
import dn.n
import gn.b2
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
internal data class UserSearchQueryClearData(uuid: String) : UserSearchData {
   public final val uuid: String

   init {
      q.h(var1, "uuid");
      super(null);
      this.uuid = var1;
   }

   public operator fun component1(): String {
      return this.uuid;
   }

   public fun copy(uuid: String = var0.uuid): UserSearchQueryClearData {
      q.h(var1, "uuid");
      return new UserSearchQueryClearData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQueryClearData) {
         return false;
      } else {
         return q.c(this.uuid, (var1 as UserSearchQueryClearData).uuid);
      }
   }

   public override fun hashCode(): Int {
      return this.uuid.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.uuid;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UserSearchQueryClearData(uuid=");
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
         val var0: UserSearchQueryClearData.$serializer = new UserSearchQueryClearData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQueryClearData", var0, 1);
         var1.l("uuid", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQueryClearData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.m(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new UserSearchQueryClearData(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQueryClearData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchQueryClearData.write$Self$user_search_worker_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQueryClearData> {
         return UserSearchQueryClearData.$serializer.INSTANCE;
      }
   }
}
