package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioProgressBar;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class AudioPlayerViewBinding implements ViewBinding {
   public final LinearLayout audioDetailsView;
   public final TextView audioFileName;
   public final TextView audioFileSize;
   public final AudioProgressBar audioProgressBar;
   public final LinearLayout audioProgressView;
   public final SimpleDraweeView button;
   public final View buttonContainer;
   public final LinearLayout playerContainer;
   public final ProgressBar progress;
   private final View rootView;
   public final SimpleDraweeSpanTextView text;
   public final AttachmentUploadOverlayView uploadOverlay;
   public final LinearLayout uploadOverlayBackground;
   public final AudioWaveView wave;
   public final View wipe;

   private AudioPlayerViewBinding(
      View var1,
      LinearLayout var2,
      TextView var3,
      TextView var4,
      AudioProgressBar var5,
      LinearLayout var6,
      SimpleDraweeView var7,
      View var8,
      LinearLayout var9,
      ProgressBar var10,
      SimpleDraweeSpanTextView var11,
      AttachmentUploadOverlayView var12,
      LinearLayout var13,
      AudioWaveView var14,
      View var15
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

   public static AudioPlayerViewBinding bind(View var0) {
      int var1 = R.id.audio_details_view;
      LinearLayout var9 = (LinearLayout)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.audio_file_name;
         TextView var7 = (TextView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.audio_file_size;
            TextView var13 = (TextView)a.a(var0, var1);
            if (var13 != null) {
               var1 = R.id.audio_progress_bar;
               AudioProgressBar var5 = (AudioProgressBar)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.audio_progress_view;
                  LinearLayout var14 = (LinearLayout)a.a(var0, var1);
                  if (var14 != null) {
                     var1 = R.id.button;
                     SimpleDraweeView var15 = (SimpleDraweeView)a.a(var0, var1);
                     if (var15 != null) {
                        var1 = R.id.button_container;
                        View var2 = a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.player_container;
                           LinearLayout var8 = (LinearLayout)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.progress;
                              ProgressBar var6 = (ProgressBar)a.a(var0, var1);
                              if (var6 != null) {
                                 var1 = R.id.text;
                                 SimpleDraweeSpanTextView var3 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                 if (var3 != null) {
                                    var1 = R.id.upload_overlay;
                                    AttachmentUploadOverlayView var12 = (AttachmentUploadOverlayView)a.a(var0, var1);
                                    if (var12 != null) {
                                       var1 = R.id.upload_overlay_background;
                                       LinearLayout var4 = (LinearLayout)a.a(var0, var1);
                                       if (var4 != null) {
                                          var1 = R.id.wave;
                                          AudioWaveView var10 = (AudioWaveView)a.a(var0, var1);
                                          if (var10 != null) {
                                             var1 = R.id.wipe;
                                             View var11 = a.a(var0, var1);
                                             if (var11 != null) {
                                                return new AudioPlayerViewBinding(
                                                   var0, var9, var7, var13, var5, var14, var15, var2, var8, var6, var3, var12, var4, var10, var11
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

   public static AudioPlayerViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.audio_player_view, var1);
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
