package com.discord.react_gesture_handler.nested_touch

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import java.util.ArrayList
import java.util.WeakHashMap
import kotlin.jvm.internal.q

internal final var viewClickListeners: WeakHashMap<View, OnClickListener> = new WeakHashMap()
internal final var viewLongClickListeners: WeakHashMap<View, OnLongClickListener> = new WeakHashMap()

@JvmSynthetic
fun a(var0: OnLongClickListener, var1: View): Boolean {
   return updateWithOngoingGestureCancelling$lambda$1(var0, var1);
}

public fun TextView.enableNestedSpanClickListener(viewManagesAccessibility: Boolean = false) {
   q.h(var0, "<this>");
   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
}

@JvmSynthetic
fun `enableNestedSpanClickListener$default`(var0: TextView, var1: Boolean, var2: Int, var3: Any) {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   enableNestedSpanClickListener(var0, var1);
}

public fun View.setOnClickListenerNested(viewManagesAccessibility: Boolean = false, onClickListener: OnClickListener?) {
   q.h(var0, "<this>");
   if (var2 == null) {
      viewClickListeners.remove(var0);
   } else {
      viewClickListeners.put(var0, var2);
   }

   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
   updateClickablity(var0);
}

@JvmSynthetic
fun `setOnClickListenerNested$default`(var0: View, var1: Boolean, var2: OnClickListener, var3: Int, var4: Any) {
   if ((var3 and 1) != 0) {
      var1 = false;
   }

   setOnClickListenerNested(var0, var1, var2);
}

public fun View.setOnLongClickListenerNested(viewManagesAccessibility: Boolean = false, onLongPress: OnLongClickListener?) {
   q.h(var0, "<this>");
   if (var2 == null) {
      viewLongClickListeners.remove(var0);
   } else {
      viewLongClickListeners.put(var0, updateWithOngoingGestureCancelling(var2));
   }

   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
   updateClickablity(var0);
}

@JvmSynthetic
fun `setOnLongClickListenerNested$default`(var0: View, var1: Boolean, var2: OnLongClickListener, var3: Int, var4: Any) {
   if ((var3 and 1) != 0) {
      var1 = false;
   }

   setOnLongClickListenerNested(var0, var1, var2);
}

private fun View.updateClickablity() {
   val var1: Boolean;
   if (!viewClickListeners.containsKey(var0) && !viewLongClickListeners.containsKey(var0)) {
      var1 = false;
   } else {
      var1 = true;
   }

   var0.setClickable(var1);
   var0.setFocusable(var1);
}

private fun OnLongClickListener.updateWithOngoingGestureCancelling(): OnLongClickListener {
   return new a(var0);
}

// $VF: Irreducible bytecode was duplicated to produce valid code
fun `updateWithOngoingGestureCancelling$lambda$1`(var0: OnLongClickListener, var1: View): Boolean {
   q.h(var0, "$this_updateWithOngoingGestureCancelling");
   q.e(var1);
   val var4: ArrayList = new ArrayList();
   var var2: ViewParent = var1.getParent();
   var var5: ViewGroup;
   if (var2 is ViewGroup) {
      var5 = var2 as ViewGroup;
   } else {
      var5 = null;
   }

   while (true) {
      var var6: RecyclerView;
      if (var5 != null) {
         val var3: ViewGroup;
         if (var5 !is RecyclerView) {
            var3 = null;
         } else {
            var3 = var5;
         }

         val var12: RecyclerView = var3 as RecyclerView;
         if (var3 as RecyclerView == null) {
            var2 = var5.getParent();
            if (var2 is ViewGroup) {
               var5 = var2 as ViewGroup;
            } else {
               var5 = null;
            }
            continue;
         }

         var6 = var12;
      } else {
         var6 = null;
      }

      label66:
      while (var6 != null) {
         var4.add(var6);
         var2 = var6.getParent();
         var var9: ViewGroup;
         if (var2 is ViewGroup) {
            var9 = var2 as ViewGroup;
         } else {
            var9 = null;
         }

         while (var9 != null) {
            val var13: ViewGroup;
            if (var9 !is RecyclerView) {
               var13 = null;
            } else {
               var13 = var9;
            }

            val var14: RecyclerView = var13 as RecyclerView;
            if (var13 as RecyclerView != null) {
               var6 = var14;
               continue label66;
            }

            var2 = var9.getParent();
            if (var2 is ViewGroup) {
               var9 = var2 as ViewGroup;
            } else {
               var9 = null;
            }
         }

         var6 = null;
      }

      val var11: java.util.Iterator = var4.iterator();

      while (var11.hasNext()) {
         RecyclerViewExtensionsKt.toggleSuppressLayout(var11.next() as RecyclerView);
      }

      return var0.onLongClick(var1);
   }
}
