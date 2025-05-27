package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.StructurableText

public interface EmbeddedActivityInviteEmbed {
   public val participantAvatarUris: List<String>
   public val extendedType: CodedLinkExtendedType
   public val structurableSubtitleText: StructurableText?
   public val noParticipantsText: String
   public val ctaEnabled: Boolean
}
