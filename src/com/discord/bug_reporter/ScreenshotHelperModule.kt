package com.discord.bug_reporter

import android.content.ContentResolver
import com.discord.bug_reporter.react.events.ScreenshotTakenEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import fm.v

public class ScreenshotHelperModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val reactLifecycleEventListener: <unrepresentable>
   private final var screenshotDetector: ScreenshotDetector?

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(new Pair[]{v.a("screenshotTaken", ScreenshotTakenEvent::class)});
      this.reactLifecycleEventListener = new LifecycleEventListener(this) {
         final ScreenshotHelperModule this$0;

         {
            this.this$0 = var1;
         }

         public void onHostDestroy() {
         }

         public void onHostPause() {
            val var1: ScreenshotDetector = ScreenshotHelperModule.access$getScreenshotDetector$p(this.this$0);
            if (var1 != null) {
               var1.setActive(false);
            }
         }

         public void onHostResume() {
            val var1: ScreenshotDetector = ScreenshotHelperModule.access$getScreenshotDetector$p(this.this$0);
            if (var1 != null) {
               var1.setActive(true);
            }
         }
      };
   }

   @JvmStatic
   fun `addListener$lambda$0`(var0: ScreenshotHelperModule): Unit {
      var0.reactEvents.emitModuleEvent(var0.reactContext, new ScreenshotTakenEvent());
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      if (this.screenshotDetector != null) {
         this.screenshotDetector.setScreenshotListener(new b(this));
      }
   }

   public open fun getName(): String {
      return "ScreenshotHelper";
   }

   public open fun initialize() {
      super.initialize();
      val var1: ContentResolver = this.reactContext.getContentResolver();
      this.screenshotDetector = new ScreenshotDetector(var1);
      this.reactContext.addLifecycleEventListener(this.reactLifecycleEventListener);
   }

   public open fun invalidate() {
      super.invalidate();
      this.reactContext.removeLifecycleEventListener(this.reactLifecycleEventListener);
      if (this.screenshotDetector != null) {
         this.screenshotDetector.setActive(false);
      }

      this.screenshotDetector = null;
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
      if (this.screenshotDetector != null) {
         this.screenshotDetector.setScreenshotListener(null);
      }
   }
}
