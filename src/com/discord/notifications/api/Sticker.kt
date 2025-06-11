package com.discord.notifications.api

import Xa.f
import android.os.Parcel
import android.os.Parcelable
import com.discord.primitives.GuildId
import com.discord.primitives.StickerId
import e9.n
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

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
               throw new n();
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

      val var9: Int = this.description.hashCode();
      val var6: Int = this.formatType.hashCode();
      val var8: Int = this.tags.hashCode();
      val var7: Int = this.type.hashCode();
      if (this.available != null) {
         var3 = this.available.hashCode();
      }

      return (((((((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var9) * 31 + var6) * 31 + var8) * 31 + var7) * 31 + var3;
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
      val var5: java.lang.String = StickerId.toString-impl(this.id);
      val var4: java.lang.String = this.name;
      val var8: java.lang.Long = this.packId;
      val var6: GuildId = this.guildId;
      val var3: java.lang.String = this.description;
      val var10: StickerFormatType = this.formatType;
      val var7: java.lang.String = this.tags;
      val var2: StickerType = this.type;
      val var1: java.lang.Boolean = this.available;
      val var9: StringBuilder = new StringBuilder();
      var9.append("Sticker(id=");
      var9.append(var5);
      var9.append(", name=");
      var9.append(var4);
      var9.append(", packId=");
      var9.append(var8);
      var9.append(", guildId=");
      var9.append(var6);
      var9.append(", description=");
      var9.append(var3);
      var9.append(", formatType=");
      var9.append(var10);
      var9.append(", tags=");
      var9.append(var7);
      var9.append(", type=");
      var9.append(var2);
      var9.append(", available=");
      var9.append(var1);
      var9.append(")");
      return var9.toString();
   }

   public fun writeToParcel(dest: Parcel, flags: Int) {
      q.h(var1, "dest");
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
         q.h(var1, "parcel");
         val var3: Long = (var1.readParcelable(Sticker.class.getClassLoader()) as StickerId).unbox-impl();
         val var6: java.lang.String = var1.readString();
         val var5: java.lang.Long;
         if (var1.readInt() == 0) {
            var5 = null;
         } else {
            var5 = var1.readLong();
         }

         val var9: GuildId = var1.readParcelable(Sticker.class.getClassLoader()) as GuildId;
         val var10: java.lang.String = var1.readString();
         val var7: StickerFormatType = StickerFormatType.valueOf(var1.readString());
         val var8: java.lang.String = var1.readString();
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

         return new Sticker(var3, var6, var5, var9, var10, var7, var8, var11, var12, null);
      }

      fun newArray(var1: Int): Array<Sticker> {
         return new Sticker[var1];
      }
   }
}
