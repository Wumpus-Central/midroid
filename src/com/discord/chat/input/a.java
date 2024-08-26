package com.discord.chat.input;

import com.facebook.react.bridge.Promise;

public final class a implements Runnable {
   public final int j;
   public final ChatInputManagerModule k;
   public final Promise l;

   @Override
   public final void run() {
      ChatInputManagerModule.a(this.j, this.k, this.l);
   }
}
