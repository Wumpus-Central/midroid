package com.discord.safearea.extensions;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.G;
import androidx.core.view.WindowInsetsCompat;

// $VF: synthetic class
public final class a implements G {
   public final ViewGroup j;
   public final View k;

   @Override
   public final WindowInsetsCompat b(View var1, WindowInsetsCompat var2) {
      return ImmersiveMode.a(this.j, this.k, var1, var2);
   }
}
