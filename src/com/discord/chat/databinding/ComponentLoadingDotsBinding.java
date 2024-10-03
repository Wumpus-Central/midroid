package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.progress_dots.ProgressDots;

public final class ComponentLoadingDotsBinding implements ViewBinding {
   private final ProgressDots rootView;

   private ComponentLoadingDotsBinding(ProgressDots var1) {
      this.rootView = var1;
   }

   public static ComponentLoadingDotsBinding bind(View var0) {
      if (var0 != null) {
         return new ComponentLoadingDotsBinding((ProgressDots)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   public static ComponentLoadingDotsBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static ComponentLoadingDotsBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.component_loading_dots, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ProgressDots getRoot() {
      return this.rootView;
   }
}
