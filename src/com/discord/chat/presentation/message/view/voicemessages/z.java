package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.discord.chat.databinding.AudioPlayerViewBinding;

// $VF: synthetic class
public final class z implements AnimatorUpdateListener {
   public final AudioPlayerViewBinding a;

   public final void onAnimationUpdate(ValueAnimator var1) {
      AudioPlayerWipeAnimatorManager.e(this.a, var1);
   }
}
