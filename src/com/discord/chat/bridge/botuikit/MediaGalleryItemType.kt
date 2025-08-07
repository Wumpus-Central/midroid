package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import tb.g

@g(with = MediaGalleryItemType.Serializer::class)
public enum class MediaGalleryItemType(serialNumber: Int) : IntEnum {
   IMAGE(1),
   UNKNOWN(0),
   VIDEO(2),
   VISUAL_PLACEHOLDER(3)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MediaGalleryItemType[] $VALUES;
   @JvmStatic
   public MediaGalleryItemType.Companion Companion = new MediaGalleryItemType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MediaGalleryItemType> = $values();
      $VALUES = var0;
      $ENTRIES = I9.a.a(var0);
   }

   init {
      this.serialNumber = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItemType> {
         return MediaGalleryItemType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(MediaGalleryItemType.class), MediaGalleryItemType.UNKNOWN)
}
