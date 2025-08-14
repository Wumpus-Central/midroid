package com.discord.primitives

import android.os.Parcel
import com.discord.snowflake.SnowflakePrimitive
import kotlinx.serialization.KSerializer
import nb.g

@g
public inline class ChannelId : SnowflakePrimitive {
   public open val snowflake: Long

   @JvmStatic
   fun `constructor-impl`(var0: Long): Long {
      return var0;
   }

   @JvmStatic
   public fun describeContents(): Int {
      return 0;
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      if (var2 !is ChannelId) {
         return false;
      } else {
         return var0 == (var2 as ChannelId).unbox-impl();
      }
   }

   @JvmStatic
   fun `equals-impl0`(var0: Long, var2: Long): Boolean {
      val var4: Boolean;
      if (var0 == var2) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return java.lang.Long.hashCode(var0);
   }

   @JvmStatic
   public open fun isValid(): Boolean {
      val var2: Boolean;
      if (var0 > 0L) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   @JvmStatic
   public open fun toString(): String {
      return java.lang.String.valueOf(var0);
   }

   @JvmStatic
   public fun writeToParcel(dest: Parcel, flags: Int) {
      var2.writeLong(var0);
   }

   fun describeContents(): Int {
      return describeContents-impl(this.snowflake);
   }

   override fun equals(var1: Any): Boolean {
      return equals-impl(this.snowflake, var1);
   }

   override fun hashCode(): Int {
      return hashCode-impl(this.snowflake);
   }

   override fun isValid(): Boolean {
      return isValid-impl(this.snowflake);
   }

   override fun toString(): java.lang.String {
      return toString-impl(this.snowflake);
   }

   fun writeToParcel(var1: Parcel, var2: Int) {
      writeToParcel-impl(this.snowflake, var1, var2);
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelId> {
         return ChannelId.$serializer.INSTANCE;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<ChannelId> {
      fun `createFromParcel-18-flms`(var1: Parcel): Long {
         return ChannelId.constructor-impl(var1.readLong());
      }

      fun newArray(var1: Int): Array<ChannelId> {
         return new ChannelId[var1];
      }
   }
}
