package com.discord.media.engine.types

import org.webrtc.VideoFrame

public interface VideoSink {
   public abstract fun onFrame(frame: VideoFrame, mirror: Boolean) {
   }
}
