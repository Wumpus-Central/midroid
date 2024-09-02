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
import kotlin.jvm.internal.q

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
         q.f(this.view, "null cannot be cast to non-null type com.google.android.exoplayer2.ui.PlayerView");
         return var1 as PlayerView;
      }


   public final var view: View
      internal set

   init {
      q.h(var1, "context");
      super();
      val var2: PlayerView = PlayerViewWithSurfaceViewBinding.inflate(LayoutInflater.from(var1)).getRoot();
      q.g(var2, "getRoot(...)");
      this.view = var2;
      this.getPlayerView().setResizeMode(3);
      this.getPlayerView().setUseController(false);
      this.assignViewToPlayer$media_player_release(this.getPlayer$media_player_release());
   }

   internal fun assignViewToPlayer(player: Player?) {
      val var2: View = this.getPlayerView().getVideoSurfaceView();
      if (var2 is SurfaceView) {
         if (var1 != null) {
            var1.j(var2 as SurfaceView);
         }
      } else if (var2 is TextureView) {
         if (var1 != null) {
            var1.z(var2 as TextureView);
         }
      } else if (var2 != null) {
         val var3: java.lang.String;
         if (var2 != null) {
            var3 = var2.getClass().getSimpleName();
         } else {
            var3 = null;
         }

         val var4: StringBuilder = new StringBuilder();
         var4.append("Unsupported surface view type: ");
         var4.append(var3);
         throw new IllegalStateException(var4.toString().toString());
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
         q.h(var1, "context");
         super();
         this.playerControlView = new PlayerControlView(var1);
      }
   }
}
