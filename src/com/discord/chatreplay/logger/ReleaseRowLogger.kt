package com.discord.chatreplay.logger

import kotlin.jvm.internal.r

public class ReleaseRowLogger : RowLogger {
   public override fun logRowsClear() {
   }

   public override fun logRowsUpdate(rowsJson: String) {
      r.h(var1, "rowsJson");
   }
}
