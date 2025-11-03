@file:SourceDebugExtension(["SMAP\nNestedScrollOnTouchUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollOnTouchUtils.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt\n+ 2 ViewUtils.kt\ncom/discord/misc/utilities/view/ViewUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n33#2,2:90\n21#2,19:92\n1863#3,2:111\n*S KotlinDebug\n*F\n+ 1 NestedScrollOnTouchUtils.kt\ncom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt\n*L\n74#1:90,2\n74#1:92,19\n74#1:111,2\n*E\n"])

package com.discord.react_gesture_handler.nested_touch

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

private const val TAG_NESTED_CLICK_LISTENER: Int = -111001
private const val TAG_NESTED_LONG_CLICK_LISTENER: Int = -111002
private const val TAG_NESTED_DOUBLE_CLICK_LISTENER: Int = -111003

@JvmSynthetic
fun a(var0: OnLongClickListener, var1: View): Boolean {
   return updateWithOngoingGestureCancelling$lambda$1(var0, var1);
}

@SuppressLint(["ClickableViewAccessibility"])
public fun TextView.enableNestedSpanClickListener(viewManagesAccessibility: Boolean = false) {
   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
}

@JvmSynthetic
fun `enableNestedSpanClickListener$default`(var0: TextView, var1: Boolean, var2: Int, var3: Any) {
   if ((var2 and 1) != 0) {
      var1 = false;
   }

   enableNestedSpanClickListener(var0, var1);
}

internal fun View.getNestedClickListener(): OnClickListener? {
   val var1: Any = var0.getTag(-111001);
   return var1 as? OnClickListener;
}

internal fun View.getNestedDoubleClickListener(): OnClickListener? {
   val var1: Any = var0.getTag(-111003);
   return var1 as? OnClickListener;
}

internal fun View.getNestedLongClickListener(): OnLongClickListener? {
   val var1: Any = var0.getTag(-111002);
   return var1 as? OnLongClickListener;
}

public fun View.setOnClickListenerNested(viewManagesAccessibility: Boolean = false, onClickListener: OnClickListener?) {
   var0.setTag(-111001, var2);
   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
   updateClickability(var0);
}

@JvmSynthetic
fun `setOnClickListenerNested$default`(var0: View, var1: Boolean, var2: OnClickListener, var3: Int, var4: Any) {
   if ((var3 and 1) != 0) {
      var1 = false;
   }

   setOnClickListenerNested(var0, var1, var2);
}

public fun View.setOnDoubleClickListenerNested(viewManagesAccessibility: Boolean, onDoubleClickListener: OnClickListener?) {
   var0.setTag(-111003, var2);
   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
   updateClickability(var0);
}

public fun View.setOnLongClickListenerNested(viewManagesAccessibility: Boolean = false, onLongPress: OnLongClickListener?) {
   if (var2 != null) {
      var2 = updateWithOngoingGestureCancelling(var2);
   } else {
      var2 = null;
   }

   var0.setTag(-111002, var2);
   var0.setOnTouchListener(new NestedScrollOnTouchListener(var0, var1));
   updateClickability(var0);
}

@JvmSynthetic
fun `setOnLongClickListenerNested$default`(var0: View, var1: Boolean, var2: OnLongClickListener, var3: Int, var4: Any) {
   if ((var3 and 1) != 0) {
      var1 = false;
   }

   setOnLongClickListenerNested(var0, var1, var2);
}

private fun View.updateClickability() {
   val var1: Boolean;
   if (var0.getTag(-111001) == null && var0.getTag(-111002) == null && var0.getTag(-111003) == null) {
      var1 = false;
   } else {
      var1 = true;
   }

   var0.setClickable(var1);
   var0.setFocusable(var1);
}

private fun OnLongClickListener.updateWithOngoingGestureCancelling(): OnLongClickListener {
   return new d(var0);
}

// $VF: Irreducible bytecode was duplicated to produce valid code
fun `updateWithOngoingGestureCancelling$lambda$1`(var0: OnLongClickListener, var1: View): Boolean {
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
