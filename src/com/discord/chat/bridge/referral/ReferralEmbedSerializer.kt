package com.discord.chat.bridge.referral

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonElement

public object ReferralEmbedSerializer : bv.e(ReferralEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferralEmbed> {
      return if (ReferralEmbedKt.access$hasPrimitives(bv.h.n(var1), "resolvingGradientStart", "resolvingGradientEnd"))
         ReferralEmbed.Resolving.Companion.serializer()
         else
         ReferralEmbed.Resolved.Companion.serializer();
   }
}
