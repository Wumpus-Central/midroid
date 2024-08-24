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

      val var57: java.lang.Boolean;
      if ((var2 and 8192) == 0) {
         var57 = java.lang.Boolean.FALSE;
      } else {
         var57 = var48;
      }

      this.expandSubtitle = var57;
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

      val var58: java.util.Map;
      if ((var2 and 131072) == 0) {
         var58 = s.h();
      } else {
         var58 = var52;
      }

      this.userInfo = var58;
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
         var1.y(var2, 49, new r0<>(a2.a, a2.a), var0.userInfo);
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

      val var17: Int = this.messageActivityType;
      val var7: java.lang.String = this.messageApplicationName;
      val var44: Int = this.messageType;
      val var16: java.lang.String = this.messageContent;
      val var26: java.lang.Long = this.messageFlags;
      val var31: Int = this.channelType;
      val var48: java.lang.String = this.channelName;
      val var45: ChannelId = this.channelId;
      val var34: java.lang.String = this.channelIcon;
      val var33: java.lang.String = this.parentName;
      val var24: ChannelId = this.parentId;
      val var47: Int = this.messageReferenceType;
      val var51: java.lang.String = this.channelRtcRegion;
      val var20: java.util.List = this.ackChannelIds;
      val var6: UserId = this.userId;
      val var23: java.lang.String = this.userUsername;
      val var40: java.lang.String = this.userGlobalName;
      val var13: Int = this.userDiscriminator;
      val var42: java.lang.String = this.userAvatar;
      val var18: java.lang.String = this.userGuildAvatar;
      val var15: java.lang.String = this.platformUserUsername;
      val var11: Int = this.relationshipType;
      val var19: GuildId = this.guildId;
      val var43: java.lang.String = this.guildName;
      val var14: java.lang.String = this.guildIcon;
      val var41: java.lang.String = this.activityInstanceId;
      val var30: Int = this.activityType;
      val var8: java.lang.String = this.activityName;
      val var38: ApplicationId = this.applicationId;
      val var21: java.lang.String = this.applicationName;
      val var32: java.lang.String = this.applicationIcon;
      val var9: NotificationMessage = this.message;
      val var28: java.lang.String = this.stageInstanceTopic;
      val var35: Int = this.guildScheduledEventEntityType;
      val var2: Boolean = this.canReply;
      val var3: Boolean = this.isFromCurrentUser;
      val var22: UserId = this.receivingUserId;
      val var37: java.lang.String = this.title;
      val var36: java.lang.String = this.subtitle;
      val var39: java.lang.String = this.iconUrl;
      val var46: java.lang.String = this.notificationChannel;
      val var49: java.lang.String = this.trackingType;
      val var27: java.lang.String = this.deeplink;
      val var10: java.lang.Boolean = this.expandSubtitle;
      val var50: java.lang.String = this.imageAttachmentUrl;
      val var29: java.lang.String = this.timeReceived;
      val var1: Boolean = this.silent;
      val var25: java.util.Map = this.userInfo;
      val var12: StringBuilder = new StringBuilder();
      var12.append("NotificationData(type=");
      var12.append(var5);
      var12.append(", messageId=");
      var12.append(var52);
      var12.append(", messageActivityType=");
      var12.append(var17);
      var12.append(", messageApplicationName=");
      var12.append(var7);
      var12.append(", messageType=");
      var12.append(var44);
      var12.append(", messageContent=");
      var12.append(var16);
      var12.append(", messageFlags=");
      var12.append(var26);
      var12.append(", channelType=");
      var12.append(var31);
      var12.append(", channelName=");
      var12.append(var48);
      var12.append(", channelId=");
      var12.append(var45);
      var12.append(", channelIcon=");
      var12.append(var34);
      var12.append(", parentName=");
      var12.append(var33);
      var12.append(", parentId=");
      var12.append(var24);
      var12.append(", messageReferenceType=");
      var12.append(var47);
      var12.append(", channelRtcRegion=");
      var12.append(var51);
      var12.append(", ackChannelIds=");
      var12.append(var20);
      var12.append(", userId=");
      var12.append(var6);
      var12.append(", userUsername=");
      var12.append(var23);
      var12.append(", userGlobalName=");
      var12.append(var40);
      var12.append(", userDiscriminator=");
      var12.append(var13);
      var12.append(", userAvatar=");
      var12.append(var42);
      var12.append(", userGuildAvatar=");
      var12.append(var18);
      var12.append(", platformUserUsername=");
      var12.append(var15);
      var12.append(", relationshipType=");
      var12.append(var11);
      var12.append(", guildId=");
      var12.append(var19);
      var12.append(", guildName=");
      var12.append(var43);
      var12.append(", guildIcon=");
      var12.append(var14);
      var12.append(", activityInstanceId=");
      var12.append(var41);
      var12.append(", activityType=");
      var12.append(var30);
      var12.append(", activityName=");
      var12.append(var8);
      var12.append(", applicationId=");
      var12.append(var38);
      var12.append(", applicationName=");
      var12.append(var21);
      var12.append(", applicationIcon=");
      var12.append(var32);
      var12.append(", message=");
      var12.append(var9);
      var12.append(", stageInstanceTopic=");
      var12.append(var28);
      var12.append(", guildScheduledEventEntityType=");
      var12.append(var35);
      var12.append(", canReply=");
      var12.append(var2);
      var12.append(", isFromCurrentUser=");
      var12.append(var3);
      var12.append(", receivingUserId=");
      var12.append(var22);
      var12.append(", title=");
      var12.append(var37);
      var12.append(", subtitle=");
      var12.append(var36);
      var12.append(", iconUrl=");
      var12.append(var39);
      var12.append(", notificationChannel=");
      var12.append(var46);
      var12.append(", trackingType=");
      var12.append(var49);
      var12.append(", deeplink=");
      var12.append(var27);
      var12.append(", expandSubtitle=");
      var12.append(var10);
      var12.append(", imageAttachmentUrl=");
      var12.append(var50);
      var12.append(", timeReceived=");
      var12.append(var29);
      var12.append(", silent=");
      var12.append(var1);
      var12.append(", userInfo=");
      var12.append(var25);
      var12.append(")");
      return var12.toString();
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

      public override fun childSerializers(): Array<KSerializer<*>> {
         val var5: a2 = a2.a;
         val var10: KSerializer = vk.a.u(MessageId.$serializer.INSTANCE);
         val var37: m0 = m0.a;
         val var9: KSerializer = vk.a.u(m0.a);
         val var7: KSerializer = vk.a.u(var5);
         val var4: KSerializer = vk.a.u(var37);
         val var12: KSerializer = vk.a.u(var5);
         val var3: KSerializer = vk.a.u(w0.a);
         val var11: KSerializer = vk.a.u(var37);
         val var6: KSerializer = vk.a.u(var5);
         val var13: ChannelId.$serializer = ChannelId.$serializer.INSTANCE;
         val var8: KSerializer = vk.a.u(ChannelId.$serializer.INSTANCE);
         val var2: KSerializer = vk.a.u(var5);
         val var1: KSerializer = vk.a.u(var5);
         val var24: KSerializer = vk.a.u(var13);
         val var34: KSerializer = vk.a.u(var37);
         val var26: KSerializer = vk.a.u(var5);
         val var27: ChannelListSerializer = ChannelListSerializer.INSTANCE;
         val var16: UserId.$serializer = UserId.$serializer.INSTANCE;
         val var25: KSerializer = vk.a.u(UserId.$serializer.INSTANCE);
         val var31: KSerializer = vk.a.u(var5);
         val var30: KSerializer = vk.a.u(var5);
         val var18: KSerializer = vk.a.u(var37);
         val var32: KSerializer = vk.a.u(var5);
         val var21: KSerializer = vk.a.u(var5);
         val var22: KSerializer = vk.a.u(var5);
         val var33: KSerializer = vk.a.u(var37);
         val var15: KSerializer = vk.a.u(GuildId.$serializer.INSTANCE);
         val var35: KSerializer = vk.a.u(var5);
         val var23: KSerializer = vk.a.u(var5);
         val var28: KSerializer = vk.a.u(var5);
         val var20: KSerializer = vk.a.u(var37);
         val var14: KSerializer = vk.a.u(var5);
         val var40: KSerializer = vk.a.u(ApplicationId.$serializer.INSTANCE);
         val var29: KSerializer = vk.a.u(var5);
         val var36: KSerializer = vk.a.u(var5);
         val var17: KSerializer = vk.a.u(NotificationMessageSerializer.INSTANCE);
         val var19: KSerializer = vk.a.u(var5);
         val var39: KSerializer = vk.a.u(var37);
         val var38: xk.h = xk.h.a;
         return new KSerializer[]{
            var5,
            var10,
            var9,
            var7,
            var4,
            var12,
            var3,
            var11,
            var6,
            var8,
            var2,
            var1,
            var24,
            var34,
            var26,
            var27,
            var25,
            var31,
            var30,
            var18,
            var32,
            var21,
            var22,
            var33,
            var15,
            var35,
            var23,
            var28,
            var20,
            var14,
            var40,
            var29,
            var36,
            var17,
            var19,
            var39,
            CanReplySerializer.INSTANCE,
            xk.h.a,
            vk.a.u(var16),
            vk.a.u(var5),
            vk.a.u(var5),
            vk.a.u(var5),
            vk.a.u(var5),
            vk.a.u(var5),
            vk.a.u(var5),
            vk.a.u(var38),
            vk.a.u(var5),
            vk.a.u(var5),
            var38,
            new r0<>(var5, var5)
         };
      }

      public open fun deserialize(decoder: Decoder): NotificationData {
         r.h(var1, "decoder");
         val var66: SerialDescriptor = this.getDescriptor();
         val var67: c = var1.b(var66);
         var var2: Byte;
         var var3: Int;
         var var4: Byte;
         var var5: Byte;
         val var6: Int;
         var var12: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var32: Any;
         var var34: Any;
         var var36: Any;
         var var37: Any;
         var var38: Any;
         var var40: Any;
         var var42: Any;
         var var43: Any;
         var var44: Any;
         var var45: Any;
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
         var var61: Any;
         val var62: Any;
         val var63: Any;
         val var64: Any;
         var var71: Any;
         var var82: Any;
         var var124: Any;
         var var135: Any;
         var var139: Any;
         var var147: Any;
         var var176: Any;
         var var229: Any;
         var var231: Any;
         var var234: Any;
         var var239: Any;
         var var244: Any;
         var var251: Any;
         if (var67.p()) {
            var49 = var67.m(var66, 0);
            var64 = var67.n(var66, 1, MessageId.$serializer.INSTANCE, null);
            var82 = m0.a;
            var52 = var67.n(var66, 2, m0.a, null);
            var234 = a2.a;
            var135 = var67.n(var66, 3, a2.a, null);
            var124 = var67.n(var66, 4, (DeserializationStrategy)var82, null);
            var29 = var67.n(var66, 5, (DeserializationStrategy)var234, null);
            var36 = var67.n(var66, 6, w0.a, null);
            var47 = var67.n(var66, 7, (DeserializationStrategy)var82, null);
            var28 = var67.n(var66, 8, (DeserializationStrategy)var234, null);
            var71 = ChannelId.$serializer.INSTANCE;
            var42 = var67.n(var66, 9, ChannelId.$serializer.INSTANCE, null);
            var26 = var67.n(var66, 10, (DeserializationStrategy)var234, null);
            var37 = var67.n(var66, 11, (DeserializationStrategy)var234, null);
            var139 = var67.n(var66, 12, (DeserializationStrategy)var71, null);
            var27 = var67.n(var66, 13, (DeserializationStrategy)var82, null);
            var43 = var67.n(var66, 14, (DeserializationStrategy)var234, null);
            var61 = var67.y(var66, 15, ChannelListSerializer.INSTANCE, null);
            var var11: UserId.$serializer = UserId.$serializer.INSTANCE;
            var25 = var67.n(var66, 16, UserId.$serializer.INSTANCE, null);
            var56 = var67.n(var66, 17, (DeserializationStrategy)var234, null);
            var40 = var67.n(var66, 18, (DeserializationStrategy)var234, null);
            var176 = var67.n(var66, 19, (DeserializationStrategy)var82, null);
            var58 = var67.n(var66, 20, (DeserializationStrategy)var234, null);
            var32 = var67.n(var66, 21, (DeserializationStrategy)var234, null);
            var34 = var67.n(var66, 22, (DeserializationStrategy)var234, null);
            var244 = var67.n(var66, 23, (DeserializationStrategy)var82, null);
            val var17: Any = var67.n(var66, 24, GuildId.$serializer.INSTANCE, null);
            val var14: Any = var67.n(var66, 25, (DeserializationStrategy)var234, null);
            var239 = var67.n(var66, 26, (DeserializationStrategy)var234, null);
            var44 = var67.n(var66, 27, (DeserializationStrategy)var234, null);
            var229 = var67.n(var66, 28, (DeserializationStrategy)var82, null);
            var38 = var67.n(var66, 29, (DeserializationStrategy)var234, null);
            val var15: Any = var67.n(var66, 30, ApplicationId.$serializer.INSTANCE, null);
            val var13: Any = var67.n(var66, 31, (DeserializationStrategy)var234, null);
            val var10: Any = var67.n(var66, 32, (DeserializationStrategy)var234, null);
            var12 = var67.n(var66, 33, NotificationMessageSerializer.INSTANCE, null);
            var71 = var67.n(var66, 34, (DeserializationStrategy)var234, null);
            val var16: Any = var67.n(var66, 35, (DeserializationStrategy)var82, null);
            var4 = var67.y(var66, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.FALSE);
            var5 = var67.C(var66, 37);
            var147 = var67.n(var66, 38, var11, null);
            var53 = var67.n(var66, 39, (DeserializationStrategy)var234, null);
            val var22: Any = var67.n(var66, 40, (DeserializationStrategy)var234, null);
            var54 = var67.n(var66, 41, (DeserializationStrategy)var234, null);
            val var24: Any = var67.n(var66, 42, (DeserializationStrategy)var234, null);
            var11 = var67.n(var66, 43, (DeserializationStrategy<? extends UserId.$serializer>)var234, null);
            var231 = var67.n(var66, 44, (DeserializationStrategy)var234, null);
            var251 = var67.n(var66, 45, xk.h.a, null);
            var82 = var67.n(var66, 46, (DeserializationStrategy)var234, null);
            val var129: Any = var67.n(var66, 47, (DeserializationStrategy)var234, null);
            var2 = var67.C(var66, 48);
            var55 = var67.y(var66, 49, new r0((KSerializer)var234, (KSerializer)var234), null);
            var6 = 262143;
            var3 = -1;
            var234 = var139;
            var50 = var135;
            var135 = var176;
            var139 = var244;
            var51 = var124;
            var244 = var17;
            var176 = var239;
            var124 = var229;
            var45 = var14;
            var229 = var15;
            var63 = var13;
            var59 = var16;
            var239 = var22;
            var57 = var147;
            var60 = var24;
            var62 = var231;
            var231 = var251;
            var251 = var129;
            var147 = var82;
            var82 = var10;
            var48 = var71;
            var71 = var11;
         } else {
            var52 = null;
            var var7: Boolean = true;
            var48 = null;
            var147 = null;
            var71 = null;
            var53 = null;
            var251 = null;
            var234 = null;
            var42 = null;
            var44 = null;
            var45 = null;
            var51 = null;
            var50 = null;
            var49 = null;
            var var154: Any = null;
            var27 = null;
            var139 = null;
            var135 = null;
            var26 = null;
            var var144: Any = null;
            var var93: Any = null;
            var var87: Any = null;
            var34 = null;
            var25 = null;
            var32 = null;
            var229 = null;
            var37 = null;
            var231 = null;
            var244 = null;
            var239 = null;
            var var100: Any = null;
            var38 = null;
            var40 = null;
            var82 = null;
            var54 = null;
            var36 = null;
            var55 = null;
            var var103: Any = null;
            var var113: Any = null;
            var43 = null;
            var28 = null;
            var var130: Any = null;
            var124 = null;
            var var117: Any = null;
            var12 = null;
            var var111: Any = null;
            var29 = null;
            var2 = 0;
            var var74: Byte = 0;
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
                                                var var76: Int;
                                                label212: {
                                                   label211: {
                                                      label315: {
                                                         label316: {
                                                            label317: {
                                                               label196: {
                                                                  label195: {
                                                                     var76 = var67.o(var66);
                                                                     switch (var76) {
                                                                        case -1:
                                                                           var7 = false;
                                                                           break label314;
                                                                        case 0:
                                                                           var49 = var67.m(var66, 0);
                                                                           var3 |= 1;
                                                                           break label314;
                                                                        case 1:
                                                                           var100 = var103;
                                                                           var43 = var67.n(var66, 1, MessageId.$serializer.INSTANCE, (MessageId)var43);
                                                                           var76 = var3 or 2;
                                                                           var176 = var12;
                                                                           var56 = var124;
                                                                           var57 = var82;
                                                                           var82 = var100;
                                                                           var58 = var113;
                                                                           var59 = var111;
                                                                           var60 = var93;
                                                                           var61 = var87;
                                                                           var3 = var76;
                                                                           break label238;
                                                                        case 2:
                                                                           var113 = var67.n(var66, 2, m0.a, (Integer)var113);
                                                                           var3 |= 4;
                                                                           break label195;
                                                                        case 3:
                                                                           var100 = var67.n(var66, 3, a2.a, (java.lang.String)var100);
                                                                           var3 |= 8;
                                                                           break label195;
                                                                        case 4:
                                                                           var82 = var67.n(var66, 4, m0.a, (Integer)var82);
                                                                           var3 |= 16;
                                                                           break label195;
                                                                        case 5:
                                                                           var29 = var67.n(var66, 5, a2.a, (java.lang.String)var29);
                                                                           var3 |= 32;
                                                                           break label195;
                                                                        case 6:
                                                                           var124 = var67.n(var66, 6, w0.a, (java.lang.Long)var124);
                                                                           var76 = var3 or 64;
                                                                           var103 = var82;
                                                                           var12 = var113;
                                                                           var3 = var76;
                                                                           var82 = var87;
                                                                           var87 = var93;
                                                                           var93 = var111;
                                                                           var111 = var124;
                                                                           var113 = var12;
                                                                           var117 = var103;
                                                                           var124 = var117;
                                                                           break label316;
                                                                        case 7:
                                                                           var12 = var67.n(var66, 7, m0.a, (Integer)var12);
                                                                           var3 |= 128;
                                                                           break;
                                                                        case 8:
                                                                           var103 = var67.n(var66, 8, a2.a, (java.lang.String)var103);
                                                                           var3 |= 256;
                                                                           break;
                                                                        case 9:
                                                                           var176 = var67.n(var66, 9, ChannelId.$serializer.INSTANCE, (ChannelId)var117);
                                                                           var3 |= 512;
                                                                           var117 = var103;
                                                                           break label196;
                                                                        case 10:
                                                                           var176 = var67.n(var66, 10, a2.a, (java.lang.String)var154);
                                                                           var3 |= 1024;
                                                                           break label315;
                                                                        case 11:
                                                                           var26 = var67.n(var66, 11, a2.a, (java.lang.String)var27);
                                                                           var3 |= 2048;
                                                                           var27 = var26;
                                                                           break label249;
                                                                        case 12:
                                                                           var139 = var67.n(var66, 12, ChannelId.$serializer.INSTANCE, (ChannelId)var139);
                                                                           var3 |= 4096;
                                                                           var176 = var154;
                                                                           break label315;
                                                                        case 13:
                                                                           var111 = var67.n(var66, 13, m0.a, (Integer)var111);
                                                                           var3 |= 8192;
                                                                           break label317;
                                                                        case 14:
                                                                           var135 = var67.n(var66, 14, a2.a, (java.lang.String)var135);
                                                                           var3 |= 16384;
                                                                           break label211;
                                                                        case 15:
                                                                           var176 = var67.y(
                                                                              var66,
                                                                              15,
                                                                              ChannelListSerializer.INSTANCE,
                                                                              (java.util.List<? extends ChannelId>)var26
                                                                           );
                                                                           var3 |= 32768;
                                                                           var26 = var27;
                                                                           var27 = var176;
                                                                           break label249;
                                                                        case 16:
                                                                           var144 = var67.n(var66, 16, UserId.$serializer.INSTANCE, (UserId)var144);
                                                                           var3 |= 65536;
                                                                           break label211;
                                                                        case 17:
                                                                           var93 = var67.n(var66, 17, a2.a, (java.lang.String)var93);
                                                                           var3 |= 131072;
                                                                           break label317;
                                                                        case 18:
                                                                           var87 = var67.n(var66, 18, a2.a, (java.lang.String)var87);
                                                                           var3 |= 262144;
                                                                           break label317;
                                                                        case 19:
                                                                           var34 = var67.n(var66, 19, m0.a, (Integer)var34);
                                                                           var3 |= 524288;
                                                                           break label250;
                                                                        case 20:
                                                                           var25 = var67.n(var66, 20, a2.a, (java.lang.String)var25);
                                                                           var3 |= 1048576;
                                                                           break label250;
                                                                        case 21:
                                                                           var32 = var67.n(var66, 21, a2.a, (java.lang.String)var32);
                                                                           var3 |= 2097152;
                                                                           break label250;
                                                                        case 22:
                                                                           var229 = var67.n(var66, 22, a2.a, (java.lang.String)var229);
                                                                           var3 |= 4194304;
                                                                           break label250;
                                                                        case 23:
                                                                           var37 = var67.n(var66, 23, m0.a, (Integer)var37);
                                                                           var3 |= 8388608;
                                                                           break label250;
                                                                        case 24:
                                                                           var231 = var67.n(var66, 24, GuildId.$serializer.INSTANCE, (GuildId)var231);
                                                                           var3 |= 16777216;
                                                                           break label250;
                                                                        case 25:
                                                                           var54 = var67.n(var66, 25, a2.a, (java.lang.String)var54);
                                                                           var3 |= 33554432;
                                                                           break label251;
                                                                        case 26:
                                                                           var244 = var67.n(var66, 26, a2.a, (java.lang.String)var244);
                                                                           var3 |= 67108864;
                                                                           break label250;
                                                                        case 27:
                                                                           var239 = var67.n(var66, 27, a2.a, (java.lang.String)var239);
                                                                           var3 |= 134217728;
                                                                           break label250;
                                                                        case 28:
                                                                           var38 = var67.n(var66, 28, m0.a, (Integer)var38);
                                                                           var3 |= 268435456;
                                                                           break label250;
                                                                        case 29:
                                                                           var40 = var67.n(var66, 29, a2.a, (java.lang.String)var40);
                                                                           var3 |= 536870912;
                                                                           break label250;
                                                                        case 30:
                                                                           var36 = var67.n(var66, 30, ApplicationId.$serializer.INSTANCE, (ApplicationId)var36);
                                                                           var3 |= 1073741824;
                                                                           break label250;
                                                                        case 31:
                                                                           var55 = var67.n(var66, 31, a2.a, (java.lang.String)var55);
                                                                           var3 |= Integer.MIN_VALUE;
                                                                           var26 = var28;
                                                                           var82 = var25;
                                                                           var12 = var144;
                                                                           var100 = var26;
                                                                           var103 = var135;
                                                                           var113 = var139;
                                                                           var117 = var27;
                                                                           var124 = var113;
                                                                           var130 = var100;
                                                                           var135 = var82;
                                                                           var139 = var124;
                                                                           var144 = var12;
                                                                           var147 = var103;
                                                                           var154 = var117;
                                                                           var25 = var154;
                                                                           var176 = var130;
                                                                           var56 = var48;
                                                                           var27 = var147;
                                                                           break label312;
                                                                        case 32:
                                                                           var28 = var67.n(var66, 32, a2.a, (java.lang.String)var28);
                                                                           var2 |= 1;
                                                                           break label251;
                                                                        case 33:
                                                                           var176 = var67.n(
                                                                              var66, 33, NotificationMessageSerializer.INSTANCE, (NotificationMessage)var130
                                                                           );
                                                                           var2 |= 2;
                                                                           var130 = var147;
                                                                           var56 = var48;
                                                                           break label240;
                                                                        case 34:
                                                                           var56 = var67.n(var66, 34, a2.a, (java.lang.String)var48);
                                                                           var2 |= 4;
                                                                           var176 = var130;
                                                                           var130 = var147;
                                                                           break label240;
                                                                        case 35:
                                                                           var147 = var67.n(var66, 35, m0.a, (Integer)var147);
                                                                           var2 |= 8;
                                                                           var176 = var130;
                                                                           var56 = var48;
                                                                           var130 = var147;
                                                                           break label240;
                                                                        case 36:
                                                                           var74 = var67.y(
                                                                              var66, 36, CanReplySerializer.INSTANCE, java.lang.Boolean.valueOf((boolean)var74)
                                                                           );
                                                                           var2 |= 16;
                                                                           var176 = var130;
                                                                           var56 = var48;
                                                                           var130 = var147;
                                                                           break label240;
                                                                        case 37:
                                                                           var5 = var67.C(var66, 37);
                                                                           var2 |= 32;
                                                                           break label313;
                                                                        case 38:
                                                                           var52 = var67.n(var66, 38, UserId.$serializer.INSTANCE, (UserId)var52);
                                                                           var2 |= 64;
                                                                           break label313;
                                                                        case 39:
                                                                           var53 = var67.n(var66, 39, a2.a, (java.lang.String)var53);
                                                                           var2 |= 128;
                                                                           break label313;
                                                                        case 40:
                                                                           var50 = var67.n(var66, 40, a2.a, (java.lang.String)var50);
                                                                           var2 |= 256;
                                                                           break label313;
                                                                        case 41:
                                                                           var51 = var67.n(var66, 41, a2.a, (java.lang.String)var51);
                                                                           var2 |= 512;
                                                                           break label313;
                                                                        case 42:
                                                                           var45 = var67.n(var66, 42, a2.a, (java.lang.String)var45);
                                                                           var2 |= 1024;
                                                                           break label313;
                                                                        case 43:
                                                                           var71 = var67.n(var66, 43, a2.a, (java.lang.String)var71);
                                                                           var2 |= 2048;
                                                                           break label313;
                                                                        case 44:
                                                                           var44 = var67.n(var66, 44, a2.a, (java.lang.String)var44);
                                                                           var2 |= 4096;
                                                                           break label313;
                                                                        case 45:
                                                                           var251 = var67.n(var66, 45, xk.h.a, (java.lang.Boolean)var251);
                                                                           var2 |= 8192;
                                                                           break label313;
                                                                        case 46:
                                                                           var47 = var67.n(var66, 46, a2.a, (java.lang.String)var47);
                                                                           var2 |= 16384;
                                                                           break label313;
                                                                        case 47:
                                                                           var234 = var67.n(var66, 47, a2.a, (java.lang.String)var234);
                                                                           var76 = 32768;
                                                                           break label212;
                                                                        case 48:
                                                                           var4 = var67.C(var66, 48);
                                                                           var76 = 65536;
                                                                           break label212;
                                                                        case 49:
                                                                           var42 = var67.y(
                                                                              var66,
                                                                              49,
                                                                              new r0<>(a2.a, a2.a),
                                                                              (java.util.Map<java.lang.String, ? extends java.lang.String>)var42
                                                                           );
                                                                           var76 = 131072;
                                                                           break label212;
                                                                        default:
                                                                           throw new n(var76);
                                                                     }

                                                                     var176 = var117;
                                                                     var117 = var103;
                                                                     break label196;
                                                                  }

                                                                  var124 = var117;
                                                                  var117 = var103;
                                                                  var113 = var12;
                                                                  var111 = var124;
                                                                  var103 = var82;
                                                                  var12 = var113;
                                                                  var93 = var111;
                                                                  var87 = var93;
                                                                  var82 = var87;
                                                                  break label316;
                                                               }

                                                               var103 = var82;
                                                               var82 = var87;
                                                               var87 = var93;
                                                               var93 = var111;
                                                               var12 = var113;
                                                               var111 = var124;
                                                               var113 = var12;
                                                               var124 = var176;
                                                               break label316;
                                                            }

                                                            var124 = var117;
                                                            var82 = var87;
                                                            var87 = var93;
                                                            var93 = var111;
                                                            var12 = var113;
                                                            var103 = var82;
                                                            var111 = var124;
                                                            var113 = var12;
                                                            var117 = var103;
                                                         }

                                                         var61 = var82;
                                                         var60 = var87;
                                                         var59 = var93;
                                                         var58 = var12;
                                                         var82 = var100;
                                                         var57 = var103;
                                                         var56 = var111;
                                                         var176 = var113;
                                                         var100 = var117;
                                                         var117 = var124;
                                                         break label238;
                                                      }

                                                      var135 = var139;
                                                      var139 = var135;
                                                      break label239;
                                                   }

                                                   var139 = var135;
                                                   var135 = var139;
                                                   var176 = var154;
                                                   break label239;
                                                }

                                                var2 |= var76;
                                                break label313;
                                             }

                                             var117 = var154;
                                             var154 = var117;
                                             var100 = var103;
                                             var144 = var12;
                                             var139 = var124;
                                             var135 = var82;
                                             var82 = var100;
                                             var124 = var113;
                                             var113 = var139;
                                             var103 = var135;
                                             var12 = var144;
                                             break label248;
                                          }

                                          var113 = var139;
                                          var103 = var135;
                                          var12 = var144;
                                          var87 = var61;
                                          var93 = var60;
                                          var111 = var59;
                                          var124 = var58;
                                          var135 = var57;
                                          var139 = var56;
                                          var144 = var176;
                                          var154 = var117;
                                          var117 = var154;
                                          break label248;
                                       }

                                       var82 = var100;
                                       var124 = var113;
                                       var12 = var144;
                                       var103 = var139;
                                       var113 = var135;
                                       var135 = var82;
                                       var139 = var124;
                                       var144 = var12;
                                       var100 = var103;
                                       var154 = var117;
                                       var117 = var176;
                                       break label248;
                                    }

                                    var48 = var130;
                                    break label252;
                                 }

                                 var176 = var130;
                                 var56 = var48;
                                 var48 = var147;
                                 break label252;
                              }

                              var27 = var147;
                              var56 = var48;
                              var26 = var28;
                              var176 = var130;
                              var25 = var117;
                              var147 = var100;
                              var130 = var82;
                              var117 = var27;
                              var100 = var26;
                              var82 = var25;
                              break label312;
                           }

                           var154 = var117;
                           var147 = var103;
                           var124 = var113;
                           var113 = var139;
                           var103 = var135;
                           var12 = var144;
                           var82 = var25;
                           var100 = var27;
                           var117 = var26;
                           var130 = var100;
                           var135 = var82;
                           var139 = var124;
                           var144 = var12;
                           var25 = var154;
                           var176 = var130;
                           var26 = var28;
                           var56 = var48;
                           var27 = var147;
                           break label312;
                        }

                        var154 = var117;
                        var147 = var103;
                        var124 = var113;
                        var117 = var27;
                        var113 = var139;
                        var103 = var135;
                        var100 = var26;
                        var12 = var144;
                        var82 = var25;
                        var130 = var100;
                        var135 = var82;
                        var139 = var124;
                        var144 = var12;
                        var25 = var154;
                        var176 = var130;
                        var26 = var28;
                        var56 = var48;
                        var27 = var147;
                        break label312;
                     }

                     var176 = var130;
                     var154 = var117;
                     var147 = var103;
                     var130 = var100;
                     var124 = var113;
                     var117 = var27;
                     var113 = var139;
                     var103 = var135;
                     var100 = var26;
                     var12 = var144;
                     var82 = var25;
                     var135 = var82;
                     var139 = var124;
                     var144 = var12;
                     var25 = var154;
                     var26 = var28;
                     var56 = var48;
                     var27 = var147;
                     break label312;
                  }

                  var154 = var117;
                  var147 = var103;
                  var130 = var100;
                  var124 = var113;
                  var117 = var27;
                  var113 = var139;
                  var103 = var135;
                  var100 = var26;
                  var12 = var144;
                  var82 = var25;
                  var26 = var28;
                  var135 = var82;
                  var139 = var124;
                  var144 = var12;
                  var25 = var154;
                  var27 = var48;
               }

               var113 = var124;
               var100 = var130;
               var124 = var139;
               var12 = var144;
               var103 = var147;
               var117 = var154;
               var154 = var25;
               var28 = var26;
               var48 = var56;
               var147 = var27;
               var27 = var117;
               var139 = var113;
               var135 = var103;
               var26 = var100;
               var144 = var12;
               var25 = var82;
               var82 = var135;
               var130 = var176;
            }

            var176 = var244;
            var38 = var40;
            var63 = var55;
            var59 = var147;
            var147 = var47;
            var251 = var234;
            var47 = var12;
            var43 = var135;
            var234 = var139;
            var36 = var124;
            var135 = var34;
            var82 = var28;
            var6 = var2;
            var2 = var4;
            var4 = var74;
            var55 = var42;
            var231 = var251;
            var62 = var44;
            var60 = var45;
            var34 = var229;
            var54 = var51;
            var58 = var25;
            var57 = var52;
            var239 = var50;
            var12 = var130;
            var229 = var36;
            var45 = var54;
            var124 = var38;
            var44 = var239;
            var244 = var231;
            var51 = var82;
            var139 = var37;
            var52 = var113;
            var37 = var27;
            var50 = var100;
            var27 = var111;
            var42 = var117;
            var28 = var103;
            var64 = var43;
            var40 = var87;
            var56 = var93;
            var25 = var144;
            var61 = var26;
            var26 = var154;
         }

         var67.c(var66);
         val var90: MessageId = var64 as MessageId;
         val var91: java.lang.String;
         if (var64 as MessageId != null) {
            var91 = var90.unbox-impl();
         } else {
            var91 = null;
         }

         return new NotificationData(
            var3,
            var6,
            (java.lang.String)var49,
            var91,
            var52 as Integer,
            var50 as java.lang.String,
            var51 as Integer,
            var29 as java.lang.String,
            var36 as java.lang.Long,
            var47 as Integer,
            var28 as java.lang.String,
            var42 as ChannelId,
            var26 as java.lang.String,
            var37 as java.lang.String,
            var234 as ChannelId,
            var27 as Integer,
            var43 as java.lang.String,
            var61 as java.util.List,
            var25 as UserId,
            var56 as java.lang.String,
            var40 as java.lang.String,
            var135 as Integer,
            var58 as java.lang.String,
            var32 as java.lang.String,
            var34 as java.lang.String,
            var139 as Integer,
            var244 as GuildId,
            var45 as java.lang.String,
            var176 as java.lang.String,
            var44 as java.lang.String,
            var124 as Integer,
            var38 as java.lang.String,
            var229 as ApplicationId,
            var63 as java.lang.String,
            var82 as java.lang.String,
            var12 as NotificationMessage,
            var48 as java.lang.String,
            var59 as Integer,
            (boolean)var4,
            (boolean)var5,
            var57 as UserId,
            var53 as java.lang.String,
            var239 as java.lang.String,
            var54 as java.lang.String,
            var60 as java.lang.String,
            var71 as java.lang.String,
            var62 as java.lang.String,
            var231 as java.lang.Boolean,
            var147 as java.lang.String,
            var251 as java.lang.String,
            (boolean)var2,
            var55 as java.util.Map,
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

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
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
