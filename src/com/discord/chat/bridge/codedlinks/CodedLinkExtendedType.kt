package com.discord.chat.bridge.codedlinks

import H9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import sb.f

@f(with = CodedLinkExtendedType.Serializer::class)
public enum class CodedLinkExtendedType(serialNumber: Int) : IntEnum {
   APP_MESSAGE_EMBED(4),
   EMBEDDED_ACTIVITY_INVITE(3),
   GUILD_INVITE_DISABLED(2),
   GUILD_PROFILE_INVITE(5),
   GUILD_SCHEDULED_EVENT(1),
   STAGE_INSTANCE(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private CodedLinkExtendedType[] $VALUES;
   @JvmStatic
   public CodedLinkExtendedType.Companion Companion = new CodedLinkExtendedType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<CodedLinkExtendedType> = $values();
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
      public fun serializer(): KSerializer<CodedLinkExtendedType> {
         return CodedLinkExtendedType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(CodedLinkExtendedType.class), null, 2)
}
