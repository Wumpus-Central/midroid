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
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "ClipView")
@SourceDebugExtension(["SMAP\nClipViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipViewManager.kt\ncom/discord/clip/ClipViewManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1863#2,2:102\n*S KotlinDebug\n*F\n+ 1 ClipViewManager.kt\ncom/discord/clip/ClipViewManager\n*L\n29#1:102,2\n*E\n"])
public class ClipViewManager : ViewGroupManager<ClipView>, ClipViewManagerInterface<ClipView> {
   private final val delegate: ClipViewManagerDelegate<ClipView, ClipViewManager> = new ClipViewManagerDelegate(this)

   protected open fun createViewInstance(context: ThemedReactContext): ClipView {
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
      var1.setBackgroundColor(var2);
   }

   @ReactProp(name = "borderRadius")
   public open fun setBorderRadius(view: ClipView, borderRadius: Int) {
      var1.clipToBorderRadius((float)SizeUtilsKt.getDpToPx(var2));
   }

   @ReactProp(name = "clipToCircle")
   public open fun setClipToCircle(view: ClipView, clipToCircle: Boolean) {
      var1.clipToCircle(var2);
   }

   @ReactProp(name = "cutouts")
   public open fun setCutouts(view: ClipView, cutouts: ReadableArray?) {
      var1.resetCutouts();
      if (var2 != null) {
         val var3: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         if (var3 != null) {
            val var4: java.util.Iterator = var3.iterator();

            while (var4.hasNext()) {
               val var5: ReadableMap = var2.getMap((var4 as I).nextInt());
               val var6: java.lang.String = var5.getString("shape");
               if (var6 == "circle") {
                  var1.addCircleCutout(
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("x")),
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("y")),
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("size"))
                  );
               } else if (var6 == "rounded-rect") {
                  var1.addRoundedRectCutout(
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("x")),
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("y")),
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("width")),
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("height")),
                     (float)SizeUtilsKt.getDpToPx((float)var5.getDouble("cornerRadius"))
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
