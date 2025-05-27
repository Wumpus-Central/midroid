package com.discord.user_search_worker

import Za.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

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

   public companion object {
      public fun serializer(): KSerializer<UserSearchQueryClearData> {
         return UserSearchQueryClearData.$serializer.INSTANCE;
      }
   }
}
