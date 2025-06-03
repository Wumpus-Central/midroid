package com.discord.crash_reporting.system_logs;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class h implements Function1 {
   public final Context j;
   public final Function3 k;

   public final Object invoke(Object var1) {
      return SystemLogReport.a(this.j, this.k, (SystemLogUtils.Tombstone)var1);
   }
}
