package com.discord.chat.bridge.codedlinks

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import dn.f
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import lj.l
import lj.o
import sj.a

@f(with = CodedLinkExtendedType.Serializer::class)
public enum class CodedLinkExtendedType(serialNumber: Int) : IntEnum {
   ACTIVITY_BOOKMARK(3),
   EMBEDDED_ACTIVITY_INVITE(4),
   GUILD_INVITE_DISABLED(2),
   GUILD_SCHEDULED_EVENT(1),
   STAGE_INSTANCE(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private CodedLinkExtendedType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(CodedLinkExtendedType.class), null, 2)
}
