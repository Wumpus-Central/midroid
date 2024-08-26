package com.discord.sounds;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public final class a implements OnCompletionListener {
   public final SoundPlayer a;

   public final void onCompletion(MediaPlayer var1) {
      SoundPlayer.a(this.a, var1);
   }
}
