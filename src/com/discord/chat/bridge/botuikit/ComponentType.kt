package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import ub.g

@g(with = ComponentType.Serializer::class)
public enum class ComponentType(serialNumber: Int) : IntEnum {
   ACTION_ROW(1),
   BUTTON(2),
   CHANNEL_SELECT(8),
   CONTAINER(17),
   CONTENT_INVENTORY_ENTRY(16),
   FILE(13),
   MEDIA_GALLERY(12),
   MENTIONABLE_SELECT(7),
   ROLE_SELECT(6),
   SECTION(9),
   SELECT(3),
   SEPARATOR(14),
   TEXT_DISPLAY(10),
   THUMBNAIL(11),
   UNKNOWN(0),
   USER_SELECT(5)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ComponentType[] $VALUES;
   @JvmStatic
   public ComponentType.Companion Companion = new ComponentType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ComponentType> = $values();
      $VALUES = var0;
      $ENTRIES = J9.a.a(var0);
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
         return ComponentType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(ComponentType.class), ComponentType.UNKNOWN)
}
