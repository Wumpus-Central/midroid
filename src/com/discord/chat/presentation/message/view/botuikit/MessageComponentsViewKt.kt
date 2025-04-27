package com.discord.chat.presentation.message.view.botuikit

import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.q

public fun ViewGroup.recycleChildComponents(componentProvider: ComponentProvider?) {
   q.h(var0, "<this>");

   for (int var2 = var0.getChildCount() - 1; -1 < var2; var2--) {
      if (var1 != null) {
         val var3: View = var0.getChildAt(var2);
         q.f(
            var3,
            "null cannot be cast to non-null type com.discord.chat.presentation.message.view.botuikit.ComponentView<out com.discord.chat.bridge.botuikit.Component>"
         );
         var1.recycleComponentView(var3 as ComponentView<out Component>);
      }

      var0.removeViewAt(var2);
   }
}

public fun ViewGroup.replaceViews(
   views: List<ComponentView<out Component>>,
   componentProvider: ComponentProvider?,
   paddingBottom: Int = 0,
   paddingRight: Int = 0
) {
   q.h(var0, "<this>");
   q.h(var1, "views");
   val var8: java.util.Iterator = var1.iterator();

   for (int var5 = 0; var8.hasNext(); var5++) {
      var var6: Any = var8.next();
      if (var5 < 0) {
         i.u();
      }

      val var10: ComponentView = var6 as ComponentView;
      q.f(var6 as ComponentView, "null cannot be cast to non-null type android.view.View");
      val var9: View = var10 as View;
      val var7: LayoutParams = (var10 as View).getLayoutParams();
      var6 = var7;
      if (var7 == null) {
         var6 = new MarginLayoutParams(-1, -2);
      }

      var9.setLayoutParams((LayoutParams)var6);
      if (var5 < var1.size() - 1) {
         var6 = var9.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
         }

         val var16: MarginLayoutParams = var6 as MarginLayoutParams;
         (var6 as MarginLayoutParams).setMargins(0, 0, var4, var3);
         var9.setLayoutParams(var16);
      } else {
         var6 = var9.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
         }

         val var18: MarginLayoutParams = var6 as MarginLayoutParams;
         (var6 as MarginLayoutParams).setMargins(0, 0, 0, 0);
         var9.setLayoutParams(var18);
      }

      if (var5 < var0.getChildCount()) {
         if (var0.getChildAt(var5) != var10) {
            if (var2 != null) {
               var6 = var0.getChildAt(var5);
               q.f(
                  var6,
                  "null cannot be cast to non-null type com.discord.chat.presentation.message.view.botuikit.ComponentView<out com.discord.chat.bridge.botuikit.Component>"
               );
               var2.recycleComponentView(var6 as ComponentView<out Component>);
            }

            var0.removeViewAt(var5);
            var0.addView(var9, var5);
         }
      } else {
         var0.addView(var9, var5);
      }
   }

   if (var1.size() < var0.getChildCount()) {
      var3 = var0.getChildCount() - 1;
      var4 = var1.size();
      if (var4 <= var3) {
         while (true) {
            if (var0.getChildAt(var3) != null) {
               val var11: View = var0.getChildAt(var3);
               if (var2 != null) {
                  q.f(
                     var11,
                     "null cannot be cast to non-null type com.discord.chat.presentation.message.view.botuikit.ComponentView<out com.discord.chat.bridge.botuikit.Component>"
                  );
                  var2.recycleComponentView(var11 as ComponentView<out Component>);
               }

               var0.removeViewAt(var3);
            }

            if (var3 == var4) {
               break;
            }

            var3--;
         }
      }
   }
}

@JvmSynthetic
fun `replaceViews$default`(var0: ViewGroup, var1: java.util.List, var2: ComponentProvider, var3: Int, var4: Int, var5: Int, var6: Any) {
   if ((var5 and 4) != 0) {
      var3 = 0;
   }

   if ((var5 and 8) != 0) {
      var4 = 0;
   }

   replaceViews(var0, var1, var2, var3, var4);
}
