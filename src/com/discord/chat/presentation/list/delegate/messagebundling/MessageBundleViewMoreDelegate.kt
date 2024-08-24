package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import com.discord.chat.presentation.list.item.MessageBundleItem
import com.discord.chat.presentation.list.item.MessageBundleViewMoreItem
import com.discord.chat.presentation.list.messagebundling.MessageBundleViewMoreView
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import kotlin.jvm.internal.r

public class MessageBundleViewMoreDelegate(onMeasured: (View, Int, Int) -> Unit) : MessageBundleBaseDelegate {
   public final var onTapViewMoreText: OnClickListener

   init {
      r.h(var1, "onMeasured");
      super(var1);
      this.onTapViewMoreText = new b();
   }

   @JvmStatic
   fun `onTapViewMoreText$lambda$0`(var0: View) {
   }

   public open fun createView(context: Context): MessageBundleViewMoreView {
      r.h(var1, "context");
      return new MessageBundleViewMoreView(var1, null, 0, 6, null);
   }

   protected open fun isForViewType(items: List<MessageBundleItem>, position: Int): Boolean {
      r.h(var1, "items");
      return var1.get(var2) is MessageBundleViewMoreItem;
   }

   public override fun onBindViewHolder(view: View, item: MessageBundleItem, items: List<MessageBundleItem>, position: Int) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "items");
      if (var1 is TextView) {
         if (var2 is MessageBundleViewMoreItem) {
            val var5: TextView = var1 as TextView;
            (var1 as TextView).setText((var2 as MessageBundleViewMoreItem).getViewMoreText());
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, this.onTapViewMoreText, 1, null);
         }
      }
   }
}
