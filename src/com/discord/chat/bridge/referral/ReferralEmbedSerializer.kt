package com.discord.chat.bridge.referral

import bv.e
import bv.h
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonElement

public object ReferralEmbedSerializer : e(ReferralEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferralEmbed> {
      return if (ReferralEmbedKt.access$hasPrimitives(h.n(var1), "resolvingGradientStart", "resolvingGradientEnd"))
         ReferralEmbed.Resolving.Companion.serializer()
         else
         ReferralEmbed.Resolved.Companion.serializer();
   }
}
