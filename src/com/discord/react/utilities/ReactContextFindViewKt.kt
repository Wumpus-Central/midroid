package com.discord.react.utilities

import android.app.Activity
import android.view.View
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.util.ReactFindViewUtil
import kotlin.jvm.internal.r

public fun ReactContext.findView(nativeId: String): View? {
   r.h(var0, "<this>");
   r.h(var1, "nativeId");
   val var2: Activity = var0.getCurrentActivity();
   val var3: View;
   if (var2 != null) {
      var3 = ActivityExtensionsKt.getRootView(var2);
   } else {
      var3 = null;
   }

   return ReactFindViewUtil.findView(var3, var1);
}
