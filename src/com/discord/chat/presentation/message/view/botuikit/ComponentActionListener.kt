package com.discord.chat.presentation.message.view.botuikit

public interface ComponentActionListener {
   public abstract fun onTapButtonActionComponent(componentId: String) {
   }

   public abstract fun onTapSelectActionComponent(componentId: String) {
   }

   public abstract fun openLink(url: String) {
   }
}
