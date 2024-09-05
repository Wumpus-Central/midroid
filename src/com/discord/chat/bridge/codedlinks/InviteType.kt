package com.discord.chat.bridge.codedlinks

import ck.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import nn.f
import vj.l
import vj.o

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
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
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

   public object Serializer : IntEnumSerializer(g0.b(InviteType.class), null, 2)
}
