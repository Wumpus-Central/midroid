package com.discord.chat.bridge.codedlinks

public interface GuildProfileInviteEmbed {
   public val extendedType: CodedLinkExtendedType
   public val memberText: String?
   public val onlineText: String?
   public val bannerColor: Int
   public val bannerColorSecondary: Int
   public val hasProfileOverflow: Boolean
   public val badgeIconUrl: String?
   public val establishedText: String?
}
