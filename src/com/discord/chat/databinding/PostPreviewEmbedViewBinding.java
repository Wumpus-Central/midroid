package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class PostPreviewEmbedViewBinding implements ViewBinding {
   public final SimpleDraweeView backgroundImage;
   public final SimpleDraweeView coverImage;
   public final DCDButton coverImageOverlayButton;
   public final DCDButton cta;
   public final SimpleDraweeSpanTextView footer;
   public final View headerDivider;
   public final FrameLayout imageBlurBg;
   private final View rootView;
   public final SpoilerView spoiler;
   public final TextView subtitle;
   public final TextView title;

   private PostPreviewEmbedViewBinding(
      View var1,
      SimpleDraweeView var2,
      SimpleDraweeView var3,
      DCDButton var4,
      DCDButton var5,
      SimpleDraweeSpanTextView var6,
      View var7,
      FrameLayout var8,
      SpoilerView var9,
      TextView var10,
      TextView var11
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

   public static PostPreviewEmbedViewBinding bind(View var0) {
      int var1 = R.id.background_image;
      SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.cover_image;
         SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.cover_image_overlay_button;
            DCDButton var8 = (DCDButton)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.cta;
               DCDButton var7 = (DCDButton)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.footer;
                  SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.header_divider;
                     View var3 = a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.image_blur_bg;
                        FrameLayout var4 = (FrameLayout)a.a(var0, var1);
                        if (var4 != null) {
                           var1 = R.id.spoiler;
                           SpoilerView var2 = (SpoilerView)a.a(var0, var1);
                           if (var2 != null) {
                              var1 = R.id.subtitle;
                              TextView var10 = (TextView)a.a(var0, var1);
                              if (var10 != null) {
                                 var1 = R.id.title;
                                 TextView var11 = (TextView)a.a(var0, var1);
                                 if (var11 != null) {
                                    return new PostPreviewEmbedViewBinding(var0, var9, var6, var8, var7, var5, var3, var4, var2, var10, var11);
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

   public static PostPreviewEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.post_preview_embed_view, var1);
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
