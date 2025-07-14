package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public class ComponentProvider(context: Context, preInflateRecycledViews: Boolean) {
   public final val context: Context
   public final val inflater: ComponentInflater

   init {
      r.h(var1, "context");
      super();
      this.context = var1;
      this.inflater = new ComponentInflater(var1, var2);
   }

   public fun <T : Component> getConfiguredComponentView(component: T, componentContext: ComponentContext, root: ViewGroup, childIndex: Int): ComponentView<T>? {
      r.h(var1, "component");
      r.h(var2, "componentContext");
      r.h(var3, "root");
      val var6: View = var3.getChildAt(var4);
      val var5: Boolean = var6 is ComponentView;
      var var7: ComponentView = null;
      val var8: ComponentView;
      if (var5) {
         var8 = var6 as ComponentView;
      } else {
         var8 = null;
      }

      label23: {
         if (var8 != null) {
            if (r.c(var8.getComponentType(), H.b(var1.getClass()))) {
               var7 = var8;
            }

            var9 = var7;
            if (var7 != null) {
               break label23;
            }
         }

         var9 = this.inflater.getComponent(var1, var3);
      }

      if (var9 != null) {
         var9.configure(var1, this, var2);
      }

      return var9;
   }

   public fun recycleComponentView(componentView: ComponentView<out Component>) {
      r.h(var1, "componentView");
      var1.onRecycle(this);
      this.inflater.recycleComponent(var1);
   }
}
