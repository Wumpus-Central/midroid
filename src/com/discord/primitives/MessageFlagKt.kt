package com.discord.primitives

public fun Long?.hasMessageFlag(flag: MessageFlag): Boolean {
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
