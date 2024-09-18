package com.discord.primitives

import kotlin.jvm.internal.q

public fun Long?.hasMessageFlag(flag: MessageFlag): Boolean {
   q.h(var1, "flag");
   var var2: Boolean = false;
   if (var0 == null) {
      return false;
   } else {
      if ((var0 and var1.getValue()) == var1.getValue()) {
         var2 = true;
      }

      return var2;
   }
}
