package com.discord.media_player.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.media_player.R;
import com.google.android.exoplayer2.ui.PlayerView;

public final class PlayerViewWithSurfaceViewBinding implements ViewBinding {
   private final PlayerView rootView;

   private PlayerViewWithSurfaceViewBinding(PlayerView var1) {
      this.rootView = var1;
   }

   public static PlayerViewWithSurfaceViewBinding bind(View var0) {
      if (var0 != null) {
         return new PlayerViewWithSurfaceViewBinding((PlayerView)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   public static PlayerViewWithSurfaceViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static PlayerViewWithSurfaceViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.player_view_with_surface_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public PlayerView getRoot() {
      return this.rootView;
   }
}
