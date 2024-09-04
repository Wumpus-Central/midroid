package com.discord.notifications.api

import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import fh.s
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0
import xk.n1
import xk.r0
import xk.w0

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

      val var55: Boolean;
      if ((var2 and 0) != 0) {
         var55 = true;
      } else {
         var55 = false;
      }

      if (var54 or var55) {
         n1.a(new int[]{var1, var2}, new int[]{1, 0}, NotificationData.$serializer.INSTANCE.getDescriptor());
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

      val var56: java.util.List;
      if ((var1 and '耀') == 0) {
         var56 = h.i();
      } else {
         var56 = var18;
      }

      this.ackChannelIds = var56;
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

      if ((var2 and 131072) == 0) {
         var52 = s.h();
      }

      this.userInfo = var52;
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

   @JvmStatic
   public fun `write$Self`(self: NotificationData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.type);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.messageId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         val var56: MessageId;
         if (var0.messageId != null) {
            var56 = MessageId.box-impl(var0.messageId);
         } else {
            var56 = null;
         }

         var1.m(var2, 1, MessageId.$serializer.INSTANCE, var56);
      }

      if (!var1.A(var2, 2) && var0.messageActivityType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, m0.a, var0.messageActivityType);
      }

      if (!var1.A(var2, 3) && var0.messageApplicationName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.messageApplicationName);
      }

      if (!var1.A(var2, 4) && var0.messageType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, m0.a, var0.messageType);
      }

      if (!var1.A(var2, 5) && var0.messageContent == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.messageContent);
      }

      if (!var1.A(var2, 6) && var0.messageFlags == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, w0.a, var0.messageFlags);
      }

      if (!var1.A(var2, 7) && var0.channelType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, m0.a, var0.channelType);
      }

      if (!var1.A(var2, 8) && var0.channelName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, a2.a, var0.channelName);
      }

      if (!var1.A(var2, 9) && var0.channelId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, ChannelId.$serializer.INSTANCE, var0.channelId);
      }

      if (!var1.A(var2, 10) && var0.channelIcon == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 10, a2.a, var0.channelIcon);
      }

      if (!var1.A(var2, 11) && var0.parentName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 11, a2.a, var0.parentName);
      }

      if (!var1.A(var2, 12) && var0.parentId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 12, ChannelId.$serializer.INSTANCE, var0.parentId);
      }

      if (!var1.A(var2, 13) && var0.messageReferenceType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 13, m0.a, var0.messageReferenceType);
      }

      if (!var1.A(var2, 14) && var0.channelRtcRegion == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 14, a2.a, var0.channelRtcRegion);
      }

      if (!var1.A(var2, 15) && r.c(var0.ackChannelIds, h.i())) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 15, ChannelListSerializer.INSTANCE, var0.ackChannelIds);
      }

      if (!var1.A(var2, 16) && var0.userId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 16, UserId.$serializer.INSTANCE, var0.userId);
      }

      if (!var1.A(var2, 17) && var0.userUsername == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 17, a2.a, var0.userUsername);
      }

      if (!var1.A(var2, 18) && var0.userGlobalName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 18, a2.a, var0.userGlobalName);
      }

      if (!var1.A(var2, 19) && var0.userDiscriminator == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 19, m0.a, var0.userDiscriminator);
      }

      if (!var1.A(var2, 20) && var0.userAvatar == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 20, a2.a, var0.userAvatar);
      }

      if (!var1.A(var2, 21) && var0.userGuildAvatar == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 21, a2.a, var0.userGuildAvatar);
      }

      if (!var1.A(var2, 22) && var0.platformUserUsername == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 22, a2.a, var0.platformUserUsername);
      }

      if (!var1.A(var2, 23) && var0.relationshipType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 23, m0.a, var0.relationshipType);
      }

      if (!var1.A(var2, 24) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 24, GuildId.$serializer.INSTANCE, var0.guildId);
      }

      if (!var1.A(var2, 25) && var0.guildName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 25, a2.a, var0.guildName);
      }

      if (!var1.A(var2, 26) && var0.guildIcon == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 26, a2.a, var0.guildIcon);
      }

      if (!var1.A(var2, 27) && var0.activityInstanceId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 27, a2.a, var0.activityInstanceId);
      }

      if (!var1.A(var2, 28) && var0.activityType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 28, m0.a, var0.activityType);
      }

      if (!var1.A(var2, 29) && var0.activityName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 29, a2.a, var0.activityName);
      }

      if (!var1.A(var2, 30) && var0.applicationId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 30, ApplicationId.$serializer.INSTANCE, var0.applicationId);
      }

      if (!var1.A(var2, 31) && var0.applicationName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 31, a2.a, var0.applicationName);
      }

      if (!var1.A(var2, 32) && var0.applicationIcon == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 32, a2.a, var0.applicationIcon);
      }

      if (!var1.A(var2, 33) && var0.message == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 33, NotificationMessageSerializer.INSTANCE, var0.message);
      }

      if (!var1.A(var2, 34) && var0.stageInstanceTopic == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 34, a2.a, var0.stageInstanceTopic);
      }

      if (!var1.A(var2, 35) && var0.guildScheduledEventEntityType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 35, m0.a, var0.guildScheduledEventEntityType);
      }

      if (!var1.A(var2, 36) && !var0.canReply) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 36, CanReplySerializer.INSTANCE, var0.canReply);
      }

      if (!var1.A(var2, 37) && !var0.isFromCurrentUser) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 37, var0.isFromCurrentUser);
      }

      if (!var1.A(var2, 38) && var0.receivingUserId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 38, UserId.$serializer.INSTANCE, var0.receivingUserId);
      }

      if (!var1.A(var2, 39) && var0.title == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 39, a2.a, var0.title);
      }

      if (!var1.A(var2, 40) && var0.subtitle == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 40, a2.a, var0.subtitle);
      }

      if (!var1.A(var2, 41) && var0.iconUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 41, a2.a, var0.iconUrl);
      }

      if (!var1.A(var2, 42) && var0.notificationChannel == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 42, a2.a, var0.notificationChannel);
      }

      if (!var1.A(var2, 43) && var0.trackingType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 43, a2.a, var0.trackingType);
      }

      if (!var1.A(var2, 44) && var0.deeplink == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 44, a2.a, var0.deeplink);
      }

      if (!var1.A(var2, 45) && r.c(var0.expandSubtitle, java.lang.Boolean.FALSE)) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 45, xk.h.a, var0.expandSubtitle);
      }

      if (!var1.A(var2, 46) && var0.imageAttachmentUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 46, a2.a, var0.imageAttachmentUrl);
      }

      if (!var1.A(var2, 47) && var0.timeReceived == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 47, a2.a, var0.timeReceived);
      }

      if (!var1.A(var2, 48) && !var0.silent) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 48, var0.silent);
      }

      label405: {
         if (!var1.A(var2, 49)) {
            var3 = false;
            if (r.c(var0.userInfo, s.h())) {
               break label405;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.y(var2, 49, new r0(a2.a, a2.a), var0.userInfo);
      }
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
      r.h(var1, "type");
      r.h(var16, "ackChannelIds");
      r.h(var50, "userInfo");
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
         val var4: NotificationData = var1 as NotificationData;
         if (!r.c(this.type, (var1 as NotificationData).type)) {
            return false;
         } else {
            var var2: Boolean;
            label219: {
               if (this.messageId == null) {
                  if (var4.messageId == null) {
                     var2 = true;
                     break label219;
                  }
               } else if (var4.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var4.messageId);
                  break label219;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!r.c(this.messageActivityType, var4.messageActivityType)) {
               return false;
            } else if (!r.c(this.messageApplicationName, var4.messageApplicationName)) {
               return false;
            } else if (!r.c(this.messageType, var4.messageType)) {
               return false;
            } else if (!r.c(this.messageContent, var4.messageContent)) {
               return false;
            } else if (!r.c(this.messageFlags, var4.messageFlags)) {
               return false;
            } else if (!r.c(this.channelType, var4.channelType)) {
               return false;
            } else if (!r.c(this.channelName, var4.channelName)) {
               return false;
            } else if (!r.c(this.channelId, var4.channelId)) {
               return false;
            } else if (!r.c(this.channelIcon, var4.channelIcon)) {
               return false;
            } else if (!r.c(this.parentName, var4.parentName)) {
               return false;
            } else if (!r.c(this.parentId, var4.parentId)) {
               return false;
            } else if (!r.c(this.messageReferenceType, var4.messageReferenceType)) {
               return false;
            } else if (!r.c(this.channelRtcRegion, var4.channelRtcRegion)) {
               return false;
            } else if (!r.c(this.ackChannelIds, var4.ackChannelIds)) {
               return false;
            } else if (!r.c(this.userId, var4.userId)) {
               return false;
            } else if (!r.c(this.userUsername, var4.userUsername)) {
               return false;
            } else if (!r.c(this.userGlobalName, var4.userGlobalName)) {
               return false;
            } else if (!r.c(this.userDiscriminator, var4.userDiscriminator)) {
               return false;
            } else if (!r.c(this.userAvatar, var4.userAvatar)) {
               return false;
            } else if (!r.c(this.userGuildAvatar, var4.userGuildAvatar)) {
               return false;
            } else if (!r.c(this.platformUserUsername, var4.platformUserUsername)) {
               return false;
            } else if (!r.c(this.relationshipType, var4.relationshipType)) {
               return false;
            } else if (!r.c(this.guildId, var4.guildId)) {
               return false;
            } else if (!r.c(this.guildName, var4.guildName)) {
               return false;
            } else if (!r.c(this.guildIcon, var4.guildIcon)) {
               return false;
            } else if (!r.c(this.activityInstanceId, var4.activityInstanceId)) {
               return false;
            } else if (!r.c(this.activityType, var4.activityType)) {
               return false;
            } else if (!r.c(this.activityName, var4.activityName)) {
               return false;
            } else if (!r.c(this.applicationId, var4.applicationId)) {
               return false;
            } else if (!r.c(this.applicationName, var4.applicationName)) {
               return false;
            } else if (!r.c(this.applicationIcon, var4.applicationIcon)) {
               return false;
            } else if (!r.c(this.message, var4.message)) {
               return false;
            } else if (!r.c(this.stageInstanceTopic, var4.stageInstanceTopic)) {
               return false;
            } else if (!r.c(this.guildScheduledEventEntityType, var4.guildScheduledEventEntityType)) {
               return false;
            } else if (this.canReply != var4.canReply) {
               return false;
            } else if (this.isFromCurrentUser != var4.isFromCurrentUser) {
               return false;
            } else if (!r.c(this.receivingUserId, var4.receivingUserId)) {
               return false;
            } else if (!r.c(this.title, var4.title)) {
               return false;
            } else if (!r.c(this.subtitle, var4.subtitle)) {
               return false;
            } else if (!r.c(this.iconUrl, var4.iconUrl)) {
               return false;
            } else if (!r.c(this.notificationChannel, var4.notificationChannel)) {
               return false;
            } else if (!r.c(this.trackingType, var4.trackingType)) {
               return false;
            } else if (!r.c(this.deeplink, var4.deeplink)) {
               return false;
            } else if (!r.c(this.expandSubtitle, var4.expandSubtitle)) {
               return false;
            } else if (!r.c(this.imageAttachmentUrl, var4.imageAttachmentUrl)) {
               return false;
            } else if (!r.c(this.timeReceived, var4.timeReceived)) {
               return false;
            } else if (this.silent != var4.silent) {
               return false;
            } else {
               return r.c(this.userInfo, var4.userInfo);
            }
         }
      }
   }

   public override fun hashCode(): Int {
      val var49: Int = this.type.hashCode();
      var var46: Int = 0;
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

      val var50: Int = this.ackChannelIds.hashCode();
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

      var var47: Byte = 1;
      var var35: Byte = this.canReply;
      if (this.canReply != 0) {
         var35 = 1;
      }

      var var52: Byte = this.isFromCurrentUser;
      if (this.isFromCurrentUser != 0) {
         var52 = 1;
      }

      val var53: Int;
      if (this.receivingUserId == null) {
         var53 = 0;
      } else {
         var53 = UserId.hashCode-impl(this.receivingUserId.unbox-impl());
      }

      val var38: Int;
      if (this.title == null) {
         var38 = 0;
      } else {
         var38 = this.title.hashCode();
      }

      val var39: Int;
      if (this.subtitle == null) {
         var39 = 0;
      } else {
         var39 = this.subtitle.hashCode();
      }

      val var40: Int;
      if (this.iconUrl == null) {
         var40 = 0;
      } else {
         var40 = this.iconUrl.hashCode();
      }

      val var41: Int;
      if (this.notificationChannel == null) {
         var41 = 0;
      } else {
         var41 = this.notificationChannel.hashCode();
      }

      val var42: Int;
      if (this.trackingType == null) {
         var42 = 0;
      } else {
         var42 = this.trackingType.hashCode();
      }

      val var43: Int;
      if (this.deeplink == null) {
         var43 = 0;
      } else {
         var43 = this.deeplink.hashCode();
      }

      val var44: Int;
      if (this.expandSubtitle == null) {
         var44 = 0;
      } else {
         var44 = this.expandSubtitle.hashCode();
      }

      val var45: Int;
      if (this.imageAttachmentUrl == null) {
         var45 = 0;
      } else {
         var45 = this.imageAttachmentUrl.hashCode();
      }

      if (this.timeReceived != null) {
         var46 = this.timeReceived.hashCode();
      }

      if (this.silent == 0) {
         var47 = this.silent;
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                      var49
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
                                                                                                                                                                                                                                                                                                                           + var50
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
                                                                                                                              + var35
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var52
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var53
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

      val var31: Int = this.messageActivityType;
      val var49: java.lang.String = this.messageApplicationName;
      val var6: Int = this.messageType;
      val var26: java.lang.String = this.messageContent;
      val var15: java.lang.Long = this.messageFlags;
      val var44: Int = this.channelType;
      val var14: java.lang.String = this.channelName;
      val var10: ChannelId = this.channelId;
      val var36: java.lang.String = this.channelIcon;
      val var37: java.lang.String = this.parentName;
      val var34: ChannelId = this.parentId;
      val var20: Int = this.messageReferenceType;
      val var33: java.lang.String = this.channelRtcRegion;
      val var46: java.util.List = this.ackChannelIds;
      val var48: UserId = this.userId;
      val var32: java.lang.String = this.userUsername;
      val var11: java.lang.String = this.userGlobalName;
      val var51: Int = this.userDiscriminator;
      val var22: java.lang.String = this.userAvatar;
      val var39: java.lang.String = this.userGuildAvatar;
      val var45: java.lang.String = this.platformUserUsername;
      val var28: Int = this.relationshipType;
      val var8: GuildId = this.guildId;
      val var19: java.lang.String = this.guildName;
      val var40: java.lang.String = this.guildIcon;
      val var21: java.lang.String = this.activityInstanceId;
      val var25: Int = this.activityType;
      val var17: java.lang.String = this.activityName;
      val var16: ApplicationId = this.applicationId;
      val var12: java.lang.String = this.applicationName;
      val var30: java.lang.String = this.applicationIcon;
      val var42: NotificationMessage = this.message;
      val var35: java.lang.String = this.stageInstanceTopic;
      val var18: Int = this.guildScheduledEventEntityType;
      val var1: Boolean = this.canReply;
      val var3: Boolean = this.isFromCurrentUser;
      val var7: UserId = this.receivingUserId;
      val var13: java.lang.String = this.title;
      val var24: java.lang.String = this.subtitle;
      val var43: java.lang.String = this.iconUrl;
      val var50: java.lang.String = this.notificationChannel;
      val var29: java.lang.String = this.trackingType;
      val var9: java.lang.String = this.deeplink;
      val var47: java.lang.Boolean = this.expandSubtitle;
      val var27: java.lang.String = this.imageAttachmentUrl;
      val var23: java.lang.String = this.timeReceived;
      val var2: Boolean = this.silent;
      val var41: java.util.Map = this.userInfo;
      val var38: StringBuilder = new StringBuilder();
      var38.append("NotificationData(type=");
      var38.append(var5);
      var38.append(", messageId=");
      var38.append(var52);
      var38.append(", messageActivityType=");
      var38.append(var31);
      var38.append(", messageApplicationName=");
      var38.append(var49);
      var38.append(", messageType=");
      var38.append(var6);
      var38.append(", messageContent=");
      var38.append(var26);
      var38.append(", messageFlags=");
      var38.append(var15);
      var38.append(", channelType=");
      var38.append(var44);
      var38.append(", channelName=");
      var38.append(var14);
      var38.append(", channelId=");
      var38.append(var10);
      var38.append(", channelIcon=");
      var38.append(var36);
      var38.append(", parentName=");
      var38.append(var37);
      var38.append(", parentId=");
      var38.append(var34);
      var38.append(", messageReferenceType=");
      var38.append(var20);
      var38.append(", channelRtcRegion=");
      var38.append(var33);
      var38.append(", ackChannelIds=");
      var38.append(var46);
      var38.append(", userId=");
      var38.append(var48);
      var38.append(", userUsername=");
      var38.append(var32);
      var38.append(", userGlobalName=");
      var38.append(var11);
      var38.append(", userDiscriminator=");
      var38.append(var51);
      var38.append(", userAvatar=");
      var38.append(var22);
      var38.append(", userGuildAvatar=");
      var38.append(var39);
      var38.append(", platformUserUsername=");
      var38.append(var45);
      var38.append(", relationshipType=");
      var38.append(var28);
      var38.append(", guildId=");
      var38.append(var8);
      var38.append(", guildName=");
      var38.append(var19);
      var38.append(", guildIcon=");
      var38.append(var40);
      var38.append(", activityInstanceId=");
      var38.append(var21);
      var38.append(", activityType=");
      var38.append(var25);
      var38.append(", activityName=");
      var38.append(var17);
      var38.append(", applicationId=");
      var38.append(var16);
      var38.append(", applicationName=");
      var38.append(var12);
      var38.append(", applicationIcon=");
      var38.append(var30);
      var38.append(", message=");
      var38.append(var42);
      var38.append(", stageInstanceTopic=");
      var38.append(var35);
      var38.append(", guildScheduledEventEntityType=");
      var38.append(var18);
      var38.append(", canReply=");
      var38.append(var1);
      var38.append(", isFromCurrentUser=");
      var38.append(var3);
      var38.append(", receivingUserId=");
      var38.append(var7);
      var38.append(", title=");
      var38.append(var13);
      var38.append(", subtitle=");
      var38.append(var24);
      var38.append(", iconUrl=");
      var38.append(var43);
      var38.append(", notificationChannel=");
      var38.append(var50);
      var38.append(", trackingType=");
      var38.append(var29);
      var38.append(", deeplink=");
      var38.append(var9);
      var38.append(", expandSubtitle=");
      var38.append(var47);
      var38.append(", imageAttachmentUrl=");
      var38.append(var27);
      var38.append(", timeReceived=");
      var38.append(var23);
      var38.append(", silent=");
      var38.append(var2);
      var38.append(", userInfo=");
      var38.append(var41);
      var38.append(")");
      return var38.toString();
   }

   public object `$serializer` : f0<NotificationData> {
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
         val var12: a2 = a2.a;
         val var6: KSerializer = a.u(MessageId.$serializer.INSTANCE);
         val var37: m0 = m0.a;
         val var1: KSerializer = a.u(m0.a);
         val var10: KSerializer = a.u(var12);
         val var4: KSerializer = a.u(var37);
         val var9: KSerializer = a.u(var12);
         val var11: KSerializer = a.u(w0.a);
         val var8: KSerializer = a.u(var37);
         val var2: KSerializer = a.u(var12);
         val var13: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var7: KSerializer = a.u(ChannelId.$serializer.INSTANCE);
         val var5: KSerializer = a.u(var12);
         val var3: KSerializer = a.u(var12);
         val var27: KSerializer = a.u(var13);
         val var18: KSerializer = a.u(var37);
         val var32: KSerializer = a.u(var12);
         val var21: ChannelListSerializer = ChannelListSerializer.INSTANCE;
         val var22: UserId.$serializer = UserId.$serializer.INSTANCE;
         val var35: KSerializer = a.u(UserId.$serializer.INSTANCE);
         val var23: KSerializer = a.u(var12);
         val var34: KSerializer = a.u(var12);
         val var33: KSerializer = a.u(var37);
         val var40: KSerializer = a.u(var12);
         val var19: KSerializer = a.u(var12);
         val var20: KSerializer = a.u(var12);
         val var16: KSerializer = a.u(var37);
         val var31: KSerializer = a.u(GuildId.$serializer.INSTANCE);
         val var14: KSerializer = a.u(var12);
         val var26: KSerializer = a.u(var12);
         val var25: KSerializer = a.u(var12);
         val var29: KSerializer = a.u(var37);
         val var24: KSerializer = a.u(var12);
         val var36: KSerializer = a.u(ApplicationId.$serializer.INSTANCE);
         val var17: KSerializer = a.u(var12);
         val var15: KSerializer = a.u(var12);
         val var30: KSerializer = a.u(NotificationMessageSerializer.INSTANCE);
         val var28: KSerializer = a.u(var12);
         val var38: KSerializer = a.u(var37);
         val var39: xk.h = xk.h.a;
         return new KSerializer[]{
            var12,
            var6,
            var1,
            var10,
            var4,
            var9,
            var11,
            var8,
            var2,
            var7,
            var5,
            var3,
            var27,
            var18,
            var32,
            var21,
            var35,
            var23,
            var34,
            var33,
            var40,
            var19,
            var20,
            var16,
            var31,
            var14,
            var26,
            var25,
            var29,
            var24,
            var36,
            var17,
            var15,
            var30,
            var28,
            var38,
            CanReplySerializer.INSTANCE,
            xk.h.a,
            a.u(var22),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var12),
            a.u(var39),
            a.u(var12),
            a.u(var12),
            var39,
            new r0(var12, var12)
         };
      }

      public open fun deserialize(decoder: Decoder): NotificationData {
         r.h(var1, "decoder");
         val var65: SerialDescriptor = this.getDescriptor();
         val var66: c = var1.b(var65);
         var var2: Byte;
         var var3: Int;
         var var4: Byte;
         var var5: Byte;
         val var6: Int;
         var var23: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Any;
         var var32: Any;
         var var33: Any;
         var var35: Any;
         var var37: Any;
         var var38: Any;
         var var40: Any;
         var var41: Any;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: Any;
         var var46: Any;
         var var47: Any;
         var var48: Any;
         var var49: Any;
         var var50: Any;
         var var51: Any;
         var var52: Any;
         var var53: Any;
         var var54: Any;
         var var55: Any;
         var var56: Any;
         var var57: Any;
         var var58: Any;
         var var59: Any;
         var var60: Any;
         val var62: Any;
         val var63: Any;
         val var64: Any;
         var var70: Any;
         var var79: Any;
         var var93: Any;
         var var122: Any;
         var var133: Any;
         var var137: Any;
         var var225: Any;
         var var230: Any;
         var var234: Any;
         var var237: Any;
         var var307: Any;
         if (var66.p()) {
            var49 = var66.m(var65, 0);
            var64 = var66.n(var65, 1, MessageId.$serializer.INSTANCE, null);
            var var11: m0 = m0.a;
            var41 = var66.n(var65, 2, m0.a, null);
            var225 = a2.a;
            var137 = var66.n(var65, 3, a2.a, null);
            var122 = var66.n(var65, 4, var11, null);
            var44 = var66.n(var65, 5, (DeserializationStrategy)var225, null);
            var28 = var66.n(var65, 6, w0.a, null);
            var63 = var66.n(var65, 7, var11, null);
            var57 = var66.n(var65, 8, (DeserializationStrategy)var225, null);
            var70 = ChannelId.$serializer.INSTANCE;
            var43 = var66.n(var65, 9, ChannelId.$serializer.INSTANCE, null);
            var27 = var66.n(var65, 10, (DeserializationStrategy)var225, null);
            var35 = var66.n(var65, 11, (DeserializationStrategy)var225, null);
            var133 = var66.n(var65, 12, (DeserializationStrategy)var70, null);
            var40 = var66.n(var65, 13, var11, null);
            var58 = var66.n(var65, 14, (DeserializationStrategy)var225, null);
            var26 = var66.y(var65, 15, ChannelListSerializer.INSTANCE, null);
            var79 = UserId.$serializer.INSTANCE;
            var25 = var66.n(var65, 16, UserId.$serializer.INSTANCE, null);
            var33 = var66.n(var65, 17, (DeserializationStrategy)var225, null);
            var29 = var66.n(var65, 18, (DeserializationStrategy)var225, null);
            var46 = var66.n(var65, 19, var11, null);
            var45 = var66.n(var65, 20, (DeserializationStrategy)var225, null);
            var59 = var66.n(var65, 21, (DeserializationStrategy)var225, null);
            var55 = var66.n(var65, 22, (DeserializationStrategy)var225, null);
            var37 = var66.n(var65, 23, var11, null);
            val var17: Any = var66.n(var65, 24, GuildId.$serializer.INSTANCE, null);
            val var14: Any = var66.n(var65, 25, (DeserializationStrategy)var225, null);
            var62 = var66.n(var65, 26, (DeserializationStrategy)var225, null);
            var234 = var66.n(var65, 27, (DeserializationStrategy)var225, null);
            var48 = var66.n(var65, 28, var11, null);
            var51 = var66.n(var65, 29, (DeserializationStrategy)var225, null);
            var93 = var66.n(var65, 30, ApplicationId.$serializer.INSTANCE, null);
            val var13: Any = var66.n(var65, 31, (DeserializationStrategy)var225, null);
            val var10: Any = var66.n(var65, 32, (DeserializationStrategy)var225, null);
            val var15: Any = var66.n(var65, 33, NotificationMessageSerializer.INSTANCE, null);
            var70 = var66.n(var65, 34, (DeserializationStrategy)var225, null);
            val var16: Any = var66.n(var65, 35, var11, null);
            var4 = var66.y(var65, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.FALSE) as java.lang.Boolean;
            var5 = var66.C(var65, 37);
            var23 = var66.n(var65, 38, (DeserializationStrategy)var79, null);
            var53 = var66.n(var65, 39, (DeserializationStrategy)var225, null);
            val var22: Any = var66.n(var65, 40, (DeserializationStrategy)var225, null);
            var237 = var66.n(var65, 41, (DeserializationStrategy)var225, null);
            var30 = var66.n(var65, 42, (DeserializationStrategy)var225, null);
            var11 = (m0)var66.n(var65, 43, (DeserializationStrategy)var225, null);
            var230 = var66.n(var65, 44, (DeserializationStrategy)var225, null);
            val var24: Any = var66.n(var65, 45, xk.h.a, null);
            var79 = var66.n(var65, 46, (DeserializationStrategy)var225, null);
            val var127: Any = var66.n(var65, 47, (DeserializationStrategy)var225, null);
            var2 = var66.C(var65, 48);
            var307 = var66.y(var65, 49, new r0((KSerializer)var225, (KSerializer)var225), null);
            var6 = 262143;
            var3 = -1;
            var32 = var133;
            var38 = var137;
            var225 = var122;
            var54 = var17;
            var122 = var234;
            var60 = var14;
            var52 = var93;
            var42 = var13;
            var133 = var15;
            var234 = var16;
            var50 = var22;
            var137 = var237;
            var56 = var230;
            var93 = var24;
            var47 = var127;
            var230 = var307;
            var237 = var79;
            var79 = var10;
            var307 = var70;
            var70 = var11;
         } else {
            var52 = null;
            var var7: Boolean = true;
            var48 = null;
            var23 = null;
            var70 = null;
            var53 = null;
            var46 = null;
            var35 = null;
            var42 = null;
            var44 = null;
            var45 = null;
            var51 = null;
            var50 = null;
            var49 = null;
            var var151: Any = null;
            var27 = null;
            var137 = null;
            var133 = null;
            var26 = null;
            var var141: Any = null;
            var var91: Any = null;
            var var84: Any = null;
            var230 = null;
            var25 = null;
            var32 = null;
            var225 = null;
            var37 = null;
            var33 = null;
            var40 = null;
            var38 = null;
            var var98: Any = null;
            var237 = null;
            var41 = null;
            var79 = null;
            var54 = null;
            var234 = null;
            var55 = null;
            var var101: Any = null;
            var var111: Any = null;
            var43 = null;
            var28 = null;
            var var128: Any = null;
            var122 = null;
            var var115: Any = null;
            var93 = null;
            var var109: Any = null;
            var29 = null;
            var2 = 0;
            var var73: Byte = 0;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var47 = null;

            while (var7) {
               label312: {
                  label252: {
                     label251: {
                        label250: {
                           label249: {
                              label248: {
                                 label313: {
                                    label240: {
                                       label239: {
                                          label238: {
                                             label314: {
                                                var var75: Int;
                                                label212: {
                                                   label211: {
                                                      label315: {
                                                         label316: {
                                                            label317: {
                                                               label196: {
                                                                  label195: {
                                                                     var75 = var66.o(var65);
                                                                     switch (var75) {
                                                                        case -1:
                                                                           var7 = false;
                                                                           break label314;
                                                                        case 0:
                                                                           var49 = var66.m(var65, 0);
                                                                           var3 |= 1;
                                                                           break label314;
                                                                        case 1:
                                                                           var98 = var101;
                                                                           var43 = var66.n(var65, 1, MessageId.$serializer.INSTANCE, var43);
                                                                           var3 |= 2;
                                                                           var30 = var93;
                                                                           var56 = var122;
                                                                           var57 = var79;
                                                                           var79 = var98;
                                                                           var58 = var111;
                                                                           var59 = var109;
                                                                           var60 = var91;
                                                                           var307 = var84;
                                                                           break label238;
                                                                        case 2:
                                                                           var111 = var66.n(var65, 2, m0.a, var111);
                                                                           var3 |= 4;
                                                                           break label195;
                                                                        case 3:
                                                                           var98 = var66.n(var65, 3, a2.a, var98);
                                                                           var3 |= 8;
                                                                           break label195;
                                                                        case 4:
                                                                           var79 = var66.n(var65, 4, m0.a, var79);
                                                                           var3 |= 16;
                                                                           break label195;
                                                                        case 5:
                                                                           var29 = var66.n(var65, 5, a2.a, var29);
                                                                           var3 |= 32;
                                                                           break label195;
                                                                        case 6:
                                                                           var122 = var66.n(var65, 6, w0.a, var122);
                                                                           var75 = var3 or 64;
                                                                           var101 = var79;
                                                                           var93 = var111;
                                                                           var3 = var75;
                                                                           var79 = var84;
                                                                           var84 = var91;
                                                                           var91 = var109;
                                                                           var109 = var122;
                                                                           var111 = var93;
                                                                           var115 = var101;
                                                                           var122 = var115;
                                                                           break label316;
                                                                        case 7:
                                                                           var93 = var66.n(var65, 7, m0.a, var93);
                                                                           var3 |= 128;
                                                                           break;
                                                                        case 8:
                                                                           var101 = var66.n(var65, 8, a2.a, var101);
                                                                           var3 |= 256;
                                                                           break;
                                                                        case 9:
                                                                           var30 = var66.n(var65, 9, ChannelId.$serializer.INSTANCE, var115);
                                                                           var3 |= 512;
                                                                           var115 = var101;
                                                                           break label196;
                                                                        case 10:
                                                                           var30 = var66.n(var65, 10, a2.a, var151);
                                                                           var3 |= 1024;
                                                                           break label315;
                                                                        case 11:
                                                                           var26 = var66.n(var65, 11, a2.a, var27);
                                                                           var3 |= 2048;
                                                                           var27 = var26;
                                                                           break label249;
                                                                        case 12:
                                                                           var137 = var66.n(var65, 12, ChannelId.$serializer.INSTANCE, var137);
                                                                           var3 |= 4096;
                                                                           var30 = var151;
                                                                           break label315;
                                                                        case 13:
                                                                           var109 = var66.n(var65, 13, m0.a, var109);
                                                                           var3 |= 8192;
                                                                           break label317;
                                                                        case 14:
                                                                           var133 = var66.n(var65, 14, a2.a, var133);
                                                                           var3 |= 16384;
                                                                           break label211;
                                                                        case 15:
                                                                           var26 = var66.y(var65, 15, ChannelListSerializer.INSTANCE, var26);
                                                                           var3 |= 32768;
                                                                           var27 = var26;
                                                                           var26 = var27;
                                                                           break label249;
                                                                        case 16:
                                                                           var141 = var66.n(var65, 16, UserId.$serializer.INSTANCE, var141);
                                                                           var3 |= 65536;
                                                                           break label211;
                                                                        case 17:
                                                                           var91 = var66.n(var65, 17, a2.a, var91);
                                                                           var3 |= 131072;
                                                                           break label317;
                                                                        case 18:
                                                                           var84 = var66.n(var65, 18, a2.a, var84);
                                                                           var3 |= 262144;
                                                                           break label317;
                                                                        case 19:
                                                                           var230 = var66.n(var65, 19, m0.a, var230);
                                                                           var3 |= 524288;
                                                                           break label250;
                                                                        case 20:
                                                                           var25 = var66.n(var65, 20, a2.a, var25);
                                                                           var3 |= 1048576;
                                                                           break label250;
                                                                        case 21:
                                                                           var32 = var66.n(var65, 21, a2.a, var32);
                                                                           var3 |= 2097152;
                                                                           break label250;
                                                                        case 22:
                                                                           var225 = var66.n(var65, 22, a2.a, var225);
                                                                           var3 |= 4194304;
                                                                           break label250;
                                                                        case 23:
                                                                           var37 = var66.n(var65, 23, m0.a, var37);
                                                                           var3 |= 8388608;
                                                                           break label250;
                                                                        case 24:
                                                                           var33 = var66.n(var65, 24, GuildId.$serializer.INSTANCE, var33);
                                                                           var3 |= 16777216;
                                                                           break label250;
                                                                        case 25:
                                                                           var54 = var66.n(var65, 25, a2.a, var54);
                                                                           var3 |= 33554432;
                                                                           break label251;
                                                                        case 26:
                                                                           var40 = var66.n(var65, 26, a2.a, var40);
                                                                           var3 |= 67108864;
                                                                           break label250;
                                                                        case 27:
                                                                           var38 = var66.n(var65, 27, a2.a, var38);
                                                                           var3 |= 134217728;
                                                                           break label250;
                                                                        case 28:
                                                                           var237 = var66.n(var65, 28, m0.a, var237);
                                                                           var3 |= 268435456;
                                                                           break label250;
                                                                        case 29:
                                                                           var41 = var66.n(var65, 29, a2.a, var41);
                                                                           var3 |= 536870912;
                                                                           break label250;
                                                                        case 30:
                                                                           var234 = var66.n(var65, 30, ApplicationId.$serializer.INSTANCE, var234);
                                                                           var3 |= 1073741824;
                                                                           break label250;
                                                                        case 31:
                                                                           var55 = var66.n(var65, 31, a2.a, var55);
                                                                           var3 |= Integer.MIN_VALUE;
                                                                           var26 = var28;
                                                                           var79 = var25;
                                                                           var93 = var141;
                                                                           var98 = var26;
                                                                           var101 = var133;
                                                                           var111 = var137;
                                                                           var115 = var27;
                                                                           var122 = var111;
                                                                           var128 = var98;
                                                                           var133 = var79;
                                                                           var137 = var122;
                                                                           var141 = var93;
                                                                           var23 = var101;
                                                                           var151 = var115;
                                                                           var25 = var151;
                                                                           var30 = var128;
                                                                           var56 = var48;
                                                                           var27 = var23;
                                                                           break label312;
                                                                        case 32:
                                                                           var28 = var66.n(var65, 32, a2.a, var28);
                                                                           var2 |= 1;
                                                                           break label251;
                                                                        case 33:
                                                                           var30 = var66.n(var65, 33, NotificationMessageSerializer.INSTANCE, var128);
                                                                           var2 |= 2;
                                                                           var128 = var23;
                                                                           var56 = var48;
                                                                           break label240;
                                                                        case 34:
                                                                           var56 = var66.n(var65, 34, a2.a, var48);
                                                                           var2 |= 4;
                                                                           var30 = var128;
                                                                           var128 = var23;
                                                                           break label240;
                                                                        case 35:
                                                                           var23 = var66.n(var65, 35, m0.a, var23);
                                                                           var2 |= 8;
                                                                           var30 = var128;
                                                                           var56 = var48;
                                                                           var128 = var23;
                                                                           break label240;
                                                                        case 36:
                                                                           var73 = var66.y(
                                                                              var65, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.valueOf((boolean)var73)
                                                                           ) as java.lang.Boolean;
                                                                           var2 |= 16;
                                                                           var30 = var128;
                                                                           var56 = var48;
                                                                           var128 = var23;
                                                                           break label240;
                                                                        case 37:
                                                                           var5 = var66.C(var65, 37);
                                                                           var2 |= 32;
                                                                           break label313;
                                                                        case 38:
                                                                           var52 = var66.n(var65, 38, UserId.$serializer.INSTANCE, var52);
                                                                           var2 |= 64;
                                                                           break label313;
                                                                        case 39:
                                                                           var53 = var66.n(var65, 39, a2.a, var53);
                                                                           var2 |= 128;
                                                                           break label313;
                                                                        case 40:
                                                                           var50 = var66.n(var65, 40, a2.a, var50);
                                                                           var2 |= 256;
                                                                           break label313;
                                                                        case 41:
                                                                           var51 = var66.n(var65, 41, a2.a, var51);
                                                                           var2 |= 512;
                                                                           break label313;
                                                                        case 42:
                                                                           var45 = var66.n(var65, 42, a2.a, var45);
                                                                           var2 |= 1024;
                                                                           break label313;
                                                                        case 43:
                                                                           var70 = var66.n(var65, 43, a2.a, var70);
                                                                           var2 |= 2048;
                                                                           break label313;
                                                                        case 44:
                                                                           var44 = var66.n(var65, 44, a2.a, var44);
                                                                           var2 |= 4096;
                                                                           break label313;
                                                                        case 45:
                                                                           var46 = var66.n(var65, 45, xk.h.a, var46);
                                                                           var2 |= 8192;
                                                                           break label313;
                                                                        case 46:
                                                                           var47 = var66.n(var65, 46, a2.a, var47);
                                                                           var2 |= 16384;
                                                                           break label313;
                                                                        case 47:
                                                                           var35 = var66.n(var65, 47, a2.a, var35);
                                                                           var75 = 32768;
                                                                           break label212;
                                                                        case 48:
                                                                           var4 = var66.C(var65, 48);
                                                                           var75 = 65536;
                                                                           break label212;
                                                                        case 49:
                                                                           var42 = var66.y(var65, 49, new r0(a2.a, a2.a), var42);
                                                                           var75 = 131072;
                                                                           break label212;
                                                                        default:
                                                                           throw new n(var75);
                                                                     }

                                                                     var30 = var115;
                                                                     var115 = var101;
                                                                     break label196;
                                                                  }

                                                                  var122 = var115;
                                                                  var115 = var101;
                                                                  var111 = var93;
                                                                  var109 = var122;
                                                                  var101 = var79;
                                                                  var93 = var111;
                                                                  var91 = var109;
                                                                  var84 = var91;
                                                                  var79 = var84;
                                                                  break label316;
                                                               }

                                                               var101 = var79;
                                                               var79 = var84;
                                                               var111 = var93;
                                                               var84 = var91;
                                                               var91 = var109;
                                                               var93 = var111;
                                                               var109 = var122;
                                                               var122 = var30;
                                                               break label316;
                                                            }

                                                            var122 = var115;
                                                            var79 = var84;
                                                            var84 = var91;
                                                            var91 = var109;
                                                            var93 = var111;
                                                            var101 = var79;
                                                            var109 = var122;
                                                            var111 = var93;
                                                            var115 = var101;
                                                         }

                                                         var307 = var79;
                                                         var60 = var84;
                                                         var59 = var91;
                                                         var58 = var93;
                                                         var79 = var98;
                                                         var57 = var101;
                                                         var56 = var109;
                                                         var30 = var111;
                                                         var98 = var115;
                                                         var115 = var122;
                                                         break label238;
                                                      }

                                                      var133 = var137;
                                                      var137 = var133;
                                                      break label239;
                                                   }

                                                   var137 = var133;
                                                   var133 = var137;
                                                   var30 = var151;
                                                   break label239;
                                                }

                                                var2 |= var75;
                                                break label313;
                                             }

                                             var151 = var115;
                                             var111 = var137;
                                             var115 = var151;
                                             var98 = var101;
                                             var141 = var93;
                                             var137 = var122;
                                             var133 = var79;
                                             var79 = var98;
                                             var122 = var111;
                                             var101 = var133;
                                             var93 = var141;
                                             break label248;
                                          }

                                          var111 = var137;
                                          var101 = var133;
                                          var93 = var141;
                                          var84 = var307;
                                          var91 = var60;
                                          var109 = var59;
                                          var122 = var58;
                                          var133 = var57;
                                          var137 = var56;
                                          var141 = var30;
                                          var151 = var115;
                                          var115 = var151;
                                          break label248;
                                       }

                                       var79 = var98;
                                       var122 = var111;
                                       var93 = var141;
                                       var101 = var137;
                                       var111 = var133;
                                       var133 = var79;
                                       var137 = var122;
                                       var141 = var93;
                                       var98 = var101;
                                       var151 = var115;
                                       var115 = var30;
                                       break label248;
                                    }

                                    var48 = var128;
                                    break label252;
                                 }

                                 var30 = var128;
                                 var56 = var48;
                                 var48 = var23;
                                 break label252;
                              }

                              var27 = var23;
                              var56 = var48;
                              var26 = var28;
                              var30 = var128;
                              var25 = var115;
                              var23 = var98;
                              var128 = var79;
                              var115 = var27;
                              var98 = var26;
                              var79 = var25;
                              break label312;
                           }

                           var151 = var115;
                           var23 = var101;
                           var122 = var111;
                           var111 = var137;
                           var101 = var133;
                           var93 = var141;
                           var30 = var128;
                           var79 = var25;
                           var98 = var27;
                           var115 = var26;
                           var128 = var98;
                           var133 = var79;
                           var137 = var122;
                           var141 = var93;
                           var25 = var151;
                           var26 = var28;
                           var56 = var48;
                           var27 = var23;
                           break label312;
                        }

                        var151 = var115;
                        var23 = var101;
                        var122 = var111;
                        var115 = var27;
                        var111 = var137;
                        var101 = var133;
                        var98 = var26;
                        var93 = var141;
                        var79 = var25;
                        var128 = var98;
                        var133 = var79;
                        var137 = var122;
                        var141 = var93;
                        var25 = var151;
                        var30 = var128;
                        var26 = var28;
                        var56 = var48;
                        var27 = var23;
                        break label312;
                     }

                     var30 = var128;
                     var151 = var115;
                     var23 = var101;
                     var128 = var98;
                     var122 = var111;
                     var115 = var27;
                     var111 = var137;
                     var101 = var133;
                     var98 = var26;
                     var93 = var141;
                     var79 = var25;
                     var133 = var79;
                     var137 = var122;
                     var141 = var93;
                     var25 = var151;
                     var26 = var28;
                     var56 = var48;
                     var27 = var23;
                     break label312;
                  }

                  var151 = var115;
                  var23 = var101;
                  var128 = var98;
                  var122 = var111;
                  var115 = var27;
                  var111 = var137;
                  var101 = var133;
                  var98 = var26;
                  var93 = var141;
                  var79 = var25;
                  var26 = var28;
                  var133 = var79;
                  var137 = var122;
                  var141 = var93;
                  var25 = var151;
                  var27 = var48;
               }

               var111 = var122;
               var98 = var128;
               var122 = var137;
               var93 = var141;
               var101 = var23;
               var115 = var151;
               var151 = var25;
               var28 = var26;
               var48 = var56;
               var23 = var27;
               var27 = var115;
               var137 = var111;
               var133 = var101;
               var26 = var98;
               var141 = var93;
               var25 = var79;
               var79 = var133;
               var128 = var30;
            }

            var234 = var23;
            var237 = var47;
            var47 = var35;
            var30 = var45;
            var63 = var93;
            var56 = var44;
            var58 = var133;
            var46 = var230;
            var307 = var48;
            var79 = var28;
            var6 = var2;
            var2 = var4;
            var4 = var73;
            var230 = var42;
            var93 = var46;
            var55 = var225;
            var59 = var32;
            var137 = var51;
            var45 = var25;
            var23 = var52;
            var133 = var128;
            var42 = var55;
            var52 = var234;
            var60 = var54;
            var51 = var41;
            var48 = var237;
            var122 = var38;
            var62 = var40;
            var54 = var33;
            var225 = var79;
            var41 = var111;
            var35 = var27;
            var38 = var98;
            var32 = var137;
            var40 = var109;
            var43 = var115;
            var57 = var101;
            var28 = var122;
            var44 = var29;
            var64 = var43;
            var29 = var84;
            var33 = var91;
            var25 = var141;
            var27 = var151;
         }

         var66.c(var65);
         val var87: MessageId = var64 as MessageId;
         val var88: java.lang.String;
         if (var64 as MessageId != null) {
            var88 = var87.unbox-impl();
         } else {
            var88 = null;
         }

         return new NotificationData(
            var3,
            var6,
            (java.lang.String)var49,
            var88,
            var41 as Int,
            var38 as java.lang.String,
            var225 as Int,
            var44 as java.lang.String,
            var28 as java.lang.Long,
            var63 as Int,
            var57 as java.lang.String,
            var43 as ChannelId,
            var27 as java.lang.String,
            var35 as java.lang.String,
            var32 as ChannelId,
            var40 as Int,
            var58 as java.lang.String,
            var26 as java.util.List,
            var25 as UserId,
            var33 as java.lang.String,
            var29 as java.lang.String,
            var46 as Int,
            var45 as java.lang.String,
            var59 as java.lang.String,
            var55 as java.lang.String,
            var37 as Int,
            var54 as GuildId,
            var60 as java.lang.String,
            var62 as java.lang.String,
            var122 as java.lang.String,
            var48 as Int,
            var51 as java.lang.String,
            var52 as ApplicationId,
            var42 as java.lang.String,
            var79 as java.lang.String,
            var133 as NotificationMessage,
            var307 as java.lang.String,
            var234 as Int,
            (boolean)var4,
            (boolean)var5,
            var23 as UserId,
            var53 as java.lang.String,
            var50 as java.lang.String,
            var137 as java.lang.String,
            var30 as java.lang.String,
            var70 as java.lang.String,
            var56 as java.lang.String,
            var93 as java.lang.Boolean,
            var237 as java.lang.String,
            var47 as java.lang.String,
            (boolean)var2,
            var230 as java.util.Map,
            null,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: NotificationData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         NotificationData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
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
