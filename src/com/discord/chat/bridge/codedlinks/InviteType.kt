package com.discord.chat.bridge.codedlinks

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = InviteType.Serializer::class)
public enum class InviteType(serialNumber: Int) : IntEnum {
   FRIEND(2),
   GROUP_DM(1),
   GUILD(0)
   public open val serialNumber: Int
   @JvmStatic
   private InviteType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public InviteType.Companion Companion = new InviteType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<InviteType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<InviteType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(InviteType.class), null, 2)
}
