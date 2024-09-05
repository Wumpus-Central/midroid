package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import f3.a;

public final class InfoLinkViewBinding implements ViewBinding {
   public final TextView description;
   public final SimpleDraweeView icon;
   public final ConstraintLayout infoLinkContainer;
   private final View rootView;

   private InfoLinkViewBinding(View var1, TextView var2, SimpleDraweeView var3, ConstraintLayout var4) {
      this.rootView = var1;
      this.description = var2;
      this.icon = var3;
      this.infoLinkContainer = var4;
   }

   public static InfoLinkViewBinding bind(View var0) {
      int var1 = R.id.description;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.icon;
         SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.info_link_container;
            ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
            if (var2 != null) {
               return new InfoLinkViewBinding(var0, var3, var4, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static InfoLinkViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.info_link_view, var1);
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
