package com.discord.chat.bridge.codedlinks

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object CodedLinkSerializer : bv.e(CodedLinkEmbed::class) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<CodedLinkEmbed> {
      label32: {
         var1 = bv.h.n(var1).get("extendedType") as JsonElement;
         if (var1 != null) {
            val var3: JsonPrimitive = bv.h.o(var1);
            if (var3 != null) {
               var4 = var3.b();
               break label32;
            }
         }

         var4 = null;
      }

      if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber())) {
         return GuildEventInviteEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber())) {
         return GuildInviteDisabledEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.APP_MESSAGE_EMBED.getSerialNumber())) {
         return AppMessageEmbedImpl.Companion.serializer();
      } else if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber())) {
         return EmbeddedActivityInviteEmbedImpl.Companion.serializer();
      } else {
         return if (var4 == java.lang.String.valueOf(CodedLinkExtendedType.GUILD_PROFILE_INVITE.getSerialNumber()))
            GuildProfileInviteEmbedImpl.Companion.serializer()
            else
            GuildInviteEmbedImpl.Companion.serializer();
      }
   }
}
