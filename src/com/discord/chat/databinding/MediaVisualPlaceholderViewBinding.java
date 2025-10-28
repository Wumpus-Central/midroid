package com.discord.chat.databinding;

import E1.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;

public final class MediaVisualPlaceholderViewBinding implements ViewBinding {
   @NonNull
   public final ConstraintLayout container;
   @NonNull
   public final SimpleDraweeView imageInvalid;
   @NonNull
   private final View rootView;

   private MediaVisualPlaceholderViewBinding(@NonNull View var1, @NonNull ConstraintLayout var2, @NonNull SimpleDraweeView var3) {
      this.rootView = var1;
      this.container = var2;
      this.imageInvalid = var3;
   }

   @NonNull
   public static MediaVisualPlaceholderViewBinding bind(@NonNull View var0) {
      int var1 = R.id.container;
      ConstraintLayout var3 = (ConstraintLayout)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.image_invalid;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            return new MediaVisualPlaceholderViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MediaVisualPlaceholderViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.media_visual_placeholder_view, var1);
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
