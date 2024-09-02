package com.discord.chat.presentation.message.view.voicemessages

public interface AudioProgressView {
   public var audioProgressPaintColor: Int
      public abstract get() {
      }

      public abstract set(<set-?>) {
      }


   public var defaultPaintColor: Int
      public abstract get() {
      }

      public abstract set(<set-?>) {
      }


   public var shouldAnimate: Boolean
      internal final set

   public abstract fun setAudioProgress(audioProgress: Float, finishAnimation: Boolean = ...) {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls
}
