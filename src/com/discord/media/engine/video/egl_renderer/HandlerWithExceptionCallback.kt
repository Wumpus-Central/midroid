package com.discord.media.engine.video.egl_renderer

import android.os.Handler
import android.os.Looper
import android.os.Message
import kotlin.jvm.internal.r

internal class HandlerWithExceptionCallback(looper: Looper, exceptionCallback: (Exception) -> Unit) : Handler {
   private final val exceptionCallback: (Exception) -> Unit

   init {
      r.h(var1, "looper");
      r.h(var2, "exceptionCallback");
      super(var1);
      this.exceptionCallback = var2;
   }

   public open fun dispatchMessage(msg: Message) {
      r.h(var1, "msg");

      try {
         super.dispatchMessage(var1);
      } catch (var2: Exception) {
         this.exceptionCallback.invoke(var2);
         throw var2;
      }
   }
}
