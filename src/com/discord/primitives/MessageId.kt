package com.discord.primitives

import android.os.Parcel
import android.os.Parcelable
import com.discord.snowflake.SnowflakeUtils
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public inline class MessageId : Parcelable {
   public final val value: String

   @JvmStatic
   fun `constructor-impl`(var0: java.lang.String): java.lang.String {
      r.h(var0, "value");
      return var0;
   }

   @JvmStatic
   public fun describeContents(): Int {
      return 0;
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      if (var1 !is MessageId) {
         return false;
      } else {
         return r.c(var0, (var1 as MessageId).unbox-impl());
      }
   }

   @JvmStatic
   fun `equals-impl0`(var0: java.lang.String, var1: java.lang.String): Boolean {
      return r.c(var0, var1);
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return var0.hashCode();
   }

   @JvmStatic
   public fun toSnowflake(): MessageIdSnowflake? {
      val var1: java.lang.Long = SnowflakeUtils.INSTANCE.toSnowflake(var0);
      val var2: MessageIdSnowflake;
      if (var1 != null) {
         var2 = MessageIdSnowflake.box-impl(MessageIdSnowflake.constructor-impl(var1.longValue()));
      } else {
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   public open fun toString(): String {
      return var0;
   }

   @JvmStatic
   public fun writeToParcel(dest: Parcel, flags: Int) {
      r.h(var1, "dest");
      var1.writeString(var0);
   }

   fun describeContents(): Int {
      return describeContents-impl(this.value);
   }

   override fun equals(var1: Any): Boolean {
      return equals-impl(this.value, var1);
   }

   override fun hashCode(): Int {
      return hashCode-impl(this.value);
   }

   override fun toString(): java.lang.String {
      return toString-impl(this.value);
   }

   fun writeToParcel(var1: Parcel, var2: Int) {
      r.h(var1, "dest");
      writeToParcel-impl(this.value, var1, var2);
   }

   public companion object {
      public fun serializer(): KSerializer<MessageId> {
         return MessageId.$serializer.INSTANCE;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<MessageId> {
      fun `createFromParcel-MpY7Jxs`(var1: Parcel): java.lang.String {
         r.h(var1, "parcel");
         return MessageId.constructor-impl(var1.readString());
      }

      fun newArray(var1: Int): Array<MessageId> {
         return new MessageId[var1];
      }
   }
}
