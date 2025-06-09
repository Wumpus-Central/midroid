package com.discord.chat.bridge.referral

import bb.d
import bb.g
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement

public object ReferralEmbedSerializer : d(G.b(ReferralEmbed.class)) {
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
