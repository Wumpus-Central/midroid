package com.discord.chat.presentation.message.view.voicemessages;

import android.media.AudioManager.OnAudioFocusChangeListener;

// $VF: synthetic class
public final class f implements OnAudioFocusChangeListener {
   public final void onAudioFocusChange(int var1) {
      AudioPlayerManager.a(var1);
   }
}
