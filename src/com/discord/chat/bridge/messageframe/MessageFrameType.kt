package com.discord.chat.bridge.messageframe

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import dn.f
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import lj.l
import lj.o
import sj.a

@f(with = MessageFrameType.Serializer::class)
public enum class MessageFrameType(serialNumber: Int) : IntEnum {
   JUMP_MESSAGE_FRAME(0),
   MEDIA_VIEWER_MESSAGE_FRAME(1),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageFrameType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MessageFrameType.Companion Companion = new MessageFrameType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MessageFrameType> = $values();
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
      public fun serializer(): KSerializer<MessageFrameType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(MessageFrameType.class), MessageFrameType.UNKNOWN)
}
