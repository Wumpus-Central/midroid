package com.discord.chat

import android.view.ViewGroup
import com.discord.chat.messagemanager.MessageViewManagers
import com.discord.chat.presentation.list.ChatListViewManager
import com.discord.chat.presentation.root.ChatViewManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.BaseViewManager
import com.facebook.react.uimanager.LayoutShadowNode
import kotlin.jvm.internal.r

public class ChatPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): MutableList<ChatModule> {
      r.h(var1, "reactContext");
      return h.o(new ChatModule[]{new ChatModule(var1)});
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): MutableList<BaseViewManager<out ViewGroup, LayoutShadowNode>> {
      r.h(var1, "reactContext");
      return h.o(
         new BaseViewManager[]{
            new ChatViewManager(),
            new ChatListViewManager(),
            new MessageViewManagers.MessageViewManager(),
            new MessageViewManagers.MessageBundleViewManager(),
            new MessageViewManagers.SystemMessageViewManager(),
            new MessageViewManagers.GuildMultilineSystemMessageViewManager()
         }
      );
   }
}
