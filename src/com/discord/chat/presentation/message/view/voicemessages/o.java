package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.media_player.MediaPlayer;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class o implements Function1 {
   public final AudioPlayerView j;

   public final Object invoke(Object var1) {
      return AudioPlayerView.d(this.j, (MediaPlayer.Event)var1);
   }
}
