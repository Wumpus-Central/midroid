package com.discord.snowflake

import android.os.Parcelable

public interface SnowflakePrimitive : Parcelable {
   public val snowflake: Long

   public abstract fun isValid(): Boolean {
   }
}
