package com.discord.user_search_worker

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

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

   public companion object {
      public fun serializer(): KSerializer<UserSearchUpdateUsersData> {
         return UserSearchUpdateUsersData.$serializer.INSTANCE;
      }
   }
}
