package com.discord.chat.bridge

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import ha.f
import java.util.EnumSet
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import o8.l
import o8.o
import w8.a

@f(with = MessageType.Serializer::class)
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

   public final val isAutomodSystem: Boolean
      public final get() {
         return this.isAutomodSystem$delegate.getValue() as java.lang.Boolean;
      }


   public final val isCall: Boolean
      public final get() {
         return this.isCall$delegate.getValue() as java.lang.Boolean;
      }


   public final val isSystem: Boolean
      public final get() {
         return this.isSystem$delegate.getValue() as java.lang.Boolean;
      }


   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
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
      val var37: MessageType = new MessageType(1);
      RECIPIENT_ADD = var37;
      val var12: MessageType = new MessageType(2);
      RECIPIENT_REMOVE = var12;
      val var1: MessageType = new MessageType(3);
      CALL = var1;
      val var24: MessageType = new MessageType(4);
      CHANNEL_NAME_CHANGE = var24;
      val var34: MessageType = new MessageType(5);
      CHANNEL_ICON_CHANGE = var34;
      val var35: MessageType = new MessageType(6);
      CHANNEL_PINNED_MESSAGE = var35;
      val var8: MessageType = new MessageType(7);
      USER_JOIN = var8;
      val var28: MessageType = new MessageType(8);
      USER_PREMIUM_GUILD_SUBSCRIPTION = var28;
      val var29: MessageType = new MessageType(9);
      USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1 = var29;
      val var6: MessageType = new MessageType(10);
      USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2 = var6;
      val var20: MessageType = new MessageType(11);
      USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3 = var20;
      val var36: MessageType = new MessageType(12);
      CHANNEL_FOLLOW_ADD = var36;
      val var0: MessageType = new MessageType(13);
      GUILD_STREAM = var0;
      val var2: MessageType = new MessageType(14);
      GUILD_DISCOVERY_DISQUALIFIED = var2;
      val var26: MessageType = new MessageType(15);
      GUILD_DISCOVERY_REQUALIFIED = var26;
      val var9: MessageType = new MessageType(16);
      GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING = var9;
      val var30: MessageType = new MessageType(17);
      GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING = var30;
      val var13: MessageType = new MessageType(18);
      THREAD_CREATED = var13;
      val var38: MessageType = new MessageType(21);
      THREAD_STARTER_MESSAGE = var38;
      val var10: MessageType = new MessageType(22);
      GUILD_INVITE_REMINDER = var10;
      val var16: MessageType = new MessageType(25);
      ROLE_SUBSCRIPTION_PURCHASE = var16;
      val var14: MessageType = new MessageType(27);
      STAGE_START = var14;
      val var15: MessageType = new MessageType(28);
      STAGE_END = var15;
      val var18: MessageType = new MessageType(29);
      STAGE_SPEAKER = var18;
      val var4: MessageType = new MessageType(30);
      STAGE_RAISE_HAND = var4;
      val var7: MessageType = new MessageType(31);
      STAGE_TOPIC = var7;
      val var3: MessageType = new MessageType(32);
      GUILD_APPLICATION_PREMIUM_SUBSCRIPTION = var3;
      val var32: MessageType = new MessageType(33);
      PRIVATE_CHANNEL_INTEGRATION_ADDED = var32;
      val var22: MessageType = new MessageType(34);
      PRIVATE_CHANNEL_INTEGRATION_REMOVED = var22;
      val var39: MessageType = new MessageType(40);
      GUILD_DEADCHAT_REVIVE_PROMPT = var39;
      val var21: MessageType = new MessageType(42);
      GUILD_GAMING_STATS_PROMPT = var21;
      val var23: MessageType = new MessageType(46);
      POLL_RESULT = var23;
      val var33: MessageType = new MessageType(49);
      CHANNEL_LINKED_TO_LOBBY = var33;
      val var11: MessageType = new MessageType(51);
      IN_GAME_MESSAGE_NUX = var11;
      val var27: MessageType = new MessageType(52);
      GUILD_JOIN_REQUEST_ACCEPT_NOTIFICATION = var27;
      val var25: MessageType = new MessageType(53);
      GUILD_JOIN_REQUEST_REJECT_NOTIFICATION = var25;
      val var5: MessageType = new MessageType(54);
      GUILD_JOIN_REQUEST_WITHDRAWN_NOTIFICATION = var5;
      val var31: MessageType = new MessageType(56);
      CHAT_WALLPAPER_SET = var31;
      val var19: MessageType = new MessageType(57);
      CHAT_WALLPAPER_REMOVED = var19;
      val var17: Array<MessageType> = $values();
      $VALUES = var17;
      $ENTRIES = a.a(var17);
      val var41: EnumSet = EnumSet.of(
         var37,
         var12,
         var1,
         var24,
         var34,
         var35,
         var8,
         var28,
         var29,
         var6,
         var20,
         var36,
         var0,
         var2,
         var26,
         var9,
         var30,
         var13,
         var38,
         var10,
         var16,
         var14,
         var15,
         var18,
         var4,
         var7,
         var3,
         var32,
         var22,
         var39,
         var21,
         var23,
         var33,
         var11,
         var27,
         var25,
         var5,
         var31,
         var19
      );
      q.g(var41, "of(...)");
      SystemTypes = var41;
      val var40: EnumSet = EnumSet.of(var1, var0);
      q.g(var40, "of(...)");
      CallTypes = var40;
   }

   init {
      this.serialNumber = var3;
      this.isSystem$delegate = l.a(new Function0(this) {
         final MessageType this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final java.lang.Boolean invoke() {
            return MessageType.Companion.getSystemTypes().contains(this.this$0);
         }
      });
      this.isAutomodSystem$delegate = l.a(new Function0(this) {
         final MessageType this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final java.lang.Boolean invoke() {
            val var1: Boolean;
            if (this.this$0 === MessageType.AUTO_MODERATION_ACTION) {
               var1 = true;
            } else {
               var1 = false;
            }

            return var1;
         }
      });
      this.isCall$delegate = l.a(new Function0(this) {
         final MessageType this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final java.lang.Boolean invoke() {
            return MessageType.Companion.getCallTypes().contains(this.this$0);
         }
      });
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public final val CallTypes: Set<MessageType>
      public final val SystemTypes: Set<MessageType>

      public fun serializer(): KSerializer<MessageType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(G.b(MessageType.class), null, 2)
}
