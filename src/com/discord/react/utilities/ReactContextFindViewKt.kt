package com.discord.react.utilities

import android.app.Activity
import android.view.View
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.util.ReactFindViewUtil
import kotlin.jvm.internal.q

public fun ReactContext.findView(nativeId: String): View? {
   q.h(var0, "<this>");
   q.h(var1, "nativeId");
   val var2: Activity = var0.getCurrentActivity();
   if (var2 != null) {
      val var3: View = ActivityExtensionsKt.getRootView(var2);
      if (var3 != null) {
         return ReactFindViewUtil.findView(var3, var1);
      }
   }

   return null;
}
