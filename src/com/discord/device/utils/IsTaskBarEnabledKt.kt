package com.discord.device.utils

import android.app.Activity
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import com.discord.misc.utilities.insets.WindowInsetsCompatExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.q

public const val TASK_BAR_HEIGHT_DP: Float = 60.0F

public fun Activity?.isTaskBarEnabled(): Boolean {
   if (var0 == null) {
      return false;
   } else {
      val var5: WindowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var0);
      var var3: java.lang.Float = null;
      if (var5 != null) {
         val var6: Insets = WindowInsetsCompatExtensionsKt.getNavigationBarsInsets$default(var5, false, 1, null);
         var3 = null;
         if (var6 != null) {
            var3 = SizeUtilsKt.getPxToDp(var6.d);
         }
      }

      var var1: Boolean = false;
      if (q.b(var3, 60.0F)) {
         var1 = false;
         if (IsTabletKt.isTablet(var0)) {
            var1 = true;
         }
      }

      return var1;
   }
}
