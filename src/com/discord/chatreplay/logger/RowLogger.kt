package com.discord.chatreplay.logger

public interface RowLogger {
   public abstract fun logRowsClear() {
   }

   public abstract fun logRowsUpdate(rowsJson: String) {
   }
}
