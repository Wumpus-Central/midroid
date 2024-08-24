package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class MediaImageViewBinding implements ViewBinding {
   public final SimpleDraweeView gifIndicator;
   public final SimpleDraweeView image;
   public final TextView imageAltText;
   public final FrameLayout imageBlurBg;
   public final AltTextButtonView mediaViewAltTextButton;
   private final View rootView;
   public final SpoilerView spoiler;
   public final AttachmentUploadOverlayView uploadOverlay;

   private MediaImageViewBinding(
      View var1,
      SimpleDraweeView var2,
      SimpleDraweeView var3,
      TextView var4,
      FrameLayout var5,
      AltTextButtonView var6,
      SpoilerView var7,
      AttachmentUploadOverlayView var8
   ) {
      this.rootView = var1;
      this.gifIndicator = var2;
      this.image = var3;
      this.imageAltText = var4;
      this.imageBlurBg = var5;
      this.mediaViewAltTextButton = var6;
      this.spoiler = var7;
      this.uploadOverlay = var8;
   }

   public static MediaImageViewBinding bind(View var0) {
      int var1 = R.id.gif_indicator;
      SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.image;
         SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.image_alt_text;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.image_blur_bg;
               FrameLayout var4 = (FrameLayout)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.media_view_alt_text_button;
                  AltTextButtonView var5 = (AltTextButtonView)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.spoiler;
                     SpoilerView var7 = (SpoilerView)a.a(var0, var1);
                     if (var7 != null) {
                        var1 = R.id.upload_overlay;
                        AttachmentUploadOverlayView var2 = (AttachmentUploadOverlayView)a.a(var0, var1);
                        if (var2 != null) {
                           return new MediaImageViewBinding(var0, var8, var6, var3, var4, var5, var7, var2);
                        }
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

   public View getRoot() {
      return this.rootView;
   }
}
