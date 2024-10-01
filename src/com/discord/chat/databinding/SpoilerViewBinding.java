package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.ObscureOverlayView;
import com.discord.chat.presentation.message.view.SpoilerOverlayView;
import o1.a;

public final class SpoilerViewBinding implements ViewBinding {
   public final ObscureOverlayView obscure;
   private final View rootView;
   public final SpoilerOverlayView spoiler;

   private SpoilerViewBinding(View var1, ObscureOverlayView var2, SpoilerOverlayView var3) {
      this.rootView = var1;
      this.obscure = var2;
      this.spoiler = var3;
   }

   public static SpoilerViewBinding bind(View var0) {
      int var1 = R.id.obscure;
      ObscureOverlayView var3 = (ObscureOverlayView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.spoiler;
         SpoilerOverlayView var2 = (SpoilerOverlayView)a.a(var0, var1);
         if (var2 != null) {
            return new SpoilerViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SpoilerViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.spoiler_view, var1);
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
