package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.row.LoadMoreButton
import kotlin.jvm.internal.r

public data class LoadingChatListItem(button: LoadMoreButton, isLoading: Boolean) : ChatListItem {
   public final val button: LoadMoreButton
   public final val isLoading: Boolean

   init {
      r.h(var1, "button");
      val var3: StringBuilder = new StringBuilder();
      var3.append("loading + ");
      var3.append(var2);
      super(var3.toString(), null);
      this.button = var1;
      this.isLoading = var2;
   }

   public operator fun component1(): LoadMoreButton {
      return this.button;
   }

   public operator fun component2(): Boolean {
      return this.isLoading;
   }

   public fun copy(button: LoadMoreButton = var0.button, isLoading: Boolean = var0.isLoading): LoadingChatListItem {
      r.h(var1, "button");
      return new LoadingChatListItem(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadingChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.button, var1.button)) {
            return false;
         } else {
            return this.isLoading == var1.isLoading;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.button.hashCode();
      var var1: Byte = this.isLoading;
      if (this.isLoading != 0) {
         var1 = 1;
      }

      return var3 * 31 + var1;
   }

   public override fun toString(): String {
      val var3: LoadMoreButton = this.button;
      val var1: Boolean = this.isLoading;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LoadingChatListItem(button=");
      var2.append(var3);
      var2.append(", isLoading=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
