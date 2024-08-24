package com.discord.audio

public interface DiscordAudioManagerInterface {
   public abstract fun addListener(listener: DiscordAudioManagerListener) {
   }

   public abstract fun getAudioDevices(): Set<AndroidAudioDevice> {
   }

   public abstract fun getEffectiveAudioDevice(): AndroidAudioDevice {
   }

   public abstract fun removeListener(listener: DiscordAudioManagerListener) {
   }

   public abstract fun setActiveAudioDevice(device: AndroidAudioDevice) {
   }

   public abstract fun setCommunicationModeOn(on: Boolean) {
   }

   public abstract fun setSCORetryCount(count: Int) {
   }
}
