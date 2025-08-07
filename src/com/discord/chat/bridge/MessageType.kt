package com.discord.chat.bridge

import A9.j
import I9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import java.util.EnumSet
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import o1.d
import o1.e
import o1.f
import tb.g

@g(with = MessageType.Serializer::class)
public enum class MessageType(serialNumber: Int) : IntEnum {
   AUTO_MODERATION_ACTION(24),
   CALL,
   CHANGELOG(47),
   CHANNEL_FOLLOW_ADD,
   CHANNEL_ICON_CHANGE,
   CHANNEL_LINKED_TO_LOBBY,
   CHANNEL_NAME_CHANGE,
   CHANNEL_PINNED_MESSAGE,
   CHAT_INPUT_COMMAND(20),
   CHAT_WALLPAPER_REMOVED,
   CHAT_WALLPAPER_SET,
   CONTEXT_MENU_COMMAND(23),
   CUSTOM_GIFT(41),
   DEFAULT(0),
   EMOJI_ADDED,
   GUILD_APPLICATION_PREMIUM_SUBSCRIPTION,
   GUILD_DEADCHAT_REVIVE_PROMPT,
   GUILD_DISCOVERY_DISQUALIFIED,
   GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING,
   GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING,
   GUILD_DISCOVERY_REQUALIFIED,
   GUILD_GAMING_STATS_PROMPT,
   GUILD_INCIDENT_ALERT_MODE_DISABLED(37),
   GUILD_INCIDENT_ALERT_MODE_ENABLED(36),
   GUILD_INCIDENT_REPORT_FALSE_ALARM(39),
   GUILD_INCIDENT_REPORT_RAID(38),
   GUILD_INVITE_REMINDER,
   GUILD_JOIN_REQUEST_ACCEPT_NOTIFICATION,
   GUILD_JOIN_REQUEST_REJECT_NOTIFICATION,
   GUILD_JOIN_REQUEST_WITHDRAWN_NOTIFICATION,
   GUILD_STREAM,
   INTERACTION_PREMIUM_UPSELL(26),
   IN_GAME_MESSAGE_NUX,
   POLL_RESULT,
   PREMIUM_REFERRAL(35),
   PRIVATE_CHANNEL_INTEGRATION_ADDED,
   PRIVATE_CHANNEL_INTEGRATION_REMOVED,
   RECIPIENT_ADD,
   RECIPIENT_REMOVE,
   REPLY(19),
   ROLE_SUBSCRIPTION_PURCHASE,
   STAGE_END,
   STAGE_RAISE_HAND,
   STAGE_SPEAKER,
   STAGE_START,
   STAGE_TOPIC,
   THREAD_CREATED,
   THREAD_STARTER_MESSAGE,
   USER_JOIN,
   USER_PREMIUM_GUILD_SUBSCRIPTION,
   USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1,
   USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2,
   USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3,
   VOICE_CHANNEL_INVITE(45)
   public open val serialNumber: Int

   public final val isSystem: Boolean
      public final get() {
         return this.isSystem$delegate.getValue() as java.lang.Boolean;
      }


   public final val isAutomodSystem: Boolean
      public final get() {
         return this.isAutomodSystem$delegate.getValue() as java.lang.Boolean;
      }


