package com.discord.chat.bridge.sticker

import dn.f
import fn.g
import java.util.NoSuchElementException
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import lj.l
import lj.o
import sj.a

@f(with = StickerFormatType.StickerFormatTypeSerializer::class)
public enum class StickerFormatType(intType: Int) {
   APNG(2),
   GIF(4),
   LOTTIE(3),
   PNG(1)
   public final val intType: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private StickerFormatType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public StickerFormatType.Companion Companion = new StickerFormatType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<StickerFormatType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.intType = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<StickerFormatType> {
         return this.get$cachedSerializer();
      }
   }

   public object StickerFormatTypeSerializer : KSerializer {
      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("StickerFormatType", fn.e.f.a);
         }


      public open fun deserialize(decoder: Decoder): StickerFormatType {
         q.h(var1, "decoder");
         val var4: Int = var1.h();
         val var6: Array<StickerFormatType> = StickerFormatType.values();
         val var3: Int = var6.length;

         for (int var2 = 0; var2 < var3; var2++) {
            val var5: StickerFormatType = var6[var2];
            if (var6[var2].getIntType() == var4) {
               return var5;
            }
         }

         throw new NoSuchElementException("Array contains no element matching the predicate.");
      }

      public open fun serialize(encoder: Encoder, value: StickerFormatType) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         var1.B(var2.getIntType());
      }
   }
}
