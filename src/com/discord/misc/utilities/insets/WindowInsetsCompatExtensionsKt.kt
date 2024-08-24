package com.discord.misc.utilities.insets

import android.app.Activity
import android.view.View
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsCompat.m
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import kotlin.jvm.internal.r

public fun WindowInsetsCompat.getDisplayCutoutInsets(ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   return getInsets(var0, m.a(), var1);
}

@JvmSynthetic
fun `getDisplayCutoutInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getDisplayCutoutInsets(var0, var1);
}

public fun WindowInsetsCompat.getImeInsets(ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   return getInsets(var0, m.b(), var1);
}

@JvmSynthetic
fun `getImeInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getImeInsets(var0, var1);
}

private fun WindowInsetsCompat.getInsets(type: Int, ignoringVisibility: Boolean = false): Insets {
   val var3: Insets;
   if (var2) {
      var3 = var0.g(var1);
   } else {
      var3 = var0.f(var1);
   }

   r.g(var3, "if (ignoringVisibility) …    getInsets(type)\n    }");
   return var3;
}

@JvmSynthetic
fun `getInsets$default`(var0: WindowInsetsCompat, var1: Int, var2: Boolean, var3: Int, var4: Any): Insets {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   return getInsets(var0, var1, var2);
}

public fun WindowInsetsCompat.getNavigationBarsInsets(ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   return getInsets(var0, m.e(), var1);
}

@JvmSynthetic
fun `getNavigationBarsInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getNavigationBarsInsets(var0, var1);
}

public fun WindowInsetsCompat.getSystemBarInsets(ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   return getInsets(var0, m.g(), var1);
}

@JvmSynthetic
fun `getSystemBarInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getSystemBarInsets(var0, var1);
}

public fun Activity.getWindowInsetsCompat(): WindowInsetsCompat? {
   r.h(var0, "<this>");
   val var1: View = ActivityExtensionsKt.getRootView(var0);
   val var2: WindowInsetsCompat;
   if (var1 != null) {
      var2 = WindowInsetsCompat.y(var1.getRootWindowInsets());
   } else {
      var2 = null;
   }

   return var2;
}
