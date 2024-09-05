package com.discord.primitives

import android.os.Parcel
import android.os.Parcelable
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.InlineClassDescriptor
import nn.f
import qn.b2
import qn.g0
import qn.g0.a

@f
public inline class MessageId : Parcelable {
   public final val value: String

   @JvmStatic
   fun `constructor-impl`(var0: java.lang.String): java.lang.String {
      q.h(var0, "value");
      return var0;
   }

   @JvmStatic
   public open fun describeContents(): Int {
      return 0;
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      if (var1 !is MessageId) {
         return false;
      } else {
         return q.c(var0, (var1 as MessageId).unbox-impl());
      }
   }

   @JvmStatic
   fun `equals-impl0`(var0: java.lang.String, var1: java.lang.String): Boolean {
      return q.c(var0, var1);
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return var0.hashCode();
   }

   @JvmStatic
   public open fun toString(): String {
      return var0;
   }

   @JvmStatic
   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
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
      q.h(var1, "out");
      writeToParcel-impl(this.value, var1, var2);
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageId.$serializer = new MessageId.$serializer();
         INSTANCE = var0;
         val var1: InlineClassDescriptor = new InlineClassDescriptor("com.discord.primitives.MessageId", var0);
         var1.c("value", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): MessageId {
         q.h(var1, "decoder");
         return MessageId.constructor-impl(var1.q(this.getDescriptor()).z());
      }

      public open fun serialize(encoder: Encoder, value: MessageId) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         var1 = var1.k(this.getDescriptor());
         if (var1 != null) {
            var1.F(var2);
         }
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageId> {
         return MessageId.$serializer.INSTANCE;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<MessageId> {
      fun `createFromParcel-MpY7Jxs`(var1: Parcel): java.lang.String {
         q.h(var1, "parcel");
         return MessageId.constructor-impl(var1.readString());
      }

      fun newArray(var1: Int): Array<MessageId> {
         return new MessageId[var1];
      }
   }
}
