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
import kotlin.jvm.internal.r

public class PortalViewDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate<PortalViewChatListItem, ChatListFrameLayout> {
   init {
      r.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: ChatListFrameLayout, item: PortalViewChatListItem, metadata: Metadata<ChatListFrameLayout>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var2.getView().setVisibility(0);
      ViewRemoveFromParentKt.removeFromParent(var2.getView());
      if (var2.getMeasuredDimensions() != null) {
         val var7: Pair = var2.getMeasuredDimensions();
         val var5: Int = (var7.a() as java.lang.Number).intValue();
         val var4: Int = (var7.b() as java.lang.Number).intValue();
         val var8: View = var2.getView();
         val var6: LayoutParams = var8.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var6.width = var5;
         var6.height = var4;
         var8.setLayoutParams(var6);
      }

      var1.removeAllViews();
      var1.addView(var2.getView());
   }

   public open fun createView(parent: ViewGroup): ChatListFrameLayout {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      return new ChatListFrameLayout(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is PortalViewChatListItem;
   }
}
