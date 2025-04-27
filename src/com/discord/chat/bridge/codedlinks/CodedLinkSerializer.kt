package com.discord.chat.bridge.codedlinks

import ca.d
import ca.g
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

public object CodedLinkSerializer : d(E.b(CodedLinkEmbed.class)) {
   protected open fun selectDeserializer(element: JsonElement): DeserializationStrategy<CodedLinkEmbed> {
      label32: {
         q.h(var1, "element");
         var1 = g.o(var1).get("extendedType") as JsonElement;
         if (var1 != null) {
            val var3: JsonPrimitive = g.p(var1);
            if (var3 != null) {
               var4 = var3.a();
               break label32;
            }
         }

         var4 = null;
      }

      val var5: KSerializer;
      if (q.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.GUILD_SCHEDULED_EVENT.getSerialNumber()))) {
         var5 = GuildEventInviteEmbedImpl.Companion.serializer();
      } else if (q.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.GUILD_INVITE_DISABLED.getSerialNumber()))) {
         var5 = GuildInviteDisabledEmbedImpl.Companion.serializer();
      } else if (q.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.ACTIVITY_BOOKMARK.getSerialNumber()))) {
         var5 = ActivityBookmarkEmbedImpl.Companion.serializer();
      } else if (q.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.APP_MESSAGE_EMBED.getSerialNumber()))) {
         var5 = AppMessageEmbedImpl.Companion.serializer();
      } else if (q.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.EMBEDDED_ACTIVITY_INVITE.getSerialNumber()))) {
         var5 = EmbeddedActivityInviteEmbedImpl.Companion.serializer();
      } else if (q.c(var4, java.lang.String.valueOf(CodedLinkExtendedType.GUILD_PROFILE_INVITE.getSerialNumber()))) {
         var5 = GuildProfileInviteEmbedImpl.Companion.serializer();
      } else {
         var5 = GuildInviteEmbedImpl.Companion.serializer();
      }

      return var5;
   }
}
