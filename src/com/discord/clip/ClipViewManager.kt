package com.discord.clip

import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.ClipViewManagerDelegate
import com.facebook.react.viewmanagers.ClipViewManagerInterface
import k8.n
import kotlin.jvm.internal.q

@ReactModule(name = "ClipView")
public class ClipViewManager : ViewGroupManager<ClipView>, ClipViewManagerInterface<ClipView> {
   private final val delegate: ClipViewManagerDelegate<ClipView, ClipViewManager> = new ClipViewManagerDelegate(this)

   protected open fun createViewInstance(context: ThemedReactContext): ClipView {
      q.h(var1, "context");
      return new ClipView(var1);
   }

   protected open fun getDelegate(): ClipViewManagerDelegate<ClipView, ClipViewManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "ClipView";
   }

   @ReactProp(name = "backgroundColor")
   public open fun setBackgroundColor(view: ClipView, backgroundColor: Int) {
      q.h(var1, "view");
      var1.setBackgroundColor(var2);
   }

   @ReactProp(name = "borderRadius")
   public open fun setBorderRadius(view: ClipView, borderRadius: Int) {
      q.h(var1, "view");
      var1.clipToBorderRadius((float)SizeUtilsKt.getDpToPx(var2));
   }

   @ReactProp(name = "clipToCircle")
   public open fun setClipToCircle(view: ClipView, clipToCircle: Boolean) {
      q.h(var1, "view");
      var1.clipToCircle(var2);
   }

   @ReactProp(name = "cutouts")
   public open fun setCutouts(view: ClipView, cutouts: ReadableArray?) {
      q.h(var1, "view");
      var1.resetCutouts();
      if (var2 != null) {
         val var3: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         if (var3 != null) {
            val var4: java.util.Iterator = var3.iterator();

            while (var4.hasNext()) {
               val var6: ReadableMap = var2.getMap((var4 as n).a());
               val var5: java.lang.String = var6.getString("shape");
               if (q.c(var5, "circle")) {
                  var1.addCircleCutout(
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("x")),
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("y")),
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("size"))
                  );
               } else if (q.c(var5, "rounded-rect")) {
                  var1.addRoundedRectCutout(
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("x")),
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("y")),
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("width")),
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("height")),
                     (float)SizeUtilsKt.getDpToPx((float)var6.getDouble("cornerRadius"))
                  );
               }
            }
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
