package com.discord.chatreplay.logger

import kotlin.jvm.internal.q

public class ReleaseRowLogger : RowLogger {
   public override fun logRowsClear() {
   }

   public override fun logRowsUpdate(rowsJson: String) {
      q.h(var1, "rowsJson");
   }
}
