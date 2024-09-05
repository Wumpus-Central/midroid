package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import f3.a;

public final class MediaViewBinding implements ViewBinding {
   public final SimpleDraweeView inlineMediaGifIndicator;
   public final SimpleDraweeView inlineMediaImagePreview;
   public final ProgressBar inlineMediaLoadingIndicator;
   public final ImageView inlineMediaPlayButton;
   public final SimpleDraweeView inlineMediaVolumeToggle;
   public final ConstraintLayout overlayTag;
   public final SimpleDraweeView overlayTagIcon;
   public final TextView overlayTagText;
   private final View rootView;

   private MediaViewBinding(
      View var1,
      SimpleDraweeView var2,
      SimpleDraweeView var3,
      ProgressBar var4,
      ImageView var5,
      SimpleDraweeView var6,
      ConstraintLayout var7,
      SimpleDraweeView var8,
      TextView var9
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

   public static MediaViewBinding bind(View var0) {
      int var1 = R.id.inline_media_gif_indicator;
      SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.inline_media_image_preview;
         SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
         if (var9 != null) {
            var1 = R.id.inline_media_loading_indicator;
            ProgressBar var2 = (ProgressBar)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.inline_media_play_button;
               ImageView var8 = (ImageView)a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.inline_media_volume_toggle;
                  SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.overlay_tag;
                     ConstraintLayout var3 = (ConstraintLayout)a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.overlay_tag_icon;
                        SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.overlay_tag_text;
                           TextView var4 = (TextView)a.a(var0, var1);
                           if (var4 != null) {
                              return new MediaViewBinding(var0, var5, var9, var2, var8, var7, var3, var6, var4);
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

   public static MediaViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.media_view, var1);
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
