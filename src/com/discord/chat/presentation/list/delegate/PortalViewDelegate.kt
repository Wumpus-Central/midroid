package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListFrameLayout
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.PortalViewChatListItem
import com.discord.portals.utils.ViewRemoveFromParentKt
import kotlin.jvm.internal.q

public class PortalViewDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate<PortalViewChatListItem, ChatListFrameLayout> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: ChatListFrameLayout, item: PortalViewChatListItem, metadata: Metadata<ChatListFrameLayout>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var2.getView().setVisibility(0);
      ViewRemoveFromParentKt.removeFromParent(var2.getView());
      if (var2.getMeasuredDimensions() != null) {
         val var7: Pair = var2.getMeasuredDimensions();
         val var5: Int = (var7.a() as java.lang.Number).intValue();
         val var4: Int = (var7.b() as java.lang.Number).intValue();
         val var6: View = var2.getView();
         val var8: LayoutParams = var6.getLayoutParams();
         if (var8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var8.width = var5;
         var8.height = var4;
         var6.setLayoutParams(var8);
      }

      var1.removeAllViews();
      var1.addView(var2.getView());
   }

   public open fun createView(parent: ViewGroup): ChatListFrameLayout {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      return new ChatListFrameLayout(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is PortalViewChatListItem;
   }
}
