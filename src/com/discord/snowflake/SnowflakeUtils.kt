package com.discord.snowflake

import kotlin.jvm.internal.r

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
      r.h(var1, "<this>");
      val var3: java.lang.Long = f.o(var1);
      if (var3 != null) {
         val var2: Boolean;
         if (var3.longValue() > 1420070400000L) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2) {
            return var3;
         }
      }

      return null;
   }

   public fun toTimestamp(snowflake: SnowflakePrimitive): Long {
      r.h(var1, "snowflake");
      return this.toTimestampPart(var1) + 1420070400000L;
   }
}
