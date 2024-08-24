package com.discord.keyboard

import android.app.Activity
import android.view.View
import android.view.Window
import com.discord.codegen.NativeKeyboardManagerSpec
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r
import l3.a

public class KeyboardManagerModule(reactContext: ReactApplicationContext) : NativeKeyboardManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `onKeyboardChanged$lambda$0`(var0: Boolean) {
      KeyboardManager.INSTANCE.onKeyboardChanged$keyboard_release(var0);
   }

   public open fun clearCurrentFocusAndDismissKeyboard() {
      val var1: Window = ViewUtilsKt.getWindow(this.getReactApplicationContext());
      if (var1 != null) {
         val var2: View = var1.getCurrentFocus();
         if (var2 != null) {
            var2.clearFocus();
         }
      }

      this.dismissGlobalKeyboard();
   }

   public open fun dismissGlobalKeyboard() {
      val var1: Activity = this.getCurrentActivity();
      if (var1 != null) {
         KeyboardExtensionsKt.hideKeyboard(var1);
      }
   }

   public open fun getName(): String {
      return "RTNKeyboardManager";
   }

   public open fun onKeyboardChanged(opened: Boolean) {
      this.getReactApplicationContext().runOnUiQueueThread(new a(var1));
   }

   public companion object {
      public const val NAME: String
   }
}
