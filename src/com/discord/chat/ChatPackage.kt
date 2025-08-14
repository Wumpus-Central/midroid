package com.discord.chat

import com.discord.chat.messagemanager.MessageViewManagers
import com.discord.chat.presentation.list.ChatListViewManager
import com.discord.chat.presentation.message.view.botuikit.react.SelectActionComponentViewManager
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
      return CollectionsKt.n(
         new ViewManager[]{
            new ChatViewManager(),
            new ChatListViewManager(),
            new MessageViewManagers.MessageViewManager(),
            new MessageViewManagers.SystemMessageViewManager(),
            new MessageViewManagers.AutoModerationSystemMessageViewManager(),
            new SelectActionComponentViewManager()
         }
      );
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      val var3: ChatModule;
      if (var1 == "NativeChatModule") {
         var3 = new ChatModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(CollectionsKt.e("NativeChatModule"), false, 2, null);
   }
}
