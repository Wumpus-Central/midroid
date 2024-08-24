package com.discord.misc.utilities.view

import android.content.res.ColorStateList
import android.widget.Button
import androidx.core.view.f1
import java.util.ArrayList
import kotlin.jvm.internal.r

public fun Button.setBackgroundColors(color: Int, disabledColor: Int? = null) {
   r.h(var0, "<this>");
   val var3: ArrayList = new ArrayList(2);
   val var4: ArrayList = new ArrayList(2);
   if (var2 != null) {
      var3.add(new int[]{-16842910});
      var4.add(var2);
   }

   var3.add(new int[0]);
   var4.add(var1);
   f1.v0(var0, new ColorStateList(var3.toArray(new int[0][]), h.L0(var4)));
}

@JvmSynthetic
fun `setBackgroundColors$default`(var0: Button, var1: Int, var2: Int, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = null;
   }

   setBackgroundColors(var0, var1, var2);
}
