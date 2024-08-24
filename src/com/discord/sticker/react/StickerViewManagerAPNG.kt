package com.discord.sticker.react

import com.discord.image.animated_image.apng.APNGImageView
import com.discord.sticker.StickerView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.APNGStickerViewManagerDelegate
import com.facebook.react.viewmanagers.APNGStickerViewManagerInterface
import kotlin.jvm.internal.r

@ReactModule(name = "APNGStickerView")
internal class StickerViewManagerAPNG : SimpleViewManager<StickerView>, APNGStickerViewManagerInterface<StickerView> {
   private final val delegate: APNGStickerViewManagerDelegate<StickerView, StickerViewManagerAPNG> = new APNGStickerViewManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): StickerView {
      r.h(var1, "reactContext");
      val var2: StickerView = new StickerView(var1, null, 0, 6, null);
      APNGImageView.inflateApngView$default(var2, false, 1, null);
      return var2;
   }

   protected open fun getDelegate(): APNGStickerViewManagerDelegate<StickerView, StickerViewManagerAPNG> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "APNGStickerView";
   }

   public open fun onDropViewInstance(view: StickerView) {
      r.h(var1, "view");
      super.onDropViewInstance(var1);
      var1.recycle();
   }

   @ReactProp(name = "url")
   public open fun setUrl(view: StickerView, value: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.asApng(var2, null, null, true);
      }
   }

   public companion object {
      public const val NAME: String
   }
}
