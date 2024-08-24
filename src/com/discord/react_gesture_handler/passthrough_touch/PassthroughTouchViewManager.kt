package com.discord.react_gesture_handler.passthrough_touch

import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData
import com.discord.reactevents.ReactEvents
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerDelegate
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerInterface
import eh.w
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

@ReactModule(name = "PassthroughTouchView")
internal class PassthroughTouchViewManager : ViewGroupManager<PassthroughTouchViewGroup>, PassthroughTouchViewManagerInterface<PassthroughTouchViewGroup> {
   private final val mDelegate: PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> =
      new PassthroughTouchViewManagerDelegate(this)
      private final val reactEvents: ReactEvents = new ReactEvents(w.a("onTouchDown", h0.b(OnTouchDownData.class)))

   protected open fun createViewInstance(reactContext: ThemedReactContext): PassthroughTouchViewGroup {
      r.h(var1, "reactContext");
      val var2: PassthroughTouchViewGroup = new PassthroughTouchViewGroup(var1);
      var2.setOnTouchDown(new Function0<Unit>(this, var1, var2) {
         final ThemedReactContext $reactContext;
         final PassthroughTouchViewGroup $this_apply;
         final PassthroughTouchViewManager this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$reactContext = var2;
            this.$this_apply = var3;
         }

         public final void invoke() {
            PassthroughTouchViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$reactContext, this.$this_apply, new OnTouchDownData());
         }
      });
      return var2;
   }

   protected open fun getDelegate(): PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> {
      return this.mDelegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "PassthroughTouchView";
   }

   public companion object {
      public const val NAME: String
   }
}
