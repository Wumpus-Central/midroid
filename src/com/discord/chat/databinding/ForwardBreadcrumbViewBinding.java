package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class ForwardBreadcrumbViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView arrow;
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final TextView label;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView separator;
   @NonNull
   public final TextView timestamp;

   private ForwardBreadcrumbViewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull TextView var4,
      @NonNull TextView var5,
      @NonNull TextView var6
   ) {
      this.rootView = var1;
      this.arrow = var2;
      this.icon = var3;
      this.label = var4;
      this.separator = var5;
      this.timestamp = var6;
   }

   @NonNull
   public static ForwardBreadcrumbViewBinding bind(@NonNull View var0) {
      int var1 = R.id.arrow;
      SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.icon;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.label;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.separator;
               TextView var4 = (TextView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.timestamp;
                  TextView var5 = (TextView)a.a(var0, var1);
                  if (var5 != null) {
                     return new ForwardBreadcrumbViewBinding(var0, var6, var3, var2, var4, var5);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ForwardBreadcrumbViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.forward_breadcrumb_view, var1);
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
