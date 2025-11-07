package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioProgressBar;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class AudioPlayerViewBinding implements ViewBinding {
   @NonNull
   public final LinearLayout audioDetailsView;
   @NonNull
   public final TextView audioFileName;
   @NonNull
   public final TextView audioFileSize;
   @NonNull
   public final AudioProgressBar audioProgressBar;
   @NonNull
   public final LinearLayout audioProgressView;
   @NonNull
   public final SimpleDraweeView button;
   @NonNull
   public final View buttonContainer;
   @NonNull
   public final LinearLayout playerContainer;
   @NonNull
   public final ProgressBar progress;
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeSpanTextView text;
   @NonNull
   public final AttachmentUploadOverlayView uploadOverlay;
   @NonNull
   public final LinearLayout uploadOverlayBackground;
   @NonNull
   public final AudioWaveView wave;
   @NonNull
   public final View wipe;

   private AudioPlayerViewBinding(
      @NonNull View var1,
      @NonNull LinearLayout var2,
      @NonNull TextView var3,
      @NonNull TextView var4,
      @NonNull AudioProgressBar var5,
      @NonNull LinearLayout var6,
      @NonNull SimpleDraweeView var7,
      @NonNull View var8,
      @NonNull LinearLayout var9,
      @NonNull ProgressBar var10,
      @NonNull SimpleDraweeSpanTextView var11,
      @NonNull AttachmentUploadOverlayView var12,
      @NonNull LinearLayout var13,
      @NonNull AudioWaveView var14,
      @NonNull View var15
   ) {
      this.rootView = var1;
      this.audioDetailsView = var2;
      this.audioFileName = var3;
      this.audioFileSize = var4;
      this.audioProgressBar = var5;
      this.audioProgressView = var6;
      this.button = var7;
      this.buttonContainer = var8;
      this.playerContainer = var9;
      this.progress = var10;
      this.text = var11;
      this.uploadOverlay = var12;
      this.uploadOverlayBackground = var13;
      this.wave = var14;
      this.wipe = var15;
   }

   @NonNull
   public static AudioPlayerViewBinding bind(@NonNull View var0) {
      int var1 = R.id.audio_details_view;
      LinearLayout var3 = (LinearLayout)k5.a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.audio_file_name;
         TextView var8 = (TextView)k5.a.a(var0, var1);
         if (var8 != null) {
            var1 = R.id.audio_file_size;
            TextView var9 = (TextView)k5.a.a(var0, var1);
            if (var9 != null) {
               var1 = R.id.audio_progress_bar;
               AudioProgressBar var12 = (AudioProgressBar)k5.a.a(var0, var1);
               if (var12 != null) {
                  var1 = R.id.audio_progress_view;
                  LinearLayout var4 = (LinearLayout)k5.a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.button;
                     SimpleDraweeView var11 = (SimpleDraweeView)k5.a.a(var0, var1);
                     if (var11 != null) {
                        var1 = R.id.button_container;
                        View var5 = k5.a.a(var0, var1);
                        if (var5 != null) {
                           var1 = R.id.player_container;
                           LinearLayout var2 = (LinearLayout)k5.a.a(var0, var1);
                           if (var2 != null) {
                              var1 = R.id.progress;
                              ProgressBar var14 = (ProgressBar)k5.a.a(var0, var1);
                              if (var14 != null) {
                                 var1 = R.id.text;
                                 SimpleDraweeSpanTextView var13 = (SimpleDraweeSpanTextView)k5.a.a(var0, var1);
                                 if (var13 != null) {
                                    var1 = R.id.upload_overlay;
                                    AttachmentUploadOverlayView var15 = (AttachmentUploadOverlayView)k5.a.a(var0, var1);
                                    if (var15 != null) {
                                       var1 = R.id.upload_overlay_background;
                                       LinearLayout var6 = (LinearLayout)k5.a.a(var0, var1);
                                       if (var6 != null) {
                                          var1 = R.id.wave;
                                          AudioWaveView var7 = (AudioWaveView)k5.a.a(var0, var1);
                                          if (var7 != null) {
                                             var1 = R.id.wipe;
                                             View var10 = k5.a.a(var0, var1);
                                             if (var10 != null) {
                                                return new AudioPlayerViewBinding(
                                                   var0, var3, var8, var9, var12, var4, var11, var5, var2, var14, var13, var15, var6, var7, var10
                                                );
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
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static AudioPlayerViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.audio_player_view, var1);
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
