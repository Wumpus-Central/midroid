package com.discord.notifications.api

import cl.f
import cl.n
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import fl.o1
import fl.x0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import lh.r

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
   userInfo: Map<String, String> = ...
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
      var50
   ) {
   @f(
      with = ChannelListSerializer.class
   )
   public final val ackChannelIds: List<ChannelId>

   public final val activityInstanceId: String?
   public final val activityName: String?
   public final val activityType: Int?
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
      var53: SerializationConstructorMarker
   ) {
      val var54: Boolean;
      if (1 != (var1 and 1)) {
         var54 = true;
      } else {
         var54 = false;
      }

      if (var54 or false) {
         o1.a(new int[]{var1, var2}, new int[]{1, 0}, NotificationData.$serializer.INSTANCE.getDescriptor());
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

      val var55: java.util.List;
      if ((var1 and '耀') == 0) {
         var55 = i.k();
      } else {
         var55 = var18;
      }

      this.ackChannelIds = var55;
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

      if ((262144 and var1) == 0) {
         this.userGlobalName = null;
      } else {
         this.userGlobalName = var21;
      }

      if ((524288 and var1) == 0) {
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

      val var56: java.util.Map;
      if ((var2 and 131072) == 0) {
         var56 = r.h();
      } else {
         var56 = var52;
      }

      this.userInfo = var56;
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
      var50: MutableMap<java.lang.String, java.lang.String>
   ) {
      q.h(var1, "type");
      q.h(var16, "ackChannelIds");
      q.h(var50, "userInfo");
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
      userInfo: Map<String, String> = ...
   ): NotificationData {
      q.h(var1, "type");
      q.h(var16, "ackChannelIds");
      q.h(var50, "userInfo");
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
         if (!q.c(this.type, var1.type)) {
            return false;
         } else if (if (this.messageId == null) var1.messageId == null else var1.messageId != null && MessageId.equals-impl0(this.messageId, var1.messageId)) {
            if (!q.c(this.messageActivityType, var1.messageActivityType)) {
               return false;
            } else if (!q.c(this.messageApplicationName, var1.messageApplicationName)) {
               return false;
            } else if (!q.c(this.messageType, var1.messageType)) {
               return false;
            } else if (!q.c(this.messageContent, var1.messageContent)) {
               return false;
            } else if (!q.c(this.messageFlags, var1.messageFlags)) {
               return false;
            } else if (!q.c(this.channelType, var1.channelType)) {
               return false;
            } else if (!q.c(this.channelName, var1.channelName)) {
               return false;
            } else if (!q.c(this.channelId, var1.channelId)) {
               return false;
            } else if (!q.c(this.channelIcon, var1.channelIcon)) {
               return false;
            } else if (!q.c(this.parentName, var1.parentName)) {
               return false;
            } else if (!q.c(this.parentId, var1.parentId)) {
               return false;
            } else if (!q.c(this.messageReferenceType, var1.messageReferenceType)) {
               return false;
            } else if (!q.c(this.channelRtcRegion, var1.channelRtcRegion)) {
               return false;
            } else if (!q.c(this.ackChannelIds, var1.ackChannelIds)) {
               return false;
            } else if (!q.c(this.userId, var1.userId)) {
               return false;
            } else if (!q.c(this.userUsername, var1.userUsername)) {
               return false;
            } else if (!q.c(this.userGlobalName, var1.userGlobalName)) {
               return false;
            } else if (!q.c(this.userDiscriminator, var1.userDiscriminator)) {
               return false;
            } else if (!q.c(this.userAvatar, var1.userAvatar)) {
               return false;
            } else if (!q.c(this.userGuildAvatar, var1.userGuildAvatar)) {
               return false;
            } else if (!q.c(this.platformUserUsername, var1.platformUserUsername)) {
               return false;
            } else if (!q.c(this.relationshipType, var1.relationshipType)) {
               return false;
            } else if (!q.c(this.guildId, var1.guildId)) {
               return false;
            } else if (!q.c(this.guildName, var1.guildName)) {
               return false;
            } else if (!q.c(this.guildIcon, var1.guildIcon)) {
               return false;
            } else if (!q.c(this.activityInstanceId, var1.activityInstanceId)) {
               return false;
            } else if (!q.c(this.activityType, var1.activityType)) {
               return false;
            } else if (!q.c(this.activityName, var1.activityName)) {
               return false;
            } else if (!q.c(this.applicationId, var1.applicationId)) {
               return false;
            } else if (!q.c(this.applicationName, var1.applicationName)) {
               return false;
            } else if (!q.c(this.applicationIcon, var1.applicationIcon)) {
               return false;
            } else if (!q.c(this.message, var1.message)) {
               return false;
            } else if (!q.c(this.stageInstanceTopic, var1.stageInstanceTopic)) {
               return false;
            } else if (!q.c(this.guildScheduledEventEntityType, var1.guildScheduledEventEntityType)) {
               return false;
            } else if (this.canReply != var1.canReply) {
               return false;
            } else if (this.isFromCurrentUser != var1.isFromCurrentUser) {
               return false;
            } else if (!q.c(this.receivingUserId, var1.receivingUserId)) {
               return false;
            } else if (!q.c(this.title, var1.title)) {
               return false;
            } else if (!q.c(this.subtitle, var1.subtitle)) {
               return false;
            } else if (!q.c(this.iconUrl, var1.iconUrl)) {
               return false;
            } else if (!q.c(this.notificationChannel, var1.notificationChannel)) {
               return false;
            } else if (!q.c(this.trackingType, var1.trackingType)) {
               return false;
            } else if (!q.c(this.deeplink, var1.deeplink)) {
               return false;
            } else if (!q.c(this.expandSubtitle, var1.expandSubtitle)) {
               return false;
            } else if (!q.c(this.imageAttachmentUrl, var1.imageAttachmentUrl)) {
               return false;
            } else if (!q.c(this.timeReceived, var1.timeReceived)) {
               return false;
            } else if (this.silent != var1.silent) {
               return false;
            } else {
               return q.c(this.userInfo, var1.userInfo);
            }
         } else {
            return false;
         }
      }
   }

   public override fun hashCode(): Int {
      val var45: Int = this.type.hashCode();
      var var44: Int = 0;
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

      val var46: Int = this.ackChannelIds.hashCode();
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

      val var48: Int = java.lang.Boolean.hashCode(this.canReply);
      val var47: Int = java.lang.Boolean.hashCode(this.isFromCurrentUser);
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

      if (this.timeReceived != null) {
         var44 = this.timeReceived.hashCode();
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                      var45
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
                                                                                                                                                                                                                                                                                                                           + var46
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
                                                                                                                              + var48
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var47
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
                  + java.lang.Boolean.hashCode(this.silent)
            )
            * 31
         + this.userInfo.hashCode();
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.type;
      val var52: java.lang.String;
      if (this.messageId == null) {
         var52 = "null";
      } else {
         var52 = MessageId.toString-impl(this.messageId);
      }

      val var8: Int = this.messageActivityType;
      val var13: java.lang.String = this.messageApplicationName;
      val var46: Int = this.messageType;
      val var47: java.lang.String = this.messageContent;
      val var42: java.lang.Long = this.messageFlags;
      val var43: Int = this.channelType;
      val var10: java.lang.String = this.channelName;
      val var35: ChannelId = this.channelId;
      val var50: java.lang.String = this.channelIcon;
      val var22: java.lang.String = this.parentName;
      val var16: ChannelId = this.parentId;
      val var12: Int = this.messageReferenceType;
      val var21: java.lang.String = this.channelRtcRegion;
      val var40: java.util.List = this.ackChannelIds;
      val var18: UserId = this.userId;
      val var27: java.lang.String = this.userUsername;
      val var14: java.lang.String = this.userGlobalName;
      val var23: Int = this.userDiscriminator;
      val var33: java.lang.String = this.userAvatar;
      val var15: java.lang.String = this.userGuildAvatar;
      val var48: java.lang.String = this.platformUserUsername;
      val var6: Int = this.relationshipType;
      val var45: GuildId = this.guildId;
      val var9: java.lang.String = this.guildName;
      val var11: java.lang.String = this.guildIcon;
      val var36: java.lang.String = this.activityInstanceId;
      val var32: Int = this.activityType;
      val var26: java.lang.String = this.activityName;
      val var24: ApplicationId = this.applicationId;
      val var30: java.lang.String = this.applicationName;
      val var49: java.lang.String = this.applicationIcon;
      val var31: NotificationMessage = this.message;
      val var19: java.lang.String = this.stageInstanceTopic;
      val var20: Int = this.guildScheduledEventEntityType;
      val var2: Boolean = this.canReply;
      val var3: Boolean = this.isFromCurrentUser;
      val var28: UserId = this.receivingUserId;
      val var7: java.lang.String = this.title;
      val var44: java.lang.String = this.subtitle;
      val var17: java.lang.String = this.iconUrl;
      val var51: java.lang.String = this.notificationChannel;
      val var34: java.lang.String = this.trackingType;
      val var29: java.lang.String = this.deeplink;
      val var39: java.lang.Boolean = this.expandSubtitle;
      val var25: java.lang.String = this.imageAttachmentUrl;
      val var41: java.lang.String = this.timeReceived;
      val var1: Boolean = this.silent;
      val var37: java.util.Map = this.userInfo;
      val var38: StringBuilder = new StringBuilder();
      var38.append("NotificationData(type=");
      var38.append(var5);
      var38.append(", messageId=");
      var38.append(var52);
      var38.append(", messageActivityType=");
      var38.append(var8);
      var38.append(", messageApplicationName=");
      var38.append(var13);
      var38.append(", messageType=");
      var38.append(var46);
      var38.append(", messageContent=");
      var38.append(var47);
      var38.append(", messageFlags=");
      var38.append(var42);
      var38.append(", channelType=");
      var38.append(var43);
      var38.append(", channelName=");
      var38.append(var10);
      var38.append(", channelId=");
      var38.append(var35);
      var38.append(", channelIcon=");
      var38.append(var50);
      var38.append(", parentName=");
      var38.append(var22);
      var38.append(", parentId=");
      var38.append(var16);
      var38.append(", messageReferenceType=");
      var38.append(var12);
      var38.append(", channelRtcRegion=");
      var38.append(var21);
      var38.append(", ackChannelIds=");
      var38.append(var40);
      var38.append(", userId=");
      var38.append(var18);
      var38.append(", userUsername=");
      var38.append(var27);
      var38.append(", userGlobalName=");
      var38.append(var14);
      var38.append(", userDiscriminator=");
      var38.append(var23);
      var38.append(", userAvatar=");
      var38.append(var33);
      var38.append(", userGuildAvatar=");
      var38.append(var15);
      var38.append(", platformUserUsername=");
      var38.append(var48);
      var38.append(", relationshipType=");
      var38.append(var6);
      var38.append(", guildId=");
      var38.append(var45);
      var38.append(", guildName=");
      var38.append(var9);
      var38.append(", guildIcon=");
      var38.append(var11);
      var38.append(", activityInstanceId=");
      var38.append(var36);
      var38.append(", activityType=");
      var38.append(var32);
      var38.append(", activityName=");
      var38.append(var26);
      var38.append(", applicationId=");
      var38.append(var24);
      var38.append(", applicationName=");
      var38.append(var30);
      var38.append(", applicationIcon=");
      var38.append(var49);
      var38.append(", message=");
      var38.append(var31);
      var38.append(", stageInstanceTopic=");
      var38.append(var19);
      var38.append(", guildScheduledEventEntityType=");
      var38.append(var20);
      var38.append(", canReply=");
      var38.append(var2);
      var38.append(", isFromCurrentUser=");
      var38.append(var3);
      var38.append(", receivingUserId=");
      var38.append(var28);
      var38.append(", title=");
      var38.append(var7);
      var38.append(", subtitle=");
      var38.append(var44);
      var38.append(", iconUrl=");
      var38.append(var17);
      var38.append(", notificationChannel=");
      var38.append(var51);
      var38.append(", trackingType=");
      var38.append(var34);
      var38.append(", deeplink=");
      var38.append(var29);
      var38.append(", expandSubtitle=");
      var38.append(var39);
      var38.append(", imageAttachmentUrl=");
      var38.append(var25);
      var38.append(", timeReceived=");
      var38.append(var41);
      var38.append(", silent=");
      var38.append(var1);
      var38.append(", userInfo=");
      var38.append(var37);
      var38.append(")");
      return var38.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: NotificationData.$serializer = new NotificationData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.NotificationData", var0, 50);
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
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var12: Array<KSerializer> = NotificationData.access$get$childSerializers$cp();
         val var8: b2 = b2.a;
         val var7: KSerializer = a.u(MessageId.$serializer.INSTANCE);
         val var38: n0 = n0.a;
         val var1: KSerializer = a.u(n0.a);
         val var2: KSerializer = a.u(var8);
         val var11: KSerializer = a.u(var38);
         val var13: KSerializer = a.u(var8);
         val var4: KSerializer = a.u(x0.a);
         val var6: KSerializer = a.u(var38);
         val var9: KSerializer = a.u(var8);
         val var14: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var10: KSerializer = a.u(ChannelId.$serializer.INSTANCE);
         val var5: KSerializer = a.u(var8);
         val var3: KSerializer = a.u(var8);
         val var33: KSerializer = a.u(var14);
         val var34: KSerializer = a.u(var38);
         val var18: KSerializer = a.u(var8);
         val var20: ChannelListSerializer = ChannelListSerializer.INSTANCE;
         val var16: UserId.$serializer = UserId.$serializer.INSTANCE;
         val var25: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var32: KSerializer = a.u(var8);
         val var27: KSerializer = a.u(var8);
         val var28: KSerializer = a.u(var38);
         val var29: KSerializer = a.u(var8);
         val var26: KSerializer = a.u(var8);
         val var37: KSerializer = a.u(var8);
         val var36: KSerializer = a.u(var38);
         val var23: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var30: KSerializer = a.u(var8);
         val var41: KSerializer = a.u(var8);
         val var21: KSerializer = a.u(var8);
         val var24: KSerializer = a.u(var38);
         val var17: KSerializer = a.u(var8);
         val var35: KSerializer = a.u(ApplicationId.$serializer.INSTANCE);
         val var19: KSerializer = a.u(var8);
         val var22: KSerializer = a.u(var8);
         val var15: KSerializer = a.u(NotificationMessageSerializer.INSTANCE);
         val var31: KSerializer = a.u(var8);
         val var39: KSerializer = a.u(var38);
         val var42: h = h.a;
         return new KSerializer[]{
            var8,
            var7,
            var1,
            var2,
            var11,
            var13,
            var4,
            var6,
            var9,
            var10,
            var5,
            var3,
            var33,
            var34,
            var18,
            var20,
            var25,
            var32,
            var27,
            var28,
            var29,
            var26,
            var37,
            var36,
            var23,
            var30,
            var41,
            var21,
            var24,
            var17,
            var35,
            var19,
            var22,
            var15,
            var31,
            var39,
            CanReplySerializer.INSTANCE,
            h.a,
            a.u(var16),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var42),
            a.u(var8),
            a.u(var8),
            var42,
            var12[49]
         };
      }

      public open fun deserialize(decoder: Decoder): NotificationData {
         q.h(var1, "decoder");
         val var64: SerialDescriptor = this.getDescriptor();
         val var65: c = var1.c(var64);
         val var62: Array<KSerializer> = NotificationData.access$get$childSerializers$cp();
         var var2: Byte;
         var var3: Byte;
         var var4: Byte;
         var var5: Int;
         var var7: Int;
         var var18: java.lang.String;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var26: Any;
         var var27: java.lang.String;
         var var28: java.lang.String;
         var var29: java.lang.String;
         var var30: java.lang.String;
         var var31: java.lang.String;
         var var32: java.lang.String;
         var var34: Any;
         var var35: Any;
         var var36: Any;
         var var37: java.lang.String;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: java.lang.String;
         var var41: java.lang.String;
         var var42: Any;
         var var43: java.lang.String;
         var var44: java.lang.String;
         var var45: java.lang.String;
         var var46: Any;
         var var47: java.lang.String;
         var var48: Any;
         var var49: java.lang.String;
         var var50: Any;
         var var51: java.lang.String;
         var var52: java.lang.String;
         var var53: Any;
         var var54: Any;
         var var55: java.lang.String;
         var var56: Any;
         var var57: Any;
         var var58: java.lang.String;
         var var59: java.lang.String;
         var var60: Any;
         val var68: java.lang.String;
         var var77: Any;
         var var86: java.lang.String;
         var var105: Any;
         var var156: Any;
         var var181: java.lang.String;
         if (var65.y()) {
            var44 = var65.t(var64, 0);
            val var66: MessageId = var65.v(var64, 1, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var67: java.lang.String;
            if (var66 != null) {
               var67 = var66.unbox-impl();
            } else {
               var67 = null;
            }

            val var10: n0 = n0.a;
            var19 = var65.v(var64, 2, n0.a, null) as Int;
            var77 = b2.a;
            var18 = var65.v(var64, 3, b2.a, null) as java.lang.String;
            var20 = var65.v(var64, 4, var10, null) as Int;
            var37 = var65.v(var64, 5, (DeserializationStrategy)var77, null) as java.lang.String;
            var56 = var65.v(var64, 6, x0.a, null) as java.lang.Long;
            var21 = var65.v(var64, 7, var10, null) as Int;
            var27 = var65.v(var64, 8, (DeserializationStrategy)var77, null) as java.lang.String;
            val var11: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
            var60 = var65.v(var64, 9, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var22 = var65.v(var64, 10, (DeserializationStrategy)var77, null) as java.lang.String;
            var23 = var65.v(var64, 11, (DeserializationStrategy)var77, null) as java.lang.String;
            var57 = var65.v(var64, 12, var11, null) as ChannelId;
            val var15: Int = var65.v(var64, 13, var10, null) as Int;
            var58 = var65.v(var64, 14, (DeserializationStrategy)var77, null) as java.lang.String;
            val var17: java.util.List = var65.m(var64, 15, ChannelListSerializer.INSTANCE, null) as java.util.List;
            var156 = UserId.$serializer.INSTANCE;
            var105 = var65.v(var64, 16, UserId.$serializer.INSTANCE, null) as UserId;
            val var14: java.lang.String = var65.v(var64, 17, (DeserializationStrategy)var77, null) as java.lang.String;
            val var13: java.lang.String = var65.v(var64, 18, (DeserializationStrategy)var77, null) as java.lang.String;
            var34 = var65.v(var64, 19, var10, null) as Int;
            var45 = var65.v(var64, 20, (DeserializationStrategy)var77, null) as java.lang.String;
            var55 = var65.v(var64, 21, (DeserializationStrategy)var77, null) as java.lang.String;
            var49 = var65.v(var64, 22, (DeserializationStrategy)var77, null) as java.lang.String;
            var48 = var65.v(var64, 23, var10, null) as Int;
            val var33: GuildId = var65.v(var64, 24, GuildId.$serializer.INSTANCE, null) as GuildId;
            var39 = var65.v(var64, 25, (DeserializationStrategy)var77, null) as java.lang.String;
            var24 = var65.v(var64, 26, (DeserializationStrategy)var77, null) as java.lang.String;
            var28 = var65.v(var64, 27, (DeserializationStrategy)var77, null) as java.lang.String;
            var42 = var65.v(var64, 28, var10, null) as Int;
            var29 = var65.v(var64, 29, (DeserializationStrategy)var77, null) as java.lang.String;
            var35 = var65.v(var64, 30, ApplicationId.$serializer.INSTANCE, null) as ApplicationId;
            var59 = var65.v(var64, 31, (DeserializationStrategy)var77, null) as java.lang.String;
            val var12: java.lang.String = var65.v(var64, 32, (DeserializationStrategy)var77, null) as java.lang.String;
            var54 = var65.v(var64, 33, NotificationMessageSerializer.INSTANCE, null) as NotificationMessage;
            var86 = var65.v(var64, 34, (DeserializationStrategy)var77, null) as java.lang.String;
            var53 = var65.v(var64, 35, var10, null) as Int;
            var3 = var65.m(var64, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.FALSE) as java.lang.Boolean;
            var4 = var65.s(var64, 37);
            var46 = var65.v(var64, 38, (DeserializationStrategy)var156, null) as UserId;
            var156 = var65.v(var64, 39, (DeserializationStrategy)var77, null) as java.lang.String;
            var32 = var65.v(var64, 40, (DeserializationStrategy)var77, null) as java.lang.String;
            var31 = var65.v(var64, 41, (DeserializationStrategy)var77, null) as java.lang.String;
            var51 = var65.v(var64, 42, (DeserializationStrategy)var77, null) as java.lang.String;
            var41 = var65.v(var64, 43, (DeserializationStrategy)var77, null) as java.lang.String;
            var47 = var65.v(var64, 44, (DeserializationStrategy)var77, null) as java.lang.String;
            var36 = var65.v(var64, 45, h.a, null) as java.lang.Boolean;
            val var79: java.lang.String = var65.v(var64, 46, (DeserializationStrategy)var77, null) as java.lang.String;
            var38 = var65.v(var64, 47, (DeserializationStrategy)var77, null) as java.lang.String;
            var2 = var65.s(var64, 48);
            var77 = var65.m(var64, 49, var62[49], null) as java.util.Map;
            var7 = 262143;
            var43 = var67;
            var5 = -1;
            var68 = (java.lang.String)var156;
            var26 = var15;
            var50 = var17;
            var156 = var105;
            var30 = var14;
            var40 = var13;
            var105 = var33;
            var52 = var12;
            var181 = var79;
         } else {
            var34 = null;
            var7 = 0;
            var4 = 0;
            var5 = 0;
            var var6: Byte = 0;
            var3 = 0;
            var var8: Boolean = true;
            var var69: java.lang.String = null;
            var105 = null;
            var86 = null;
            var77 = null;
            var36 = null;
            var35 = null;
            var181 = null;
            var32 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var21 = null;
            var22 = null;
            var23 = null;
            var var97: Any = null;
            var27 = null;
            var26 = null;
            var19 = null;
            var156 = null;
            var40 = null;
            var38 = null;
            var51 = null;
            var50 = null;
            var49 = null;
            var48 = null;
            var47 = null;
            var54 = null;
            var46 = null;
            var45 = null;
            var53 = null;
            var44 = null;
            var var92: java.lang.String = null;
            var42 = null;
            var24 = null;
            var var88: java.lang.String = null;
            var52 = null;
            var39 = null;
            var28 = null;
            var var80: MessageId = null;
            var var101: Any = null;
            var43 = null;
            var41 = null;
            var20 = null;
            var18 = null;
            var var112: Any = null;
            var37 = null;

            while (var8) {
               label278: {
                  label277: {
                     label276: {
                        label339: {
                           label273: {
                              label340: {
                                 label265: {
                                    label264: {
                                       var var306: Any;
                                       label263: {
                                          label341: {
                                             label342: {
                                                label343: {
                                                   label344: {
                                                      label242: {
                                                         label345: {
                                                            label346: {
                                                               label347: {
                                                                  label215: {
                                                                     label214: {
                                                                        var2 = var65.x(var64);
                                                                        switch (var2) {
                                                                           case -1:
                                                                              var26 = var88;
                                                                              var8 = false;
                                                                              var2 = var5;
                                                                              var38 = (java.lang.String)var105;
                                                                              var28 = var24;
                                                                              var27 = (java.lang.String)var21;
                                                                              var156 = var18;
                                                                              var24 = (java.lang.String)var20;
                                                                              var23 = var80;
                                                                              var22 = var92;
                                                                              var21 = var101;
                                                                              var20 = var22;
                                                                              var19 = var23;
                                                                              var18 = (java.lang.String)var97;
                                                                              var105 = var27;
                                                                              var101 = var26;
                                                                              var97 = var19;
                                                                              var92 = (java.lang.String)var156;
                                                                              var80 = var28;
                                                                              var88 = var38;
                                                                              var57 = var29;
                                                                              break label278;
                                                                           case 0:
                                                                              var57 = var21;
                                                                              var21 = var23;
                                                                              var44 = var65.t(var64, 0);
                                                                              var2 = var5 or 1;
                                                                              break label341;
                                                                           case 1:
                                                                              var55 = var88;
                                                                              var59 = var80;
                                                                              var88 = (java.lang.String)var112;
                                                                              if (var43 != null) {
                                                                                 var80 = MessageId.box-impl(var43);
                                                                              } else {
                                                                                 var80 = null;
                                                                              }

                                                                              var80 = var65.v(var64, 1, MessageId.$serializer.INSTANCE, var80) as MessageId;
                                                                              if (var80 != null) {
                                                                                 var43 = var80.unbox-impl();
                                                                              } else {
                                                                                 var43 = null;
                                                                              }

                                                                              var2 = var5 or 2;
                                                                              var80 = var19;
                                                                              var56 = var97;
                                                                              var306 = var101;
                                                                              var60 = var92;
                                                                              var58 = (java.lang.String)var20;
                                                                              var57 = var18;
                                                                              break label263;
                                                                           case 2:
                                                                              var101 = var65.v(var64, 2, n0.a, var101) as Int;
                                                                              var2 = var5 or 4;
                                                                              var56 = var92;
                                                                              var55 = var80;
                                                                              break label215;
                                                                           case 3:
                                                                              var56 = var65.v(var64, 3, b2.a, var92) as java.lang.String;
                                                                              var2 = var5 or 8;
                                                                              var55 = var80;
                                                                              break label215;
                                                                           case 4:
                                                                              var80 = var65.v(var64, 4, n0.a, var80) as Int;
                                                                              var2 = var5 or 16;
                                                                              break;
                                                                           case 5:
                                                                              var37 = var65.v(var64, 5, b2.a, var37) as java.lang.String;
                                                                              var2 = var5 or 32;
                                                                              break;
                                                                           case 6:
                                                                              var88 = (java.lang.String)var112;
                                                                              var19 = var18;
                                                                              var20 = var65.v(var64, 6, x0.a, var20) as java.lang.Long;
                                                                              var2 = var5 or 64;
                                                                              var80 = var19;
                                                                              var92 = (java.lang.String)var97;
                                                                              var97 = var101;
                                                                              var101 = var92;
                                                                              var112 = var80;
                                                                              var18 = (java.lang.String)var20;
                                                                              var20 = var88;
                                                                              break label344;
                                                                           case 7:
                                                                              var18 = var65.v(var64, 7, n0.a, var18) as Int;
                                                                              var2 = var5 or 128;
                                                                              var55 = var88;
                                                                              break label347;
                                                                           case 8:
                                                                              var88 = var65.v(var64, 8, b2.a, var88) as java.lang.String;
                                                                              var2 = var5 or 256;
                                                                              break label214;
                                                                           case 9:
                                                                              val var238: ChannelId = var65.v(var64, 9, ChannelId.$serializer.INSTANCE, var21) as ChannelId;
                                                                              var2 = var5 or 512;
                                                                              var21 = var23;
                                                                              var23 = var238;
                                                                              break label242;
                                                                           case 10:
                                                                              var22 = var65.v(var64, 10, b2.a, var22) as java.lang.String;
                                                                              var2 = var5 or 1024;
                                                                              var21 = var23;
                                                                              var23 = (java.lang.String)var21;
                                                                              break label242;
                                                                           case 11:
                                                                              var55 = var65.v(var64, 11, b2.a, var23) as java.lang.String;
                                                                              var2 = var5 or 2048;
                                                                              var23 = (java.lang.String)var21;
                                                                              var21 = var55;
                                                                              break label242;
                                                                           case 12:
                                                                              var97 = var65.v(var64, 12, ChannelId.$serializer.INSTANCE, var97) as ChannelId;
                                                                              var2 = var5 or 4096;
                                                                              break label214;
                                                                           case 13:
                                                                              var112 = var65.v(var64, 13, n0.a, var112) as Int;
                                                                              var2 = var5 or 8192;
                                                                              var55 = (java.lang.String)var19;
                                                                              break label346;
                                                                           case 14:
                                                                              var59 = var65.v(var64, 14, b2.a, var27) as java.lang.String;
                                                                              var2 = var5 or 16384;
                                                                              var57 = var156;
                                                                              var58 = (java.lang.String)var26;
                                                                              break label264;
                                                                           case 15:
                                                                              var58 = var65.m(var64, 15, ChannelListSerializer.INSTANCE, var26) as java.util.List;
                                                                              var2 = '耀' or var5;
                                                                              var57 = var156;
                                                                              var59 = var27;
                                                                              break label264;
                                                                           case 16:
                                                                              var55 = var65.v(var64, 16, UserId.$serializer.INSTANCE, var19) as UserId;
                                                                              var2 = 65536 or var5;
                                                                              break label346;
                                                                           case 17:
                                                                              var57 = var65.v(var64, 17, b2.a, var156) as java.lang.String;
                                                                              var2 = 131072 or var5;
                                                                              var59 = var27;
                                                                              var58 = (java.lang.String)var26;
                                                                              break label264;
                                                                           case 18:
                                                                              var28 = var24;
                                                                              var40 = var65.v(var64, 18, b2.a, var40) as java.lang.String;
                                                                              var5 |= 262144;
                                                                              var2 = var7;
                                                                              var24 = var29;
                                                                              var105 = var28;
                                                                              var29 = (java.lang.String)var105;
                                                                              break label277;
                                                                           case 19:
                                                                              var38 = var65.v(var64, 19, n0.a, var38) as Int;
                                                                              var2 = 524288 or var5;
                                                                              break label276;
                                                                           case 20:
                                                                              var51 = var65.v(var64, 20, b2.a, var51) as java.lang.String;
                                                                              var2 = 1048576 or var5;
                                                                              break label276;
                                                                           case 21:
                                                                              var50 = var65.v(var64, 21, b2.a, var50) as java.lang.String;
                                                                              var2 = 2097152 or var5;
                                                                              break label276;
                                                                           case 22:
                                                                              var49 = var65.v(var64, 22, b2.a, var49) as java.lang.String;
                                                                              var2 = 4194304 or var5;
                                                                              break label276;
                                                                           case 23:
                                                                              var48 = var65.v(var64, 23, n0.a, var48) as Int;
                                                                              var2 = 8388608 or var5;
                                                                              break label276;
                                                                           case 24:
                                                                              var47 = var65.v(var64, 24, GuildId.$serializer.INSTANCE, var47) as GuildId;
                                                                              var2 = 16777216 or var5;
                                                                              break label276;
                                                                           case 25:
                                                                              var52 = var65.v(var64, 25, b2.a, var52) as java.lang.String;
                                                                              var2 = 33554432 or var5;
                                                                              break label339;
                                                                           case 26:
                                                                              var54 = var65.v(var64, 26, b2.a, var54) as java.lang.String;
                                                                              var2 = 67108864 or var5;
                                                                              break label339;
                                                                           case 27:
                                                                              var46 = var65.v(var64, 27, b2.a, var46) as java.lang.String;
                                                                              var2 = 134217728 or var5;
                                                                              break label276;
                                                                           case 28:
                                                                              var45 = var65.v(var64, 28, n0.a, var45) as Int;
                                                                              var2 = 268435456 or var5;
                                                                              break label276;
                                                                           case 29:
                                                                              var53 = var65.v(var64, 29, b2.a, var53) as java.lang.String;
                                                                              var2 = 536870912 or var5;
                                                                              break label339;
                                                                           case 30:
                                                                              var42 = var65.v(var64, 30, ApplicationId.$serializer.INSTANCE, var42) as ApplicationId;
                                                                              var2 = 1073741824 or var5;
                                                                              break label276;
                                                                           case 31:
                                                                              var39 = var65.v(var64, 31, b2.a, var39) as java.lang.String;
                                                                              var5 |= Integer.MIN_VALUE;
                                                                              var2 = var7;
                                                                              break label343;
                                                                           case 32:
                                                                              var24 = var65.v(var64, 32, b2.a, var24) as java.lang.String;
                                                                              var2 = var7 or 1;
                                                                              break label343;
                                                                           case 33:
                                                                              var55 = var65.v(var64, 33, NotificationMessageSerializer.INSTANCE, var28) as NotificationMessage;
                                                                              var2 = var7 or 2;
                                                                              var28 = var24;
                                                                              break label265;
                                                                           case 34:
                                                                              var41 = var65.v(var64, 34, b2.a, var41) as java.lang.String;
                                                                              var2 = var7 or 4;
                                                                              var55 = var29;
                                                                              break label340;
                                                                           case 35:
                                                                              var86 = var65.v(var64, 35, n0.a, var86) as Int;
                                                                              var2 = var7 or 8;
                                                                              var55 = var29;
                                                                              break label340;
                                                                           case 36:
                                                                              var4 = var65.m(
                                                                                 var64,
                                                                                 36,
                                                                                 CanReplySerializer.INSTANCE,
                                                                                 java.lang.Boolean.valueOf((boolean)var4)
                                                                              ) as java.lang.Boolean;
                                                                              var2 = var7 or 16;
                                                                              break label342;
                                                                           case 37:
                                                                              var6 = var65.s(var64, 37);
                                                                              var2 = var7 or 32;
                                                                              break label342;
                                                                           case 38:
                                                                              var77 = var65.v(var64, 38, UserId.$serializer.INSTANCE, var77) as UserId;
                                                                              var2 = var7 or 64;
                                                                              break label342;
                                                                           case 39:
                                                                              var30 = var65.v(var64, 39, b2.a, var30) as java.lang.String;
                                                                              var2 = var7 or 128;
                                                                              break label342;
                                                                           case 40:
                                                                              var32 = var65.v(var64, 40, b2.a, var32) as java.lang.String;
                                                                              var2 = var7 or 256;
                                                                              break label342;
                                                                           case 41:
                                                                              var31 = var65.v(var64, 41, b2.a, var31) as java.lang.String;
                                                                              var2 = var7 or 512;
                                                                              break label342;
                                                                           case 42:
                                                                              var34 = var65.v(var64, 42, b2.a, var34) as java.lang.String;
                                                                              var2 = var7 or 1024;
                                                                              break label342;
                                                                           case 43:
                                                                              var69 = var65.v(var64, 43, b2.a, var69) as java.lang.String;
                                                                              var2 = var7 or 2048;
                                                                              break label342;
                                                                           case 44:
                                                                              var35 = var65.v(var64, 44, b2.a, var35) as java.lang.String;
                                                                              var2 = var7 or 4096;
                                                                              break label342;
                                                                           case 45:
                                                                              var36 = var65.v(var64, 45, h.a, var36) as java.lang.Boolean;
                                                                              var2 = var7 or 8192;
                                                                              break label342;
                                                                           case 46:
                                                                              var29 = var65.v(var64, 46, b2.a, var29) as java.lang.String;
                                                                              var2 = var7 or 16384;
                                                                              break label342;
                                                                           case 47:
                                                                              var105 = var65.v(var64, 47, b2.a, var105) as java.lang.String;
                                                                              var2 = var7 or '耀';
                                                                              break label342;
                                                                           case 48:
                                                                              var3 = var65.s(var64, 48);
                                                                              var2 = 65536;
                                                                              break label345;
                                                                           case 49:
                                                                              var181 = var65.m(var64, 49, var62[49], var181) as java.util.Map;
                                                                              var2 = 131072;
                                                                              break label345;
                                                                           default:
                                                                              throw new n(var2);
                                                                        }

                                                                        var55 = var80;
                                                                        var56 = var92;
                                                                        break label215;
                                                                     }

                                                                     var55 = var88;
                                                                     break label347;
                                                                  }

                                                                  var18 = (java.lang.String)var20;
                                                                  var92 = (java.lang.String)var97;
                                                                  var88 = (java.lang.String)var112;
                                                                  var80 = var19;
                                                                  var97 = var101;
                                                                  var101 = var56;
                                                                  var112 = var55;
                                                                  var19 = var18;
                                                                  var20 = var88;
                                                                  break label344;
                                                               }

                                                               var88 = (java.lang.String)var112;
                                                               var112 = var80;
                                                               var19 = var18;
                                                               var80 = var19;
                                                               var92 = (java.lang.String)var97;
                                                               var97 = var101;
                                                               var101 = var92;
                                                               var18 = (java.lang.String)var20;
                                                               var20 = var55;
                                                               break label344;
                                                            }

                                                            var97 = var101;
                                                            var88 = (java.lang.String)var112;
                                                            var20 = var88;
                                                            var19 = var18;
                                                            var18 = (java.lang.String)var20;
                                                            var112 = var80;
                                                            var101 = var92;
                                                            var92 = (java.lang.String)var97;
                                                            var80 = var55;
                                                            break label344;
                                                         }

                                                         var2 = var7 or var2;
                                                         break label342;
                                                      }

                                                      var57 = var23;
                                                      break label341;
                                                   }

                                                   var55 = (java.lang.String)var20;
                                                   var57 = var19;
                                                   var58 = var18;
                                                   var59 = (java.lang.String)var112;
                                                   var60 = var101;
                                                   var306 = var97;
                                                   var56 = var92;
                                                   break label263;
                                                }

                                                var55 = var28;
                                                var28 = var24;
                                                break label265;
                                             }

                                             var55 = var29;
                                             break label340;
                                          }

                                          var56 = var97;
                                          var18 = (java.lang.String)var112;
                                          var112 = var27;
                                          var101 = var26;
                                          var97 = var19;
                                          var92 = (java.lang.String)var156;
                                          var19 = var21;
                                          var20 = var22;
                                          var21 = var101;
                                          var22 = var92;
                                          var23 = var80;
                                          var156 = var20;
                                          var26 = var18;
                                          var55 = var88;
                                          var27 = (java.lang.String)var57;
                                          break label273;
                                       }

                                       var20 = var22;
                                       var19 = var23;
                                       var112 = var27;
                                       var101 = var26;
                                       var92 = (java.lang.String)var156;
                                       var97 = var80;
                                       var18 = var88;
                                       var21 = var306;
                                       var22 = (java.lang.String)var60;
                                       var23 = var59;
                                       var156 = var58;
                                       var26 = var57;
                                       var27 = (java.lang.String)var21;
                                       break label273;
                                    }

                                    var97 = var19;
                                    var27 = (java.lang.String)var21;
                                    var55 = var88;
                                    var26 = var18;
                                    var156 = var20;
                                    var23 = var80;
                                    var22 = var92;
                                    var21 = var101;
                                    var20 = var22;
                                    var19 = var23;
                                    var56 = var97;
                                    var18 = (java.lang.String)var112;
                                    var112 = var59;
                                    var101 = var58;
                                    var92 = (java.lang.String)var57;
                                    break label273;
                                 }

                                 var24 = var29;
                                 var105 = var55;
                                 var29 = (java.lang.String)var105;
                                 break label277;
                              }

                              var29 = (java.lang.String)var105;
                              var28 = var24;
                              var105 = var28;
                              var24 = var55;
                              break label277;
                           }

                           var80 = var28;
                           var88 = var38;
                           var57 = var29;
                           var105 = var112;
                           var112 = var18;
                           var18 = (java.lang.String)var56;
                           var24 = (java.lang.String)var156;
                           var156 = var26;
                           var26 = var55;
                           var28 = var24;
                           var38 = (java.lang.String)var105;
                           break label278;
                        }

                        var97 = var19;
                        var26 = var88;
                        var57 = var29;
                        var88 = var38;
                        var80 = var28;
                        var92 = (java.lang.String)var156;
                        var101 = var26;
                        var105 = var27;
                        var18 = (java.lang.String)var97;
                        var19 = var23;
                        var20 = var22;
                        var21 = var101;
                        var22 = var92;
                        var23 = var80;
                        var24 = (java.lang.String)var20;
                        var156 = var18;
                        var27 = (java.lang.String)var21;
                        var28 = var24;
                        var38 = (java.lang.String)var105;
                        break label278;
                     }

                     var105 = var27;
                     var97 = var19;
                     var26 = var88;
                     var57 = var29;
                     var88 = var38;
                     var80 = var28;
                     var92 = (java.lang.String)var156;
                     var101 = var26;
                     var18 = (java.lang.String)var97;
                     var19 = var23;
                     var20 = var22;
                     var21 = var101;
                     var22 = var92;
                     var23 = var80;
                     var24 = (java.lang.String)var20;
                     var156 = var18;
                     var27 = (java.lang.String)var21;
                     var28 = var24;
                     var38 = (java.lang.String)var105;
                     break label278;
                  }

                  var97 = var19;
                  var92 = (java.lang.String)var156;
                  var26 = var88;
                  var156 = var18;
                  var7 = var2;
                  var57 = var24;
                  var88 = var38;
                  var2 = var5;
                  var80 = var105;
                  var101 = var26;
                  var105 = var27;
                  var18 = (java.lang.String)var97;
                  var19 = var23;
                  var20 = var22;
                  var21 = var101;
                  var22 = var92;
                  var23 = var80;
                  var24 = (java.lang.String)var20;
                  var27 = (java.lang.String)var21;
                  var38 = var29;
               }

               var97 = var18;
               var101 = var21;
               var92 = var22;
               var20 = var24;
               var18 = (java.lang.String)var156;
               var88 = (java.lang.String)var26;
               var21 = var27;
               var24 = var28;
               var105 = var38;
               var29 = (java.lang.String)var57;
               var22 = (java.lang.String)var20;
               var23 = (java.lang.String)var19;
               var27 = (java.lang.String)var105;
               var26 = var101;
               var19 = var97;
               var156 = var92;
               var38 = var88;
               var28 = (java.lang.String)var80;
               var80 = var23;
               var5 = var2;
            }

            var38 = (java.lang.String)var105;
            var4 = var6;
            var2 = var3;
            var77 = var181;
            var181 = var29;
            var47 = (java.lang.String)var35;
            var41 = var69;
            var51 = (java.lang.String)var34;
            var68 = var30;
            var46 = var77;
            var3 = var4;
            var53 = var86;
            var86 = var41;
            var54 = var28;
            var52 = var24;
            var59 = var39;
            var35 = var42;
            var29 = (java.lang.String)var53;
            var42 = var45;
            var28 = (java.lang.String)var46;
            var24 = (java.lang.String)var54;
            var39 = var52;
            var105 = var47;
            var55 = (java.lang.String)var50;
            var45 = var51;
            var34 = var38;
            var30 = (java.lang.String)var156;
            var156 = var19;
            var50 = var26;
            var58 = var27;
            var26 = var112;
            var57 = var97;
            var60 = var21;
            var27 = var88;
            var21 = var18;
            var56 = var20;
            var20 = var80;
            var18 = var92;
            var19 = var101;
         }

         var65.b(var64);
         return new NotificationData(
            var5,
            var7,
            var44,
            var43,
            (Integer)var19,
            var18,
            (Integer)var20,
            var37,
            (java.lang.Long)var56,
            (Integer)var21,
            var27,
            (ChannelId)var60,
            var22,
            var23,
            (ChannelId)var57,
            (Integer)var26,
            var58,
            (java.util.List)var50,
            (UserId)var156,
            var30,
            var40,
            (Integer)var34,
            var45,
            var55,
            var49,
            (Integer)var48,
            (GuildId)var105,
            var39,
            var24,
            var28,
            (Integer)var42,
            var29,
            (ApplicationId)var35,
            var59,
            var52,
            (NotificationMessage)var54,
            var86,
            (Integer)var53,
            (boolean)var3,
            (boolean)var4,
            (UserId)var46,
            var68,
            var32,
            var31,
            var51,
            var41,
            var47,
            (java.lang.Boolean)var36,
            var181,
            var38,
            (boolean)var2,
            (java.util.Map)var77,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: NotificationData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         NotificationData.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
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
      public const val TRACKING_TYPE_NUDGE_NEW_FRIEND_DM_PUSH: String
      public const val TRACKING_TYPE_POLL_ENDED: String
      public const val TRACKING_TYPE_SUSPICIOUS_SESSION: String
      public const val TRACKING_TYPE_TOP_MESSAGES_PUSH: String
      public const val TRACKING_TYPE_TRENDING_CONTENT_PUSH: String
      public const val TYPE_ACTIVITY_START: String
      public const val TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE: String
      public const val TYPE_CALL_CONNECT: String
      public const val TYPE_CALL_RING: String
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
