package com.discord.crash_reporting

import kotlin.enums.EnumEntries

public enum class TraceTransaction(transactionName: String, operation: String) {
   NativeModuleInit("Content Appeared", "ui")
   public final val operation: String
   public final val transactionName: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private TraceTransaction[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<TraceTransaction> = $values();
      $VALUES = var0;
      $ENTRIES = jh.a.a(var0);
   }

   init {
      this.transactionName = var3;
      this.operation = var4;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
