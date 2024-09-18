package com.discord.crash_reporting

import kotlin.enums.EnumEntries

public enum class StartupInitSection {
   NativeModuleInitialization,
   NativeModuleSetup,
   ReactBridgeLoading,
   ReactInstanceManager   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private StartupInitSection[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<StartupInitSection> = $values();
      $VALUES = var0;
      $ENTRIES = jh.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
