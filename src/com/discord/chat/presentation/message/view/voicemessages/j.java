package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.media_player.MediaPlayer;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class j implements Function1 {
   public final AudioPlayerView d;

   public final Object invoke(Object var1) {
      return AudioPlayerView.d(this.d, (MediaPlayer.Event)var1);
   }
}
