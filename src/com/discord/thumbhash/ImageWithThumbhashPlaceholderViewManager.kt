package com.discord.thumbhash

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDImageWithThumbhashPlaceholderViewManagerInterface
import kotlin.jvm.internal.q

@ReactModule(name = "DCDImageWithThumbhashPlaceholderView")
public class ImageWithThumbhashPlaceholderViewManager
   : SimpleViewManager<ImageWithThumbhashPlaceholderView>,
   DCDImageWithThumbhashPlaceholderViewManagerInterface<ImageWithThumbhashPlaceholderView> {
   protected open fun createViewInstance(reactContext: ThemedReactContext): ImageWithThumbhashPlaceholderView {
      q.h(var1, "reactContext");
      return new ImageWithThumbhashPlaceholderView(var1, null, 2, null);
   }

   public open fun getName(): String {
      return "DCDImageWithThumbhashPlaceholderView";
   }

   @ReactProp(name = "alt")
   public open fun setAlt(view: ImageWithThumbhashPlaceholderView?, alt: String?) {
      if (var1 != null) {
         var1.setAlt(var2);
      }
   }

   @ReactProp(name = "placeholder")
   public open fun setPlaceholder(view: ImageWithThumbhashPlaceholderView, placeholder: String?) {
      q.h(var1, "view");
      var1.setPlaceholder(var2);
   }

   @ReactProp(name = "placeholderVersion")
   public open fun setPlaceholderVersion(view: ImageWithThumbhashPlaceholderView, placeholderVersion: Int) {
      q.h(var1, "view");
      var1.setPlaceholderVersion(var2);
   }

   @ReactProp(name = "uri")
   public open fun setUri(view: ImageWithThumbhashPlaceholderView, uri: String?) {
      q.h(var1, "view");
      var1.setUri(var2);
   }

   public companion object {
      public const val NAME: String
   }
}
