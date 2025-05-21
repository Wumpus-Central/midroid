package com.discord.crash_reporting.system_logs;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

// $VF: synthetic class
public final class g implements Function0 {
   public final LinkedList j;
   public final Regex k;
   public final boolean l;
   public final Function1 m;

   public final Object invoke() {
      return SystemLogUtils.d(this.j, this.k, this.l, this.m);
   }
}
