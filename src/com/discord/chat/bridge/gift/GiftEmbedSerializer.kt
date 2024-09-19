package com.discord.chat.bridge.gift

import bl.d
import bl.g
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

public object GiftEmbedSerializer : d(g0.b(GiftEmbed.class)) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<GiftEmbed> {
      q.h(var1, "element");
      val var2: JsonObject = g.o(var1);
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
