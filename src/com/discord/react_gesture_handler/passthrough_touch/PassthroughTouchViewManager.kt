package com.discord.react_gesture_handler.passthrough_touch

import com.discord.react_gesture_handler.passthrough_touch.events.OnTouchDownData
import com.discord.reactevents.ReactEvents
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerDelegate
import com.facebook.react.viewmanagers.PassthroughTouchViewManagerInterface
import xa.v

@ReactModule(name = "PassthroughTouchView")
internal class PassthroughTouchViewManager : ViewGroupManager<PassthroughTouchViewGroup>, PassthroughTouchViewManagerInterface<PassthroughTouchViewGroup> {
   private final val mDelegate: PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> =
      new PassthroughTouchViewManagerDelegate(this)
      private final val reactEvents: ReactEvents = new ReactEvents(v.a("onTouchDown", OnTouchDownData::class))

   @JvmStatic
   fun `createViewInstance$lambda$1$lambda$0`(var0: PassthroughTouchViewManager, var1: ThemedReactContext, var2: PassthroughTouchViewGroup): Unit {
      var0.reactEvents.emitEvent(var1, var2, new OnTouchDownData());
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): PassthroughTouchViewGroup {
      val var2: PassthroughTouchViewGroup = new PassthroughTouchViewGroup(var1);
      var2.setOnTouchDown(new b(this, var1, var2));
      return var2;
   }

   protected open fun getDelegate(): PassthroughTouchViewManagerDelegate<PassthroughTouchViewGroup, PassthroughTouchViewManager> {
      return this.mDelegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "PassthroughTouchView";
   }

   public companion object {
      public const val NAME: String
   }
}
