package com.discord.snowflake

import kotlin.jvm.internal.q

public fun SnowflakePrimitive.toTimestamp(): Long {
   q.h(var0, "<this>");
   return SnowflakeUtils.INSTANCE.toTimestamp(var0);
}
