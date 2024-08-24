package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = MediaGalleryItemType.Serializer::class)
public enum class MediaGalleryItemType(serialNumber: Int) : IntEnum {
   IMAGE(1),
   UNKNOWN(0),
   VIDEO(2)
   public open val serialNumber: Int
   @JvmStatic
   private MediaGalleryItemType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MediaGalleryItemType.Companion Companion = new MediaGalleryItemType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryItemType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<MediaGalleryItemType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(MediaGalleryItemType.class), MediaGalleryItemType.UNKNOWN)
}
