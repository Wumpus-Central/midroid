package com.discord.chat.bridge.referral

import ea.d
import ea.g
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement

public object ReferralEmbedSerializer : d(E.b(ReferralEmbed.class)) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferralEmbed> {
      q.h(var1, "element");
      val var2: KSerializer;
      if (ReferralEmbedKt.access$hasPrimitives(g.o(var1), "resolvingGradientStart", "resolvingGradientEnd")) {
         var2 = ReferralEmbed.Resolving.Companion.serializer();
      } else {
         var2 = ReferralEmbed.Resolved.Companion.serializer();
      }

      return var2;
   }
}
