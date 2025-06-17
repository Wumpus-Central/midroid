package com.discord.user_search_worker

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

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
      val var1: java.util.List = this.payload;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserSearchUpdateUsersData(payload=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchUpdateUsersData> {
         return UserSearchUpdateUsersData.$serializer.INSTANCE;
      }
   }
}
