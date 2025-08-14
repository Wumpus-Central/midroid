package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.media_player.R;
import com.google.android.exoplayer2.ui.PlayerView;

public final class PlayerViewWithSurfaceViewBinding implements ViewBinding {
   @NonNull
   private final PlayerView rootView;

   private PlayerViewWithSurfaceViewBinding(@NonNull PlayerView var1) {
      this.rootView = var1;
   }

   @NonNull
   public static PlayerViewWithSurfaceViewBinding bind(@NonNull View var0) {
      if (var0 != null) {
         return new PlayerViewWithSurfaceViewBinding((PlayerView)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   @NonNull
   public static PlayerViewWithSurfaceViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static PlayerViewWithSurfaceViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.player_view_with_surface_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public PlayerView getRoot() {
      return this.rootView;
   }
}
