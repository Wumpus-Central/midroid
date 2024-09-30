package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class UploadProgressViewBinding implements ViewBinding {
   public final Barrier barrier;
   public final View progressBar;
   public final FrameLayout progressBg;
   public final SimpleDraweeView progressCancel;
   public final SimpleDraweeView progressFileImage;
   public final TextView progressSubtext;
   public final TextView progressText;
   private final View rootView;

   private UploadProgressViewBinding(
      View var1, Barrier var2, View var3, FrameLayout var4, SimpleDraweeView var5, SimpleDraweeView var6, TextView var7, TextView var8
   ) {
      this.rootView = var1;
      this.barrier = var2;
      this.progressBar = var3;
      this.progressBg = var4;
      this.progressCancel = var5;
      this.progressFileImage = var6;
      this.progressSubtext = var7;
      this.progressText = var8;
   }

   public static UploadProgressViewBinding bind(View var0) {
      int var1 = R.id.barrier;
      Barrier var6 = (Barrier)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.progress_bar;
         View var5 = a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.progress_bg;
            FrameLayout var2 = (FrameLayout)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.progress_cancel;
               SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.progress_file_image;
                  SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.progress_subtext;
                     TextView var7 = (TextView)a.a(var0, var1);
                     if (var7 != null) {
                        var1 = R.id.progress_text;
                        TextView var4 = (TextView)a.a(var0, var1);
                        if (var4 != null) {
                           return new UploadProgressViewBinding(var0, var6, var5, var2, var3, var8, var7, var4);
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static UploadProgressViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.upload_progress_view, var1);
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
