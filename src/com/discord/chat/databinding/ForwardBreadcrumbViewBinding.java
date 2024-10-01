package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class ForwardBreadcrumbViewBinding implements ViewBinding {
   public final SimpleDraweeView arrow;
   public final SimpleDraweeView icon;
   public final TextView label;
   private final View rootView;
   public final TextView separator;
   public final TextView timestamp;

   private ForwardBreadcrumbViewBinding(View var1, SimpleDraweeView var2, SimpleDraweeView var3, TextView var4, TextView var5, TextView var6) {
      this.rootView = var1;
      this.arrow = var2;
      this.icon = var3;
      this.label = var4;
      this.separator = var5;
      this.timestamp = var6;
   }

   public static ForwardBreadcrumbViewBinding bind(View var0) {
      int var1 = R.id.arrow;
      SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.icon;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.label;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.separator;
               TextView var5 = (TextView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.timestamp;
                  TextView var6 = (TextView)a.a(var0, var1);
                  if (var6 != null) {
                     return new ForwardBreadcrumbViewBinding(var0, var4, var2, var3, var5, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ForwardBreadcrumbViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.forward_breadcrumb_view, var1);
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
