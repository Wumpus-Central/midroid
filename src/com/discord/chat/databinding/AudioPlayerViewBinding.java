package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.AttachmentUploadOverlayView;
import com.discord.chat.presentation.message.view.voicemessages.AudioWaveView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class AudioPlayerViewBinding implements ViewBinding {
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
      SimpleDraweeView var2,
      View var3,
      LinearLayout var4,
      ProgressBar var5,
      SimpleDraweeSpanTextView var6,
      AttachmentUploadOverlayView var7,
      LinearLayout var8,
      AudioWaveView var9,
      View var10
   ) {
      this.rootView = var1;
      this.button = var2;
      this.buttonContainer = var3;
      this.playerContainer = var4;
      this.progress = var5;
      this.text = var6;
      this.uploadOverlay = var7;
      this.uploadOverlayBackground = var8;
      this.wave = var9;
      this.wipe = var10;
   }

   public static AudioPlayerViewBinding bind(View var0) {
      int var1 = R.id.button;
      SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.button_container;
         View var9 = a.a(var0, var1);
         if (var9 != null) {
            var1 = R.id.player_container;
            LinearLayout var4 = (LinearLayout)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.progress;
               ProgressBar var7 = (ProgressBar)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.text;
                  SimpleDraweeSpanTextView var10 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.upload_overlay;
                     AttachmentUploadOverlayView var8 = (AttachmentUploadOverlayView)a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.upload_overlay_background;
                        LinearLayout var2 = (LinearLayout)a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.wave;
                           AudioWaveView var3 = (AudioWaveView)a.a(var0, var1);
                           if (var3 != null) {
                              var1 = R.id.wipe;
                              View var5 = a.a(var0, var1);
                              if (var5 != null) {
                                 return new AudioPlayerViewBinding(var0, var6, var9, var4, var7, var10, var8, var2, var3, var5);
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
