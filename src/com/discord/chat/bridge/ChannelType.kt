package com.discord.chat.bridge

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

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
   private ChannelType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ChannelType.Companion Companion = new ChannelType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ChannelType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(ChannelType.class), null, 2)
}
