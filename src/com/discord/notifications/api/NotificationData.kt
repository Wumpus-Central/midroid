package com.discord.notifications.api

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.Y
import ha.h
import ha.p0
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import m8.q

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
         val var4: NotificationData = var1 as NotificationData;
         if (!kotlin.jvm.internal.q.c(this.type, (var1 as NotificationData).type)) {
            return false;
         } else {
            var var2: Boolean;
            label244: {
               if (this.messageId == null) {
                  if (var4.messageId == null) {
                     var2 = true;
                     break label244;
                  }
               } else if (var4.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var4.messageId);
                  break label244;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageActivityType, var4.messageActivityType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageApplicationName, var4.messageApplicationName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageType, var4.messageType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageContent, var4.messageContent)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageFlags, var4.messageFlags)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelType, var4.channelType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelName, var4.channelName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelId, var4.channelId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelIcon, var4.channelIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.parentName, var4.parentName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.parentId, var4.parentId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.messageReferenceType, var4.messageReferenceType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.channelRtcRegion, var4.channelRtcRegion)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.ackChannelIds, var4.ackChannelIds)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userId, var4.userId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userUsername, var4.userUsername)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userGlobalName, var4.userGlobalName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userDiscriminator, var4.userDiscriminator)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userAvatar, var4.userAvatar)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userGuildAvatar, var4.userGuildAvatar)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.platformUserUsername, var4.platformUserUsername)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.relationshipType, var4.relationshipType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildId, var4.guildId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildName, var4.guildName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildIcon, var4.guildIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityInstanceId, var4.activityInstanceId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityType, var4.activityType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.activityName, var4.activityName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationId, var4.applicationId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationName, var4.applicationName)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.applicationIcon, var4.applicationIcon)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.message, var4.message)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.stageInstanceTopic, var4.stageInstanceTopic)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.guildScheduledEventEntityType, var4.guildScheduledEventEntityType)) {
               return false;
            } else if (this.canReply != var4.canReply) {
               return false;
            } else if (this.isFromCurrentUser != var4.isFromCurrentUser) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.receivingUserId, var4.receivingUserId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.title, var4.title)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.subtitle, var4.subtitle)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.iconUrl, var4.iconUrl)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notificationChannel, var4.notificationChannel)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.trackingType, var4.trackingType)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.deeplink, var4.deeplink)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.expandSubtitle, var4.expandSubtitle)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.imageAttachmentUrl, var4.imageAttachmentUrl)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.timeReceived, var4.timeReceived)) {
               return false;
            } else if (this.silent != var4.silent) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.userInfo, var4.userInfo)) {
               return false;
            } else if (this.appDm != var4.appDm) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notifTypeId, var4.notifTypeId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.notifInstanceId, var4.notifInstanceId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.joinId, var4.joinId)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.mentionType, var4.mentionType)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.appState, var4.appState);
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

      val var53: Int = java.lang.Boolean.hashCode(this.canReply);
      val var52: Int = java.lang.Boolean.hashCode(this.isFromCurrentUser);
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
                                                                                                                                                                                    + var53
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var52
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

      val var27: Int = this.messageActivityType;
      val var26: java.lang.String = this.messageApplicationName;
      val var11: Int = this.messageType;
      val var35: java.lang.String = this.messageContent;
      val var21: java.lang.Long = this.messageFlags;
      val var48: Int = this.channelType;
      val var55: java.lang.String = this.channelName;
      val var12: ChannelId = this.channelId;
      val var34: java.lang.String = this.channelIcon;
      val var10: java.lang.String = this.parentName;
      val var56: ChannelId = this.parentId;
      val var47: Int = this.messageReferenceType;
      val var30: java.lang.String = this.channelRtcRegion;
      val var17: java.util.List = this.ackChannelIds;
      val var45: UserId = this.userId;
      val var22: java.lang.String = this.userUsername;
      val var38: java.lang.String = this.userGlobalName;
      val var28: Int = this.userDiscriminator;
      val var42: java.lang.String = this.userAvatar;
      val var44: java.lang.String = this.userGuildAvatar;
      val var36: java.lang.String = this.platformUserUsername;
      val var39: Int = this.relationshipType;
      val var50: GuildId = this.guildId;
      val var20: java.lang.String = this.guildName;
      val var33: java.lang.String = this.guildIcon;
      val var52: java.lang.String = this.activityInstanceId;
      val var8: Int = this.activityType;
      val var29: java.lang.String = this.activityName;
      val var13: ApplicationId = this.applicationId;
      val var49: java.lang.String = this.applicationName;
      val var19: java.lang.String = this.applicationIcon;
      val var53: NotificationMessage = this.message;
      val var37: java.lang.String = this.stageInstanceTopic;
      val var16: Int = this.guildScheduledEventEntityType;
      val var4: Boolean = this.canReply;
      val var3: Boolean = this.isFromCurrentUser;
      val var24: UserId = this.receivingUserId;
      val var15: java.lang.String = this.title;
      val var57: java.lang.String = this.subtitle;
      val var7: java.lang.String = this.iconUrl;
      val var32: java.lang.String = this.notificationChannel;
      val var31: java.lang.String = this.trackingType;
      val var43: java.lang.String = this.deeplink;
      val var46: java.lang.Boolean = this.expandSubtitle;
      val var23: java.lang.String = this.imageAttachmentUrl;
      val var40: java.lang.String = this.timeReceived;
      val var2: Boolean = this.silent;
      val var14: java.util.Map = this.userInfo;
      val var1: Boolean = this.appDm;
      val var25: java.lang.String = this.notifTypeId;
      val var18: java.lang.String = this.notifInstanceId;
      val var41: java.lang.String = this.joinId;
      val var51: java.lang.String = this.mentionType;
      val var54: java.lang.String = this.appState;
      val var9: StringBuilder = new StringBuilder();
      var9.append("NotificationData(type=");
      var9.append(var6);
      var9.append(", messageId=");
      var9.append(var58);
      var9.append(", messageActivityType=");
      var9.append(var27);
      var9.append(", messageApplicationName=");
      var9.append(var26);
      var9.append(", messageType=");
      var9.append(var11);
      var9.append(", messageContent=");
      var9.append(var35);
      var9.append(", messageFlags=");
      var9.append(var21);
      var9.append(", channelType=");
      var9.append(var48);
      var9.append(", channelName=");
      var9.append(var55);
      var9.append(", channelId=");
      var9.append(var12);
      var9.append(", channelIcon=");
      var9.append(var34);
      var9.append(", parentName=");
      var9.append(var10);
      var9.append(", parentId=");
      var9.append(var56);
      var9.append(", messageReferenceType=");
      var9.append(var47);
      var9.append(", channelRtcRegion=");
      var9.append(var30);
      var9.append(", ackChannelIds=");
      var9.append(var17);
      var9.append(", userId=");
      var9.append(var45);
      var9.append(", userUsername=");
      var9.append(var22);
      var9.append(", userGlobalName=");
      var9.append(var38);
      var9.append(", userDiscriminator=");
      var9.append(var28);
      var9.append(", userAvatar=");
      var9.append(var42);
      var9.append(", userGuildAvatar=");
      var9.append(var44);
      var9.append(", platformUserUsername=");
      var9.append(var36);
      var9.append(", relationshipType=");
      var9.append(var39);
      var9.append(", guildId=");
      var9.append(var50);
      var9.append(", guildName=");
      var9.append(var20);
      var9.append(", guildIcon=");
      var9.append(var33);
      var9.append(", activityInstanceId=");
      var9.append(var52);
      var9.append(", activityType=");
      var9.append(var8);
      var9.append(", activityName=");
      var9.append(var29);
      var9.append(", applicationId=");
      var9.append(var13);
      var9.append(", applicationName=");
      var9.append(var49);
      var9.append(", applicationIcon=");
      var9.append(var19);
      var9.append(", message=");
      var9.append(var53);
      var9.append(", stageInstanceTopic=");
      var9.append(var37);
      var9.append(", guildScheduledEventEntityType=");
      var9.append(var16);
      var9.append(", canReply=");
      var9.append(var4);
      var9.append(", isFromCurrentUser=");
      var9.append(var3);
      var9.append(", receivingUserId=");
      var9.append(var24);
      var9.append(", title=");
      var9.append(var15);
      var9.append(", subtitle=");
      var9.append(var57);
      var9.append(", iconUrl=");
      var9.append(var7);
      var9.append(", notificationChannel=");
      var9.append(var32);
      var9.append(", trackingType=");
      var9.append(var31);
      var9.append(", deeplink=");
      var9.append(var43);
      var9.append(", expandSubtitle=");
      var9.append(var46);
      var9.append(", imageAttachmentUrl=");
      var9.append(var23);
      var9.append(", timeReceived=");
      var9.append(var40);
      var9.append(", silent=");
      var9.append(var2);
      var9.append(", userInfo=");
      var9.append(var14);
      var9.append(", appDm=");
      var9.append(var1);
      var9.append(", notifTypeId=");
      var9.append(var25);
      var9.append(", notifInstanceId=");
      var9.append(var18);
      var9.append(", joinId=");
      var9.append(var41);
      var9.append(", mentionType=");
      var9.append(var51);
      var9.append(", appState=");
      var9.append(var54);
      var9.append(")");
      return var9.toString();
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
         val var8: KSerializer = a.u(MessageId.$serializer.INSTANCE);
         val var35: N = N.a;
         val var10: KSerializer = a.u(N.a);
         val var6: KSerializer = a.u(var1);
         val var3: KSerializer = a.u(var35);
         val var5: KSerializer = a.u(var1);
         val var2: KSerializer = a.u(Y.a);
         val var11: KSerializer = a.u(var35);
         val var12: KSerializer = a.u(var1);
         val var13: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var4: KSerializer = a.u(ChannelId.$serializer.INSTANCE);
         val var9: KSerializer = a.u(var1);
         val var7: KSerializer = a.u(var1);
         val var27: KSerializer = a.u(var13);
         val var34: KSerializer = a.u(var35);
         val var24: KSerializer = a.u(var1);
         val var37: UserId.$serializer = UserId.$serializer.INSTANCE;
         val var33: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var20: KSerializer = a.u(var1);
         val var14: KSerializer = a.u(var1);
         val var15: KSerializer = a.u(var35);
         val var28: KSerializer = a.u(var1);
         val var19: KSerializer = a.u(var1);
         val var21: KSerializer = a.u(var1);
         val var18: KSerializer = a.u(var35);
         val var23: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var22: KSerializer = a.u(var1);
         val var25: KSerializer = a.u(var1);
         val var53: KSerializer = a.u(var1);
         val var29: KSerializer = a.u(var35);
         val var26: KSerializer = a.u(var1);
         val var16: KSerializer = a.u(ApplicationId.$serializer.INSTANCE);
         val var32: KSerializer = a.u(var1);
         val var17: KSerializer = a.u(var1);
         val var31: KSerializer = a.u(NotificationMessageSerializer.INSTANCE);
         val var30: KSerializer = a.u(var1);
         val var36: KSerializer = a.u(var35);
         val var54: h = h.a;
         return new KSerializer[]{
            var1,
            var8,
            var10,
            var6,
            var3,
            var5,
            var2,
            var11,
            var12,
            var4,
            var9,
            var7,
            var27,
            var34,
            var24,
            ChannelListSerializer.INSTANCE,
            var33,
            var20,
            var14,
            var15,
            var28,
            var19,
            var21,
            var18,
            var23,
            var22,
            var25,
            var53,
            var29,
            var26,
            var16,
            var32,
            var17,
            var31,
            var30,
            var36,
            CanReplySerializer.INSTANCE,
            h.a,
            a.u(var37),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var1),
            a.u(var54),
            a.u(var1),
            a.u(var1),
            var54,
            var47[49],
            var54,
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
         var var3: Byte;
         val var4: Byte;
         var var5: Byte;
         var var6: Byte;
         var var7: Int;
         var var9: Int;
         var var13: java.lang.String;
         var var17: Any;
         var var29: Any;
         var var32: java.lang.String;
         var var33: Any;
         var var34: java.lang.String;
         var var35: Any;
         var var36: java.lang.String;
         var var37: java.lang.String;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         var var43: java.lang.String;
         var var44: java.lang.String;
         var var45: Any;
         var var46: java.lang.String;
         var var47: java.lang.String;
         var var48: java.lang.String;
         var var49: java.lang.String;
         var var50: Any;
         var var51: Any;
         var var54: Any;
         var var55: java.lang.String;
         var var56: Any;
         var var57: Any;
         var var58: java.lang.String;
         var var59: java.lang.String;
         var var60: java.lang.String;
         var var61: java.lang.String;
         var var62: Any;
         var var63: Any;
         var var65: java.lang.String;
         var var66: Any;
         var var67: java.lang.String;
         var var68: Any;
         var var69: java.lang.String;
         val var70: java.lang.String;
         val var71: java.lang.String;
         var var81: Any;
         var var98: java.lang.String;
         var var100: java.lang.String;
         var var111: java.lang.String;
         var var116: java.lang.String;
         var var143: java.lang.String;
         var var163: java.lang.String;
         var var170: Any;
         var var176: java.lang.String;
         var var243: java.lang.String;
         var var247: java.lang.String;
         var var353: java.lang.String;
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
            var36 = var77.v(var76, 5, var10, null) as java.lang.String;
            val var28: java.lang.Long = var77.v(var76, 6, Y.a, null) as java.lang.Long;
            var54 = var77.v(var76, 7, var12, null) as Int;
            var48 = var77.v(var76, 8, var10, null) as java.lang.String;
            val var11: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
            val var26: ChannelId = var77.v(var76, 9, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var67 = var77.v(var76, 10, var10, null) as java.lang.String;
            var34 = var77.v(var76, 11, var10, null) as java.lang.String;
            var33 = var77.v(var76, 12, var11, null) as ChannelId;
            val var22: Int = var77.v(var76, 13, var12, null) as Int;
            var37 = var77.v(var76, 14, var10, null) as java.lang.String;
            var42 = var77.m(var76, 15, ChannelListSerializer.INSTANCE, null) as java.util.List;
            val var99: UserId.$serializer = UserId.$serializer.INSTANCE;
            var63 = var77.v(var76, 16, UserId.$serializer.INSTANCE, null) as UserId;
            var176 = var77.v(var76, 17, var10, null) as java.lang.String;
            var39 = var77.v(var76, 18, var10, null) as java.lang.String;
            var68 = var77.v(var76, 19, var12, null) as Int;
            var60 = var77.v(var76, 20, var10, null) as java.lang.String;
            var58 = var77.v(var76, 21, var10, null) as java.lang.String;
            var32 = var77.v(var76, 22, var10, null) as java.lang.String;
            var29 = var77.v(var76, 23, var12, null) as Int;
            val var25: GuildId = var77.v(var76, 24, GuildId.$serializer.INSTANCE, null) as GuildId;
            val var24: java.lang.String = var77.v(var76, 25, var10, null) as java.lang.String;
            val var21: java.lang.String = var77.v(var76, 26, var10, null) as java.lang.String;
            val var20: java.lang.String = var77.v(var76, 27, var10, null) as java.lang.String;
            val var19: Int = var77.v(var76, 28, var12, null) as Int;
            val var18: java.lang.String = var77.v(var76, 29, var10, null) as java.lang.String;
            var17 = var77.v(var76, 30, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            val var23: java.lang.String = var77.v(var76, 31, var10, null) as java.lang.String;
            var116 = var77.v(var76, 32, var10, null) as java.lang.String;
            val var15: NotificationMessage = var77.v(var76, 33, NotificationMessageSerializer.INSTANCE, null) as NotificationMessage;
            var13 = var77.v(var76, 34, var10, null) as java.lang.String;
            val var14: Int = var77.v(var76, 35, var12, null) as Int;
            var5 = var77.m(var76, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.FALSE) as java.lang.Boolean;
            var6 = var77.s(var76, 37);
            var51 = var77.v(var76, 38, var99, null) as UserId;
            val var105: java.lang.String = var77.v(var76, 39, var10, null) as java.lang.String;
            var247 = var77.v(var76, 40, var10, null) as java.lang.String;
            var70 = var77.v(var76, 41, var10, null) as java.lang.String;
            var61 = var77.v(var76, 42, var10, null) as java.lang.String;
            var59 = var77.v(var76, 43, var10, null) as java.lang.String;
            var243 = var77.v(var76, 44, var10, null) as java.lang.String;
            var62 = var77.v(var76, 45, h.a, null) as java.lang.Boolean;
            var100 = var77.v(var76, 46, var10, null) as java.lang.String;
            var353 = var77.v(var76, 47, var10, null) as java.lang.String;
            var3 = var77.s(var76, 48);
            var170 = var77.m(var76, 49, var78[49], null) as java.util.Map;
            val var2: Byte = var77.s(var76, 50);
            val var27: java.lang.String = var77.v(var76, 51, var10, null) as java.lang.String;
            var44 = var77.v(var76, 52, var10, null) as java.lang.String;
            var65 = var77.v(var76, 53, var10, null) as java.lang.String;
            val var72: java.lang.String = var77.v(var76, 54, var10, null) as java.lang.String;
            var98 = var77.v(var76, 55, var10, null) as java.lang.String;
            var55 = var80;
            var7 = 16777215;
            var9 = -1;
            var81 = (MessageId)var170;
            var40 = var28;
            var170 = var26;
            var66 = var22;
            var143 = var176;
            var41 = var25;
            var46 = var24;
            var69 = var21;
            var163 = var20;
            var35 = var19;
            var176 = var18;
            var38 = var23;
            var43 = var116;
            var50 = var15;
            var57 = var14;
            var71 = var105;
            var111 = var247;
            var116 = var243;
            var247 = var353;
            var4 = var2;
            var353 = var27;
            var243 = var72;
         } else {
            var57 = null;
            var var89: Boolean = true;
            var6 = 0;
            var var87: Byte = 0;
            var var8: Byte = 0;
            var5 = 0;
            var3 = 0;
            var9 = 0;
            var98 = null;
            var38 = null;
            var32 = null;
            var247 = null;
            var60 = null;
            var35 = null;
            var111 = null;
            var59 = null;
            var243 = null;
            var51 = null;
            var50 = null;
            var58 = null;
            var56 = null;
            var var150: java.lang.String = null;
            var34 = null;
            var33 = null;
            var var148: java.lang.String = null;
            var var146: java.lang.String = null;
            var143 = null;
            var var138: Any = null;
            var var135: Any = null;
            var var156: java.lang.String = null;
            var163 = null;
            var29 = null;
            var170 = null;
            var176 = null;
            var37 = null;
            var42 = null;
            var54 = null;
            var116 = null;
            var39 = null;
            var40 = null;
            var100 = null;
            var81 = null;
            var48 = null;
            var17 = null;
            var44 = null;
            var45 = null;
            var46 = null;
            var var106: java.lang.String = null;
            var13 = null;
            var55 = null;
            var47 = null;
            var41 = null;
            var43 = null;
            var var153: Any = null;
            var var113: Any = null;
            var36 = null;
            var var131: Any = null;
            var var128: java.lang.String = null;
            var49 = null;

            while (var89) {
               label379: {
                  label380: {
                     label310: {
                        label381: {
                           label307: {
                              label306: {
                                 label382: {
                                    label303: {
                                       label383: {
                                          label384: {
                                             label385: {
                                                label386: {
                                                   label285: {
                                                      label284: {
                                                         label283: {
                                                            label282: {
                                                               label387: {
                                                                  label275: {
                                                                     label388: {
                                                                        label389: {
                                                                           label390: {
                                                                              label391: {
                                                                                 label392: {
                                                                                    label242: {
                                                                                       label393: {
                                                                                          var7 = var77.x(var76);
                                                                                          switch (var7) {
                                                                                             case -1:
                                                                                                var7 = var9;
                                                                                                var89 = false;
                                                                                                break label284;
                                                                                             case 0:
                                                                                                var47 = var77.t(var76, 0);
                                                                                                var7 = var9 or 1;
                                                                                                break label284;
                                                                                             case 1:
                                                                                                val var251: MessageId;
                                                                                                if (var55 != null) {
                                                                                                   var251 = MessageId.box-impl(var55);
                                                                                                } else {
                                                                                                   var251 = null;
                                                                                                }

                                                                                                val var252: MessageId = var77.v(
                                                                                                   var76, 1, MessageId.$serializer.INSTANCE, var251
                                                                                                ) as MessageId;
                                                                                                if (var252 != null) {
                                                                                                   var55 = var252.unbox-impl();
                                                                                                } else {
                                                                                                   var55 = null;
                                                                                                }

                                                                                                var7 = var9 or 2;
                                                                                                break label284;
                                                                                             case 2:
                                                                                                var56 = var77.v(var76, 2, N.a, var56) as Int;
                                                                                                var7 = var9 or 4;
                                                                                                break label284;
                                                                                             case 3:
                                                                                                var49 = var77.v(var76, 3, C0.a, var49) as java.lang.String;
                                                                                                var7 = var9 or 8;
                                                                                                break label284;
                                                                                             case 4:
                                                                                                var45 = var77.v(var76, 4, N.a, var45) as Int;
                                                                                                var7 = var9 or 16;
                                                                                                var62 = var153;
                                                                                                var63 = var36;
                                                                                                var61 = var128;
                                                                                                break label383;
                                                                                             case 5:
                                                                                                var128 = var77.v(var76, 5, C0.a, var128) as java.lang.String;
                                                                                                var7 = var9 or 32;
                                                                                                var62 = var153;
                                                                                                break label390;
                                                                                             case 6:
                                                                                                var62 = var77.v(var76, 6, Y.a, var153) as java.lang.Long;
                                                                                                var7 = var9 or 64;
                                                                                                break label390;
                                                                                             case 7:
                                                                                                var63 = var77.v(var76, 7, N.a, var36) as Int;
                                                                                                var7 = var9 or 128;
                                                                                                var61 = var128;
                                                                                                var62 = var153;
                                                                                                break label383;
                                                                                             case 8:
                                                                                                var353 = var34;
                                                                                                var34 = (java.lang.String)var42;
                                                                                                var48 = var77.v(var76, 8, C0.a, var48) as java.lang.String;
                                                                                                var7 = var9 or 256;
                                                                                                var65 = var37;
                                                                                                var37 = (java.lang.String)var113;
                                                                                                var62 = var153;
                                                                                                var63 = var36;
                                                                                                var36 = (java.lang.String)var131;
                                                                                                var42 = var150;
                                                                                                var61 = var128;
                                                                                                break label381;
                                                                                             case 9:
                                                                                                var113 = var77.v(
                                                                                                   var76, 9, ChannelId.$serializer.INSTANCE, var113
                                                                                                ) as ChannelId;
                                                                                                var7 = var9 or 512;
                                                                                                break label242;
                                                                                             case 10:
                                                                                                var150 = var77.v(var76, 10, C0.a, var150) as java.lang.String;
                                                                                                var7 = var9 or 1024;
                                                                                                break label242;
                                                                                             case 11:
                                                                                                var61 = var77.v(var76, 11, C0.a, var34) as java.lang.String;
                                                                                                var7 = var9 or 2048;
                                                                                                var34 = (java.lang.String)var33;
                                                                                                var33 = var61;
                                                                                                break label389;
                                                                                             case 12:
                                                                                                val var306: ChannelId = var77.v(
                                                                                                   var76, 12, ChannelId.$serializer.INSTANCE, var33
                                                                                                ) as ChannelId;
                                                                                                var7 = var9 or 4096;
                                                                                                var33 = var34;
                                                                                                var34 = var306;
                                                                                                break label389;
                                                                                             case 13:
                                                                                                val var303: Int = var77.v(var76, 13, N.a, var131) as Int;
                                                                                                var7 = var9 or 8192;
                                                                                                var131 = var37;
                                                                                                var37 = var303;
                                                                                                break label388;
                                                                                             case 14:
                                                                                                var61 = var77.v(var76, 14, C0.a, var37) as java.lang.String;
                                                                                                var7 = var9 or 16384;
                                                                                                var37 = (java.lang.String)var131;
                                                                                                var131 = var61;
                                                                                                break label388;
                                                                                             case 15:
                                                                                                val var300: java.util.List = var77.m(
                                                                                                   var76, 15, ChannelListSerializer.INSTANCE, var42
                                                                                                ) as java.util.List;
                                                                                                var65 = var37;
                                                                                                var37 = (java.lang.String)var113;
                                                                                                var113 = var131;
                                                                                                var7 = var9 or '耀';
                                                                                                var42 = var150;
                                                                                                var353 = var34;
                                                                                                var34 = var300;
                                                                                                break label303;
                                                                                             case 16:
                                                                                                var148 = var143;
                                                                                                var146 = (java.lang.String)var138;
                                                                                                var143 = (java.lang.String)var135;
                                                                                                var135 = var156;
                                                                                                var163 = var39;
                                                                                                var156 = (java.lang.String)var40;
                                                                                                var54 = var77.v(var76, 16, UserId.$serializer.INSTANCE, var54) as UserId;
                                                                                                var29 = var46;
                                                                                                var176 = var37;
                                                                                                var170 = var42;
                                                                                                var37 = (java.lang.String)var113;
                                                                                                var7 = var9 or 65536;
                                                                                                var66 = var247;
                                                                                                var67 = var243;
                                                                                                var68 = var51;
                                                                                                var69 = (java.lang.String)var50;
                                                                                                var86 = var38;
                                                                                                var100 = var116;
                                                                                                var106 = var32;
                                                                                                var113 = var81;
                                                                                                var116 = var176;
                                                                                                var17 = var170;
                                                                                                var128 = (java.lang.String)var29;
                                                                                                var131 = var163;
                                                                                                var138 = var17;
                                                                                                var150 = var146;
                                                                                                var153 = var148;
                                                                                                var32 = (java.lang.String)var33;
                                                                                                var33 = var34;
                                                                                                var34 = var106;
                                                                                                var38 = (java.lang.String)var153;
                                                                                                var39 = var36;
                                                                                                var40 = var131;
                                                                                                var42 = var150;
                                                                                                var46 = var128;
                                                                                                var36 = var100;
                                                                                                break label379;
                                                                                             case 17:
                                                                                                var40 = var39;
                                                                                                var116 = var77.v(var76, 17, C0.a, var116) as java.lang.String;
                                                                                                var7 = var9 or 131072;
                                                                                                var39 = (java.lang.String)var40;
                                                                                                break label382;
                                                                                             case 18:
                                                                                                var61 = var77.v(var76, 18, C0.a, var39) as java.lang.String;
                                                                                                var7 = var9 or 262144;
                                                                                                var39 = (java.lang.String)var40;
                                                                                                var40 = var61;
                                                                                                break label382;
                                                                                             case 19:
                                                                                                var40 = var77.v(var76, 19, N.a, var40) as Int;
                                                                                                var7 = var9 or 524288;
                                                                                                var39 = (java.lang.String)var40;
                                                                                                var40 = var39;
                                                                                                break label382;
                                                                                             case 20:
                                                                                                var148 = var77.v(var76, 20, C0.a, var148) as java.lang.String;
                                                                                                var7 = var9 or 1048576;
                                                                                                break label386;
                                                                                             case 21:
                                                                                                var146 = var77.v(var76, 21, C0.a, var146) as java.lang.String;
                                                                                                var7 = var9 or 2097152;
                                                                                                break label386;
                                                                                             case 22:
                                                                                                var143 = var77.v(var76, 22, C0.a, var143) as java.lang.String;
                                                                                                var7 = var9 or 4194304;
                                                                                                break label386;
                                                                                             case 23:
                                                                                                var138 = var77.v(var76, 23, N.a, var138) as Int;
                                                                                                var7 = var9 or 8388608;
                                                                                                break label386;
                                                                                             case 24:
                                                                                                var135 = var77.v(
                                                                                                   var76, 24, GuildId.$serializer.INSTANCE, var135
                                                                                                ) as GuildId;
                                                                                                var7 = var9 or 16777216;
                                                                                                break label386;
                                                                                             case 25:
                                                                                                var163 = (java.lang.String)var170;
                                                                                                var176 = var156;
                                                                                                var46 = var77.v(var76, 25, C0.a, var46) as java.lang.String;
                                                                                                var7 = var9 or 33554432;
                                                                                                var156 = var176;
                                                                                                var170 = var163;
                                                                                                break label306;
                                                                                             case 26:
                                                                                                var62 = var77.v(var76, 26, C0.a, var156) as java.lang.String;
                                                                                                var7 = var9 or 67108864;
                                                                                                var156 = var176;
                                                                                                var163 = (java.lang.String)var170;
                                                                                                var170 = var163;
                                                                                                var176 = (java.lang.String)var62;
                                                                                                break label306;
                                                                                             case 27:
                                                                                                var62 = var77.v(var76, 27, C0.a, var163) as java.lang.String;
                                                                                                var7 = var9 or 134217728;
                                                                                                var156 = var176;
                                                                                                var163 = (java.lang.String)var170;
                                                                                                var170 = var62;
                                                                                                var176 = var156;
                                                                                                break label306;
                                                                                             case 28:
                                                                                                var29 = var77.v(var76, 28, N.a, var29) as Int;
                                                                                                var7 = var9 or 268435456;
                                                                                                var156 = var176;
                                                                                                var163 = (java.lang.String)var170;
                                                                                                var170 = var163;
                                                                                                var176 = var156;
                                                                                                break label306;
                                                                                             case 29:
                                                                                                var62 = var77.v(var76, 29, C0.a, var170) as java.lang.String;
                                                                                                var7 = var9 or 536870912;
                                                                                                var176 = var156;
                                                                                                var170 = var163;
                                                                                                var163 = (java.lang.String)var62;
                                                                                                var156 = var176;
                                                                                                break label306;
                                                                                             case 30:
                                                                                                val var271: ApplicationId = var77.v(
                                                                                                   var76, 30, ApplicationId.$serializer.INSTANCE, var176
                                                                                                ) as ApplicationId;
                                                                                                var7 = var9 or 1073741824;
                                                                                                var163 = (java.lang.String)var170;
                                                                                                var176 = var156;
                                                                                                var170 = var163;
                                                                                                var156 = var271;
                                                                                                break label306;
                                                                                             case 31:
                                                                                                var106 = var77.v(var76, 31, C0.a, var106) as java.lang.String;
                                                                                                var32 = (java.lang.String)var33;
                                                                                                var150 = var146;
                                                                                                var148 = var143;
                                                                                                var146 = (java.lang.String)var138;
                                                                                                var143 = (java.lang.String)var135;
                                                                                                var135 = var156;
                                                                                                var17 = var170;
                                                                                                var176 = var37;
                                                                                                var170 = var42;
                                                                                                var163 = var39;
                                                                                                var156 = (java.lang.String)var40;
                                                                                                var29 = var46;
                                                                                                var40 = var131;
                                                                                                var46 = var128;
                                                                                                var7 = var9 or Integer.MIN_VALUE;
                                                                                                var36 = var100;
                                                                                                var66 = var247;
                                                                                                var67 = var243;
                                                                                                var68 = var51;
                                                                                                var69 = (java.lang.String)var50;
                                                                                                var86 = var38;
                                                                                                var100 = var116;
                                                                                                var106 = var32;
                                                                                                var113 = var81;
                                                                                                var116 = var176;
                                                                                                var128 = (java.lang.String)var29;
                                                                                                var131 = var163;
                                                                                                var138 = var17;
                                                                                                var153 = var148;
                                                                                                var33 = var34;
                                                                                                var34 = var106;
                                                                                                var37 = (java.lang.String)var113;
                                                                                                var38 = (java.lang.String)var153;
                                                                                                var39 = var36;
                                                                                                var42 = var150;
                                                                                                break label379;
                                                                                             case 32:
                                                                                                var100 = var77.v(var76, 32, C0.a, var100) as java.lang.String;
                                                                                                var6 |= 1;
                                                                                                var83 = (java.lang.String)var35;
                                                                                                var61 = var247;
                                                                                                var247 = var243;
                                                                                                var243 = (java.lang.String)var51;
                                                                                                var100 = (java.lang.String)var50;
                                                                                                var17 = var38;
                                                                                                var51 = var81;
                                                                                                var38 = (java.lang.String)var17;
                                                                                                var50 = var100;
                                                                                                break label380;
                                                                                             case 33:
                                                                                                val var268: NotificationMessage = var77.v(
                                                                                                   var76, 33, NotificationMessageSerializer.INSTANCE, var81
                                                                                                ) as NotificationMessage;
                                                                                                var6 |= 2;
                                                                                                var81 = (MessageId)var17;
                                                                                                var17 = var268;
                                                                                                break label392;
                                                                                             case 34:
                                                                                                var13 = var77.v(var76, 34, C0.a, var13) as java.lang.String;
                                                                                                var6 |= 4;
                                                                                                var61 = (java.lang.String)var17;
                                                                                                break;
                                                                                             case 35:
                                                                                                var61 = var77.v(var76, 35, N.a, var17) as Int;
                                                                                                var6 |= 8;
                                                                                                break;
                                                                                             case 36:
                                                                                                var87 = var77.m(
                                                                                                   var76,
                                                                                                   36,
                                                                                                   CanReplySerializer.INSTANCE,
                                                                                                   java.lang.Boolean.valueOf((boolean)var87)
                                                                                                ) as java.lang.Boolean;
                                                                                                var6 |= 16;
                                                                                                break label393;
                                                                                             case 37:
                                                                                                var3 = var77.s(var76, 37);
                                                                                                var6 |= 32;
                                                                                                break label387;
                                                                                             case 38:
                                                                                                var44 = var77.v(var76, 38, UserId.$serializer.INSTANCE, var44) as UserId;
                                                                                                var6 |= 64;
                                                                                                break label393;
                                                                                             case 39:
                                                                                                var41 = var77.v(var76, 39, C0.a, var41) as java.lang.String;
                                                                                                var6 |= 128;
                                                                                                break label393;
                                                                                             case 40:
                                                                                                var43 = var77.v(var76, 40, C0.a, var43) as java.lang.String;
                                                                                                var6 |= 256;
                                                                                                break label393;
                                                                                             case 41:
                                                                                                var35 = var77.v(var76, 41, C0.a, var35) as java.lang.String;
                                                                                                var6 |= 512;
                                                                                                var63 = var17;
                                                                                                var17 = var81;
                                                                                                break label275;
                                                                                             case 42:
                                                                                                var111 = var77.v(var76, 42, C0.a, var111) as java.lang.String;
                                                                                                var6 |= 1024;
                                                                                                break label387;
                                                                                             case 43:
                                                                                                var59 = var77.v(var76, 43, C0.a, var59) as java.lang.String;
                                                                                                var6 |= 2048;
                                                                                                var61 = var247;
                                                                                                break label283;
                                                                                             case 44:
                                                                                                var57 = var77.v(var76, 44, C0.a, var57) as java.lang.String;
                                                                                                var6 |= 4096;
                                                                                                var61 = var247;
                                                                                                break label283;
                                                                                             case 45:
                                                                                                var60 = var77.v(var76, 45, h.a, var60) as java.lang.Boolean;
                                                                                                var6 |= 8192;
                                                                                                var61 = var247;
                                                                                                break label283;
                                                                                             case 46:
                                                                                                var38 = var77.v(var76, 46, C0.a, var38) as java.lang.String;
                                                                                                var6 |= 16384;
                                                                                                var61 = var247;
                                                                                                break label283;
                                                                                             case 47:
                                                                                                var247 = var77.v(var76, 47, C0.a, var247) as java.lang.String;
                                                                                                var7 = 32768;
                                                                                                break label391;
                                                                                             case 48:
                                                                                                var5 = var77.s(var76, 48);
                                                                                                var7 = 65536;
                                                                                                break label282;
                                                                                             case 49:
                                                                                                var58 = var77.m(var76, 49, var78[49], var58) as java.util.Map;
                                                                                                var7 = 131072;
                                                                                                break label282;
                                                                                             case 50:
                                                                                                var8 = var77.s(var76, 50);
                                                                                                var6 |= 262144;
                                                                                                var38 = (java.lang.String)var17;
                                                                                                var83 = (java.lang.String)var35;
                                                                                                var61 = var247;
                                                                                                var247 = var243;
                                                                                                var243 = (java.lang.String)var51;
                                                                                                var62 = var50;
                                                                                                var17 = var38;
                                                                                                var35 = var81;
                                                                                                break label307;
                                                                                             case 51:
                                                                                                var50 = var77.v(var76, 51, C0.a, var50) as java.lang.String;
                                                                                                var7 = 524288;
                                                                                                break label391;
                                                                                             case 52:
                                                                                                var51 = var77.v(var76, 52, C0.a, var51) as java.lang.String;
                                                                                                var7 = 1048576;
                                                                                                break label391;
                                                                                             case 53:
                                                                                                var243 = var77.v(var76, 53, C0.a, var243) as java.lang.String;
                                                                                                var7 = 2097152;
                                                                                                break label391;
                                                                                             case 54:
                                                                                                var32 = var77.v(var76, 54, C0.a, var32) as java.lang.String;
                                                                                                var7 = 4194304;
                                                                                                break label391;
                                                                                             case 55:
                                                                                                var98 = var77.v(var76, 55, C0.a, var98) as java.lang.String;
                                                                                                var7 = 8388608;
                                                                                                break label391;
                                                                                             default:
                                                                                                throw new n(var7);
                                                                                          }

                                                                                          var17 = var81;
                                                                                          var81 = var61;
                                                                                          break label392;
                                                                                       }

                                                                                       var81 = (MessageId)var17;
                                                                                       var17 = var81;
                                                                                       break label392;
                                                                                    }

                                                                                    var34 = (java.lang.String)var33;
                                                                                    var33 = var34;
                                                                                    break label389;
                                                                                 }

                                                                                 var63 = var81;
                                                                                 break label275;
                                                                              }

                                                                              var6 |= var7;
                                                                              var61 = var247;
                                                                              break label283;
                                                                           }

                                                                           var63 = var36;
                                                                           var61 = var128;
                                                                           break label383;
                                                                        }

                                                                        var131 = var37;
                                                                        var61 = var34;
                                                                        var353 = (java.lang.String)var33;
                                                                        var37 = (java.lang.String)var113;
                                                                        var113 = var131;
                                                                        break label285;
                                                                     }

                                                                     var113 = var37;
                                                                     var37 = (java.lang.String)var113;
                                                                     var353 = var34;
                                                                     var61 = (java.lang.String)var33;
                                                                     break label285;
                                                                  }

                                                                  var83 = (java.lang.String)var35;
                                                                  var35 = var17;
                                                                  break label385;
                                                               }

                                                               var63 = var17;
                                                               var35 = var81;
                                                               var83 = (java.lang.String)var35;
                                                               break label385;
                                                            }

                                                            var6 |= var7;
                                                            var61 = var247;
                                                            var247 = var243;
                                                            break label384;
                                                         }

                                                         var247 = var243;
                                                         break label384;
                                                      }

                                                      var62 = var153;
                                                      var63 = var36;
                                                      var61 = var128;
                                                      break label383;
                                                   }

                                                   var34 = (java.lang.String)var42;
                                                   var65 = (java.lang.String)var131;
                                                   var33 = var61;
                                                   var42 = var150;
                                                   break label303;
                                                }

                                                var40 = var39;
                                                var39 = (java.lang.String)var40;
                                                break label382;
                                             }

                                             var17 = var38;
                                             var61 = var247;
                                             var247 = var243;
                                             var243 = (java.lang.String)var51;
                                             var62 = var50;
                                             var38 = (java.lang.String)var63;
                                             break label307;
                                          }

                                          var83 = (java.lang.String)var35;
                                          var38 = (java.lang.String)var17;
                                          var35 = var81;
                                          var17 = var38;
                                          var62 = var50;
                                          var243 = (java.lang.String)var51;
                                          break label307;
                                       }

                                       var353 = var34;
                                       var34 = (java.lang.String)var42;
                                       var65 = var37;
                                       var37 = (java.lang.String)var113;
                                       var36 = (java.lang.String)var131;
                                       var42 = var150;
                                       break label381;
                                    }

                                    var63 = var36;
                                    var61 = var128;
                                    var36 = (java.lang.String)var113;
                                    var62 = var153;
                                    break label381;
                                 }

                                 var163 = (java.lang.String)var170;
                                 var156 = var116;
                                 var116 = var176;
                                 var170 = var163;
                                 var176 = var156;
                                 var65 = (java.lang.String)var135;
                                 var353 = (java.lang.String)var138;
                                 var63 = var143;
                                 var62 = var146;
                                 var61 = var148;
                                 var46 = var39;
                                 var39 = var46;
                                 break label310;
                              }

                              var65 = (java.lang.String)var135;
                              var39 = var46;
                              var40 = var39;
                              var46 = (java.lang.String)var40;
                              var61 = var148;
                              var62 = var146;
                              var63 = var143;
                              var353 = (java.lang.String)var138;
                              var116 = var156;
                              var156 = var116;
                              break label310;
                           }

                           var50 = var100;
                           var51 = var35;
                           var100 = (java.lang.String)var62;
                           break label380;
                        }

                        var113 = var81;
                        var100 = var116;
                        var153 = var148;
                        var150 = var146;
                        var148 = var143;
                        var146 = (java.lang.String)var138;
                        var143 = (java.lang.String)var135;
                        var135 = var156;
                        var131 = var163;
                        var128 = (java.lang.String)var29;
                        var116 = var176;
                        var106 = var32;
                        var86 = var38;
                        var29 = var46;
                        var138 = var17;
                        var66 = var247;
                        var67 = var243;
                        var68 = var51;
                        var69 = (java.lang.String)var50;
                        var17 = var170;
                        var156 = (java.lang.String)var40;
                        var163 = var39;
                        var170 = var34;
                        var176 = var65;
                        var32 = (java.lang.String)var33;
                        var33 = var353;
                        var34 = var106;
                        var38 = (java.lang.String)var62;
                        var39 = (java.lang.String)var63;
                        var40 = var36;
                        var46 = var61;
                        var36 = var100;
                        break label379;
                     }

                     var138 = var17;
                     var106 = var32;
                     var86 = var38;
                     var38 = (java.lang.String)var153;
                     var66 = var247;
                     var67 = var243;
                     var68 = var51;
                     var69 = (java.lang.String)var50;
                     var100 = var156;
                     var113 = var81;
                     var17 = var163;
                     var128 = (java.lang.String)var29;
                     var131 = var170;
                     var135 = var176;
                     var143 = var65;
                     var146 = var353;
                     var148 = (java.lang.String)var63;
                     var150 = (java.lang.String)var62;
                     var153 = var61;
                     var156 = var46;
                     var163 = (java.lang.String)var40;
                     var29 = var39;
                     var170 = var42;
                     var176 = var37;
                     var32 = (java.lang.String)var33;
                     var33 = var34;
                     var34 = var106;
                     var37 = (java.lang.String)var113;
                     var39 = var36;
                     var40 = var131;
                     var42 = var150;
                     var46 = var128;
                     var36 = var100;
                     break label379;
                  }

                  var150 = var146;
                  var148 = var143;
                  var146 = (java.lang.String)var138;
                  var143 = (java.lang.String)var135;
                  var135 = var156;
                  var7 = var9;
                  var29 = var46;
                  var66 = var61;
                  var35 = var83;
                  var67 = var247;
                  var68 = var243;
                  var69 = var100;
                  var86 = (java.lang.String)var17;
                  var100 = var116;
                  var106 = var32;
                  var113 = var51;
                  var116 = var176;
                  var17 = var170;
                  var128 = (java.lang.String)var29;
                  var131 = var163;
                  var138 = var38;
                  var153 = var148;
                  var156 = (java.lang.String)var40;
                  var163 = var39;
                  var170 = var42;
                  var176 = var37;
                  var32 = (java.lang.String)var33;
                  var33 = var34;
                  var34 = var106;
                  var37 = (java.lang.String)var113;
                  var38 = (java.lang.String)var153;
                  var39 = var36;
                  var40 = var131;
                  var42 = var150;
                  var46 = var128;
                  var36 = (java.lang.String)var50;
               }

               var81 = (MessageId)var113;
               var17 = var138;
               var135 = var143;
               var138 = var146;
               var143 = var148;
               var146 = var150;
               var148 = (java.lang.String)var153;
               var113 = var37;
               var153 = var38;
               var131 = var40;
               var150 = (java.lang.String)var42;
               var38 = var86;
               var32 = var106;
               var247 = (java.lang.String)var66;
               var243 = var67;
               var51 = var68;
               var50 = var69;
               var34 = (java.lang.String)var33;
               var33 = var32;
               var156 = (java.lang.String)var135;
               var163 = (java.lang.String)var131;
               var29 = var128;
               var170 = var17;
               var176 = var116;
               var37 = var176;
               var42 = var170;
               var116 = var100;
               var39 = var163;
               var40 = var156;
               var100 = var36;
               var46 = (java.lang.String)var29;
               var106 = var34;
               var36 = var39;
               var128 = var46;
               var9 = var7;
            }

            var65 = var243;
            var4 = var8;
            var243 = var32;
            var44 = (java.lang.String)var51;
            var353 = (java.lang.String)var50;
            var81 = var58;
            var3 = var5;
            var100 = var38;
            var62 = var60;
            var116 = (java.lang.String)var57;
            var61 = var111;
            var70 = (java.lang.String)var35;
            var111 = var43;
            var71 = (java.lang.String)var41;
            var51 = var44;
            var6 = var3;
            var5 = var87;
            var57 = var17;
            var50 = var81;
            var43 = var100;
            var38 = var106;
            var17 = var176;
            var176 = (java.lang.String)var170;
            var35 = var29;
            var69 = var156;
            var41 = var135;
            var29 = var138;
            var32 = var143;
            var58 = var146;
            var60 = var148;
            var68 = var40;
            var143 = var116;
            var63 = var54;
            var66 = var131;
            var67 = var150;
            var170 = var113;
            var54 = var36;
            var40 = var153;
            var36 = var128;
            var7 = var6;
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
            var36,
            (java.lang.Long)var40,
            (Integer)var54,
            var48,
            (ChannelId)var170,
            var67,
            var34,
            (ChannelId)var33,
            (Integer)var66,
            var37,
            (java.util.List)var42,
            (UserId)var63,
            var143,
            var39,
            (Integer)var68,
            var60,
            var58,
            var32,
            (Integer)var29,
            (GuildId)var41,
            var46,
            var69,
            var163,
            (Integer)var35,
            var176,
            (ApplicationId)var17,
            var38,
            var43,
            (NotificationMessage)var50,
            var13,
            (Integer)var57,
            (boolean)var5,
            (boolean)var6,
            (UserId)var51,
            var71,
            var111,
            var70,
            var61,
            var59,
            var116,
            (java.lang.Boolean)var62,
            var100,
            var247,
            (boolean)var3,
            var81,
            (boolean)var4,
            var353,
            var44,
            var65,
            var243,
            var98,
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
         return ha.G.a.a(this);
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
