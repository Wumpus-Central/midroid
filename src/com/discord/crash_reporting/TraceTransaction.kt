package com.discord.crash_reporting

public enum class TraceTransaction(transactionName: String, operation: String) {
   NativeModuleInit("Content Appeared", "ui")
   public final val operation: String
   public final val transactionName: String
   @JvmStatic
   private TraceTransaction[] $VALUES = $values();

   init {
      this.transactionName = var3;
      this.operation = var4;
   }
}
