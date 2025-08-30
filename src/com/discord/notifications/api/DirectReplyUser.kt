package com.discord.notifications.api

import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class DirectReplyUser(id: UserId, username: String? = ..., discriminator: String? = ..., avatar: String? = ...) : DirectReplyUser(
      var1, var3, var4, var5
   ) {
   public final val id: UserId
   public final val username: String?
   public final val discriminator: String?
   public final val avatar: String?

   fun DirectReplyUser(var1: Long, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String) {
      super();
      this.id = var1;
      this.username = var3;
      this.discriminator = var4;
      this.avatar = var5;
   }

   public operator fun component1(): UserId {
      return this.id;
   }

   public operator fun component2(): String? {
      return this.username;
   }

   public operator fun component3(): String? {
      return this.discriminator;
   }

   public operator fun component4(): String? {
      return this.avatar;
   }

   public fun copy(id: UserId = ..., username: String? = ..., discriminator: String? = ..., avatar: String? = ...): DirectReplyUser {
      return new DirectReplyUser(var1, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DirectReplyUser) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!(this.username == var1.username)) {
            return false;
         } else if (!(this.discriminator == var1.discriminator)) {
            return false;
         } else {
            return this.avatar == var1.avatar;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = UserId.hashCode-impl(this.id);
      var var3: Int = 0;
      val var1: Int;
      if (this.username == null) {
         var1 = 0;
      } else {
         var1 = this.username.hashCode();
      }

      val var2: Int;
      if (this.discriminator == null) {
         var2 = 0;
      } else {
         var2 = this.discriminator.hashCode();
      }

      if (this.avatar != null) {
         var3 = this.avatar.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = UserId.toString-impl(this.id);
      val var5: java.lang.String = this.username;
      val var3: java.lang.String = this.discriminator;
      val var1: java.lang.String = this.avatar;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DirectReplyUser(id=");
      var2.append(var4);
      var2.append(", username=");
      var2.append(var5);
      var2.append(", discriminator=");
      var2.append(var3);
      var2.append(", avatar=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<DirectReplyUser> {
         return DirectReplyUser.$serializer.INSTANCE;
      }
   }
}
