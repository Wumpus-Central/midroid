package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.facebook.drawee.view.SimpleDraweeView;
import v2.a;

public final class MediaImageViewBinding implements ViewBinding {
   public final ConstraintLayout container;
   public final SimpleDraweeView gifIndicator;
   public final SimpleDraweeView image;
   public final TextView imageAltText;
   public final FrameLayout imageBlurBg;
   public final AltTextButtonView mediaViewAltTextButton;
   private final View rootView;

   private MediaImageViewBinding(
      View var1, ConstraintLayout var2, SimpleDraweeView var3, SimpleDraweeView var4, TextView var5, FrameLayout var6, AltTextButtonView var7
   ) {
      this.rootView = var1;
      this.container = var2;
      this.gifIndicator = var3;
      this.image = var4;
      this.imageAltText = var5;
      this.imageBlurBg = var6;
      this.mediaViewAltTextButton = var7;
   }

   public static MediaImageViewBinding bind(View var0) {
      int var1 = R.id.container;
      ConstraintLayout var3 = (ConstraintLayout)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.gif_indicator;
         SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.image;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.image_alt_text;
               TextView var6 = (TextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.image_blur_bg;
                  FrameLayout var5 = (FrameLayout)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.media_view_alt_text_button;
                     AltTextButtonView var4 = (AltTextButtonView)a.a(var0, var1);
                     if (var4 != null) {
                        return new MediaImageViewBinding(var0, var3, var7, var2, var6, var5, var4);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MediaImageViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.media_image_view, var1);
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
