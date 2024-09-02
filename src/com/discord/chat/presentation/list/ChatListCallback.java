package com.discord.chat.presentation.list;

import android.graphics.Canvas;
import android.util.Pair;
import androidx.core.view.r0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

abstract class ChatListCallback extends androidx.recyclerview.widget.e {
   @Override
   final int getAbsoluteMovementFlags(RecyclerView var1, RecyclerView.ViewHolder var2) {
      return this.convertToAbsoluteDirection(this.getMovementFlags(var1, var2), r0.B(var1));
   }

   public Pair getEffectiveDxDy(float var1, float var2) {
      return new Pair(var1, var2);
   }

   boolean hasDragFlag(RecyclerView var1, RecyclerView.ViewHolder var2) {
      boolean var3;
      if ((this.getAbsoluteMovementFlags(var1, var2) & 0xFF0000) != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   void onDraw(
      Canvas var1, RecyclerView var2, RecyclerView.ViewHolder var3, List<ChatListItemTouchHelper.RecoverAnimation> var4, int var5, float var6, float var7
   ) {
      int var9 = var4.size();

      for (int var8 = 0; var8 < var9; var8++) {
         ChatListItemTouchHelper.RecoverAnimation var11 = (ChatListItemTouchHelper.RecoverAnimation)var4.get(var8);
         var11.update();
         int var10 = var1.save();
         this.onChildDraw(var1, var2, var11.mViewHolder, var11.mX, var11.mY, var11.mActionState, false);
         var1.restoreToCount(var10);
      }

      if (var3 != null) {
         int var12 = var1.save();
         this.onChildDraw(var1, var2, var3, var6, var7, var5, true);
         var1.restoreToCount(var12);
      }
   }

   void onDrawOver(
      Canvas var1, RecyclerView var2, RecyclerView.ViewHolder var3, List<ChatListItemTouchHelper.RecoverAnimation> var4, int var5, float var6, float var7
   ) {
      int var10 = var4.size();
      boolean var9 = false;

      for (int var8 = 0; var8 < var10; var8++) {
         ChatListItemTouchHelper.RecoverAnimation var13 = (ChatListItemTouchHelper.RecoverAnimation)var4.get(var8);
         int var11 = var1.save();
         this.onChildDrawOver(var1, var2, var13.mViewHolder, var13.mX, var13.mY, var13.mActionState, false);
         var1.restoreToCount(var11);
      }

      if (var3 != null) {
         int var16 = var1.save();
         this.onChildDrawOver(var1, var2, var3, var6, var7, var5, true);
         var1.restoreToCount(var16);
      }

      var5 = var10 - 1;

      boolean var17;
      for (var17 = var9; var5 >= 0; var5--) {
         ChatListItemTouchHelper.RecoverAnimation var14 = (ChatListItemTouchHelper.RecoverAnimation)var4.get(var5);
         boolean var12 = var14.mEnded;
         if (var12 && !var14.mIsPendingCleanup) {
            var4.remove(var5);
         } else if (!var12) {
            var17 = true;
         }
      }

      if (var17) {
         var2.invalidate();
      }
   }

   public abstract void onReleased(RecyclerView var1, RecyclerView.ViewHolder var2);

   public boolean shouldReturnToOriginalPosition() {
      return false;
   }

   public boolean shouldUseSpringyExit() {
      return false;
   }
}
