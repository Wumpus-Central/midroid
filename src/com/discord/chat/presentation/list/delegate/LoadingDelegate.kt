package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.bridge.row.LoadMoreButton
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.LoadingChatListItem
import com.discord.chat.presentation.loading.ChatLoadingView
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import lj.p

public class LoadingDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate<LoadingChatListItem, ChatLoadingView> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: ChatLoadingView, item: LoadingChatListItem, metadata: Metadata<ChatLoadingView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      if (var2.isLoading()) {
         var1.showProgress();
      } else {
         val var7: LoadMoreButton = var2.getButton();
         val var4: Int = LoadingDelegate.WhenMappings.$EnumSwitchMapping$0[var2.getButton().getAction().getType().ordinal()];
         val var6: Function0;
         if (var4 != 1) {
            if (var4 != 2) {
               throw new p();
            }

            var6 = new Function0(this.getEventHandler()) {
               {
                  super(0, var1, ChatEventHandler::class.java, "onTapLoadMessagesAfter", "onTapLoadMessagesAfter()V", 0);
               }

               public final void invoke() {
                  (super.receiver as ChatEventHandler).onTapLoadMessagesAfter();
               }
            };
         } else {
            var6 = new Function0(this.getEventHandler()) {
               {
                  super(0, var1, ChatEventHandler::class.java, "onTapLoadMessagesBefore", "onTapLoadMessagesBefore()V", 0);
               }

               public final void invoke() {
                  (super.receiver as ChatEventHandler).onTapLoadMessagesBefore();
               }
            };
         }

         var1.showButton(var7, var6);
      }
   }

   public open fun createView(parent: ViewGroup): ChatLoadingView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      return new ChatLoadingView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is LoadingChatListItem;
   }
}
