package com.discord.blur

import android.os.Build.VERSION
import android.view.ViewGroup
import com.discord.react.utilities.InitialPropsViewGroupManager
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerDelegate
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
import kotlin.jvm.internal.r

@ReactModule(name = "DCDVisualEffectView")
internal class BlurViewManager : InitialPropsViewGroupManager<ViewGroup>, DCDVisualEffectViewManagerInterface<ViewGroup> {
   private final val delegate: DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> = new DCDVisualEffectViewManagerDelegate(this)

   public open fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): ViewGroup {
      r.h(var1, "reactContext");
      r.h(var2, "initialProps");
      val var7: java.lang.String = var2.getString("blurTargetViewNativeId");
      val var6: java.lang.String = var2.getString("blurTintRgba");
      val var3: Float = var2.getFloat("blurAmount", -1.0F);
      val var9: java.lang.String = var2.getString("blurTintIOSParityCompensationRgba");
      var var4: Boolean;
      if (var7 != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var4) {
         var4 = false;
         if (var3 == -1.0F) {
            var4 = true;
         }

         if (var4 xor true) {
            val var8: Any;
            if (Companion.isHardwareBlurEnabled$blur_release()) {
               var8 = new BlurViewHardwareAccelerated(var1, var7, ColorUtilsKt.rgbaToArgb(var6), ColorUtilsKt.rgbaToArgb(var9), var3);
            } else {
               var8 = new BlurView(var1, var7, ColorUtilsKt.rgbaToArgb(var6), ColorUtilsKt.rgbaToArgb(var9), var3);
            }

            return (ViewGroup)var8;
         } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   protected open fun getDelegate(): DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "DCDVisualEffectView";
   }

   @ReactProp(name = "blurAmount")
   public open fun setBlurAmount(blurView: ViewGroup, blurAmount: Float) {
      r.h(var1, "blurView");
      if (var1 is BlurViewAPI) {
         (var1 as BlurViewAPI).setBlurAmount(var1.getId(), var2);
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   @ReactProp(name = "blurTargetViewNativeId")
   public open fun setBlurTargetViewNativeId(blurView: ViewGroup, blurTargetViewNativeId: String?) {
      r.h(var1, "blurView");
      if (var1 is BlurViewAPI) {
         val var3: Boolean;
         if (var2 != null) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            (var1 as BlurViewAPI).setBlurTargetNativeId(var2);
         } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   @ReactProp(name = "blurTintIOSParityCompensationRgba")
   public open fun setBlurTintIOSParityCompensationRgba(blurView: ViewGroup?, blurTintIOSParityCompensationRgba: String?) {
      if (var1 is BlurViewAPI) {
         (var1 as BlurViewAPI).setBlurTintIOSParityCompensation(ColorUtilsKt.rgbaToArgb(var2));
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   @ReactProp(name = "blurTintRgba")
   public open fun setBlurTintRgba(blurView: ViewGroup, blurTintRgba: String?) {
      r.h(var1, "blurView");
      if (var1 is BlurViewAPI) {
         (var1 as BlurViewAPI).setBlurTint(ColorUtilsKt.rgbaToArgb(var2));
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   public companion object {
      internal const val NAME: String
      private const val PROP_BLUR_AMOUNT: String
      private const val PROP_BLUR_TARGET_VIEW_NATIVE_ID: String
      private const val PROP_BLUR_TINT_IOS_PARITY_RGBA: String
      private const val PROP_BLUR_TINT_RGBA: String

      internal fun isHardwareBlurEnabled(): Boolean {
         val var1: Boolean;
         if (VERSION.SDK_INT >= 31) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }
   }
}
