package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import v2.a;

public final class RoleDotViewBinding implements ViewBinding {
   public final FrameLayout roleDotViewBackground;
   public final ImageView roleDotViewDot;
   private final View rootView;

   private RoleDotViewBinding(View var1, FrameLayout var2, ImageView var3) {
      this.rootView = var1;
      this.roleDotViewBackground = var2;
      this.roleDotViewDot = var3;
   }

   public static RoleDotViewBinding bind(View var0) {
      int var1 = R.id.role_dot_view_background;
      FrameLayout var3 = (FrameLayout)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.role_dot_view_dot;
         ImageView var2 = (ImageView)a.a(var0, var1);
         if (var2 != null) {
            return new RoleDotViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static RoleDotViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.role_dot_view, var1);
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
