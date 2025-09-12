package com.discord.crash_reporting.system_logs;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

// $VF: synthetic class
public final class h implements Function0 {
   public final LinkedList d;
   public final Regex e;
   public final boolean i;
   public final Function1 s;

   public final Object invoke() {
      return SystemLogUtils.d(this.d, this.e, this.i, this.s);
   }
}
