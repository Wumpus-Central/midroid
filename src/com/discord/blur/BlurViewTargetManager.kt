package com.discord.blur

import com.discord.react.utilities.InitialPropsViewGroupManager
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.viewmanagers.DCDVisualEffectViewTargetManagerDelegate
import com.facebook.react.viewmanagers.DCDVisualEffectViewTargetManagerInterface
import com.facebook.react.views.view.ReactViewGroup

@ReactModule(name = "DCDVisualEffectViewTarget")
internal class BlurViewTargetManager : InitialPropsViewGroupManager<ReactViewGroup>, DCDVisualEffectViewTargetManagerInterface<ReactViewGroup> {
   private final val delegate: DCDVisualEffectViewTargetManagerDelegate<ReactViewGroup, BlurViewTargetManager> =
      new DCDVisualEffectViewTargetManagerDelegate(this)

   public open fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): ReactViewGroup {
      val var3: java.lang.String = var2.getString("nativeID");
      if (var3 != null) {
         return (ReactViewGroup)(if (BlurViewManager.Companion.isHardwareBlurEnabled$blur_release())
            new BlurViewTargetHardwareAccelerated(var1, var3)
            else
            new BlurViewTarget(var1, var3));
      } else {
         throw new IllegalArgumentException("Failed requirement.");
      }
   }

   protected open fun getDelegate(): DCDVisualEffectViewTargetManagerDelegate<ReactViewGroup, BlurViewTargetManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "DCDVisualEffectViewTarget";
   }

   public open fun onDropViewInstance(view: ReactViewGroup) {
      super.onDropViewInstance(var1);
      if (var1 !is BlurViewAPI.Target) {
         throw new IllegalArgumentException("Failed requirement.");
      }
   }

   public open fun setNativeId(view: ReactViewGroup, nativeId: String?) {
      super.setNativeId(var1, var2);
      if (var1 is BlurViewAPI.Target) {
         if (var2 != null) {
            (var1 as BlurViewAPIBase).setBlurTargetNativeId(var2);
         } else {
            throw new IllegalArgumentException("Failed requirement.");
         }
      } else {
         throw new IllegalArgumentException("Failed requirement.");
      }
   }

   public companion object {
      internal const val NAME: String
      private const val PROP_NATIVE_ID: String
   }
}
