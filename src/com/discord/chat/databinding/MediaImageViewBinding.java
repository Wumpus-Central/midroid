package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class MediaImageViewBinding implements ViewBinding {
   @NonNull
   public final ConstraintLayout container;
   @NonNull
   public final SimpleDraweeView gifIndicator;
   @NonNull
   public final SimpleDraweeView image;
   @NonNull
   public final TextView imageAltText;
   @NonNull
   public final FrameLayout imageBlurBg;
   @NonNull
   public final AltTextButtonView mediaViewAltTextButton;
   @NonNull
   private final View rootView;

   private MediaImageViewBinding(
      @NonNull View var1,
      @NonNull ConstraintLayout var2,
      @NonNull SimpleDraweeView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull TextView var5,
      @NonNull FrameLayout var6,
      @NonNull AltTextButtonView var7
   ) {
      this.rootView = var1;
      this.container = var2;
      this.gifIndicator = var3;
      this.image = var4;
      this.imageAltText = var5;
      this.imageBlurBg = var6;
      this.mediaViewAltTextButton = var7;
   }

   @NonNull
   public static MediaImageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.container;
      ConstraintLayout var5 = (ConstraintLayout)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.gif_indicator;
         SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.image;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.image_alt_text;
               TextView var4 = (TextView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.image_blur_bg;
                  FrameLayout var3 = (FrameLayout)a.a(var0, var1);
                  if (var3 != null) {
                     var1 = R.id.media_view_alt_text_button;
                     AltTextButtonView var7 = (AltTextButtonView)a.a(var0, var1);
                     if (var7 != null) {
                        return new MediaImageViewBinding(var0, var5, var6, var2, var4, var3, var7);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MediaImageViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.media_image_view, var1);
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
