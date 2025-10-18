package com.discord.zoom_layout

import Da.v
import com.discord.reactevents.ReactEvents
import com.discord.zoom_layout.reactevents.OnZoomChangedEvent
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDZoomLayoutAndroidManagerDelegate
import com.facebook.react.viewmanagers.DCDZoomLayoutAndroidManagerInterface

@ReactModule(name = "DCDZoomLayoutAndroid")
internal class ZoomLayoutViewManager : ViewGroupManager<ZoomLayoutFixed>, DCDZoomLayoutAndroidManagerInterface<ZoomLayoutFixed> {
   private final val delegate: DCDZoomLayoutAndroidManagerDelegate<ZoomLayoutFixed, ZoomLayoutViewManager> = new DCDZoomLayoutAndroidManagerDelegate(this)
   private final val reactEvents: ReactEvents = new ReactEvents(v.a("onZoomChanged", OnZoomChangedEvent::class))

   @JvmStatic
   fun `createViewInstance$lambda$0`(var0: ZoomLayoutViewManager, var1: ZoomLayoutFixed): Unit {
      var0.reactEvents.emitEvent(var1, new OnZoomChangedEvent(var1.getZoom()));
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): ZoomLayoutFixed {
      return new ZoomLayoutFixed(var1, new c(this));
   }

   protected override fun getDelegate(): ViewManagerDelegate<ZoomLayoutFixed> {
      return this.delegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "DCDZoomLayoutAndroid";
   }

   public open fun receiveCommand(zoomLayout: ZoomLayoutFixed, commandId: String, args: ReadableArray?) {
      if (var2 == "zoomTo") {
         if (var3 == null) {
            return;
         }

         this.zoomTo(var1, (float)var3.getDouble(0), (float)var3.getDouble(1));
      } else if (var2 == "unzoom") {
         this.unzoom(var1);
      }
   }

   @ReactProp(name = "gestureEnabled")
   public open fun setGestureEnabled(view: ZoomLayoutFixed, value: Boolean) {
      var1.setGestureEnabled(var2);
   }

   @ReactProp(name = "maximumZoomScale")
   public open fun setMaximumZoomScale(view: ZoomLayoutFixed, value: Float) {
      var1.setMaxZoom(var2);
   }

   @ReactProp(name = "minimumZoomScale")
   public open fun setMinimumZoomScale(view: ZoomLayoutFixed, value: Float) {
      var1.setMinZoom(var2);
   }

   public open fun unzoom(view: ZoomLayoutFixed) {
      var1.moveToCenter(1.0F, true);
   }

   public open fun zoomTo(view: ZoomLayoutFixed, x: Float, y: Float) {
      var1.moveTo(2.0F, var2, var3, true);
   }

   public companion object {
      private const val COMMAND_ZOOM_TO: String
      private const val COMMAND_UN_ZOOM: String
      public const val NAME: String
   }
}
