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
      SimpleDraweeView var6,
      View var7,
      LinearLayout var8,
      ProgressBar var9,
      SimpleDraweeSpanTextView var10,
      AttachmentUploadOverlayView var11,
      LinearLayout var12,
      AudioWaveView var13,
      View var14
   ) {
      this.rootView = var1;
      this.audioDetailsView = var2;
      this.audioFileName = var3;
      this.audioFileSize = var4;
      this.audioProgressBar = var5;
      this.button = var6;
      this.buttonContainer = var7;
      this.playerContainer = var8;
      this.progress = var9;
      this.text = var10;
      this.uploadOverlay = var11;
      this.uploadOverlayBackground = var12;
      this.wave = var13;
      this.wipe = var14;
   }

   public static AudioPlayerViewBinding bind(View var0) {
      int var1 = R.id.audio_details_view;
      LinearLayout var3 = (LinearLayout)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.audio_file_name;
         TextView var6 = (TextView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.audio_file_size;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.audio_progress_bar;
               AudioProgressBar var2 = (AudioProgressBar)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.button;
                  SimpleDraweeView var10 = (SimpleDraweeView)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.button_container;
                     View var5 = a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.player_container;
                        LinearLayout var13 = (LinearLayout)a.a(var0, var1);
                        if (var13 != null) {
                           var1 = R.id.progress;
                           ProgressBar var8 = (ProgressBar)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.text;
                              SimpleDraweeSpanTextView var7 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                              if (var7 != null) {
                                 var1 = R.id.upload_overlay;
                                 AttachmentUploadOverlayView var11 = (AttachmentUploadOverlayView)a.a(var0, var1);
                                 if (var11 != null) {
                                    var1 = R.id.upload_overlay_background;
                                    LinearLayout var14 = (LinearLayout)a.a(var0, var1);
                                    if (var14 != null) {
                                       var1 = R.id.wave;
                                       AudioWaveView var9 = (AudioWaveView)a.a(var0, var1);
                                       if (var9 != null) {
                                          var1 = R.id.wipe;
                                          View var12 = a.a(var0, var1);
                                          if (var12 != null) {
                                             return new AudioPlayerViewBinding(
                                                var0, var3, var6, var4, var2, var10, var5, var13, var8, var7, var11, var14, var9, var12
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

   public View getRoot() {
      return this.rootView;
   }
}
