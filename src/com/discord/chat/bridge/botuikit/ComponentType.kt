package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import dh.l
import dh.o
import kh.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import vk.f

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
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ComponentType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ComponentType.Companion Companion = new ComponentType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ComponentType> = $values();
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
      public fun serializer(): KSerializer<ComponentType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(ComponentType.class), ComponentType.UNKNOWN)
}
