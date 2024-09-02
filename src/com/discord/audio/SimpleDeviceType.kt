package com.discord.audio

import kotlin.enums.EnumEntries

public enum class SimpleDeviceType {
   BLUETOOTH_HEADSET,
   DEFAULT,
   EARPIECE,
   INVALID,
   SPEAKERPHONE,
   WIRED_HEADSET   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SimpleDeviceType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<SimpleDeviceType> = $values();
      $VALUES = var0;
      $ENTRIES = sj.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
