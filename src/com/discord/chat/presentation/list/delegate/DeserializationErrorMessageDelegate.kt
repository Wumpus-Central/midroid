package com.discord.chat.presentation.list.delegate

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem
import com.discord.chat.presentation.message.ErrorMessageView
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.q

public class DeserializationErrorMessageDelegate(eventHandlerProvider: () -> ChatEventHandler)
   : BaseChatListItemDelegate<DeserializationErrorMessageItem, ErrorMessageView> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   @SuppressLint(["SetTextI18n"])
   public open fun bindView(view: ErrorMessageView, item: DeserializationErrorMessageItem, metadata: Metadata<ErrorMessageView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      val var4: LayoutParams = var1.getLayoutParams();
      q.f(var4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      (var4 as MarginLayoutParams).setMargins(SizeUtilsKt.getDpToPx(16), 0, SizeUtilsKt.getDpToPx(16), 0);
      var1.setErrorMessage(var2.getMessage());
   }

   public open fun createView(parent: ViewGroup): ErrorMessageView {
      q.h(var1, "parent");
      val var3: Context = var1.getContext();
      q.g(var3, "getContext(...)");
      val var4: ErrorMessageView = new ErrorMessageView(var3, null, 2, null);
      val var2: Int = SizeUtilsKt.getDpToPx(8);
      var4.setPadding(var2, var2, var2, var2);
      return var4;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is DeserializationErrorMessageItem;
   }
}
