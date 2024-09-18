package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class AddReactionViewBinding implements ViewBinding {
   public final SimpleDraweeView addReactionImage;
   public final TextView addReactionText;
   private final View rootView;

   private AddReactionViewBinding(View var1, SimpleDraweeView var2, TextView var3) {
      this.rootView = var1;
      this.addReactionImage = var2;
      this.addReactionText = var3;
   }

   public static AddReactionViewBinding bind(View var0) {
      int var1 = R.id.add_reaction_image;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.add_reaction_text;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            return new AddReactionViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static AddReactionViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.add_reaction_view, var1);
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
