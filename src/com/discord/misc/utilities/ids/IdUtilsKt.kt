package com.discord.misc.utilities.ids

public fun CharSequence?.convertToId(): Long {
   if (var0 == null) {
      return 0L;
   } else {
      var var2: Long = -3750763034362895579L;

      for (int var1 = 0; var1 < var0.length(); var1++) {
         var2 = (var2 xor var0.charAt(var1)) * 1099511628211L;
      }

      return var2;
   }
}
