package com.discord.chat.presentation.list.item

import kotlin.jvm.internal.q

public data class MessageBundleViewMoreItem(viewMoreText: String) : MessageBundleItem {
   public final val viewMoreText: String

   init {
      q.h(var1, "viewMoreText");
      super("view more", null);
      this.viewMoreText = var1;
   }

   public operator fun component1(): String {
      return this.viewMoreText;
   }

   public fun copy(viewMoreText: String = var0.viewMoreText): MessageBundleViewMoreItem {
      q.h(var1, "viewMoreText");
      return new MessageBundleViewMoreItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageBundleViewMoreItem) {
         return false;
      } else {
         return q.c(this.viewMoreText, (var1 as MessageBundleViewMoreItem).viewMoreText);
      }
   }

   public override fun hashCode(): Int {
      return this.viewMoreText.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.viewMoreText;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MessageBundleViewMoreItem(viewMoreText=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
