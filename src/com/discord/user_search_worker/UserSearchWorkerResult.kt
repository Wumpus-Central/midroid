package com.discord.user_search_worker

import kotlin.jvm.internal.q

internal data class UserSearchWorkerResult(id: String, username: String, comparator: String, score: Double) {
   public final val comparator: String
   public final val id: String
   public final val score: Double
   public final val username: String

   init {
      q.h(var1, "id");
      q.h(var2, "username");
      q.h(var3, "comparator");
      super();
      this.id = var1;
      this.username = var2;
      this.comparator = var3;
      this.score = var4;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.username;
   }

   public operator fun component3(): String {
      return this.comparator;
   }

   public operator fun component4(): Double {
      return this.score;
   }

   public fun copy(id: String = var0.id, username: String = var0.username, comparator: String = var0.comparator, score: Double = var0.score): UserSearchWorkerResult {
      q.h(var1, "id");
      q.h(var2, "username");
      q.h(var3, "comparator");
      return new UserSearchWorkerResult(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchWorkerResult) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.username, var1.username)) {
            return false;
         } else if (!q.c(this.comparator, var1.comparator)) {
            return false;
         } else {
            return java.lang.Double.compare(this.score, var1.score) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.id.hashCode() * 31 + this.username.hashCode()) * 31 + this.comparator.hashCode()) * 31 + java.lang.Double.hashCode(this.score);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.id;
      val var6: java.lang.String = this.username;
      val var3: java.lang.String = this.comparator;
      val var1: Double = this.score;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UserSearchWorkerResult(id=");
      var4.append(var5);
      var4.append(", username=");
      var4.append(var6);
      var4.append(", comparator=");
      var4.append(var3);
      var4.append(", score=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
