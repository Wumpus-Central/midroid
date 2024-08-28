package com.discord.notifications.api

import android.os.Parcel
import android.os.Parcelable
import com.discord.primitives.GuildId
import com.discord.primitives.StickerId
import eh.p
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.n1
import xk.w0

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
         n1.b(var1, 2, Sticker.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: Sticker, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && StickerId.equals-impl0(var0.id, StickerId.constructor-impl(0L))) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 0, StickerId.$serializer.INSTANCE, StickerId.box-impl(var0.id));
      }

      var1.z(var2, 1, var0.name);
      if (!var1.A(var2, 2) && var0.packId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, w0.a, var0.packId);
      }

      if (!var1.A(var2, 3) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, GuildId.$serializer.INSTANCE, var0.guildId);
      }

      if (!var1.A(var2, 4) && r.c(var0.description, "")) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.z(var2, 4, var0.description);
      }

      if (!var1.A(var2, 5) && var0.formatType === StickerFormatType.Companion.fromInt(0)) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 5, StickerFormatType.Serializer.INSTANCE, var0.formatType);
      }

      if (!var1.A(var2, 6) && r.c(var0.tags, "")) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.z(var2, 6, var0.tags);
      }

      if (!var1.A(var2, 7) && var0.type === StickerType.Companion.fromInt(0)) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 7, StickerType.Serializer.INSTANCE, var0.type);
      }

      label72: {
         if (!var1.A(var2, 8)) {
            var3 = false;
            if (var0.available == null) {
               break label72;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, h.a, var0.available);
      }
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
      r.h(var3, "name");
      r.h(var6, "description");
      r.h(var7, "formatType");
      r.h(var8, "tags");
      r.h(var9, "type");
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
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.packId, var1.packId)) {
            return false;
         } else if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.description, var1.description)) {
            return false;
         } else if (this.formatType != var1.formatType) {
            return false;
         } else if (!r.c(this.tags, var1.tags)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else {
            return r.c(this.available, var1.available);
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
      val var6: java.lang.String = StickerId.toString-impl(this.id);
      val var9: java.lang.String = this.name;
      val var5: java.lang.Long = this.packId;
      val var10: GuildId = this.guildId;
      val var1: java.lang.String = this.description;
      val var4: StickerFormatType = this.formatType;
      val var2: java.lang.String = this.tags;
      val var3: StickerType = this.type;
      val var7: java.lang.Boolean = this.available;
      val var8: StringBuilder = new StringBuilder();
      var8.append("Sticker(id=");
      var8.append(var6);
      var8.append(", name=");
      var8.append(var9);
      var8.append(", packId=");
      var8.append(var5);
      var8.append(", guildId=");
      var8.append(var10);
      var8.append(", description=");
      var8.append(var1);
      var8.append(", formatType=");
      var8.append(var4);
      var8.append(", tags=");
      var8.append(var2);
      var8.append(", type=");
      var8.append(var3);
      var8.append(", available=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      r.h(var1, "out");
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

   public object `$serializer` : f0<Sticker> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{
            StickerId.$serializer.INSTANCE,
            a2.a,
            a.u(w0.a),
            a.u(GuildId.$serializer.INSTANCE),
            var1,
            StickerFormatType.Serializer.INSTANCE,
            var1,
            StickerType.Serializer.INSTANCE,
            a.u(h.a)
         };
      }

      public open fun deserialize(decoder: Decoder): Sticker {
         r.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         val var7: Boolean = var18.p();
         var var3: Byte = 7;
         var var5: Byte = 6;
         var var9: Any = null;
         var var2: Int;
         var var10: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         val var16: Any;
         var var19: Any;
         if (var7) {
            var9 = var18.y(var17, 0, StickerId.$serializer.INSTANCE, null);
            var16 = var18.m(var17, 1);
            var19 = var18.n(var17, 2, w0.a, null);
            var14 = var18.n(var17, 3, GuildId.$serializer.INSTANCE, null);
            var11 = var18.m(var17, 4);
            var12 = var18.y(var17, 5, StickerFormatType.Serializer.INSTANCE, null);
            val var8: java.lang.String = var18.m(var17, 6);
            var15 = var18.y(var17, 7, StickerType.Serializer.INSTANCE, null);
            var13 = var18.n(var17, 8, h.a, null);
            var2 = 511;
            var10 = var8;
         } else {
            var var4: Boolean = true;
            var2 = 0;
            var13 = null;
            var15 = null;
            var12 = null;
            var var20: Any = null;
            var19 = null;
            var14 = null;
            var11 = null;
            var10 = null;

            while (var4) {
               label42: {
                  val var6: Int = var18.o(var17);
                  switch (var6) {
                     case -1:
                        var4 = false;
                        break;
                     case 0:
                        var9 = var18.y(var17, 0, StickerId.$serializer.INSTANCE, var9);
                        var2 |= 1;
                        var3 = 7;
                        break;
                     case 1:
                        var20 = var18.m(var17, 1);
                        var2 |= 2;
                        break label42;
                     case 2:
                        var19 = var18.n(var17, 2, w0.a, var19);
                        var2 |= 4;
                        break label42;
                     case 3:
                        var14 = var18.n(var17, 3, GuildId.$serializer.INSTANCE, var14);
                        var2 |= 8;
                        var3 = 7;
                        continue;
                     case 4:
                        var11 = var18.m(var17, 4);
                        var2 |= 16;
                        continue;
                     case 5:
                        var12 = var18.y(var17, 5, StickerFormatType.Serializer.INSTANCE, var12);
                        var2 |= 32;
                        continue;
                     case 6:
                        var10 = var18.m(var17, var5);
                        var2 |= 64;
                        continue;
                     case 7:
                        var15 = var18.y(var17, var3, StickerType.Serializer.INSTANCE, var15);
                        var2 |= 128;
                        continue;
                     case 8:
                        var13 = var18.n(var17, 8, h.a, var13);
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

            var16 = var20;
         }

         var18.c(var17);
         return new Sticker(
            var2,
            var9 as StickerId,
            (java.lang.String)var16,
            var19 as java.lang.Long,
            var14 as GuildId,
            (java.lang.String)var11,
            var12 as StickerFormatType,
            (java.lang.String)var10,
            var15 as StickerType,
            var13 as java.lang.Boolean,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: Sticker) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Sticker.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
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
         r.h(var1, "parcel");
         val var3: Long = (var1.readParcelable(Sticker.class.getClassLoader()) as StickerId).unbox-impl();
         val var6: java.lang.String = var1.readString();
         val var5: java.lang.Long;
         if (var1.readInt() == 0) {
            var5 = null;
         } else {
            var5 = var1.readLong();
         }

         val var10: GuildId = var1.readParcelable(Sticker.class.getClassLoader()) as GuildId;
         val var11: java.lang.String = var1.readString();
         val var8: StickerFormatType = StickerFormatType.valueOf(var1.readString());
         val var7: java.lang.String = var1.readString();
         val var9: StickerType = StickerType.valueOf(var1.readString());
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

         return new Sticker(var3, var6, var5, var10, var11, var8, var7, var9, var12, null);
      }

      fun newArray(var1: Int): Array<Sticker> {
         return new Sticker[var1];
      }
   }
}
