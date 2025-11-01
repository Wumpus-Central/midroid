package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import xu.m

@m(with = ShadowType.Serializer::class)
public enum class ShadowType(serialNumber: Int, elevationDp: Int) : IntEnum {
   HIGH(2, 20),
   LOW(1, 4),
   NONE(0, 0)
   public open val serialNumber: Int
   public final val elevationDp: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ShadowType[] $VALUES;
   @JvmStatic
   public ShadowType.Companion Companion = new ShadowType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ShadowType> = $values();
      $VALUES = var0;
      $ENTRIES = pt.a.a(var0);
   }

   init {
      this.serialNumber = var3;
      this.elevationDp = var4;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<ShadowType> {
         return ShadowType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(ShadowType::class, ShadowType.NONE)
}
