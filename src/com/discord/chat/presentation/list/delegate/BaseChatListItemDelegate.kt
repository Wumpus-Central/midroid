package com.discord.chat.presentation.list.delegate

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.item.ChatListItem

public abstract class BaseChatListItemDelegate<T extends ChatListItem, V extends View> : com.hannesdorfmann.adapterdelegates4.b {
   private final val eventHandlerProvider: () -> ChatEventHandler
   private final val initBlock: (Any) -> Unit

   protected final val eventHandler: ChatEventHandler
      protected final get() {
         return this.eventHandlerProvider.invoke() as ChatEventHandler;
      }


   open fun BaseChatListItemDelegate(var1: () -> ChatEventHandler, var2: (V?) -> Unit) {
      this.eventHandlerProvider = var1;
      this.initBlock = var2;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: View): Unit {
      var0.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
      return Unit.a;
   }

   public abstract fun bindView(view: Any, item: Any, metadata: com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata<Any>) {
   }

   public abstract fun createView(parent: ViewGroup): Any {
   }

   public abstract fun isForItem(item: ChatListItem, position: Int): Boolean {
   }

   protected fun isForViewType(items: List<ChatListItem>, position: Int): Boolean {
      return this.isForItem(var1.get(var2) as ChatListItem, var2);
   }

   protected fun onBindViewHolder(items: List<ChatListItem>, position: Int, holder: ViewHolder, payloads: List<Any>) {
      val var7: ChatListItemViewHolder = var3 as ChatListItemViewHolder;
      val var5: Any = var1.get(var2);
      this.bindView((V)var7.getView(), (T)var5, new BaseChatListItemDelegate.Metadata<>(var7, var1, var4));
   }

   protected fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
      val var2: View = this.createView(var1);
      this.initBlock.invoke(var2);
      return new ChatListItemViewHolder<>(var2);
   }

   public data class Metadata<V extends View>(holder: ChatListItemViewHolder<Any>, items: List<ChatListItem>, payloads: List<Any>) {
      public final val holder: ChatListItemViewHolder<Any>
      public final val items: List<ChatListItem>
      public final val payloads: List<Any>

      init {
         this.holder = var1;
         this.items = var2;
         this.payloads = var3;
      }

      public operator fun component1(): ChatListItemViewHolder<Any> {
         return this.holder;
      }

      public operator fun component2(): List<ChatListItem> {
         return this.items;
      }

      public operator fun component3(): List<Any> {
         return this.payloads;
      }

      public fun copy(holder: ChatListItemViewHolder<Any> = var0.holder, items: List<ChatListItem> = var0.items, payloads: List<Any> = var0.payloads): com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata<
            Any
         > {
         return new BaseChatListItemDelegate.Metadata<>(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is BaseChatListItemDelegate.Metadata) {
            return false;
         } else {
            var1 = var1;
            if (!(this.holder == var1.holder)) {
               return false;
            } else if (!(this.items == var1.items)) {
               return false;
            } else {
               return this.payloads == var1.payloads;
            }
         }
      }

      public override fun hashCode(): Int {
         return (this.holder.hashCode() * 31 + this.items.hashCode()) * 31 + this.payloads.hashCode();
      }

      public override fun toString(): String {
         val var4: ChatListItemViewHolder = this.holder;
         val var3: java.util.List = this.items;
         val var1: java.util.List = this.payloads;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Metadata(holder=");
         var2.append(var4);
         var2.append(", items=");
         var2.append(var3);
         var2.append(", payloads=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }
}
