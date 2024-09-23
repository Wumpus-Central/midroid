package com.discord.notifications.api

import android.os.Parcel
import android.os.Parcelable
import com.discord.primitives.GuildId
import com.discord.primitives.StickerId
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import il.o1
import il.x0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import nh.p

@f
public data class Sticker(id: StickerId = ...,
      name: String,
      packId: Long? = ...,
      guildId: GuildId? = ...,
      description: String = ...,
      formatType: StickerFormatType = ...,
      tags: String = ...,
      type: StickerType = ...,
      available: Boolean? = ...
   ) : Sticker(var1, var3, var4, var5, var6, var7, var8, var9, var10),
   Parcelable {
   public final val available: Boolean?
   public final val description: String
   public final val formatType: StickerFormatType
   public final val guildId: GuildId?
   public final val id: StickerId
   public final val name: String
   public final val packId: Long?
   public final val tags: String
   public final val type: StickerType

   fun Sticker(
      var1: Int,
      var2: StickerId,
      var3: java.lang.String,
      var4: java.lang.Long,
      var5: GuildId,
      var6: java.lang.String,
      var7: StickerFormatType,
      var8: java.lang.String,
      var9: StickerType,
      var10: java.lang.Boolean,
      var11: SerializationConstructorMarker
   ) {
      if (2 != (var1 and 2)) {
         o1.b(var1, 2, Sticker.$serializer.INSTANCE.getDescriptor());
      }

      super();
      val var12: Long;
      if ((var1 and 1) == 0) {
         var12 = StickerId.constructor-impl(0L);
      } else {
         var12 = var2.unbox-impl();
      }

      this.id = var12;
      this.name = var3;
      if ((var1 and 4) == 0) {
         this.packId = null;
      } else {
         this.packId = var4;
      }

      if ((var1 and 8) == 0) {
         this.guildId = null;
      } else {
         this.guildId = var5;
      }

      if ((var1 and 16) == 0) {
         this.description = "";
      } else {
         this.description = var6;
      }

      if ((var1 and 32) == 0) {
         this.formatType = StickerFormatType.Companion.fromInt(0);
      } else {
         this.formatType = var7;
      }

      if ((var1 and 64) == 0) {
         this.tags = "";
      } else {
         this.tags = var8;
      }

      if ((var1 and 128) == 0) {
         this.type = StickerType.Companion.fromInt(0);
      } else {
         this.type = var9;
      }

      if ((var1 and 256) == 0) {
         this.available = null;
      } else {
         this.available = var10;
      }
   }

   fun Sticker(
      var1: Long,
      var3: java.lang.String,
      var4: java.lang.Long,
      var5: GuildId,
      var6: java.lang.String,
      var7: StickerFormatType,
      var8: java.lang.String,
      var9: StickerType,
      var10: java.lang.Boolean
   ) {
      q.h(var3, "name");
      q.h(var6, "description");
      q.h(var7, "formatType");
      q.h(var8, "tags");
      q.h(var9, "type");
      super();
      this.id = var1;
      this.name = var3;
      this.packId = var4;
      this.guildId = var5;
      this.description = var6;
      this.formatType = var7;
      this.tags = var8;
      this.type = var9;
      this.available = var10;
   }

   public operator fun component1(): StickerId {
      return this.id;
   }

   public operator fun component2(): String {
      return this.name;
   }

   public operator fun component3(): Long? {
      return this.packId;
   }

   public operator fun component4(): GuildId? {
      return this.guildId;
   }

   public operator fun component5(): String {
      return this.description;
   }

   public operator fun component6(): StickerFormatType {
      return this.formatType;
   }

   public operator fun component7(): String {
      return this.tags;
   }

   public operator fun component8(): StickerType {
      return this.type;
   }

   public operator fun component9(): Boolean? {
      return this.available;
   }

   public fun copy(
      id: StickerId = ...,
      name: String = ...,
      packId: Long? = ...,
      guildId: GuildId? = ...,
      description: String = ...,
      formatType: StickerFormatType = ...,
      tags: String = ...,
      type: StickerType = ...,
      available: Boolean? = ...
   ): Sticker {
      q.h(var3, "name");
      q.h(var6, "description");
      q.h(var7, "formatType");
      q.h(var8, "tags");
      q.h(var9, "type");
      return new Sticker(var1, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   public open fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Sticker) {
         return false;
      } else {
         var1 = var1;
         if (!StickerId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.packId, var1.packId)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else if (this.formatType != var1.formatType) {
            return false;
         } else if (!q.c(this.tags, var1.tags)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else {
            return q.c(this.available, var1.available);
         }
      }
   }

   public fun getExtension(): String {
      val var1: Int = Sticker.WhenMappings.$EnumSwitchMapping$0[this.formatType.ordinal()];
      val var3: java.lang.String;
      if (var1 != 1) {
         if (var1 == 2 || var1 == 3) {
            var3 = ".png";
         } else if (var1 != 4) {
            if (var1 != 5) {
               throw new p();
            }

            var3 = ".gif";
         } else {
            var3 = ".json";
         }
      } else {
         var3 = "";
      }

      return var3;
   }

   public override fun hashCode(): Int {
      val var4: Int = StickerId.hashCode-impl(this.id);
      val var5: Int = this.name.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.packId == null) {
         var1 = 0;
      } else {
         var1 = this.packId.hashCode();
      }

      val var2: Int;
      if (this.guildId == null) {
         var2 = 0;
      } else {
         var2 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      val var8: Int = this.description.hashCode();
      val var9: Int = this.formatType.hashCode();
      val var6: Int = this.tags.hashCode();
      val var7: Int = this.type.hashCode();
      if (this.available != null) {
         var3 = this.available.hashCode();
      }

      return (((((((var4 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var8) * 31 + var9) * 31 + var6) * 31 + var7) * 31 + var3;
   }

   public fun isAnimated(): Boolean {
      val var1: Boolean;
      if (this.formatType != StickerFormatType.APNG && this.formatType != StickerFormatType.LOTTIE && this.formatType != StickerFormatType.GIF) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = StickerId.toString-impl(this.id);
      val var8: java.lang.String = this.name;
      val var5: java.lang.Long = this.packId;
      val var7: GuildId = this.guildId;
      val var3: java.lang.String = this.description;
      val var9: StickerFormatType = this.formatType;
      val var10: java.lang.String = this.tags;
      val var4: StickerType = this.type;
      val var6: java.lang.Boolean = this.available;
      val var2: StringBuilder = new StringBuilder();
      var2.append("Sticker(id=");
      var2.append(var1);
      var2.append(", name=");
      var2.append(var8);
      var2.append(", packId=");
      var2.append(var5);
      var2.append(", guildId=");
      var2.append(var7);
      var2.append(", description=");
      var2.append(var3);
      var2.append(", formatType=");
      var2.append(var9);
      var2.append(", tags=");
      var2.append(var10);
      var2.append(", type=");
      var2.append(var4);
      var2.append(", available=");
      var2.append(var6);
      var2.append(")");
      return var2.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
      var1.writeParcelable(StickerId.box-impl(this.id), var2);
      var1.writeString(this.name);
      val var3: java.lang.Long = this.packId;
      if (this.packId == null) {
         var1.writeInt(0);
      } else {
         var1.writeInt(1);
         var1.writeLong(var3);
      }

      var1.writeParcelable(this.guildId, var2);
      var1.writeString(this.description);
      var1.writeString(this.formatType.name());
      var1.writeString(this.tags);
      var1.writeString(this.type.name());
      val var4: java.lang.Boolean = this.available;
      if (this.available == null) {
         var1.writeInt(0);
      } else {
         var1.writeInt(1);
         var1.writeInt(var4);
      }
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Sticker.$serializer = new Sticker.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.Sticker", var0, 9);
         var1.l("id", true);
         var1.l("name", false);
         var1.l("pack_id", true);
         var1.l("guild_id", true);
         var1.l("description", true);
         var1.l("format_type", true);
         var1.l("tags", true);
         var1.l("type", true);
         var1.l("available", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{
            StickerId.$serializer.INSTANCE,
            b2.a,
            a.u(x0.a),
            a.u(GuildId.$serializer.INSTANCE),
            var1,
            StickerFormatType.Serializer.INSTANCE,
            var1,
            StickerType.Serializer.INSTANCE,
            a.u(h.a)
         };
      }

      public open fun deserialize(decoder: Decoder): Sticker {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.c(var19);
         val var7: Boolean = var20.y();
         var var3: Byte = 7;
         var var5: Byte = 6;
         var var9: StickerId = null;
         var var2: Int;
         var var11: java.lang.Boolean;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         val var15: StickerId;
         val var16: Any;
         val var17: Any;
         val var18: Any;
         var var25: StickerType;
         if (var7) {
            var15 = var20.m(var19, 0, StickerId.$serializer.INSTANCE, null) as StickerId;
            var14 = var20.t(var19, 1);
            var17 = var20.v(var19, 2, x0.a, null) as java.lang.Long;
            var12 = var20.v(var19, 3, GuildId.$serializer.INSTANCE, null) as GuildId;
            var13 = var20.t(var19, 4);
            val var10: StickerFormatType = var20.m(var19, 5, StickerFormatType.Serializer.INSTANCE, null) as StickerFormatType;
            val var8: java.lang.String = var20.t(var19, 6);
            val var21: StickerType = var20.m(var19, 7, StickerType.Serializer.INSTANCE, null) as StickerType;
            val var24: java.lang.Boolean = var20.v(var19, 8, h.a, null) as java.lang.Boolean;
            var2 = 511;
            var16 = var10;
            var18 = var8;
            var25 = var21;
            var11 = var24;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var var30: java.lang.Boolean = null;
            var14 = null;
            var13 = null;
            var var23: Any = null;
            var var22: Any = null;
            var12 = null;
            var11 = null;
            var25 = null;

            while (var4) {
               label42: {
                  val var6: Int = var20.x(var19);
                  switch (var6) {
                     case -1:
                        var4 = false;
                        break;
                     case 0:
                        var9 = var20.m(var19, 0, StickerId.$serializer.INSTANCE, var9) as StickerId;
                        var2 |= 1;
                        var3 = 7;
                        break;
                     case 1:
                        var23 = var20.t(var19, 1);
                        var2 |= 2;
                        break label42;
                     case 2:
                        var22 = var20.v(var19, 2, x0.a, var22) as java.lang.Long;
                        var2 |= 4;
                        break label42;
                     case 3:
                        var12 = var20.v(var19, 3, GuildId.$serializer.INSTANCE, var12) as GuildId;
                        var2 |= 8;
                        var3 = 7;
                        continue;
                     case 4:
                        var11 = var20.t(var19, 4);
                        var2 |= 16;
                        continue;
                     case 5:
                        var13 = var20.m(var19, 5, StickerFormatType.Serializer.INSTANCE, var13) as StickerFormatType;
                        var2 |= 32;
                        continue;
                     case 6:
                        var25 = var20.t(var19, var5);
                        var2 |= 64;
                        continue;
                     case 7:
                        var14 = var20.m(var19, var3, StickerType.Serializer.INSTANCE, var14) as StickerType;
                        var2 |= 128;
                        continue;
                     case 8:
                        var30 = var20.v(var19, 8, h.a, var30) as java.lang.Boolean;
                        var2 |= 256;
                        continue;
                     default:
                        throw new n(var6);
                  }

                  var5 = 6;
                  continue;
               }

               var3 = 7;
            }

            var18 = var25;
            var11 = var30;
            var25 = (StickerType)var14;
            var16 = var13;
            var13 = var11;
            var17 = var22;
            var14 = var23;
            var15 = var9;
         }

         var20.b(var19);
         return new Sticker(
            var2,
            var15,
            (java.lang.String)var14,
            (java.lang.Long)var17,
            (GuildId)var12,
            (java.lang.String)var13,
            (StickerFormatType)var16,
            (java.lang.String)var18,
            var25,
            var11,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: Sticker) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         Sticker.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Sticker> {
         return Sticker.$serializer.INSTANCE;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<Sticker> {
      fun createFromParcel(var1: Parcel): Sticker {
         q.h(var1, "parcel");
         val var3: Long = (var1.readParcelable(Sticker.class.getClassLoader()) as StickerId).unbox-impl();
         val var6: java.lang.String = var1.readString();
         val var5: java.lang.Long;
         if (var1.readInt() == 0) {
            var5 = null;
         } else {
            var5 = var1.readLong();
         }

         val var7: GuildId = var1.readParcelable(Sticker.class.getClassLoader()) as GuildId;
         val var8: java.lang.String = var1.readString();
         val var10: StickerFormatType = StickerFormatType.valueOf(var1.readString());
         val var9: java.lang.String = var1.readString();
         val var11: StickerType = StickerType.valueOf(var1.readString());
         val var12: java.lang.Boolean;
         if (var1.readInt() == 0) {
            var12 = null;
         } else {
            val var2: Boolean;
            if (var1.readInt() != 0) {
               var2 = true;
            } else {
               var2 = false;
            }

            var12 = var2;
         }

         return new Sticker(var3, var6, var5, var7, var8, var10, var9, var11, var12, null);
      }

      fun newArray(var1: Int): Array<Sticker> {
         return new Sticker[var1];
      }
   }
}
