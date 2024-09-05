package com.discord.primitives

import android.os.Parcel
import com.discord.snowflake.SnowflakePrimitive
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.InlineClassDescriptor
import nn.f
import qn.g0
import qn.x0
import qn.g0.a

@f
public inline class RoleId : SnowflakePrimitive {
   public open val snowflake: Long

   @JvmStatic
   fun `constructor-impl`(var0: Long): Long {
      return var0;
   }

   @JvmStatic
   public open fun describeContents(): Int {
      return 0;
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      if (var2 !is RoleId) {
         return false;
      } else {
         return var0 == (var2 as RoleId).unbox-impl();
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
   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var2, "out");
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

   fun isValid(): Boolean {
      return isValid-impl(this.snowflake);
   }

   override fun toString(): java.lang.String {
      return toString-impl(this.snowflake);
   }

   fun writeToParcel(var1: Parcel, var2: Int) {
      q.h(var1, "out");
      writeToParcel-impl(this.snowflake, var1, var2);
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: RoleId.$serializer = new RoleId.$serializer();
         INSTANCE = var0;
         val var1: InlineClassDescriptor = new InlineClassDescriptor("com.discord.primitives.RoleId", var0);
         var1.c("snowflake", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{x0.a};
      }

      public open fun deserialize(decoder: Decoder): RoleId {
         q.h(var1, "decoder");
         return RoleId.constructor-impl(var1.q(this.getDescriptor()).l());
      }

      public open fun serialize(encoder: Encoder, value: RoleId) {
         q.h(var1, "encoder");
         var1 = var1.k(this.getDescriptor());
         if (var1 != null) {
            var1.l(var2);
         }
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleId> {
         return RoleId.$serializer.INSTANCE;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<RoleId> {
      fun `createFromParcel-K4NZIAs`(var1: Parcel): Long {
         q.h(var1, "parcel");
         return RoleId.constructor-impl(var1.readLong());
      }

      fun newArray(var1: Int): Array<RoleId> {
         return new RoleId[var1];
      }
   }
}
