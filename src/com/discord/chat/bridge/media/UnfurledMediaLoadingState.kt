package com.discord.chat.bridge.media

import I9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import tb.f

@f(with = UnfurledMediaLoadingState.Serializer::class)
public enum class UnfurledMediaLoadingState(serialNumber: Int) : IntEnum {
   LOADED_NOT_FOUND(3),
   LOADED_SUCCESS(2),
   LOADING(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private UnfurledMediaLoadingState[] $VALUES;
   @JvmStatic
   public UnfurledMediaLoadingState.Companion Companion = new UnfurledMediaLoadingState.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<UnfurledMediaLoadingState> = $values();
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
      public fun serializer(): KSerializer<UnfurledMediaLoadingState> {
         return UnfurledMediaLoadingState.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(UnfurledMediaLoadingState.class), UnfurledMediaLoadingState.UNKNOWN)
}
