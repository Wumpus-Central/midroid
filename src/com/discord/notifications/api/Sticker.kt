package com.discord.notifications.api

import android.os.Parcel
import android.os.Parcelable
import com.discord.primitives.GuildId
import com.discord.primitives.StickerId
import ht.p
import kotlinx.serialization.KSerializer
import xu.m

@m
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
   public final val id: StickerId
   public final val name: String
   public final val packId: Long?
   public final val guildId: GuildId?
   public final val description: String
   public final val formatType: StickerFormatType
   public final val tags: String
   public final val type: StickerType
   public final val available: Boolean?

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
      return new Sticker(var1, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   public fun describeContents(): Int {
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
         } else if (!(this.name == var1.name)) {
            return false;
         } else if (!(this.packId == var1.packId)) {
            return false;
         } else if (!(this.guildId == var1.guildId)) {
            return false;
         } else if (!(this.description == var1.description)) {
            return false;
         } else if (this.formatType != var1.formatType) {
            return false;
         } else if (!(this.tags == var1.tags)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else {
            return this.available == var1.available;
         }
      }
   }

   public fun getExtension(): String {
      val var1: Int = Sticker.WhenMappings.$EnumSwitchMapping$0[this.formatType.ordinal()];
      if (var1 != 1) {
         if (var1 == 2 || var1 == 3) {
            return ".png";
         } else if (var1 == 4) {
            return ".json";
         } else if (var1 == 5) {
            return ".gif";
         } else {
            throw new p();
         }
      } else {
         return "";
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = StickerId.hashCode-impl(this.id);
      val var4: Int = this.name.hashCode();
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
      val var6: Int = this.formatType.hashCode();
      val var9: Int = this.tags.hashCode();
      val var7: Int = this.type.hashCode();
      if (this.available != null) {
         var3 = this.available.hashCode();
      }

      return (((((((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var8) * 31 + var6) * 31 + var9) * 31 + var7) * 31 + var3;
   }

   public fun isAnimated(): Boolean {
      return this.formatType === StickerFormatType.APNG || this.formatType === StickerFormatType.LOTTIE || this.formatType === StickerFormatType.GIF;
   }

   public override fun toString(): String {
      val var10: java.lang.String = StickerId.toString-impl(this.id);
      val var1: java.lang.String = this.name;
      val var6: java.lang.Long = this.packId;
      val var5: GuildId = this.guildId;
      val var4: java.lang.String = this.description;
      val var7: StickerFormatType = this.formatType;
      val var8: java.lang.String = this.tags;
      val var9: StickerType = this.type;
      val var3: java.lang.Boolean = this.available;
      val var2: StringBuilder = new StringBuilder();
      var2.append("Sticker(id=");
      var2.append(var10);
      var2.append(", name=");
      var2.append(var1);
      var2.append(", packId=");
      var2.append(var6);
      var2.append(", guildId=");
      var2.append(var5);
      var2.append(", description=");
      var2.append(var4);
      var2.append(", formatType=");
      var2.append(var7);
      var2.append(", tags=");
      var2.append(var8);
      var2.append(", type=");
      var2.append(var9);
      var2.append(", available=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public fun writeToParcel(dest: Parcel, flags: Int) {
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

   public companion object {
      public fun serializer(): KSerializer<Sticker> {
         return Sticker.$serializer.INSTANCE;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<Sticker> {
      fun createFromParcel(var1: Parcel): Sticker {
         val var3: Long = (var1.readParcelable(Sticker.class.getClassLoader()) as StickerId).unbox-impl();
         val var8: java.lang.String = var1.readString();
         val var6: java.lang.Long;
         if (var1.readInt() == 0) {
            var6 = null;
         } else {
            var6 = var1.readLong();
         }

         val var9: GuildId = var1.readParcelable(Sticker.class.getClassLoader()) as GuildId;
         val var11: java.lang.String = var1.readString();
         val var13: StickerFormatType = StickerFormatType.valueOf(var1.readString());
         val var12: java.lang.String = var1.readString();
         val var10: StickerType = StickerType.valueOf(var1.readString());
         val var14: java.lang.Boolean;
         if (var1.readInt() == 0) {
            var14 = null;
         } else {
            val var5: Boolean;
            if (var1.readInt() != 0) {
               var5 = true;
            } else {
               var5 = false;
            }

            var14 = var5;
         }

         return new Sticker(var3, var8, var6, var9, var11, var13, var12, var10, var14, null);
      }

      fun newArray(var1: Int): Array<Sticker> {
         return new Sticker[var1];
      }
   }
}
