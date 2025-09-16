package com.discord.notifications.api

import G9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import mb.g

@g(with = StickerType.Serializer::class)
public enum class StickerType(serialNumber: Int) : IntEnum {
   GUILD(2),
   STANDARD(1),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private StickerType[] $VALUES;
   @JvmStatic
   public StickerType.Companion Companion = new StickerType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<StickerType> = $values();
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

   @SourceDebugExtension(["SMAP\nStickerType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerType.kt\ncom/discord/notifications/api/StickerType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,25:1\n1310#2,2:26\n*S KotlinDebug\n*F\n+ 1 StickerType.kt\ncom/discord/notifications/api/StickerType$Companion\n*L\n20#1:26,2\n*E\n"])
   public companion object {
      public fun fromInt(int: Int): StickerType {
         val var5: Array<StickerType> = StickerType.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         var var4: StickerType;
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

         var var6: StickerType = var4;
         if (var4 == null) {
            var6 = StickerType.UNKNOWN;
         }

         return var6;
      }

      public fun serializer(): KSerializer<StickerType> {
         return StickerType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(StickerType::class, null, 2)
}
