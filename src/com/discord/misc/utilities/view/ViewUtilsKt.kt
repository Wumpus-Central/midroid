@file:SourceDebugExtension(["SMAP\nViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewUtils.kt\ncom/discord/misc/utilities/view/ViewUtilsKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,49:1\n21#1,9:52\n21#1,9:61\n257#2,2:50\n*S KotlinDebug\n*F\n+ 1 ViewUtils.kt\ncom/discord/misc/utilities/view/ViewUtilsKt\n*L\n34#1:52,9\n37#1:61,9\n17#1:50,2\n*E\n"])

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
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@JvmSynthetic
public inline fun <reified T : ViewGroup> View.findParentView(): T? {
   val var1: ViewParent = var0.getParent();
   val var2: ViewGroup;
   if (var1 is ViewGroup) {
      var2 = var1 as ViewGroup;
   } else {
      var2 = null;
   }

   if (var2 != null) {
      Intrinsics.reifiedOperationMarker(2, "T");
      return (T)var2;
   } else {
      return null;
   }
}

@JvmSynthetic
public inline fun <reified T : ViewGroup> View.findParentViews(): List<T> {
   val var1: ArrayList = new ArrayList();
   val var2: ViewParent = var0.getParent();
   var var3: ViewGroup;
   if (var2 is ViewGroup) {
      var3 = var2 as ViewGroup;
   } else {
      var3 = null;
   }

   if (var3 != null) {
      Intrinsics.reifiedOperationMarker(2, "T");
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
         Intrinsics.reifiedOperationMarker(2, "T");
      } else {
         var3 = null;
      }
   }

   return var1;
}

public tailrec fun getWindow(context: Context?): Window? {
   while (var0 != null) {
      if (var0 is Activity) {
         return (var0 as Activity).getWindow();
      }

      val var1: ContextWrapper;
      if (var0 is ContextWrapper) {
         var1 = var0 as ContextWrapper;
      } else {
         var1 = null;
      }

      if (var1 != null) {
         var0 = var1.getBaseContext();
      } else {
         var0 = null;
      }
   }

   return null;
}

public fun View.isLtr(): Boolean {
   return var0.getLayoutDirection() == 0;
}

public fun TextView.setOptionalText(text: CharSequence?) {
   var0.setText(var1);
   var var2: Boolean;
   if (var1 != null && !StringsKt.c0(var1)) {
      var2 = 0;
   } else {
      var2 = 1;
   }

   if (!var2) {
      var2 = 0;
   } else {
      var2 = 8;
   }

   var0.setVisibility(var2);
}
