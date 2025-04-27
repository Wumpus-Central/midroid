package com.discord.chat.bridge.codedlinks

import Y9.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import f8.l
import f8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import m8.a

@f(with = InviteType.Serializer::class)
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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(InviteType.class), null, 2)
}
