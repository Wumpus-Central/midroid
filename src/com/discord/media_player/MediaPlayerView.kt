package com.discord.media_player

import android.content.Context
import android.view.LayoutInflater
import android.view.SurfaceView
import android.view.TextureView
import android.view.View
import com.discord.media_player.databinding.PlayerViewWithSurfaceViewBinding
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.ui.PlayerControlView
import com.google.android.exoplayer2.ui.PlayerView
import kotlin.jvm.internal.r

public class MediaPlayerView(context: Context) {
   public final var isVisible: Boolean
      public final get() {
         val var1: Boolean;
         if (this.view.getVisibility() == 0) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }

      public final set(value) {
         val var2: Byte;
         if (var1) {
            var2 = 0;
         } else {
            var2 = 8;
         }

         this.view.setVisibility(var2);
      }


   internal final var player: Player?
      internal final get() {
         return this.getPlayerView().getPlayer();
      }

      internal final set(value) {
         this.getPlayerView().setPlayer(var1);
      }


   public final val playerView: PlayerView
      public final get() {
         val var1: View = this.view;
         r.f(this.view, "null cannot be cast to non-null type com.google.android.exoplayer2.ui.PlayerView");
         return var1 as PlayerView;
      }


   public final var view: View
      internal set

   init {
      r.h(var1, "context");
      super();
      val var2: PlayerView = PlayerViewWithSurfaceViewBinding.inflate(LayoutInflater.from(var1)).getRoot();
      r.g(var2, "inflate(LayoutInflater.from(context)).root");
      this.view = var2;
      this.getPlayerView().setResizeMode(3);
      this.getPlayerView().setUseController(false);
      this.assignViewToPlayer$media_player_release(this.getPlayer$media_player_release());
   }

   internal fun assignViewToPlayer(player: Player?) {
      val var3: View = this.getPlayerView().getVideoSurfaceView();
      if (var3 is SurfaceView) {
         if (var1 != null) {
            var1.k(var3 as SurfaceView);
         }
      } else if (var3 is TextureView) {
         if (var1 != null) {
            var1.z(var3 as TextureView);
         }
      } else {
         val var2: Boolean;
         if (var3 == null) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (!var2) {
            val var4: java.lang.String;
            if (var3 != null) {
               var4 = var3.getClass().getSimpleName();
            } else {
               var4 = null;
            }

            val var5: StringBuilder = new StringBuilder();
            var5.append("Unsupported surface view type: ");
            var5.append(var4);
            throw new IllegalStateException(var5.toString().toString());
         }
      }
   }

   public fun reset() {
      this.setPlayer$media_player_release(null);
   }

   public class ControlView(context: Context) {
      internal final var player: Player?
         internal final get() {
            return this.playerControlView.getPlayer();
         }

         internal final set(value) {
            this.playerControlView.setPlayer(var1);
         }


      private final var playerControlView: PlayerControlView

      init {
         r.h(var1, "context");
         super();
         this.playerControlView = new PlayerControlView(var1);
      }
   }
}
