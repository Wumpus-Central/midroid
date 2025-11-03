package com.discord.crash_reporting.system_logs;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class c implements Function1 {
   public final Context d;
   public final Function3 e;

   public final Object invoke(Object var1) {
      return SystemLogReport.a(this.d, this.e, (SystemLogUtils.Tombstone)var1);
   }
}
