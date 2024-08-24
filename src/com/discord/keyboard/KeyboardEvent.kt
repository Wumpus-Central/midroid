package com.discord.keyboard

public interface KeyboardEvent {
   public abstract fun onKeyboardStateChanged(opened: Boolean) {
   }
}
