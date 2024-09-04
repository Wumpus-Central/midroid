package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import n1.a;

public final class AttachmentUploadOverlayViewBinding implements ViewBinding {
   private final View rootView;
   public final SimpleDraweeView uploadCancel;
   public final SimpleDraweeView uploadComplete;
   public final MaterialCardView uploadCompleteBackground;
   public final ConstraintLayout uploadCompleteLayout;
   public final CircularProgressIndicator uploadProgress;
   public final View uploadProgressBackground;
   public final ConstraintLayout uploadProgressLayout;

   private AttachmentUploadOverlayViewBinding(
      View var1,
      SimpleDraweeView var2,
      SimpleDraweeView var3,
      MaterialCardView var4,
      ConstraintLayout var5,
      CircularProgressIndicator var6,
      View var7,
      ConstraintLayout var8
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

   public static AttachmentUploadOverlayViewBinding bind(View var0) {
      int var1 = R.id.upload_cancel;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.upload_complete;
         SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.upload_complete_background;
            MaterialCardView var3 = (MaterialCardView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.upload_complete_layout;
               ConstraintLayout var8 = (ConstraintLayout)a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.upload_progress;
                  CircularProgressIndicator var6 = (CircularProgressIndicator)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.upload_progress_background;
                     View var5 = a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.upload_progress_layout;
                        ConstraintLayout var4 = (ConstraintLayout)a.a(var0, var1);
                        if (var4 != null) {
                           return new AttachmentUploadOverlayViewBinding(var0, var2, var7, var3, var8, var6, var5, var4);
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static AttachmentUploadOverlayViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.attachment_upload_overlay_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
