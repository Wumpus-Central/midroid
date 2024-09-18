package com.discord.chat.presentation.list;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

// $VF: synthetic class
public final class c implements AnimatorUpdateListener {
   public final View a;

   public final void onAnimationUpdate(ValueAnimator var1) {
      ChatListHighlightItemAtPositionKt.a(this.a, var1);
   }
}
