package com.discord.suspense_visible_view

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager
import kotlin.jvm.internal.q

@ReactModule(name = "SuspenseVisibleView")
internal class SuspenseVisibleViewManager : ReactViewManager {
   public open fun createShadowNodeInstance(): LayoutShadowNode {
      return new SuspenseVisibleViewShadowNode();
   }

   public open fun createViewInstance(context: ThemedReactContext): ReactViewGroup {
      q.h(var1, "context");
      return new SuspenseVisibleView(var1);
   }

   public open fun getName(): String {
      return "SuspenseVisibleView";
   }

   public open fun getShadowNodeClass(): Class<out LayoutShadowNode> {
      return SuspenseVisibleViewShadowNode::class.java;
   }

   public companion object {
      public const val REACT_CLASS: String
   }
}