   public final val isCall: Boolean
      public final get() {
         return this.isCall$delegate.getValue() as java.lang.Boolean;
      }

   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageType[] $VALUES;
   @JvmStatic
   private java.util.Set<MessageType> CallTypes;
   @JvmStatic
   public MessageType.Companion Companion = new MessageType.Companion(null);
   @JvmStatic
   private java.util.Set<MessageType> SystemTypes;

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   fun {
      val var28: MessageType = new MessageType(1);
      RECIPIENT_ADD = var28;
      val var33: MessageType = new MessageType(2);
      RECIPIENT_REMOVE = var33;
      val var0: MessageType = new MessageType(3);
      CALL = var0;
      val var37: MessageType = new MessageType(4);
      CHANNEL_NAME_CHANGE = var37;
      val var11: MessageType = new MessageType(5);
      CHANNEL_ICON_CHANGE = var11;
      val var23: MessageType = new MessageType(6);
      CHANNEL_PINNED_MESSAGE = var23;
      val var4: MessageType = new MessageType(7);
      USER_JOIN = var4;
      val var34: MessageType = new MessageType(8);
      USER_PREMIUM_GUILD_SUBSCRIPTION = var34;
      val var29: MessageType = new MessageType(9);
      USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1 = var29;
      val var8: MessageType = new MessageType(10);
      USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2 = var8;
      val var32: MessageType = new MessageType(11);
      USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3 = var32;
      val var2: MessageType = new MessageType(12);
      CHANNEL_FOLLOW_ADD = var2;
      val var1: MessageType = new MessageType(13);
      GUILD_STREAM = var1;
      val var17: MessageType = new MessageType(14);
      GUILD_DISCOVERY_DISQUALIFIED = var17;
      val var36: MessageType = new MessageType(15);
      GUILD_DISCOVERY_REQUALIFIED = var36;
      val var13: MessageType = new MessageType(16);
      GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING = var13;
      val var18: MessageType = new MessageType(17);
      GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING = var18;
      val var26: MessageType = new MessageType(18);
      THREAD_CREATED = var26;
      val var7: MessageType = new MessageType(21);
      THREAD_STARTER_MESSAGE = var7;
      val var21: MessageType = new MessageType(22);
      GUILD_INVITE_REMINDER = var21;
      val var24: MessageType = new MessageType(25);
      ROLE_SUBSCRIPTION_PURCHASE = var24;
      val var14: MessageType = new MessageType(27);
      STAGE_START = var14;
      val var19: MessageType = new MessageType(28);
      STAGE_END = var19;
      val var20: MessageType = new MessageType(29);
      STAGE_SPEAKER = var20;
      val var38: MessageType = new MessageType(30);
      STAGE_RAISE_HAND = var38;
      val var9: MessageType = new MessageType(31);
      STAGE_TOPIC = var9;
      val var25: MessageType = new MessageType(32);
      GUILD_APPLICATION_PREMIUM_SUBSCRIPTION = var25;
      val var6: MessageType = new MessageType(33);
      PRIVATE_CHANNEL_INTEGRATION_ADDED = var6;
      val var40: MessageType = new MessageType(34);
      PRIVATE_CHANNEL_INTEGRATION_REMOVED = var40;
      val var10: MessageType = new MessageType(40);
      GUILD_DEADCHAT_REVIVE_PROMPT = var10;
      val var12: MessageType = new MessageType(42);
      GUILD_GAMING_STATS_PROMPT = var12;
      val var3: MessageType = new MessageType(46);
      POLL_RESULT = var3;
      val var39: MessageType = new MessageType(49);
      CHANNEL_LINKED_TO_LOBBY = var39;
      val var27: MessageType = new MessageType(51);
      IN_GAME_MESSAGE_NUX = var27;
      val var35: MessageType = new MessageType(52);
      GUILD_JOIN_REQUEST_ACCEPT_NOTIFICATION = var35;
      val var30: MessageType = new MessageType(53);
      GUILD_JOIN_REQUEST_REJECT_NOTIFICATION = var30;
      val var31: MessageType = new MessageType(54);
      GUILD_JOIN_REQUEST_WITHDRAWN_NOTIFICATION = var31;
      val var16: MessageType = new MessageType(56);
      CHAT_WALLPAPER_SET = var16;
      val var5: MessageType = new MessageType(57);
      CHAT_WALLPAPER_REMOVED = var5;
      val var22: MessageType = new MessageType(63);
      EMOJI_ADDED = var22;
      val var15: Array<MessageType> = $values();
      $VALUES = var15;
      $ENTRIES = a.a(var15);
      val var42: EnumSet = EnumSet.of(
         var28,
         var33,
         var0,
         var37,
         var11,
         var23,
         var4,
         var34,
         var29,
         var8,
         var32,
         var2,
         var1,
         var17,
         var36,
         var13,
         var18,
         var26,
         var7,
         var21,
         var24,
         var14,
         var19,
         var20,
         var38,
         var9,
         var25,
         var6,
         var40,
         var10,
         var12,
         var3,
         var39,
         var27,
         var35,
         var30,
         var31,
         var16,
         var5,
         var22
      );
      r.g(var42, "of(...)");
      SystemTypes = var42;
      val var41: EnumSet = EnumSet.of(var0, var1);
      r.g(var41, "of(...)");
      CallTypes = var41;
   }

   init {
      this.serialNumber = var3;
      this.isSystem$delegate = j.b(new d(this));
      this.isAutomodSystem$delegate = j.b(new e(this));
      this.isCall$delegate = j.b(new f(this));
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   @JvmStatic
   fun `isAutomodSystem_delegate$lambda$1`(var0: MessageType): Boolean {
      val var1: Boolean;
      if (var0 === AUTO_MODERATION_ACTION) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   @JvmStatic
   fun `isCall_delegate$lambda$2`(var0: MessageType): Boolean {
      return CallTypes.contains(var0);
   }

   @JvmStatic
   fun `isSystem_delegate$lambda$0`(var0: MessageType): Boolean {
      return SystemTypes.contains(var0);
   }

   public companion object {
      public final val SystemTypes: Set<MessageType>
      public final val CallTypes: Set<MessageType>

      public fun serializer(): KSerializer<MessageType> {
         return MessageType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(MessageType.class), null, 2)
}
