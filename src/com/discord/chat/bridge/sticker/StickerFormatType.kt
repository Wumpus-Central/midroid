package com.discord.chat.bridge.sticker

import G9.a
import java.util.NoSuchElementException
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import mb.g
import ob.e.f

@g(with = StickerFormatType.StickerFormatTypeSerializer::class)
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
         return StickerFormatType.StickerFormatTypeSerializer.INSTANCE;
      }
   }

   @SourceDebugExtension(["SMAP\nStickerFormatType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerFormatType.kt\ncom/discord/chat/bridge/sticker/StickerFormatType$StickerFormatTypeSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n1137#2,2:36\n*S KotlinDebug\n*F\n+ 1 StickerFormatType.kt\ncom/discord/chat/bridge/sticker/StickerFormatType$StickerFormatTypeSerializer\n*L\n27#1:36,2\n*E\n"])
   public object StickerFormatTypeSerializer : KSerializer {
      public open val descriptor: SerialDescriptor
         public open get() {
            return ob.g.a("StickerFormatType", f.a);
         }


      public open fun deserialize(decoder: Decoder): StickerFormatType {
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
         var1.A(var2.getIntType());
      }
   }
}
