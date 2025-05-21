package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.media_player.MediaPlayer;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class h implements Function1 {
   public final AudioPlayerManager.AudioSource j;
   public final Function1 k;

   public final Object invoke(Object var1) {
      return AudioPlayerManager.b(this.j, this.k, (MediaPlayer.Event)var1);
   }
}
