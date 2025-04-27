package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q

public class ComponentProvider(context: Context, preInflateRecycledViews: Boolean) {
   public final val context: Context
   public final val inflater: ComponentInflater

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.inflater = new ComponentInflater(var1, var2);
   }

   public fun <T : Component> getConfiguredComponentView(component: T, componentContext: ComponentContext, root: ViewGroup, childIndex: Int): ComponentView<T>? {
      q.h(var1, "component");
      q.h(var2, "componentContext");
      q.h(var3, "root");
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
            if (q.c(var8.getComponentType(), E.b(var1.getClass()))) {
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
      q.h(var1, "componentView");
      var1.onRecycle(this);
      this.inflater.recycleComponent(var1);
   }
}
