package com.discord.chat

import com.discord.chat.messagemanager.MessageViewManagers
import com.discord.chat.presentation.list.ChatListViewManager
import com.discord.chat.presentation.message.view.botuikit.react.SelectActionComponentViewManager
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager
import com.discord.chat.presentation.root.ChatViewManager
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager

public class ChatPackage : BaseReactPackage {
   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      return CollectionsKt.o(
         new ViewManager[]{
            new ChatViewManager(),
            new ChatListViewManager(),
            new MessageViewManagers.MessageViewManager(),
            new MessageViewManagers.SystemMessageViewManager(),
            new MessageViewManagers.AutoModerationSystemMessageViewManager(),
            new SelectActionComponentViewManager(),
            new TextDisplayComponentViewManager()
         }
      );
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      return if (var1 == "NativeChatModule") new ChatModule(var2) else null;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(CollectionsKt.e("NativeChatModule"), false, 2, null);
   }
}
