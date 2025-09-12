package com.discord.suspense_visible_view

import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewManager

@ReactModule(name = "SuspenseVisibleView")
internal class SuspenseVisibleViewManager : ReactViewManager {
   public override fun createShadowNodeInstance(): LayoutShadowNode {
      return new SuspenseVisibleViewShadowNode();
   }

   public override fun createViewInstance(context: ThemedReactContext): ReactViewGroup {
      return new SuspenseVisibleView(var1);
   }

   public override fun getName(): String {
      return "SuspenseVisibleView";
   }

   public override fun getShadowNodeClass(): Class<out LayoutShadowNode> {
      return SuspenseVisibleViewShadowNode::class.java;
   }

   public companion object {
      public const val REACT_CLASS: String
   }
}
