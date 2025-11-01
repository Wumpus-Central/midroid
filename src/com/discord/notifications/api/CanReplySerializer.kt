package com.discord.notifications.api

import kotlin.jvm.internal.BooleanCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import yu.a

public object CanReplySerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.B(BooleanCompanionObject.INSTANCE).getDescriptor();
      }


   public open fun deserialize(decoder: Decoder): Boolean {
      return var1.z() == "can_reply";
   }

   public open fun serialize(encoder: Encoder, value: Boolean) {
      throw new UnsupportedOperationException();
   }
}
