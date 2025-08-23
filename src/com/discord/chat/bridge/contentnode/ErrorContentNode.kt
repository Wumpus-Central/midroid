package com.discord.chat.bridge.contentnode

public data class ErrorContentNode(throwable: Throwable) : ContentNode() {
   public final val throwable: Throwable

   init {
      this.throwable = var1;
   }

   public operator fun component1(): Throwable {
      return this.throwable;
   }

   public fun copy(throwable: Throwable = var0.throwable): ErrorContentNode {
      return new ErrorContentNode(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ErrorContentNode) {
         return false;
      } else {
         return this.throwable == (var1 as ErrorContentNode).throwable;
      }
   }

   public override fun hashCode(): Int {
      return this.throwable.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.Throwable = this.throwable;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ErrorContentNode(throwable=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
