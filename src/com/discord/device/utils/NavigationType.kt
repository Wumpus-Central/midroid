package com.discord.device.utils

private enum class NavigationType(value: Int) {
   BUTTON_THREE(0),
   BUTTON_TWO(1),
   GESTURE(2)
   public final val value: Int
   @JvmStatic
   private NavigationType[] $VALUES = $values();

   init {
      this.value = var3;
   }
}
