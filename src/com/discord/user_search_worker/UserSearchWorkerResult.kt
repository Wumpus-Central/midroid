package com.discord.user_search_worker

import kotlin.jvm.internal.r

internal data class UserSearchWorkerResult(id: String, username: String, comparator: String, score: Double) {
   public final val comparator: String
   public final val id: String
   public final val score: Double
   public final val username: String

   init {
      r.h(var1, "id");
      r.h(var2, "username");
      r.h(var3, "comparator");
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
      r.h(var1, "id");
      r.h(var2, "username");
      r.h(var3, "comparator");
      return new UserSearchWorkerResult(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchWorkerResult) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.username, var1.username)) {
            return false;
         } else if (!r.c(this.comparator, var1.comparator)) {
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
      val var4: java.lang.String = this.id;
      val var3: java.lang.String = this.username;
      val var6: java.lang.String = this.comparator;
      val var1: Double = this.score;
      val var5: StringBuilder = new StringBuilder();
      var5.append("UserSearchWorkerResult(id=");
      var5.append(var4);
      var5.append(", username=");
      var5.append(var3);
      var5.append(", comparator=");
      var5.append(var6);
      var5.append(", score=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }
}
