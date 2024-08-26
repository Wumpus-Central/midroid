package com.discord.chat.bridge.codedlinks

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId

public interface ActivityBookmarkEmbed {
   public val applicationId: ApplicationId
   public val channelId: ChannelId
   public val description: String?
   public val extendedType: CodedLinkExtendedType
   public val participantAvatarUris: List<String>
   public val participantsText: String

   fun getApplicationId_VavddsQ(): Long

   fun getChannelId_o4g7jtM(): Long
}
