package com.discord.misc.utilities.size

import android.content.res.Resources
import android.util.TypedValue
import z8.a

public final val dpToPx: Int
   public final get() {
      return a.c(var0 * Resources.getSystem().getDisplayMetrics().density);
   }


public final val dpToPx: Int
   public final get() {
      return getDpToPx((float)var0);
   }


public final val pxToDp: Float
   public final get() {
      return var0 / Resources.getSystem().getDisplayMetrics().density;
   }


public final val spToPx: Int
   public final get() {
      return a.c(TypedValue.applyDimension(2, (float)var0, Resources.getSystem().getDisplayMetrics()));
   }

