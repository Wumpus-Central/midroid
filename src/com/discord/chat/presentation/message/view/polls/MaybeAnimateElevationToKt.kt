package com.discord.chat.presentation.message.view.polls

import android.animation.ObjectAnimator
import android.view.View
import com.discord.chat.R
import kotlin.jvm.internal.q

private fun View.getTagObject(): AnimateElevationContext? {
   var var1: AnimateElevationContext = (AnimateElevationContext)var0.getTag(R.id.tag_maybe_animate_elevation_to);
   if (var1 is AnimateElevationContext) {
      var1 = var1;
   } else {
      var1 = null;
   }

   return var1;
}

public fun View.maybeAnimateElevationTo(tagValue: String, newElevation: Float) {
   q.h(var0, "<this>");
   q.h(var1, "tagValue");
   val var3: AnimateElevationContext = getTagObject(var0);
   if (var3 != null && q.c(var3.getTagValue(), var1)) {
      var3.setElevation(var2);
      val var4: ObjectAnimator = ObjectAnimator.ofFloat(var0, "elevation", new float[]{var2});
      var4.start();
      var3.setAnimator(var4);
   } else {
      var0.setTag(R.id.tag_maybe_animate_elevation_to, new AnimateElevationContext(var1, var0.getElevation(), null, 4, null));
      var0.setElevation(var2);
   }
}

public fun View.maybeEndAnimation() {
   q.h(var0, "<this>");
   val var2: AnimateElevationContext = getTagObject(var0);
   if (var2 != null) {
      val var1: ObjectAnimator = var2.getAnimator();
      if (var1 != null) {
         var1.cancel();
         var0.setElevation(var2.getElevation());
      }
   }
}
