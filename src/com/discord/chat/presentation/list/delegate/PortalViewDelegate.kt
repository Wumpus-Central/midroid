package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListFrameLayout
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.PortalViewChatListItem
import com.discord.portals.utils.ViewRemoveFromParentKt
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nPortalViewDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PortalViewDelegate.kt\ncom/discord/chat/presentation/list/delegate/PortalViewDelegate\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n257#2,2:73\n327#2,4:75\n*S KotlinDebug\n*F\n+ 1 PortalViewDelegate.kt\ncom/discord/chat/presentation/list/delegate/PortalViewDelegate\n*L\n33#1:73,2\n39#1:75,4\n*E\n"])
public class PortalViewDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate(var1, null, 2) {
   @JvmStatic
   fun `bindView$lambda$2`(var0: PortalViewChatListItem, var1: ChatListFrameLayout) {
      if (var0.getView().getParent() == null) {
         var1.addView(var0.getView());
      }
   }

   public open fun bindView(view: ChatListFrameLayout, item: PortalViewChatListItem, metadata: Metadata<ChatListFrameLayout>) {
      var2.getView().setVisibility(0);
      ViewRemoveFromParentKt.removeFromParent(var2.getView());
      if (var2.getMeasuredDimensions() != null) {
         val var7: Pair = var2.getMeasuredDimensions();
         val var4: Int = (var7.a() as java.lang.Number).intValue();
         val var5: Int = (var7.b() as java.lang.Number).intValue();
         val var8: View = var2.getView();
         val var6: LayoutParams = var8.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var6.width = var4;
         var6.height = var5;
         var8.setLayoutParams(var6);
      }

      var1.removeAllViews();
      if (var2.getView().getParent() == null) {
         var1.addView(var2.getView());
      } else {
         var1.post(new d(var2, var1));
      }
   }

   public open fun createView(parent: ViewGroup): ChatListFrameLayout {
      val var2: Context = var1.getContext();
      return new ChatListFrameLayout(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is PortalViewChatListItem;
   }

   protected open fun onViewDetachedFromWindow(holder: ViewHolder) {
      val var3: ChatListFrameLayout;
      if (var1.itemView is ChatListFrameLayout) {
         var3 = var1.itemView as ChatListFrameLayout;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var3.removeAllViews();
         ViewRemoveFromParentKt.removeFromParent(var3);
      }
   }
}
