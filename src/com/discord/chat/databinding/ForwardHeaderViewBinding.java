package com.discord.chat.databinding;

import E1.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;

public final class ForwardHeaderViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final TextView label;
   @NonNull
   private final View rootView;

   private ForwardHeaderViewBinding(@NonNull View var1, @NonNull SimpleDraweeView var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.icon = var2;
      this.label = var3;
   }

   @NonNull
   public static ForwardHeaderViewBinding bind(@NonNull View var0) {
      int var1 = R.id.icon;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.label;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            return new ForwardHeaderViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ForwardHeaderViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.forward_header_view, var1);
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
