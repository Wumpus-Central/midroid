package com.discord.chat.bridge.referral

import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import ob.d
import ob.g

public object ReferralEmbedSerializer : d(H.b(ReferralEmbed.class)) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<ReferralEmbed> {
      r.h(var1, "element");
      val var2: KSerializer;
      if (ReferralEmbedKt.access$hasPrimitives(g.o(var1), "resolvingGradientStart", "resolvingGradientEnd")) {
         var2 = ReferralEmbed.Resolving.Companion.serializer();
      } else {
         var2 = ReferralEmbed.Resolved.Companion.serializer();
      }

      return var2;
   }
}
