package com.discord.reanimatedview

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.ReanimatedViewManagerInterface
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager
import com.swmansion.reanimated.NodesManager
import com.swmansion.reanimated.ReanimatedModule
import kotlin.jvm.internal.q

@ReactModule(name = "ReanimatedView")
public class ReanimatedViewManager : ReactViewManager, ReanimatedViewManagerInterface<ReactViewGroup> {
   private final var nodesManager: NodesManager?

   public open fun createViewInstance(reactContext: ThemedReactContext): ReactViewGroup {
      q.h(var1, "reactContext");
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

   protected open fun prepareToRecycleView(reactContext: ThemedReactContext, view: ReactViewGroup): ReactViewGroup {
      q.h(var1, "reactContext");
      q.h(var2, "view");
      var2.setTag(R.id.firstRender, null);
      return super.prepareToRecycleView(var1, var2);
   }

   @ReactProp(name = "transform")
   public open fun setTransform(view: ReactViewGroup, matrix: ReadableArray?) {
      q.h(var1, "view");
      val var3: Boolean;
      if (var1.getTag(R.id.firstRender) == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (!var3) {
         val var4: NodesManager = this.nodesManager;
         if (this.nodesManager != null) {
            q.e(this.nodesManager);
            if (!var4.isPerformOperationsActive()) {
               return;
            }
         }
      }

      super.setTransform(var1, var2);
      if (var3) {
         var1.setTag(R.id.firstRender, java.lang.Boolean.TRUE);
      }
   }

   public companion object {
      public const val REACT_CLASS: String
   }
}
