package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import n1.a;

public final class SeparatorViewBinding implements ViewBinding {
   public final View leftBar;
   public final TextView middleText;
   public final View rightBar;
   private final View rootView;

   private SeparatorViewBinding(View var1, View var2, TextView var3, View var4) {
      this.rootView = var1;
      this.leftBar = var2;
      this.middleText = var3;
      this.rightBar = var4;
   }

   public static SeparatorViewBinding bind(View var0) {
      int var1 = R.id.left_bar;
      View var4 = a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.middle_text;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.right_bar;
            View var2 = a.a(var0, var1);
            if (var2 != null) {
               return new SeparatorViewBinding(var0, var4, var3, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SeparatorViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.separator_view, var1);
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
