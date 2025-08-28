package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import y0.a;

public final class SeparatorViewBinding implements ViewBinding {
   @NonNull
   public final View leftBar;
   @NonNull
   public final TextView middleText;
   @NonNull
   public final View rightBar;
   @NonNull
   private final View rootView;

   private SeparatorViewBinding(@NonNull View var1, @NonNull View var2, @NonNull TextView var3, @NonNull View var4) {
      this.rootView = var1;
      this.leftBar = var2;
      this.middleText = var3;
      this.rightBar = var4;
   }

   @NonNull
   public static SeparatorViewBinding bind(@NonNull View var0) {
      int var1 = R.id.left_bar;
      View var3 = a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.middle_text;
         TextView var4 = (TextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.right_bar;
            View var2 = a.a(var0, var1);
            if (var2 != null) {
               return new SeparatorViewBinding(var0, var3, var4, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static SeparatorViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.separator_view, var1);
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
