package com.discord.bug_reporter

import android.content.ContentResolver
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

internal class ScreenshotDetector(contentResolver: ContentResolver) {
   public final var active: Boolean
      internal final set(value) {
         this.active = var1;
         this.toggleScreenshotObserver();
      }


   private final val screenshotContentObserver: ScreenshotContentObserver

   public final var screenshotListener: (() -> Unit)?
      internal final set(value) {
         this.screenshotListener = var1;
         this.toggleScreenshotObserver();
      }


   init {
      r.h(var1, "contentResolver");
      super();
      this.screenshotContentObserver = new ScreenshotContentObserver(var1, new Function0<Unit>(this) {
         final ScreenshotDetector this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            val var1: Function0 = this.this$0.getScreenshotListener();
            if (var1 != null) {
               var1.invoke();
            }
         }
      });
   }

   private fun toggleScreenshotObserver() {
      if (this.active && this.screenshotListener != null) {
         this.screenshotContentObserver.connect();
      } else {
         this.screenshotContentObserver.disconnect();
      }
   }
}
