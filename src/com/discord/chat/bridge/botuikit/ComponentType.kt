package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = ComponentType.Serializer::class)
public enum class ComponentType(serialNumber: Int) : IntEnum {
   ACTION_ROW(1),
   BUTTON(2),
   CHANNEL_SELECT(8),
   CONTENT_INVENTORY_ENTRY(16),
   MEDIA_GALLERY(12),
   MENTIONABLE_SELECT(7),
   ROLE_SELECT(6),
   SELECT(3),
   SEPARATOR(14),
   TEXT_DISPLAY(10),
   UNKNOWN(0),
   USER_SELECT(5)
   public open val serialNumber: Int
   @JvmStatic
   private ComponentType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ComponentType.Companion Companion = new ComponentType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<ComponentType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ComponentType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(ComponentType.class), ComponentType.UNKNOWN)
}
