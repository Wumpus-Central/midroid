package com.discord.chat.presentation.message.view.voicemessages;

public final class g implements Runnable {
   public final boolean j;

   @Override
   public final void run() {
      AudioPlayerManagerModule.b(this.j);
   }
}
