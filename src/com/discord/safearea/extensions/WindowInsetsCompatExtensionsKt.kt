package com.discord.safearea.extensions

import android.app.Activity
import android.view.View
import android.view.Window
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.o0
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import kotlin.jvm.internal.q

internal fun WindowInsetsCompat.getDisplayCutoutInsets(ignoringVisibility: Boolean = false): Insets {
   q.h(var0, "<this>");
   return getInsets(var0, WindowInsetsCompat.m.b(), var1);
}

@JvmSynthetic
fun `getDisplayCutoutInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getDisplayCutoutInsets(var0, var1);
}

internal fun WindowInsetsCompat.getImeInsets(ignoringVisibility: Boolean = false): Insets {
   q.h(var0, "<this>");
   return getInsets(var0, WindowInsetsCompat.m.c(), var1);
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

   q.e(var3);
   return var3;
}

@JvmSynthetic
fun `getInsets$default`(var0: WindowInsetsCompat, var1: Int, var2: Boolean, var3: Int, var4: Any): Insets {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   return getInsets(var0, var1, var2);
}

internal fun WindowInsetsCompat.getSystemBarInsets(ignoringVisibility: Boolean = false): Insets {
   q.h(var0, "<this>");
   return getInsets(var0, WindowInsetsCompat.m.h(), var1);
}

@JvmSynthetic
fun `getSystemBarInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getSystemBarInsets(var0, var1);
}

internal fun Activity.getWindowInsetsCompat(): WindowInsetsCompat? {
   q.h(var0, "<this>");
   val var1: View = ActivityExtensionsKt.getRootView(var0);
   val var2: WindowInsetsCompat;
   if (var1 != null) {
      var2 = WindowInsetsCompat.A(var1.getRootWindowInsets());
   } else {
      var2 = null;
   }

   return var2;
}

internal fun Window.setInsetsType(insetType: Int, visible: Boolean) {
   q.h(var0, "<this>");
   val var3: WindowInsetsControllerCompat = o0.a(var0, var0.getDecorView());
   var3.d(2);
   if (var2) {
      var3.e(var1);
   } else {
      var3.a(var1);
   }
}
