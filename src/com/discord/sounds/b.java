package com.discord.sounds;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import kotlin.jvm.functions.Function1;

public final class b implements OnPreparedListener {
   public final Function1 a;

   public final void onPrepared(MediaPlayer var1) {
      SoundPlayer.b(this.a, var1);
   }
}
