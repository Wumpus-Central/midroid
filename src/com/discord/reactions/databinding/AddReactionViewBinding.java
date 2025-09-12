package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class AddReactionViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView addReactionImage;
   @NonNull
   public final TextView addReactionText;
   @NonNull
   private final View rootView;

   private AddReactionViewBinding(@NonNull View var1, @NonNull SimpleDraweeView var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.addReactionImage = var2;
      this.addReactionText = var3;
   }

   @NonNull
   public static AddReactionViewBinding bind(@NonNull View var0) {
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

   @NonNull
   public static AddReactionViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.add_reaction_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @NonNull
   public View getRoot() {
      return this.rootView;
   }
}
