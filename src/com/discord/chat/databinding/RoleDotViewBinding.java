package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import x1.a;

public final class RoleDotViewBinding implements ViewBinding {
   @NonNull
   public final FrameLayout roleDotViewBackground;
   @NonNull
   public final ImageView roleDotViewDot;
   @NonNull
   private final View rootView;

   private RoleDotViewBinding(@NonNull View var1, @NonNull FrameLayout var2, @NonNull ImageView var3) {
      this.rootView = var1;
      this.roleDotViewBackground = var2;
      this.roleDotViewDot = var3;
   }

   @NonNull
   public static RoleDotViewBinding bind(@NonNull View var0) {
      int var1 = R.id.role_dot_view_background;
      FrameLayout var2 = (FrameLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.role_dot_view_dot;
         ImageView var3 = (ImageView)a.a(var0, var1);
         if (var3 != null) {
            return new RoleDotViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static RoleDotViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.role_dot_view, var1);
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
