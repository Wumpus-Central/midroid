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

   @JvmStatic
   fun `bindView$lambda$2`(var0: PortalViewChatListItem, var1: ChatListFrameLayout) {
      ViewRemoveFromParentKt.removeFromParent(var0.getView());
      if (var0.getMeasuredDimensions() != null) {
         val var4: Pair = var0.getMeasuredDimensions();
         val var3: Int = (var4.a() as java.lang.Number).intValue();
         val var2: Int = (var4.b() as java.lang.Number).intValue();
         val var5: View = var0.getView();
         val var6: LayoutParams = var5.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var6.width = var3;
         var6.height = var2;
         var5.setLayoutParams(var6);
      }

      var1.removeAllViews();
      var1.addView(var0.getView());
   }

   public open fun bindView(view: ChatListFrameLayout, item: PortalViewChatListItem, metadata: Metadata<ChatListFrameLayout>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var2.getView().setVisibility(0);
      var1.post(new d(var2, var1));
   }

   public open fun createView(parent: ViewGroup): ChatListFrameLayout {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "getContext(...)");
      return new ChatListFrameLayout(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is PortalViewChatListItem;
   }
}
