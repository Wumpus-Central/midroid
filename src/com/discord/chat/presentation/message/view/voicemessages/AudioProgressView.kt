package com.discord.chat.presentation.message.view.voicemessages

public interface AudioProgressView {
   public var shouldAnimate: Boolean
      internal final set

   public var defaultPaintColor: Int
      public abstract get() {
      }

      internal final set

   public var audioProgressPaintColor: Int
      public abstract get() {
      }

      internal final set

   public abstract fun setAudioProgress(audioProgress: Float, finishAnimation: Boolean = ...) {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls
}
