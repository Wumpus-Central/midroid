package com.discord.device.utils

import ck.a
import kotlin.enums.EnumEntries

private enum class NavigationType(value: Int) {
   BUTTON_THREE(0),
   BUTTON_TWO(1),
   GESTURE(2)
   public final val value: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private NavigationType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<NavigationType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.value = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
