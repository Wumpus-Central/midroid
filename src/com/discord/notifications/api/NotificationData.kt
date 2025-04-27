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

      val var61: java.util.List;
      if ((var1 and '耀') == 0) {
         var61 = i.k();
      } else {
         var61 = var18;
      }

      this.ackChannelIds = var61;
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

      if ((var2 and 8192) == 0) {
         var48 = java.lang.Boolean.FALSE;
      }

      this.expandSubtitle = var48;
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
         val var3: NotificationData = var1 as NotificationData;
         if (!kotlin.jvm.internal.q.c(this.type, (var1 as NotificationData).type)) {
            return false;
         } else {
            var var2: Boolean;
            label244: {
               if (this.messageId == null) {
                  if (var3.messageId == null) {
                     var2 = true;
                     break label244;
                  }
               } else if (var3.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var3.messageId);
                  break label244;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageActivityType, var3.messageActivityType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageApplicationName, var3.messageApplicationName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageType, var3.messageType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageContent, var3.messageContent)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageFlags, var3.messageFlags)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelType, var3.channelType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelName, var3.channelName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelId, var3.channelId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelIcon, var3.channelIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.parentName, var3.parentName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.parentId, var3.parentId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageReferenceType, var3.messageReferenceType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelRtcRegion, var3.channelRtcRegion)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.ackChannelIds, var3.ackChannelIds)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userId, var3.userId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userUsername, var3.userUsername)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userGlobalName, var3.userGlobalName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userDiscriminator, var3.userDiscriminator)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userAvatar, var3.userAvatar)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userGuildAvatar, var3.userGuildAvatar)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.platformUserUsername, var3.platformUserUsername)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.relationshipType, var3.relationshipType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildId, var3.guildId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildName, var3.guildName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildIcon, var3.guildIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityInstanceId, var3.activityInstanceId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityType, var3.activityType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityName, var3.activityName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationId, var3.applicationId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationName, var3.applicationName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationIcon, var3.applicationIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.message, var3.message)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.stageInstanceTopic, var3.stageInstanceTopic)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildScheduledEventEntityType, var3.guildScheduledEventEntityType)) {
               return false;
            } else if (this.canReply != var3.canReply) {
               return false;
            } else if (this.isFromCurrentUser != var3.isFromCurrentUser) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.receivingUserId, var3.receivingUserId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.title, var3.title)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.subtitle, var3.subtitle)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.iconUrl, var3.iconUrl)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notificationChannel, var3.notificationChannel)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.trackingType, var3.trackingType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.deeplink, var3.deeplink)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.expandSubtitle, var3.expandSubtitle)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.imageAttachmentUrl, var3.imageAttachmentUrl)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.timeReceived, var3.timeReceived)) {
               return false;
            } else if (this.silent != var3.silent) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userInfo, var3.userInfo)) {
               return false;
            } else if (this.appDm != var3.appDm) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notifTypeId, var3.notifTypeId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notifInstanceId, var3.notifInstanceId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.joinId, var3.joinId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.mentionType, var3.mentionType)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.appState, var3.appState);
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

      val var55: Int = java.lang.Boolean.hashCode(this.silent);
      val var56: Int = this.userInfo.hashCode();
      val var54: Int = java.lang.Boolean.hashCode(this.appDm);
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
                                                                        + var55
                                                                  )
                                                                  * 31
                                                               + var56
                                                         )
                                                         * 31
                                                      + var54
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

      val var46: Int = this.messageActivityType;
      val var23: java.lang.String = this.messageApplicationName;
      val var44: Int = this.messageType;
      val var8: java.lang.String = this.messageContent;
      val var22: java.lang.Long = this.messageFlags;
      val var49: Int = this.channelType;
      val var38: java.lang.String = this.channelName;
      val var9: ChannelId = this.channelId;
      val var32: java.lang.String = this.channelIcon;
      val var52: java.lang.String = this.parentName;
      val var39: ChannelId = this.parentId;
      val var54: Int = this.messageReferenceType;
      val var50: java.lang.String = this.channelRtcRegion;
      val var17: java.util.List = this.ackChannelIds;
      val var10: UserId = this.userId;
      val var36: java.lang.String = this.userUsername;
      val var26: java.lang.String = this.userGlobalName;
      val var48: Int = this.userDiscriminator;
      val var33: java.lang.String = this.userAvatar;
      val var37: java.lang.String = this.userGuildAvatar;
      val var18: java.lang.String = this.platformUserUsername;
      val var24: Int = this.relationshipType;
      val var30: GuildId = this.guildId;
      val var45: java.lang.String = this.guildName;
      val var40: java.lang.String = this.guildIcon;
      val var55: java.lang.String = this.activityInstanceId;
      val var35: Int = this.activityType;
      val var14: java.lang.String = this.activityName;
      val var41: ApplicationId = this.applicationId;
      val var7: java.lang.String = this.applicationName;
      val var11: java.lang.String = this.applicationIcon;
      val var13: NotificationMessage = this.message;
      val var19: java.lang.String = this.stageInstanceTopic;
      val var16: Int = this.guildScheduledEventEntityType;
      val var4: Boolean = this.canReply;
      val var1: Boolean = this.isFromCurrentUser;
      val var47: UserId = this.receivingUserId;
      val var15: java.lang.String = this.title;
      val var43: java.lang.String = this.subtitle;
      val var42: java.lang.String = this.iconUrl;
      val var34: java.lang.String = this.notificationChannel;
      val var27: java.lang.String = this.trackingType;
      val var57: java.lang.String = this.deeplink;
      val var12: java.lang.Boolean = this.expandSubtitle;
      val var28: java.lang.String = this.imageAttachmentUrl;
      val var51: java.lang.String = this.timeReceived;
      val var2: Boolean = this.silent;
      val var29: java.util.Map = this.userInfo;
      val var3: Boolean = this.appDm;
      val var20: java.lang.String = this.notifTypeId;
      val var53: java.lang.String = this.notifInstanceId;
      val var21: java.lang.String = this.joinId;
      val var56: java.lang.String = this.mentionType;
      val var31: java.lang.String = this.appState;
      val var25: StringBuilder = new StringBuilder();
      var25.append("NotificationData(type=");
      var25.append(var6);
      var25.append(", messageId=");
      var25.append(var58);
      var25.append(", messageActivityType=");
      var25.append(var46);
      var25.append(", messageApplicationName=");
      var25.append(var23);
      var25.append(", messageType=");
      var25.append(var44);
      var25.append(", messageContent=");
      var25.append(var8);
      var25.append(", messageFlags=");
      var25.append(var22);
      var25.append(", channelType=");
      var25.append(var49);
      var25.append(", channelName=");
      var25.append(var38);
      var25.append(", channelId=");
      var25.append(var9);
      var25.append(", channelIcon=");
      var25.append(var32);
      var25.append(", parentName=");
      var25.append(var52);
      var25.append(", parentId=");
      var25.append(var39);
      var25.append(", messageReferenceType=");
      var25.append(var54);
      var25.append(", channelRtcRegion=");
      var25.append(var50);
      var25.append(", ackChannelIds=");
      var25.append(var17);
      var25.append(", userId=");
      var25.append(var10);
      var25.append(", userUsername=");
      var25.append(var36);
      var25.append(", userGlobalName=");
      var25.append(var26);
      var25.append(", userDiscriminator=");
      var25.append(var48);
      var25.append(", userAvatar=");
      var25.append(var33);
      var25.append(", userGuildAvatar=");
      var25.append(var37);
      var25.append(", platformUserUsername=");
      var25.append(var18);
      var25.append(", relationshipType=");
      var25.append(var24);
      var25.append(", guildId=");
      var25.append(var30);
      var25.append(", guildName=");
      var25.append(var45);
      var25.append(", guildIcon=");
      var25.append(var40);
      var25.append(", activityInstanceId=");
      var25.append(var55);
      var25.append(", activityType=");
      var25.append(var35);
      var25.append(", activityName=");
      var25.append(var14);
      var25.append(", applicationId=");
      var25.append(var41);
      var25.append(", applicationName=");
      var25.append(var7);
      var25.append(", applicationIcon=");
      var25.append(var11);
      var25.append(", message=");
      var25.append(var13);
      var25.append(", stageInstanceTopic=");
      var25.append(var19);
      var25.append(", guildScheduledEventEntityType=");
      var25.append(var16);
      var25.append(", canReply=");
      var25.append(var4);
      var25.append(", isFromCurrentUser=");
      var25.append(var1);
      var25.append(", receivingUserId=");
      var25.append(var47);
      var25.append(", title=");
      var25.append(var15);
      var25.append(", subtitle=");
      var25.append(var43);
      var25.append(", iconUrl=");
      var25.append(var42);
      var25.append(", notificationChannel=");
      var25.append(var34);
      var25.append(", trackingType=");
      var25.append(var27);
      var25.append(", deeplink=");
      var25.append(var57);
      var25.append(", expandSubtitle=");
      var25.append(var12);
      var25.append(", imageAttachmentUrl=");
      var25.append(var28);
      var25.append(", timeReceived=");
      var25.append(var51);
      var25.append(", silent=");
      var25.append(var2);
      var25.append(", userInfo=");
      var25.append(var29);
      var25.append(", appDm=");
      var25.append(var3);
      var25.append(", notifTypeId=");
      var25.append(var20);
      var25.append(", notifInstanceId=");
      var25.append(var53);
      var25.append(", joinId=");
      var25.append(var21);
      var25.append(", mentionType=");
      var25.append(var56);
      var25.append(", appState=");
      var25.append(var31);
      var25.append(")");
      return var25.toString();
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
         val var1: C0 = C0.a;
         val var2: KSerializer = a.u(MessageId.$serializer.INSTANCE);
         val var35: N = N.a;
         val var10: KSerializer = a.u(N.a);
         val var11: KSerializer = a.u(var1);
         val var7: KSerializer = a.u(var35);
         val var3: KSerializer = a.u(var1);
         val var4: KSerializer = a.u(Y.a);
         val var8: KSerializer = a.u(var35);
         val var9: KSerializer = a.u(var1);
         val var13: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var5: KSerializer = a.u(ChannelId.$serializer.INSTANCE);
         val var6: KSerializer = a.u(var1);
         val var12: KSerializer = a.u(var1);
         val var19: KSerializer = a.u(var13);
         val var24: KSerializer = a.u(var35);
         val var26: KSerializer = a.u(var1);
         val var37: UserId.$serializer = UserId.$serializer.INSTANCE;
         val var32: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var53: KSerializer = a.u(var1);
         val var14: KSerializer = a.u(var1);
         val var33: KSerializer = a.u(var35);
         val var30: KSerializer = a.u(var1);
         val var25: KSerializer = a.u(var1);
         val var27: KSerializer = a.u(var1);
         val var22: KSerializer = a.u(var35);
         val var18: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var34: KSerializer = a.u(var1);
         val var21: KSerializer = a.u(var1);
         val var20: KSerializer = a.u(var1);
         val var29: KSerializer = a.u(var35);
         val var23: KSerializer = a.u(var1);
         val var16: KSerializer = a.u(ApplicationId.$serializer.INSTANCE);
         val var17: KSerializer = a.u(var1);
         val var31: KSerializer = a.u(var1);
         val var28: KSerializer = a.u(NotificationMessageSerializer.INSTANCE);
         val var15: KSerializer = a.u(var1);
         val var54: KSerializer = a.u(var35);
         val var36: h = h.a;
         return new KSerializer[]{
            var1,
            var2,
            var10,
            var11,
            var7,
            var3,
            var4,
            var8,
            var9,
            var5,
            var6,
            var12,
            var19,
            var24,
            var26,
            ChannelListSerializer.INSTANCE,
            var32,
            var53,
            var14,
            var33,
            var30,
            var25,
            var27,
            var22,
            var18,
            var34,
            var21,
            var20,
            var29,
            var23,
            var16,
            var17,
            var31,
            var28,
            var15,
            var54,
            CanReplySerializer.INSTANCE,
            h.a,
            a.u(var37),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var36),
            a.u(var1),
            a.u(var1),
            var36,
            var47[49],
            var36,
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): NotificationData {
         kotlin.jvm.internal.q.h(var1, "decoder");
         val var76: SerialDescriptor = this.getDescriptor();
         val var77: c = var1.c(var76);
         val var78: Array<KSerializer> = NotificationData.access$get$childSerializers$cp();
         val var4: Byte;
         var var5: Byte;
         var var6: Byte;
         var var7: Int;
         var var9: Int;
         var var13: java.lang.String;
         var var17: Any;
         var var22: Any;
         var var28: Any;
         var var29: Any;
         var var30: java.lang.String;
         var var33: Any;
         var var35: java.lang.String;
         var var36: Any;
         var var37: java.lang.String;
         var var39: java.lang.String;
         var var40: Any;
         var var41: java.lang.String;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: Any;
         var var46: java.lang.String;
         var var47: java.lang.String;
         var var48: java.lang.String;
         var var49: java.lang.String;
         var var50: java.lang.String;
         var var51: java.lang.String;
         var var52: Any;
         var var53: java.lang.String;
         var var54: Any;
         var var55: java.lang.String;
         var var56: Any;
         var var57: java.lang.String;
         var var58: java.lang.String;
         var var59: java.lang.String;
         var var60: java.lang.String;
         var var61: java.lang.String;
         var var62: java.lang.String;
         var var63: Any;
         var var64: java.lang.String;
         var var65: java.lang.String;
         var var66: java.lang.String;
         var var67: java.lang.String;
         var var68: java.lang.String;
         var var69: java.lang.String;
         val var70: Any;
         var var81: Any;
         var var86: Byte;
         var var94: java.lang.String;
         var var97: java.lang.String;
         var var108: java.lang.String;
         var var112: Any;
         var var144: java.lang.String;
         var var171: java.lang.String;
         var var177: java.lang.String;
         var var185: Any;
         var var200: java.lang.String;
         if (var77.y()) {
            var47 = var77.t(var76, 0);
            var81 = var77.v(var76, 1, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var80: java.lang.String;
            if (var81 != null) {
               var80 = var81.unbox-impl();
            } else {
               var80 = null;
            }

            val var12: N = N.a;
            var56 = var77.v(var76, 2, N.a, null) as Int;
            val var10: C0 = C0.a;
            var49 = var77.v(var76, 3, C0.a, null) as java.lang.String;
            var45 = var77.v(var76, 4, var12, null) as Int;
            var30 = var77.v(var76, 5, var10, null) as java.lang.String;
            var28 = var77.v(var76, 6, Y.a, null) as java.lang.Long;
            var36 = var77.v(var76, 7, var12, null) as Int;
            var48 = var77.v(var76, 8, var10, null) as java.lang.String;
            val var11: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
            val var25: ChannelId = var77.v(var76, 9, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var171 = var77.v(var76, 10, var10, null) as java.lang.String;
            var62 = var77.v(var76, 11, var10, null) as java.lang.String;
            var33 = var77.v(var76, 12, var11, null) as ChannelId;
            var22 = var77.v(var76, 13, var12, null) as Int;
            var37 = var77.v(var76, 14, var10, null) as java.lang.String;
            var42 = var77.m(var76, 15, ChannelListSerializer.INSTANCE, null) as java.util.List;
            val var95: UserId.$serializer = UserId.$serializer.INSTANCE;
            var54 = var77.v(var76, 16, UserId.$serializer.INSTANCE, null) as UserId;
            var58 = var77.v(var76, 17, var10, null) as java.lang.String;
            var39 = var77.v(var76, 18, var10, null) as java.lang.String;
            var40 = var77.v(var76, 19, var12, null) as Int;
            var50 = var77.v(var76, 20, var10, null) as java.lang.String;
            var61 = var77.v(var76, 21, var10, null) as java.lang.String;
            var68 = var77.v(var76, 22, var10, null) as java.lang.String;
            var29 = var77.v(var76, 23, var12, null) as Int;
            val var23: GuildId = var77.v(var76, 24, GuildId.$serializer.INSTANCE, null) as GuildId;
            val var26: java.lang.String = var77.v(var76, 25, var10, null) as java.lang.String;
            val var21: java.lang.String = var77.v(var76, 26, var10, null) as java.lang.String;
            val var20: java.lang.String = var77.v(var76, 27, var10, null) as java.lang.String;
            val var19: Int = var77.v(var76, 28, var12, null) as Int;
            val var18: java.lang.String = var77.v(var76, 29, var10, null) as java.lang.String;
            var17 = var77.v(var76, 30, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            val var24: java.lang.String = var77.v(var76, 31, var10, null) as java.lang.String;
            var112 = var77.v(var76, 32, var10, null) as java.lang.String;
            val var15: NotificationMessage = var77.v(var76, 33, NotificationMessageSerializer.INSTANCE, null) as NotificationMessage;
            var13 = var77.v(var76, 34, var10, null) as java.lang.String;
            val var14: Int = var77.v(var76, 35, var12, null) as Int;
            var6 = var77.m(var76, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.FALSE) as java.lang.Boolean;
            var4 = var77.s(var76, 37);
            val var38: UserId = var77.v(var76, 38, var95, null) as UserId;
            val var102: java.lang.String = var77.v(var76, 39, var10, null) as java.lang.String;
            var177 = var77.v(var76, 40, var10, null) as java.lang.String;
            var60 = var77.v(var76, 41, var10, null) as java.lang.String;
            var65 = var77.v(var76, 42, var10, null) as java.lang.String;
            var64 = var77.v(var76, 43, var10, null) as java.lang.String;
            var57 = var77.v(var76, 44, var10, null) as java.lang.String;
            var70 = var77.v(var76, 45, h.a, null) as java.lang.Boolean;
            var97 = var77.v(var76, 46, var10, null) as java.lang.String;
            var53 = var77.v(var76, 47, var10, null) as java.lang.String;
            var86 = var77.s(var76, 48);
            var185 = var77.m(var76, 49, var78[49], null) as java.util.Map;
            val var2: Byte = var77.s(var76, 50);
            val var27: java.lang.String = var77.v(var76, 51, var10, null) as java.lang.String;
            var41 = var77.v(var76, 52, var10, null) as java.lang.String;
            val var71: java.lang.String = var77.v(var76, 53, var10, null) as java.lang.String;
            var35 = var77.v(var76, 54, var10, null) as java.lang.String;
            var94 = var77.v(var76, 55, var10, null) as java.lang.String;
            var55 = var80;
            var7 = 16777215;
            var9 = -1;
            var81 = (MessageId)var185;
            var185 = var25;
            var144 = var171;
            var44 = var23;
            var46 = var26;
            var171 = var21;
            var67 = var20;
            var52 = var19;
            var51 = var18;
            var59 = var24;
            var66 = (java.lang.String)var112;
            var43 = var15;
            var63 = var14;
            var112 = var38;
            var200 = var102;
            var108 = var177;
            var69 = var97;
            var5 = var86;
            var86 = var2;
            var97 = var27;
            var177 = var71;
         } else {
            var57 = null;
            var var88: Boolean = true;
            var6 = 0;
            var var85: Byte = 0;
            var var8: Byte = 0;
            var5 = 0;
            var86 = 0;
            var9 = 0;
            var94 = null;
            var200 = null;
            var177 = null;
            var53 = null;
            var60 = null;
            var35 = null;
            var108 = null;
            var59 = null;
            var52 = null;
            var51 = null;
            var50 = null;
            var58 = null;
            var56 = null;
            var144 = null;
            var185 = null;
            var33 = null;
            var var142: java.lang.String = null;
            var var140: java.lang.String = null;
            var22 = null;
            var var133: Any = null;
            var var130: Any = null;
            var var151: java.lang.String = null;
            var28 = null;
            var29 = null;
            var30 = null;
            var171 = null;
            var37 = null;
            var42 = null;
            var54 = null;
            var112 = null;
            var39 = null;
            var40 = null;
            var97 = null;
            var81 = null;
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
            var var147: Any = null;
            var var110: Any = null;
            var36 = null;
            var var126: Any = null;
            var var121: java.lang.String = null;
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
                                                                                       val var244: MessageId;
                                                                                       if (var55 != null) {
                                                                                          var244 = MessageId.box-impl(var55);
                                                                                       } else {
                                                                                          var244 = null;
                                                                                       }

                                                                                       val var245: MessageId = var77.v(
                                                                                          var76, 1, MessageId.$serializer.INSTANCE, var244
                                                                                       ) as MessageId;
                                                                                       if (var245 != null) {
                                                                                          var55 = var245.unbox-impl();
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
                                                                                       val var307: Int = var77.v(var76, 4, N.a, var45) as Int;
                                                                                       var7 = var9 or 16;
                                                                                       var121 = (java.lang.String)var147;
                                                                                       var63 = var36;
                                                                                       var36 = var121;
                                                                                       var45 = var307;
                                                                                       break label351;
                                                                                    case 5:
                                                                                       var61 = var77.v(var76, 5, C0.a, var121) as java.lang.String;
                                                                                       var7 = var9 or 32;
                                                                                       var121 = (java.lang.String)var147;
                                                                                       var147 = var61;
                                                                                       break label358;
                                                                                    case 6:
                                                                                       val var304: java.lang.Long = var77.v(var76, 6, Y.a, var147) as java.lang.Long;
                                                                                       var7 = var9 or 64;
                                                                                       var147 = var121;
                                                                                       var121 = var304;
                                                                                       break label358;
                                                                                    case 7:
                                                                                       var63 = var77.v(var76, 7, N.a, var36) as Int;
                                                                                       var7 = var9 or 128;
                                                                                       var36 = var121;
                                                                                       var121 = (java.lang.String)var147;
                                                                                       break label351;
                                                                                    case 8:
                                                                                       var48 = var77.v(var76, 8, C0.a, var48) as java.lang.String;
                                                                                       var7 = var9 or 256;
                                                                                       var65 = (java.lang.String)var42;
                                                                                       var64 = var37;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var42 = var147;
                                                                                       var63 = var36;
                                                                                       var61 = (java.lang.String)var126;
                                                                                       var62 = var144;
                                                                                       var36 = var121;
                                                                                       break label349;
                                                                                    case 9:
                                                                                       var110 = var77.v(var76, 9, ChannelId.$serializer.INSTANCE, var110) as ChannelId;
                                                                                       var7 = var9 or 512;
                                                                                       break label357;
                                                                                    case 10:
                                                                                       var144 = var77.v(var76, 10, C0.a, var144) as java.lang.String;
                                                                                       var7 = var9 or 1024;
                                                                                       break label357;
                                                                                    case 11:
                                                                                       var185 = var77.v(var76, 11, C0.a, var185) as java.lang.String;
                                                                                       var7 = var9 or 2048;
                                                                                       break label357;
                                                                                    case 12:
                                                                                       var33 = var77.v(var76, 12, ChannelId.$serializer.INSTANCE, var33) as ChannelId;
                                                                                       var7 = var9 or 4096;
                                                                                       break label357;
                                                                                    case 13:
                                                                                       val var296: Int = var77.v(var76, 13, N.a, var126) as Int;
                                                                                       var7 = var9 or 8192;
                                                                                       var126 = var37;
                                                                                       var37 = var296;
                                                                                       break label356;
                                                                                    case 14:
                                                                                       var61 = var77.v(var76, 14, C0.a, var37) as java.lang.String;
                                                                                       var7 = var9 or 16384;
                                                                                       var37 = (java.lang.String)var126;
                                                                                       var126 = var61;
                                                                                       break label356;
                                                                                    case 15:
                                                                                       var65 = var77.m(var76, 15, ChannelListSerializer.INSTANCE, var42) as java.util.List;
                                                                                       var64 = var37;
                                                                                       var7 = var9 or '耀';
                                                                                       var62 = var144;
                                                                                       var61 = (java.lang.String)var126;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       break label277;
                                                                                    case 16:
                                                                                       var142 = (java.lang.String)var22;
                                                                                       var140 = (java.lang.String)var133;
                                                                                       var22 = var130;
                                                                                       var130 = var151;
                                                                                       var28 = var39;
                                                                                       var151 = (java.lang.String)var40;
                                                                                       var54 = var77.v(var76, 16, UserId.$serializer.INSTANCE, var54) as UserId;
                                                                                       var29 = var46;
                                                                                       var171 = var37;
                                                                                       var30 = (java.lang.String)var42;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var7 = var9 or 65536;
                                                                                       var66 = var53;
                                                                                       var67 = (java.lang.String)var52;
                                                                                       var68 = var51;
                                                                                       var69 = var50;
                                                                                       var84 = var200;
                                                                                       var97 = (java.lang.String)var112;
                                                                                       var103 = var177;
                                                                                       var110 = var81;
                                                                                       var112 = var171;
                                                                                       var17 = var30;
                                                                                       var121 = (java.lang.String)var29;
                                                                                       var126 = var28;
                                                                                       var133 = var17;
                                                                                       var144 = var140;
                                                                                       var147 = var142;
                                                                                       var177 = (java.lang.String)var33;
                                                                                       var33 = var185;
                                                                                       var185 = var103;
                                                                                       var200 = (java.lang.String)var147;
                                                                                       var39 = (java.lang.String)var36;
                                                                                       var40 = var126;
                                                                                       var42 = var144;
                                                                                       var46 = var121;
                                                                                       var36 = var97;
                                                                                       break label347;
                                                                                    case 17:
                                                                                       var112 = var77.v(var76, 17, C0.a, var112) as java.lang.String;
                                                                                       var7 = var9 or 131072;
                                                                                       var39 = (java.lang.String)var40;
                                                                                       var40 = var39;
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
                                                                                       var142 = var77.v(var76, 20, C0.a, var142) as java.lang.String;
                                                                                       var7 = var9 or 1048576;
                                                                                       break label354;
                                                                                    case 21:
                                                                                       var140 = var77.v(var76, 21, C0.a, var140) as java.lang.String;
                                                                                       var7 = var9 or 2097152;
                                                                                       break label354;
                                                                                    case 22:
                                                                                       var22 = var77.v(var76, 22, C0.a, var22) as java.lang.String;
                                                                                       var7 = var9 or 4194304;
                                                                                       break label354;
                                                                                    case 23:
                                                                                       var133 = var77.v(var76, 23, N.a, var133) as Int;
                                                                                       var7 = var9 or 8388608;
                                                                                       break label354;
                                                                                    case 24:
                                                                                       var130 = var77.v(var76, 24, GuildId.$serializer.INSTANCE, var130) as GuildId;
                                                                                       var7 = var9 or 16777216;
                                                                                       break label354;
                                                                                    case 25:
                                                                                       var28 = var30;
                                                                                       var171 = var151;
                                                                                       var46 = var77.v(var76, 25, C0.a, var46) as java.lang.String;
                                                                                       var7 = var9 or 33554432;
                                                                                       var151 = var171;
                                                                                       var30 = (java.lang.String)var28;
                                                                                       break label280;
                                                                                    case 26:
                                                                                       var62 = var77.v(var76, 26, C0.a, var151) as java.lang.String;
                                                                                       var7 = var9 or 67108864;
                                                                                       var151 = var171;
                                                                                       var28 = var30;
                                                                                       var30 = (java.lang.String)var28;
                                                                                       var171 = var62;
                                                                                       break label280;
                                                                                    case 27:
                                                                                       var62 = var77.v(var76, 27, C0.a, var28) as java.lang.String;
                                                                                       var7 = var9 or 134217728;
                                                                                       var151 = var171;
                                                                                       var28 = var30;
                                                                                       var30 = var62;
                                                                                       var171 = var151;
                                                                                       break label280;
                                                                                    case 28:
                                                                                       var29 = var77.v(var76, 28, N.a, var29) as Int;
                                                                                       var7 = var9 or 268435456;
                                                                                       var151 = var171;
                                                                                       var28 = var30;
                                                                                       var30 = (java.lang.String)var28;
                                                                                       var171 = var151;
                                                                                       break label280;
                                                                                    case 29:
                                                                                       var62 = var77.v(var76, 29, C0.a, var30) as java.lang.String;
                                                                                       var7 = var9 or 536870912;
                                                                                       var171 = var151;
                                                                                       var30 = (java.lang.String)var28;
                                                                                       var28 = var62;
                                                                                       var151 = var171;
                                                                                       break label280;
                                                                                    case 30:
                                                                                       val var264: ApplicationId = var77.v(
                                                                                          var76, 30, ApplicationId.$serializer.INSTANCE, var171
                                                                                       ) as ApplicationId;
                                                                                       var7 = var9 or 1073741824;
                                                                                       var171 = var151;
                                                                                       var28 = var30;
                                                                                       var30 = (java.lang.String)var28;
                                                                                       var151 = var264;
                                                                                       break label280;
                                                                                    case 31:
                                                                                       var103 = var77.v(var76, 31, C0.a, var103) as java.lang.String;
                                                                                       var177 = (java.lang.String)var33;
                                                                                       var144 = var140;
                                                                                       var142 = (java.lang.String)var22;
                                                                                       var140 = (java.lang.String)var133;
                                                                                       var22 = var130;
                                                                                       var130 = var151;
                                                                                       var17 = var30;
                                                                                       var171 = var37;
                                                                                       var30 = (java.lang.String)var42;
                                                                                       var28 = var39;
                                                                                       var151 = (java.lang.String)var40;
                                                                                       var29 = var46;
                                                                                       var40 = var126;
                                                                                       var46 = var121;
                                                                                       var7 = var9 or Integer.MIN_VALUE;
                                                                                       var36 = var97;
                                                                                       var66 = var53;
                                                                                       var67 = (java.lang.String)var52;
                                                                                       var68 = var51;
                                                                                       var69 = var50;
                                                                                       var84 = var200;
                                                                                       var97 = (java.lang.String)var112;
                                                                                       var103 = var177;
                                                                                       var110 = var81;
                                                                                       var112 = var171;
                                                                                       var121 = (java.lang.String)var29;
                                                                                       var126 = var28;
                                                                                       var133 = var17;
                                                                                       var147 = var142;
                                                                                       var33 = var185;
                                                                                       var185 = var103;
                                                                                       var37 = (java.lang.String)var110;
                                                                                       var200 = (java.lang.String)var147;
                                                                                       var39 = (java.lang.String)var36;
                                                                                       var42 = var144;
                                                                                       break label347;
                                                                                    case 32:
                                                                                       var97 = var77.v(var76, 32, C0.a, var97) as java.lang.String;
                                                                                       var6 |= 1;
                                                                                       var83 = var35;
                                                                                       var61 = var53;
                                                                                       var53 = (java.lang.String)var52;
                                                                                       var52 = var51;
                                                                                       var97 = var50;
                                                                                       var17 = var200;
                                                                                       var51 = var81;
                                                                                       var200 = (java.lang.String)var17;
                                                                                       var50 = var97;
                                                                                       break label348;
                                                                                    case 33:
                                                                                       var81 = var77.v(var76, 33, NotificationMessageSerializer.INSTANCE, var81) as NotificationMessage;
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
                                                                                       var85 = var77.m(
                                                                                          var76,
                                                                                          36,
                                                                                          CanReplySerializer.INSTANCE,
                                                                                          java.lang.Boolean.valueOf((boolean)var85)
                                                                                       ) as java.lang.Boolean;
                                                                                       var6 |= 16;
                                                                                       break;
                                                                                    case 37:
                                                                                       var86 = var77.s(var76, 37);
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
                                                                                       var61 = var77.v(var76, 41, C0.a, var35) as java.lang.String;
                                                                                       var6 |= 512;
                                                                                       var35 = var81;
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
                                                                                       var200 = var77.v(var76, 46, C0.a, var200) as java.lang.String;
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
                                                                                       var200 = (java.lang.String)var17;
                                                                                       var83 = var35;
                                                                                       var61 = var53;
                                                                                       var53 = (java.lang.String)var52;
                                                                                       var52 = var51;
                                                                                       var62 = var50;
                                                                                       var17 = var200;
                                                                                       var35 = var81;
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
                                                                                       var177 = var77.v(var76, 54, C0.a, var177) as java.lang.String;
                                                                                       var7 = 4194304;
                                                                                       break label359;
                                                                                    case 55:
                                                                                       var94 = var77.v(var76, 55, C0.a, var94) as java.lang.String;
                                                                                       var7 = 8388608;
                                                                                       break label359;
                                                                                    default:
                                                                                       throw new n(var7);
                                                                                 }

                                                                                 var61 = var35;
                                                                                 var35 = var81;
                                                                                 break label249;
                                                                              }

                                                                              var6 |= var7;
                                                                              var61 = var53;
                                                                              break label257;
                                                                           }

                                                                           var63 = var36;
                                                                           var36 = var147;
                                                                           break label351;
                                                                        }

                                                                        var61 = (java.lang.String)var126;
                                                                        var126 = var37;
                                                                        var37 = (java.lang.String)var110;
                                                                        break label259;
                                                                     }

                                                                     var61 = var37;
                                                                     var37 = (java.lang.String)var110;
                                                                     break label259;
                                                                  }

                                                                  var83 = var61;
                                                                  var63 = var17;
                                                                  break label353;
                                                               }

                                                               var83 = var35;
                                                               var63 = var17;
                                                               var35 = var81;
                                                               break label353;
                                                            }

                                                            var6 |= var7;
                                                            var61 = var53;
                                                            var53 = (java.lang.String)var52;
                                                            break label352;
                                                         }

                                                         var53 = (java.lang.String)var52;
                                                         break label352;
                                                      }

                                                      var121 = (java.lang.String)var147;
                                                      var63 = var36;
                                                      var36 = var121;
                                                      break label351;
                                                   }

                                                   var65 = (java.lang.String)var42;
                                                   var64 = (java.lang.String)var126;
                                                   var62 = var144;
                                                   break label277;
                                                }

                                                var40 = var39;
                                                var39 = (java.lang.String)var40;
                                                break label350;
                                             }

                                             var17 = var200;
                                             var61 = var53;
                                             var53 = (java.lang.String)var52;
                                             var52 = var51;
                                             var62 = var50;
                                             var200 = (java.lang.String)var63;
                                             break label281;
                                          }

                                          var83 = var35;
                                          var200 = (java.lang.String)var17;
                                          var35 = var81;
                                          var17 = var200;
                                          var62 = var50;
                                          var52 = var51;
                                          break label281;
                                       }

                                       var65 = (java.lang.String)var42;
                                       var64 = var37;
                                       var37 = (java.lang.String)var110;
                                       var42 = var121;
                                       var61 = (java.lang.String)var126;
                                       var62 = var144;
                                       break label349;
                                    }

                                    var63 = var36;
                                    var36 = var121;
                                    var42 = var147;
                                    break label349;
                                 }

                                 var28 = var30;
                                 var151 = (java.lang.String)var112;
                                 var112 = var171;
                                 var30 = (java.lang.String)var28;
                                 var171 = var151;
                                 var65 = (java.lang.String)var130;
                                 var64 = (java.lang.String)var133;
                                 var63 = var22;
                                 var62 = var140;
                                 var61 = var142;
                                 var46 = var39;
                                 var39 = var46;
                                 break label284;
                              }

                              var65 = (java.lang.String)var130;
                              var39 = var46;
                              var40 = var39;
                              var46 = (java.lang.String)var40;
                              var61 = var142;
                              var62 = var140;
                              var63 = var22;
                              var64 = (java.lang.String)var133;
                              var112 = var151;
                              var151 = (java.lang.String)var112;
                              break label284;
                           }

                           var50 = var97;
                           var51 = var35;
                           var97 = var62;
                           break label348;
                        }

                        var110 = var81;
                        var97 = (java.lang.String)var112;
                        var147 = var142;
                        var144 = var140;
                        var142 = (java.lang.String)var22;
                        var140 = (java.lang.String)var133;
                        var22 = var130;
                        var130 = var151;
                        var126 = var28;
                        var121 = (java.lang.String)var29;
                        var112 = var171;
                        var103 = var177;
                        var84 = var200;
                        var29 = var46;
                        var133 = var17;
                        var66 = var53;
                        var67 = (java.lang.String)var52;
                        var68 = var51;
                        var69 = var50;
                        var17 = var30;
                        var151 = (java.lang.String)var40;
                        var28 = var39;
                        var30 = var65;
                        var171 = var64;
                        var177 = (java.lang.String)var33;
                        var33 = var185;
                        var185 = var103;
                        var200 = (java.lang.String)var42;
                        var39 = (java.lang.String)var63;
                        var40 = var61;
                        var42 = var62;
                        var46 = (java.lang.String)var36;
                        var36 = var97;
                        break label347;
                     }

                     var133 = var17;
                     var103 = var177;
                     var84 = var200;
                     var200 = (java.lang.String)var147;
                     var66 = var53;
                     var67 = (java.lang.String)var52;
                     var68 = var51;
                     var69 = var50;
                     var97 = var151;
                     var110 = var81;
                     var17 = var28;
                     var121 = (java.lang.String)var29;
                     var126 = var30;
                     var130 = var171;
                     var22 = var65;
                     var140 = var64;
                     var142 = (java.lang.String)var63;
                     var144 = var62;
                     var147 = var61;
                     var151 = var46;
                     var28 = var40;
                     var29 = var39;
                     var30 = (java.lang.String)var42;
                     var171 = var37;
                     var177 = (java.lang.String)var33;
                     var33 = var185;
                     var185 = var103;
                     var37 = (java.lang.String)var110;
                     var39 = (java.lang.String)var36;
                     var40 = var126;
                     var42 = var144;
                     var46 = var121;
                     var36 = var97;
                     break label347;
                  }

                  var144 = var140;
                  var142 = (java.lang.String)var22;
                  var140 = (java.lang.String)var133;
                  var22 = var130;
                  var130 = var151;
                  var7 = var9;
                  var29 = var46;
                  var66 = var61;
                  var35 = var83;
                  var67 = var53;
                  var68 = (java.lang.String)var52;
                  var69 = var97;
                  var84 = (java.lang.String)var17;
                  var97 = (java.lang.String)var112;
                  var103 = var177;
                  var110 = var51;
                  var112 = var171;
                  var17 = var30;
                  var121 = (java.lang.String)var29;
                  var126 = var28;
                  var133 = var200;
                  var147 = var142;
                  var151 = (java.lang.String)var40;
                  var28 = var39;
                  var30 = (java.lang.String)var42;
                  var171 = var37;
                  var177 = (java.lang.String)var33;
                  var33 = var185;
                  var185 = var103;
                  var37 = (java.lang.String)var110;
                  var200 = (java.lang.String)var147;
                  var39 = (java.lang.String)var36;
                  var40 = var126;
                  var42 = var144;
                  var46 = var121;
                  var36 = var50;
               }

               var81 = (MessageId)var110;
               var17 = var133;
               var130 = var22;
               var133 = var140;
               var22 = var142;
               var140 = var144;
               var142 = (java.lang.String)var147;
               var110 = var37;
               var147 = var200;
               var126 = var40;
               var144 = (java.lang.String)var42;
               var200 = var84;
               var177 = var103;
               var53 = var66;
               var52 = var67;
               var51 = var68;
               var50 = var69;
               var185 = var33;
               var33 = var177;
               var151 = (java.lang.String)var130;
               var28 = var126;
               var29 = var121;
               var30 = (java.lang.String)var17;
               var171 = (java.lang.String)var112;
               var37 = var171;
               var42 = var30;
               var112 = var97;
               var39 = (java.lang.String)var28;
               var40 = var151;
               var97 = (java.lang.String)var36;
               var46 = (java.lang.String)var29;
               var103 = (java.lang.String)var185;
               var36 = var39;
               var121 = var46;
               var9 = var7;
            }

            var112 = var44;
            var66 = var97;
            var4 = var86;
            var7 = var6;
            var35 = var177;
            var177 = (java.lang.String)var52;
            var41 = var51;
            var97 = var50;
            var86 = var8;
            var81 = var58;
            var69 = var200;
            var70 = var60;
            var64 = var59;
            var65 = var108;
            var60 = var35;
            var108 = (java.lang.String)var43;
            var200 = var41;
            var6 = var85;
            var63 = var17;
            var43 = var81;
            var59 = var103;
            var17 = var171;
            var51 = var30;
            var52 = var29;
            var67 = (java.lang.String)var28;
            var171 = var151;
            var44 = var130;
            var29 = var133;
            var68 = (java.lang.String)var22;
            var61 = var140;
            var50 = var142;
            var58 = (java.lang.String)var112;
            var22 = var126;
            var62 = (java.lang.String)var185;
            var185 = var110;
            var28 = var147;
            var30 = var121;
         }

         var77.b(var76);
         return new NotificationData(
            var9,
            var7,
            var47,
            var55,
            (Integer)var56,
            var49,
            (Integer)var45,
            var30,
            (java.lang.Long)var28,
            (Integer)var36,
            var48,
            (ChannelId)var185,
            var144,
            var62,
            (ChannelId)var33,
            (Integer)var22,
            var37,
            (java.util.List)var42,
            (UserId)var54,
            var58,
            var39,
            (Integer)var40,
            var50,
            var61,
            var68,
            (Integer)var29,
            (GuildId)var44,
            var46,
            var171,
            var67,
            (Integer)var52,
            var51,
            (ApplicationId)var17,
            var59,
            var66,
            (NotificationMessage)var43,
            var13,
            (Integer)var63,
            (boolean)var6,
            (boolean)var4,
            (UserId)var112,
            var200,
            var108,
            var60,
            var65,
            var64,
            var57,
            (java.lang.Boolean)var70,
            var69,
            var53,
            (boolean)var5,
            var81,
            (boolean)var86,
            var97,
            var41,
            var177,
            var35,
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
