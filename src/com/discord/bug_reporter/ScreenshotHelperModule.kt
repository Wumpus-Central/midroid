package com.discord.bug_reporter

import android.content.ContentResolver
import ch.w
import com.discord.bug_reporter.react.events.ScreenshotTakenEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class ScreenshotHelperModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val reactLifecycleEventListener: <unrepresentable>
   private final var screenshotDetector: ScreenshotDetector?

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(w.a("screenshotTaken", g0.b(ScreenshotTakenEvent.class)));
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

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
      if (this.screenshotDetector != null) {
         this.screenshotDetector
            .setScreenshotListener(
               new Function0(this) {
                  final ScreenshotHelperModule this$0;

                  {
                     super(0);
                     this.this$0 = var1;
                  }

                  public final void invoke() {
                     ScreenshotHelperModule.access$getReactEvents$p(this.this$0)
                        .emitModuleEvent(ScreenshotHelperModule.access$getReactContext$p(this.this$0), new ScreenshotTakenEvent());
                  }
               }
            );
      }
   }

   public open fun getName(): String {
      return "ScreenshotHelper";
   }

   public open fun initialize() {
      super.initialize();
      val var1: ContentResolver = this.reactContext.getContentResolver();
      q.g(var1, "getContentResolver(...)");
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
