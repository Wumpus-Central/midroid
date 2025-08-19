package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.Component

public class ComponentProvider(context: Context, preInflateRecycledViews: Boolean) {
   public final val context: Context
   public final val inflater: ComponentInflater

   init {
      this.context = var1;
      this.inflater = new ComponentInflater(var1, var2);
   }

   public fun <T : Component> getConfiguredComponentView(component: T, componentContext: ComponentContext, root: ViewGroup, childIndex: Int): ComponentView<T>? {
      val var7: View = var3.getChildAt(var4);
      val var5: Boolean = var7 is ComponentView;
      var var6: ComponentView = null;
      val var8: ComponentView;
      if (var5) {
         var8 = var7 as ComponentView;
      } else {
         var8 = null;
      }

      label23: {
         if (var8 != null) {
            if (var8.getComponentType() == var1.getClass()::class) {
               var6 = var8;
            }

            var9 = var6;
            if (var6 != null) {
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
      var1.onRecycle(this);
      this.inflater.recycleComponent(var1);
   }
}
