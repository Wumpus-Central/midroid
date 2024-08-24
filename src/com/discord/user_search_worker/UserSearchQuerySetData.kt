package com.discord.user_search_worker

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
import xk.a2
import xk.f0
import xk.f0.a

@f
internal data class UserSearchQuerySetData(uuid: String, payload: UserSearchQuerySetPayload) : UserSearchData {
   public final val payload: UserSearchQuerySetPayload
   public final val uuid: String

   init {
      r.h(var1, "uuid");
      r.h(var2, "payload");
      super(null);
      this.uuid = var1;
      this.payload = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: UserSearchQuerySetData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.uuid);
      var1.y(var2, 1, UserSearchQuerySetPayload.$serializer.INSTANCE, var0.payload);
   }

   public operator fun component1(): String {
      return this.uuid;
   }

   public operator fun component2(): UserSearchQuerySetPayload {
      return this.payload;
   }

   public fun copy(uuid: String = var0.uuid, payload: UserSearchQuerySetPayload = var0.payload): UserSearchQuerySetData {
      r.h(var1, "uuid");
      r.h(var2, "payload");
      return new UserSearchQuerySetData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.uuid, var1.uuid)) {
            return false;
         } else {
            return r.c(this.payload, var1.payload);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uuid.hashCode() * 31 + this.payload.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.uuid;
      val var3: UserSearchQuerySetPayload = this.payload;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UserSearchQuerySetData(uuid=");
      var1.append(var2);
      var1.append(", payload=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<UserSearchQuerySetData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UserSearchQuerySetData.$serializer = new UserSearchQuerySetData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetData", var0, 2);
         var1.l("uuid", false);
         var1.l("payload", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, UserSearchQuerySetPayload.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): UserSearchQuerySetData {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.y(var6, 1, UserSearchQuerySetPayload.$serializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.y(var6, 1, UserSearchQuerySetPayload.$serializer.INSTANCE, var5);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new UserSearchQuerySetData(var2, var8, var5 as UserSearchQuerySetPayload, null);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchQuerySetData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserSearchQuerySetData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetData> {
         return UserSearchQuerySetData.$serializer.INSTANCE;
      }
   }
}
