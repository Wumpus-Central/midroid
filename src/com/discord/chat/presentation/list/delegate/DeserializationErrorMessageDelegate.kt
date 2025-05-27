package com.discord.chat.presentation.list.delegate

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.BaseChatListAdapter
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem
import com.discord.chat.presentation.message.ErrorMessageView
import com.discord.misc.utilities.size.SizeUtilsKt
import java.util.ArrayList
import kotlin.jvm.internal.q

public class DeserializationErrorMessageDelegate(eventHandlerProvider: () -> ChatEventHandler)
   : BaseChatListItemDelegate<DeserializationErrorMessageItem, ErrorMessageView> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   @JvmStatic
   fun `bindView$lambda$1`(var0: BaseChatListItemDelegate.Metadata, var1: DeserializationErrorMessageItem, var2: Boolean): Unit {
      val var5: RecyclerView.Adapter = var0.getHolder().getBindingAdapter();
      q.f(var5, "null cannot be cast to non-null type com.discord.chat.presentation.list.BaseChatListAdapter");
      val var13: BaseChatListAdapter = var5 as BaseChatListAdapter;
      val var4: Int = var0.getHolder().getBindingAdapterPosition();
      var1 = new DeserializationErrorMessageItem(var1.getMessage(), var2);
      var var8: Any = var13.getItems();
      q.g(var8, "getItems(...)");
      val var6: ArrayList = new ArrayList(i.v(var8 as java.lang.Iterable, 10));
      val var7: java.util.Iterator = (var8 as java.lang.Iterable).iterator();

      for (int var3 = 0; var7.hasNext(); var3++) {
         var8 = var7.next();
         if (var3 < 0) {
            i.u();
         }

         var8 = var8 as ChatListItem;
         if (var3 == var4) {
            var8 = var1;
         }

         var6.add(var8);
      }

      var13.setItems(var6);
      var13.notifyItemChanged(var4);
      return Unit.a;
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
      var1.setExpandInfo(var2.isExpanded(), new c(var3, var2));
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
