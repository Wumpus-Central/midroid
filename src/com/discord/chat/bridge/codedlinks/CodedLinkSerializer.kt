package com.discord.chat.bridge.codedlinks

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import oc.e
import oc.h

public object CodedLinkSerializer : e(CodedLinkEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<CodedLinkEmbed> {
      label29: {
         var1 = h.n(var1).get("extendedType") as JsonElement;
         if (var1 != null) {
            val var3: JsonPrimitive = h.o(var1);
            if (var3 != null) {
               var4 = var3.c();
               break label29;
            }
         }

         var4 = null;
      }

      val var5: KSerializer;
      if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber())) {
         var5 = GuildEventInviteEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber())) {
         var5 = GuildInviteDisabledEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.APP_MESSAGE_EMBED.getSerialNumber())) {
         var5 = AppMessageEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber())) {
         var5 = EmbeddedActivityInviteEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.GUILD_PROFILE_INVITE.getSerialNumber())) {
         var5 = GuildProfileInviteEmbedImpl.Companion.serializer();
      } else {
         var5 = GuildInviteEmbedImpl.Companion.serializer();
      }

      return var5;
   }
}
