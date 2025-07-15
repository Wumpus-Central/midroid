package com.discord.snowflake

import kotlin.jvm.internal.r

public fun SnowflakePrimitive.toTimestamp(): Long {
   r.h(var0, "<this>");
   return SnowflakeUtils.INSTANCE.toTimestamp(var0);
}
