package com.discord.user_search_worker

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
internal data class UserSearchQuerySetData(uuid: String, payload: UserSearchQuerySetPayload) : UserSearchData {
   public final val uuid: String
   public final val payload: UserSearchQuerySetPayload

   init {
      q.h(var1, "uuid");
      q.h(var2, "payload");
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
      q.h(var1, "uuid");
      q.h(var2, "payload");
      return new UserSearchQuerySetData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.uuid, var1.uuid)) {
            return false;
         } else {
            return q.c(this.payload, var1.payload);
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

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetData> {
         return UserSearchQuerySetData.$serializer.INSTANCE;
      }
   }
}
