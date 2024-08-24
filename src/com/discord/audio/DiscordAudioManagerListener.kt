package com.discord.audio

public interface DiscordAudioManagerListener {
   public abstract fun onActiveAudioDeviceChanged(activeAudioDevice: AndroidAudioDevice) {
   }

   public abstract fun onAudioDevicesUpdated(audioDevices: List<AndroidAudioDevice>) {
   }
}
