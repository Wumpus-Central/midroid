package com.discord.misc.utilities.activity

import android.app.Activity
import android.view.View
import kotlin.jvm.internal.r

public fun Activity.getContentView(): View? {
   r.h(var0, "<this>");
   return var0.findViewById(16908290);
}

public fun Activity.getRootView(): View? {
   r.h(var0, "<this>");
   val var1: View = getContentView(var0);
   val var2: View;
   if (var1 != null) {
      var2 = var1.getRootView();
   } else {
      var2 = null;
   }

   return var2;
}
