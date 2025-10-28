package com.discord.core

import android.net.Uri
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerDelegate
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerInterface

@ReactModule(name = "DCDLocalImageThumbnail")
public class LocalImageThumbnailViewManager : SimpleViewManager<LocalImageThumbnailView>, DCDLocalImageThumbnailManagerInterface<LocalImageThumbnailView> {
   private final val mDelegate: DCDLocalImageThumbnailManagerDelegate<LocalImageThumbnailView, LocalImageThumbnailViewManager> =
      new DCDLocalImageThumbnailManagerDelegate(this)
      private final var lastUri: Uri?
   private final var lastWidthDp: Int?
   private final var lastHeightDp: Int?

   protected open fun createViewInstance(reactContext: ThemedReactContext): LocalImageThumbnailView {
      return new LocalImageThumbnailView(var1, null, 0, 6, null);
   }

   protected open fun getDelegate(): DCDLocalImageThumbnailManagerDelegate<LocalImageThumbnailView, LocalImageThumbnailViewManager> {
      return this.mDelegate;
   }

   public open fun getName(): String {
      return "DCDLocalImageThumbnail";
   }

   @ReactProp(name = "localImageSource")
   public open fun setLocalImageSource(view: LocalImageThumbnailView, source: ReadableMap?) {
      if (var2 != null) {
         val var5: Uri = Uri.parse(var2.getString("uri"));
         val var4: Int = (int)var2.getDouble("width");
         val var3: Int = (int)var2.getDouble("height");
         if (this.lastUri == var5 && this.lastWidthDp != null && this.lastWidthDp == var4 && this.lastHeightDp != null && this.lastHeightDp == var3) {
            return;
         } else {
            this.lastUri = var5;
            this.lastWidthDp = var4;
            this.lastHeightDp = var3;
            var1.setLocalImageSource(var5, var4, var3);
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
