package com.discord.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.core.R;
import com.discord.progress_dots.ProgressDots;
import com.google.android.material.button.MaterialButton;
import o1.a;

public final class DcdButtonBinding implements ViewBinding {
   public final MaterialButton button;
   public final ProgressDots loadingDots;
   public final ProgressBar progress;
   private final View rootView;

   private DcdButtonBinding(View var1, MaterialButton var2, ProgressDots var3, ProgressBar var4) {
      this.rootView = var1;
      this.button = var2;
      this.loadingDots = var3;
      this.progress = var4;
   }

   public static DcdButtonBinding bind(View var0) {
      int var1 = R.id.button;
      MaterialButton var2 = (MaterialButton)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.loading_dots;
         ProgressDots var4 = (ProgressDots)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.progress;
            ProgressBar var3 = (ProgressBar)a.a(var0, var1);
            if (var3 != null) {
               return new DcdButtonBinding(var0, var2, var4, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static DcdButtonBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.dcd_button, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
