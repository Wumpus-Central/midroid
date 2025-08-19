@file:SourceDebugExtension(["SMAP\nIdUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdUtils.kt\ncom/discord/misc/utilities/ids/IdUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1179#2,2:26\n*S KotlinDebug\n*F\n+ 1 IdUtils.kt\ncom/discord/misc/utilities/ids/IdUtilsKt\n*L\n18#1:26,2\n*E\n"])

package com.discord.misc.utilities.ids

import kotlin.jvm.internal.SourceDebugExtension

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
