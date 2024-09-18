package com.discord.snowflake

import kotlin.jvm.internal.q

public object SnowflakeUtils {
   private const val DISCORD_EPOCH: Long = 1420070400000L
   private const val SNOWFLAKE_TIMESTAMP_SHIFT: Int = 22

   private fun toTimestampPart(snowflakeId: SnowflakePrimitive): Long {
      return var1.getSnowflake() ushr 22;
   }

   public fun fromTimestamp(timestamp: Long): Long {
      return var1 - 1420070400000L shl 22;
   }

   public fun String.toSnowflake(): Long? {
      q.h(var1, "<this>");
      var var2: java.lang.Long = h.o(var1);
      if (var2 == null || var2.longValue() <= 1420070400000L) {
         var2 = null;
      }

      return var2;
   }

   public fun toTimestamp(snowflake: SnowflakePrimitive): Long {
      q.h(var1, "snowflake");
      return this.toTimestampPart(var1) + 1420070400000L;
   }
}
