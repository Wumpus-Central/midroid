package com.discord.appreview;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;
import hb.d;

public final class a implements d {
   public final ReviewManager a;
   public final AppRatingRequester b;

   public final void a(Task var1) {
      AppRatingRequester.c(this.a, this.b, var1);
   }
}
