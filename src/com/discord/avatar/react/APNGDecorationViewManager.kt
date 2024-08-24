package com.discord.avatar.react

import com.discord.avatar.decoration.DecorationView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.APNGDecorationViewManagerDelegate
import com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
import kotlin.jvm.internal.r

@ReactModule(name = "APNGDecorationView")
internal class APNGDecorationViewManager : SimpleViewManager<DecorationView>, APNGDecorationViewManagerInterface<DecorationView> {
   private final val delegate: APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> = new APNGDecorationViewManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): DecorationView {
      r.h(var1, "reactContext");
      val var2: DecorationView = new DecorationView(var1, null, 0, 6, null);
      var2.inflateApngView(false);
      return var2;
   }

   protected open fun getDelegate(): APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "APNGDecorationView";
   }

   public open fun onDropViewInstance(view: DecorationView) {
      r.h(var1, "view");
      var1.recycle();
   }

   @ReactProp(name = "url")
   public open fun setUrl(view: DecorationView, value: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.asDecoration(var2, null, null, true);
      }
   }

   public companion object {
      public const val NAME: String
   }
}
