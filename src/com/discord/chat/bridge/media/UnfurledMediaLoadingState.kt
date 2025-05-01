package com.discord.chat.bridge.media

import aa.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import h8.l
import h8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import o8.a

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(UnfurledMediaLoadingState.class), UnfurledMediaLoadingState.UNKNOWN)
}
