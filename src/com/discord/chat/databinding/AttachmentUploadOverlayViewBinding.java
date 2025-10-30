package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import e4.a;

public final class AttachmentUploadOverlayViewBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeView uploadCancel;
   @NonNull
   public final SimpleDraweeView uploadComplete;
   @NonNull
   public final MaterialCardView uploadCompleteBackground;
   @NonNull
   public final ConstraintLayout uploadCompleteLayout;
   @NonNull
   public final CircularProgressIndicator uploadProgress;
   @NonNull
   public final View uploadProgressBackground;
   @NonNull
   public final ConstraintLayout uploadProgressLayout;

   private AttachmentUploadOverlayViewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull MaterialCardView var4,
      @NonNull ConstraintLayout var5,
      @NonNull CircularProgressIndicator var6,
      @NonNull View var7,
      @NonNull ConstraintLayout var8
   ) {
      this.rootView = var1;
      this.uploadCancel = var2;
      this.uploadComplete = var3;
      this.uploadCompleteBackground = var4;
      this.uploadCompleteLayout = var5;
      this.uploadProgress = var6;
      this.uploadProgressBackground = var7;
      this.uploadProgressLayout = var8;
   }

   @NonNull
   public static AttachmentUploadOverlayViewBinding bind(@NonNull View var0) {
      int var1 = R.id.upload_cancel;
      SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.upload_complete;
         SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.upload_complete_background;
            MaterialCardView var2 = (MaterialCardView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.upload_complete_layout;
               ConstraintLayout var3 = (ConstraintLayout)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.upload_progress;
                  CircularProgressIndicator var8 = (CircularProgressIndicator)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.upload_progress_background;
                     View var7 = a.a(var0, var1);
                     if (var7 != null) {
                        var1 = R.id.upload_progress_layout;
                        ConstraintLayout var4 = (ConstraintLayout)a.a(var0, var1);
                        if (var4 != null) {
                           return new AttachmentUploadOverlayViewBinding(var0, var6, var5, var2, var3, var8, var7, var4);
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
   public static AttachmentUploadOverlayViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.attachment_upload_overlay_view, var1);
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
