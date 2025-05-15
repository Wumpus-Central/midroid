package com.discord.chat.bridge.codedlinks

public interface GuildProfileInviteEmbed {
   public val badgeIconUrl: String?
   public val bannerColor: Int
   public val bannerColorSecondary: Int
   public val establishedText: String?
   public val extendedType: CodedLinkExtendedType
   public val hasProfileOverflow: Boolean
   public val memberText: String?
   public val onlineText: String?
}
