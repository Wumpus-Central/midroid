package com.discord.chat.bridge.codedlinks

public interface AppMessageEmbed {
   public val actions: List<AppMessageEmbedAction>?
   public val appId: String
   public val bannerRatio: String
   public val embedUrl: String?
   public val extendedType: CodedLinkExtendedType
   public val gradientColors: List<Map<String, Int>>?
   public val header: String?
   public val iconSrc: String?
   public val info: String?
   public val messageId: String
   public val staticBannerSrc: String?
   public val tagline: String?
   public val title: String?
}
