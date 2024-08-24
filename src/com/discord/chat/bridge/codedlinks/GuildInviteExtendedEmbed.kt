package com.discord.chat.bridge.codedlinks

public interface GuildInviteExtendedEmbed : GuildInviteEmbed {
   public val extendedType: CodedLinkExtendedType
   public val guildIcon: String?
   public val guildName: String?
   public val headerIcon: String?
}
