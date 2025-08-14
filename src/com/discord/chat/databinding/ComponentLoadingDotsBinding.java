package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;

public final class ComponentLoadingDotsBinding implements ViewBinding {
   @NonNull
   private final ProgressDots rootView;

   private ComponentLoadingDotsBinding(@NonNull ProgressDots var1) {
      this.rootView = var1;
   }

   @NonNull
   public static ComponentLoadingDotsBinding bind(@NonNull View var0) {
      if (var0 != null) {
         return new ComponentLoadingDotsBinding((ProgressDots)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   @NonNull
   public static ComponentLoadingDotsBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static ComponentLoadingDotsBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.component_loading_dots, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public ProgressDots getRoot() {
      return this.rootView;
   }
}
