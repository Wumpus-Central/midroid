package com.discord.chat.bridge.sticker

import fh.l
import fh.o
import java.util.NoSuchElementException
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import mh.a
import xk.f
import zk.g

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
            return g.a("StickerFormatType", zk.e.f.a);
         }


      public open fun deserialize(decoder: Decoder): StickerFormatType {
         q.h(var1, "decoder");
         val var4: Int = var1.j();
         val var5: Array<StickerFormatType> = StickerFormatType.values();
         val var3: Int = var5.length;

         for (int var2 = 0; var2 < var3; var2++) {
            val var6: StickerFormatType = var5[var2];
            if (var5[var2].getIntType() == var4) {
               return var6;
            }
         }

         throw new NoSuchElementException("Array contains no element matching the predicate.");
      }

      public open fun serialize(encoder: Encoder, value: StickerFormatType) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         var1.y(var2.getIntType());
      }
   }
}
