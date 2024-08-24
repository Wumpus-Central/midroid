package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.MediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import n1.a;

public final class VideoAttachmentViewBinding implements ViewBinding {
   public final MediaView mediaView;
   public final TextView mediaViewAltText;
   public final AltTextButtonView mediaViewAltTextButton;
   private final View rootView;
   public final SpoilerView spoiler;
   public final AttachmentUploadOverlayView uploadOverlay;

   private VideoAttachmentViewBinding(View var1, MediaView var2, TextView var3, AltTextButtonView var4, SpoilerView var5, AttachmentUploadOverlayView var6) {
      this.rootView = var1;
      this.mediaView = var2;
      this.mediaViewAltText = var3;
      this.mediaViewAltTextButton = var4;
      this.spoiler = var5;
      this.uploadOverlay = var6;
   }

   public static VideoAttachmentViewBinding bind(View var0) {
      int var1 = R.id.media_view;
      MediaView var2 = (MediaView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.media_view_alt_text;
         TextView var4 = (TextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.media_view_alt_text_button;
            AltTextButtonView var6 = (AltTextButtonView)a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.spoiler;
               SpoilerView var5 = (SpoilerView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.upload_overlay;
                  AttachmentUploadOverlayView var3 = (AttachmentUploadOverlayView)a.a(var0, var1);
                  if (var3 != null) {
                     return new VideoAttachmentViewBinding(var0, var2, var4, var6, var5, var3);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static VideoAttachmentViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.video_attachment_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
