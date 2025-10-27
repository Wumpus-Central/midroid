package com.discord.core

import android.net.Uri
import com.discord.logging.Log
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerDelegate
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerInterface
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "DCDLocalImageThumbnail")
@SourceDebugExtension(["SMAP\nLocalImageThumbnailViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageThumbnailViewManager.kt\ncom/discord/core/LocalImageThumbnailViewManager\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,63:1\n29#2:64\n*S KotlinDebug\n*F\n+ 1 LocalImageThumbnailViewManager.kt\ncom/discord/core/LocalImageThumbnailViewManager\n*L\n38#1:64\n*E\n"])
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
         val var5: java.lang.String = var2.getString("uri");
         if (var5 != null) {
            val var10: Uri = Uri.parse(var5);
            if (var10 != null) {
               val var4: Int = (int)var2.getDouble("width");
               val var3: Int = (int)var2.getDouble("height");
               if (this.lastUri == var10 && this.lastWidthDp != null && this.lastWidthDp == var4 && this.lastHeightDp != null && this.lastHeightDp == var3) {
                  val var9: Log = Log.INSTANCE;
                  val var6: StringBuilder = new StringBuilder();
                  var6.append("\ud83d\udeab DUPLICATE PROPS - Skipping duplicate request for URI: ");
                  var6.append(var10);
                  var6.append(" - Size: ");
                  var6.append(var4);
                  var6.append("x");
                  var6.append(var3);
                  Log.i$default(var9, "LocalImageThumbnailViewManager", var6.toString(), null, 4, null);
                  return;
               }

               this.lastUri = var10;
               this.lastWidthDp = var4;
               this.lastHeightDp = var3;
               var1.setLocalImageSource(var10, var4, var3);
            }
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
