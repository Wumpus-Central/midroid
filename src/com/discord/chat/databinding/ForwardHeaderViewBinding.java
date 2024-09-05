package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import f3.a;

public final class ForwardHeaderViewBinding implements ViewBinding {
   public final SimpleDraweeView icon;
   public final TextView label;
   private final View rootView;

   private ForwardHeaderViewBinding(View var1, SimpleDraweeView var2, TextView var3) {
      this.rootView = var1;
      this.icon = var2;
      this.label = var3;
   }

   public static ForwardHeaderViewBinding bind(View var0) {
      int var1 = R.id.icon;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.label;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            return new ForwardHeaderViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ForwardHeaderViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.forward_header_view, var1);
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
