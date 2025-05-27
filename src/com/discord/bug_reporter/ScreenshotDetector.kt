package com.discord.bug_reporter

import android.content.ContentResolver
import kotlin.jvm.internal.q

internal class ScreenshotDetector(contentResolver: ContentResolver) {
   private final val screenshotContentObserver: ScreenshotContentObserver

   public final var screenshotListener: (() -> Unit)?
      internal final set(value) {
         this.screenshotListener = var1;
         this.toggleScreenshotObserver();
      }


   public final var active: Boolean
      internal final set(value) {
         this.active = var1;
         this.toggleScreenshotObserver();
      }


   init {
      q.h(var1, "contentResolver");
      super();
      this.screenshotContentObserver = new ScreenshotContentObserver(var1, new a(this));
   }

   @JvmStatic
   fun `screenshotContentObserver$lambda$0`(var0: ScreenshotDetector): Unit {
      if (var0.screenshotListener != null) {
         var0.screenshotListener.invoke();
      }

      return Unit.a;
   }

   private fun toggleScreenshotObserver() {
      if (this.active && this.screenshotListener != null) {
         this.screenshotContentObserver.connect();
      } else {
         this.screenshotContentObserver.disconnect();
      }
   }
}
