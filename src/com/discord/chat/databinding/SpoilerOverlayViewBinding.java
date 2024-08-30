package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import v2.a;

public final class SpoilerOverlayViewBinding implements ViewBinding {
   public final TextView label;
   public final FrameLayout overlayContainer;
   private final View rootView;

   private SpoilerOverlayViewBinding(View var1, TextView var2, FrameLayout var3) {
      this.rootView = var1;
      this.label = var2;
      this.overlayContainer = var3;
   }

   public static SpoilerOverlayViewBinding bind(View var0) {
      int var1 = R.id.label;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.overlay_container;
         FrameLayout var2 = (FrameLayout)a.a(var0, var1);
         if (var2 != null) {
            return new SpoilerOverlayViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SpoilerOverlayViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.spoiler_overlay_view, var1);
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
