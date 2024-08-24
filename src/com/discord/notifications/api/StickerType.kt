package com.discord.notifications.api

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = StickerType.Serializer::class)
public enum class StickerType(serialNumber: Int) : IntEnum {
   GUILD(2),
   STANDARD(1),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private StickerType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public StickerType.Companion Companion = new StickerType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun fromInt(int: Int): StickerType {
         val var6: Array<StickerType> = StickerType.values();
         val var4: Int = var6.length;
         var var2: Int = 0;

         var var5: StickerType;
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

         var var7: StickerType = var5;
         if (var5 == null) {
            var7 = StickerType.UNKNOWN;
         }

         return var7;
      }

      public fun serializer(): KSerializer<StickerType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<StickerType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(StickerType.class), null, 2)
}
