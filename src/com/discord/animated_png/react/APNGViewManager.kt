package com.discord.animated_png.react

import com.discord.animated_png.APNGManagedView
import com.discord.image.animated_image.apng.APNGImageView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.APNGViewManagerDelegate
import com.facebook.react.viewmanagers.APNGViewManagerInterface
import kotlin.jvm.internal.r

@ReactModule(name = "APNGView")
internal class APNGViewManager : SimpleViewManager<APNGManagedView>, APNGViewManagerInterface<APNGManagedView> {
   private final val delegate: APNGViewManagerDelegate<APNGManagedView, APNGViewManager> = new APNGViewManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): APNGManagedView {
      r.h(var1, "reactContext");
      val var2: APNGManagedView = new APNGManagedView(var1, null, 0, 6, null);
      APNGImageView.inflateApngView$default(var2, false, 1, null);
      return var2;
   }

   protected open fun getDelegate(): APNGViewManagerDelegate<APNGManagedView, APNGViewManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "APNGView";
   }

   public open fun onDropViewInstance(view: APNGManagedView) {
      r.h(var1, "view");
      super.onDropViewInstance(var1);
      var1.recycle();
   }

   @ReactProp(name = "url")
   public open fun setUrl(view: APNGManagedView, value: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.asApng(var2);
      }
   }

   public companion object {
      public const val NAME: String
   }
}
