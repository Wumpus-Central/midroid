package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class MediaViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView inlineMediaGifIndicator;
   @NonNull
   public final SimpleDraweeView inlineMediaImagePreview;
   @NonNull
   public final ProgressBar inlineMediaLoadingIndicator;
   @NonNull
   public final ImageView inlineMediaPlayButton;
   @NonNull
   public final SimpleDraweeView inlineMediaVolumeToggle;
   @NonNull
   public final ConstraintLayout overlayTag;
   @NonNull
   public final SimpleDraweeView overlayTagIcon;
   @NonNull
   public final TextView overlayTagText;
   @NonNull
   private final View rootView;

   private MediaViewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull ProgressBar var4,
      @NonNull ImageView var5,
      @NonNull SimpleDraweeView var6,
      @NonNull ConstraintLayout var7,
      @NonNull SimpleDraweeView var8,
      @NonNull TextView var9
   ) {
      this.rootView = var1;
      this.inlineMediaGifIndicator = var2;
      this.inlineMediaImagePreview = var3;
      this.inlineMediaLoadingIndicator = var4;
      this.inlineMediaPlayButton = var5;
      this.inlineMediaVolumeToggle = var6;
      this.overlayTag = var7;
      this.overlayTagIcon = var8;
      this.overlayTagText = var9;
   }

   @NonNull
   public static MediaViewBinding bind(@NonNull View var0) {
      int var1 = R.id.inline_media_gif_indicator;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.inline_media_image_preview;
         SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.inline_media_loading_indicator;
            ProgressBar var9 = (ProgressBar)a.a(var0, var1);
            if (var9 != null) {
               var1 = R.id.inline_media_play_button;
               ImageView var3 = (ImageView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.inline_media_volume_toggle;
                  SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.overlay_tag;
                     ConstraintLayout var7 = (ConstraintLayout)a.a(var0, var1);
                     if (var7 != null) {
                        var1 = R.id.overlay_tag_icon;
                        SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                        if (var5 != null) {
                           var1 = R.id.overlay_tag_text;
                           TextView var8 = (TextView)a.a(var0, var1);
                           if (var8 != null) {
                              return new MediaViewBinding(var0, var2, var6, var9, var3, var4, var7, var5, var8);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MediaViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.media_view, var1);
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
