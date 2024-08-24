package com.discord.chat.presentation.list

public interface SwipeReplyInitiator {
   public var enableSwipeToEdit: Boolean
      internal final set

   public var enableSwipeToReply: Boolean
      internal final set

   public var onInitiateEdit: () -> Unit
      internal final set

   public var onInitiateReply: () -> Unit
      internal final set

   public var shadowView: MaskedShadowView
      internal final set

   public var usingGradientTheme: Boolean
      internal final set

   public abstract fun onSwipeEnd() {
   }

   public abstract fun onSwipeStart() {
   }
}
