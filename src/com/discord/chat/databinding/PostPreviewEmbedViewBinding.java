package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class PostPreviewEmbedViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView backgroundImage;
   @NonNull
   public final SimpleDraweeView coverImage;
   @NonNull
   public final DCDButton coverImageOverlayButton;
   @NonNull
   public final DCDButton cta;
   @NonNull
   public final SimpleDraweeSpanTextView footer;
   @NonNull
   public final View headerDivider;
   @NonNull
   public final FrameLayout imageBlurBg;
   @NonNull
   private final View rootView;
   @NonNull
   public final SpoilerView spoiler;
   @NonNull
   public final TextView subtitle;
   @NonNull
   public final TextView title;

   private PostPreviewEmbedViewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull DCDButton var4,
      @NonNull DCDButton var5,
      @NonNull SimpleDraweeSpanTextView var6,
      @NonNull View var7,
      @NonNull FrameLayout var8,
      @NonNull SpoilerView var9,
      @NonNull TextView var10,
      @NonNull TextView var11
   ) {
      this.rootView = var1;
      this.backgroundImage = var2;
      this.coverImage = var3;
      this.coverImageOverlayButton = var4;
      this.cta = var5;
      this.footer = var6;
      this.headerDivider = var7;
      this.imageBlurBg = var8;
      this.spoiler = var9;
      this.subtitle = var10;
      this.title = var11;
   }

   @NonNull
   public static PostPreviewEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.background_image;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.cover_image;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.cover_image_overlay_button;
            DCDButton var6 = (DCDButton)a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.cta;
               DCDButton var9 = (DCDButton)a.a(var0, var1);
               if (var9 != null) {
                  var1 = R.id.footer;
                  SimpleDraweeSpanTextView var11 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var11 != null) {
                     var1 = R.id.header_divider;
                     View var8 = a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.image_blur_bg;
                        FrameLayout var7 = (FrameLayout)a.a(var0, var1);
                        if (var7 != null) {
                           var1 = R.id.spoiler;
                           SpoilerView var5 = (SpoilerView)a.a(var0, var1);
                           if (var5 != null) {
                              var1 = R.id.subtitle;
                              TextView var10 = (TextView)a.a(var0, var1);
                              if (var10 != null) {
                                 var1 = R.id.title;
                                 TextView var4 = (TextView)a.a(var0, var1);
                                 if (var4 != null) {
                                    return new PostPreviewEmbedViewBinding(var0, var3, var2, var6, var9, var11, var8, var7, var5, var10, var4);
                                 }
                              }
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
   public static PostPreviewEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.post_preview_embed_view, var1);
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
