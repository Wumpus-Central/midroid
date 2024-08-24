package com.discord.blur

import com.discord.react.utilities.InitialPropsViewGroupManager
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.r

@ReactModule(name = "DCDVisualEffectViewTarget")
internal class BlurViewTargetManager : InitialPropsViewGroupManager<ReactViewGroup> {
   public open fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): ReactViewGroup {
      r.h(var1, "reactContext");
      r.h(var2, "initialProps");
      val var5: java.lang.String = var2.getString("nativeID");
      val var3: Boolean;
      if (var5 != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         val var4: Any;
         if (BlurViewManager.Companion.isHardwareBlurEnabled$blur_release()) {
            var4 = new BlurViewTargetHardwareAccelerated(var1, var5);
         } else {
            var4 = new BlurViewTarget(var1, var5);
         }

         return (ReactViewGroup)var4;
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   public open fun getName(): String {
      return "DCDVisualEffectViewTarget";
   }

   public open fun onDropViewInstance(view: ReactViewGroup) {
      r.h(var1, "view");
      super.onDropViewInstance(var1);
      if (var1 !is BlurViewAPI.Target) {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   public open fun setNativeId(blurViewTarget: ReactViewGroup, nativeId: String?) {
      r.h(var1, "blurViewTarget");
      super.setNativeId(var1, var2);
      if (var1 is BlurViewAPI.Target) {
         val var3: Boolean;
         if (var2 != null) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            (var1 as BlurViewAPI.Target).setBlurTargetNativeId(var2);
         } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   public companion object {
      internal const val NAME: String
      private const val PROP_NATIVE_ID: String
   }
}
