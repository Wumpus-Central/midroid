package com.discord.chat.bridge.botuikit

import Y9.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import f8.l
import f8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import m8.a

@f(with = MediaGalleryItemType.Serializer::class)
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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MediaGalleryItemType.Companion Companion = new MediaGalleryItemType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MediaGalleryItemType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(MediaGalleryItemType.class), MediaGalleryItemType.UNKNOWN)
}
