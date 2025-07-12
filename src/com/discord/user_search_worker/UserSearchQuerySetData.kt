package com.discord.user_search_worker

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class UserSearchQuerySetData(uuid: String, payload: UserSearchQuerySetPayload) : UserSearchData {
   public final val uuid: String
   public final val payload: UserSearchQuerySetPayload

   init {
      r.h(var1, "uuid");
      r.h(var2, "payload");
      super(null);
      this.uuid = var1;
      this.payload = var2;
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
      val var1: java.lang.String = this.uuid;
      val var2: UserSearchQuerySetPayload = this.payload;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UserSearchQuerySetData(uuid=");
      var3.append(var1);
      var3.append(", payload=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetData> {
         return UserSearchQuerySetData.$serializer.INSTANCE;
      }
   }
}
