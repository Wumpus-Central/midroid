package com.discord.chat.bridge

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import dn.f
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import lj.l
import lj.o
import sj.a

@f(with = ChannelType.Serializer::class)
public enum class ChannelType(serialNumber: Int) : IntEnum {
   ANNOUNCEMENT_THREAD(10),
   DM(1),
   GROUP_DM(3),
   GUILD_ANNOUNCEMENT(5),
   GUILD_CATEGORY(4),
   GUILD_DIRECTORY(14),
   GUILD_FORUM(15),
   GUILD_MEDIA(16),
   GUILD_STAGE_VOICE(13),
   GUILD_STORE(6),
   GUILD_TEXT(0),
   GUILD_VOICE(2),
   PRIVATE_THREAD(12),
   PUBLIC_THREAD(11),
   UNKNOWN(10000)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChannelType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ChannelType.Companion Companion = new ChannelType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ChannelType> = $values();
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
      public fun serializer(): KSerializer<ChannelType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(ChannelType.class), null, 2)
}
