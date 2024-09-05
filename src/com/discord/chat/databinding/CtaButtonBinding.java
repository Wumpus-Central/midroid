package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import f3.a;

public final class CtaButtonBinding implements ViewBinding {
   public final DCDButton ctaButton;
   private final View rootView;

   private CtaButtonBinding(View var1, DCDButton var2) {
      this.rootView = var1;
      this.ctaButton = var2;
   }

   public static CtaButtonBinding bind(View var0) {
      int var1 = R.id.ctaButton;
      DCDButton var2 = (DCDButton)a.a(var0, var1);
      if (var2 != null) {
         return new CtaButtonBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static CtaButtonBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.cta_button, var1);
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
