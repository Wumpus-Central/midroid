package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

public final class q implements AnimatorUpdateListener {
   public final AudioProgressBar a;

   public final void onAnimationUpdate(ValueAnimator var1) {
      AudioProgressBar.a(this.a, var1);
   }
}
