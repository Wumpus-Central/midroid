package com.discord.chat.presentation.list

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.viewmanagers.DCDChatListManagerDelegate
import com.facebook.react.viewmanagers.DCDChatListManagerInterface
import kotlin.jvm.internal.r

@ReactModule(name = "DCDChatList")
public class ChatListViewManager : SimpleViewManager<ChatListView>, DCDChatListManagerInterface<ChatListView> {
   private final val mDelegate: DCDChatListManagerDelegate<ChatListView, ChatListViewManager> = new DCDChatListManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChatListView {
      r.h(var1, "reactContext");
      return new ChatListView(var1, null, 0, 6, null);
   }

   protected open fun getDelegate(): DCDChatListManagerDelegate<ChatListView, ChatListViewManager> {
      return this.mDelegate;
   }

   public open fun getName(): String {
      return "DCDChatList";
   }

   public open fun onDropViewInstance(view: ChatListView) {
      r.h(var1, "view");
      var1.cleanup();
      super.onDropViewInstance(var1);
   }

   public companion object {
      public const val NAME: String
   }
}
