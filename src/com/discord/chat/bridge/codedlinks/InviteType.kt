package com.discord.chat.bridge.codedlinks

import H9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import sb.g

@g(with = InviteType.Serializer::class)
public enum class InviteType(serialNumber: Int) : IntEnum {
   FRIEND(2),
   GROUP_DM(1),
   GUILD(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private InviteType[] $VALUES;
   @JvmStatic
   public InviteType.Companion Companion = new InviteType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<InviteType> = $values();
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
      public fun serializer(): KSerializer<InviteType> {
         return InviteType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(InviteType.class), null, 2)
}
