package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

public final class AltTextButtonViewBinding implements ViewBinding {
   @NonNull
   public final FrameLayout altTextContainer;
   @NonNull
   public final TextView altTextLabel;
   @NonNull
   private final FrameLayout rootView;

   private AltTextButtonViewBinding(@NonNull FrameLayout var1, @NonNull FrameLayout var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.altTextContainer = var2;
      this.altTextLabel = var3;
   }

   @NonNull
   public static AltTextButtonViewBinding bind(@NonNull View var0) {
      int var1 = R.id.alt_text_container;
      FrameLayout var2 = (FrameLayout)k5.a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.alt_text_label;
         TextView var3 = (TextView)k5.a.a(var0, var1);
         if (var3 != null) {
            return new AltTextButtonViewBinding((FrameLayout)var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static AltTextButtonViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static AltTextButtonViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.alt_text_button_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public FrameLayout getRoot() {
      return this.rootView;
   }
}
