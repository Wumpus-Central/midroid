package com.discord.chat.presentation.message.view.botuikit

import com.discord.primitives.UserId
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public data class UserEventHandlers(onTapUsername: (UserId) -> Unit, onTapAvatar: (UserId) -> Unit) {
   public final val onTapUsername: (UserId) -> Unit
   public final val onTapAvatar: (UserId) -> Unit

   init {
      q.h(var1, "onTapUsername");
      q.h(var2, "onTapAvatar");
      super();
      this.onTapUsername = var1;
      this.onTapAvatar = var2;
   }

   public operator fun component1(): (UserId) -> Unit {
      return this.onTapUsername;
   }

   public operator fun component2(): (UserId) -> Unit {
      return this.onTapAvatar;
   }

   public fun copy(onTapUsername: (UserId) -> Unit = var0.onTapUsername, onTapAvatar: (UserId) -> Unit = var0.onTapAvatar): UserEventHandlers {
      q.h(var1, "onTapUsername");
      q.h(var2, "onTapAvatar");
      return new UserEventHandlers(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserEventHandlers) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.onTapUsername, var1.onTapUsername)) {
            return false;
         } else {
            return q.c(this.onTapAvatar, var1.onTapAvatar);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.onTapUsername.hashCode() * 31 + this.onTapAvatar.hashCode();
   }

   public override fun toString(): String {
      val var3: Function1 = this.onTapUsername;
      val var1: Function1 = this.onTapAvatar;
      val var2: StringBuilder = new StringBuilder();
      var2.append("UserEventHandlers(onTapUsername=");
      var2.append(var3);
      var2.append(", onTapAvatar=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
