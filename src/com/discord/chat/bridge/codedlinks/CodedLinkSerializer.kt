package com.discord.chat.bridge.codedlinks

import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import ob.d
import ob.g

public object CodedLinkSerializer : d(H.b(CodedLinkEmbed.class)) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<CodedLinkEmbed> {
      label29: {
         r.h(var1, "element");
         var1 = g.o(var1).get("extendedType") as JsonElement;
         if (var1 != null) {
            val var3: JsonPrimitive = g.p(var1);
            if (var3 != null) {
               var4 = var3.a();
               break label29;
            }
         }

         var4 = null;
      }

      val var5: KSerializer;
      if (r.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber()))) {
         var5 = GuildEventInviteEmbedImpl.Companion.serializer();
      } else if (r.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber()))) {
         var5 = GuildInviteDisabledEmbedImpl.Companion.serializer();
      } else if (r.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.APP_MESSAGE_EMBED.getSerialNumber()))) {
         var5 = AppMessageEmbedImpl.Companion.serializer();
      } else if (r.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber()))) {
         var5 = EmbeddedActivityInviteEmbedImpl.Companion.serializer();
      } else if (r.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.GUILD_PROFILE_INVITE.getSerialNumber()))) {
         var5 = GuildProfileInviteEmbedImpl.Companion.serializer();
      } else {
         var5 = GuildInviteEmbedImpl.Companion.serializer();
      }

      return var5;
   }
}
