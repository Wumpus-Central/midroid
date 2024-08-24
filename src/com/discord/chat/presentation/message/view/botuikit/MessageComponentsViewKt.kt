package com.discord.chat.presentation.message.view.botuikit

import android.view.View
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.r

public fun ViewGroup.replaceViews(views: List<ComponentView<out Component>>) {
   r.h(var0, "<this>");
   r.h(var1, "views");
   val var3: java.util.Iterator = var1.iterator();

   for (int var2 = 0; var3.hasNext(); var2++) {
      var var4: Any = var3.next();
      if (var2 < 0) {
         h.s();
      }

      var4 = var4 as ComponentView;
      if (var2 < var0.getChildCount()) {
         if (var0.getChildAt(var2) != var4) {
            var0.removeViewAt(var2);
            r.f(var4, "null cannot be cast to non-null type android.view.View");
            var0.addView(var4 as View, var2);
         }
      } else {
         r.f(var4, "null cannot be cast to non-null type android.view.View");
         var0.addView(var4 as View, var2);
      }
   }

   if (var1.size() < var0.getChildCount()) {
      var0.removeViews(var1.size(), var0.getChildCount() - var1.size());
   }
}
