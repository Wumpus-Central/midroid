package com.discord.keyboard

import O1.a
import android.app.Activity
import android.view.View
import android.view.Window
import com.discord.codegen.NativeKeyboardModuleSpec
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.facebook.react.bridge.ReactApplicationContext

public class KeyboardModule(reactContext: ReactApplicationContext) : NativeKeyboardModuleSpec(var1) {
   public final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `onKeyboardChanged$lambda$0`(var0: Boolean) {
      KeyboardManager.INSTANCE.onKeyboardChanged$keyboard_release(var0);
   }

   public override fun clearCurrentFocusAndDismissKeyboard() {
      val var1: Window = ViewUtilsKt.getWindow(this.getReactApplicationContext());
      if (var1 != null) {
         val var2: View = var1.getCurrentFocus();
         if (var2 != null) {
            var2.clearFocus();
         }
      }

      this.dismissGlobalKeyboard();
   }

   public override fun dismissGlobalKeyboard() {
      val var1: Activity = this.reactContext.getCurrentActivity();
      if (var1 != null) {
         KeyboardExtensionsKt.hideKeyboard(var1);
      }
   }

   public override fun onKeyboardChanged(opened: Boolean) {
      this.getReactApplicationContext().runOnUiQueueThread(new a(var1));
   }
}
