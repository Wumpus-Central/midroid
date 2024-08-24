package com.discord.chat.bridge.codedlinks

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = CodedLinkExtendedType.Serializer::class)
public enum class CodedLinkExtendedType(serialNumber: Int) : IntEnum {
   ACTIVITY_BOOKMARK(3),
   EMBEDDED_ACTIVITY_INVITE(4),
   GUILD_INVITE_DISABLED(2),
   GUILD_SCHEDULED_EVENT(1),
   STAGE_INSTANCE(0)
   public open val serialNumber: Int
   @JvmStatic
   private CodedLinkExtendedType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public CodedLinkExtendedType.Companion Companion = new CodedLinkExtendedType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<CodedLinkExtendedType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<CodedLinkExtendedType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(CodedLinkExtendedType.class), null, 2)
}
