package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;

public final class CtaButtonBinding implements ViewBinding {
   @NonNull
   public final DCDButton ctaButton;
   @NonNull
   private final View rootView;

   private CtaButtonBinding(@NonNull View var1, @NonNull DCDButton var2) {
      this.rootView = var1;
      this.ctaButton = var2;
   }

   @NonNull
   public static CtaButtonBinding bind(@NonNull View var0) {
      int var1 = R.id.ctaButton;
      DCDButton var2 = (DCDButton)k5.a.a(var0, var1);
      if (var2 != null) {
         return new CtaButtonBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static CtaButtonBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.cta_button, var1);
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
