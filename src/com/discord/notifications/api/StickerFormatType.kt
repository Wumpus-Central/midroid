package com.discord.notifications.api

import H9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import nb.g

@g(with = StickerFormatType.Serializer::class)
public enum class StickerFormatType(serialNumber: Int) : IntEnum {
   APNG(2),
   GIF(4),
   LOTTIE(3),
   PNG(1),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private StickerFormatType[] $VALUES;
   @JvmStatic
   public StickerFormatType.Companion Companion = new StickerFormatType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<StickerFormatType> = $values();
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

   @SourceDebugExtension(["SMAP\nStickerFormatType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerFormatType.kt\ncom/discord/notifications/api/StickerFormatType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,25:1\n1310#2,2:26\n*S KotlinDebug\n*F\n+ 1 StickerFormatType.kt\ncom/discord/notifications/api/StickerFormatType$Companion\n*L\n20#1:26,2\n*E\n"])
   public companion object {
      public fun fromInt(int: Int): StickerFormatType {
         val var5: Array<StickerFormatType> = StickerFormatType.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         var var4: StickerFormatType;
         while (true) {
            if (var2 >= var3) {
               var4 = null;
               break;
            }

            var4 = var5[var2];
            if (var5[var2].getSerialNumber() == var1) {
               break;
            }

            var2++;
         }

         var var6: StickerFormatType = var4;
         if (var4 == null) {
            var6 = StickerFormatType.UNKNOWN;
         }

         return var6;
      }

      public fun serializer(): KSerializer<StickerFormatType> {
         return StickerFormatType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(StickerFormatType::class, null, 2)
}
