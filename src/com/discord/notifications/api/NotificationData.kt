package com.discord.notifications.api

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class NotificationData(type: String,
   messageId: MessageId? = ...,
   messageActivityType: Int? = ...,
   messageApplicationName: String? = ...,
   messageType: Int? = ...,
   messageContent: String? = ...,
   messageFlags: Long? = ...,
   channelType: Int? = ...,
   channelName: String? = ...,
   channelId: ChannelId? = ...,
   channelIcon: String? = ...,
   parentName: String? = ...,
   parentId: ChannelId? = ...,
   messageReferenceType: Int? = ...,
   channelRtcRegion: String? = ...,
   ackChannelIds: List<ChannelId> = ...,
   userId: UserId? = ...,
   userUsername: String? = ...,
   userGlobalName: String? = ...,
   userDiscriminator: Int? = ...,
   userAvatar: String? = ...,
   userGuildAvatar: String? = ...,
   platformUserUsername: String? = ...,
   relationshipType: Int? = ...,
   guildId: GuildId? = ...,
   guildName: String? = ...,
   guildIcon: String? = ...,
   activityInstanceId: String? = ...,
   activityType: Int? = ...,
   activityName: String? = ...,
   applicationId: ApplicationId? = ...,
   applicationName: String? = ...,
   applicationIcon: String? = ...,
   message: NotificationMessage? = ...,
   stageInstanceTopic: String? = ...,
   guildScheduledEventEntityType: Int? = ...,
   canReply: Boolean = ...,
   isFromCurrentUser: Boolean = ...,
   receivingUserId: UserId? = ...,
   title: String? = ...,
   subtitle: String? = ...,
   iconUrl: String? = ...,
   notificationChannel: String? = ...,
   trackingType: String? = ...,
   deeplink: String? = ...,
   expandSubtitle: Boolean? = ...,
   imageAttachmentUrl: String? = ...,
   timeReceived: String? = ...,
   silent: Boolean = ...,
   userInfo: Map<String, String> = ...,
   appDm: Boolean = ...,
   notifTypeId: String? = ...,
   notifInstanceId: String? = ...,
   joinId: String? = ...,
   mentionType: String? = ...,
   appState: String? = ...
) : NotificationData(
      var1,
      var2,
      var3,
      var4,
      var5,
      var6,
      var7,
      var8,
      var9,
      var10,
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
      var56
   ) {
   public final val type: String
   public final val messageId: MessageId?
   public final val messageActivityType: Int?
   public final val messageApplicationName: String?
   public final val messageType: Int?
   public final val messageContent: String?
   public final val messageFlags: Long?
   public final val channelType: Int?
   public final val channelName: String?
   public final val channelId: ChannelId?
   public final val channelIcon: String?
   public final val parentName: String?
   public final val parentId: ChannelId?
   public final val messageReferenceType: Int?
   public final val channelRtcRegion: String?

   @g(
      with = ChannelListSerializer.class
   )
   public final val ackChannelIds: List<ChannelId>

   public final val userId: UserId?
   public final val userUsername: String?
   public final val userGlobalName: String?
   public final val userDiscriminator: Int?
   public final val userAvatar: String?
   public final val userGuildAvatar: String?
   public final val platformUserUsername: String?
   public final val relationshipType: Int?
   public final val guildId: GuildId?
   public final val guildName: String?
   public final val guildIcon: String?
   public final val activityInstanceId: String?
   public final val activityType: Int?
   public final val activityName: String?
   public final val applicationId: ApplicationId?
   public final val applicationName: String?
   public final val applicationIcon: String?

   @g(
      with = NotificationMessageSerializer.class
   )
   public final val message: NotificationMessage?

   public final val stageInstanceTopic: String?
   public final val guildScheduledEventEntityType: Int?

   @g(
      with = CanReplySerializer.class
   )
   public final val canReply: Boolean

   public final val isFromCurrentUser: Boolean
   public final val receivingUserId: UserId?
   public final val title: String?
   public final val subtitle: String?
   public final val iconUrl: String?
   public final val notificationChannel: String?
   public final val trackingType: String?
   public final val deeplink: String?
   public final val expandSubtitle: Boolean?
   public final val imageAttachmentUrl: String?
   public final val timeReceived: String?
   public final val silent: Boolean
   public final val userInfo: Map<String, String>
   public final val appDm: Boolean
   public final val notifTypeId: String?
   public final val notifInstanceId: String?
   public final val joinId: String?
   public final val mentionType: String?
   public final val appState: String?

   fun NotificationData(
      var1: java.lang.String,
      var2: java.lang.String,
      var3: Int,
      var4: java.lang.String,
      var5: Int,
      var6: java.lang.String,
      var7: java.lang.Long,
      var8: Int,
      var9: java.lang.String,
      var10: ChannelId,
      var11: java.lang.String,
      var12: java.lang.String,
      var13: ChannelId,
      var14: Int,
      var15: java.lang.String,
      var16: MutableList<ChannelId>,
      var17: UserId,
      var18: java.lang.String,
      var19: java.lang.String,
      var20: Int,
      var21: java.lang.String,
      var22: java.lang.String,
      var23: java.lang.String,
      var24: Int,
      var25: GuildId,
      var26: java.lang.String,
      var27: java.lang.String,
      var28: java.lang.String,
      var29: Int,
      var30: java.lang.String,
      var31: ApplicationId,
      var32: java.lang.String,
      var33: java.lang.String,
      var34: NotificationMessage,
      var35: java.lang.String,
      var36: Int,
      var37: Boolean,
      var38: Boolean,
      var39: UserId,
      var40: java.lang.String,
      var41: java.lang.String,
      var42: java.lang.String,
      var43: java.lang.String,
      var44: java.lang.String,
      var45: java.lang.String,
      var46: java.lang.Boolean,
      var47: java.lang.String,
      var48: java.lang.String,
      var49: Boolean,
      var50: MutableMap<java.lang.String, java.lang.String>,
      var51: Boolean,
      var52: java.lang.String,
      var53: java.lang.String,
      var54: java.lang.String,
      var55: java.lang.String,
      var56: java.lang.String
   ) {
      this.type = var1;
      this.messageId = var2;
      this.messageActivityType = var3;
      this.messageApplicationName = var4;
      this.messageType = var5;
      this.messageContent = var6;
      this.messageFlags = var7;
      this.channelType = var8;
      this.channelName = var9;
      this.channelId = var10;
      this.channelIcon = var11;
      this.parentName = var12;
      this.parentId = var13;
      this.messageReferenceType = var14;
      this.channelRtcRegion = var15;
      this.ackChannelIds = var16;
      this.userId = var17;
      this.userUsername = var18;
      this.userGlobalName = var19;
      this.userDiscriminator = var20;
      this.userAvatar = var21;
      this.userGuildAvatar = var22;
      this.platformUserUsername = var23;
      this.relationshipType = var24;
      this.guildId = var25;
      this.guildName = var26;
      this.guildIcon = var27;
      this.activityInstanceId = var28;
      this.activityType = var29;
      this.activityName = var30;
      this.applicationId = var31;
      this.applicationName = var32;
      this.applicationIcon = var33;
      this.message = var34;
      this.stageInstanceTopic = var35;
      this.guildScheduledEventEntityType = var36;
      this.canReply = var37;
      this.isFromCurrentUser = var38;
      this.receivingUserId = var39;
      this.title = var40;
      this.subtitle = var41;
      this.iconUrl = var42;
      this.notificationChannel = var43;
      this.trackingType = var44;
      this.deeplink = var45;
      this.expandSubtitle = var46;
      this.imageAttachmentUrl = var47;
      this.timeReceived = var48;
      this.silent = var49;
      this.userInfo = var50;
      this.appDm = var51;
      this.notifTypeId = var52;
      this.notifInstanceId = var53;
      this.joinId = var54;
      this.mentionType = var55;
      this.appState = var56;
   }

   public operator fun component1(): String {
      return this.type;
   }

   public operator fun component10(): ChannelId? {
      return this.channelId;
   }

   public operator fun component11(): String? {
      return this.channelIcon;
   }

   public operator fun component12(): String? {
      return this.parentName;
   }

   public operator fun component13(): ChannelId? {
      return this.parentId;
   }

   public operator fun component14(): Int? {
      return this.messageReferenceType;
   }

   public operator fun component15(): String? {
      return this.channelRtcRegion;
   }

   public operator fun component16(): List<ChannelId> {
      return this.ackChannelIds;
   }

   public operator fun component17(): UserId? {
      return this.userId;
   }

   public operator fun component18(): String? {
      return this.userUsername;
   }

   public operator fun component19(): String? {
      return this.userGlobalName;
   }

   public operator fun component2(): MessageId? {
      return this.messageId;
   }

   public operator fun component20(): Int? {
      return this.userDiscriminator;
   }

   public operator fun component21(): String? {
      return this.userAvatar;
   }

   public operator fun component22(): String? {
      return this.userGuildAvatar;
   }

   public operator fun component23(): String? {
      return this.platformUserUsername;
   }

   public operator fun component24(): Int? {
      return this.relationshipType;
   }

   public operator fun component25(): GuildId? {
      return this.guildId;
   }

   public operator fun component26(): String? {
      return this.guildName;
   }

   public operator fun component27(): String? {
      return this.guildIcon;
   }

   public operator fun component28(): String? {
      return this.activityInstanceId;
   }

   public operator fun component29(): Int? {
      return this.activityType;
   }

   public operator fun component3(): Int? {
      return this.messageActivityType;
   }

   public operator fun component30(): String? {
      return this.activityName;
   }

   public operator fun component31(): ApplicationId? {
      return this.applicationId;
   }

   public operator fun component32(): String? {
      return this.applicationName;
   }

   public operator fun component33(): String? {
      return this.applicationIcon;
   }

   public operator fun component34(): NotificationMessage? {
      return this.message;
   }

   public operator fun component35(): String? {
      return this.stageInstanceTopic;
   }

   public operator fun component36(): Int? {
      return this.guildScheduledEventEntityType;
   }

   public operator fun component37(): Boolean {
      return this.canReply;
   }

   public operator fun component38(): Boolean {
      return this.isFromCurrentUser;
   }

   public operator fun component39(): UserId? {
      return this.receivingUserId;
   }

   public operator fun component4(): String? {
      return this.messageApplicationName;
   }

   public operator fun component40(): String? {
      return this.title;
   }

   public operator fun component41(): String? {
      return this.subtitle;
   }

   public operator fun component42(): String? {
      return this.iconUrl;
   }

   public operator fun component43(): String? {
      return this.notificationChannel;
   }

   public operator fun component44(): String? {
      return this.trackingType;
   }

   public operator fun component45(): String? {
      return this.deeplink;
   }

   public operator fun component46(): Boolean? {
      return this.expandSubtitle;
   }

   public operator fun component47(): String? {
      return this.imageAttachmentUrl;
   }

   public operator fun component48(): String? {
      return this.timeReceived;
   }

   public operator fun component49(): Boolean {
      return this.silent;
   }

   public operator fun component5(): Int? {
      return this.messageType;
   }

   public operator fun component50(): Map<String, String> {
      return this.userInfo;
   }

   public operator fun component51(): Boolean {
      return this.appDm;
   }

   public operator fun component52(): String? {
      return this.notifTypeId;
   }

   public operator fun component53(): String? {
      return this.notifInstanceId;
   }

   public operator fun component54(): String? {
      return this.joinId;
   }

   public operator fun component55(): String? {
      return this.mentionType;
   }

   public operator fun component56(): String? {
      return this.appState;
   }

   public operator fun component6(): String? {
      return this.messageContent;
   }

   public operator fun component7(): Long? {
      return this.messageFlags;
   }

   public operator fun component8(): Int? {
      return this.channelType;
   }

   public operator fun component9(): String? {
      return this.channelName;
   }

   public fun copy(
      type: String = ...,
      messageId: MessageId? = ...,
      messageActivityType: Int? = ...,
      messageApplicationName: String? = ...,
      messageType: Int? = ...,
      messageContent: String? = ...,
      messageFlags: Long? = ...,
      channelType: Int? = ...,
      channelName: String? = ...,
      channelId: ChannelId? = ...,
      channelIcon: String? = ...,
      parentName: String? = ...,
      parentId: ChannelId? = ...,
      messageReferenceType: Int? = ...,
      channelRtcRegion: String? = ...,
      ackChannelIds: List<ChannelId> = ...,
      userId: UserId? = ...,
      userUsername: String? = ...,
      userGlobalName: String? = ...,
      userDiscriminator: Int? = ...,
      userAvatar: String? = ...,
      userGuildAvatar: String? = ...,
      platformUserUsername: String? = ...,
      relationshipType: Int? = ...,
      guildId: GuildId? = ...,
      guildName: String? = ...,
      guildIcon: String? = ...,
      activityInstanceId: String? = ...,
      activityType: Int? = ...,
      activityName: String? = ...,
      applicationId: ApplicationId? = ...,
      applicationName: String? = ...,
      applicationIcon: String? = ...,
      message: NotificationMessage? = ...,
      stageInstanceTopic: String? = ...,
      guildScheduledEventEntityType: Int? = ...,
      canReply: Boolean = ...,
      isFromCurrentUser: Boolean = ...,
      receivingUserId: UserId? = ...,
      title: String? = ...,
      subtitle: String? = ...,
      iconUrl: String? = ...,
      notificationChannel: String? = ...,
      trackingType: String? = ...,
      deeplink: String? = ...,
      expandSubtitle: Boolean? = ...,
      imageAttachmentUrl: String? = ...,
      timeReceived: String? = ...,
      silent: Boolean = ...,
      userInfo: Map<String, String> = ...,
      appDm: Boolean = ...,
      notifTypeId: String? = ...,
      notifInstanceId: String? = ...,
      joinId: String? = ...,
      mentionType: String? = ...,
      appState: String? = ...
   ): NotificationData {
      return new NotificationData(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
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
         null
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NotificationData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.type == var1.type)) {
            return false;
         } else {
            var var2: Boolean;
            label244: {
               if (this.messageId == null) {
                  if (var1.messageId == null) {
                     var2 = true;
                     break label244;
                  }
               } else if (var1.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var1.messageId);
                  break label244;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!(this.messageActivityType == var1.messageActivityType)) {
               return false;
            } else if (!(this.messageApplicationName == var1.messageApplicationName)) {
               return false;
            } else if (!(this.messageType == var1.messageType)) {
               return false;
            } else if (!(this.messageContent == var1.messageContent)) {
               return false;
            } else if (!(this.messageFlags == var1.messageFlags)) {
               return false;
            } else if (!(this.channelType == var1.channelType)) {
               return false;
            } else if (!(this.channelName == var1.channelName)) {
               return false;
            } else if (!(this.channelId == var1.channelId)) {
               return false;
            } else if (!(this.channelIcon == var1.channelIcon)) {
               return false;
            } else if (!(this.parentName == var1.parentName)) {
               return false;
            } else if (!(this.parentId == var1.parentId)) {
               return false;
            } else if (!(this.messageReferenceType == var1.messageReferenceType)) {
               return false;
            } else if (!(this.channelRtcRegion == var1.channelRtcRegion)) {
               return false;
            } else if (!(this.ackChannelIds == var1.ackChannelIds)) {
               return false;
            } else if (!(this.userId == var1.userId)) {
               return false;
            } else if (!(this.userUsername == var1.userUsername)) {
               return false;
            } else if (!(this.userGlobalName == var1.userGlobalName)) {
               return false;
            } else if (!(this.userDiscriminator == var1.userDiscriminator)) {
               return false;
            } else if (!(this.userAvatar == var1.userAvatar)) {
               return false;
            } else if (!(this.userGuildAvatar == var1.userGuildAvatar)) {
               return false;
            } else if (!(this.platformUserUsername == var1.platformUserUsername)) {
               return false;
            } else if (!(this.relationshipType == var1.relationshipType)) {
               return false;
            } else if (!(this.guildId == var1.guildId)) {
               return false;
            } else if (!(this.guildName == var1.guildName)) {
               return false;
            } else if (!(this.guildIcon == var1.guildIcon)) {
               return false;
            } else if (!(this.activityInstanceId == var1.activityInstanceId)) {
               return false;
            } else if (!(this.activityType == var1.activityType)) {
               return false;
            } else if (!(this.activityName == var1.activityName)) {
               return false;
            } else if (!(this.applicationId == var1.applicationId)) {
               return false;
            } else if (!(this.applicationName == var1.applicationName)) {
               return false;
            } else if (!(this.applicationIcon == var1.applicationIcon)) {
               return false;
            } else if (!(this.message == var1.message)) {
               return false;
            } else if (!(this.stageInstanceTopic == var1.stageInstanceTopic)) {
               return false;
            } else if (!(this.guildScheduledEventEntityType == var1.guildScheduledEventEntityType)) {
               return false;
            } else if (this.canReply != var1.canReply) {
               return false;
            } else if (this.isFromCurrentUser != var1.isFromCurrentUser) {
               return false;
            } else if (!(this.receivingUserId == var1.receivingUserId)) {
               return false;
            } else if (!(this.title == var1.title)) {
               return false;
            } else if (!(this.subtitle == var1.subtitle)) {
               return false;
            } else if (!(this.iconUrl == var1.iconUrl)) {
               return false;
            } else if (!(this.notificationChannel == var1.notificationChannel)) {
               return false;
            } else if (!(this.trackingType == var1.trackingType)) {
               return false;
            } else if (!(this.deeplink == var1.deeplink)) {
               return false;
            } else if (!(this.expandSubtitle == var1.expandSubtitle)) {
               return false;
            } else if (!(this.imageAttachmentUrl == var1.imageAttachmentUrl)) {
               return false;
            } else if (!(this.timeReceived == var1.timeReceived)) {
               return false;
            } else if (this.silent != var1.silent) {
               return false;
            } else if (!(this.userInfo == var1.userInfo)) {
               return false;
            } else if (this.appDm != var1.appDm) {
               return false;
            } else if (!(this.notifTypeId == var1.notifTypeId)) {
               return false;
            } else if (!(this.notifInstanceId == var1.notifInstanceId)) {
               return false;
            } else if (!(this.joinId == var1.joinId)) {
               return false;
            } else if (!(this.mentionType == var1.mentionType)) {
               return false;
            } else {
               return this.appState == var1.appState;
            }
         }
      }
   }

   public override fun hashCode(): Int {
      val var50: Int = this.type.hashCode();
      var var49: Int = 0;
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.messageId);
      }

      val var2: Int;
      if (this.messageActivityType == null) {
         var2 = 0;
      } else {
         var2 = this.messageActivityType.hashCode();
      }

      val var3: Int;
      if (this.messageApplicationName == null) {
         var3 = 0;
      } else {
         var3 = this.messageApplicationName.hashCode();
      }

      val var4: Int;
      if (this.messageType == null) {
         var4 = 0;
      } else {
         var4 = this.messageType.hashCode();
      }

      val var5: Int;
      if (this.messageContent == null) {
         var5 = 0;
      } else {
         var5 = this.messageContent.hashCode();
      }

      val var6: Int;
      if (this.messageFlags == null) {
         var6 = 0;
      } else {
         var6 = this.messageFlags.hashCode();
      }

      val var7: Int;
      if (this.channelType == null) {
         var7 = 0;
      } else {
         var7 = this.channelType.hashCode();
      }

      val var8: Int;
      if (this.channelName == null) {
         var8 = 0;
      } else {
         var8 = this.channelName.hashCode();
      }

      val var9: Int;
      if (this.channelId == null) {
         var9 = 0;
      } else {
         var9 = ChannelId.hashCode-impl(this.channelId.unbox-impl());
      }

      val var10: Int;
      if (this.channelIcon == null) {
         var10 = 0;
      } else {
         var10 = this.channelIcon.hashCode();
      }

      val var11: Int;
      if (this.parentName == null) {
         var11 = 0;
      } else {
         var11 = this.parentName.hashCode();
      }

      val var12: Int;
      if (this.parentId == null) {
         var12 = 0;
      } else {
         var12 = ChannelId.hashCode-impl(this.parentId.unbox-impl());
      }

      val var13: Int;
      if (this.messageReferenceType == null) {
         var13 = 0;
      } else {
         var13 = this.messageReferenceType.hashCode();
      }

      val var14: Int;
      if (this.channelRtcRegion == null) {
         var14 = 0;
      } else {
         var14 = this.channelRtcRegion.hashCode();
      }

      val var51: Int = this.ackChannelIds.hashCode();
      val var15: Int;
      if (this.userId == null) {
         var15 = 0;
      } else {
         var15 = UserId.hashCode-impl(this.userId.unbox-impl());
      }

      val var16: Int;
      if (this.userUsername == null) {
         var16 = 0;
      } else {
         var16 = this.userUsername.hashCode();
      }

      val var17: Int;
      if (this.userGlobalName == null) {
         var17 = 0;
      } else {
         var17 = this.userGlobalName.hashCode();
      }

      val var18: Int;
      if (this.userDiscriminator == null) {
         var18 = 0;
      } else {
         var18 = this.userDiscriminator.hashCode();
      }

      val var19: Int;
      if (this.userAvatar == null) {
         var19 = 0;
      } else {
         var19 = this.userAvatar.hashCode();
      }

      val var20: Int;
      if (this.userGuildAvatar == null) {
         var20 = 0;
      } else {
         var20 = this.userGuildAvatar.hashCode();
      }

      val var21: Int;
      if (this.platformUserUsername == null) {
         var21 = 0;
      } else {
         var21 = this.platformUserUsername.hashCode();
      }

      val var22: Int;
      if (this.relationshipType == null) {
         var22 = 0;
      } else {
         var22 = this.relationshipType.hashCode();
      }

      val var23: Int;
      if (this.guildId == null) {
         var23 = 0;
      } else {
         var23 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      val var24: Int;
      if (this.guildName == null) {
         var24 = 0;
      } else {
         var24 = this.guildName.hashCode();
      }

      val var25: Int;
      if (this.guildIcon == null) {
         var25 = 0;
      } else {
         var25 = this.guildIcon.hashCode();
      }

      val var26: Int;
      if (this.activityInstanceId == null) {
         var26 = 0;
      } else {
         var26 = this.activityInstanceId.hashCode();
      }

      val var27: Int;
      if (this.activityType == null) {
         var27 = 0;
      } else {
         var27 = this.activityType.hashCode();
      }

      val var28: Int;
      if (this.activityName == null) {
         var28 = 0;
      } else {
         var28 = this.activityName.hashCode();
      }

      val var29: Int;
      if (this.applicationId == null) {
         var29 = 0;
      } else {
         var29 = ApplicationId.hashCode-impl(this.applicationId.unbox-impl());
      }

      val var30: Int;
      if (this.applicationName == null) {
         var30 = 0;
      } else {
         var30 = this.applicationName.hashCode();
      }

      val var31: Int;
      if (this.applicationIcon == null) {
         var31 = 0;
      } else {
         var31 = this.applicationIcon.hashCode();
      }

      val var32: Int;
      if (this.message == null) {
         var32 = 0;
      } else {
         var32 = this.message.hashCode();
      }

      val var33: Int;
      if (this.stageInstanceTopic == null) {
         var33 = 0;
      } else {
         var33 = this.stageInstanceTopic.hashCode();
      }

      val var34: Int;
      if (this.guildScheduledEventEntityType == null) {
         var34 = 0;
      } else {
         var34 = this.guildScheduledEventEntityType.hashCode();
      }

      val var52: Int = java.lang.Boolean.hashCode(this.canReply);
      val var53: Int = java.lang.Boolean.hashCode(this.isFromCurrentUser);
      val var35: Int;
      if (this.receivingUserId == null) {
         var35 = 0;
      } else {
         var35 = UserId.hashCode-impl(this.receivingUserId.unbox-impl());
      }

      val var36: Int;
      if (this.title == null) {
         var36 = 0;
      } else {
         var36 = this.title.hashCode();
      }

      val var37: Int;
      if (this.subtitle == null) {
         var37 = 0;
      } else {
         var37 = this.subtitle.hashCode();
      }

      val var38: Int;
      if (this.iconUrl == null) {
         var38 = 0;
      } else {
         var38 = this.iconUrl.hashCode();
      }

      val var39: Int;
      if (this.notificationChannel == null) {
         var39 = 0;
      } else {
         var39 = this.notificationChannel.hashCode();
      }

      val var40: Int;
      if (this.trackingType == null) {
         var40 = 0;
      } else {
         var40 = this.trackingType.hashCode();
      }

      val var41: Int;
      if (this.deeplink == null) {
         var41 = 0;
      } else {
         var41 = this.deeplink.hashCode();
      }

      val var42: Int;
      if (this.expandSubtitle == null) {
         var42 = 0;
      } else {
         var42 = this.expandSubtitle.hashCode();
      }

      val var43: Int;
      if (this.imageAttachmentUrl == null) {
         var43 = 0;
      } else {
         var43 = this.imageAttachmentUrl.hashCode();
      }

      val var44: Int;
      if (this.timeReceived == null) {
         var44 = 0;
      } else {
         var44 = this.timeReceived.hashCode();
      }

      val var56: Int = java.lang.Boolean.hashCode(this.silent);
      val var54: Int = this.userInfo.hashCode();
      val var55: Int = java.lang.Boolean.hashCode(this.appDm);
      val var45: Int;
      if (this.notifTypeId == null) {
         var45 = 0;
      } else {
         var45 = this.notifTypeId.hashCode();
      }

      val var46: Int;
      if (this.notifInstanceId == null) {
         var46 = 0;
      } else {
         var46 = this.notifInstanceId.hashCode();
      }

      val var47: Int;
      if (this.joinId == null) {
         var47 = 0;
      } else {
         var47 = this.joinId.hashCode();
      }

      val var48: Int;
      if (this.mentionType == null) {
         var48 = 0;
      } else {
         var48 = this.mentionType.hashCode();
      }

      if (this.appState != null) {
         var49 = this.appState.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            var50
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               + var1
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
                                                                                                                                                                                                                                                                                                                                                                                 + var51
                                                                                                                                                                                                                                                                                                                                                                           )
                                                                                                                                                                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                                                                                                                                                                        + var15
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
                                                                                                                                                                                                               + var32
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var33
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var34
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var52
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var53
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
                                                                        + var56
                                                                  )
                                                                  * 31
                                                               + var54
                                                         )
                                                         * 31
                                                      + var55
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
         + var49;
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.type;
      val var58: java.lang.String;
      if (this.messageId == null) {
         var58 = "null";
      } else {
         var58 = MessageId.toString-impl(this.messageId);
      }

      val var14: Int = this.messageActivityType;
      val var16: java.lang.String = this.messageApplicationName;
      val var28: Int = this.messageType;
      val var11: java.lang.String = this.messageContent;
      val var33: java.lang.Long = this.messageFlags;
      val var42: Int = this.channelType;
      val var8: java.lang.String = this.channelName;
      val var27: ChannelId = this.channelId;
      val var23: java.lang.String = this.channelIcon;
      val var56: java.lang.String = this.parentName;
      val var7: ChannelId = this.parentId;
      val var9: Int = this.messageReferenceType;
      val var54: java.lang.String = this.channelRtcRegion;
      val var40: java.util.List = this.ackChannelIds;
      val var49: UserId = this.userId;
      val var17: java.lang.String = this.userUsername;
      val var38: java.lang.String = this.userGlobalName;
      val var30: Int = this.userDiscriminator;
      val var29: java.lang.String = this.userAvatar;
      val var20: java.lang.String = this.userGuildAvatar;
      val var18: java.lang.String = this.platformUserUsername;
      val var34: Int = this.relationshipType;
      val var41: GuildId = this.guildId;
      val var31: java.lang.String = this.guildName;
      val var39: java.lang.String = this.guildIcon;
      val var25: java.lang.String = this.activityInstanceId;
      val var57: Int = this.activityType;
      val var53: java.lang.String = this.activityName;
      val var19: ApplicationId = this.applicationId;
      val var44: java.lang.String = this.applicationName;
      val var24: java.lang.String = this.applicationIcon;
      val var48: NotificationMessage = this.message;
      val var15: java.lang.String = this.stageInstanceTopic;
      val var22: Int = this.guildScheduledEventEntityType;
      val var4: Boolean = this.canReply;
      val var3: Boolean = this.isFromCurrentUser;
      val var37: UserId = this.receivingUserId;
      val var12: java.lang.String = this.title;
      val var51: java.lang.String = this.subtitle;
      val var13: java.lang.String = this.iconUrl;
      val var52: java.lang.String = this.notificationChannel;
      val var26: java.lang.String = this.trackingType;
      val var21: java.lang.String = this.deeplink;
      val var46: java.lang.Boolean = this.expandSubtitle;
      val var35: java.lang.String = this.imageAttachmentUrl;
      val var43: java.lang.String = this.timeReceived;
      val var1: Boolean = this.silent;
      val var36: java.util.Map = this.userInfo;
      val var2: Boolean = this.appDm;
      val var45: java.lang.String = this.notifTypeId;
      val var10: java.lang.String = this.notifInstanceId;
      val var32: java.lang.String = this.joinId;
      val var55: java.lang.String = this.mentionType;
      val var47: java.lang.String = this.appState;
      val var50: StringBuilder = new StringBuilder();
      var50.append("NotificationData(type=");
      var50.append(var6);
      var50.append(", messageId=");
      var50.append(var58);
      var50.append(", messageActivityType=");
      var50.append(var14);
      var50.append(", messageApplicationName=");
      var50.append(var16);
      var50.append(", messageType=");
      var50.append(var28);
      var50.append(", messageContent=");
      var50.append(var11);
      var50.append(", messageFlags=");
      var50.append(var33);
      var50.append(", channelType=");
      var50.append(var42);
      var50.append(", channelName=");
      var50.append(var8);
      var50.append(", channelId=");
      var50.append(var27);
      var50.append(", channelIcon=");
      var50.append(var23);
      var50.append(", parentName=");
      var50.append(var56);
      var50.append(", parentId=");
      var50.append(var7);
      var50.append(", messageReferenceType=");
      var50.append(var9);
      var50.append(", channelRtcRegion=");
      var50.append(var54);
      var50.append(", ackChannelIds=");
      var50.append(var40);
      var50.append(", userId=");
      var50.append(var49);
      var50.append(", userUsername=");
      var50.append(var17);
      var50.append(", userGlobalName=");
      var50.append(var38);
      var50.append(", userDiscriminator=");
      var50.append(var30);
      var50.append(", userAvatar=");
      var50.append(var29);
      var50.append(", userGuildAvatar=");
      var50.append(var20);
      var50.append(", platformUserUsername=");
      var50.append(var18);
      var50.append(", relationshipType=");
      var50.append(var34);
      var50.append(", guildId=");
      var50.append(var41);
      var50.append(", guildName=");
      var50.append(var31);
      var50.append(", guildIcon=");
      var50.append(var39);
      var50.append(", activityInstanceId=");
      var50.append(var25);
      var50.append(", activityType=");
      var50.append(var57);
      var50.append(", activityName=");
      var50.append(var53);
      var50.append(", applicationId=");
      var50.append(var19);
      var50.append(", applicationName=");
      var50.append(var44);
      var50.append(", applicationIcon=");
      var50.append(var24);
      var50.append(", message=");
      var50.append(var48);
      var50.append(", stageInstanceTopic=");
      var50.append(var15);
      var50.append(", guildScheduledEventEntityType=");
      var50.append(var22);
      var50.append(", canReply=");
      var50.append(var4);
      var50.append(", isFromCurrentUser=");
      var50.append(var3);
      var50.append(", receivingUserId=");
      var50.append(var37);
      var50.append(", title=");
      var50.append(var12);
      var50.append(", subtitle=");
      var50.append(var51);
      var50.append(", iconUrl=");
      var50.append(var13);
      var50.append(", notificationChannel=");
      var50.append(var52);
      var50.append(", trackingType=");
      var50.append(var26);
      var50.append(", deeplink=");
      var50.append(var21);
      var50.append(", expandSubtitle=");
      var50.append(var46);
      var50.append(", imageAttachmentUrl=");
      var50.append(var35);
      var50.append(", timeReceived=");
      var50.append(var43);
      var50.append(", silent=");
      var50.append(var1);
      var50.append(", userInfo=");
      var50.append(var36);
      var50.append(", appDm=");
      var50.append(var2);
      var50.append(", notifTypeId=");
      var50.append(var45);
      var50.append(", notifInstanceId=");
      var50.append(var10);
      var50.append(", joinId=");
      var50.append(var32);
      var50.append(", mentionType=");
      var50.append(var55);
      var50.append(", appState=");
      var50.append(var47);
      var50.append(")");
      return var50.toString();
   }

   public companion object {
      public const val CHANNEL_TYPE_GUILD_TEXT: Int
      public const val CHANNEL_TYPE_DM: Int
      public const val CHANNEL_TYPE_GUILD_VOICE: Int
      public const val CHANNEL_TYPE_GROUP_DM: Int
      public const val CHANNEL_TYPE_CATEGORY: Int
      public const val CHANNEL_TYPE_GUILD_ANNOUNCEMENT: Int
      public const val CHANNEL_TYPE_GUILD_STORE: Int
      public const val CHANNEL_TYPE_ANNOUNCEMENT_THREAD: Int
      public const val CHANNEL_TYPE_PUBLIC_THREAD: Int
      public const val CHANNEL_TYPE_PRIVATE_THREAD: Int
      public const val CHANNEL_TYPE_GUILD_STAGE_VOICE: Int
      public const val CHANNEL_TYPE_DIRECTORY: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_NONE: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_STAGE_INSTANCE: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_VOICE: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_EXTERNAL: Int
      public const val MESSAGE_ACTIVITY_TYPE_JOIN: Int
      public const val MESSAGE_ACTIVITY_TYPE_SPECTATE: Int
      public const val MESSAGE_ACTIVITY_TYPE_LISTEN: Int
      public const val MESSAGE_ACTIVITY_TYPE_WATCH: Int
      public const val MESSAGE_ACTIVITY_TYPE_REQUEST: Int
      public const val MESSAGE_TYPE_USER_JOIN: Int
      public const val MESSAGE_TYPE_POLL_RESULT: Int
      public const val MESSAGE_REFERENCE_TYPE_FORWARD: Int
      public const val RELATIONSHIP_TYPE_FRIEND: Int
      public const val RELATIONSHIP_TYPE_INVITE_INCOMING: Int
      public const val ACTIVITY_TYPE_PLAYING: Int
      public const val ACTIVITY_TYPE_STREAMING: Int
      public const val TYPE_ACTIVITY_START: String
      public const val TYPE_CHANNEL_ACK: String
      public const val TYPE_MESSAGE_CREATE: String
      public const val TYPE_RELATIONSHIP_ADD: String
      public const val TYPE_CALL_RING: String
      public const val TYPE_CALL_RING_END: String
      public const val TYPE_CALL_ACK: String
      public const val TYPE_CALL_CONNECT: String
      public const val TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE: String
      public const val TYPE_STAGE_INSTANCE_CREATE: String
      public const val TYPE_FORUM_THREAD_CREATED: String
      public const val TYPE_GUILD_SCHEDULED_EVENT_UPDATE: String
      public const val TYPE_GENERIC_PUSH_NOTIFICATION_SENT: String
      public const val TYPE_FRIEND_SUGGESTION_CREATE: String
      public const val TYPE_LOCAL_NOTIFICATION: String
      public const val TRACKING_TYPE_SUSPICIOUS_SESSION: String
      public const val TRACKING_TYPE_GUILD_STREAM_START: String
      public const val TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE: String
      public const val TRACKING_TYPE_MISSED_MESSAGE: String
      public const val TRACKING_TYPE_FRIEND_REQUEST_REMINDER: String
      public const val TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH: String
      public const val TRACKING_TYPE_TOP_MESSAGES_PUSH: String
      public const val TRACKING_TYPE_HOME_LIFECYCLE_PUSH: String
      public const val TRACKING_TYPE_TRENDING_CONTENT_PUSH: String
      public const val TRACKING_TYPE_POLL_ENDED: String
      public const val TRACKING_TYPE_REACTIONS: String
      public const val TRACKING_TYPE_NEW_USER_SESSION: String
      public const val MSG_MUTE_MIN_COUNT: Int

      public fun serializer(): KSerializer<NotificationData> {
         return NotificationData.$serializer.INSTANCE;
      }
   }
}
