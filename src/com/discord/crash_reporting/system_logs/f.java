package com.discord.crash_reporting.system_logs;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

// $VF: synthetic class
public final class f implements Function1 {
   public final Regex d;

   public final Object invoke(Object var1) {
      return SystemLogUtils.b(this.d, (MatchResult)var1);
   }
}
