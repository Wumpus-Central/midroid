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
import kotlin.jvm.internal.q
import lh.o

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
         val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         if (var4 != null) {
            val var6: java.util.Iterator = var4.iterator();

            while (var6.hasNext()) {
               val var7: ReadableMap = var2.getMap((var6 as o).a());
               q.g(var7, "getMap(...)");
               val var5: java.lang.String = var7.getString("shape");
               if (var5 != null) {
                  val var3: Int = var5.hashCode();
                  if (var3 != -1360216880) {
                     if (var3 == 2002554116 && var5.equals("rounded-rect")) {
                        var1.addRoundedRectCutout(
                           (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("x")),
                           (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("y")),
                           (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("width")),
                           (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("height")),
                           (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("cornerRadius"))
                        );
                     }
                  } else if (var5.equals("circle")) {
                     var1.addCircleCutout(
                        (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("x")),
                        (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("y")),
                        (float)SizeUtilsKt.getDpToPx((float)var7.getDouble("size"))
                     );
                  }
               }
            }
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
