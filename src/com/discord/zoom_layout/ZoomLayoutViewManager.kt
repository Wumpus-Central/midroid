package com.discord.zoom_layout

import android.graphics.Matrix
import ch.w
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
import com.otaliastudios.zoom.ZoomEngine
import com.otaliastudios.zoom.ZoomEngine.c
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

@ReactModule(name = "DCDZoomLayoutAndroid")
public class ZoomLayoutViewManager : ViewGroupManager<ZoomLayoutFixed>, DCDZoomLayoutAndroidManagerInterface<ZoomLayoutFixed> {
   private final val delegate: DCDZoomLayoutAndroidManagerDelegate<ZoomLayoutFixed, ZoomLayoutViewManager> = new DCDZoomLayoutAndroidManagerDelegate(this)
   internal final val reactEvents: ReactEvents = new ReactEvents(w.a("onZoomChanged", g0.b(OnZoomChangedEvent.class)))

   protected open fun createViewInstance(reactContext: ThemedReactContext): ZoomLayoutFixed {
      q.h(var1, "reactContext");
      val var2: ZoomLayoutFixed = new ZoomLayoutFixed(var1, null, 0, 6, null);
      var2.setOverScrollHorizontal(false);
      var2.setOverScrollVertical(false);
      var2.setOverPinchable(false);
      var2.getEngine()
         .l(
            new c(this, var1, var2) {
               final ThemedReactContext $reactContext;
               final ZoomLayoutFixed $zoomLayout;
               final ZoomLayoutViewManager this$0;

               {
                  this.this$0 = var1;
                  this.$reactContext = var2;
                  this.$zoomLayout = var3;
               }

               public void onIdle(ZoomEngine var1) {
                  q.h(var1, "engine");
               }

               public void onUpdate(ZoomEngine var1, Matrix var2) {
                  q.h(var1, "engine");
                  q.h(var2, "matrix");
                  this.this$0
                     .getReactEvents$zoom_layout_release()
                     .emitEvent(this.$reactContext, this.$zoomLayout, new OnZoomChangedEvent(this.$zoomLayout.getZoom()));
               }
            }
         );
      return var2;
   }

   protected open fun getDelegate(): ViewManagerDelegate<ZoomLayoutFixed>? {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDZoomLayoutAndroid";
   }

   public open fun receiveCommand(zoomLayout: ZoomLayoutFixed, commandId: String, args: ReadableArray?) {
      q.h(var1, "zoomLayout");
      q.h(var2, "commandId");
      if (q.c(var2, "zoomTo")) {
         if (var3 == null) {
            return;
         }

         this.zoomTo(var1, (float)var3.getDouble(0), (float)var3.getDouble(1));
      } else if (q.c(var2, "unzoom")) {
         this.unzoom(var1);
      }
   }

   @ReactProp(name = "gestureEnabled")
   public open fun setGestureEnabled(view: ZoomLayoutFixed, value: Boolean) {
      q.h(var1, "view");
      var1.setGestureEnabled(var2);
   }

   @ReactProp(name = "maximumZoomScale")
   public open fun setMaximumZoomScale(view: ZoomLayoutFixed, value: Float) {
      q.h(var1, "view");
      var1.setMaxZoom(var2);
   }

   @ReactProp(name = "minimumZoomScale")
   public open fun setMinimumZoomScale(view: ZoomLayoutFixed, value: Float) {
      q.h(var1, "view");
      var1.setMinZoom(var2);
   }

   public open fun unzoom(view: ZoomLayoutFixed) {
      q.h(var1, "view");
      var1.moveToCenter(1.0F, true);
   }

   public open fun zoomTo(view: ZoomLayoutFixed, x: Float, y: Float) {
      q.h(var1, "view");
      var1.moveTo(2.0F, var2, var3, true);
   }

   public companion object {
      private const val COMMAND_UN_ZOOM: String
      private const val COMMAND_ZOOM_TO: String
      public const val NAME: String
   }
}
