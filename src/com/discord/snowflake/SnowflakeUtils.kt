package com.discord.snowflake

import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSnowflakeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnowflakeUtils.kt\ncom/discord/snowflake/SnowflakeUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"])
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
      val var2: java.lang.Long = StringsKt.s(var1);
      return if (var2 != null && var2.longValue() > 1420070400000L) var2 else null;
   }

   public fun toTimestamp(snowflake: SnowflakePrimitive): Long {
      return this.toTimestampPart(var1) + 1420070400000L;
   }
}
