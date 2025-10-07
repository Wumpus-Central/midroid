package com.discord.progress_dots.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.progress_dots.ProgressDot;
import com.discord.progress_dots.R;
import y0.a;

public final class ProgressDotsViewBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final ProgressDot viewProgressDots1;
   @NonNull
   public final ProgressDot viewProgressDots2;
   @NonNull
   public final ProgressDot viewProgressDots3;

   private ProgressDotsViewBinding(@NonNull View var1, @NonNull ProgressDot var2, @NonNull ProgressDot var3, @NonNull ProgressDot var4) {
      this.rootView = var1;
      this.viewProgressDots1 = var2;
      this.viewProgressDots2 = var3;
      this.viewProgressDots3 = var4;
   }

   @NonNull
   public static ProgressDotsViewBinding bind(@NonNull View var0) {
      int var1 = R.id.view_progress_dots_1;
      ProgressDot var4 = (ProgressDot)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.view_progress_dots_2;
         ProgressDot var2 = (ProgressDot)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.view_progress_dots_3;
            ProgressDot var3 = (ProgressDot)a.a(var0, var1);
            if (var3 != null) {
               return new ProgressDotsViewBinding(var0, var4, var2, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ProgressDotsViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.progress_dots_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @NonNull
   @Override
   public View getRoot() {
      return this.rootView;
   }
}
