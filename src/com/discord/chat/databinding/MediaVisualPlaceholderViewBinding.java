package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class MediaVisualPlaceholderViewBinding implements ViewBinding {
   public final ConstraintLayout container;
   public final SimpleDraweeView imageInvalid;
   private final View rootView;

   private MediaVisualPlaceholderViewBinding(View var1, ConstraintLayout var2, SimpleDraweeView var3) {
      this.rootView = var1;
      this.container = var2;
      this.imageInvalid = var3;
   }

   public static MediaVisualPlaceholderViewBinding bind(View var0) {
      int var1 = R.id.container;
      ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.image_invalid;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            return new MediaVisualPlaceholderViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MediaVisualPlaceholderViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.media_visual_placeholder_view, var1);
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
