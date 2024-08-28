package com.discord.chat.presentation.list;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

// $VF: synthetic class
public final class a implements AnimatorUpdateListener {
   public final View a;

   public final void onAnimationUpdate(ValueAnimator var1) {
      ChatListHighlightItemAtPositionKt.b(this.a, var1);
   }
}
