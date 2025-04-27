package com.discord.tti_measurement_view;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

// $VF: synthetic class
public final class a implements OnGlobalLayoutListener {
   public final FirstDrawDoneListener j;
   public final View k;

   public final void onGlobalLayout() {
      FirstDrawDoneListener.a(this.j, this.k);
   }
}
