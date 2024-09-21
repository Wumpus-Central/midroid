package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import n1.a;

public final class AltTextButtonViewBinding implements ViewBinding {
   public final FrameLayout altTextContainer;
   public final TextView altTextLabel;
   private final FrameLayout rootView;

   private AltTextButtonViewBinding(FrameLayout var1, FrameLayout var2, TextView var3) {
      this.rootView = var1;
      this.altTextContainer = var2;
      this.altTextLabel = var3;
   }

   public static AltTextButtonViewBinding bind(View var0) {
      int var1 = R.id.alt_text_container;
      FrameLayout var2 = (FrameLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.alt_text_label;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            return new AltTextButtonViewBinding((FrameLayout)var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static AltTextButtonViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static AltTextButtonViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.alt_text_button_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public FrameLayout getRoot() {
      return this.rootView;
   }
}
