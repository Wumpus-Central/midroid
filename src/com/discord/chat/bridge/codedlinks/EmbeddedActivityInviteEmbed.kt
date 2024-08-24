package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.StructurableText

public interface EmbeddedActivityInviteEmbed {
   public val ctaEnabled: Boolean
   public val extendedType: CodedLinkExtendedType
   public val noParticipantsText: String
   public val participantAvatarUris: List<String>
   public val structurableSubtitleText: StructurableText?
}
