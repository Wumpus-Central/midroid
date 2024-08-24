package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;

public final class OverlayVoiceBubbleBinding implements ViewBinding {
   public final SimpleDraweeView overlayBubbleIv;
   private final SimpleDraweeView rootView;

   private OverlayVoiceBubbleBinding(SimpleDraweeView var1, SimpleDraweeView var2) {
      this.rootView = var1;
      this.overlayBubbleIv = var2;
   }

   public static OverlayVoiceBubbleBinding bind(View var0) {
      if (var0 != null) {
         SimpleDraweeView var1 = (SimpleDraweeView)var0;
         return new OverlayVoiceBubbleBinding(var1, var1);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   public static OverlayVoiceBubbleBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static OverlayVoiceBubbleBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_voice_bubble, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public SimpleDraweeView getRoot() {
      return this.rootView;
   }
}
