package com.discord.notifications.api

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.Y
import ba.h
import ba.p0
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import g8.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
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
   @f(
      with = ChannelListSerializer.class
   )
   public final val ackChannelIds: List<ChannelId>

   public final val activityInstanceId: String?
   public final val activityName: String?
   public final val activityType: Int?
   public final val appDm: Boolean
   public final val appState: String?
   public final val applicationIcon: String?
   public final val applicationId: ApplicationId?
   public final val applicationName: String?

   @f(
      with = CanReplySerializer.class
   )
   public final val canReply: Boolean

   public final val channelIcon: String?
   public final val channelId: ChannelId?
   public final val channelName: String?
   public final val channelRtcRegion: String?
   public final val channelType: Int?
   public final val deeplink: String?
   public final val expandSubtitle: Boolean?
   public final val guildIcon: String?
   public final val guildId: GuildId?
   public final val guildName: String?
   public final val guildScheduledEventEntityType: Int?
   public final val iconUrl: String?
   public final val imageAttachmentUrl: String?
   public final val isFromCurrentUser: Boolean
   public final val joinId: String?
   public final val mentionType: String?

   @f(
      with = NotificationMessageSerializer.class
   )
   public final val message: NotificationMessage?

   public final val messageActivityType: Int?
   public final val messageApplicationName: String?
   public final val messageContent: String?
   public final val messageFlags: Long?
   public final val messageId: MessageId?
   public final val messageReferenceType: Int?
   public final val messageType: Int?
   public final val notifInstanceId: String?
   public final val notifTypeId: String?
   public final val notificationChannel: String?
   public final val parentId: ChannelId?
   public final val parentName: String?
   public final val platformUserUsername: String?
   public final val receivingUserId: UserId?
   public final val relationshipType: Int?
   public final val silent: Boolean
   public final val stageInstanceTopic: String?
   public final val subtitle: String?
   public final val timeReceived: String?
   public final val title: String?
   public final val trackingType: String?
   public final val type: String
   public final val userAvatar: String?
   public final val userDiscriminator: Int?
   public final val userGlobalName: String?
   public final val userGuildAvatar: String?
   public final val userId: UserId?
   public final val userInfo: Map<String, String>
   public final val userUsername: String?

   fun NotificationData(
      var1: Int,
      var2: Int,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: Int,
      var6: java.lang.String,
      var7: Int,
      var8: java.lang.String,
      var9: java.lang.Long,
      var10: Int,
      var11: java.lang.String,
      var12: ChannelId,
      var13: java.lang.String,
      var14: java.lang.String,
      var15: ChannelId,
      var16: Int,
      var17: java.lang.String,
      var18: MutableList<ChannelId>,
      var19: UserId,
      var20: java.lang.String,
      var21: java.lang.String,
      var22: Int,
      var23: java.lang.String,
      var24: java.lang.String,
      var25: java.lang.String,
      var26: Int,
      var27: GuildId,
      var28: java.lang.String,
      var29: java.lang.String,
      var30: java.lang.String,
      var31: Int,
      var32: java.lang.String,
      var33: ApplicationId,
      var34: java.lang.String,
      var35: java.lang.String,
      var36: NotificationMessage,
      var37: java.lang.String,
      var38: Int,
      var39: Boolean,
      var40: Boolean,
      var41: UserId,
      var42: java.lang.String,
      var43: java.lang.String,
      var44: java.lang.String,
      var45: java.lang.String,
      var46: java.lang.String,
      var47: java.lang.String,
      var48: java.lang.Boolean,
      var49: java.lang.String,
      var50: java.lang.String,
      var51: Boolean,
      var52: MutableMap<java.lang.String, java.lang.String>,
      var53: Boolean,
      var54: java.lang.String,
      var55: java.lang.String,
      var56: java.lang.String,
      var57: java.lang.String,
      var58: java.lang.String,
      var59: SerializationConstructorMarker
   ) {
      val var60: Boolean;
      if (1 != (var1 and 1)) {
         var60 = true;
      } else {
         var60 = false;
      }

      if (var60) {
         p0.a(new int[]{var1, var2}, new int[]{1, 0}, NotificationData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.type = var3;
      if ((var1 and 2) == 0) {
         this.messageId = null;
      } else {
         this.messageId = var4;
      }

      if ((var1 and 4) == 0) {
         this.messageActivityType = null;
      } else {
         this.messageActivityType = var5;
      }

      if ((var1 and 8) == 0) {
         this.messageApplicationName = null;
      } else {
         this.messageApplicationName = var6;
      }

      if ((var1 and 16) == 0) {
         this.messageType = null;
      } else {
         this.messageType = var7;
      }

      if ((var1 and 32) == 0) {
         this.messageContent = null;
      } else {
         this.messageContent = var8;
      }

      if ((var1 and 64) == 0) {
         this.messageFlags = null;
      } else {
         this.messageFlags = var9;
      }

      if ((var1 and 128) == 0) {
         this.channelType = null;
      } else {
         this.channelType = var10;
      }

      if ((var1 and 256) == 0) {
         this.channelName = null;
      } else {
         this.channelName = var11;
      }

      if ((var1 and 512) == 0) {
         this.channelId = null;
      } else {
         this.channelId = var12;
      }

      if ((var1 and 1024) == 0) {
         this.channelIcon = null;
      } else {
         this.channelIcon = var13;
      }

      if ((var1 and 2048) == 0) {
         this.parentName = null;
      } else {
         this.parentName = var14;
      }

      if ((var1 and 4096) == 0) {
         this.parentId = null;
      } else {
         this.parentId = var15;
      }

      if ((var1 and 8192) == 0) {
         this.messageReferenceType = null;
      } else {
         this.messageReferenceType = var16;
      }

      if ((var1 and 16384) == 0) {
         this.channelRtcRegion = null;
      } else {
         this.channelRtcRegion = var17;
      }

      if ((var1 and '耀') == 0) {
         var18 = i.k();
      }

      this.ackChannelIds = var18;
      if ((var1 and 65536) == 0) {
         this.userId = null;
      } else {
         this.userId = var19;
      }

      if ((var1 and 131072) == 0) {
         this.userUsername = null;
      } else {
         this.userUsername = var20;
      }

      if ((var1 and 262144) == 0) {
         this.userGlobalName = null;
      } else {
         this.userGlobalName = var21;
      }

      if ((var1 and 524288) == 0) {
         this.userDiscriminator = null;
      } else {
         this.userDiscriminator = var22;
      }

      if ((1048576 and var1) == 0) {
         this.userAvatar = null;
      } else {
         this.userAvatar = var23;
      }

      if ((2097152 and var1) == 0) {
         this.userGuildAvatar = null;
      } else {
         this.userGuildAvatar = var24;
      }

      if ((4194304 and var1) == 0) {
         this.platformUserUsername = null;
      } else {
         this.platformUserUsername = var25;
      }

      if ((8388608 and var1) == 0) {
         this.relationshipType = null;
      } else {
         this.relationshipType = var26;
      }

      if ((16777216 and var1) == 0) {
         this.guildId = null;
      } else {
         this.guildId = var27;
      }

      if ((33554432 and var1) == 0) {
         this.guildName = null;
      } else {
         this.guildName = var28;
      }

      if ((67108864 and var1) == 0) {
         this.guildIcon = null;
      } else {
         this.guildIcon = var29;
      }

      if ((134217728 and var1) == 0) {
         this.activityInstanceId = null;
      } else {
         this.activityInstanceId = var30;
      }

      if ((268435456 and var1) == 0) {
         this.activityType = null;
      } else {
         this.activityType = var31;
      }

      if ((536870912 and var1) == 0) {
         this.activityName = null;
      } else {
         this.activityName = var32;
      }

      if ((1073741824 and var1) == 0) {
         this.applicationId = null;
      } else {
         this.applicationId = var33;
      }

      if ((var1 and Integer.MIN_VALUE) == 0) {
         this.applicationName = null;
      } else {
         this.applicationName = var34;
      }

      if ((var2 and 1) == 0) {
         this.applicationIcon = null;
      } else {
         this.applicationIcon = var35;
      }

      if ((var2 and 2) == 0) {
         this.message = null;
      } else {
         this.message = var36;
      }

      if ((var2 and 4) == 0) {
         this.stageInstanceTopic = null;
      } else {
         this.stageInstanceTopic = var37;
      }

      if ((var2 and 8) == 0) {
         this.guildScheduledEventEntityType = null;
      } else {
         this.guildScheduledEventEntityType = var38;
      }

      if ((var2 and 16) == 0) {
         this.canReply = false;
      } else {
         this.canReply = var39;
      }

      if ((var2 and 32) == 0) {
         this.isFromCurrentUser = false;
      } else {
         this.isFromCurrentUser = var40;
      }

      if ((var2 and 64) == 0) {
         this.receivingUserId = null;
      } else {
         this.receivingUserId = var41;
      }

      if ((var2 and 128) == 0) {
         this.title = null;
      } else {
         this.title = var42;
      }

      if ((var2 and 256) == 0) {
         this.subtitle = null;
      } else {
         this.subtitle = var43;
      }

      if ((var2 and 512) == 0) {
         this.iconUrl = null;
      } else {
         this.iconUrl = var44;
      }

      if ((var2 and 1024) == 0) {
         this.notificationChannel = null;
      } else {
         this.notificationChannel = var45;
      }

      if ((var2 and 2048) == 0) {
         this.trackingType = null;
      } else {
         this.trackingType = var46;
      }

      if ((var2 and 4096) == 0) {
         this.deeplink = null;
      } else {
         this.deeplink = var47;
      }

      val var61: java.lang.Boolean;
      if ((var2 and 8192) == 0) {
         var61 = java.lang.Boolean.FALSE;
      } else {
         var61 = var48;
      }

      this.expandSubtitle = var61;
      if ((var2 and 16384) == 0) {
         this.imageAttachmentUrl = null;
      } else {
         this.imageAttachmentUrl = var49;
      }

      if ((var2 and '耀') == 0) {
         this.timeReceived = null;
      } else {
         this.timeReceived = var50;
      }

      if ((var2 and 65536) == 0) {
         this.silent = false;
      } else {
         this.silent = var51;
      }

      if ((var2 and 131072) == 0) {
         var52 = q.h();
      }

      this.userInfo = var52;
      if ((var2 and 262144) == 0) {
         this.appDm = false;
      } else {
         this.appDm = var53;
      }

      if ((var2 and 524288) == 0) {
         this.notifTypeId = null;
      } else {
         this.notifTypeId = var54;
      }

      if ((1048576 and var2) == 0) {
         this.notifInstanceId = null;
      } else {
         this.notifInstanceId = var55;
      }

      if ((2097152 and var2) == 0) {
         this.joinId = null;
      } else {
         this.joinId = var56;
      }

      if ((4194304 and var2) == 0) {
         this.mentionType = null;
      } else {
         this.mentionType = var57;
      }

      if ((8388608 and var2) == 0) {
         this.appState = null;
      } else {
         this.appState = var58;
      }
   }

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
      kotlin.jvm.internal.q.h(var1, "type");
      kotlin.jvm.internal.q.h(var16, "ackChannelIds");
      kotlin.jvm.internal.q.h(var50, "userInfo");
      super();
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
      kotlin.jvm.internal.q.h(var1, "type");
      kotlin.jvm.internal.q.h(var16, "ackChannelIds");
      kotlin.jvm.internal.q.h(var50, "userInfo");
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
         if (!kotlin.jvm.internal.q.c(this.type, var1.type)) {
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
            } else if (!kotlin.jvm.internal.q.c(this.messageActivityType, var1.messageActivityType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageApplicationName, var1.messageApplicationName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageType, var1.messageType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageContent, var1.messageContent)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageFlags, var1.messageFlags)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelType, var1.channelType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelName, var1.channelName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelId, var1.channelId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelIcon, var1.channelIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.parentName, var1.parentName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.parentId, var1.parentId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageReferenceType, var1.messageReferenceType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelRtcRegion, var1.channelRtcRegion)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.ackChannelIds, var1.ackChannelIds)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userId, var1.userId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userUsername, var1.userUsername)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userGlobalName, var1.userGlobalName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userDiscriminator, var1.userDiscriminator)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userAvatar, var1.userAvatar)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userGuildAvatar, var1.userGuildAvatar)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.platformUserUsername, var1.platformUserUsername)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.relationshipType, var1.relationshipType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildId, var1.guildId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildName, var1.guildName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildIcon, var1.guildIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityInstanceId, var1.activityInstanceId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityType, var1.activityType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityName, var1.activityName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationId, var1.applicationId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationName, var1.applicationName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationIcon, var1.applicationIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.message, var1.message)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.stageInstanceTopic, var1.stageInstanceTopic)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildScheduledEventEntityType, var1.guildScheduledEventEntityType)) {
               return false;
            } else if (this.canReply != var1.canReply) {
               return false;
            } else if (this.isFromCurrentUser != var1.isFromCurrentUser) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.receivingUserId, var1.receivingUserId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.title, var1.title)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.subtitle, var1.subtitle)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.iconUrl, var1.iconUrl)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notificationChannel, var1.notificationChannel)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.trackingType, var1.trackingType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.deeplink, var1.deeplink)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.expandSubtitle, var1.expandSubtitle)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.imageAttachmentUrl, var1.imageAttachmentUrl)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.timeReceived, var1.timeReceived)) {
               return false;
            } else if (this.silent != var1.silent) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userInfo, var1.userInfo)) {
               return false;
            } else if (this.appDm != var1.appDm) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notifTypeId, var1.notifTypeId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notifInstanceId, var1.notifInstanceId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.joinId, var1.joinId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.mentionType, var1.mentionType)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.appState, var1.appState);
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

      val var54: Int = java.lang.Boolean.hashCode(this.silent);
      val var56: Int = this.userInfo.hashCode();
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
                                                                        + var54
                                                                  )
                                                                  * 31
                                                               + var56
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

      val var7: Int = this.messageActivityType;
      val var25: java.lang.String = this.messageApplicationName;
      val var47: Int = this.messageType;
      val var22: java.lang.String = this.messageContent;
      val var14: java.lang.Long = this.messageFlags;
      val var31: Int = this.channelType;
      val var45: java.lang.String = this.channelName;
      val var20: ChannelId = this.channelId;
      val var39: java.lang.String = this.channelIcon;
      val var46: java.lang.String = this.parentName;
      val var8: ChannelId = this.parentId;
      val var44: Int = this.messageReferenceType;
      val var17: java.lang.String = this.channelRtcRegion;
      val var38: java.util.List = this.ackChannelIds;
      val var56: UserId = this.userId;
      val var41: java.lang.String = this.userUsername;
      val var28: java.lang.String = this.userGlobalName;
      val var21: Int = this.userDiscriminator;
      val var40: java.lang.String = this.userAvatar;
      val var9: java.lang.String = this.userGuildAvatar;
      val var52: java.lang.String = this.platformUserUsername;
      val var32: Int = this.relationshipType;
      val var30: GuildId = this.guildId;
      val var27: java.lang.String = this.guildName;
      val var33: java.lang.String = this.guildIcon;
      val var50: java.lang.String = this.activityInstanceId;
      val var26: Int = this.activityType;
      val var19: java.lang.String = this.activityName;
      val var24: ApplicationId = this.applicationId;
      val var10: java.lang.String = this.applicationName;
      val var35: java.lang.String = this.applicationIcon;
      val var42: NotificationMessage = this.message;
      val var23: java.lang.String = this.stageInstanceTopic;
      val var12: Int = this.guildScheduledEventEntityType;
      val var1: Boolean = this.canReply;
      val var3: Boolean = this.isFromCurrentUser;
      val var36: UserId = this.receivingUserId;
      val var55: java.lang.String = this.title;
      val var34: java.lang.String = this.subtitle;
      val var15: java.lang.String = this.iconUrl;
      val var53: java.lang.String = this.notificationChannel;
      val var49: java.lang.String = this.trackingType;
      val var48: java.lang.String = this.deeplink;
      val var43: java.lang.Boolean = this.expandSubtitle;
      val var57: java.lang.String = this.imageAttachmentUrl;
      val var13: java.lang.String = this.timeReceived;
      val var2: Boolean = this.silent;
      val var37: java.util.Map = this.userInfo;
      val var4: Boolean = this.appDm;
      val var51: java.lang.String = this.notifTypeId;
      val var11: java.lang.String = this.notifInstanceId;
      val var18: java.lang.String = this.joinId;
      val var54: java.lang.String = this.mentionType;
      val var29: java.lang.String = this.appState;
      val var16: StringBuilder = new StringBuilder();
      var16.append("NotificationData(type=");
      var16.append(var6);
      var16.append(", messageId=");
      var16.append(var58);
      var16.append(", messageActivityType=");
      var16.append(var7);
      var16.append(", messageApplicationName=");
      var16.append(var25);
      var16.append(", messageType=");
      var16.append(var47);
      var16.append(", messageContent=");
      var16.append(var22);
      var16.append(", messageFlags=");
      var16.append(var14);
      var16.append(", channelType=");
      var16.append(var31);
      var16.append(", channelName=");
      var16.append(var45);
      var16.append(", channelId=");
      var16.append(var20);
      var16.append(", channelIcon=");
      var16.append(var39);
      var16.append(", parentName=");
      var16.append(var46);
      var16.append(", parentId=");
      var16.append(var8);
      var16.append(", messageReferenceType=");
      var16.append(var44);
      var16.append(", channelRtcRegion=");
      var16.append(var17);
      var16.append(", ackChannelIds=");
      var16.append(var38);
      var16.append(", userId=");
      var16.append(var56);
      var16.append(", userUsername=");
      var16.append(var41);
      var16.append(", userGlobalName=");
      var16.append(var28);
      var16.append(", userDiscriminator=");
      var16.append(var21);
      var16.append(", userAvatar=");
      var16.append(var40);
      var16.append(", userGuildAvatar=");
      var16.append(var9);
      var16.append(", platformUserUsername=");
      var16.append(var52);
      var16.append(", relationshipType=");
      var16.append(var32);
      var16.append(", guildId=");
      var16.append(var30);
      var16.append(", guildName=");
      var16.append(var27);
      var16.append(", guildIcon=");
      var16.append(var33);
      var16.append(", activityInstanceId=");
      var16.append(var50);
      var16.append(", activityType=");
      var16.append(var26);
      var16.append(", activityName=");
      var16.append(var19);
      var16.append(", applicationId=");
      var16.append(var24);
      var16.append(", applicationName=");
      var16.append(var10);
      var16.append(", applicationIcon=");
      var16.append(var35);
      var16.append(", message=");
      var16.append(var42);
      var16.append(", stageInstanceTopic=");
      var16.append(var23);
      var16.append(", guildScheduledEventEntityType=");
      var16.append(var12);
      var16.append(", canReply=");
      var16.append(var1);
      var16.append(", isFromCurrentUser=");
      var16.append(var3);
      var16.append(", receivingUserId=");
      var16.append(var36);
      var16.append(", title=");
      var16.append(var55);
      var16.append(", subtitle=");
      var16.append(var34);
      var16.append(", iconUrl=");
      var16.append(var15);
      var16.append(", notificationChannel=");
      var16.append(var53);
      var16.append(", trackingType=");
      var16.append(var49);
      var16.append(", deeplink=");
      var16.append(var48);
      var16.append(", expandSubtitle=");
      var16.append(var43);
      var16.append(", imageAttachmentUrl=");
      var16.append(var57);
      var16.append(", timeReceived=");
      var16.append(var13);
      var16.append(", silent=");
      var16.append(var2);
      var16.append(", userInfo=");
      var16.append(var37);
      var16.append(", appDm=");
      var16.append(var4);
      var16.append(", notifTypeId=");
      var16.append(var51);
      var16.append(", notifInstanceId=");
      var16.append(var11);
      var16.append(", joinId=");
      var16.append(var18);
      var16.append(", mentionType=");
      var16.append(var54);
      var16.append(", appState=");
      var16.append(var29);
      var16.append(")");
      return var16.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: NotificationData.$serializer = new NotificationData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.NotificationData", var0, 56);
         var1.l("type", false);
         var1.l("message_id", true);
         var1.l("message_activity_type", true);
         var1.l("message_application_name", true);
         var1.l("message_type_", true);
         var1.l("message_content", true);
         var1.l("message_flags", true);
         var1.l("channel_type", true);
         var1.l("channel_name", true);
         var1.l("channel_id", true);
         var1.l("channel_icon", true);
         var1.l("parent_name", true);
         var1.l("parent_id", true);
         var1.l("message_reference_type", true);
         var1.l("rtc_region", true);
         var1.l("channel_ids", true);
         var1.l("user_id", true);
         var1.l("user_username", true);
         var1.l("user_global_name", true);
         var1.l("user_discriminator", true);
         var1.l("user_avatar", true);
         var1.l("user_guild_avatar", true);
         var1.l("platform_user_username", true);
         var1.l("rel_type", true);
         var1.l("guild_id", true);
         var1.l("guild_name", true);
         var1.l("guild_icon", true);
         var1.l("activity_instance_id", true);
         var1.l("activity_type", true);
         var1.l("activity_name", true);
         var1.l("application_id", true);
         var1.l("application_name", true);
         var1.l("application_icon", true);
         var1.l("message", true);
         var1.l("stage_instance_topic", true);
         var1.l("guild_scheduled_event_entity_type", true);
         var1.l("__category", true);
         var1.l("is_from_current_user", true);
         var1.l("receiving_user_id", true);
         var1.l("title", true);
         var1.l("subtitle", true);
         var1.l("icon_url", true);
         var1.l("notification_channel", true);
         var1.l("tracking_type", true);
         var1.l("deeplink", true);
         var1.l("expand_subtitle", true);
         var1.l("image_url", true);
         var1.l("time_received", true);
         var1.l("silent", true);
         var1.l("userInfo", true);
         var1.l("app_dm", true);
         var1.l("notif_type_id", true);
         var1.l("notif_instance_id", true);
         var1.l("join_id", true);
         var1.l("mention_type", true);
         var1.l("app_state", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var47: Array<KSerializer> = NotificationData.access$get$childSerializers$cp();
         val var5: C0 = C0.a;
         val var12: KSerializer = a.u(MessageId.$serializer.INSTANCE);
         val var35: N = N.a;
         val var11: KSerializer = a.u(N.a);
         val var10: KSerializer = a.u(var5);
         val var1: KSerializer = a.u(var35);
         val var4: KSerializer = a.u(var5);
         val var8: KSerializer = a.u(Y.a);
         val var7: KSerializer = a.u(var35);
         val var2: KSerializer = a.u(var5);
         val var13: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var6: KSerializer = a.u(ChannelId.$serializer.INSTANCE);
         val var3: KSerializer = a.u(var5);
         val var9: KSerializer = a.u(var5);
         val var18: KSerializer = a.u(var13);
         val var22: KSerializer = a.u(var35);
         val var26: KSerializer = a.u(var5);
         val var37: UserId.$serializer = UserId.$serializer.INSTANCE;
         val var20: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var25: KSerializer = a.u(var5);
         val var28: KSerializer = a.u(var5);
         val var19: KSerializer = a.u(var35);
         val var16: KSerializer = a.u(var5);
         val var17: KSerializer = a.u(var5);
         val var24: KSerializer = a.u(var5);
         val var14: KSerializer = a.u(var35);
         val var29: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var23: KSerializer = a.u(var5);
         val var33: KSerializer = a.u(var5);
         val var53: KSerializer = a.u(var5);
         val var27: KSerializer = a.u(var35);
         val var15: KSerializer = a.u(var5);
         val var31: KSerializer = a.u(ApplicationId.$serializer.INSTANCE);
         val var21: KSerializer = a.u(var5);
         val var34: KSerializer = a.u(var5);
         val var30: KSerializer = a.u(NotificationMessageSerializer.INSTANCE);
         val var32: KSerializer = a.u(var5);
         val var54: KSerializer = a.u(var35);
         val var36: h = h.a;
         return new KSerializer[]{
            var5,
            var12,
            var11,
            var10,
            var1,
            var4,
            var8,
            var7,
            var2,
            var6,
            var3,
            var9,
            var18,
            var22,
            var26,
            ChannelListSerializer.INSTANCE,
            var20,
            var25,
            var28,
            var19,
            var16,
            var17,
            var24,
            var14,
            var29,
            var23,
            var33,
            var53,
            var27,
            var15,
            var31,
            var21,
            var34,
            var30,
            var32,
            var54,
            CanReplySerializer.INSTANCE,
            h.a,
            a.u(var37),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var36),
            a.u(var5),
            a.u(var5),
            var36,
            var47[49],
            var36,
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var5),
            a.u(var5)
         };
      }

      public open fun deserialize(decoder: Decoder): NotificationData {
         kotlin.jvm.internal.q.h(var1, "decoder");
         val var76: SerialDescriptor = this.getDescriptor();
         val var77: c = var1.c(var76);
         val var78: Array<KSerializer> = NotificationData.access$get$childSerializers$cp();
         var var3: Byte;
         val var4: Byte;
         var var5: Byte;
         var var6: Int;
         var var7: Byte;
         var var9: Int;
         var var13: java.lang.String;
         var var17: Any;
         var var22: Any;
         var var29: java.lang.String;
         var var32: java.lang.String;
         var var33: java.lang.String;
         var var34: java.lang.String;
         var var36: Any;
         var var37: java.lang.String;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: Any;
         var var41: java.lang.String;
         var var42: Any;
         var var43: java.lang.String;
         var var44: java.lang.String;
         var var45: Any;
         var var46: java.lang.String;
         var var47: java.lang.String;
         var var48: java.lang.String;
         var var49: java.lang.String;
         var var50: Any;
         var var51: java.lang.String;
         var var52: java.lang.String;
         var var53: java.lang.String;
         var var54: Any;
         var var55: java.lang.String;
         var var56: Any;
         var var57: java.lang.String;
         var var58: java.lang.String;
         var var59: Any;
         var var60: Any;
         var var61: Any;
         var var62: Any;
         var var63: java.lang.String;
         var var64: java.lang.String;
         var var65: java.lang.String;
         var var66: java.lang.String;
         var var67: Any;
         var var68: java.lang.String;
         val var70: Any;
         val var82: java.lang.String;
         var var94: java.lang.String;
         var var97: java.lang.String;
         var var108: java.lang.String;
         var var113: Any;
         var var142: java.lang.String;
         var var154: Any;
         var var169: java.lang.String;
         var var174: Any;
         var var191: Any;
         var var368: java.lang.String;
         if (var77.y()) {
            var47 = var77.t(var76, 0);
            val var79: MessageId = var77.v(var76, 1, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var80: java.lang.String;
            if (var79 != null) {
               var80 = var79.unbox-impl();
            } else {
               var80 = null;
            }

            val var12: N = N.a;
            var56 = var77.v(var76, 2, N.a, null) as Int;
            val var10: C0 = C0.a;
            var49 = var77.v(var76, 3, C0.a, null) as java.lang.String;
            var45 = var77.v(var76, 4, var12, null) as Int;
            var33 = var77.v(var76, 5, var10, null) as java.lang.String;
            var154 = var77.v(var76, 6, Y.a, null) as java.lang.Long;
            var36 = var77.v(var76, 7, var12, null) as Int;
            var48 = var77.v(var76, 8, var10, null) as java.lang.String;
            val var11: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
            val var23: ChannelId = var77.v(var76, 9, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var174 = var77.v(var76, 10, var10, null) as java.lang.String;
            var34 = var77.v(var76, 11, var10, null) as java.lang.String;
            var59 = var77.v(var76, 12, var11, null) as ChannelId;
            var22 = var77.v(var76, 13, var12, null) as Int;
            var37 = var77.v(var76, 14, var10, null) as java.lang.String;
            var42 = var77.m(var76, 15, ChannelListSerializer.INSTANCE, null) as java.util.List;
            val var95: UserId.$serializer = UserId.$serializer.INSTANCE;
            var54 = var77.v(var76, 16, UserId.$serializer.INSTANCE, null) as UserId;
            var41 = var77.v(var76, 17, var10, null) as java.lang.String;
            var39 = var77.v(var76, 18, var10, null) as java.lang.String;
            var40 = var77.v(var76, 19, var12, null) as Int;
            var29 = var77.v(var76, 20, var10, null) as java.lang.String;
            var64 = var77.v(var76, 21, var10, null) as java.lang.String;
            var63 = var77.v(var76, 22, var10, null) as java.lang.String;
            val var30: Int = var77.v(var76, 23, var12, null) as Int;
            val var24: GuildId = var77.v(var76, 24, GuildId.$serializer.INSTANCE, null) as GuildId;
            val var25: java.lang.String = var77.v(var76, 25, var10, null) as java.lang.String;
            val var21: java.lang.String = var77.v(var76, 26, var10, null) as java.lang.String;
            val var20: java.lang.String = var77.v(var76, 27, var10, null) as java.lang.String;
            val var19: Int = var77.v(var76, 28, var12, null) as Int;
            val var18: java.lang.String = var77.v(var76, 29, var10, null) as java.lang.String;
            var17 = var77.v(var76, 30, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            val var26: java.lang.String = var77.v(var76, 31, var10, null) as java.lang.String;
            var113 = var77.v(var76, 32, var10, null) as java.lang.String;
            val var15: NotificationMessage = var77.v(var76, 33, NotificationMessageSerializer.INSTANCE, null) as NotificationMessage;
            var13 = var77.v(var76, 34, var10, null) as java.lang.String;
            val var14: Int = var77.v(var76, 35, var12, null) as Int;
            var5 = var77.m(var76, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.FALSE) as java.lang.Boolean;
            var4 = var77.s(var76, 37);
            var61 = var77.v(var76, 38, var95, null) as UserId;
            val var102: java.lang.String = var77.v(var76, 39, var10, null) as java.lang.String;
            var43 = var77.v(var76, 40, var10, null) as java.lang.String;
            var32 = var77.v(var76, 41, var10, null) as java.lang.String;
            var51 = var77.v(var76, 42, var10, null) as java.lang.String;
            var66 = var77.v(var76, 43, var10, null) as java.lang.String;
            var38 = var77.v(var76, 44, var10, null) as java.lang.String;
            var60 = var77.v(var76, 45, h.a, null) as java.lang.Boolean;
            var97 = var77.v(var76, 46, var10, null) as java.lang.String;
            var58 = var77.v(var76, 47, var10, null) as java.lang.String;
            var3 = var77.s(var76, 48);
            var191 = var77.m(var76, 49, var78[49], null) as java.util.Map;
            val var2: Byte = var77.s(var76, 50);
            val var28: java.lang.String = var77.v(var76, 51, var10, null) as java.lang.String;
            var57 = var77.v(var76, 52, var10, null) as java.lang.String;
            var368 = var77.v(var76, 53, var10, null) as java.lang.String;
            val var71: java.lang.String = var77.v(var76, 54, var10, null) as java.lang.String;
            var94 = var77.v(var76, 55, var10, null) as java.lang.String;
            var55 = var80;
            var6 = 16777215;
            var9 = -1;
            var67 = var154;
            var154 = var23;
            var142 = (java.lang.String)var174;
            var62 = var30;
            var174 = var24;
            var46 = var25;
            var53 = var21;
            var65 = var20;
            var191 = var19;
            var169 = var18;
            var52 = var26;
            var68 = (java.lang.String)var113;
            var113 = var15;
            var70 = var14;
            var108 = var102;
            var44 = var97;
            var50 = var191;
            var7 = var2;
            var97 = var28;
            var82 = var368;
            var368 = var71;
         } else {
            var57 = null;
            var var88: Boolean = true;
            var6 = 0;
            var var86: Byte = 0;
            var var8: Byte = 0;
            var5 = 0;
            var3 = 0;
            var9 = 0;
            var94 = null;
            var38 = null;
            var32 = null;
            var53 = null;
            var60 = null;
            var191 = null;
            var108 = null;
            var59 = null;
            var52 = null;
            var51 = null;
            var50 = null;
            var58 = null;
            var56 = null;
            var var147: java.lang.String = null;
            var34 = null;
            var33 = null;
            var var145: java.lang.String = null;
            var142 = null;
            var22 = null;
            var var135: Any = null;
            var var132: Any = null;
            var154 = null;
            var var162: java.lang.String = null;
            var29 = null;
            var169 = null;
            var174 = null;
            var37 = null;
            var42 = null;
            var54 = null;
            var113 = null;
            var39 = null;
            var40 = null;
            var97 = null;
            var var83: Any = null;
            var48 = null;
            var17 = null;
            var44 = null;
            var45 = null;
            var46 = null;
            var var103: java.lang.String = null;
            var13 = null;
            var55 = null;
            var47 = null;
            var41 = null;
            var43 = null;
            var var150: Any = null;
            var var110: Any = null;
            var36 = null;
            var var128: Any = null;
            var var123: java.lang.String = null;
            var49 = null;

            while (var88) {
               label347: {
                  label348: {
                     label284: {
                        label349: {
                           label281: {
                              label280: {
                                 label350: {
                                    label277: {
                                       label351: {
                                          label352: {
                                             label353: {
                                                label354: {
                                                   label259: {
                                                      label258: {
                                                         label257: {
                                                            label256: {
                                                               label355: {
                                                                  label249: {
                                                                     label356: {
                                                                        label357: {
                                                                           label358: {
                                                                              label359: {
                                                                                 var7 = var77.x(var76);
                                                                                 switch (var7) {
                                                                                    case -1:
                                                                                       var7 = var9;
                                                                                       var88 = false;
                                                                                       break label258;
                                                                                    case 0:
                                                                                       var47 = var77.t(var76, 0);
                                                                                       var7 = var9 or 1;
                                                                                       break label258;
                                                                                    case 1:
                                                                                       val var247: MessageId;
                                                                                       if (var55 != null) {
                                                                                          var247 = MessageId.box-impl(var55);
                                                                                       } else {
                                                                                          var247 = null;
                                                                                       }

                                                                                       val var248: MessageId = var77.v(
                                                                                          var76, 1, MessageId.$serializer.INSTANCE, var247
                                                                                       ) as MessageId;
                                                                                       if (var248 != null) {
                                                                                          var55 = var248.unbox-impl();
                                                                                       } else {
                                                                                          var55 = null;
                                                                                       }

                                                                                       var7 = var9 or 2;
                                                                                       break label258;
                                                                                    case 2:
                                                                                       var56 = var77.v(var76, 2, N.a, var56) as Int;
                                                                                       var7 = var9 or 4;
                                                                                       break label258;
                                                                                    case 3:
                                                                                       var49 = var77.v(var76, 3, C0.a, var49) as java.lang.String;
                                                                                       var7 = var9 or 8;
                                                                                       break label258;
                                                                                    case 4:
                                                                                       var45 = var77.v(var76, 4, N.a, var45) as Int;
                                                                                       var61 = var123;
                                                                                       var7 = var9 or 16;
                                                                                       var123 = (java.lang.String)var150;
                                                                                       var62 = var36;
                                                                                       break label351;
                                                                                    case 5:
                                                                                       var61 = var77.v(var76, 5, C0.a, var123) as java.lang.String;
                                                                                       var7 = var9 or 32;
                                                                                       var123 = (java.lang.String)var150;
                                                                                       var150 = var61;
                                                                                       break label358;
                                                                                    case 6:
                                                                                       var61 = var77.v(var76, 6, Y.a, var150) as java.lang.Long;
                                                                                       var7 = var9 or 64;
                                                                                       var150 = var123;
                                                                                       var123 = (java.lang.String)var61;
                                                                                       break label358;
                                                                                    case 7:
                                                                                       var62 = var77.v(var76, 7, N.a, var36) as Int;
                                                                                       var7 = var9 or 128;
                                                                                       var61 = var123;
                                                                                       var123 = (java.lang.String)var150;
                                                                                       break label351;
                                                                                    case 8:
                                                                                       var65 = var34;
                                                                                       var34 = var33;
                                                                                       var33 = (java.lang.String)var42;
                                                                                       var48 = var77.v(var76, 8, C0.a, var48) as java.lang.String;
                                                                                       var7 = var9 or 256;
                                                                                       var64 = var37;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var42 = var150;
                                                                                       var62 = var36;
                                                                                       var36 = var128;
                                                                                       var63 = var147;
                                                                                       var61 = var123;
                                                                                       break label349;
                                                                                    case 9:
                                                                                       var110 = var77.v(var76, 9, ChannelId.$serializer.INSTANCE, var110) as ChannelId;
                                                                                       var7 = var9 or 512;
                                                                                       break label357;
                                                                                    case 10:
                                                                                       var147 = var77.v(var76, 10, C0.a, var147) as java.lang.String;
                                                                                       var7 = var9 or 1024;
                                                                                       break label357;
                                                                                    case 11:
                                                                                       var34 = var77.v(var76, 11, C0.a, var34) as java.lang.String;
                                                                                       var7 = var9 or 2048;
                                                                                       break label357;
                                                                                    case 12:
                                                                                       var33 = var77.v(var76, 12, ChannelId.$serializer.INSTANCE, var33) as ChannelId;
                                                                                       var7 = var9 or 4096;
                                                                                       break label357;
                                                                                    case 13:
                                                                                       var61 = var77.v(var76, 13, N.a, var128) as Int;
                                                                                       var7 = var9 or 8192;
                                                                                       var128 = var37;
                                                                                       var37 = (java.lang.String)var61;
                                                                                       break label356;
                                                                                    case 14:
                                                                                       var61 = var77.v(var76, 14, C0.a, var37) as java.lang.String;
                                                                                       var7 = var9 or 16384;
                                                                                       var37 = (java.lang.String)var128;
                                                                                       var128 = var61;
                                                                                       break label356;
                                                                                    case 15:
                                                                                       var42 = var77.m(var76, 15, ChannelListSerializer.INSTANCE, var42) as java.util.List;
                                                                                       var64 = var37;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var110 = var128;
                                                                                       var7 = var9 or '耀';
                                                                                       var63 = var147;
                                                                                       var65 = var34;
                                                                                       var34 = var33;
                                                                                       var33 = (java.lang.String)var42;
                                                                                       break label277;
                                                                                    case 16:
                                                                                       var145 = (java.lang.String)var22;
                                                                                       var142 = (java.lang.String)var135;
                                                                                       var22 = var132;
                                                                                       var132 = var154;
                                                                                       var162 = var39;
                                                                                       var154 = var40;
                                                                                       var54 = var77.v(var76, 16, UserId.$serializer.INSTANCE, var54) as UserId;
                                                                                       var29 = var46;
                                                                                       var174 = var37;
                                                                                       var169 = (java.lang.String)var42;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var7 = var9 or 65536;
                                                                                       var66 = var53;
                                                                                       var67 = var52;
                                                                                       var68 = var51;
                                                                                       var368 = (java.lang.String)var50;
                                                                                       var83 = var38;
                                                                                       var97 = (java.lang.String)var113;
                                                                                       var103 = var32;
                                                                                       var110 = var83;
                                                                                       var113 = var174;
                                                                                       var17 = var169;
                                                                                       var123 = var29;
                                                                                       var128 = var162;
                                                                                       var135 = var17;
                                                                                       var147 = var142;
                                                                                       var150 = var145;
                                                                                       var32 = var33;
                                                                                       var33 = var34;
                                                                                       var34 = var103;
                                                                                       var38 = (java.lang.String)var150;
                                                                                       var39 = (java.lang.String)var36;
                                                                                       var40 = var128;
                                                                                       var42 = var147;
                                                                                       var46 = var123;
                                                                                       var36 = var97;
                                                                                       break label347;
                                                                                    case 17:
                                                                                       var40 = var39;
                                                                                       var113 = var77.v(var76, 17, C0.a, var113) as java.lang.String;
                                                                                       var7 = var9 or 131072;
                                                                                       var39 = (java.lang.String)var40;
                                                                                       break label350;
                                                                                    case 18:
                                                                                       var61 = var77.v(var76, 18, C0.a, var39) as java.lang.String;
                                                                                       var7 = var9 or 262144;
                                                                                       var39 = (java.lang.String)var40;
                                                                                       var40 = var61;
                                                                                       break label350;
                                                                                    case 19:
                                                                                       var40 = var77.v(var76, 19, N.a, var40) as Int;
                                                                                       var7 = var9 or 524288;
                                                                                       var39 = (java.lang.String)var40;
                                                                                       var40 = var39;
                                                                                       break label350;
                                                                                    case 20:
                                                                                       var145 = var77.v(var76, 20, C0.a, var145) as java.lang.String;
                                                                                       var7 = var9 or 1048576;
                                                                                       break label354;
                                                                                    case 21:
                                                                                       var142 = var77.v(var76, 21, C0.a, var142) as java.lang.String;
                                                                                       var7 = var9 or 2097152;
                                                                                       break label354;
                                                                                    case 22:
                                                                                       var22 = var77.v(var76, 22, C0.a, var22) as java.lang.String;
                                                                                       var7 = var9 or 4194304;
                                                                                       break label354;
                                                                                    case 23:
                                                                                       var135 = var77.v(var76, 23, N.a, var135) as Int;
                                                                                       var7 = var9 or 8388608;
                                                                                       break label354;
                                                                                    case 24:
                                                                                       var132 = var77.v(var76, 24, GuildId.$serializer.INSTANCE, var132) as GuildId;
                                                                                       var7 = var9 or 16777216;
                                                                                       break label354;
                                                                                    case 25:
                                                                                       var162 = var169;
                                                                                       var174 = var154;
                                                                                       var46 = var77.v(var76, 25, C0.a, var46) as java.lang.String;
                                                                                       var7 = var9 or 33554432;
                                                                                       var154 = var174;
                                                                                       var169 = var162;
                                                                                       break label280;
                                                                                    case 26:
                                                                                       var62 = var77.v(var76, 26, C0.a, var154) as java.lang.String;
                                                                                       var7 = var9 or 67108864;
                                                                                       var154 = var174;
                                                                                       var162 = var169;
                                                                                       var169 = var162;
                                                                                       var174 = var62;
                                                                                       break label280;
                                                                                    case 27:
                                                                                       var62 = var77.v(var76, 27, C0.a, var162) as java.lang.String;
                                                                                       var7 = var9 or 134217728;
                                                                                       var154 = var174;
                                                                                       var162 = var169;
                                                                                       var169 = (java.lang.String)var62;
                                                                                       var174 = var154;
                                                                                       break label280;
                                                                                    case 28:
                                                                                       var29 = var77.v(var76, 28, N.a, var29) as Int;
                                                                                       var7 = var9 or 268435456;
                                                                                       var154 = var174;
                                                                                       var162 = var169;
                                                                                       var169 = var162;
                                                                                       var174 = var154;
                                                                                       break label280;
                                                                                    case 29:
                                                                                       var62 = var77.v(var76, 29, C0.a, var169) as java.lang.String;
                                                                                       var7 = var9 or 536870912;
                                                                                       var169 = var162;
                                                                                       var162 = (java.lang.String)var62;
                                                                                       var154 = var174;
                                                                                       var174 = var154;
                                                                                       break label280;
                                                                                    case 30:
                                                                                       var61 = var77.v(var76, 30, ApplicationId.$serializer.INSTANCE, var174) as ApplicationId;
                                                                                       var7 = var9 or 1073741824;
                                                                                       var162 = var169;
                                                                                       var174 = var154;
                                                                                       var169 = var162;
                                                                                       var154 = var61;
                                                                                       break label280;
                                                                                    case 31:
                                                                                       var103 = var77.v(var76, 31, C0.a, var103) as java.lang.String;
                                                                                       var32 = var33;
                                                                                       var147 = var142;
                                                                                       var145 = (java.lang.String)var22;
                                                                                       var142 = (java.lang.String)var135;
                                                                                       var22 = var132;
                                                                                       var132 = var154;
                                                                                       var17 = var169;
                                                                                       var174 = var37;
                                                                                       var169 = (java.lang.String)var42;
                                                                                       var162 = var39;
                                                                                       var154 = var40;
                                                                                       var29 = var46;
                                                                                       var40 = var128;
                                                                                       var46 = var123;
                                                                                       var7 = var9 or Integer.MIN_VALUE;
                                                                                       var66 = var53;
                                                                                       var67 = var52;
                                                                                       var68 = var51;
                                                                                       var368 = (java.lang.String)var50;
                                                                                       var83 = var38;
                                                                                       var97 = (java.lang.String)var113;
                                                                                       var103 = var32;
                                                                                       var110 = var83;
                                                                                       var113 = var174;
                                                                                       var123 = var29;
                                                                                       var128 = var162;
                                                                                       var135 = var17;
                                                                                       var150 = var145;
                                                                                       var33 = var34;
                                                                                       var34 = var103;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var38 = (java.lang.String)var150;
                                                                                       var39 = (java.lang.String)var36;
                                                                                       var42 = var147;
                                                                                       var36 = var97;
                                                                                       break label347;
                                                                                    case 32:
                                                                                       var97 = var77.v(var76, 32, C0.a, var97) as java.lang.String;
                                                                                       var6 |= 1;
                                                                                       var83 = var191;
                                                                                       var61 = var53;
                                                                                       var53 = var52;
                                                                                       var52 = var51;
                                                                                       var97 = (java.lang.String)var50;
                                                                                       var17 = var38;
                                                                                       var51 = (java.lang.String)var83;
                                                                                       var38 = (java.lang.String)var17;
                                                                                       var50 = var97;
                                                                                       break label348;
                                                                                    case 33:
                                                                                       var83 = var77.v(var76, 33, NotificationMessageSerializer.INSTANCE, var83) as NotificationMessage;
                                                                                       var6 |= 2;
                                                                                       break;
                                                                                    case 34:
                                                                                       var13 = var77.v(var76, 34, C0.a, var13) as java.lang.String;
                                                                                       var6 |= 4;
                                                                                       break;
                                                                                    case 35:
                                                                                       var17 = var77.v(var76, 35, N.a, var17) as Int;
                                                                                       var6 |= 8;
                                                                                       break;
                                                                                    case 36:
                                                                                       var86 = var77.m(
                                                                                          var76,
                                                                                          36,
                                                                                          CanReplySerializer.INSTANCE,
                                                                                          java.lang.Boolean.valueOf((boolean)var86)
                                                                                       ) as java.lang.Boolean;
                                                                                       var6 |= 16;
                                                                                       break;
                                                                                    case 37:
                                                                                       var3 = var77.s(var76, 37);
                                                                                       var6 |= 32;
                                                                                       break label355;
                                                                                    case 38:
                                                                                       var44 = var77.v(var76, 38, UserId.$serializer.INSTANCE, var44) as UserId;
                                                                                       var6 |= 64;
                                                                                       break;
                                                                                    case 39:
                                                                                       var41 = var77.v(var76, 39, C0.a, var41) as java.lang.String;
                                                                                       var6 |= 128;
                                                                                       break;
                                                                                    case 40:
                                                                                       var43 = var77.v(var76, 40, C0.a, var43) as java.lang.String;
                                                                                       var6 |= 256;
                                                                                       break;
                                                                                    case 41:
                                                                                       var61 = var77.v(var76, 41, C0.a, var191) as java.lang.String;
                                                                                       var6 |= 512;
                                                                                       var191 = var83;
                                                                                       break label249;
                                                                                    case 42:
                                                                                       var108 = var77.v(var76, 42, C0.a, var108) as java.lang.String;
                                                                                       var6 |= 1024;
                                                                                       break label355;
                                                                                    case 43:
                                                                                       var59 = var77.v(var76, 43, C0.a, var59) as java.lang.String;
                                                                                       var6 |= 2048;
                                                                                       var61 = var53;
                                                                                       break label257;
                                                                                    case 44:
                                                                                       var57 = var77.v(var76, 44, C0.a, var57) as java.lang.String;
                                                                                       var6 |= 4096;
                                                                                       var61 = var53;
                                                                                       break label257;
                                                                                    case 45:
                                                                                       var60 = var77.v(var76, 45, h.a, var60) as java.lang.Boolean;
                                                                                       var6 |= 8192;
                                                                                       var61 = var53;
                                                                                       break label257;
                                                                                    case 46:
                                                                                       var38 = var77.v(var76, 46, C0.a, var38) as java.lang.String;
                                                                                       var6 |= 16384;
                                                                                       var61 = var53;
                                                                                       break label257;
                                                                                    case 47:
                                                                                       var53 = var77.v(var76, 47, C0.a, var53) as java.lang.String;
                                                                                       var7 = 32768;
                                                                                       break label359;
                                                                                    case 48:
                                                                                       var5 = var77.s(var76, 48);
                                                                                       var7 = 65536;
                                                                                       break label256;
                                                                                    case 49:
                                                                                       var58 = var77.m(var76, 49, var78[49], var58) as java.util.Map;
                                                                                       var7 = 131072;
                                                                                       break label256;
                                                                                    case 50:
                                                                                       var8 = var77.s(var76, 50);
                                                                                       var6 |= 262144;
                                                                                       var38 = (java.lang.String)var17;
                                                                                       var83 = var191;
                                                                                       var61 = var53;
                                                                                       var53 = var52;
                                                                                       var52 = var51;
                                                                                       var62 = var50;
                                                                                       var17 = var38;
                                                                                       var191 = var83;
                                                                                       break label281;
                                                                                    case 51:
                                                                                       var50 = var77.v(var76, 51, C0.a, var50) as java.lang.String;
                                                                                       var7 = 524288;
                                                                                       break label359;
                                                                                    case 52:
                                                                                       var51 = var77.v(var76, 52, C0.a, var51) as java.lang.String;
                                                                                       var7 = 1048576;
                                                                                       break label359;
                                                                                    case 53:
                                                                                       var52 = var77.v(var76, 53, C0.a, var52) as java.lang.String;
                                                                                       var7 = 2097152;
                                                                                       break label359;
                                                                                    case 54:
                                                                                       var32 = var77.v(var76, 54, C0.a, var32) as java.lang.String;
                                                                                       var7 = 4194304;
                                                                                       break label359;
                                                                                    case 55:
                                                                                       var94 = var77.v(var76, 55, C0.a, var94) as java.lang.String;
                                                                                       var7 = 8388608;
                                                                                       break label359;
                                                                                    default:
                                                                                       throw new n(var7);
                                                                                 }

                                                                                 var61 = var191;
                                                                                 var191 = var83;
                                                                                 break label249;
                                                                              }

                                                                              var6 |= var7;
                                                                              var61 = var53;
                                                                              break label257;
                                                                           }

                                                                           var62 = var36;
                                                                           var61 = var150;
                                                                           break label351;
                                                                        }

                                                                        var128 = var37;
                                                                        var61 = var33;
                                                                        var65 = var34;
                                                                        var37 = (java.lang.String)var110;
                                                                        var110 = var128;
                                                                        break label259;
                                                                     }

                                                                     var110 = var37;
                                                                     var37 = (java.lang.String)var110;
                                                                     var65 = var34;
                                                                     var61 = var33;
                                                                     break label259;
                                                                  }

                                                                  var83 = var61;
                                                                  var63 = (java.lang.String)var17;
                                                                  break label353;
                                                               }

                                                               var63 = (java.lang.String)var17;
                                                               var191 = var83;
                                                               var83 = var191;
                                                               break label353;
                                                            }

                                                            var6 |= var7;
                                                            var61 = var53;
                                                            var53 = var52;
                                                            break label352;
                                                         }

                                                         var53 = var52;
                                                         break label352;
                                                      }

                                                      var61 = var123;
                                                      var123 = (java.lang.String)var150;
                                                      var62 = var36;
                                                      break label351;
                                                   }

                                                   var33 = (java.lang.String)var42;
                                                   var64 = (java.lang.String)var128;
                                                   var34 = (java.lang.String)var61;
                                                   var63 = var147;
                                                   break label277;
                                                }

                                                var39 = (java.lang.String)var40;
                                                var40 = var39;
                                                break label350;
                                             }

                                             var17 = var38;
                                             var61 = var53;
                                             var53 = var52;
                                             var52 = var51;
                                             var62 = var50;
                                             var38 = var63;
                                             break label281;
                                          }

                                          var83 = var191;
                                          var38 = (java.lang.String)var17;
                                          var191 = var83;
                                          var17 = var38;
                                          var62 = var50;
                                          var52 = var51;
                                          break label281;
                                       }

                                       var65 = var34;
                                       var34 = var33;
                                       var33 = (java.lang.String)var42;
                                       var64 = var37;
                                       var37 = (java.lang.String)var110;
                                       var42 = var123;
                                       var36 = var128;
                                       var63 = var147;
                                       break label349;
                                    }

                                    var62 = var36;
                                    var61 = var123;
                                    var36 = var110;
                                    var42 = var150;
                                    break label349;
                                 }

                                 var162 = var169;
                                 var154 = var113;
                                 var113 = var174;
                                 var169 = var162;
                                 var174 = var154;
                                 var65 = (java.lang.String)var132;
                                 var64 = (java.lang.String)var135;
                                 var63 = (java.lang.String)var22;
                                 var62 = var142;
                                 var61 = var145;
                                 var46 = var39;
                                 var39 = var46;
                                 break label284;
                              }

                              var65 = (java.lang.String)var132;
                              var39 = var46;
                              var40 = var39;
                              var46 = (java.lang.String)var40;
                              var61 = var145;
                              var62 = var142;
                              var63 = (java.lang.String)var22;
                              var64 = (java.lang.String)var135;
                              var113 = var154;
                              var154 = var113;
                              break label284;
                           }

                           var50 = var97;
                           var51 = (java.lang.String)var191;
                           var97 = (java.lang.String)var62;
                           break label348;
                        }

                        var110 = var83;
                        var97 = (java.lang.String)var113;
                        var150 = var145;
                        var147 = var142;
                        var145 = (java.lang.String)var22;
                        var142 = (java.lang.String)var135;
                        var22 = var132;
                        var132 = var154;
                        var128 = var162;
                        var123 = var29;
                        var113 = var174;
                        var103 = var32;
                        var83 = var38;
                        var29 = var46;
                        var135 = var17;
                        var66 = var53;
                        var67 = var52;
                        var68 = var51;
                        var368 = (java.lang.String)var50;
                        var17 = var169;
                        var154 = var40;
                        var162 = var39;
                        var169 = var33;
                        var174 = var64;
                        var32 = var34;
                        var33 = var65;
                        var34 = var103;
                        var38 = (java.lang.String)var42;
                        var39 = (java.lang.String)var62;
                        var40 = var36;
                        var42 = var63;
                        var46 = (java.lang.String)var61;
                        var36 = var97;
                        break label347;
                     }

                     var135 = var17;
                     var103 = var32;
                     var83 = var38;
                     var38 = (java.lang.String)var150;
                     var66 = var53;
                     var67 = var52;
                     var68 = var51;
                     var368 = (java.lang.String)var50;
                     var97 = (java.lang.String)var154;
                     var110 = var83;
                     var17 = var162;
                     var123 = var29;
                     var128 = var169;
                     var132 = var174;
                     var22 = var65;
                     var142 = var64;
                     var145 = var63;
                     var147 = (java.lang.String)var62;
                     var150 = var61;
                     var154 = var46;
                     var162 = (java.lang.String)var40;
                     var29 = var39;
                     var169 = (java.lang.String)var42;
                     var174 = var37;
                     var32 = var33;
                     var33 = var34;
                     var34 = var103;
                     var37 = (java.lang.String)var110;
                     var39 = (java.lang.String)var36;
                     var40 = var128;
                     var42 = var147;
                     var46 = var123;
                     var36 = var97;
                     break label347;
                  }

                  var147 = var142;
                  var145 = (java.lang.String)var22;
                  var142 = (java.lang.String)var135;
                  var22 = var132;
                  var132 = var154;
                  var7 = var9;
                  var29 = var46;
                  var66 = (java.lang.String)var61;
                  var191 = var83;
                  var67 = var53;
                  var68 = var52;
                  var368 = var97;
                  var83 = var17;
                  var97 = (java.lang.String)var113;
                  var103 = var32;
                  var110 = var51;
                  var113 = var174;
                  var17 = var169;
                  var123 = var29;
                  var128 = var162;
                  var135 = var38;
                  var150 = var145;
                  var154 = var40;
                  var162 = var39;
                  var169 = (java.lang.String)var42;
                  var174 = var37;
                  var32 = var33;
                  var33 = var34;
                  var34 = var103;
                  var37 = (java.lang.String)var110;
                  var38 = (java.lang.String)var150;
                  var39 = (java.lang.String)var36;
                  var40 = var128;
                  var42 = var147;
                  var46 = var123;
                  var36 = var50;
               }

               var83 = var110;
               var17 = var135;
               var132 = var22;
               var135 = var142;
               var22 = var145;
               var142 = var147;
               var145 = (java.lang.String)var150;
               var110 = var37;
               var150 = var38;
               var128 = var40;
               var147 = (java.lang.String)var42;
               var38 = (java.lang.String)var83;
               var32 = var103;
               var53 = var66;
               var52 = (java.lang.String)var67;
               var51 = var68;
               var50 = var368;
               var34 = var33;
               var33 = var32;
               var154 = var132;
               var162 = (java.lang.String)var128;
               var29 = var123;
               var169 = (java.lang.String)var17;
               var174 = var113;
               var37 = (java.lang.String)var174;
               var42 = var169;
               var113 = var97;
               var39 = var162;
               var40 = var154;
               var97 = (java.lang.String)var36;
               var46 = var29;
               var103 = var34;
               var36 = var39;
               var123 = var46;
               var9 = var7;
            }

            var50 = var58;
            var113 = var83;
            var7 = var8;
            var68 = var97;
            var4 = var3;
            var368 = var32;
            var82 = var52;
            var57 = var51;
            var97 = (java.lang.String)var50;
            var3 = var5;
            var58 = var53;
            var44 = var38;
            var38 = var57;
            var66 = (java.lang.String)var59;
            var51 = var108;
            var32 = (java.lang.String)var191;
            var108 = var41;
            var61 = var44;
            var5 = var86;
            var70 = var17;
            var52 = var103;
            var17 = var174;
            var191 = var29;
            var65 = var162;
            var53 = (java.lang.String)var154;
            var174 = var132;
            var62 = var135;
            var63 = (java.lang.String)var22;
            var64 = var142;
            var29 = var145;
            var41 = (java.lang.String)var113;
            var22 = var128;
            var59 = var33;
            var142 = var147;
            var154 = var110;
            var67 = var150;
            var33 = var123;
         }

         var77.b(var76);
         return new NotificationData(
            var9,
            var6,
            var47,
            var55,
            (Integer)var56,
            var49,
            (Integer)var45,
            var33,
            (java.lang.Long)var67,
            (Integer)var36,
            var48,
            (ChannelId)var154,
            var142,
            var34,
            (ChannelId)var59,
            (Integer)var22,
            var37,
            (java.util.List)var42,
            (UserId)var54,
            var41,
            var39,
            (Integer)var40,
            var29,
            var64,
            var63,
            (Integer)var62,
            (GuildId)var174,
            var46,
            var53,
            var65,
            (Integer)var191,
            var169,
            (ApplicationId)var17,
            var52,
            var68,
            (NotificationMessage)var113,
            var13,
            (Integer)var70,
            (boolean)var5,
            (boolean)var4,
            (UserId)var61,
            var108,
            var43,
            var32,
            var51,
            var66,
            var38,
            (java.lang.Boolean)var60,
            var44,
            var58,
            (boolean)var3,
            (java.util.Map)var50,
            (boolean)var7,
            var97,
            var57,
            var82,
            var368,
            var94,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: NotificationData) {
         kotlin.jvm.internal.q.h(var1, "encoder");
         kotlin.jvm.internal.q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         NotificationData.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public const val ACTIVITY_TYPE_PLAYING: Int
      public const val ACTIVITY_TYPE_STREAMING: Int
      public const val CHANNEL_TYPE_ANNOUNCEMENT_THREAD: Int
      public const val CHANNEL_TYPE_CATEGORY: Int
      public const val CHANNEL_TYPE_DIRECTORY: Int
      public const val CHANNEL_TYPE_DM: Int
      public const val CHANNEL_TYPE_GROUP_DM: Int
      public const val CHANNEL_TYPE_GUILD_ANNOUNCEMENT: Int
      public const val CHANNEL_TYPE_GUILD_STAGE_VOICE: Int
      public const val CHANNEL_TYPE_GUILD_STORE: Int
      public const val CHANNEL_TYPE_GUILD_TEXT: Int
      public const val CHANNEL_TYPE_GUILD_VOICE: Int
      public const val CHANNEL_TYPE_PRIVATE_THREAD: Int
      public const val CHANNEL_TYPE_PUBLIC_THREAD: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_EXTERNAL: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_NONE: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_STAGE_INSTANCE: Int
      public const val GUILD_SCHEDULED_EVENT_TYPE_VOICE: Int
      public const val MESSAGE_ACTIVITY_TYPE_JOIN: Int
      public const val MESSAGE_ACTIVITY_TYPE_LISTEN: Int
      public const val MESSAGE_ACTIVITY_TYPE_REQUEST: Int
      public const val MESSAGE_ACTIVITY_TYPE_SPECTATE: Int
      public const val MESSAGE_ACTIVITY_TYPE_WATCH: Int
      public const val MESSAGE_REFERENCE_TYPE_FORWARD: Int
      public const val MESSAGE_TYPE_POLL_RESULT: Int
      public const val MESSAGE_TYPE_USER_JOIN: Int
      public const val MSG_MUTE_MIN_COUNT: Int
      public const val RELATIONSHIP_TYPE_FRIEND: Int
      public const val RELATIONSHIP_TYPE_INVITE_INCOMING: Int
      public const val TRACKING_TYPE_FRIEND_REQUEST_REMINDER: String
      public const val TRACKING_TYPE_GUILD_STREAM_START: String
      public const val TRACKING_TYPE_HOME_LIFECYCLE_PUSH: String
      public const val TRACKING_TYPE_MISSED_MESSAGE: String
      public const val TRACKING_TYPE_MODERATOR_FEATURED_MESSAGE: String
      public const val TRACKING_TYPE_NEW_USER_SESSION: String
      public const val TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH: String
      public const val TRACKING_TYPE_POLL_ENDED: String
      public const val TRACKING_TYPE_REACTIONS: String
      public const val TRACKING_TYPE_SUSPICIOUS_SESSION: String
      public const val TRACKING_TYPE_TOP_MESSAGES_PUSH: String
      public const val TRACKING_TYPE_TRENDING_CONTENT_PUSH: String
      public const val TYPE_ACTIVITY_START: String
      public const val TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE: String
      public const val TYPE_CALL_ACK: String
      public const val TYPE_CALL_CONNECT: String
      public const val TYPE_CALL_RING: String
      public const val TYPE_CALL_RING_END: String
      public const val TYPE_CHANNEL_ACK: String
      public const val TYPE_FORUM_THREAD_CREATED: String
      public const val TYPE_FRIEND_SUGGESTION_CREATE: String
      public const val TYPE_GENERIC_PUSH_NOTIFICATION_SENT: String
      public const val TYPE_GUILD_SCHEDULED_EVENT_UPDATE: String
      public const val TYPE_LOCAL_NOTIFICATION: String
      public const val TYPE_MESSAGE_CREATE: String
      public const val TYPE_RELATIONSHIP_ADD: String
      public const val TYPE_STAGE_INSTANCE_CREATE: String

      public fun serializer(): KSerializer<NotificationData> {
         return NotificationData.$serializer.INSTANCE;
      }
   }
}
