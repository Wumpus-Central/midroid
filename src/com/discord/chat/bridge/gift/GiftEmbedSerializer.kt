package com.discord.chat.bridge.gift

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import xp.e
import xp.h

public object GiftEmbedSerializer : e(GiftEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<GiftEmbed> {
      val var2: JsonObject = h.n(var1);
      if (GiftEmbedKt.access$hasPrimitives(var2, "resolvingGradientStart", "resolvingGradientEnd")) {
         return GiftEmbed.Resolving.Companion.serializer();
      } else {
         return if (GiftEmbedKt.access$hasPrimitive(var2, "giftCode"))
            GiftEmbed.Resolved.Valid.Companion.serializer()
            else
            GiftEmbed.Resolved.Invalid.Companion.serializer();
      }
   }
}
