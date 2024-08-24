package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.StructurableText

public interface GuildEventInviteEmbed {
   public val acceptLabelIcon: String?
   public val badgeCount: String?
   public val badgeIcon: String?
   public val content: StructurableText?
   public val creatorAvatar: String?
   public val headerTextColor: Int?
   public val isRsvped: Boolean?
   public val secondaryActionIcon: String?
}
