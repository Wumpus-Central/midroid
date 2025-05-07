package com.discord.native.engine

import kotlin.enums.EnumEntries
import u8.a

public enum class VideoInputDeviceFacing {
   Back,
   Front,
   Unknown   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private VideoInputDeviceFacing[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<VideoInputDeviceFacing> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
