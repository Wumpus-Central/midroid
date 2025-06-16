package com.discord.safearea.extensions;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.F;
import androidx.core.view.WindowInsetsCompat;

// $VF: synthetic class
public final class a implements F {
   public final ViewGroup a;
   public final View b;

   @Override
   public final WindowInsetsCompat a(View var1, WindowInsetsCompat var2) {
      return ImmersiveMode.a(this.a, this.b, var1, var2);
   }
}
