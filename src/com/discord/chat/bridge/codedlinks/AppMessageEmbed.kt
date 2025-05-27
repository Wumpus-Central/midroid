package com.discord.chat.bridge.codedlinks

public interface AppMessageEmbed {
   public val appId: String
   public val messageId: String
   public val title: String?
   public val header: String?
   public val info: String?
   public val tagline: String?
   public val gradientColors: List<Map<String, Int>>?
   public val staticBannerSrc: String?
   public val iconSrc: String?
   public val embedUrl: String?
   public val bannerRatio: String
   public val actions: List<AppMessageEmbedAction>?
}
