package com.discord.blur

import com.discord.react.utilities.InitialPropsViewGroupManager
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.q

@ReactModule(name = "DCDVisualEffectViewTarget")
internal class BlurViewTargetManager : InitialPropsViewGroupManager<ReactViewGroup> {
   public open fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): ReactViewGroup {
      q.h(var1, "reactContext");
      q.h(var2, "initialProps");
      val var4: java.lang.String = var2.getString("nativeID");
      if (var4 != null) {
         val var3: Any;
         if (BlurViewManager.Companion.isHardwareBlurEnabled$blur_release()) {
            var3 = new BlurViewTargetHardwareAccelerated(var1, var4);
         } else {
            var3 = new BlurViewTarget(var1, var4);
         }

         return (ReactViewGroup)var3;
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   public open fun getName(): String {
      return "DCDVisualEffectViewTarget";
   }

   public open fun onDropViewInstance(view: ReactViewGroup) {
      q.h(var1, "view");
      super.onDropViewInstance(var1);
      if (var1 !is BlurViewAPI.Target) {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   public open fun setNativeId(blurViewTarget: ReactViewGroup, nativeId: String?) {
      q.h(var1, "blurViewTarget");
      super.setNativeId(var1, var2);
      if (var1 is BlurViewAPI.Target) {
         if (var2 != null) {
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
