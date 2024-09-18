package com.discord.misc.utilities.size

import android.content.res.Resources
import android.util.TypedValue
import vh.a

public final val dpToPx: Int
   public final get() {
      return a.b(var0 * Resources.getSystem().getDisplayMetrics().density);
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
      return a.b(TypedValue.applyDimension(2, (float)var0, Resources.getSystem().getDisplayMetrics()));
   }

