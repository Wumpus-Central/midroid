package com.discord.reanimatedview

import com.facebook.react.bridge.Dynamic
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.uimanager.annotations.ReactPropGroup
import com.facebook.react.viewmanagers.ReanimatedViewManagerInterface
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager
import com.swmansion.reanimated.NodesManager
import com.swmansion.reanimated.ReanimatedModule
import kotlin.jvm.internal.r

@ReactModule(name = "ReanimatedView")
public class ReanimatedViewManager : ReactViewManager, ReanimatedViewManagerInterface<ReactViewGroup> {
   private final var nodesManager: NodesManager?

   public fun allowUpdating(view: ReactViewGroup): Boolean {
      r.h(var1, "view");
      if (var1.getTag(R.id.firstRenderPerformed) == null) {
         return true;
      } else {
         val var2: NodesManager = this.nodesManager;
         if (this.nodesManager != null) {
            r.e(this.nodesManager);
            if (!var2.isPerformOperationsActive()) {
               return false;
            }
         }

         return true;
      }
   }

   public open fun createViewInstance(context: ThemedReactContext): ReactViewGroup {
      r.h(var1, "context");
      if (this.nodesManager == null) {
         val var2: ReanimatedModule = var1.getNativeModule(ReanimatedModule.class) as ReanimatedModule;
         val var3: NodesManager;
         if (var2 != null) {
            var3 = var2.getNodesManager();
         } else {
            var3 = null;
         }

         this.nodesManager = var3;
      }

      return new ReactViewGroup(var1);
   }

   public open fun getName(): String {
      return "ReanimatedView";
   }

   protected open fun onAfterUpdateTransaction(view: ReactViewGroup) {
      r.h(var1, "view");
      super.onAfterUpdateTransaction(var1);
      var1.setTag(R.id.firstRenderPerformed, java.lang.Boolean.TRUE);
   }

   protected open fun prepareToRecycleView(reactContext: ThemedReactContext, view: ReactViewGroup): ReactViewGroup {
      r.h(var1, "reactContext");
      r.h(var2, "view");
      var2.setTag(R.id.firstRenderPerformed, null);
      return super.prepareToRecycleView(var1, var2);
   }

   @ReactPropGroup(names = ["borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"])
   public open fun setBorderRadius(view: ReactViewGroup, index: Int, rawBorderRadius: Dynamic) {
      r.h(var1, "view");
      r.h(var3, "rawBorderRadius");
      if (this.allowUpdating(var1)) {
         super.setBorderRadius(var1, var2, var3);
      }
   }

   @ReactProp(name = "opacity")
   public open fun setOpacity(view: ReactViewGroup, value: Float) {
      r.h(var1, "view");
      if (this.allowUpdating(var1)) {
         super.setOpacity(var1, var2);
      }
   }

   @ReactProp(name = "transform")
   public open fun setTransform(view: ReactViewGroup, matrix: ReadableArray?) {
      r.h(var1, "view");
      if (this.allowUpdating(var1)) {
         super.setTransform(var1, var2);
      }
   }

   public companion object {
      public const val REACT_CLASS: String
   }
}
