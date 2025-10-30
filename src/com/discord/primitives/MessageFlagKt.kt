package com.discord.primitives

public fun Long?.hasMessageFlag(flag: MessageFlag): Boolean {
   if (var0 == null) {
      return false;
   } else {
      return (var0 and var1.getValue()) == var1.getValue();
   }
}
