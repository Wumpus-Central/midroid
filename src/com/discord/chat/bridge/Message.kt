package com.discord.chat.bridge

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
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import o1.a
import sb.g
import z9.j

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
      var31: MutableList<MessageReaction>,
      var32: java.lang.Boolean,
      var33: MutableList<CodedLinkEmbed>,
      var34: ActivityInstanceEmbed,
      var35: MutableList<Sticker>,
      var36: RoleIcon,
      var37: ConnectionsRoleTag,
      var38: ThreadEmbed,
      var39: Boolean,
      var40: java.lang.Boolean,
      var41: java.lang.Boolean,
      var42: java.lang.Boolean,
      var43: ReferencedMessage,
      var44: ExecutedCommand,
      var45: MutableList<Component>,
      var46: java.lang.String,
      var47: java.lang.Boolean,
      var48: java.lang.String,
      var49: java.lang.Boolean,
      var50: Int,
      var51: Int,
      var52: java.lang.String,
      var53: java.lang.String,
      var54: java.lang.String,
      var55: EphemeralIndication,
      var56: SurveyIndication,
      var57: InteractionStatus,
      var58: java.lang.Boolean,
      var59: java.lang.Boolean,
      var60: java.lang.Boolean,
      var61: java.lang.String,
      var62: java.lang.Boolean,
      var63: java.lang.String,
      var64: java.lang.String,
      var65: MutableList<java.lang.String>,
      var66: java.lang.Boolean,
      var67: java.lang.Boolean,
      var68: java.lang.Long,
      var69: Sticker,
      var70: java.lang.String,
      var71: java.lang.String,
      var72: java.lang.Boolean,
      var73: ActivityInviteEmbed,
      var74: ActivityRichPresenceInviteEmbed,
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
      r.h(var1, "type");
      r.h(var2, "id");
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
      this.useAddBurstReaction = var32;
      this.codedLinks = var33;
      this.activityInstanceEmbed = var34;
      this.stickers = var35;
      this.roleIcon = var36;
      this.connectionsRoleTag = var37;
      this.threadEmbed = var38;
      this.mentioned = var39;
      this.gifAutoPlay = var40;
      this.animateEmoji = var41;
      this.showLinkDecorations = var42;
      this.referencedMessage = var43;
      this.executedCommand = var44;
      this.components = var45;
      this.threadStarterMessageHeader = var46;
      this.communicationDisabled = var47;
      this.tagText = var48;
      this.tagVerified = var49;
      this.tagTextColor = var50;
      this.tagBackgroundColor = var51;
      this.tagType = var52;
      this.tagIconUrl = var53;
      this.opTagText = var54;
      this.ephemeralIndication = var55;
      this.surveyIndication = var56;
      this.interactionStatus = var57;
      this.useAttachmentGridLayout = var58;
      this.useAttachmentUploadPreview = var59;
      this.isCurrentUserMessageAuthor = var60;
      this.obscureLearnMoreLabel = var61;
      this.usingGradientTheme = var62;
      this.title = var63;
      this.description = var64;
      this.avatarURLs = var65;
      this.isCallActive = var66;
      this.missed = var67;
      this.rawMilliseconds = var68;
      this.sticker = var69;
      this.stickerLabel = var70;
      this.buttonLabel = var71;
      this.showInviteToSpeakButton = var72;
      this.activityInviteEmbed = var73;
      this.activityRichPresenceInviteEmbed = var74;
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
      this.constrainedWidth$delegate = j.a(new a(this));
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

   public operator fun component30(): Boolean? {
      return this.useAddBurstReaction;
   }

   public operator fun component31(): List<CodedLinkEmbed?>? {
      return this.codedLinks;
   }

   public operator fun component32(): ActivityInstanceEmbed? {
      return this.activityInstanceEmbed;
   }

   public operator fun component33(): List<Sticker>? {
      return this.stickers;
   }

   public operator fun component34(): RoleIcon? {
      return this.roleIcon;
   }

   public operator fun component35(): ConnectionsRoleTag? {
      return this.connectionsRoleTag;
   }

   public operator fun component36(): ThreadEmbed? {
      return this.threadEmbed;
   }

   public operator fun component37(): Boolean {
      return this.mentioned;
   }

   public operator fun component38(): Boolean? {
      return this.gifAutoPlay;
   }

   public operator fun component39(): Boolean? {
      return this.animateEmoji;
   }

   public operator fun component4(): ChannelId {
      return this.channelId;
   }

   public operator fun component40(): Boolean? {
      return this.showLinkDecorations;
   }

   public operator fun component41(): ReferencedMessage? {
      return this.referencedMessage;
   }

   public operator fun component42(): ExecutedCommand? {
      return this.executedCommand;
   }

   public operator fun component43(): List<Component>? {
      return this.components;
   }

   public operator fun component44(): String? {
      return this.threadStarterMessageHeader;
   }

   public operator fun component45(): Boolean? {
      return this.communicationDisabled;
   }

   public operator fun component46(): String? {
      return this.tagText;
   }

   public operator fun component47(): Boolean? {
      return this.tagVerified;
   }

   public operator fun component48(): Int? {
      return this.tagTextColor;
   }

   public operator fun component49(): Int? {
      return this.tagBackgroundColor;
   }

   public operator fun component5(): GuildId? {
      return this.guildId;
   }

   public operator fun component50(): String? {
      return this.tagType;
   }

   public operator fun component51(): String? {
      return this.tagIconUrl;
   }

   public operator fun component52(): String? {
      return this.opTagText;
   }

   public operator fun component53(): EphemeralIndication? {
      return this.ephemeralIndication;
   }

   public operator fun component54(): SurveyIndication? {
      return this.surveyIndication;
   }

   public operator fun component55(): InteractionStatus? {
      return this.interactionStatus;
   }

   public operator fun component56(): Boolean? {
      return this.useAttachmentGridLayout;
   }

   public operator fun component57(): Boolean? {
      return this.useAttachmentUploadPreview;
   }

   public operator fun component58(): Boolean? {
      return this.isCurrentUserMessageAuthor;
   }

   public operator fun component59(): String? {
      return this.obscureLearnMoreLabel;
   }

   public operator fun component6(): MessageState? {
      return this.state;
   }

   public operator fun component60(): Boolean? {
      return this.usingGradientTheme;
   }

   public operator fun component61(): String? {
      return this.title;
   }

   public operator fun component62(): String? {
      return this.description;
   }

   public operator fun component63(): List<String>? {
      return this.avatarURLs;
   }

   public operator fun component64(): Boolean? {
      return this.isCallActive;
   }

   public operator fun component65(): Boolean? {
      return this.missed;
   }

   public operator fun component66(): Long? {
      return this.rawMilliseconds;
   }

   public operator fun component67(): Sticker? {
      return this.sticker;
   }

   public operator fun component68(): String? {
      return this.stickerLabel;
   }

   public operator fun component69(): String? {
      return this.buttonLabel;
   }

   public operator fun component7(): UserId? {
      return this.authorId;
   }

   public operator fun component70(): Boolean? {
      return this.showInviteToSpeakButton;
   }

   public operator fun component71(): ActivityInviteEmbed? {
      return this.activityInviteEmbed;
   }

   public operator fun component72(): ActivityRichPresenceInviteEmbed? {
      return this.activityRichPresenceInviteEmbed;
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
      r.h(var1, "type");
      r.h(var2, "id");
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
            } else if (!r.c(this.guildId, var1.guildId)) {
               return false;
            } else if (this.state != var1.state) {
               return false;
            } else if (!r.c(this.authorId, var1.authorId)) {
               return false;
            } else if (this.flags != var1.flags) {
               return false;
            } else if (!r.c(this.edited, var1.edited)) {
               return false;
            } else if (!r.c(this.editedColor, var1.editedColor)) {
               return false;
            } else if (!r.c(this._constrainedWidth, var1._constrainedWidth)) {
               return false;
            } else if (!r.c(this.textColor, var1.textColor)) {
               return false;
            } else if (!r.c(this.linkColor, var1.linkColor)) {
               return false;
            } else if (!r.c(this.timestamp, var1.timestamp)) {
               return false;
            } else if (!r.c(this.timestampColor, var1.timestampColor)) {
               return false;
            } else if (!r.c(this.username, var1.username)) {
               return false;
            } else if (!r.c(this.usernameColor, var1.usernameColor)) {
               return false;
            } else if (!r.c(this.roleColor, var1.roleColor)) {
               return false;
            } else if (!r.c(this.roleColors, var1.roleColors)) {
               return false;
            } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
               return false;
            } else if (this.shouldShowRoleOnName != var1.shouldShowRoleOnName) {
               return false;
            } else if (!r.c(this.colorString, var1.colorString)) {
               return false;
            } else if (!r.c(this.avatarURL, var1.avatarURL)) {
               return false;
            } else if (!r.c(this.avatarDecorationURL, var1.avatarDecorationURL)) {
               return false;
            } else if (!r.c(this.embeds, var1.embeds)) {
               return false;
            } else if (!r.c(this.attachments, var1.attachments)) {
               return false;
            } else if (!r.c(this.attachmentsOpacity, var1.attachmentsOpacity)) {
               return false;
            } else if (!r.c(this.content, var1.content)) {
               return false;
            } else if (!r.c(this.reactions, var1.reactions)) {
               return false;
            } else if (!r.c(this.useAddBurstReaction, var1.useAddBurstReaction)) {
               return false;
            } else if (!r.c(this.codedLinks, var1.codedLinks)) {
               return false;
            } else if (!r.c(this.activityInstanceEmbed, var1.activityInstanceEmbed)) {
               return false;
            } else if (!r.c(this.stickers, var1.stickers)) {
               return false;
            } else if (!r.c(this.roleIcon, var1.roleIcon)) {
               return false;
            } else if (!r.c(this.connectionsRoleTag, var1.connectionsRoleTag)) {
               return false;
            } else if (!r.c(this.threadEmbed, var1.threadEmbed)) {
               return false;
            } else if (this.mentioned != var1.mentioned) {
               return false;
            } else if (!r.c(this.gifAutoPlay, var1.gifAutoPlay)) {
               return false;
            } else if (!r.c(this.animateEmoji, var1.animateEmoji)) {
               return false;
            } else if (!r.c(this.showLinkDecorations, var1.showLinkDecorations)) {
               return false;
            } else if (!r.c(this.referencedMessage, var1.referencedMessage)) {
               return false;
            } else if (!r.c(this.executedCommand, var1.executedCommand)) {
               return false;
            } else if (!r.c(this.components, var1.components)) {
               return false;
            } else if (!r.c(this.threadStarterMessageHeader, var1.threadStarterMessageHeader)) {
               return false;
            } else if (!r.c(this.communicationDisabled, var1.communicationDisabled)) {
               return false;
            } else if (!r.c(this.tagText, var1.tagText)) {
               return false;
            } else if (!r.c(this.tagVerified, var1.tagVerified)) {
               return false;
            } else if (!r.c(this.tagTextColor, var1.tagTextColor)) {
               return false;
            } else if (!r.c(this.tagBackgroundColor, var1.tagBackgroundColor)) {
               return false;
            } else if (!r.c(this.tagType, var1.tagType)) {
               return false;
            } else if (!r.c(this.tagIconUrl, var1.tagIconUrl)) {
               return false;
            } else if (!r.c(this.opTagText, var1.opTagText)) {
               return false;
            } else if (!r.c(this.ephemeralIndication, var1.ephemeralIndication)) {
               return false;
            } else if (!r.c(this.surveyIndication, var1.surveyIndication)) {
               return false;
            } else if (!r.c(this.interactionStatus, var1.interactionStatus)) {
               return false;
            } else if (!r.c(this.useAttachmentGridLayout, var1.useAttachmentGridLayout)) {
               return false;
            } else if (!r.c(this.useAttachmentUploadPreview, var1.useAttachmentUploadPreview)) {
               return false;
            } else if (!r.c(this.isCurrentUserMessageAuthor, var1.isCurrentUserMessageAuthor)) {
               return false;
            } else if (!r.c(this.obscureLearnMoreLabel, var1.obscureLearnMoreLabel)) {
               return false;
            } else if (!r.c(this.usingGradientTheme, var1.usingGradientTheme)) {
               return false;
            } else if (!r.c(this.title, var1.title)) {
               return false;
            } else if (!r.c(this.description, var1.description)) {
               return false;
            } else if (!r.c(this.avatarURLs, var1.avatarURLs)) {
               return false;
            } else if (!r.c(this.isCallActive, var1.isCallActive)) {
               return false;
            } else if (!r.c(this.missed, var1.missed)) {
               return false;
            } else if (!r.c(this.rawMilliseconds, var1.rawMilliseconds)) {
               return false;
            } else if (!r.c(this.sticker, var1.sticker)) {
               return false;
            } else if (!r.c(this.stickerLabel, var1.stickerLabel)) {
               return false;
            } else if (!r.c(this.buttonLabel, var1.buttonLabel)) {
               return false;
            } else if (!r.c(this.showInviteToSpeakButton, var1.showInviteToSpeakButton)) {
               return false;
            } else if (!r.c(this.activityInviteEmbed, var1.activityInviteEmbed)) {
               return false;
            } else if (!r.c(this.activityRichPresenceInviteEmbed, var1.activityRichPresenceInviteEmbed)) {
               return false;
            } else if (this.isFirstForumPostMessage != var1.isFirstForumPostMessage) {
               return false;
            } else if (!r.c(this.postActions, var1.postActions)) {
               return false;
            } else if (!r.c(this.autoModerationContext, var1.autoModerationContext)) {
               return false;
            } else if (!r.c(this.referralTrialOfferInfo, var1.referralTrialOfferInfo)) {
               return false;
            } else if (!r.c(this.giftCodes, var1.giftCodes)) {
               return false;
            } else if (!r.c(this.referralTrialOffer, var1.referralTrialOffer)) {
               return false;
            } else if (!r.c(this.totalMonthsSubscribed, var1.totalMonthsSubscribed)) {
               return false;
            } else if (!r.c(this.postPreviewEmbeds, var1.postPreviewEmbeds)) {
               return false;
            } else if (!r.c(this.channelPromptData, var1.channelPromptData)) {
               return false;
            } else if (!r.c(this.safetyPolicyNoticeEmbed, var1.safetyPolicyNoticeEmbed)) {
               return false;
            } else if (!r.c(this.safetySystemNotificationEmbed, var1.safetySystemNotificationEmbed)) {
               return false;
            } else if (!r.c(this.pollData, var1.pollData)) {
               return false;
            } else if (!r.c(this.ctaButton, var1.ctaButton)) {
               return false;
            } else if (!r.c(this.voiceChannelInviteEmbed, var1.voiceChannelInviteEmbed)) {
               return false;
            } else if (!r.c(this.audioAttachmentBackgroundColor, var1.audioAttachmentBackgroundColor)) {
               return false;
            } else if (!r.c(this.forwardInfo, var1.forwardInfo)) {
               return false;
            } else if (!r.c(this.showInlineForwardButton, var1.showInlineForwardButton)) {
               return false;
            } else if (!r.c(this.clanTagGuildId, var1.clanTagGuildId)) {
               return false;
            } else if (!r.c(this.clanTag, var1.clanTag)) {
               return false;
            } else if (!r.c(this.clanBadgeUrl, var1.clanBadgeUrl)) {
               return false;
            } else if (!r.c(this.gameApplicationId, var1.gameApplicationId)) {
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
      val var87: Int = this.type.hashCode();
      val var86: Int = MessageId.hashCode-impl(this.id);
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
      if (this.reactions == null) {
         var23 = 0;
      } else {
         var23 = this.reactions.hashCode();
      }

      val var24: Int;
      if (this.useAddBurstReaction == null) {
         var24 = 0;
      } else {
         var24 = this.useAddBurstReaction.hashCode();
      }

      val var25: Int;
      if (this.codedLinks == null) {
         var25 = 0;
      } else {
         var25 = this.codedLinks.hashCode();
      }

      val var26: Int;
      if (this.activityInstanceEmbed == null) {
         var26 = 0;
      } else {
         var26 = this.activityInstanceEmbed.hashCode();
      }

      val var27: Int;
      if (this.stickers == null) {
         var27 = 0;
      } else {
         var27 = this.stickers.hashCode();
      }

      val var28: Int;
      if (this.roleIcon == null) {
         var28 = 0;
      } else {
         var28 = this.roleIcon.hashCode();
      }

      val var29: Int;
      if (this.connectionsRoleTag == null) {
         var29 = 0;
      } else {
         var29 = this.connectionsRoleTag.hashCode();
      }

      val var30: Int;
      if (this.threadEmbed == null) {
         var30 = 0;
      } else {
         var30 = this.threadEmbed.hashCode();
      }

      val var92: Int = java.lang.Boolean.hashCode(this.mentioned);
      val var31: Int;
      if (this.gifAutoPlay == null) {
         var31 = 0;
      } else {
         var31 = this.gifAutoPlay.hashCode();
      }

      val var32: Int;
      if (this.animateEmoji == null) {
         var32 = 0;
      } else {
         var32 = this.animateEmoji.hashCode();
      }

      val var33: Int;
      if (this.showLinkDecorations == null) {
         var33 = 0;
      } else {
         var33 = this.showLinkDecorations.hashCode();
      }

      val var34: Int;
      if (this.referencedMessage == null) {
         var34 = 0;
      } else {
         var34 = this.referencedMessage.hashCode();
      }

      val var35: Int;
      if (this.executedCommand == null) {
         var35 = 0;
      } else {
         var35 = this.executedCommand.hashCode();
      }

      val var36: Int;
      if (this.components == null) {
         var36 = 0;
      } else {
         var36 = this.components.hashCode();
      }

      val var37: Int;
      if (this.threadStarterMessageHeader == null) {
         var37 = 0;
      } else {
         var37 = this.threadStarterMessageHeader.hashCode();
      }

      val var38: Int;
      if (this.communicationDisabled == null) {
         var38 = 0;
      } else {
         var38 = this.communicationDisabled.hashCode();
      }

      val var39: Int;
      if (this.tagText == null) {
         var39 = 0;
      } else {
         var39 = this.tagText.hashCode();
      }

      val var40: Int;
      if (this.tagVerified == null) {
         var40 = 0;
      } else {
         var40 = this.tagVerified.hashCode();
      }

      val var41: Int;
      if (this.tagTextColor == null) {
         var41 = 0;
      } else {
         var41 = this.tagTextColor.hashCode();
      }

      val var42: Int;
      if (this.tagBackgroundColor == null) {
         var42 = 0;
      } else {
         var42 = this.tagBackgroundColor.hashCode();
      }

      val var43: Int;
      if (this.tagType == null) {
         var43 = 0;
      } else {
         var43 = this.tagType.hashCode();
      }

      val var44: Int;
      if (this.tagIconUrl == null) {
         var44 = 0;
      } else {
         var44 = this.tagIconUrl.hashCode();
      }

      val var45: Int;
      if (this.opTagText == null) {
         var45 = 0;
      } else {
         var45 = this.opTagText.hashCode();
      }

      val var46: Int;
      if (this.ephemeralIndication == null) {
         var46 = 0;
      } else {
         var46 = this.ephemeralIndication.hashCode();
      }

      val var47: Int;
      if (this.surveyIndication == null) {
         var47 = 0;
      } else {
         var47 = this.surveyIndication.hashCode();
      }

      val var48: Int;
      if (this.interactionStatus == null) {
         var48 = 0;
      } else {
         var48 = this.interactionStatus.hashCode();
      }

      val var49: Int;
      if (this.useAttachmentGridLayout == null) {
         var49 = 0;
      } else {
         var49 = this.useAttachmentGridLayout.hashCode();
      }

      val var50: Int;
      if (this.useAttachmentUploadPreview == null) {
         var50 = 0;
      } else {
         var50 = this.useAttachmentUploadPreview.hashCode();
      }

      val var51: Int;
      if (this.isCurrentUserMessageAuthor == null) {
         var51 = 0;
      } else {
         var51 = this.isCurrentUserMessageAuthor.hashCode();
      }

      val var52: Int;
      if (this.obscureLearnMoreLabel == null) {
         var52 = 0;
      } else {
         var52 = this.obscureLearnMoreLabel.hashCode();
      }

      val var53: Int;
      if (this.usingGradientTheme == null) {
         var53 = 0;
      } else {
         var53 = this.usingGradientTheme.hashCode();
      }

      val var54: Int;
      if (this.title == null) {
         var54 = 0;
      } else {
         var54 = this.title.hashCode();
      }

      val var55: Int;
      if (this.description == null) {
         var55 = 0;
      } else {
         var55 = this.description.hashCode();
      }

      val var56: Int;
      if (this.avatarURLs == null) {
         var56 = 0;
      } else {
         var56 = this.avatarURLs.hashCode();
      }

      val var57: Int;
      if (this.isCallActive == null) {
         var57 = 0;
      } else {
         var57 = this.isCallActive.hashCode();
      }

      val var58: Int;
      if (this.missed == null) {
         var58 = 0;
      } else {
         var58 = this.missed.hashCode();
      }

      val var59: Int;
      if (this.rawMilliseconds == null) {
         var59 = 0;
      } else {
         var59 = this.rawMilliseconds.hashCode();
      }

      val var60: Int;
      if (this.sticker == null) {
         var60 = 0;
      } else {
         var60 = this.sticker.hashCode();
      }

      val var61: Int;
      if (this.stickerLabel == null) {
         var61 = 0;
      } else {
         var61 = this.stickerLabel.hashCode();
      }

      val var62: Int;
      if (this.buttonLabel == null) {
         var62 = 0;
      } else {
         var62 = this.buttonLabel.hashCode();
      }

      val var63: Int;
      if (this.showInviteToSpeakButton == null) {
         var63 = 0;
      } else {
         var63 = this.showInviteToSpeakButton.hashCode();
      }

      val var64: Int;
      if (this.activityInviteEmbed == null) {
         var64 = 0;
      } else {
         var64 = this.activityInviteEmbed.hashCode();
      }

      val var65: Int;
      if (this.activityRichPresenceInviteEmbed == null) {
         var65 = 0;
      } else {
         var65 = this.activityRichPresenceInviteEmbed.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               var87
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  + var86
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       + var92
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
      val var14: MessageType = this.type;
      val var15: java.lang.String = MessageId.toString-impl(this.id);
      val var102: java.lang.String;
      if (this.nonce == null) {
         var102 = "null";
      } else {
         var102 = MessageId.toString-impl(this.nonce);
      }

      val var70: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var88: GuildId = this.guildId;
      val var61: MessageState = this.state;
      val var44: UserId = this.authorId;
      val var11: Long = this.flags;
      val var20: java.lang.String = this.edited;
      val var21: Int = this.editedColor;
      val var56: java.lang.Float = this._constrainedWidth;
      val var41: Int = this.textColor;
      val var36: Int = this.linkColor;
      val var69: java.lang.String = this.timestamp;
      val var93: Int = this.timestampColor;
      val var45: java.lang.String = this.username;
      val var89: Int = this.usernameColor;
      val var18: Int = this.roleColor;
      val var66: RoleColors = this.roleColors;
      val var3: Boolean = this.shouldShowRoleDot;
      val var2: Boolean = this.shouldShowRoleOnName;
      val var40: Int = this.colorString;
      val var34: java.lang.String = this.avatarURL;
      val var24: java.lang.String = this.avatarDecorationURL;
      val var100: java.util.List = this.embeds;
      val var80: java.util.List = this.attachments;
      val var64: java.lang.Float = this.attachmentsOpacity;
      val var101: StructurableText = this.content;
      val var28: java.util.List = this.reactions;
      val var65: java.lang.Boolean = this.useAddBurstReaction;
      val var23: java.util.List = this.codedLinks;
      val var72: ActivityInstanceEmbed = this.activityInstanceEmbed;
      val var38: java.util.List = this.stickers;
      val var74: RoleIcon = this.roleIcon;
      val var55: ConnectionsRoleTag = this.connectionsRoleTag;
      val var57: ThreadEmbed = this.threadEmbed;
      val var7: Boolean = this.mentioned;
      val var75: java.lang.Boolean = this.gifAutoPlay;
      val var94: java.lang.Boolean = this.animateEmoji;
      val var42: java.lang.Boolean = this.showLinkDecorations;
      val var90: ReferencedMessage = this.referencedMessage;
      val var67: ExecutedCommand = this.executedCommand;
      val var91: java.util.List = this.components;
      val var85: java.lang.String = this.threadStarterMessageHeader;
      val var81: java.lang.Boolean = this.communicationDisabled;
      val var46: java.lang.String = this.tagText;
      val var49: java.lang.Boolean = this.tagVerified;
      val var95: Int = this.tagTextColor;
      val var96: Int = this.tagBackgroundColor;
      val var84: java.lang.String = this.tagType;
      val var83: java.lang.String = this.tagIconUrl;
      val var47: java.lang.String = this.opTagText;
      val var92: EphemeralIndication = this.ephemeralIndication;
      val var54: SurveyIndication = this.surveyIndication;
      val var76: InteractionStatus = this.interactionStatus;
      val var48: java.lang.Boolean = this.useAttachmentGridLayout;
      val var16: java.lang.Boolean = this.useAttachmentUploadPreview;
      val var19: java.lang.Boolean = this.isCurrentUserMessageAuthor;
      val var22: java.lang.String = this.obscureLearnMoreLabel;
      val var86: java.lang.Boolean = this.usingGradientTheme;
      val var97: java.lang.String = this.title;
      val var25: java.lang.String = this.description;
      val var87: java.util.List = this.avatarURLs;
      val var63: java.lang.Boolean = this.isCallActive;
      val var60: java.lang.Boolean = this.missed;
      val var79: java.lang.Long = this.rawMilliseconds;
      val var32: Sticker = this.sticker;
      val var62: java.lang.String = this.stickerLabel;
      val var98: java.lang.String = this.buttonLabel;
      val var58: java.lang.Boolean = this.showInviteToSpeakButton;
      val var73: ActivityInviteEmbed = this.activityInviteEmbed;
      val var52: ActivityRichPresenceInviteEmbed = this.activityRichPresenceInviteEmbed;
      val var8: Boolean = this.isFirstForumPostMessage;
      val var53: ForumPostActions = this.postActions;
      val var78: AutoModerationContext = this.autoModerationContext;
      val var82: ReferralEmbed = this.referralTrialOfferInfo;
      val var26: java.util.List = this.giftCodes;
      val var77: GiftEmbed = this.referralTrialOffer;
      val var99: Int = this.totalMonthsSubscribed;
      val var31: java.util.List = this.postPreviewEmbeds;
      val var35: ChannelPromptData = this.channelPromptData;
      val var37: SafetyPolicyNoticeEmbed = this.safetyPolicyNoticeEmbed;
      val var39: SafetySystemNotificationEmbed = this.safetySystemNotificationEmbed;
      val var29: PollData = this.pollData;
      val var68: CtaButton = this.ctaButton;
      val var71: VoiceInviteEmbed = this.voiceChannelInviteEmbed;
      val var50: Int = this.audioAttachmentBackgroundColor;
      val var43: ForwardInfo = this.forwardInfo;
      val var33: java.lang.Boolean = this.showInlineForwardButton;
      val var17: GuildId = this.clanTagGuildId;
      val var51: java.lang.String = this.clanTag;
      val var59: java.lang.String = this.clanBadgeUrl;
      val var27: java.lang.String = this.gameApplicationId;
      val var9: Boolean = this.showReactionShortcut;
      val var1: Boolean = this.showReplyShortcut;
      val var10: Boolean = this.showForwardShortcut;
      val var4: Boolean = this.showThreadShortcut;
      val var6: Boolean = this.isAnnouncementChannel;
      val var5: Boolean = this.shortcutsEnabled;
      val var30: StringBuilder = new StringBuilder();
      var30.append("Message(type=");
      var30.append(var14);
      var30.append(", id=");
      var30.append(var15);
      var30.append(", nonce=");
      var30.append(var102);
      var30.append(", channelId=");
      var30.append(var70);
      var30.append(", guildId=");
      var30.append(var88);
      var30.append(", state=");
      var30.append(var61);
      var30.append(", authorId=");
      var30.append(var44);
      var30.append(", flags=");
      var30.append(var11);
      var30.append(", edited=");
      var30.append(var20);
      var30.append(", editedColor=");
      var30.append(var21);
      var30.append(", _constrainedWidth=");
      var30.append(var56);
      var30.append(", textColor=");
      var30.append(var41);
      var30.append(", linkColor=");
      var30.append(var36);
      var30.append(", timestamp=");
      var30.append(var69);
      var30.append(", timestampColor=");
      var30.append(var93);
      var30.append(", username=");
      var30.append(var45);
      var30.append(", usernameColor=");
      var30.append(var89);
      var30.append(", roleColor=");
      var30.append(var18);
      var30.append(", roleColors=");
      var30.append(var66);
      var30.append(", shouldShowRoleDot=");
      var30.append(var3);
      var30.append(", shouldShowRoleOnName=");
      var30.append(var2);
      var30.append(", colorString=");
      var30.append(var40);
      var30.append(", avatarURL=");
      var30.append(var34);
      var30.append(", avatarDecorationURL=");
      var30.append(var24);
      var30.append(", embeds=");
      var30.append(var100);
      var30.append(", attachments=");
      var30.append(var80);
      var30.append(", attachmentsOpacity=");
      var30.append(var64);
      var30.append(", content=");
      var30.append(var101);
      var30.append(", reactions=");
      var30.append(var28);
      var30.append(", useAddBurstReaction=");
      var30.append(var65);
      var30.append(", codedLinks=");
      var30.append(var23);
      var30.append(", activityInstanceEmbed=");
      var30.append(var72);
      var30.append(", stickers=");
      var30.append(var38);
      var30.append(", roleIcon=");
      var30.append(var74);
      var30.append(", connectionsRoleTag=");
      var30.append(var55);
      var30.append(", threadEmbed=");
      var30.append(var57);
      var30.append(", mentioned=");
      var30.append(var7);
      var30.append(", gifAutoPlay=");
      var30.append(var75);
      var30.append(", animateEmoji=");
      var30.append(var94);
      var30.append(", showLinkDecorations=");
      var30.append(var42);
      var30.append(", referencedMessage=");
      var30.append(var90);
      var30.append(", executedCommand=");
      var30.append(var67);
      var30.append(", components=");
      var30.append(var91);
      var30.append(", threadStarterMessageHeader=");
      var30.append(var85);
      var30.append(", communicationDisabled=");
      var30.append(var81);
      var30.append(", tagText=");
      var30.append(var46);
      var30.append(", tagVerified=");
      var30.append(var49);
      var30.append(", tagTextColor=");
      var30.append(var95);
      var30.append(", tagBackgroundColor=");
      var30.append(var96);
      var30.append(", tagType=");
      var30.append(var84);
      var30.append(", tagIconUrl=");
      var30.append(var83);
      var30.append(", opTagText=");
      var30.append(var47);
      var30.append(", ephemeralIndication=");
      var30.append(var92);
      var30.append(", surveyIndication=");
      var30.append(var54);
      var30.append(", interactionStatus=");
      var30.append(var76);
      var30.append(", useAttachmentGridLayout=");
      var30.append(var48);
      var30.append(", useAttachmentUploadPreview=");
      var30.append(var16);
      var30.append(", isCurrentUserMessageAuthor=");
      var30.append(var19);
      var30.append(", obscureLearnMoreLabel=");
      var30.append(var22);
      var30.append(", usingGradientTheme=");
      var30.append(var86);
      var30.append(", title=");
      var30.append(var97);
      var30.append(", description=");
      var30.append(var25);
      var30.append(", avatarURLs=");
      var30.append(var87);
      var30.append(", isCallActive=");
      var30.append(var63);
      var30.append(", missed=");
      var30.append(var60);
      var30.append(", rawMilliseconds=");
      var30.append(var79);
      var30.append(", sticker=");
      var30.append(var32);
      var30.append(", stickerLabel=");
      var30.append(var62);
      var30.append(", buttonLabel=");
      var30.append(var98);
      var30.append(", showInviteToSpeakButton=");
      var30.append(var58);
      var30.append(", activityInviteEmbed=");
      var30.append(var73);
      var30.append(", activityRichPresenceInviteEmbed=");
      var30.append(var52);
      var30.append(", isFirstForumPostMessage=");
      var30.append(var8);
      var30.append(", postActions=");
      var30.append(var53);
      var30.append(", autoModerationContext=");
      var30.append(var78);
      var30.append(", referralTrialOfferInfo=");
      var30.append(var82);
      var30.append(", giftCodes=");
      var30.append(var26);
      var30.append(", referralTrialOffer=");
      var30.append(var77);
      var30.append(", totalMonthsSubscribed=");
      var30.append(var99);
      var30.append(", postPreviewEmbeds=");
      var30.append(var31);
      var30.append(", channelPromptData=");
      var30.append(var35);
      var30.append(", safetyPolicyNoticeEmbed=");
      var30.append(var37);
      var30.append(", safetySystemNotificationEmbed=");
      var30.append(var39);
      var30.append(", pollData=");
      var30.append(var29);
      var30.append(", ctaButton=");
      var30.append(var68);
      var30.append(", voiceChannelInviteEmbed=");
      var30.append(var71);
      var30.append(", audioAttachmentBackgroundColor=");
      var30.append(var50);
      var30.append(", forwardInfo=");
      var30.append(var43);
      var30.append(", showInlineForwardButton=");
      var30.append(var33);
      var30.append(", clanTagGuildId=");
      var30.append(var17);
      var30.append(", clanTag=");
      var30.append(var51);
      var30.append(", clanBadgeUrl=");
      var30.append(var59);
      var30.append(", gameApplicationId=");
      var30.append(var27);
      var30.append(", showReactionShortcut=");
      var30.append(var9);
      var30.append(", showReplyShortcut=");
      var30.append(var1);
      var30.append(", showForwardShortcut=");
      var30.append(var10);
      var30.append(", showThreadShortcut=");
      var30.append(var4);
      var30.append(", isAnnouncementChannel=");
      var30.append(var6);
      var30.append(", shortcutsEnabled=");
      var30.append(var5);
      var30.append(")");
      return var30.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Message> {
         return Message.$serializer.INSTANCE;
      }
   }
}
