package com.discord.chat

import com.discord.chat.messagemanager.MessageViewManagers
import com.discord.chat.presentation.list.ChatListViewManager
import com.discord.chat.presentation.root.ChatViewManager
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.q

public class ChatPackage : BaseReactPackage {
   public override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      q.h(var1, "reactContext");
      return i.n(
         new ViewManager[]{
            new ChatViewManager(),
            new ChatListViewManager(),
            new MessageViewManagers.MessageViewManager(),
            new MessageViewManagers.MessageBundleViewManager(),
            new MessageViewManagers.SystemMessageViewManager(),
            new MessageViewManagers.GuildMultilineSystemMessageViewManager(),
            new MessageViewManagers.AutoModerationSystemMessageViewManager()
         }
      );
   }

   public override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      q.h(var1, "name");
      q.h(var2, "reactContext");
      val var3: ChatModule;
      if (q.c(var1, "NativeChatModule")) {
         var3 = new ChatModule(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(i.e("NativeChatModule"), false, 2, null);
   }
}
