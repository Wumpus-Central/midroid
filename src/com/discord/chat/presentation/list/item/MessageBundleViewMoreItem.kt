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
      val var2: java.lang.String = this.viewMoreText;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MessageBundleViewMoreItem(viewMoreText=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
