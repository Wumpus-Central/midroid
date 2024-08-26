package com.discord.chat.presentation.message.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

public final class e implements AnimatorUpdateListener {
   public final AttachmentUploadOverlayView a;

   public final void onAnimationUpdate(ValueAnimator var1) {
      AttachmentUploadOverlayView.d(this.a, var1);
   }
}
