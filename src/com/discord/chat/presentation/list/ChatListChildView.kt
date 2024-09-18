package com.discord.chat.presentation.list

import android.view.ViewParent
import android.view.View.MeasureSpec
import kotlin.jvm.internal.q

public interface ChatListChildView {
   public var currentKey: Any?
      internal final set

   public var lastKey: Any?
      internal final set

   public open fun bindKey(key: Any) {
   }

   public abstract fun forceLayout() {
   }

   public abstract fun getMeasuredHeight(): Int {
   }

   public abstract fun getMeasuredWidth(): Int {
   }

   public abstract fun getParent(): ViewParent? {
   }

   public open fun onMeasureConsiderFrozen(widthMeasureSpec: Int, heightMeasureSpec: Int) {
   }

   public abstract fun post(action: Runnable): Boolean {
   }

   public abstract fun requestLayout() {
   }

   public abstract fun superOnMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun bindKey(var0: ChatListChildView, var1: Any) {
         q.h(var1, "key");
         var0.setCurrentKey(var1);
      }

      @JvmStatic
      fun onMeasureConsiderFrozen(var0: ChatListChildView, var1: Int, var2: Int) {
         val var5: ViewParent = var0.getParent();
         val var4: Any = var0.getLastKey();
         val var3: Boolean;
         if (var5 is ChatListView && MeasureSpec.getMode(var1) == 1073741824 && (var5 as ChatListView).getMeasuredWidth() == 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         var0.setLastKey(var0.getCurrentKey());
         if (var3) {
            var0.superOnMeasure(
               MeasureSpec.makeMeasureSpec(var0.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var0.getMeasuredHeight(), 1073741824)
            );
            if (!q.c(var4, var0.getCurrentKey())) {
               var0.post(new a(var0));
            }
         } else {
            var0.superOnMeasure(var1, var2);
         }
      }

      @JvmStatic
      fun `onMeasureConsiderFrozen$lambda$0`(var0: ChatListChildView) {
         q.h(var0, "this$0");
         var0.forceLayout();
         var0.requestLayout();
      }
   }
}
