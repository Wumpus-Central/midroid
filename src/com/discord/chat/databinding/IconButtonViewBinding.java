package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class IconButtonViewBinding implements ViewBinding {
   public final SimpleDraweeView iconButton;
   public final FrameLayout iconContainer;
   private final View rootView;

   private IconButtonViewBinding(View var1, SimpleDraweeView var2, FrameLayout var3) {
      this.rootView = var1;
      this.iconButton = var2;
      this.iconContainer = var3;
   }

   public static IconButtonViewBinding bind(View var0) {
      int var1 = R.id.icon_button;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.icon_container;
         FrameLayout var2 = (FrameLayout)a.a(var0, var1);
         if (var2 != null) {
            return new IconButtonViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static IconButtonViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.icon_button_view, var1);
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
