package com.discord.media.engine.video.egl_renderer

import android.os.Handler
import android.os.Looper
import android.os.Message

internal class HandlerWithExceptionCallback(looper: Looper, exceptionCallback: (Exception) -> Unit) : Handler(var1) {
   private final val exceptionCallback: (Exception) -> Unit

   init {
      this.exceptionCallback = var2;
   }

   public open fun dispatchMessage(msg: Message) {
      try {
         super.dispatchMessage(var1);
      } catch (var2: Exception) {
         this.exceptionCallback.invoke(var2);
         throw var2;
      }
   }
}
