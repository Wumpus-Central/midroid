package com.discord.audio;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class d implements Function1 {
   public final AndroidAudioDevice d;

   public final Object invoke(Object var1) {
      return DiscordAudioManager2.a(this.d, (DiscordAudioManagerListener)var1);
   }
}
