package com.discord.chat.bridge.referral

import Ac.e
import Ac.h
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement

public object ReferralEmbedSerializer : e(ReferralEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferralEmbed> {
      val var2: KSerializer;
      if (ReferralEmbedKt.access$hasPrimitives(h.n(var1), "resolvingGradientStart", "resolvingGradientEnd")) {
         var2 = ReferralEmbed.Resolving.Companion.serializer();
      } else {
         var2 = ReferralEmbed.Resolved.Companion.serializer();
      }

      return var2;
   }
}
