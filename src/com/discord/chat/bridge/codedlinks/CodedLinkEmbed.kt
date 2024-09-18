package com.discord.chat.bridge.codedlinks

import kotlinx.serialization.KSerializer
import yk.f

@f(with = CodedLinkSerializer::class)
public sealed class CodedLinkEmbed protected constructor() {
   public abstract val acceptLabelBackgroundColor: Int?
   public abstract val acceptLabelBorderColor: Int?
   public abstract val acceptLabelColor: Int?
   public abstract val acceptLabelText: String?
   public abstract val backgroundColor: Int
   public abstract val bodyText: String?
   public abstract val bodyTextColor: Int?
   public abstract val borderColor: Int
   public abstract val canBeAccepted: Boolean?
   public abstract val embedCanBeTapped: Boolean?
   public abstract val headerColor: Int
   public abstract val headerText: String?
   public abstract val inviteSplash: String?
   public abstract val resolvingGradientEnd: Int?
   public abstract val resolvingGradientStart: Int?
   public abstract val splashHasRadialGradient: Boolean?
   public abstract val splashOpacity: Int?
   public abstract val splashUrl: String?
   public abstract val subtitle: String?
   public abstract val subtitleColor: Int?
   public abstract val thumbnailBackgroundColor: Int?
   public abstract val thumbnailCornerRadius: Int?
   public abstract val thumbnailText: String?
   public abstract val thumbnailUrl: String?
   public abstract val titleColor: Int?
   public abstract val titleText: String?
   public abstract val type: InviteType?

   public companion object {
      public fun serializer(): KSerializer<CodedLinkEmbed> {
         return CodedLinkSerializer.INSTANCE;
      }
   }
}
