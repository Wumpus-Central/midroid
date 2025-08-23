package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AltTextButtonView;
import com.discord.chat.presentation.message.view.MediaView;
import y0.a;

public final class VideoAttachmentViewBinding implements ViewBinding {
   @NonNull
   public final ConstraintLayout container;
   @NonNull
   public final MediaView mediaView;
   @NonNull
   public final TextView mediaViewAltText;
   @NonNull
   public final AltTextButtonView mediaViewAltTextButton;
   @NonNull
   private final View rootView;

   private VideoAttachmentViewBinding(
      @NonNull View var1, @NonNull ConstraintLayout var2, @NonNull MediaView var3, @NonNull TextView var4, @NonNull AltTextButtonView var5
   ) {
      this.rootView = var1;
      this.container = var2;
      this.mediaView = var3;
      this.mediaViewAltText = var4;
      this.mediaViewAltTextButton = var5;
   }

   @NonNull
   public static VideoAttachmentViewBinding bind(@NonNull View var0) {
      int var1 = R.id.container;
      ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.media_view;
         MediaView var4 = (MediaView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.media_view_alt_text;
            TextView var5 = (TextView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.media_view_alt_text_button;
               AltTextButtonView var3 = (AltTextButtonView)a.a(var0, var1);
               if (var3 != null) {
                  return new VideoAttachmentViewBinding(var0, var2, var4, var5, var3);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static VideoAttachmentViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.video_attachment_view, var1);
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
