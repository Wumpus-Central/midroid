package com.discord.chat.presentation.list.item

import kotlin.jvm.internal.r

public data class SeparatorChatListItem(color: Int, text: String) : ChatListItem {
   public final val color: Int
   public final val text: String

   init {
      r.h(var2, "text");
      val var3: StringBuilder = new StringBuilder();
      var3.append("separator: ");
      var3.append(var2);
      super(var3.toString(), null);
      this.color = var1;
      this.text = var2;
   }

   public operator fun component1(): Int {
      return this.color;
   }

   public operator fun component2(): String {
      return this.text;
   }

   public fun copy(color: Int = var0.color, text: String = var0.text): SeparatorChatListItem {
      r.h(var2, "text");
      return new SeparatorChatListItem(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (this.color != var1.color) {
            return false;
         } else {
            return r.c(this.text, var1.text);
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.color) * 31 + this.text.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.color;
      val var2: java.lang.String = this.text;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SeparatorChatListItem(color=");
      var3.append(var1);
      var3.append(", text=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
