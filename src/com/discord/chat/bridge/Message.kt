package com.discord.chat.bridge

import A9.j
import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.channelprompt.ChannelPromptData
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag
import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.chat.bridge.customthemes.SharedCustomThemeData
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.ephemeral.EphemeralIndication
import com.discord.chat.bridge.executedcommand.ExecutedCommand
import com.discord.chat.bridge.feedback.SurveyIndication
import com.discord.chat.bridge.forums.ForumPostActions
import com.discord.chat.bridge.forwarding.ForwardInfo
import com.discord.chat.bridge.gift.GiftEmbed
import com.discord.chat.bridge.interaction.InteractionStatus
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed
import com.discord.chat.bridge.polls.PollData
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.referencedmessage.ReferencedMessage
import com.discord.chat.bridge.referral.ReferralEmbed
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.chat.bridge.roleicons.RoleIcon
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.logging.PII
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer
import mb.g
import n1.b

@g
public data class Message(type: MessageType,
   id: MessageId,
   nonce: MessageId? = ...,
   channelId: ChannelId,
   guildId: GuildId? = ...,
   state: MessageState? = ...,
   authorId: UserId? = ...,
   flags: Long = ...,
   edited: String? = ...,
   editedColor: Int? = ...,
   _constrainedWidth: Float? = ...,
   textColor: Int? = ...,
   linkColor: Int? = ...,
   timestamp: String? = ...,
   timestampColor: Int? = ...,
   username: String? = ...,
   usernameColor: Int? = ...,
   roleColor: Int? = ...,
   roleColors: RoleColors? = ...,
   shouldShowRoleDot: Boolean = ...,
   shouldShowRoleOnName: Boolean = ...,
   colorString: Int? = ...,
   avatarURL: String? = ...,
   avatarDecorationURL: String? = ...,
   embeds: List<Embed>? = ...,
   attachments: List<Attachment>? = ...,
   attachmentsOpacity: Float? = ...,
   content: StructurableText? = ...,
   reactions: List<MessageReaction>? = ...,
   codedLinks: List<CodedLinkEmbed?>? = ...,
   activityInstanceEmbed: ActivityInstanceEmbed? = ...,
   stickers: List<Sticker>? = ...,
   roleIcon: RoleIcon? = ...,
   connectionsRoleTag: ConnectionsRoleTag? = ...,
   threadEmbed: ThreadEmbed? = ...,
   mentioned: Boolean,
   gifAutoPlay: Boolean? = ...,
   animateEmoji: Boolean? = ...,
   showLinkDecorations: Boolean? = ...,
   referencedMessage: ReferencedMessage? = ...,
   executedCommand: ExecutedCommand? = ...,
   components: List<Component>? = ...,
   threadStarterMessageHeader: String? = ...,
   communicationDisabled: Boolean? = ...,
   tagText: String? = ...,
   tagVerified: Boolean? = ...,
   tagTextColor: Int? = ...,
   tagBackgroundColor: Int? = ...,
   tagType: String? = ...,
   tagIconUrl: String? = ...,
   opTagText: String? = ...,
   ephemeralIndication: EphemeralIndication? = ...,
   surveyIndication: SurveyIndication? = ...,
   interactionStatus: InteractionStatus? = ...,
   useAttachmentGridLayout: Boolean? = ...,
   useAttachmentUploadPreview: Boolean? = ...,
   isCurrentUserMessageAuthor: Boolean? = ...,
   obscureLearnMoreLabel: String? = ...,
   usingGradientTheme: Boolean? = ...,
   title: String? = ...,
   description: String? = ...,
   avatarURLs: List<String>? = ...,
   isCallActive: Boolean? = ...,
   missed: Boolean? = ...,
   rawMilliseconds: Long? = ...,
   sticker: Sticker? = ...,
   stickerLabel: String? = ...,
   buttonLabel: String? = ...,
   showInviteToSpeakButton: Boolean? = ...,
   activityInviteEmbed: ActivityInviteEmbed? = ...,
   activityRichPresenceInviteEmbed: ActivityRichPresenceInviteEmbed? = ...,
   isFirstForumPostMessage: Boolean = ...,
   postActions: ForumPostActions? = ...,
   autoModerationContext: AutoModerationContext? = ...,
   referralTrialOfferInfo: ReferralEmbed? = ...,
   giftCodes: List<GiftEmbed>? = ...,
   referralTrialOffer: GiftEmbed? = ...,
   totalMonthsSubscribed: Int? = ...,
   postPreviewEmbeds: List<PostPreviewEmbed>? = ...,
   channelPromptData: ChannelPromptData? = ...,
   safetyPolicyNoticeEmbed: SafetyPolicyNoticeEmbed? = ...,
   safetySystemNotificationEmbed: SafetySystemNotificationEmbed? = ...,
   pollData: PollData? = ...,
   sharedClientTheme: SharedCustomThemeData? = ...,
   ctaButton: CtaButton? = ...,
   audioAttachmentBackgroundColor: Int? = ...,
   forwardInfo: ForwardInfo? = ...,
   showInlineForwardButton: Boolean? = ...,
   clanTagGuildId: GuildId? = ...,
   clanTag: String? = ...,
   clanBadgeUrl: String? = ...,
   gameApplicationId: String? = ...,
   isAnnouncementChannel: Boolean = ...
) : Message(
      var1,
      var2,
      var3,
      var4,
      var6,
      var7,
      var8,
      var9,
      var11,
      var12,
      var13,
      var14,
      var15,
      var16,
      var17,
      var18,
      var19,
      var20,
      var21,
      var22,
      var23,
      var24,
      var25,
      var26,
      var27,
      var28,
      var29,
      var30,
      var31,
      var32,
      var33,
      var34,
      var35,
      var36,
      var37,
      var38,
      var39,
      var40,
      var41,
      var42,
      var43,
      var44,
      var45,
      var46,
      var47,
      var48,
      var49,
      var50,
      var51,
      var52,
      var53,
      var54,
      var55,
      var56,
      var57,
      var58,
      var59,
      var60,
      var61,
      var62,
      var63,
      var64,
      var65,
      var66,
      var67,
      var68,
      var69,
      var70,
      var71,
      var72,
      var73,
      var74,
      var75,
      var76,
      var77,
      var78,
      var79,
      var80,
      var81,
      var82,
      var83,
      var84,
      var85,
      var86,
      var87,
      var88,
      var89,
      var90,
      var91,
      var92,
      var93,
      var94,
      var95
   ) {
   public final val type: MessageType
   public final val id: MessageId
   public final val nonce: MessageId?
   public final val channelId: ChannelId
   public final val guildId: GuildId?
   public final val state: MessageState?
   public final val authorId: UserId?
   public final val flags: Long
   public final val edited: String?
   public final val editedColor: Int?
   public final val _constrainedWidth: Float?
   public final val textColor: Int?
   public final val linkColor: Int?
   public final val timestamp: String?
   public final val timestampColor: Int?
   public final val username: String?
   public final val usernameColor: Int?
   public final val roleColor: Int?
   public final val roleColors: RoleColors?
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean
   public final val colorString: Int?
   internal final val avatarURL: String?
   public final val avatarDecorationURL: String?
   public final val embeds: List<Embed>?
   public final val attachments: List<Attachment>?
   public final val attachmentsOpacity: Float?

   @PII
   public final val content: StructurableText?

   public final val reactions: List<MessageReaction>?
   public final val codedLinks: List<CodedLinkEmbed?>?
   public final val activityInstanceEmbed: ActivityInstanceEmbed?
   public final val stickers: List<Sticker>?
   public final val roleIcon: RoleIcon?
   public final val connectionsRoleTag: ConnectionsRoleTag?
   public final val threadEmbed: ThreadEmbed?
   public final val mentioned: Boolean
   public final val gifAutoPlay: Boolean?
   public final val animateEmoji: Boolean?
   public final val showLinkDecorations: Boolean?
   public final val referencedMessage: ReferencedMessage?
   public final val executedCommand: ExecutedCommand?
   public final val components: List<Component>?
   public final val threadStarterMessageHeader: String?
   public final val communicationDisabled: Boolean?
   public final val tagText: String?
   public final val tagVerified: Boolean?
   public final val tagTextColor: Int?
   public final val tagBackgroundColor: Int?
   public final val tagType: String?
   public final val tagIconUrl: String?
   public final val opTagText: String?
   public final val ephemeralIndication: EphemeralIndication?
   public final val surveyIndication: SurveyIndication?
   public final val interactionStatus: InteractionStatus?
   public final val useAttachmentGridLayout: Boolean?
   public final val useAttachmentUploadPreview: Boolean?
   public final val isCurrentUserMessageAuthor: Boolean?
   public final val obscureLearnMoreLabel: String?
   public final val usingGradientTheme: Boolean?
   public final val title: String?
   public final val description: String?
   public final val avatarURLs: List<String>?
   public final val isCallActive: Boolean?
   public final val missed: Boolean?
   public final val rawMilliseconds: Long?
   public final val sticker: Sticker?
   public final val stickerLabel: String?
   public final val buttonLabel: String?
   public final val showInviteToSpeakButton: Boolean?
   public final val activityInviteEmbed: ActivityInviteEmbed?
   public final val activityRichPresenceInviteEmbed: ActivityRichPresenceInviteEmbed?
   public final val isFirstForumPostMessage: Boolean
   public final val postActions: ForumPostActions?
   public final val autoModerationContext: AutoModerationContext?
   public final val referralTrialOfferInfo: ReferralEmbed?
   public final val giftCodes: List<GiftEmbed>?
   public final val referralTrialOffer: GiftEmbed?
   public final val totalMonthsSubscribed: Int?
   public final val postPreviewEmbeds: List<PostPreviewEmbed>?
   public final val channelPromptData: ChannelPromptData?
   public final val safetyPolicyNoticeEmbed: SafetyPolicyNoticeEmbed?
   public final val safetySystemNotificationEmbed: SafetySystemNotificationEmbed?
   public final val pollData: PollData?
   public final val sharedClientTheme: SharedCustomThemeData?
   public final val ctaButton: CtaButton?
   public final val audioAttachmentBackgroundColor: Int?
   public final val forwardInfo: ForwardInfo?
   public final val showInlineForwardButton: Boolean?
   public final val clanTagGuildId: GuildId?
   public final val clanTag: String?
   public final val clanBadgeUrl: String?
   public final val gameApplicationId: String?
   public final val isAnnouncementChannel: Boolean

   public final val constrainedWidth: Int?
      public final get() {
         return this.constrainedWidth$delegate.getValue() as Int;
      }


   fun Message(
      var1: MessageType,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: Long,
      var6: GuildId,
      var7: MessageState,
      var8: UserId,
      var9: Long,
      var11: java.lang.String,
      var12: Int,
      var13: java.lang.Float,
      var14: Int,
      var15: Int,
      var16: java.lang.String,
      var17: Int,
      var18: java.lang.String,
      var19: Int,
      var20: Int,
      var21: RoleColors,
      var22: Boolean,
      var23: Boolean,
      var24: Int,
      var25: java.lang.String,
      var26: java.lang.String,
      var27: MutableList<Embed>,
      var28: MutableList<Attachment>,
      var29: java.lang.Float,
      var30: StructurableText,
      var31: MutableList<MessageReaction>,
      var32: MutableList<CodedLinkEmbed>,
      var33: ActivityInstanceEmbed,
      var34: MutableList<Sticker>,
      var35: RoleIcon,
      var36: ConnectionsRoleTag,
      var37: ThreadEmbed,
      var38: Boolean,
      var39: java.lang.Boolean,
      var40: java.lang.Boolean,
      var41: java.lang.Boolean,
      var42: ReferencedMessage,
      var43: ExecutedCommand,
      var44: MutableList<Component>,
      var45: java.lang.String,
      var46: java.lang.Boolean,
      var47: java.lang.String,
      var48: java.lang.Boolean,
      var49: Int,
      var50: Int,
      var51: java.lang.String,
      var52: java.lang.String,
      var53: java.lang.String,
      var54: EphemeralIndication,
      var55: SurveyIndication,
      var56: InteractionStatus,
      var57: java.lang.Boolean,
      var58: java.lang.Boolean,
      var59: java.lang.Boolean,
      var60: java.lang.String,
      var61: java.lang.Boolean,
      var62: java.lang.String,
      var63: java.lang.String,
      var64: MutableList<java.lang.String>,
      var65: java.lang.Boolean,
      var66: java.lang.Boolean,
      var67: java.lang.Long,
      var68: Sticker,
      var69: java.lang.String,
      var70: java.lang.String,
      var71: java.lang.Boolean,
      var72: ActivityInviteEmbed,
      var73: ActivityRichPresenceInviteEmbed,
      var74: Boolean,
      var75: ForumPostActions,
      var76: AutoModerationContext,
      var77: ReferralEmbed,
      var78: MutableList<GiftEmbed>,
      var79: GiftEmbed,
      var80: Int,
      var81: MutableList<PostPreviewEmbed>,
      var82: ChannelPromptData,
      var83: SafetyPolicyNoticeEmbed,
      var84: SafetySystemNotificationEmbed,
      var85: PollData,
      var86: SharedCustomThemeData,
      var87: CtaButton,
      var88: Int,
      var89: ForwardInfo,
      var90: java.lang.Boolean,
      var91: GuildId,
      var92: java.lang.String,
      var93: java.lang.String,
      var94: java.lang.String,
      var95: Boolean
   ) {
      super(null);
      this.type = var1;
      this.id = var2;
      this.nonce = var3;
      this.channelId = var4;
      this.guildId = var6;
      this.state = var7;
      this.authorId = var8;
      this.flags = var9;
      this.edited = var11;
      this.editedColor = var12;
      this._constrainedWidth = var13;
      this.textColor = var14;
      this.linkColor = var15;
      this.timestamp = var16;
      this.timestampColor = var17;
      this.username = var18;
      this.usernameColor = var19;
      this.roleColor = var20;
      this.roleColors = var21;
      this.shouldShowRoleDot = var22;
      this.shouldShowRoleOnName = var23;
      this.colorString = var24;
      this.avatarURL = var25;
      this.avatarDecorationURL = var26;
      this.embeds = var27;
      this.attachments = var28;
      this.attachmentsOpacity = var29;
      this.content = var30;
      this.reactions = var31;
      this.codedLinks = var32;
      this.activityInstanceEmbed = var33;
      this.stickers = var34;
      this.roleIcon = var35;
      this.connectionsRoleTag = var36;
      this.threadEmbed = var37;
      this.mentioned = var38;
      this.gifAutoPlay = var39;
      this.animateEmoji = var40;
      this.showLinkDecorations = var41;
      this.referencedMessage = var42;
      this.executedCommand = var43;
      this.components = var44;
      this.threadStarterMessageHeader = var45;
      this.communicationDisabled = var46;
      this.tagText = var47;
      this.tagVerified = var48;
      this.tagTextColor = var49;
      this.tagBackgroundColor = var50;
      this.tagType = var51;
      this.tagIconUrl = var52;
      this.opTagText = var53;
      this.ephemeralIndication = var54;
      this.surveyIndication = var55;
      this.interactionStatus = var56;
      this.useAttachmentGridLayout = var57;
      this.useAttachmentUploadPreview = var58;
      this.isCurrentUserMessageAuthor = var59;
      this.obscureLearnMoreLabel = var60;
      this.usingGradientTheme = var61;
      this.title = var62;
      this.description = var63;
      this.avatarURLs = var64;
      this.isCallActive = var65;
      this.missed = var66;
      this.rawMilliseconds = var67;
      this.sticker = var68;
      this.stickerLabel = var69;
      this.buttonLabel = var70;
      this.showInviteToSpeakButton = var71;
      this.activityInviteEmbed = var72;
      this.activityRichPresenceInviteEmbed = var73;
      this.isFirstForumPostMessage = var74;
      this.postActions = var75;
      this.autoModerationContext = var76;
      this.referralTrialOfferInfo = var77;
      this.giftCodes = var78;
      this.referralTrialOffer = var79;
      this.totalMonthsSubscribed = var80;
      this.postPreviewEmbeds = var81;
      this.channelPromptData = var82;
      this.safetyPolicyNoticeEmbed = var83;
      this.safetySystemNotificationEmbed = var84;
      this.pollData = var85;
      this.sharedClientTheme = var86;
      this.ctaButton = var87;
      this.audioAttachmentBackgroundColor = var88;
      this.forwardInfo = var89;
      this.showInlineForwardButton = var90;
      this.clanTagGuildId = var91;
      this.clanTag = var92;
      this.clanBadgeUrl = var93;
      this.gameApplicationId = var94;
      this.isAnnouncementChannel = var95;
      this.constrainedWidth$delegate = j.b(new b(this));
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: Message): Int {
      val var2: Int;
      if (var0._constrainedWidth != null) {
         var2 = SizeUtilsKt.getDpToPx(var0._constrainedWidth);
      } else {
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   fun `constrainedWidth_delegate$lambda$0`(var0: Message): Int {
      val var2: Int;
      if (var0._constrainedWidth != null) {
         var2 = SizeUtilsKt.getDpToPx(var0._constrainedWidth);
      } else {
         var2 = null;
      }

      return var2;
   }

   public operator fun component1(): MessageType {
      return this.type;
   }

   public operator fun component10(): Int? {
      return this.editedColor;
   }

   public operator fun component11(): Float? {
      return this._constrainedWidth;
   }

   public operator fun component12(): Int? {
      return this.textColor;
   }

   public operator fun component13(): Int? {
      return this.linkColor;
   }

   public operator fun component14(): String? {
      return this.timestamp;
   }

   public operator fun component15(): Int? {
      return this.timestampColor;
   }

   public operator fun component16(): String? {
      return this.username;
   }

   public operator fun component17(): Int? {
      return this.usernameColor;
   }

   public operator fun component18(): Int? {
      return this.roleColor;
   }

   public operator fun component19(): RoleColors? {
      return this.roleColors;
   }

   public operator fun component2(): MessageId {
      return this.id;
   }

   public operator fun component20(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component21(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public operator fun component22(): Int? {
      return this.colorString;
   }

   internal operator fun component23(): String? {
      return this.avatarURL;
   }

   public operator fun component24(): String? {
      return this.avatarDecorationURL;
   }

   public operator fun component25(): List<Embed>? {
      return this.embeds;
   }

   public operator fun component26(): List<Attachment>? {
      return this.attachments;
   }

   public operator fun component27(): Float? {
      return this.attachmentsOpacity;
   }

   public operator fun component28(): StructurableText? {
      return this.content;
   }

   public operator fun component29(): List<MessageReaction>? {
      return this.reactions;
   }

   public operator fun component3(): MessageId? {
      return this.nonce;
   }

   public operator fun component30(): List<CodedLinkEmbed?>? {
      return this.codedLinks;
   }

   public operator fun component31(): ActivityInstanceEmbed? {
      return this.activityInstanceEmbed;
   }

   public operator fun component32(): List<Sticker>? {
      return this.stickers;
   }

   public operator fun component33(): RoleIcon? {
      return this.roleIcon;
   }

   public operator fun component34(): ConnectionsRoleTag? {
      return this.connectionsRoleTag;
   }

   public operator fun component35(): ThreadEmbed? {
      return this.threadEmbed;
   }

   public operator fun component36(): Boolean {
      return this.mentioned;
   }

   public operator fun component37(): Boolean? {
      return this.gifAutoPlay;
   }

   public operator fun component38(): Boolean? {
      return this.animateEmoji;
   }

   public operator fun component39(): Boolean? {
      return this.showLinkDecorations;
   }

   public operator fun component4(): ChannelId {
      return this.channelId;
   }

   public operator fun component40(): ReferencedMessage? {
      return this.referencedMessage;
   }

   public operator fun component41(): ExecutedCommand? {
      return this.executedCommand;
   }

   public operator fun component42(): List<Component>? {
      return this.components;
   }

   public operator fun component43(): String? {
      return this.threadStarterMessageHeader;
   }

   public operator fun component44(): Boolean? {
      return this.communicationDisabled;
   }

   public operator fun component45(): String? {
      return this.tagText;
   }

   public operator fun component46(): Boolean? {
      return this.tagVerified;
   }

   public operator fun component47(): Int? {
      return this.tagTextColor;
   }

   public operator fun component48(): Int? {
      return this.tagBackgroundColor;
   }

   public operator fun component49(): String? {
      return this.tagType;
   }

   public operator fun component5(): GuildId? {
      return this.guildId;
   }

   public operator fun component50(): String? {
      return this.tagIconUrl;
   }

   public operator fun component51(): String? {
      return this.opTagText;
   }

   public operator fun component52(): EphemeralIndication? {
      return this.ephemeralIndication;
   }

   public operator fun component53(): SurveyIndication? {
      return this.surveyIndication;
   }

   public operator fun component54(): InteractionStatus? {
      return this.interactionStatus;
   }

   public operator fun component55(): Boolean? {
      return this.useAttachmentGridLayout;
   }

   public operator fun component56(): Boolean? {
      return this.useAttachmentUploadPreview;
   }

   public operator fun component57(): Boolean? {
      return this.isCurrentUserMessageAuthor;
   }

   public operator fun component58(): String? {
      return this.obscureLearnMoreLabel;
   }

   public operator fun component59(): Boolean? {
      return this.usingGradientTheme;
   }

   public operator fun component6(): MessageState? {
      return this.state;
   }

   public operator fun component60(): String? {
      return this.title;
   }

   public operator fun component61(): String? {
      return this.description;
   }

   public operator fun component62(): List<String>? {
      return this.avatarURLs;
   }

   public operator fun component63(): Boolean? {
      return this.isCallActive;
   }

   public operator fun component64(): Boolean? {
      return this.missed;
   }

   public operator fun component65(): Long? {
      return this.rawMilliseconds;
   }

   public operator fun component66(): Sticker? {
      return this.sticker;
   }

   public operator fun component67(): String? {
      return this.stickerLabel;
   }

   public operator fun component68(): String? {
      return this.buttonLabel;
   }

   public operator fun component69(): Boolean? {
      return this.showInviteToSpeakButton;
   }

   public operator fun component7(): UserId? {
      return this.authorId;
   }

   public operator fun component70(): ActivityInviteEmbed? {
      return this.activityInviteEmbed;
   }

   public operator fun component71(): ActivityRichPresenceInviteEmbed? {
      return this.activityRichPresenceInviteEmbed;
   }

   public operator fun component72(): Boolean {
      return this.isFirstForumPostMessage;
   }

   public operator fun component73(): ForumPostActions? {
      return this.postActions;
   }

   public operator fun component74(): AutoModerationContext? {
      return this.autoModerationContext;
   }

   public operator fun component75(): ReferralEmbed? {
      return this.referralTrialOfferInfo;
   }

   public operator fun component76(): List<GiftEmbed>? {
      return this.giftCodes;
   }

   public operator fun component77(): GiftEmbed? {
      return this.referralTrialOffer;
   }

   public operator fun component78(): Int? {
      return this.totalMonthsSubscribed;
   }

   public operator fun component79(): List<PostPreviewEmbed>? {
      return this.postPreviewEmbeds;
   }

   public operator fun component8(): Long {
      return this.flags;
   }

   public operator fun component80(): ChannelPromptData? {
      return this.channelPromptData;
   }

   public operator fun component81(): SafetyPolicyNoticeEmbed? {
      return this.safetyPolicyNoticeEmbed;
   }

   public operator fun component82(): SafetySystemNotificationEmbed? {
      return this.safetySystemNotificationEmbed;
   }

   public operator fun component83(): PollData? {
      return this.pollData;
   }

   public operator fun component84(): SharedCustomThemeData? {
      return this.sharedClientTheme;
   }

   public operator fun component85(): CtaButton? {
      return this.ctaButton;
   }

   public operator fun component86(): Int? {
      return this.audioAttachmentBackgroundColor;
   }

   public operator fun component87(): ForwardInfo? {
      return this.forwardInfo;
   }

   public operator fun component88(): Boolean? {
      return this.showInlineForwardButton;
   }

   public operator fun component89(): GuildId? {
      return this.clanTagGuildId;
   }

   public operator fun component9(): String? {
      return this.edited;
   }

   public operator fun component90(): String? {
      return this.clanTag;
   }

   public operator fun component91(): String? {
      return this.clanBadgeUrl;
   }

   public operator fun component92(): String? {
      return this.gameApplicationId;
   }

   public operator fun component93(): Boolean {
      return this.isAnnouncementChannel;
   }

   public fun copy(
      type: MessageType = ...,
      id: MessageId = ...,
      nonce: MessageId? = ...,
      channelId: ChannelId = ...,
      guildId: GuildId? = ...,
      state: MessageState? = ...,
      authorId: UserId? = ...,
      flags: Long = ...,
      edited: String? = ...,
      editedColor: Int? = ...,
      _constrainedWidth: Float? = ...,
      textColor: Int? = ...,
      linkColor: Int? = ...,
      timestamp: String? = ...,
      timestampColor: Int? = ...,
      username: String? = ...,
      usernameColor: Int? = ...,
      roleColor: Int? = ...,
      roleColors: RoleColors? = ...,
      shouldShowRoleDot: Boolean = ...,
      shouldShowRoleOnName: Boolean = ...,
      colorString: Int? = ...,
      avatarURL: String? = ...,
      avatarDecorationURL: String? = ...,
      embeds: List<Embed>? = ...,
      attachments: List<Attachment>? = ...,
      attachmentsOpacity: Float? = ...,
      content: StructurableText? = ...,
      reactions: List<MessageReaction>? = ...,
      codedLinks: List<CodedLinkEmbed?>? = ...,
      activityInstanceEmbed: ActivityInstanceEmbed? = ...,
      stickers: List<Sticker>? = ...,
      roleIcon: RoleIcon? = ...,
      connectionsRoleTag: ConnectionsRoleTag? = ...,
      threadEmbed: ThreadEmbed? = ...,
      mentioned: Boolean = ...,
      gifAutoPlay: Boolean? = ...,
      animateEmoji: Boolean? = ...,
      showLinkDecorations: Boolean? = ...,
      referencedMessage: ReferencedMessage? = ...,
      executedCommand: ExecutedCommand? = ...,
      components: List<Component>? = ...,
      threadStarterMessageHeader: String? = ...,
      communicationDisabled: Boolean? = ...,
      tagText: String? = ...,
      tagVerified: Boolean? = ...,
      tagTextColor: Int? = ...,
      tagBackgroundColor: Int? = ...,
      tagType: String? = ...,
      tagIconUrl: String? = ...,
      opTagText: String? = ...,
      ephemeralIndication: EphemeralIndication? = ...,
      surveyIndication: SurveyIndication? = ...,
      interactionStatus: InteractionStatus? = ...,
      useAttachmentGridLayout: Boolean? = ...,
      useAttachmentUploadPreview: Boolean? = ...,
      isCurrentUserMessageAuthor: Boolean? = ...,
      obscureLearnMoreLabel: String? = ...,
      usingGradientTheme: Boolean? = ...,
      title: String? = ...,
      description: String? = ...,
      avatarURLs: List<String>? = ...,
      isCallActive: Boolean? = ...,
      missed: Boolean? = ...,
      rawMilliseconds: Long? = ...,
      sticker: Sticker? = ...,
      stickerLabel: String? = ...,
      buttonLabel: String? = ...,
      showInviteToSpeakButton: Boolean? = ...,
      activityInviteEmbed: ActivityInviteEmbed? = ...,
      activityRichPresenceInviteEmbed: ActivityRichPresenceInviteEmbed? = ...,
      isFirstForumPostMessage: Boolean = ...,
      postActions: ForumPostActions? = ...,
      autoModerationContext: AutoModerationContext? = ...,
      referralTrialOfferInfo: ReferralEmbed? = ...,
      giftCodes: List<GiftEmbed>? = ...,
      referralTrialOffer: GiftEmbed? = ...,
      totalMonthsSubscribed: Int? = ...,
      postPreviewEmbeds: List<PostPreviewEmbed>? = ...,
      channelPromptData: ChannelPromptData? = ...,
      safetyPolicyNoticeEmbed: SafetyPolicyNoticeEmbed? = ...,
      safetySystemNotificationEmbed: SafetySystemNotificationEmbed? = ...,
      pollData: PollData? = ...,
      sharedClientTheme: SharedCustomThemeData? = ...,
      ctaButton: CtaButton? = ...,
      audioAttachmentBackgroundColor: Int? = ...,
      forwardInfo: ForwardInfo? = ...,
      showInlineForwardButton: Boolean? = ...,
      clanTagGuildId: GuildId? = ...,
      clanTag: String? = ...,
      clanBadgeUrl: String? = ...,
      gameApplicationId: String? = ...,
      isAnnouncementChannel: Boolean = ...
   ): Message {
      return new Message(
         var1,
         var2,
         var3,
         var4,
         var6,
         var7,
         var8,
         var9,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31,
         var32,
         var33,
         var34,
         var35,
         var36,
         var37,
         var38,
         var39,
         var40,
         var41,
         var42,
         var43,
         var44,
         var45,
         var46,
         var47,
         var48,
         var49,
         var50,
         var51,
         var52,
         var53,
         var54,
         var55,
         var56,
         var57,
         var58,
         var59,
         var60,
         var61,
         var62,
         var63,
         var64,
         var65,
         var66,
         var67,
         var68,
         var69,
         var70,
         var71,
         var72,
         var73,
         var74,
         var75,
         var76,
         var77,
         var78,
         var79,
         var80,
         var81,
         var82,
         var83,
         var84,
         var85,
         var86,
         var87,
         var88,
         var89,
         var90,
         var91,
         var92,
         var93,
         var94,
         var95,
         null
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Message) {
         return false;
      } else {
         val var4: Message = var1 as Message;
         if (this.type != (var1 as Message).type) {
            return false;
         } else if (!MessageId.equals-impl0(this.id, var4.id)) {
            return false;
         } else {
            var var2: Boolean;
            label390: {
               if (this.nonce == null) {
                  if (var4.nonce == null) {
                     var2 = true;
                     break label390;
                  }
               } else if (var4.nonce != null) {
                  var2 = MessageId.equals-impl0(this.nonce, var4.nonce);
                  break label390;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!ChannelId.equals-impl0(this.channelId, var4.channelId)) {
               return false;
            } else if (!(this.guildId == var4.guildId)) {
               return false;
            } else if (this.state != var4.state) {
               return false;
            } else if (!(this.authorId == var4.authorId)) {
               return false;
            } else if (this.flags != var4.flags) {
               return false;
            } else if (!(this.edited == var4.edited)) {
               return false;
            } else if (!(this.editedColor == var4.editedColor)) {
               return false;
            } else if (!(this._constrainedWidth == var4._constrainedWidth)) {
               return false;
            } else if (!(this.textColor == var4.textColor)) {
               return false;
            } else if (!(this.linkColor == var4.linkColor)) {
               return false;
            } else if (!(this.timestamp == var4.timestamp)) {
               return false;
            } else if (!(this.timestampColor == var4.timestampColor)) {
               return false;
            } else if (!(this.username == var4.username)) {
               return false;
            } else if (!(this.usernameColor == var4.usernameColor)) {
               return false;
            } else if (!(this.roleColor == var4.roleColor)) {
               return false;
            } else if (!(this.roleColors == var4.roleColors)) {
               return false;
            } else if (this.shouldShowRoleDot != var4.shouldShowRoleDot) {
               return false;
            } else if (this.shouldShowRoleOnName != var4.shouldShowRoleOnName) {
               return false;
            } else if (!(this.colorString == var4.colorString)) {
               return false;
            } else if (!(this.avatarURL == var4.avatarURL)) {
               return false;
            } else if (!(this.avatarDecorationURL == var4.avatarDecorationURL)) {
               return false;
            } else if (!(this.embeds == var4.embeds)) {
               return false;
            } else if (!(this.attachments == var4.attachments)) {
               return false;
            } else if (!(this.attachmentsOpacity == var4.attachmentsOpacity)) {
               return false;
            } else if (!(this.content == var4.content)) {
               return false;
            } else if (!(this.reactions == var4.reactions)) {
               return false;
            } else if (!(this.codedLinks == var4.codedLinks)) {
               return false;
            } else if (!(this.activityInstanceEmbed == var4.activityInstanceEmbed)) {
               return false;
            } else if (!(this.stickers == var4.stickers)) {
               return false;
            } else if (!(this.roleIcon == var4.roleIcon)) {
               return false;
            } else if (!(this.connectionsRoleTag == var4.connectionsRoleTag)) {
               return false;
            } else if (!(this.threadEmbed == var4.threadEmbed)) {
               return false;
            } else if (this.mentioned != var4.mentioned) {
               return false;
            } else if (!(this.gifAutoPlay == var4.gifAutoPlay)) {
               return false;
            } else if (!(this.animateEmoji == var4.animateEmoji)) {
               return false;
            } else if (!(this.showLinkDecorations == var4.showLinkDecorations)) {
               return false;
            } else if (!(this.referencedMessage == var4.referencedMessage)) {
               return false;
            } else if (!(this.executedCommand == var4.executedCommand)) {
               return false;
            } else if (!(this.components == var4.components)) {
               return false;
            } else if (!(this.threadStarterMessageHeader == var4.threadStarterMessageHeader)) {
               return false;
            } else if (!(this.communicationDisabled == var4.communicationDisabled)) {
               return false;
            } else if (!(this.tagText == var4.tagText)) {
               return false;
            } else if (!(this.tagVerified == var4.tagVerified)) {
               return false;
            } else if (!(this.tagTextColor == var4.tagTextColor)) {
               return false;
            } else if (!(this.tagBackgroundColor == var4.tagBackgroundColor)) {
               return false;
            } else if (!(this.tagType == var4.tagType)) {
               return false;
            } else if (!(this.tagIconUrl == var4.tagIconUrl)) {
               return false;
            } else if (!(this.opTagText == var4.opTagText)) {
               return false;
            } else if (!(this.ephemeralIndication == var4.ephemeralIndication)) {
               return false;
            } else if (!(this.surveyIndication == var4.surveyIndication)) {
               return false;
            } else if (!(this.interactionStatus == var4.interactionStatus)) {
               return false;
            } else if (!(this.useAttachmentGridLayout == var4.useAttachmentGridLayout)) {
               return false;
            } else if (!(this.useAttachmentUploadPreview == var4.useAttachmentUploadPreview)) {
               return false;
            } else if (!(this.isCurrentUserMessageAuthor == var4.isCurrentUserMessageAuthor)) {
               return false;
            } else if (!(this.obscureLearnMoreLabel == var4.obscureLearnMoreLabel)) {
               return false;
            } else if (!(this.usingGradientTheme == var4.usingGradientTheme)) {
               return false;
            } else if (!(this.title == var4.title)) {
               return false;
            } else if (!(this.description == var4.description)) {
               return false;
            } else if (!(this.avatarURLs == var4.avatarURLs)) {
               return false;
            } else if (!(this.isCallActive == var4.isCallActive)) {
               return false;
            } else if (!(this.missed == var4.missed)) {
               return false;
            } else if (!(this.rawMilliseconds == var4.rawMilliseconds)) {
               return false;
            } else if (!(this.sticker == var4.sticker)) {
               return false;
            } else if (!(this.stickerLabel == var4.stickerLabel)) {
               return false;
            } else if (!(this.buttonLabel == var4.buttonLabel)) {
               return false;
            } else if (!(this.showInviteToSpeakButton == var4.showInviteToSpeakButton)) {
               return false;
            } else if (!(this.activityInviteEmbed == var4.activityInviteEmbed)) {
               return false;
            } else if (!(this.activityRichPresenceInviteEmbed == var4.activityRichPresenceInviteEmbed)) {
               return false;
            } else if (this.isFirstForumPostMessage != var4.isFirstForumPostMessage) {
               return false;
            } else if (!(this.postActions == var4.postActions)) {
               return false;
            } else if (!(this.autoModerationContext == var4.autoModerationContext)) {
               return false;
            } else if (!(this.referralTrialOfferInfo == var4.referralTrialOfferInfo)) {
               return false;
            } else if (!(this.giftCodes == var4.giftCodes)) {
               return false;
            } else if (!(this.referralTrialOffer == var4.referralTrialOffer)) {
               return false;
            } else if (!(this.totalMonthsSubscribed == var4.totalMonthsSubscribed)) {
               return false;
            } else if (!(this.postPreviewEmbeds == var4.postPreviewEmbeds)) {
               return false;
            } else if (!(this.channelPromptData == var4.channelPromptData)) {
               return false;
            } else if (!(this.safetyPolicyNoticeEmbed == var4.safetyPolicyNoticeEmbed)) {
               return false;
            } else if (!(this.safetySystemNotificationEmbed == var4.safetySystemNotificationEmbed)) {
               return false;
            } else if (!(this.pollData == var4.pollData)) {
               return false;
            } else if (!(this.sharedClientTheme == var4.sharedClientTheme)) {
               return false;
            } else if (!(this.ctaButton == var4.ctaButton)) {
               return false;
            } else if (!(this.audioAttachmentBackgroundColor == var4.audioAttachmentBackgroundColor)) {
               return false;
            } else if (!(this.forwardInfo == var4.forwardInfo)) {
               return false;
            } else if (!(this.showInlineForwardButton == var4.showInlineForwardButton)) {
               return false;
            } else if (!(this.clanTagGuildId == var4.clanTagGuildId)) {
               return false;
            } else if (!(this.clanTag == var4.clanTag)) {
               return false;
            } else if (!(this.clanBadgeUrl == var4.clanBadgeUrl)) {
               return false;
            } else if (!(this.gameApplicationId == var4.gameApplicationId)) {
               return false;
            } else {
               return this.isAnnouncementChannel == var4.isAnnouncementChannel;
            }
         }
      }
   }

   public fun hasAttachmentsOrEmbeds(): Boolean {
      var var1: Boolean = true;
      if ((this.attachments == null || !(this.attachments.isEmpty() xor true)) && (this.embeds == null || !(this.embeds.isEmpty() xor true))) {
         var1 = false;
      }

      return var1;
   }

   public fun hasCommand(): Boolean {
      val var1: Boolean;
      if (this.executedCommand != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun hasStickers(): Boolean {
      var var1: Boolean = false;
      if (this.stickers != null) {
         var1 = false;
         if (this.stickers.isEmpty() xor true) {
            var1 = true;
         }
      }

      return var1;
   }

   public override fun hashCode(): Int {
      val var86: Int = this.type.hashCode();
      val var85: Int = MessageId.hashCode-impl(this.id);
      var var84: Int = 0;
      val var1: Int;
      if (this.nonce == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.nonce);
      }

      val var87: Int = ChannelId.hashCode-impl(this.channelId);
      val var2: Int;
      if (this.guildId == null) {
         var2 = 0;
      } else {
         var2 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      val var3: Int;
      if (this.state == null) {
         var3 = 0;
      } else {
         var3 = this.state.hashCode();
      }

      val var4: Int;
      if (this.authorId == null) {
         var4 = 0;
      } else {
         var4 = UserId.hashCode-impl(this.authorId.unbox-impl());
      }

      val var88: Int = java.lang.Long.hashCode(this.flags);
      val var5: Int;
      if (this.edited == null) {
         var5 = 0;
      } else {
         var5 = this.edited.hashCode();
      }

      val var6: Int;
      if (this.editedColor == null) {
         var6 = 0;
      } else {
         var6 = this.editedColor.hashCode();
      }

      val var7: Int;
      if (this._constrainedWidth == null) {
         var7 = 0;
      } else {
         var7 = this._constrainedWidth.hashCode();
      }

      val var8: Int;
      if (this.textColor == null) {
         var8 = 0;
      } else {
         var8 = this.textColor.hashCode();
      }

      val var9: Int;
      if (this.linkColor == null) {
         var9 = 0;
      } else {
         var9 = this.linkColor.hashCode();
      }

      val var10: Int;
      if (this.timestamp == null) {
         var10 = 0;
      } else {
         var10 = this.timestamp.hashCode();
      }

      val var11: Int;
      if (this.timestampColor == null) {
         var11 = 0;
      } else {
         var11 = this.timestampColor.hashCode();
      }

      val var12: Int;
      if (this.username == null) {
         var12 = 0;
      } else {
         var12 = this.username.hashCode();
      }

      val var13: Int;
      if (this.usernameColor == null) {
         var13 = 0;
      } else {
         var13 = this.usernameColor.hashCode();
      }

      val var14: Int;
      if (this.roleColor == null) {
         var14 = 0;
      } else {
         var14 = this.roleColor.hashCode();
      }

      val var15: Int;
      if (this.roleColors == null) {
         var15 = 0;
      } else {
         var15 = this.roleColors.hashCode();
      }

      val var90: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var89: Int = java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
      val var16: Int;
      if (this.colorString == null) {
         var16 = 0;
      } else {
         var16 = this.colorString.hashCode();
      }

      val var17: Int;
      if (this.avatarURL == null) {
         var17 = 0;
      } else {
         var17 = this.avatarURL.hashCode();
      }

      val var18: Int;
      if (this.avatarDecorationURL == null) {
         var18 = 0;
      } else {
         var18 = this.avatarDecorationURL.hashCode();
      }

      val var19: Int;
      if (this.embeds == null) {
         var19 = 0;
      } else {
         var19 = this.embeds.hashCode();
      }

      val var20: Int;
      if (this.attachments == null) {
         var20 = 0;
      } else {
         var20 = this.attachments.hashCode();
      }

      val var21: Int;
      if (this.attachmentsOpacity == null) {
         var21 = 0;
      } else {
         var21 = this.attachmentsOpacity.hashCode();
      }

      val var22: Int;
      if (this.content == null) {
         var22 = 0;
      } else {
         var22 = this.content.hashCode();
      }

      val var23: Int;
      if (this.reactions == null) {
         var23 = 0;
      } else {
         var23 = this.reactions.hashCode();
      }

      val var24: Int;
      if (this.codedLinks == null) {
         var24 = 0;
      } else {
         var24 = this.codedLinks.hashCode();
      }

      val var25: Int;
      if (this.activityInstanceEmbed == null) {
         var25 = 0;
      } else {
         var25 = this.activityInstanceEmbed.hashCode();
      }

      val var26: Int;
      if (this.stickers == null) {
         var26 = 0;
      } else {
         var26 = this.stickers.hashCode();
      }

      val var27: Int;
      if (this.roleIcon == null) {
         var27 = 0;
      } else {
         var27 = this.roleIcon.hashCode();
      }

      val var28: Int;
      if (this.connectionsRoleTag == null) {
         var28 = 0;
      } else {
         var28 = this.connectionsRoleTag.hashCode();
      }

      val var29: Int;
      if (this.threadEmbed == null) {
         var29 = 0;
      } else {
         var29 = this.threadEmbed.hashCode();
      }

      val var91: Int = java.lang.Boolean.hashCode(this.mentioned);
      val var30: Int;
      if (this.gifAutoPlay == null) {
         var30 = 0;
      } else {
         var30 = this.gifAutoPlay.hashCode();
      }

      val var31: Int;
      if (this.animateEmoji == null) {
         var31 = 0;
      } else {
         var31 = this.animateEmoji.hashCode();
      }

      val var32: Int;
      if (this.showLinkDecorations == null) {
         var32 = 0;
      } else {
         var32 = this.showLinkDecorations.hashCode();
      }

      val var33: Int;
      if (this.referencedMessage == null) {
         var33 = 0;
      } else {
         var33 = this.referencedMessage.hashCode();
      }

      val var34: Int;
      if (this.executedCommand == null) {
         var34 = 0;
      } else {
         var34 = this.executedCommand.hashCode();
      }

      val var35: Int;
      if (this.components == null) {
         var35 = 0;
      } else {
         var35 = this.components.hashCode();
      }

      val var36: Int;
      if (this.threadStarterMessageHeader == null) {
         var36 = 0;
      } else {
         var36 = this.threadStarterMessageHeader.hashCode();
      }

      val var37: Int;
      if (this.communicationDisabled == null) {
         var37 = 0;
      } else {
         var37 = this.communicationDisabled.hashCode();
      }

      val var38: Int;
      if (this.tagText == null) {
         var38 = 0;
      } else {
         var38 = this.tagText.hashCode();
      }

      val var39: Int;
      if (this.tagVerified == null) {
         var39 = 0;
      } else {
         var39 = this.tagVerified.hashCode();
      }

      val var40: Int;
      if (this.tagTextColor == null) {
         var40 = 0;
      } else {
         var40 = this.tagTextColor.hashCode();
      }

      val var41: Int;
      if (this.tagBackgroundColor == null) {
         var41 = 0;
      } else {
         var41 = this.tagBackgroundColor.hashCode();
      }

      val var42: Int;
      if (this.tagType == null) {
         var42 = 0;
      } else {
         var42 = this.tagType.hashCode();
      }

      val var43: Int;
      if (this.tagIconUrl == null) {
         var43 = 0;
      } else {
         var43 = this.tagIconUrl.hashCode();
      }

      val var44: Int;
      if (this.opTagText == null) {
         var44 = 0;
      } else {
         var44 = this.opTagText.hashCode();
      }

      val var45: Int;
      if (this.ephemeralIndication == null) {
         var45 = 0;
      } else {
         var45 = this.ephemeralIndication.hashCode();
      }

      val var46: Int;
      if (this.surveyIndication == null) {
         var46 = 0;
      } else {
         var46 = this.surveyIndication.hashCode();
      }

      val var47: Int;
      if (this.interactionStatus == null) {
         var47 = 0;
      } else {
         var47 = this.interactionStatus.hashCode();
      }

      val var48: Int;
      if (this.useAttachmentGridLayout == null) {
         var48 = 0;
      } else {
         var48 = this.useAttachmentGridLayout.hashCode();
      }

      val var49: Int;
      if (this.useAttachmentUploadPreview == null) {
         var49 = 0;
      } else {
         var49 = this.useAttachmentUploadPreview.hashCode();
      }

      val var50: Int;
      if (this.isCurrentUserMessageAuthor == null) {
         var50 = 0;
      } else {
         var50 = this.isCurrentUserMessageAuthor.hashCode();
      }

      val var51: Int;
      if (this.obscureLearnMoreLabel == null) {
         var51 = 0;
      } else {
         var51 = this.obscureLearnMoreLabel.hashCode();
      }

      val var52: Int;
      if (this.usingGradientTheme == null) {
         var52 = 0;
      } else {
         var52 = this.usingGradientTheme.hashCode();
      }

      val var53: Int;
      if (this.title == null) {
         var53 = 0;
      } else {
         var53 = this.title.hashCode();
      }

      val var54: Int;
      if (this.description == null) {
         var54 = 0;
      } else {
         var54 = this.description.hashCode();
      }

      val var55: Int;
      if (this.avatarURLs == null) {
         var55 = 0;
      } else {
         var55 = this.avatarURLs.hashCode();
      }

      val var56: Int;
      if (this.isCallActive == null) {
         var56 = 0;
      } else {
         var56 = this.isCallActive.hashCode();
      }

      val var57: Int;
      if (this.missed == null) {
         var57 = 0;
      } else {
         var57 = this.missed.hashCode();
      }

      val var58: Int;
      if (this.rawMilliseconds == null) {
         var58 = 0;
      } else {
         var58 = this.rawMilliseconds.hashCode();
      }

      val var59: Int;
      if (this.sticker == null) {
         var59 = 0;
      } else {
         var59 = this.sticker.hashCode();
      }

      val var60: Int;
      if (this.stickerLabel == null) {
         var60 = 0;
      } else {
         var60 = this.stickerLabel.hashCode();
      }

      val var61: Int;
      if (this.buttonLabel == null) {
         var61 = 0;
      } else {
         var61 = this.buttonLabel.hashCode();
      }

      val var62: Int;
      if (this.showInviteToSpeakButton == null) {
         var62 = 0;
      } else {
         var62 = this.showInviteToSpeakButton.hashCode();
      }

      val var63: Int;
      if (this.activityInviteEmbed == null) {
         var63 = 0;
      } else {
         var63 = this.activityInviteEmbed.hashCode();
      }

      val var64: Int;
      if (this.activityRichPresenceInviteEmbed == null) {
         var64 = 0;
      } else {
         var64 = this.activityRichPresenceInviteEmbed.hashCode();
      }

      val var92: Int = java.lang.Boolean.hashCode(this.isFirstForumPostMessage);
      val var65: Int;
      if (this.postActions == null) {
         var65 = 0;
      } else {
         var65 = this.postActions.hashCode();
      }

      val var66: Int;
      if (this.autoModerationContext == null) {
         var66 = 0;
      } else {
         var66 = this.autoModerationContext.hashCode();
      }

      val var67: Int;
      if (this.referralTrialOfferInfo == null) {
         var67 = 0;
      } else {
         var67 = this.referralTrialOfferInfo.hashCode();
      }

      val var68: Int;
      if (this.giftCodes == null) {
         var68 = 0;
      } else {
         var68 = this.giftCodes.hashCode();
      }

      val var69: Int;
      if (this.referralTrialOffer == null) {
         var69 = 0;
      } else {
         var69 = this.referralTrialOffer.hashCode();
      }

      val var70: Int;
      if (this.totalMonthsSubscribed == null) {
         var70 = 0;
      } else {
         var70 = this.totalMonthsSubscribed.hashCode();
      }

      val var71: Int;
      if (this.postPreviewEmbeds == null) {
         var71 = 0;
      } else {
         var71 = this.postPreviewEmbeds.hashCode();
      }

      val var72: Int;
      if (this.channelPromptData == null) {
         var72 = 0;
      } else {
         var72 = this.channelPromptData.hashCode();
      }

      val var73: Int;
      if (this.safetyPolicyNoticeEmbed == null) {
         var73 = 0;
      } else {
         var73 = this.safetyPolicyNoticeEmbed.hashCode();
      }

      val var74: Int;
      if (this.safetySystemNotificationEmbed == null) {
         var74 = 0;
      } else {
         var74 = this.safetySystemNotificationEmbed.hashCode();
      }

      val var75: Int;
      if (this.pollData == null) {
         var75 = 0;
      } else {
         var75 = this.pollData.hashCode();
      }

      val var76: Int;
      if (this.sharedClientTheme == null) {
         var76 = 0;
      } else {
         var76 = this.sharedClientTheme.hashCode();
      }

      val var77: Int;
      if (this.ctaButton == null) {
         var77 = 0;
      } else {
         var77 = this.ctaButton.hashCode();
      }

      val var78: Int;
      if (this.audioAttachmentBackgroundColor == null) {
         var78 = 0;
      } else {
         var78 = this.audioAttachmentBackgroundColor.hashCode();
      }

      val var79: Int;
      if (this.forwardInfo == null) {
         var79 = 0;
      } else {
         var79 = this.forwardInfo.hashCode();
      }

      val var80: Int;
      if (this.showInlineForwardButton == null) {
         var80 = 0;
      } else {
         var80 = this.showInlineForwardButton.hashCode();
      }

      val var81: Int;
      if (this.clanTagGuildId == null) {
         var81 = 0;
      } else {
         var81 = GuildId.hashCode-impl(this.clanTagGuildId.unbox-impl());
      }

      val var82: Int;
      if (this.clanTag == null) {
         var82 = 0;
      } else {
         var82 = this.clanTag.hashCode();
      }

      val var83: Int;
      if (this.clanBadgeUrl == null) {
         var83 = 0;
      } else {
         var83 = this.clanBadgeUrl.hashCode();
      }

      if (this.gameApplicationId != null) {
         var84 = this.gameApplicationId.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        (
                                                                                                                                                                                 (
                                                                                                                                                                                          (
                                                                                                                                                                                                   (
                                                                                                                                                                                                            (
                                                                                                                                                                                                                     (
                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                    (
                                                                                                                                                                                                                                                                                             (
                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                          (
                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                            (
                                                                                                                                                                                                                                                                                                                                                                     (
                                                                                                                                                                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                                                                                                                                                                    (
                                                                                                                                                                                                                                                                                                                                                                                                                                             (
                                                                                                                                                                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         var86
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            + var85
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + var1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          + var87
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + var2
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        + var3
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + var4
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      + var88
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + var5
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    + var6
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + var7
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  + var8
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + var9
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                + var10
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + var11
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              + var12
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + var13
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            + var14
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + var15
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          + var90
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + var89
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        + var16
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + var17
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      + var18
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + var19
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    + var20
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + var21
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  + var22
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + var23
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                + var24
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + var25
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              + var26
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     + var27
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            + var28
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   + var29
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          + var91
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 + var30
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        + var31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + var32
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      + var33
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             + var34
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    + var35
                                                                                                                                                                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           + var36
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  + var37
                                                                                                                                                                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                         + var38
                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                + var39
                                                                                                                                                                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                       + var40
                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                                                                                                                                                                              + var41
                                                                                                                                                                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                                                                                                                                                                     + var42
                                                                                                                                                                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                                                                                                                                                                            + var43
                                                                                                                                                                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                                                                                                                                                                   + var44
                                                                                                                                                                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                                                                                                                                                                          + var45
                                                                                                                                                                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                                                                                                                                                                 + var46
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                        + var47
                                                                                                                                                                                                                                                                                                                                                                  )
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var48
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var49
                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                             + var50
                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var51
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var52
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var53
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var54
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var55
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var56
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var57
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var58
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var59
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var60
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var61
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var62
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + var63
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + var64
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var92
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var65
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var66
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var67
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var68
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var69
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var70
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var71
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var72
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var73
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var74
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var75
                                                                                             )
                                                                                             * 31
                                                                                          + var76
                                                                                    )
                                                                                    * 31
                                                                                 + var77
                                                                           )
                                                                           * 31
                                                                        + var78
                                                                  )
                                                                  * 31
                                                               + var79
                                                         )
                                                         * 31
                                                      + var80
                                                )
                                                * 31
                                             + var81
                                       )
                                       * 31
                                    + var82
                              )
                              * 31
                           + var83
                     )
                     * 31
                  + var84
            )
            * 31
         + java.lang.Boolean.hashCode(this.isAnnouncementChannel);
   }

   public fun isComponentsV2(): Boolean {
      return MessageFlagKt.hasMessageFlag(this.flags, MessageFlag.IS_COMPONENTS_V2);
   }

   public fun isPollResult(): Boolean {
      val var1: Boolean;
      if (this.type === MessageType.POLL_RESULT) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun isVoiceMessage(): Boolean {
      return MessageFlagKt.hasMessageFlag(this.flags, MessageFlag.IS_VOICE_MESSAGE);
   }

   public override fun toString(): String {
      val var9: MessageType = this.type;
      val var10: java.lang.String = MessageId.toString-impl(this.id);
      val var96: java.lang.String;
      if (this.nonce == null) {
         var96 = "null";
      } else {
         var96 = MessageId.toString-impl(this.nonce);
      }

      val var93: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var61: GuildId = this.guildId;
      val var79: MessageState = this.state;
      val var52: UserId = this.authorId;
      val var6: Long = this.flags;
      val var72: java.lang.String = this.edited;
      val var47: Int = this.editedColor;
      val var32: java.lang.Float = this._constrainedWidth;
      val var43: Int = this.textColor;
      val var53: Int = this.linkColor;
      val var19: java.lang.String = this.timestamp;
      val var44: Int = this.timestampColor;
      val var78: java.lang.String = this.username;
      val var39: Int = this.usernameColor;
      val var33: Int = this.roleColor;
      val var22: RoleColors = this.roleColors;
      val var3: Boolean = this.shouldShowRoleDot;
      val var5: Boolean = this.shouldShowRoleOnName;
      val var58: Int = this.colorString;
      val var94: java.lang.String = this.avatarURL;
      val var16: java.lang.String = this.avatarDecorationURL;
      val var49: java.util.List = this.embeds;
      val var50: java.util.List = this.attachments;
      val var21: java.lang.Float = this.attachmentsOpacity;
      val var87: StructurableText = this.content;
      val var62: java.util.List = this.reactions;
      val var85: java.util.List = this.codedLinks;
      val var76: ActivityInstanceEmbed = this.activityInstanceEmbed;
      val var46: java.util.List = this.stickers;
      val var40: RoleIcon = this.roleIcon;
      val var57: ConnectionsRoleTag = this.connectionsRoleTag;
      val var67: ThreadEmbed = this.threadEmbed;
      val var2: Boolean = this.mentioned;
      val var14: java.lang.Boolean = this.gifAutoPlay;
      val var54: java.lang.Boolean = this.animateEmoji;
      val var66: java.lang.Boolean = this.showLinkDecorations;
      val var68: ReferencedMessage = this.referencedMessage;
      val var20: ExecutedCommand = this.executedCommand;
      val var74: java.util.List = this.components;
      val var89: java.lang.String = this.threadStarterMessageHeader;
      val var13: java.lang.Boolean = this.communicationDisabled;
      val var24: java.lang.String = this.tagText;
      val var80: java.lang.Boolean = this.tagVerified;
      val var59: Int = this.tagTextColor;
      val var31: Int = this.tagBackgroundColor;
      val var11: java.lang.String = this.tagType;
      val var95: java.lang.String = this.tagIconUrl;
      val var23: java.lang.String = this.opTagText;
      val var18: EphemeralIndication = this.ephemeralIndication;
      val var51: SurveyIndication = this.surveyIndication;
      val var25: InteractionStatus = this.interactionStatus;
      val var36: java.lang.Boolean = this.useAttachmentGridLayout;
      val var90: java.lang.Boolean = this.useAttachmentUploadPreview;
      val var73: java.lang.Boolean = this.isCurrentUserMessageAuthor;
      val var28: java.lang.String = this.obscureLearnMoreLabel;
      val var82: java.lang.Boolean = this.usingGradientTheme;
      val var81: java.lang.String = this.title;
      val var75: java.lang.String = this.description;
      val var88: java.util.List = this.avatarURLs;
      val var86: java.lang.Boolean = this.isCallActive;
      val var56: java.lang.Boolean = this.missed;
      val var15: java.lang.Long = this.rawMilliseconds;
      val var27: Sticker = this.sticker;
      val var92: java.lang.String = this.stickerLabel;
      val var12: java.lang.String = this.buttonLabel;
      val var34: java.lang.Boolean = this.showInviteToSpeakButton;
      val var55: ActivityInviteEmbed = this.activityInviteEmbed;
      val var65: ActivityRichPresenceInviteEmbed = this.activityRichPresenceInviteEmbed;
      val var4: Boolean = this.isFirstForumPostMessage;
      val var91: ForumPostActions = this.postActions;
      val var69: AutoModerationContext = this.autoModerationContext;
      val var42: ReferralEmbed = this.referralTrialOfferInfo;
      val var70: java.util.List = this.giftCodes;
      val var35: GiftEmbed = this.referralTrialOffer;
      val var45: Int = this.totalMonthsSubscribed;
      val var26: java.util.List = this.postPreviewEmbeds;
      val var17: ChannelPromptData = this.channelPromptData;
      val var30: SafetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
      val var37: SafetySystemNotificationEmbed = this.safetySystemNotificationEmbed;
      val var48: PollData = this.pollData;
      val var64: SharedCustomThemeData = this.sharedClientTheme;
      val var77: CtaButton = this.ctaButton;
      val var29: Int = this.audioAttachmentBackgroundColor;
      val var60: ForwardInfo = this.forwardInfo;
      val var71: java.lang.Boolean = this.showInlineForwardButton;
      val var84: GuildId = this.clanTagGuildId;
      val var38: java.lang.String = this.clanTag;
      val var63: java.lang.String = this.clanBadgeUrl;
      val var83: java.lang.String = this.gameApplicationId;
      val var1: Boolean = this.isAnnouncementChannel;
      val var41: StringBuilder = new StringBuilder();
      var41.append("Message(type=");
      var41.append(var9);
      var41.append(", id=");
      var41.append(var10);
      var41.append(", nonce=");
      var41.append(var96);
      var41.append(", channelId=");
      var41.append(var93);
      var41.append(", guildId=");
      var41.append(var61);
      var41.append(", state=");
      var41.append(var79);
      var41.append(", authorId=");
      var41.append(var52);
      var41.append(", flags=");
      var41.append(var6);
      var41.append(", edited=");
      var41.append(var72);
      var41.append(", editedColor=");
      var41.append(var47);
      var41.append(", _constrainedWidth=");
      var41.append(var32);
      var41.append(", textColor=");
      var41.append(var43);
      var41.append(", linkColor=");
      var41.append(var53);
      var41.append(", timestamp=");
      var41.append(var19);
      var41.append(", timestampColor=");
      var41.append(var44);
      var41.append(", username=");
      var41.append(var78);
      var41.append(", usernameColor=");
      var41.append(var39);
      var41.append(", roleColor=");
      var41.append(var33);
      var41.append(", roleColors=");
      var41.append(var22);
      var41.append(", shouldShowRoleDot=");
      var41.append(var3);
      var41.append(", shouldShowRoleOnName=");
      var41.append(var5);
      var41.append(", colorString=");
      var41.append(var58);
      var41.append(", avatarURL=");
      var41.append(var94);
      var41.append(", avatarDecorationURL=");
      var41.append(var16);
      var41.append(", embeds=");
      var41.append(var49);
      var41.append(", attachments=");
      var41.append(var50);
      var41.append(", attachmentsOpacity=");
      var41.append(var21);
      var41.append(", content=");
      var41.append(var87);
      var41.append(", reactions=");
      var41.append(var62);
      var41.append(", codedLinks=");
      var41.append(var85);
      var41.append(", activityInstanceEmbed=");
      var41.append(var76);
      var41.append(", stickers=");
      var41.append(var46);
      var41.append(", roleIcon=");
      var41.append(var40);
      var41.append(", connectionsRoleTag=");
      var41.append(var57);
      var41.append(", threadEmbed=");
      var41.append(var67);
      var41.append(", mentioned=");
      var41.append(var2);
      var41.append(", gifAutoPlay=");
      var41.append(var14);
      var41.append(", animateEmoji=");
      var41.append(var54);
      var41.append(", showLinkDecorations=");
      var41.append(var66);
      var41.append(", referencedMessage=");
      var41.append(var68);
      var41.append(", executedCommand=");
      var41.append(var20);
      var41.append(", components=");
      var41.append(var74);
      var41.append(", threadStarterMessageHeader=");
      var41.append(var89);
      var41.append(", communicationDisabled=");
      var41.append(var13);
      var41.append(", tagText=");
      var41.append(var24);
      var41.append(", tagVerified=");
      var41.append(var80);
      var41.append(", tagTextColor=");
      var41.append(var59);
      var41.append(", tagBackgroundColor=");
      var41.append(var31);
      var41.append(", tagType=");
      var41.append(var11);
      var41.append(", tagIconUrl=");
      var41.append(var95);
      var41.append(", opTagText=");
      var41.append(var23);
      var41.append(", ephemeralIndication=");
      var41.append(var18);
      var41.append(", surveyIndication=");
      var41.append(var51);
      var41.append(", interactionStatus=");
      var41.append(var25);
      var41.append(", useAttachmentGridLayout=");
      var41.append(var36);
      var41.append(", useAttachmentUploadPreview=");
      var41.append(var90);
      var41.append(", isCurrentUserMessageAuthor=");
      var41.append(var73);
      var41.append(", obscureLearnMoreLabel=");
      var41.append(var28);
      var41.append(", usingGradientTheme=");
      var41.append(var82);
      var41.append(", title=");
      var41.append(var81);
      var41.append(", description=");
      var41.append(var75);
      var41.append(", avatarURLs=");
      var41.append(var88);
      var41.append(", isCallActive=");
      var41.append(var86);
      var41.append(", missed=");
      var41.append(var56);
      var41.append(", rawMilliseconds=");
      var41.append(var15);
      var41.append(", sticker=");
      var41.append(var27);
      var41.append(", stickerLabel=");
      var41.append(var92);
      var41.append(", buttonLabel=");
      var41.append(var12);
      var41.append(", showInviteToSpeakButton=");
      var41.append(var34);
      var41.append(", activityInviteEmbed=");
      var41.append(var55);
      var41.append(", activityRichPresenceInviteEmbed=");
      var41.append(var65);
      var41.append(", isFirstForumPostMessage=");
      var41.append(var4);
      var41.append(", postActions=");
      var41.append(var91);
      var41.append(", autoModerationContext=");
      var41.append(var69);
      var41.append(", referralTrialOfferInfo=");
      var41.append(var42);
      var41.append(", giftCodes=");
      var41.append(var70);
      var41.append(", referralTrialOffer=");
      var41.append(var35);
      var41.append(", totalMonthsSubscribed=");
      var41.append(var45);
      var41.append(", postPreviewEmbeds=");
      var41.append(var26);
      var41.append(", channelPromptData=");
      var41.append(var17);
      var41.append(", safetyPolicyNoticeEmbed=");
      var41.append(var30);
      var41.append(", safetySystemNotificationEmbed=");
      var41.append(var37);
      var41.append(", pollData=");
      var41.append(var48);
      var41.append(", sharedClientTheme=");
      var41.append(var64);
      var41.append(", ctaButton=");
      var41.append(var77);
      var41.append(", audioAttachmentBackgroundColor=");
      var41.append(var29);
      var41.append(", forwardInfo=");
      var41.append(var60);
      var41.append(", showInlineForwardButton=");
      var41.append(var71);
      var41.append(", clanTagGuildId=");
      var41.append(var84);
      var41.append(", clanTag=");
      var41.append(var38);
      var41.append(", clanBadgeUrl=");
      var41.append(var63);
      var41.append(", gameApplicationId=");
      var41.append(var83);
      var41.append(", isAnnouncementChannel=");
      var41.append(var1);
      var41.append(")");
      return var41.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Message> {
         return Message.$serializer.INSTANCE;
      }
   }
}
