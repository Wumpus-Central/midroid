package com.discord.chat.bridge

import Ka.f
import R8.j
import a1.b
import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.channelprompt.ChannelPromptData
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag
import com.discord.chat.bridge.ctabutton.CtaButton
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
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.logging.PII
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
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
   progress: List<UploadProgress>? = ...,
   reactions: List<MessageReaction>? = ...,
   useAddBurstReaction: Boolean? = ...,
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
   ctaButton: CtaButton? = ...,
   voiceChannelInviteEmbed: VoiceInviteEmbed? = ...,
   audioAttachmentBackgroundColor: Int? = ...,
   forwardInfo: ForwardInfo? = ...,
   showInlineForwardButton: Boolean? = ...,
   clanTagGuildId: GuildId? = ...,
   clanTag: String? = ...,
   clanBadgeUrl: String? = ...,
   gameApplicationId: String? = ...,
   showReactionShortcut: Boolean = ...,
   showReplyShortcut: Boolean = ...,
   showForwardShortcut: Boolean = ...,
   showThreadShortcut: Boolean = ...,
   isAnnouncementChannel: Boolean = ...,
   shortcutsEnabled: Boolean = ...
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
      var95,
      var96,
      var97,
      var98,
      var99,
      var100,
      var101
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

   public final val progress: List<UploadProgress>?
   public final val reactions: List<MessageReaction>?
   public final val useAddBurstReaction: Boolean?
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
   public final val ctaButton: CtaButton?
   public final val voiceChannelInviteEmbed: VoiceInviteEmbed?
   public final val audioAttachmentBackgroundColor: Int?
   public final val forwardInfo: ForwardInfo?
   public final val showInlineForwardButton: Boolean?
   public final val clanTagGuildId: GuildId?
   public final val clanTag: String?
   public final val clanBadgeUrl: String?
   public final val gameApplicationId: String?
   public final val showReactionShortcut: Boolean
   public final val showReplyShortcut: Boolean
   public final val showForwardShortcut: Boolean
   public final val showThreadShortcut: Boolean
   public final val isAnnouncementChannel: Boolean
   public final val shortcutsEnabled: Boolean

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
      var31: MutableList<UploadProgress>,
      var32: MutableList<MessageReaction>,
      var33: java.lang.Boolean,
      var34: MutableList<CodedLinkEmbed>,
      var35: ActivityInstanceEmbed,
      var36: MutableList<Sticker>,
      var37: RoleIcon,
      var38: ConnectionsRoleTag,
      var39: ThreadEmbed,
      var40: Boolean,
      var41: java.lang.Boolean,
      var42: java.lang.Boolean,
      var43: java.lang.Boolean,
      var44: ReferencedMessage,
      var45: ExecutedCommand,
      var46: MutableList<Component>,
      var47: java.lang.String,
      var48: java.lang.Boolean,
      var49: java.lang.String,
      var50: java.lang.Boolean,
      var51: Int,
      var52: Int,
      var53: java.lang.String,
      var54: java.lang.String,
      var55: java.lang.String,
      var56: EphemeralIndication,
      var57: SurveyIndication,
      var58: InteractionStatus,
      var59: java.lang.Boolean,
      var60: java.lang.Boolean,
      var61: java.lang.Boolean,
      var62: java.lang.String,
      var63: java.lang.Boolean,
      var64: java.lang.String,
      var65: java.lang.String,
      var66: MutableList<java.lang.String>,
      var67: java.lang.Boolean,
      var68: java.lang.Boolean,
      var69: java.lang.Long,
      var70: Sticker,
      var71: java.lang.String,
      var72: java.lang.String,
      var73: java.lang.Boolean,
      var74: ActivityInviteEmbed,
      var75: Boolean,
      var76: ForumPostActions,
      var77: AutoModerationContext,
      var78: ReferralEmbed,
      var79: MutableList<GiftEmbed>,
      var80: GiftEmbed,
      var81: Int,
      var82: MutableList<PostPreviewEmbed>,
      var83: ChannelPromptData,
      var84: SafetyPolicyNoticeEmbed,
      var85: SafetySystemNotificationEmbed,
      var86: PollData,
      var87: CtaButton,
      var88: VoiceInviteEmbed,
      var89: Int,
      var90: ForwardInfo,
      var91: java.lang.Boolean,
      var92: GuildId,
      var93: java.lang.String,
      var94: java.lang.String,
      var95: java.lang.String,
      var96: Boolean,
      var97: Boolean,
      var98: Boolean,
      var99: Boolean,
      var100: Boolean,
      var101: Boolean
   ) {
      q.h(var1, "type");
      q.h(var2, "id");
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
      this.progress = var31;
      this.reactions = var32;
      this.useAddBurstReaction = var33;
      this.codedLinks = var34;
      this.activityInstanceEmbed = var35;
      this.stickers = var36;
      this.roleIcon = var37;
      this.connectionsRoleTag = var38;
      this.threadEmbed = var39;
      this.mentioned = var40;
      this.gifAutoPlay = var41;
      this.animateEmoji = var42;
      this.showLinkDecorations = var43;
      this.referencedMessage = var44;
      this.executedCommand = var45;
      this.components = var46;
      this.threadStarterMessageHeader = var47;
      this.communicationDisabled = var48;
      this.tagText = var49;
      this.tagVerified = var50;
      this.tagTextColor = var51;
      this.tagBackgroundColor = var52;
      this.tagType = var53;
      this.tagIconUrl = var54;
      this.opTagText = var55;
      this.ephemeralIndication = var56;
      this.surveyIndication = var57;
      this.interactionStatus = var58;
      this.useAttachmentGridLayout = var59;
      this.useAttachmentUploadPreview = var60;
      this.isCurrentUserMessageAuthor = var61;
      this.obscureLearnMoreLabel = var62;
      this.usingGradientTheme = var63;
      this.title = var64;
      this.description = var65;
      this.avatarURLs = var66;
      this.isCallActive = var67;
      this.missed = var68;
      this.rawMilliseconds = var69;
      this.sticker = var70;
      this.stickerLabel = var71;
      this.buttonLabel = var72;
      this.showInviteToSpeakButton = var73;
      this.activityInviteEmbed = var74;
      this.isFirstForumPostMessage = var75;
      this.postActions = var76;
      this.autoModerationContext = var77;
      this.referralTrialOfferInfo = var78;
      this.giftCodes = var79;
      this.referralTrialOffer = var80;
      this.totalMonthsSubscribed = var81;
      this.postPreviewEmbeds = var82;
      this.channelPromptData = var83;
      this.safetyPolicyNoticeEmbed = var84;
      this.safetySystemNotificationEmbed = var85;
      this.pollData = var86;
      this.ctaButton = var87;
      this.voiceChannelInviteEmbed = var88;
      this.audioAttachmentBackgroundColor = var89;
      this.forwardInfo = var90;
      this.showInlineForwardButton = var91;
      this.clanTagGuildId = var92;
      this.clanTag = var93;
      this.clanBadgeUrl = var94;
      this.gameApplicationId = var95;
      this.showReactionShortcut = var96;
      this.showReplyShortcut = var97;
      this.showForwardShortcut = var98;
      this.showThreadShortcut = var99;
      this.isAnnouncementChannel = var100;
      this.shortcutsEnabled = var101;
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

   public operator fun component29(): List<UploadProgress>? {
      return this.progress;
   }

   public operator fun component3(): MessageId? {
      return this.nonce;
   }

   public operator fun component30(): List<MessageReaction>? {
      return this.reactions;
   }

   public operator fun component31(): Boolean? {
      return this.useAddBurstReaction;
   }

   public operator fun component32(): List<CodedLinkEmbed?>? {
      return this.codedLinks;
   }

   public operator fun component33(): ActivityInstanceEmbed? {
      return this.activityInstanceEmbed;
   }

   public operator fun component34(): List<Sticker>? {
      return this.stickers;
   }

   public operator fun component35(): RoleIcon? {
      return this.roleIcon;
   }

   public operator fun component36(): ConnectionsRoleTag? {
      return this.connectionsRoleTag;
   }

   public operator fun component37(): ThreadEmbed? {
      return this.threadEmbed;
   }

   public operator fun component38(): Boolean {
      return this.mentioned;
   }

   public operator fun component39(): Boolean? {
      return this.gifAutoPlay;
   }

   public operator fun component4(): ChannelId {
      return this.channelId;
   }

   public operator fun component40(): Boolean? {
      return this.animateEmoji;
   }

   public operator fun component41(): Boolean? {
      return this.showLinkDecorations;
   }

   public operator fun component42(): ReferencedMessage? {
      return this.referencedMessage;
   }

   public operator fun component43(): ExecutedCommand? {
      return this.executedCommand;
   }

   public operator fun component44(): List<Component>? {
      return this.components;
   }

   public operator fun component45(): String? {
      return this.threadStarterMessageHeader;
   }

   public operator fun component46(): Boolean? {
      return this.communicationDisabled;
   }

   public operator fun component47(): String? {
      return this.tagText;
   }

   public operator fun component48(): Boolean? {
      return this.tagVerified;
   }

   public operator fun component49(): Int? {
      return this.tagTextColor;
   }

   public operator fun component5(): GuildId? {
      return this.guildId;
   }

   public operator fun component50(): Int? {
      return this.tagBackgroundColor;
   }

   public operator fun component51(): String? {
      return this.tagType;
   }

   public operator fun component52(): String? {
      return this.tagIconUrl;
   }

   public operator fun component53(): String? {
      return this.opTagText;
   }

   public operator fun component54(): EphemeralIndication? {
      return this.ephemeralIndication;
   }

   public operator fun component55(): SurveyIndication? {
      return this.surveyIndication;
   }

   public operator fun component56(): InteractionStatus? {
      return this.interactionStatus;
   }

   public operator fun component57(): Boolean? {
      return this.useAttachmentGridLayout;
   }

   public operator fun component58(): Boolean? {
      return this.useAttachmentUploadPreview;
   }

   public operator fun component59(): Boolean? {
      return this.isCurrentUserMessageAuthor;
   }

   public operator fun component6(): MessageState? {
      return this.state;
   }

   public operator fun component60(): String? {
      return this.obscureLearnMoreLabel;
   }

   public operator fun component61(): Boolean? {
      return this.usingGradientTheme;
   }

   public operator fun component62(): String? {
      return this.title;
   }

   public operator fun component63(): String? {
      return this.description;
   }

   public operator fun component64(): List<String>? {
      return this.avatarURLs;
   }

   public operator fun component65(): Boolean? {
      return this.isCallActive;
   }

   public operator fun component66(): Boolean? {
      return this.missed;
   }

   public operator fun component67(): Long? {
      return this.rawMilliseconds;
   }

   public operator fun component68(): Sticker? {
      return this.sticker;
   }

   public operator fun component69(): String? {
      return this.stickerLabel;
   }

   public operator fun component7(): UserId? {
      return this.authorId;
   }

   public operator fun component70(): String? {
      return this.buttonLabel;
   }

   public operator fun component71(): Boolean? {
      return this.showInviteToSpeakButton;
   }

   public operator fun component72(): ActivityInviteEmbed? {
      return this.activityInviteEmbed;
   }

   public operator fun component73(): Boolean {
      return this.isFirstForumPostMessage;
   }

   public operator fun component74(): ForumPostActions? {
      return this.postActions;
   }

   public operator fun component75(): AutoModerationContext? {
      return this.autoModerationContext;
   }

   public operator fun component76(): ReferralEmbed? {
      return this.referralTrialOfferInfo;
   }

   public operator fun component77(): List<GiftEmbed>? {
      return this.giftCodes;
   }

   public operator fun component78(): GiftEmbed? {
      return this.referralTrialOffer;
   }

   public operator fun component79(): Int? {
      return this.totalMonthsSubscribed;
   }

   public operator fun component8(): Long {
      return this.flags;
   }

   public operator fun component80(): List<PostPreviewEmbed>? {
      return this.postPreviewEmbeds;
   }

   public operator fun component81(): ChannelPromptData? {
      return this.channelPromptData;
   }

   public operator fun component82(): SafetyPolicyNoticeEmbed? {
      return this.safetyPolicyNoticeEmbed;
   }

   public operator fun component83(): SafetySystemNotificationEmbed? {
      return this.safetySystemNotificationEmbed;
   }

   public operator fun component84(): PollData? {
      return this.pollData;
   }

   public operator fun component85(): CtaButton? {
      return this.ctaButton;
   }

   public operator fun component86(): VoiceInviteEmbed? {
      return this.voiceChannelInviteEmbed;
   }

   public operator fun component87(): Int? {
      return this.audioAttachmentBackgroundColor;
   }

   public operator fun component88(): ForwardInfo? {
      return this.forwardInfo;
   }

   public operator fun component89(): Boolean? {
      return this.showInlineForwardButton;
   }

   public operator fun component9(): String? {
      return this.edited;
   }

   public operator fun component90(): GuildId? {
      return this.clanTagGuildId;
   }

   public operator fun component91(): String? {
      return this.clanTag;
   }

   public operator fun component92(): String? {
      return this.clanBadgeUrl;
   }

   public operator fun component93(): String? {
      return this.gameApplicationId;
   }

   public operator fun component94(): Boolean {
      return this.showReactionShortcut;
   }

   public operator fun component95(): Boolean {
      return this.showReplyShortcut;
   }

   public operator fun component96(): Boolean {
      return this.showForwardShortcut;
   }

   public operator fun component97(): Boolean {
      return this.showThreadShortcut;
   }

   public operator fun component98(): Boolean {
      return this.isAnnouncementChannel;
   }

   public operator fun component99(): Boolean {
      return this.shortcutsEnabled;
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
      progress: List<UploadProgress>? = ...,
      reactions: List<MessageReaction>? = ...,
      useAddBurstReaction: Boolean? = ...,
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
      ctaButton: CtaButton? = ...,
      voiceChannelInviteEmbed: VoiceInviteEmbed? = ...,
      audioAttachmentBackgroundColor: Int? = ...,
      forwardInfo: ForwardInfo? = ...,
      showInlineForwardButton: Boolean? = ...,
      clanTagGuildId: GuildId? = ...,
      clanTag: String? = ...,
      clanBadgeUrl: String? = ...,
      gameApplicationId: String? = ...,
      showReactionShortcut: Boolean = ...,
      showReplyShortcut: Boolean = ...,
      showForwardShortcut: Boolean = ...,
      showThreadShortcut: Boolean = ...,
      isAnnouncementChannel: Boolean = ...,
      shortcutsEnabled: Boolean = ...
   ): Message {
      q.h(var1, "type");
      q.h(var2, "id");
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
         var96,
         var97,
         var98,
         var99,
         var100,
         var101,
         null
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Message) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else {
            var var2: Boolean;
            label414: {
               if (this.nonce == null) {
                  if (var1.nonce == null) {
                     var2 = true;
                     break label414;
                  }
               } else if (var1.nonce != null) {
                  var2 = MessageId.equals-impl0(this.nonce, var1.nonce);
                  break label414;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
               return false;
            } else if (!q.c(this.guildId, var1.guildId)) {
               return false;
            } else if (this.state != var1.state) {
               return false;
            } else if (!q.c(this.authorId, var1.authorId)) {
               return false;
            } else if (this.flags != var1.flags) {
               return false;
            } else if (!q.c(this.edited, var1.edited)) {
               return false;
            } else if (!q.c(this.editedColor, var1.editedColor)) {
               return false;
            } else if (!q.c(this._constrainedWidth, var1._constrainedWidth)) {
               return false;
            } else if (!q.c(this.textColor, var1.textColor)) {
               return false;
            } else if (!q.c(this.linkColor, var1.linkColor)) {
               return false;
            } else if (!q.c(this.timestamp, var1.timestamp)) {
               return false;
            } else if (!q.c(this.timestampColor, var1.timestampColor)) {
               return false;
            } else if (!q.c(this.username, var1.username)) {
               return false;
            } else if (!q.c(this.usernameColor, var1.usernameColor)) {
               return false;
            } else if (!q.c(this.roleColor, var1.roleColor)) {
               return false;
            } else if (!q.c(this.roleColors, var1.roleColors)) {
               return false;
            } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
               return false;
            } else if (this.shouldShowRoleOnName != var1.shouldShowRoleOnName) {
               return false;
            } else if (!q.c(this.colorString, var1.colorString)) {
               return false;
            } else if (!q.c(this.avatarURL, var1.avatarURL)) {
               return false;
            } else if (!q.c(this.avatarDecorationURL, var1.avatarDecorationURL)) {
               return false;
            } else if (!q.c(this.embeds, var1.embeds)) {
               return false;
            } else if (!q.c(this.attachments, var1.attachments)) {
               return false;
            } else if (!q.c(this.attachmentsOpacity, var1.attachmentsOpacity)) {
               return false;
            } else if (!q.c(this.content, var1.content)) {
               return false;
            } else if (!q.c(this.progress, var1.progress)) {
               return false;
            } else if (!q.c(this.reactions, var1.reactions)) {
               return false;
            } else if (!q.c(this.useAddBurstReaction, var1.useAddBurstReaction)) {
               return false;
            } else if (!q.c(this.codedLinks, var1.codedLinks)) {
               return false;
            } else if (!q.c(this.activityInstanceEmbed, var1.activityInstanceEmbed)) {
               return false;
            } else if (!q.c(this.stickers, var1.stickers)) {
               return false;
            } else if (!q.c(this.roleIcon, var1.roleIcon)) {
               return false;
            } else if (!q.c(this.connectionsRoleTag, var1.connectionsRoleTag)) {
               return false;
            } else if (!q.c(this.threadEmbed, var1.threadEmbed)) {
               return false;
            } else if (this.mentioned != var1.mentioned) {
               return false;
            } else if (!q.c(this.gifAutoPlay, var1.gifAutoPlay)) {
               return false;
            } else if (!q.c(this.animateEmoji, var1.animateEmoji)) {
               return false;
            } else if (!q.c(this.showLinkDecorations, var1.showLinkDecorations)) {
               return false;
            } else if (!q.c(this.referencedMessage, var1.referencedMessage)) {
               return false;
            } else if (!q.c(this.executedCommand, var1.executedCommand)) {
               return false;
            } else if (!q.c(this.components, var1.components)) {
               return false;
            } else if (!q.c(this.threadStarterMessageHeader, var1.threadStarterMessageHeader)) {
               return false;
            } else if (!q.c(this.communicationDisabled, var1.communicationDisabled)) {
               return false;
            } else if (!q.c(this.tagText, var1.tagText)) {
               return false;
            } else if (!q.c(this.tagVerified, var1.tagVerified)) {
               return false;
            } else if (!q.c(this.tagTextColor, var1.tagTextColor)) {
               return false;
            } else if (!q.c(this.tagBackgroundColor, var1.tagBackgroundColor)) {
               return false;
            } else if (!q.c(this.tagType, var1.tagType)) {
               return false;
            } else if (!q.c(this.tagIconUrl, var1.tagIconUrl)) {
               return false;
            } else if (!q.c(this.opTagText, var1.opTagText)) {
               return false;
            } else if (!q.c(this.ephemeralIndication, var1.ephemeralIndication)) {
               return false;
            } else if (!q.c(this.surveyIndication, var1.surveyIndication)) {
               return false;
            } else if (!q.c(this.interactionStatus, var1.interactionStatus)) {
               return false;
            } else if (!q.c(this.useAttachmentGridLayout, var1.useAttachmentGridLayout)) {
               return false;
            } else if (!q.c(this.useAttachmentUploadPreview, var1.useAttachmentUploadPreview)) {
               return false;
            } else if (!q.c(this.isCurrentUserMessageAuthor, var1.isCurrentUserMessageAuthor)) {
               return false;
            } else if (!q.c(this.obscureLearnMoreLabel, var1.obscureLearnMoreLabel)) {
               return false;
            } else if (!q.c(this.usingGradientTheme, var1.usingGradientTheme)) {
               return false;
            } else if (!q.c(this.title, var1.title)) {
               return false;
            } else if (!q.c(this.description, var1.description)) {
               return false;
            } else if (!q.c(this.avatarURLs, var1.avatarURLs)) {
               return false;
            } else if (!q.c(this.isCallActive, var1.isCallActive)) {
               return false;
            } else if (!q.c(this.missed, var1.missed)) {
               return false;
            } else if (!q.c(this.rawMilliseconds, var1.rawMilliseconds)) {
               return false;
            } else if (!q.c(this.sticker, var1.sticker)) {
               return false;
            } else if (!q.c(this.stickerLabel, var1.stickerLabel)) {
               return false;
            } else if (!q.c(this.buttonLabel, var1.buttonLabel)) {
               return false;
            } else if (!q.c(this.showInviteToSpeakButton, var1.showInviteToSpeakButton)) {
               return false;
            } else if (!q.c(this.activityInviteEmbed, var1.activityInviteEmbed)) {
               return false;
            } else if (this.isFirstForumPostMessage != var1.isFirstForumPostMessage) {
               return false;
            } else if (!q.c(this.postActions, var1.postActions)) {
               return false;
            } else if (!q.c(this.autoModerationContext, var1.autoModerationContext)) {
               return false;
            } else if (!q.c(this.referralTrialOfferInfo, var1.referralTrialOfferInfo)) {
               return false;
            } else if (!q.c(this.giftCodes, var1.giftCodes)) {
               return false;
            } else if (!q.c(this.referralTrialOffer, var1.referralTrialOffer)) {
               return false;
            } else if (!q.c(this.totalMonthsSubscribed, var1.totalMonthsSubscribed)) {
               return false;
            } else if (!q.c(this.postPreviewEmbeds, var1.postPreviewEmbeds)) {
               return false;
            } else if (!q.c(this.channelPromptData, var1.channelPromptData)) {
               return false;
            } else if (!q.c(this.safetyPolicyNoticeEmbed, var1.safetyPolicyNoticeEmbed)) {
               return false;
            } else if (!q.c(this.safetySystemNotificationEmbed, var1.safetySystemNotificationEmbed)) {
               return false;
            } else if (!q.c(this.pollData, var1.pollData)) {
               return false;
            } else if (!q.c(this.ctaButton, var1.ctaButton)) {
               return false;
            } else if (!q.c(this.voiceChannelInviteEmbed, var1.voiceChannelInviteEmbed)) {
               return false;
            } else if (!q.c(this.audioAttachmentBackgroundColor, var1.audioAttachmentBackgroundColor)) {
               return false;
            } else if (!q.c(this.forwardInfo, var1.forwardInfo)) {
               return false;
            } else if (!q.c(this.showInlineForwardButton, var1.showInlineForwardButton)) {
               return false;
            } else if (!q.c(this.clanTagGuildId, var1.clanTagGuildId)) {
               return false;
            } else if (!q.c(this.clanTag, var1.clanTag)) {
               return false;
            } else if (!q.c(this.clanBadgeUrl, var1.clanBadgeUrl)) {
               return false;
            } else if (!q.c(this.gameApplicationId, var1.gameApplicationId)) {
               return false;
            } else if (this.showReactionShortcut != var1.showReactionShortcut) {
               return false;
            } else if (this.showReplyShortcut != var1.showReplyShortcut) {
               return false;
            } else if (this.showForwardShortcut != var1.showForwardShortcut) {
               return false;
            } else if (this.showThreadShortcut != var1.showThreadShortcut) {
               return false;
            } else if (this.isAnnouncementChannel != var1.isAnnouncementChannel) {
               return false;
            } else {
               return this.shortcutsEnabled == var1.shortcutsEnabled;
            }
         }
      }
   }

   public fun hasAttachments(): Boolean {
      var var1: Boolean = true;
      if ((this.attachments == null || !(this.attachments.isEmpty() xor true)) && (this.embeds == null || !(this.embeds.isEmpty() xor true))) {
         var1 = false;
      }

      return var1;
   }

   public override fun hashCode(): Int {
      val var86: Int = this.type.hashCode();
      val var87: Int = MessageId.hashCode-impl(this.id);
      var var85: Int = 0;
      val var1: Int;
      if (this.nonce == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.nonce);
      }

      val var88: Int = ChannelId.hashCode-impl(this.channelId);
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

      val var89: Int = java.lang.Long.hashCode(this.flags);
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

      val var91: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var90: Int = java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
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
      if (this.progress == null) {
         var23 = 0;
      } else {
         var23 = this.progress.hashCode();
      }

      val var24: Int;
      if (this.reactions == null) {
         var24 = 0;
      } else {
         var24 = this.reactions.hashCode();
      }

      val var25: Int;
      if (this.useAddBurstReaction == null) {
         var25 = 0;
      } else {
         var25 = this.useAddBurstReaction.hashCode();
      }

      val var26: Int;
      if (this.codedLinks == null) {
         var26 = 0;
      } else {
         var26 = this.codedLinks.hashCode();
      }

      val var27: Int;
      if (this.activityInstanceEmbed == null) {
         var27 = 0;
      } else {
         var27 = this.activityInstanceEmbed.hashCode();
      }

      val var28: Int;
      if (this.stickers == null) {
         var28 = 0;
      } else {
         var28 = this.stickers.hashCode();
      }

      val var29: Int;
      if (this.roleIcon == null) {
         var29 = 0;
      } else {
         var29 = this.roleIcon.hashCode();
      }

      val var30: Int;
      if (this.connectionsRoleTag == null) {
         var30 = 0;
      } else {
         var30 = this.connectionsRoleTag.hashCode();
      }

      val var31: Int;
      if (this.threadEmbed == null) {
         var31 = 0;
      } else {
         var31 = this.threadEmbed.hashCode();
      }

      val var92: Int = java.lang.Boolean.hashCode(this.mentioned);
      val var32: Int;
      if (this.gifAutoPlay == null) {
         var32 = 0;
      } else {
         var32 = this.gifAutoPlay.hashCode();
      }

      val var33: Int;
      if (this.animateEmoji == null) {
         var33 = 0;
      } else {
         var33 = this.animateEmoji.hashCode();
      }

      val var34: Int;
      if (this.showLinkDecorations == null) {
         var34 = 0;
      } else {
         var34 = this.showLinkDecorations.hashCode();
      }

      val var35: Int;
      if (this.referencedMessage == null) {
         var35 = 0;
      } else {
         var35 = this.referencedMessage.hashCode();
      }

      val var36: Int;
      if (this.executedCommand == null) {
         var36 = 0;
      } else {
         var36 = this.executedCommand.hashCode();
      }

      val var37: Int;
      if (this.components == null) {
         var37 = 0;
      } else {
         var37 = this.components.hashCode();
      }

      val var38: Int;
      if (this.threadStarterMessageHeader == null) {
         var38 = 0;
      } else {
         var38 = this.threadStarterMessageHeader.hashCode();
      }

      val var39: Int;
      if (this.communicationDisabled == null) {
         var39 = 0;
      } else {
         var39 = this.communicationDisabled.hashCode();
      }

      val var40: Int;
      if (this.tagText == null) {
         var40 = 0;
      } else {
         var40 = this.tagText.hashCode();
      }

      val var41: Int;
      if (this.tagVerified == null) {
         var41 = 0;
      } else {
         var41 = this.tagVerified.hashCode();
      }

      val var42: Int;
      if (this.tagTextColor == null) {
         var42 = 0;
      } else {
         var42 = this.tagTextColor.hashCode();
      }

      val var43: Int;
      if (this.tagBackgroundColor == null) {
         var43 = 0;
      } else {
         var43 = this.tagBackgroundColor.hashCode();
      }

      val var44: Int;
      if (this.tagType == null) {
         var44 = 0;
      } else {
         var44 = this.tagType.hashCode();
      }

      val var45: Int;
      if (this.tagIconUrl == null) {
         var45 = 0;
      } else {
         var45 = this.tagIconUrl.hashCode();
      }

      val var46: Int;
      if (this.opTagText == null) {
         var46 = 0;
      } else {
         var46 = this.opTagText.hashCode();
      }

      val var47: Int;
      if (this.ephemeralIndication == null) {
         var47 = 0;
      } else {
         var47 = this.ephemeralIndication.hashCode();
      }

      val var48: Int;
      if (this.surveyIndication == null) {
         var48 = 0;
      } else {
         var48 = this.surveyIndication.hashCode();
      }

      val var49: Int;
      if (this.interactionStatus == null) {
         var49 = 0;
      } else {
         var49 = this.interactionStatus.hashCode();
      }

      val var50: Int;
      if (this.useAttachmentGridLayout == null) {
         var50 = 0;
      } else {
         var50 = this.useAttachmentGridLayout.hashCode();
      }

      val var51: Int;
      if (this.useAttachmentUploadPreview == null) {
         var51 = 0;
      } else {
         var51 = this.useAttachmentUploadPreview.hashCode();
      }

      val var52: Int;
      if (this.isCurrentUserMessageAuthor == null) {
         var52 = 0;
      } else {
         var52 = this.isCurrentUserMessageAuthor.hashCode();
      }

      val var53: Int;
      if (this.obscureLearnMoreLabel == null) {
         var53 = 0;
      } else {
         var53 = this.obscureLearnMoreLabel.hashCode();
      }

      val var54: Int;
      if (this.usingGradientTheme == null) {
         var54 = 0;
      } else {
         var54 = this.usingGradientTheme.hashCode();
      }

      val var55: Int;
      if (this.title == null) {
         var55 = 0;
      } else {
         var55 = this.title.hashCode();
      }

      val var56: Int;
      if (this.description == null) {
         var56 = 0;
      } else {
         var56 = this.description.hashCode();
      }

      val var57: Int;
      if (this.avatarURLs == null) {
         var57 = 0;
      } else {
         var57 = this.avatarURLs.hashCode();
      }

      val var58: Int;
      if (this.isCallActive == null) {
         var58 = 0;
      } else {
         var58 = this.isCallActive.hashCode();
      }

      val var59: Int;
      if (this.missed == null) {
         var59 = 0;
      } else {
         var59 = this.missed.hashCode();
      }

      val var60: Int;
      if (this.rawMilliseconds == null) {
         var60 = 0;
      } else {
         var60 = this.rawMilliseconds.hashCode();
      }

      val var61: Int;
      if (this.sticker == null) {
         var61 = 0;
      } else {
         var61 = this.sticker.hashCode();
      }

      val var62: Int;
      if (this.stickerLabel == null) {
         var62 = 0;
      } else {
         var62 = this.stickerLabel.hashCode();
      }

      val var63: Int;
      if (this.buttonLabel == null) {
         var63 = 0;
      } else {
         var63 = this.buttonLabel.hashCode();
      }

      val var64: Int;
      if (this.showInviteToSpeakButton == null) {
         var64 = 0;
      } else {
         var64 = this.showInviteToSpeakButton.hashCode();
      }

      val var65: Int;
      if (this.activityInviteEmbed == null) {
         var65 = 0;
      } else {
         var65 = this.activityInviteEmbed.hashCode();
      }

      val var93: Int = java.lang.Boolean.hashCode(this.isFirstForumPostMessage);
      val var66: Int;
      if (this.postActions == null) {
         var66 = 0;
      } else {
         var66 = this.postActions.hashCode();
      }

      val var67: Int;
      if (this.autoModerationContext == null) {
         var67 = 0;
      } else {
         var67 = this.autoModerationContext.hashCode();
      }

      val var68: Int;
      if (this.referralTrialOfferInfo == null) {
         var68 = 0;
      } else {
         var68 = this.referralTrialOfferInfo.hashCode();
      }

      val var69: Int;
      if (this.giftCodes == null) {
         var69 = 0;
      } else {
         var69 = this.giftCodes.hashCode();
      }

      val var70: Int;
      if (this.referralTrialOffer == null) {
         var70 = 0;
      } else {
         var70 = this.referralTrialOffer.hashCode();
      }

      val var71: Int;
      if (this.totalMonthsSubscribed == null) {
         var71 = 0;
      } else {
         var71 = this.totalMonthsSubscribed.hashCode();
      }

      val var72: Int;
      if (this.postPreviewEmbeds == null) {
         var72 = 0;
      } else {
         var72 = this.postPreviewEmbeds.hashCode();
      }

      val var73: Int;
      if (this.channelPromptData == null) {
         var73 = 0;
      } else {
         var73 = this.channelPromptData.hashCode();
      }

      val var74: Int;
      if (this.safetyPolicyNoticeEmbed == null) {
         var74 = 0;
      } else {
         var74 = this.safetyPolicyNoticeEmbed.hashCode();
      }

      val var75: Int;
      if (this.safetySystemNotificationEmbed == null) {
         var75 = 0;
      } else {
         var75 = this.safetySystemNotificationEmbed.hashCode();
      }

      val var76: Int;
      if (this.pollData == null) {
         var76 = 0;
      } else {
         var76 = this.pollData.hashCode();
      }

      val var77: Int;
      if (this.ctaButton == null) {
         var77 = 0;
      } else {
         var77 = this.ctaButton.hashCode();
      }

      val var78: Int;
      if (this.voiceChannelInviteEmbed == null) {
         var78 = 0;
      } else {
         var78 = this.voiceChannelInviteEmbed.hashCode();
      }

      val var79: Int;
      if (this.audioAttachmentBackgroundColor == null) {
         var79 = 0;
      } else {
         var79 = this.audioAttachmentBackgroundColor.hashCode();
      }

      val var80: Int;
      if (this.forwardInfo == null) {
         var80 = 0;
      } else {
         var80 = this.forwardInfo.hashCode();
      }

      val var81: Int;
      if (this.showInlineForwardButton == null) {
         var81 = 0;
      } else {
         var81 = this.showInlineForwardButton.hashCode();
      }

      val var82: Int;
      if (this.clanTagGuildId == null) {
         var82 = 0;
      } else {
         var82 = GuildId.hashCode-impl(this.clanTagGuildId.unbox-impl());
      }

      val var83: Int;
      if (this.clanTag == null) {
         var83 = 0;
      } else {
         var83 = this.clanTag.hashCode();
      }

      val var84: Int;
      if (this.clanBadgeUrl == null) {
         var84 = 0;
      } else {
         var84 = this.clanBadgeUrl.hashCode();
      }

      if (this.gameApplicationId != null) {
         var85 = this.gameApplicationId.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               var86
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  + var87
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         + var1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                + var88
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            + var89
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                + var91
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + var90
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                + var30
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + var31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              + var92
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
                                                                                                                                                                                                                                                            + var65
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var93
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
                                                               + var85
                                                         )
                                                         * 31
                                                      + java.lang.Boolean.hashCode(this.showReactionShortcut)
                                                )
                                                * 31
                                             + java.lang.Boolean.hashCode(this.showReplyShortcut)
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.showForwardShortcut)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.showThreadShortcut)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.isAnnouncementChannel)
            )
            * 31
         + java.lang.Boolean.hashCode(this.shortcutsEnabled);
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
      val var15: MessageType = this.type;
      val var14: java.lang.String = MessageId.toString-impl(this.id);
      val var102: java.lang.String;
      if (this.nonce == null) {
         var102 = "null";
      } else {
         var102 = MessageId.toString-impl(this.nonce);
      }

      val var70: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var52: GuildId = this.guildId;
      val var64: MessageState = this.state;
      val var19: UserId = this.authorId;
      val var11: Long = this.flags;
      val var40: java.lang.String = this.edited;
      val var35: Int = this.editedColor;
      val var85: java.lang.Float = this._constrainedWidth;
      val var61: Int = this.textColor;
      val var20: Int = this.linkColor;
      val var92: java.lang.String = this.timestamp;
      val var27: Int = this.timestampColor;
      val var69: java.lang.String = this.username;
      val var60: Int = this.usernameColor;
      val var58: Int = this.roleColor;
      val var86: RoleColors = this.roleColors;
      val var8: Boolean = this.shouldShowRoleDot;
      val var9: Boolean = this.shouldShowRoleOnName;
      val var95: Int = this.colorString;
      val var78: java.lang.String = this.avatarURL;
      val var90: java.lang.String = this.avatarDecorationURL;
      val var33: java.util.List = this.embeds;
      val var41: java.util.List = this.attachments;
      val var49: java.lang.Float = this.attachmentsOpacity;
      val var31: StructurableText = this.content;
      val var84: java.util.List = this.progress;
      val var26: java.util.List = this.reactions;
      val var39: java.lang.Boolean = this.useAddBurstReaction;
      val var28: java.util.List = this.codedLinks;
      val var46: ActivityInstanceEmbed = this.activityInstanceEmbed;
      val var59: java.util.List = this.stickers;
      val var47: RoleIcon = this.roleIcon;
      val var50: ConnectionsRoleTag = this.connectionsRoleTag;
      val var51: ThreadEmbed = this.threadEmbed;
      val var10: Boolean = this.mentioned;
      val var29: java.lang.Boolean = this.gifAutoPlay;
      val var83: java.lang.Boolean = this.animateEmoji;
      val var48: java.lang.Boolean = this.showLinkDecorations;
      val var21: ReferencedMessage = this.referencedMessage;
      val var75: ExecutedCommand = this.executedCommand;
      val var16: java.util.List = this.components;
      val var18: java.lang.String = this.threadStarterMessageHeader;
      val var45: java.lang.Boolean = this.communicationDisabled;
      val var68: java.lang.String = this.tagText;
      val var79: java.lang.Boolean = this.tagVerified;
      val var98: Int = this.tagTextColor;
      val var24: Int = this.tagBackgroundColor;
      val var74: java.lang.String = this.tagType;
      val var99: java.lang.String = this.tagIconUrl;
      val var22: java.lang.String = this.opTagText;
      val var67: EphemeralIndication = this.ephemeralIndication;
      val var82: SurveyIndication = this.surveyIndication;
      val var73: InteractionStatus = this.interactionStatus;
      val var62: java.lang.Boolean = this.useAttachmentGridLayout;
      val var32: java.lang.Boolean = this.useAttachmentUploadPreview;
      val var38: java.lang.Boolean = this.isCurrentUserMessageAuthor;
      val var23: java.lang.String = this.obscureLearnMoreLabel;
      val var96: java.lang.Boolean = this.usingGradientTheme;
      val var54: java.lang.String = this.title;
      val var57: java.lang.String = this.description;
      val var34: java.util.List = this.avatarURLs;
      val var44: java.lang.Boolean = this.isCallActive;
      val var65: java.lang.Boolean = this.missed;
      val var71: java.lang.Long = this.rawMilliseconds;
      val var25: Sticker = this.sticker;
      val var91: java.lang.String = this.stickerLabel;
      val var97: java.lang.String = this.buttonLabel;
      val var89: java.lang.Boolean = this.showInviteToSpeakButton;
      val var72: ActivityInviteEmbed = this.activityInviteEmbed;
      val var6: Boolean = this.isFirstForumPostMessage;
      val var17: ForumPostActions = this.postActions;
      val var81: AutoModerationContext = this.autoModerationContext;
      val var55: ReferralEmbed = this.referralTrialOfferInfo;
      val var63: java.util.List = this.giftCodes;
      val var101: GiftEmbed = this.referralTrialOffer;
      val var30: Int = this.totalMonthsSubscribed;
      val var77: java.util.List = this.postPreviewEmbeds;
      val var76: ChannelPromptData = this.channelPromptData;
      val var94: SafetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
      val var36: SafetySystemNotificationEmbed = this.safetySystemNotificationEmbed;
      val var93: PollData = this.pollData;
      val var100: CtaButton = this.ctaButton;
      val var42: VoiceInviteEmbed = this.voiceChannelInviteEmbed;
      val var87: Int = this.audioAttachmentBackgroundColor;
      val var88: ForwardInfo = this.forwardInfo;
      val var80: java.lang.Boolean = this.showInlineForwardButton;
      val var43: GuildId = this.clanTagGuildId;
      val var37: java.lang.String = this.clanTag;
      val var56: java.lang.String = this.clanBadgeUrl;
      val var53: java.lang.String = this.gameApplicationId;
      val var2: Boolean = this.showReactionShortcut;
      val var7: Boolean = this.showReplyShortcut;
      val var1: Boolean = this.showForwardShortcut;
      val var4: Boolean = this.showThreadShortcut;
      val var5: Boolean = this.isAnnouncementChannel;
      val var3: Boolean = this.shortcutsEnabled;
      val var66: StringBuilder = new StringBuilder();
      var66.append("Message(type=");
      var66.append(var15);
      var66.append(", id=");
      var66.append(var14);
      var66.append(", nonce=");
      var66.append(var102);
      var66.append(", channelId=");
      var66.append(var70);
      var66.append(", guildId=");
      var66.append(var52);
      var66.append(", state=");
      var66.append(var64);
      var66.append(", authorId=");
      var66.append(var19);
      var66.append(", flags=");
      var66.append(var11);
      var66.append(", edited=");
      var66.append(var40);
      var66.append(", editedColor=");
      var66.append(var35);
      var66.append(", _constrainedWidth=");
      var66.append(var85);
      var66.append(", textColor=");
      var66.append(var61);
      var66.append(", linkColor=");
      var66.append(var20);
      var66.append(", timestamp=");
      var66.append(var92);
      var66.append(", timestampColor=");
      var66.append(var27);
      var66.append(", username=");
      var66.append(var69);
      var66.append(", usernameColor=");
      var66.append(var60);
      var66.append(", roleColor=");
      var66.append(var58);
      var66.append(", roleColors=");
      var66.append(var86);
      var66.append(", shouldShowRoleDot=");
      var66.append(var8);
      var66.append(", shouldShowRoleOnName=");
      var66.append(var9);
      var66.append(", colorString=");
      var66.append(var95);
      var66.append(", avatarURL=");
      var66.append(var78);
      var66.append(", avatarDecorationURL=");
      var66.append(var90);
      var66.append(", embeds=");
      var66.append(var33);
      var66.append(", attachments=");
      var66.append(var41);
      var66.append(", attachmentsOpacity=");
      var66.append(var49);
      var66.append(", content=");
      var66.append(var31);
      var66.append(", progress=");
      var66.append(var84);
      var66.append(", reactions=");
      var66.append(var26);
      var66.append(", useAddBurstReaction=");
      var66.append(var39);
      var66.append(", codedLinks=");
      var66.append(var28);
      var66.append(", activityInstanceEmbed=");
      var66.append(var46);
      var66.append(", stickers=");
      var66.append(var59);
      var66.append(", roleIcon=");
      var66.append(var47);
      var66.append(", connectionsRoleTag=");
      var66.append(var50);
      var66.append(", threadEmbed=");
      var66.append(var51);
      var66.append(", mentioned=");
      var66.append(var10);
      var66.append(", gifAutoPlay=");
      var66.append(var29);
      var66.append(", animateEmoji=");
      var66.append(var83);
      var66.append(", showLinkDecorations=");
      var66.append(var48);
      var66.append(", referencedMessage=");
      var66.append(var21);
      var66.append(", executedCommand=");
      var66.append(var75);
      var66.append(", components=");
      var66.append(var16);
      var66.append(", threadStarterMessageHeader=");
      var66.append(var18);
      var66.append(", communicationDisabled=");
      var66.append(var45);
      var66.append(", tagText=");
      var66.append(var68);
      var66.append(", tagVerified=");
      var66.append(var79);
      var66.append(", tagTextColor=");
      var66.append(var98);
      var66.append(", tagBackgroundColor=");
      var66.append(var24);
      var66.append(", tagType=");
      var66.append(var74);
      var66.append(", tagIconUrl=");
      var66.append(var99);
      var66.append(", opTagText=");
      var66.append(var22);
      var66.append(", ephemeralIndication=");
      var66.append(var67);
      var66.append(", surveyIndication=");
      var66.append(var82);
      var66.append(", interactionStatus=");
      var66.append(var73);
      var66.append(", useAttachmentGridLayout=");
      var66.append(var62);
      var66.append(", useAttachmentUploadPreview=");
      var66.append(var32);
      var66.append(", isCurrentUserMessageAuthor=");
      var66.append(var38);
      var66.append(", obscureLearnMoreLabel=");
      var66.append(var23);
      var66.append(", usingGradientTheme=");
      var66.append(var96);
      var66.append(", title=");
      var66.append(var54);
      var66.append(", description=");
      var66.append(var57);
      var66.append(", avatarURLs=");
      var66.append(var34);
      var66.append(", isCallActive=");
      var66.append(var44);
      var66.append(", missed=");
      var66.append(var65);
      var66.append(", rawMilliseconds=");
      var66.append(var71);
      var66.append(", sticker=");
      var66.append(var25);
      var66.append(", stickerLabel=");
      var66.append(var91);
      var66.append(", buttonLabel=");
      var66.append(var97);
      var66.append(", showInviteToSpeakButton=");
      var66.append(var89);
      var66.append(", activityInviteEmbed=");
      var66.append(var72);
      var66.append(", isFirstForumPostMessage=");
      var66.append(var6);
      var66.append(", postActions=");
      var66.append(var17);
      var66.append(", autoModerationContext=");
      var66.append(var81);
      var66.append(", referralTrialOfferInfo=");
      var66.append(var55);
      var66.append(", giftCodes=");
      var66.append(var63);
      var66.append(", referralTrialOffer=");
      var66.append(var101);
      var66.append(", totalMonthsSubscribed=");
      var66.append(var30);
      var66.append(", postPreviewEmbeds=");
      var66.append(var77);
      var66.append(", channelPromptData=");
      var66.append(var76);
      var66.append(", safetyPolicyNoticeEmbed=");
      var66.append(var94);
      var66.append(", safetySystemNotificationEmbed=");
      var66.append(var36);
      var66.append(", pollData=");
      var66.append(var93);
      var66.append(", ctaButton=");
      var66.append(var100);
      var66.append(", voiceChannelInviteEmbed=");
      var66.append(var42);
      var66.append(", audioAttachmentBackgroundColor=");
      var66.append(var87);
      var66.append(", forwardInfo=");
      var66.append(var88);
      var66.append(", showInlineForwardButton=");
      var66.append(var80);
      var66.append(", clanTagGuildId=");
      var66.append(var43);
      var66.append(", clanTag=");
      var66.append(var37);
      var66.append(", clanBadgeUrl=");
      var66.append(var56);
      var66.append(", gameApplicationId=");
      var66.append(var53);
      var66.append(", showReactionShortcut=");
      var66.append(var2);
      var66.append(", showReplyShortcut=");
      var66.append(var7);
      var66.append(", showForwardShortcut=");
      var66.append(var1);
      var66.append(", showThreadShortcut=");
      var66.append(var4);
      var66.append(", isAnnouncementChannel=");
      var66.append(var5);
      var66.append(", shortcutsEnabled=");
      var66.append(var3);
      var66.append(")");
      return var66.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Message> {
         return Message.$serializer.INSTANCE;
      }
   }
}
