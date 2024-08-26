package com.discord.chat.presentation.list;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.recyclerview.widget.RecyclerView;

public final class g implements AnimatorUpdateListener {
   public final SwipeHelper a;
   public final RecyclerView b;

   public final void onAnimationUpdate(ValueAnimator var1) {
      SwipeHelper.b(this.a, this.b, var1);
   }
}
