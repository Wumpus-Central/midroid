package com.discord.misc.utilities.view

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.Window
import android.widget.TextView
import java.util.ArrayList
import kotlin.jvm.internal.q

@JvmSynthetic
public inline fun <reified T : ViewGroup> View.findParentView(): T? {
   q.h(var0, "<this>");
   val var1: ViewParent = var0.getParent();
   val var2: ViewGroup;
   if (var1 is ViewGroup) {
      var2 = var1 as ViewGroup;
   } else {
      var2 = null;
   }

   if (var2 != null) {
      q.m(2, "T");
      return (T)var2;
   } else {
      return null;
   }
}

@JvmSynthetic
public inline fun <reified T : ViewGroup> View.findParentViews(): List<T> {
   q.h(var0, "<this>");
   val var1: ArrayList = new ArrayList();
   val var2: ViewParent = var0.getParent();
   var var3: ViewGroup;
   if (var2 is ViewGroup) {
      var3 = var2 as ViewGroup;
   } else {
      var3 = null;
   }

   if (var3 != null) {
      q.m(2, "T");
   } else {
      var3 = null;
   }

   while (var3 != null) {
      var1.add(var3);
      val var4: ViewParent = var3.getParent();
      if (var4 is ViewGroup) {
         var3 = var4 as ViewGroup;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         q.m(2, "T");
      } else {
         var3 = null;
      }
   }

   return var1;
}

public tailrec fun getWindow(context: Context?): Window? {
   while (true) {
      val var2: Window;
      if (var0 == null) {
         var2 = null;
      } else {
         if (var0 !is Activity) {
            val var3: ContextWrapper;
            if (var0 is ContextWrapper) {
               var3 = var0 as ContextWrapper;
            } else {
               var3 = null;
            }

            if (var3 != null) {
               var0 = var3.getBaseContext();
               continue;
            }

            var0 = null;
            continue;
         }

         var2 = (var0 as Activity).getWindow();
      }

      return var2;
   }
}

public fun View.isLtr(): Boolean {
   q.h(var0, "<this>");
   val var1: Boolean;
   if (var0.getLayoutDirection() == 0) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

public fun TextView.setOptionalText(text: CharSequence?) {
   q.h(var0, "<this>");
   var0.setText(var1);
   var var2: Boolean;
   if (var1 != null && !h.x(var1)) {
      var2 = 0;
   } else {
      var2 = 1;
   }

   if (var2 xor true) {
      var2 = 0;
   } else {
      var2 = 8;
   }

   var0.setVisibility(var2);
}
