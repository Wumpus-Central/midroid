package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q

public data class ErrorContentNode(throwable: Throwable) : ContentNode {
   public final val throwable: Throwable

   init {
      q.h(var1, "throwable");
      super(null);
      this.throwable = var1;
   }

   public operator fun component1(): Throwable {
      return this.throwable;
   }

   public fun copy(throwable: Throwable = var0.throwable): ErrorContentNode {
      q.h(var1, "throwable");
      return new ErrorContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ErrorContentNode) {
         return false;
      } else {
         return q.c(this.throwable, (var1 as ErrorContentNode).throwable);
      }
   }

   public override fun hashCode(): Int {
      return this.throwable.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.Throwable = this.throwable;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ErrorContentNode(throwable=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
