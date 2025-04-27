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
import kotlin.jvm.functions.Function1
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
      var1.setExpandInfo(var2.isExpanded(), new Function1(var3, var2) {
         final DeserializationErrorMessageItem $item;
         final BaseChatListItemDelegate.Metadata<ErrorMessageView> $metadata;

         {
            super(1);
            this.$metadata = var1;
            this.$item = var2;
         }

         public final void invoke(boolean var1) {
            var var4: RecyclerView.Adapter = this.$metadata.getHolder().getBindingAdapter();
            q.f(var4, "null cannot be cast to non-null type com.discord.chat.presentation.list.BaseChatListAdapter");
            val var6: BaseChatListAdapter = var4 as BaseChatListAdapter;
            val var3: Int = this.$metadata.getHolder().getBindingAdapterPosition();
            val var5: DeserializationErrorMessageItem = new DeserializationErrorMessageItem(this.$item.getMessage(), var1);
            var4 = (RecyclerView.Adapter)var6.getItems();
            q.g(var4, "getItems(...)");
            val var7: ArrayList = new ArrayList(i.v(var4 as java.lang.Iterable, 10));
            val var8: java.util.Iterator = (var4 as java.lang.Iterable).iterator();

            for (int var2 = 0; var8.hasNext(); var2++) {
               var4 = (RecyclerView.Adapter)var8.next();
               if (var2 < 0) {
                  i.u();
               }

               var4 = var4 as ChatListItem;
               if (var2 == var3) {
                  var4 = var5;
               }

               var7.add(var4);
            }

            var6.setItems(var7);
            var6.notifyItemChanged(var3);
         }
      });
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
