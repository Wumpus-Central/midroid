package com.discord.safearea.extensions

import android.app.Activity
import android.content.Context
import android.os.Build.VERSION
import android.view.View
import android.view.Window
import android.view.WindowInsets
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.n0
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import kotlin.jvm.internal.r

internal fun WindowInsetsCompat.getDisplayCutoutInsets(ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   return getInsets(var0, WindowInsetsCompat.n.b(), var1);
}

@JvmSynthetic
fun `getDisplayCutoutInsets$default`(var0: WindowInsetsCompat, var1: Boolean, var2: Int, var3: Any): Insets {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   return getDisplayCutoutInsets(var0, var1);
}

internal fun WindowInsetsCompat.getImeInsets(ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   return getInsets(var0, WindowInsetsCompat.n.c(), var1);
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

   return var3;
}

@JvmSynthetic
fun `getInsets$default`(var0: WindowInsetsCompat, var1: Int, var2: Boolean, var3: Int, var4: Any): Insets {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   return getInsets(var0, var1, var2);
}

internal fun WindowInsetsCompat.getSystemBarInsets(context: Context, ignoringVisibility: Boolean = false): Insets {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var4: Insets = getInsets(var0, WindowInsetsCompat.n.h(), var2);
   if (VERSION.SDK_INT > 29) {
      r.e(var4);
      return var4;
   } else if (var2) {
      val var7: Insets = Insets.c(var0.i(), var0.k(), var0.j(), var0.h());
      r.g(var7, "of(...)");
      return var7;
   } else {
      var var5: Int = var1.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
      if (var5.intValue() <= 0) {
         var5 = null;
      }

      val var8: Int;
      if (var5 != null) {
         var8 = var1.getResources().getDimensionPixelSize(var5.intValue());
      } else {
         var8 = 0;
      }

      val var6: Insets = Insets.c(var4.a, var4.b, var4.c, var8);
      r.g(var6, "of(...)");
      return var6;
   }
}

@JvmSynthetic
fun `getSystemBarInsets$default`(var0: WindowInsetsCompat, var1: Context, var2: Boolean, var3: Int, var4: Any): Insets {
   if ((var3 and 2) != 0) {
      var2 = false;
   }

   return getSystemBarInsets(var0, var1, var2);
}

internal fun Activity.getWindowInsetsCompat(): WindowInsetsCompat? {
   r.h(var0, "<this>");
   val var1: View = ActivityExtensionsKt.getRootView(var0);
   if (var1 != null) {
      val var2: WindowInsets = var1.getRootWindowInsets();
      if (var2 != null) {
         return WindowInsetsCompat.C(var2);
      }
   }

   return null;
}

internal fun Window.setInsetsType(insetType: Int, visible: Boolean) {
   r.h(var0, "<this>");
   val var3: WindowInsetsControllerCompat = n0.a(var0, var0.getDecorView());
   var3.e(2);
   if (var2) {
      var3.f(var1);
   } else {
      var3.b(var1);
   }
}
