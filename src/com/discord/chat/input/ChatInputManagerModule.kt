package com.discord.chat.input

import com.discord.chat.input.views.ChatInputRootView
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.UIManager
import com.facebook.react.uimanager.IllegalViewOperationException
import com.facebook.react.uimanager.UIManagerHelper
import com.facebook.react.uimanager.common.ViewUtil
import kotlin.jvm.internal.q

public class ChatInputManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmStatic
   fun `getText$lambda$0`(var0: Int, var1: ChatInputManagerModule, var2: Promise) {
      q.h(var1, "this$0");
      q.h(var2, "$promise");
      val var3: Int = ViewUtil.getUIManagerType(var0);
      val var8: UIManager = UIManagerHelper.getUIManager(var1.getReactApplicationContext(), var3);

      try {
         q.e(var8);
         var9 = var8.resolveView(var0);
      } catch (var7: IllegalViewOperationException) {
         var2.reject(var7);
         return;
      }

      if (var9 == null) {
         try {
            val var10: StringBuilder = new StringBuilder();
            var10.append("View not found for tag ");
            var10.append(var0);
            var10.append(" of UIManagerType ");
            var10.append(var3);
            var2.reject(new Exception(var10.toString()));
         } catch (var6: IllegalViewOperationException) {
            var2.reject(var6);
         }
      } else {
         try {
            var2.resolve((var9 as ChatInputRootView).getText());
         } catch (var5: IllegalViewOperationException) {
            var2.reject(var5);
         }
      }
   }

   @ReactMethod
   public fun disableAutocomplete(tag: Int) {
   }

   @ReactMethod
   public fun enableAutocomplete(tag: Int) {
   }

   public open fun getName(): String {
      return "DCDChatInputManager";
   }

   @ReactMethod
   public fun getText(tag: Int, promise: Promise) {
      q.h(var2, "promise");
      this.getReactApplicationContext().runOnUiQueueThread(new a(var1, this, var2));
   }
}
