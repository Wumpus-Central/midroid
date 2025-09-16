package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.media_player.MediaPlayer;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class h implements Function1 {
   public final AudioPlayerManager.AudioSource d;
   public final Function1 e;

   public final Object invoke(Object var1) {
      return AudioPlayerManager.b(this.d, this.e, (MediaPlayer.Event)var1);
   }
}
