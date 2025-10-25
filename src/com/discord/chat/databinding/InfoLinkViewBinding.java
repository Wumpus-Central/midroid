package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class InfoLinkViewBinding implements ViewBinding {
   @NonNull
   public final TextView description;
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final ConstraintLayout infoLinkContainer;
   @NonNull
   private final View rootView;

   private InfoLinkViewBinding(@NonNull View var1, @NonNull TextView var2, @NonNull SimpleDraweeView var3, @NonNull ConstraintLayout var4) {
      this.rootView = var1;
      this.description = var2;
      this.icon = var3;
      this.infoLinkContainer = var4;
   }

   @NonNull
   public static InfoLinkViewBinding bind(@NonNull View var0) {
      int var1 = R.id.description;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.icon;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.info_link_container;
            ConstraintLayout var4 = (ConstraintLayout)a.a(var0, var1);
            if (var4 != null) {
               return new InfoLinkViewBinding(var0, var2, var3, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static InfoLinkViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.info_link_view, var1);
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
