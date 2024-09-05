package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.view.SimpleDraweeView;
import f3.a;

public final class FileAttachmentViewBinding implements ViewBinding {
   public final ConstraintLayout fileActionGroup;
   public final TextView fileAttachmentDescription;
   public final SimpleDraweeView fileAttachmentDownload;
   public final Barrier fileAttachmentDownloadIconBarrier;
   public final ProgressBar fileAttachmentDownloadProgressBar;
   public final SimpleDraweeView fileAttachmentIcon;
   public final TextView fileAttachmentName;
   private final View rootView;
   public final SpoilerView spoiler;
   public final AttachmentUploadOverlayView uploadOverlay;
   public final LinearLayout uploadOverlayBackground;

   private FileAttachmentViewBinding(
      View var1,
      ConstraintLayout var2,
      TextView var3,
      SimpleDraweeView var4,
      Barrier var5,
      ProgressBar var6,
      SimpleDraweeView var7,
      TextView var8,
      SpoilerView var9,
      AttachmentUploadOverlayView var10,
      LinearLayout var11
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

   public static FileAttachmentViewBinding bind(View var0) {
      int var1 = R.id.file_action_group;
      ConstraintLayout var7 = (ConstraintLayout)a.a(var0, var1);
      if (var7 != null) {
         var1 = R.id.file_attachment_description;
         TextView var10 = (TextView)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.file_attachment_download;
            SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.file_attachment_download_icon_barrier;
               Barrier var9 = (Barrier)a.a(var0, var1);
               if (var9 != null) {
                  var1 = R.id.file_attachment_download_progress_bar;
                  ProgressBar var3 = (ProgressBar)a.a(var0, var1);
                  if (var3 != null) {
                     var1 = R.id.file_attachment_icon;
                     SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.file_attachment_name;
                        TextView var11 = (TextView)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.spoiler;
                           SpoilerView var2 = (SpoilerView)a.a(var0, var1);
                           if (var2 != null) {
                              var1 = R.id.upload_overlay;
                              AttachmentUploadOverlayView var4 = (AttachmentUploadOverlayView)a.a(var0, var1);
                              if (var4 != null) {
                                 var1 = R.id.upload_overlay_background;
                                 LinearLayout var6 = (LinearLayout)a.a(var0, var1);
                                 if (var6 != null) {
                                    return new FileAttachmentViewBinding(var0, var7, var10, var8, var9, var3, var5, var11, var2, var4, var6);
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

   public static FileAttachmentViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.file_attachment_view, var1);
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
