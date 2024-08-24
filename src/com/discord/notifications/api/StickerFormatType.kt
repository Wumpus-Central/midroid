package com.discord.notifications.api

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = StickerFormatType.Serializer::class)
public enum class StickerFormatType(serialNumber: Int) : IntEnum {
   APNG(2),
   GIF(4),
   LOTTIE(3),
   PNG(1),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private StickerFormatType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public StickerFormatType.Companion Companion = new StickerFormatType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun fromInt(int: Int): StickerFormatType {
         val var6: Array<StickerFormatType> = StickerFormatType.values();
         val var4: Int = var6.length;
         var var2: Int = 0;

         var var5: StickerFormatType;
         while (true) {
            if (var2 >= var4) {
               var5 = null;
               break;
            }

            var5 = var6[var2];
            val var3: Boolean;
            if (var6[var2].getSerialNumber() == var1) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3) {
               break;
            }

            var2++;
         }

         var var7: StickerFormatType = var5;
         if (var5 == null) {
            var7 = StickerFormatType.UNKNOWN;
         }

         return var7;
      }

      public fun serializer(): KSerializer<StickerFormatType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<StickerFormatType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(StickerFormatType.class), null, 2)
}
