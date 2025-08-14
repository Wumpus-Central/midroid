package com.discord.chat.presentation.message.view.voicemessages

import com.discord.codegen.NativeAudioPlayerModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class AudioPlayerModule(reactContext: ReactApplicationContext) : NativeAudioPlayerModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `maybePlayCurrentPlayer$lambda$1`() {
      AudioPlayerManager.INSTANCE.maybePlayCurrentPlayer();
   }

   @JvmStatic
   fun `pauseCurrentPlayer$lambda$0`(var0: Boolean) {
      AudioPlayerManager.INSTANCE.pauseCurrentPlayer(var0);
   }

   public override fun handleVoiceMessageDeleted(id: String?) {
   }

   public override fun maybePlayCurrentPlayer() {
      this.reactContext.runOnUiQueueThread(new i());
   }

   public override fun pauseCurrentPlayer(storePauseState: Boolean) {
      this.reactContext.runOnUiQueueThread(new j(var1));
   }
}
