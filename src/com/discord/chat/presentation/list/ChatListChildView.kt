package com.discord.chat.presentation.list

import android.view.ViewParent
import android.view.View.MeasureSpec

public interface ChatListChildView {
   public abstract fun getMeasuredHeight(): Int {
   }

   public abstract fun getMeasuredWidth(): Int {
   }

   public abstract fun getParent(): ViewParent? {
   }

   public open fun onMeasureConsiderFrozen(widthMeasureSpec: Int, heightMeasureSpec: Int) {
   }

   public abstract fun superOnMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun onMeasureConsiderFrozen(var0: ChatListChildView, var1: Int, var2: Int) {
         val var4: ViewParent = var0.getParent();
         val var3: Boolean;
         if (var4 is ChatListView && MeasureSpec.getMode(var1) == 1073741824 && (var4 as ChatListView).getMeasuredWidth() == 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            var0.superOnMeasure(
               MeasureSpec.makeMeasureSpec(var0.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var0.getMeasuredHeight(), 1073741824)
            );
         } else {
            var0.superOnMeasure(var1, var2);
         }
      }
   }
}
