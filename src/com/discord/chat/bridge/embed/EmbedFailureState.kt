package com.discord.chat.bridge.embed

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = EmbedFailureState.Serializer::class)
public enum class EmbedFailureState(serialNumber: Int) : IntEnum {
   AUTO_MODERATION_BLOCKED_MESSAGE(2),
   UNSPECIFIED(0),
   UPLOAD_FAILED(1)
   public open val serialNumber: Int
   @JvmStatic
   private EmbedFailureState[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public EmbedFailureState.Companion Companion = new EmbedFailureState.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedFailureState> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<EmbedFailureState>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(EmbedFailureState.class), null, 2)
}
