package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class FileAttachmentViewBinding implements ViewBinding {
   @NonNull
   public final ConstraintLayout fileActionGroup;
   @NonNull
   public final TextView fileAttachmentDescription;
   @NonNull
   public final SimpleDraweeView fileAttachmentDownload;
   @NonNull
   public final Barrier fileAttachmentDownloadIconBarrier;
   @NonNull
   public final ProgressBar fileAttachmentDownloadProgressBar;
   @NonNull
   public final SimpleDraweeView fileAttachmentIcon;
   @NonNull
   public final TextView fileAttachmentName;
   @NonNull
   private final View rootView;
   @NonNull
   public final SpoilerView spoiler;
   @NonNull
   public final AttachmentUploadOverlayView uploadOverlay;
   @NonNull
   public final LinearLayout uploadOverlayBackground;

   private FileAttachmentViewBinding(
      @NonNull View var1,
      @NonNull ConstraintLayout var2,
      @NonNull TextView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull Barrier var5,
      @NonNull ProgressBar var6,
      @NonNull SimpleDraweeView var7,
      @NonNull TextView var8,
      @NonNull SpoilerView var9,
      @NonNull AttachmentUploadOverlayView var10,
      @NonNull LinearLayout var11
   ) {
      this.rootView = var1;
      this.fileActionGroup = var2;
      this.fileAttachmentDescription = var3;
      this.fileAttachmentDownload = var4;
      this.fileAttachmentDownloadIconBarrier = var5;
      this.fileAttachmentDownloadProgressBar = var6;
      this.fileAttachmentIcon = var7;
      this.fileAttachmentName = var8;
      this.spoiler = var9;
      this.uploadOverlay = var10;
      this.uploadOverlayBackground = var11;
   }

   @NonNull
   public static FileAttachmentViewBinding bind(@NonNull View var0) {
      int var1 = R.id.file_action_group;
      ConstraintLayout var8 = (ConstraintLayout)k5.a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.file_attachment_description;
         TextView var5 = (TextView)k5.a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.file_attachment_download;
            SimpleDraweeView var3 = (SimpleDraweeView)k5.a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.file_attachment_download_icon_barrier;
               Barrier var2 = (Barrier)k5.a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.file_attachment_download_progress_bar;
                  ProgressBar var9 = (ProgressBar)k5.a.a(var0, var1);
                  if (var9 != null) {
                     var1 = R.id.file_attachment_icon;
                     SimpleDraweeView var10 = (SimpleDraweeView)k5.a.a(var0, var1);
                     if (var10 != null) {
                        var1 = R.id.file_attachment_name;
                        TextView var11 = (TextView)k5.a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.spoiler;
                           SpoilerView var4 = (SpoilerView)k5.a.a(var0, var1);
                           if (var4 != null) {
                              var1 = R.id.upload_overlay;
                              AttachmentUploadOverlayView var7 = (AttachmentUploadOverlayView)k5.a.a(var0, var1);
                              if (var7 != null) {
                                 var1 = R.id.upload_overlay_background;
                                 LinearLayout var6 = (LinearLayout)k5.a.a(var0, var1);
                                 if (var6 != null) {
                                    return new FileAttachmentViewBinding(var0, var8, var5, var3, var2, var9, var10, var11, var4, var7, var6);
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
   public static FileAttachmentViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.file_attachment_view, var1);
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
