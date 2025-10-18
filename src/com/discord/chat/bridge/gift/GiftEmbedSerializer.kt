package com.discord.chat.bridge.gift

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import uc.e
import uc.h

public object GiftEmbedSerializer : e(GiftEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<GiftEmbed> {
      val var2: JsonObject = h.n(var1);
      val var3: KSerializer;
      if (GiftEmbedKt.access$hasPrimitives(var2, "resolvingGradientStart", "resolvingGradientEnd")) {
         var3 = GiftEmbed.Resolving.Companion.serializer();
      } else if (GiftEmbedKt.access$hasPrimitive(var2, "giftCode")) {
         var3 = GiftEmbed.Resolved.Valid.Companion.serializer();
      } else {
         var3 = GiftEmbed.Resolved.Invalid.Companion.serializer();
      }

      return var3;
   }
}
