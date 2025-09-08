package com.discord.user_search_worker

import kotlinx.serialization.KSerializer
import mb.g

@g
internal data class UserSearchQuerySetData(uuid: String, payload: UserSearchQuerySetPayload) : UserSearchData() {
   public final val uuid: String
   public final val payload: UserSearchQuerySetPayload

   init {
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
      return new UserSearchQuerySetData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchQuerySetData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.uuid == var1.uuid)) {
            return false;
         } else {
            return this.payload == var1.payload;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uuid.hashCode() * 31 + this.payload.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.uuid;
      val var3: UserSearchQuerySetPayload = this.payload;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserSearchQuerySetData(uuid=");
      var2.append(var1);
      var2.append(", payload=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchQuerySetData> {
         return UserSearchQuerySetData.$serializer.INSTANCE;
      }
   }
}
