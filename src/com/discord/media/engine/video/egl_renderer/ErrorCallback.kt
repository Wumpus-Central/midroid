package com.discord.media.engine.video.egl_renderer

internal interface ErrorCallback {
   public abstract fun onGlOutOfMemory() {
   }
}
