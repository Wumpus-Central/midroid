package com.discord.sounds;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

// $VF: synthetic class
public final class c implements OnCompletionListener {
   public final SoundPlayer a;

   public final void onCompletion(MediaPlayer var1) {
      SoundPlayer.b(this.a, var1);
   }
}
