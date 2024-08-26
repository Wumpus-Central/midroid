package com.discord.chat.bridge.sticker

import eh.l
import eh.o
import java.util.NoSuchElementException
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import uk.f
import wk.g

@f(with = StickerFormatType.StickerFormatTypeSerializer::class)
public enum class StickerFormatType(intType: Int) {
   APNG(2),
   GIF(4),
   LOTTIE(3),
   PNG(1)
   public final val intType: Int
   @JvmStatic
   private StickerFormatType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public StickerFormatType.Companion Companion = new StickerFormatType.Companion(null);

   init {
      this.intType = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<StickerFormatType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<StickerFormatType>;
      }
   }

   public object StickerFormatTypeSerializer : KSerializer<StickerFormatType> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("StickerFormatType", wk.e.f.a);
         }


      public open fun deserialize(decoder: Decoder): StickerFormatType {
         r.h(var1, "decoder");
         val var4: Int = var1.h();
         val var6: Array<StickerFormatType> = StickerFormatType.values();
         val var5: Int = var6.length;

         for (int var2 = 0; var2 < var5; var2++) {
            val var7: StickerFormatType = var6[var2];
            val var3: Boolean;
            if (var6[var2].getIntType() == var4) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3) {
               return var7;
            }
         }

         throw new NoSuchElementException("Array contains no element matching the predicate.");
      }

      public open fun serialize(encoder: Encoder, value: StickerFormatType) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         var1.B(var2.getIntType());
      }
   }
}
