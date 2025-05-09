package com.discord.notifications.client

import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.os.Build.VERSION
import androidx.core.content.b
import com.discord.crash_reporting.CrashReporting
import com.discord.kvstorage.discordapp.DiscordMobileApi
import com.discord.logging.Log
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.ContentAction
import com.discord.notifications.actions.intents.NotificationAction
import com.discord.notifications.api.DirectReplyMessage
import com.discord.notifications.api.KvMessageEntry
import com.discord.notifications.api.NotificationData
import com.discord.notifications.renderer.NotificationBehaviors
import com.discord.notifications.renderer.NotificationRenderer
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.push_notification_monitor.PushNotificationMeta
import com.discord.push_notification_monitor.PushNotificationMonitor
import com.discord.react.headless_tasks.api.HeadlessTasks
import com.discord.shortcuts.ShortcutData
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a
import o8.w
import p8.q

public class NotificationClient {
   public final var shouldDisplayNotification: () -> Boolean = <unrepresentable>.INSTANCE
   private final var token: String?
   private final var tokenListener: (String) -> Unit = <unrepresentable>.INSTANCE
   private final var notificationPending: Map<String, String?>?
   private final var notificationListener: ((Map<String, String?>) -> Unit)?
   private final var notificationLocalListener: ((Map<String, String?>) -> Unit)?
   private final var cache: NotificationCache
   private final var renderer: NotificationRenderer

   private fun appendNotificationToCacheFile(context: Context, notificationData: NotificationData) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: monitorenter
      // 002: new java/io/File
      // 005: astore 5
      // 007: aload 5
      // 009: aload 1
      // 00a: invokevirtual android/content/Context.getCacheDir ()Ljava/io/File;
      // 00d: ldc "notifications_to_track"
      // 00f: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 012: aload 5
      // 014: invokevirtual java/io/File.length ()J
      // 017: lstore 3
      // 018: lload 3
      // 019: ldc2_w 5242880
      // 01c: lcmp
      // 01d: iflt 023
      // 020: aload 0
      // 021: monitorexit
      // 022: return
      // 023: new la/p
      // 026: astore 1
      // 027: aload 1
      // 028: invokespecial la/p.<init> ()V
      // 02b: aload 1
      // 02c: ldc "push_action_type"
      // 02e: aload 2
      // 02f: invokevirtual com/discord/notifications/api/NotificationData.getType ()Ljava/lang/String;
      // 032: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 035: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 038: pop
      // 039: aload 2
      // 03a: invokevirtual com/discord/notifications/api/NotificationData.getTimeReceived ()Ljava/lang/String;
      // 03d: astore 6
      // 03f: aload 6
      // 041: ifnull 05b
      // 044: aload 1
      // 045: ldc "timestamp"
      // 047: aload 6
      // 049: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 04c: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 04f: pop
      // 050: goto 05b
      // 053: astore 1
      // 054: goto 249
      // 057: astore 2
      // 058: goto 22a
      // 05b: aload 2
      // 05c: invokevirtual com/discord/notifications/api/NotificationData.getNotifTypeId ()Ljava/lang/String;
      // 05f: astore 6
      // 061: aload 6
      // 063: ifnull 072
      // 066: aload 1
      // 067: ldc "notif_type_id"
      // 069: aload 6
      // 06b: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 06e: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 071: pop
      // 072: aload 2
      // 073: invokevirtual com/discord/notifications/api/NotificationData.getNotifInstanceId ()Ljava/lang/String;
      // 076: astore 6
      // 078: aload 6
      // 07a: ifnull 089
      // 07d: aload 1
      // 07e: ldc "notif_instance_id"
      // 080: aload 6
      // 082: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 085: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 088: pop
      // 089: aload 2
      // 08a: invokevirtual com/discord/notifications/api/NotificationData.getJoinId ()Ljava/lang/String;
      // 08d: astore 6
      // 08f: aload 6
      // 091: ifnull 0a0
      // 094: aload 1
      // 095: ldc "join_id"
      // 097: aload 6
      // 099: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 09c: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 09f: pop
      // 0a0: aload 2
      // 0a1: invokevirtual com/discord/notifications/api/NotificationData.getUserId-wUX8bhU ()Lcom/discord/primitives/UserId;
      // 0a4: astore 6
      // 0a6: aload 6
      // 0a8: ifnull 0bd
      // 0ab: aload 1
      // 0ac: ldc "notif_user_id"
      // 0ae: aload 6
      // 0b0: invokevirtual com/discord/primitives/UserId.unbox-impl ()J
      // 0b3: invokestatic com/discord/primitives/UserId.toString-impl (J)Ljava/lang/String;
      // 0b6: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0b9: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0bc: pop
      // 0bd: aload 2
      // 0be: invokevirtual com/discord/notifications/api/NotificationData.getReceivingUserId-wUX8bhU ()Lcom/discord/primitives/UserId;
      // 0c1: astore 6
      // 0c3: aload 6
      // 0c5: ifnull 0da
      // 0c8: aload 1
      // 0c9: ldc "receiving_user_id"
      // 0cb: aload 6
      // 0cd: invokevirtual com/discord/primitives/UserId.unbox-impl ()J
      // 0d0: invokestatic com/discord/primitives/UserId.toString-impl (J)Ljava/lang/String;
      // 0d3: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0d6: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0d9: pop
      // 0da: aload 2
      // 0db: invokevirtual com/discord/notifications/api/NotificationData.getMessageId-N_6c4I0 ()Ljava/lang/String;
      // 0de: astore 6
      // 0e0: aload 6
      // 0e2: ifnull 0fa
      // 0e5: aload 1
      // 0e6: ldc "message_id"
      // 0e8: aload 6
      // 0ea: invokestatic com/discord/primitives/MessageId.box-impl (Ljava/lang/String;)Lcom/discord/primitives/MessageId;
      // 0ed: invokevirtual com/discord/primitives/MessageId.unbox-impl ()Ljava/lang/String;
      // 0f0: invokestatic com/discord/primitives/MessageId.toString-impl (Ljava/lang/String;)Ljava/lang/String;
      // 0f3: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0f6: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0f9: pop
      // 0fa: aload 2
      // 0fb: invokevirtual com/discord/notifications/api/NotificationData.getMessageType ()Ljava/lang/Integer;
      // 0fe: astore 6
      // 100: aload 6
      // 102: ifnull 118
      // 105: aload 1
      // 106: ldc_w "message_type"
      // 109: aload 6
      // 10b: invokevirtual java/lang/Number.intValue ()I
      // 10e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 111: invokestatic la/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 114: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 117: pop
      // 118: aload 2
      // 119: invokevirtual com/discord/notifications/api/NotificationData.getGuildId-qOKuAAo ()Lcom/discord/primitives/GuildId;
      // 11c: astore 6
      // 11e: aload 6
      // 120: ifnull 136
      // 123: aload 1
      // 124: ldc_w "guild_id"
      // 127: aload 6
      // 129: invokevirtual com/discord/primitives/GuildId.unbox-impl ()J
      // 12c: invokestatic com/discord/primitives/GuildId.toString-impl (J)Ljava/lang/String;
      // 12f: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 132: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 135: pop
      // 136: aload 2
      // 137: invokevirtual com/discord/notifications/api/NotificationData.getChannelId-qMVnFVQ ()Lcom/discord/primitives/ChannelId;
      // 13a: astore 6
      // 13c: aload 6
      // 13e: ifnull 154
      // 141: aload 1
      // 142: ldc_w "channel_id"
      // 145: aload 6
      // 147: invokevirtual com/discord/primitives/ChannelId.unbox-impl ()J
      // 14a: invokestatic com/discord/primitives/ChannelId.toString-impl (J)Ljava/lang/String;
      // 14d: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 150: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 153: pop
      // 154: aload 2
      // 155: invokevirtual com/discord/notifications/api/NotificationData.getChannelType ()Ljava/lang/Integer;
      // 158: astore 6
      // 15a: aload 6
      // 15c: ifnull 172
      // 15f: aload 1
      // 160: ldc_w "channel_type"
      // 163: aload 6
      // 165: invokevirtual java/lang/Number.intValue ()I
      // 168: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16b: invokestatic la/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 16e: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 171: pop
      // 172: aload 2
      // 173: invokevirtual com/discord/notifications/api/NotificationData.getRelationshipType ()Ljava/lang/Integer;
      // 176: astore 6
      // 178: aload 6
      // 17a: ifnull 190
      // 17d: aload 1
      // 17e: ldc_w "rel_type"
      // 181: aload 6
      // 183: invokevirtual java/lang/Number.intValue ()I
      // 186: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 189: invokestatic la/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 18c: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 18f: pop
      // 190: aload 2
      // 191: invokevirtual com/discord/notifications/api/NotificationData.getMentionType ()Ljava/lang/String;
      // 194: astore 6
      // 196: aload 6
      // 198: ifnull 1a8
      // 19b: aload 1
      // 19c: ldc_w "mention_type"
      // 19f: aload 6
      // 1a1: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1a4: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1a7: pop
      // 1a8: aload 2
      // 1a9: invokevirtual com/discord/notifications/api/NotificationData.getAppState ()Ljava/lang/String;
      // 1ac: astore 2
      // 1ad: aload 2
      // 1ae: ifnull 1bd
      // 1b1: aload 1
      // 1b2: ldc_w "app_state"
      // 1b5: aload 2
      // 1b6: invokestatic la/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1b9: invokevirtual la/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1bc: pop
      // 1bd: aload 1
      // 1be: invokevirtual la/p.a ()Lkotlinx/serialization/json/JsonObject;
      // 1c1: astore 2
      // 1c2: new java/io/FileOutputStream
      // 1c5: astore 6
      // 1c7: aload 6
      // 1c9: aload 5
      // 1cb: bipush 1
      // 1cc: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;Z)V
      // 1cf: new java/io/BufferedOutputStream
      // 1d2: astore 1
      // 1d3: aload 1
      // 1d4: aload 6
      // 1d6: sipush 8192
      // 1d9: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 1dc: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 1df: astore 5
      // 1e1: aload 5
      // 1e3: invokeinterface ha/e.a ()Lna/b; 1
      // 1e8: pop
      // 1e9: aload 5
      // 1eb: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 1ee: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 1f1: aload 2
      // 1f2: invokeinterface ha/m.c (Lha/h;Ljava/lang/Object;)Ljava/lang/String; 3
      // 1f7: getstatic V9/a.b Ljava/nio/charset/Charset;
      // 1fa: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 1fd: astore 2
      // 1fe: aload 2
      // 1ff: ldc_w "getBytes(...)"
      // 202: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 205: aload 1
      // 206: aload 2
      // 207: invokevirtual java/io/OutputStream.write ([B)V
      // 20a: aload 1
      // 20b: bipush 10
      // 20d: invokevirtual java/io/BufferedOutputStream.write (I)V
      // 210: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 213: astore 2
      // 214: aload 1
      // 215: aconst_null
      // 216: invokestatic A8/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 219: goto 246
      // 21c: astore 5
      // 21e: aload 5
      // 220: athrow
      // 221: astore 2
      // 222: aload 1
      // 223: aload 5
      // 225: invokestatic A8/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 228: aload 2
      // 229: athrow
      // 22a: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 22d: astore 5
      // 22f: ldc com/discord/notifications/client/NotificationClient
      // 231: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 234: astore 1
      // 235: aload 1
      // 236: ldc_w "getSimpleName(...)"
      // 239: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 23c: aload 5
      // 23e: aload 1
      // 23f: ldc_w "Error appending notification to cache file"
      // 242: aload 2
      // 243: invokevirtual com/discord/logging/Log.e (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 246: aload 0
      // 247: monitorexit
      // 248: return
      // 249: aload 0
      // 24a: monitorexit
      // 24b: aload 1
      // 24c: athrow
   }

   private fun getBehaviors(context: Context): NotificationBehaviors? {
      val var2: NotificationBehaviors;
      if (VERSION.SDK_INT >= 26) {
         var2 = null;
      } else {
         var2 = new NotificationBehaviors(this.isSoundsEnabled(var1), this.isVibrationsEnabled(var1), this.isLightsEnabled(var1));
      }

      return var2;
   }

   private fun isFullscreenCallUIEnabled(context: Context): Boolean {
      return this.cache.isFullscreenCallUIEnabled(var1);
   }

   private fun isMissedCallNotificationsEnabled(context: Context): Boolean {
      return this.cache.isMissedCallNotificationsEnabled(var1);
   }

   private fun setLocalNotification(notification: Map<String, String?>) {
      if (this.notificationLocalListener != null) {
         if (this.notificationLocalListener != null) {
            this.notificationLocalListener.invoke(var1);
         }
      } else {
         this.notificationPending = var1;
      }
   }

   private fun setNotification(notification: Map<String, String?>?) {
      if (var1 == null) {
         this.notificationPending = null;
      } else {
         if (this.notificationListener != null) {
            if (this.notificationListener != null) {
               this.notificationListener.invoke(var1);
            }
         } else {
            this.notificationPending = var1;
         }
      }
   }

   private fun showNotification(context: Context, notificationData: NotificationData, notificationDataMap: Map<String, String>, makeOrUpdateShortcut: Boolean) {
      val var9: CrashReporting = CrashReporting.INSTANCE;
      val var11: Pair = w.a("type", var2.getType());
      var var12: Pair = w.a("channelId", java.lang.String.valueOf(var2.getChannelId-qMVnFVQ()));
      var var8: java.lang.String = var2.getMessageId-N_6c4I0();
      var var10: java.lang.String = "null";
      if (var8 == null) {
         var8 = "null";
      } else {
         var8 = MessageId.toString-impl(var8);
      }

      CrashReporting.addBreadcrumb$default(
         var9, "Kotlin NotificationClient received Notification.", q.l(new Pair[]{var11, var12, w.a("messageId", var8)}), null, 4, null
      );
      if (this.cache.isAuthed(var1)) {
         val var82: SilentNotificationManager = SilentNotificationManager.Companion.get(var1);
         if (kotlin.jvm.internal.q.c(var2.getType(), "CHANNEL_ACK")) {
            this.renderer.handleAcks(var1, var2);
            var82.handleAcks(var2);
         } else if (kotlin.jvm.internal.q.c(var2.getType(), "CALL_RING_END") && this.isMissedCallNotificationsEnabled(var1)) {
            this.renderer.handleCallRingEnd(var1, var2.getAckChannelIds());
         } else if (kotlin.jvm.internal.q.c(var2.getType(), "CALL_ACK") && this.isMissedCallNotificationsEnabled(var1)) {
            this.renderer.handleCallAck(var1, var2.getAckChannelIds());
         } else {
            if (this.shouldDisplayNotification.invoke() as java.lang.Boolean || kotlin.jvm.internal.q.c(var2.getType(), "CALL_RING")) {
               var var7: Boolean;
               try {
                  var7 = var82.shouldDisplayNotification(var2);
                  var70 = var2.getReceivingUserId-wUX8bhU();
               } catch (var33: Exception) {
                  val var34: Log = Log.INSTANCE;
                  val var51: java.lang.String = NotificationClient.class.getSimpleName();
                  kotlin.jvm.internal.q.g(var51, "getSimpleName(...)");
                  var34.e(var51, "Unable to display notification", var33);
                  return;
               }

               label142: {
                  if (var70 != null) {
                     try {
                        var73 = UserId.toString-impl(var70.unbox-impl());
                     } catch (var32: Exception) {
                        val var35: Log = Log.INSTANCE;
                        val var52: java.lang.String = NotificationClient.class.getSimpleName();
                        kotlin.jvm.internal.q.g(var52, "getSimpleName(...)");
                        var35.e(var52, "Unable to display notification", var32);
                        return;
                     }

                     var8 = var73;
                     if (var73 != null) {
                        break label142;
                     }
                  }

                  try {
                     var8 = this.cache.getCurrentUserId(var1);
                  } catch (var31: Exception) {
                     val var36: Log = Log.INSTANCE;
                     val var53: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var53, "getSimpleName(...)");
                     var36.e(var53, "Unable to display notification", var31);
                     return;
                  }
               }

               if (var8 != null) {
                  var var5: Long;
                  var var13: PushNotificationMonitor;
                  var var14: java.lang.String;
                  var var15: java.lang.String;
                  try {
                     var13 = PushNotificationMonitor.INSTANCE;
                     var15 = var2.getType();
                     var5 = System.currentTimeMillis();
                     var14 = NotificationDataUtilsKt.getTitle(var2, var1).toString();
                     var74 = NotificationDataUtilsKt.getContent(var2, var1, true);
                  } catch (var30: Exception) {
                     val var37: Log = Log.INSTANCE;
                     val var54: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var54, "getSimpleName(...)");
                     var37.e(var54, "Unable to display notification", var30);
                     return;
                  }

                  val var75: java.lang.String;
                  if (var74 != null) {
                     try {
                        var75 = var74.toString();
                     } catch (var29: Exception) {
                        val var38: Log = Log.INSTANCE;
                        val var55: java.lang.String = NotificationClient.class.getSimpleName();
                        kotlin.jvm.internal.q.g(var55, "getSimpleName(...)");
                        var38.e(var55, "Unable to display notification", var29);
                        return;
                     }
                  } else {
                     var75 = null;
                  }

                  var var16: java.lang.String;
                  var var17: java.lang.String;
                  try {
                     var16 = java.lang.String.valueOf(var2.getChannelId-qMVnFVQ());
                     var17 = var2.getMessageId-N_6c4I0();
                  } catch (var28: Exception) {
                     val var39: Log = Log.INSTANCE;
                     val var56: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var56, "getSimpleName(...)");
                     var39.e(var56, "Unable to display notification", var28);
                     return;
                  }

                  if (var17 != null) {
                     try {
                        var10 = MessageId.toString-impl(var17);
                     } catch (var27: Exception) {
                        val var40: Log = Log.INSTANCE;
                        val var57: java.lang.String = NotificationClient.class.getSimpleName();
                        kotlin.jvm.internal.q.g(var57, "getSimpleName(...)");
                        var40.e(var57, "Unable to display notification", var27);
                        return;
                     }
                  }

                  try {
                     var13.logPushNotification(var1, var8, new PushNotificationMeta(var5, var7 xor true, var15, var14, var75, var16, var10));
                  } catch (var26: Exception) {
                     val var41: Log = Log.INSTANCE;
                     val var58: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var58, "getSimpleName(...)");
                     var41.e(var58, "Unable to display notification", var26);
                     return;
                  }
               }

               if (var7) {
                  try {
                     this.renderer.initIconUrlUtils(var1);
                     this.renderer.initFresco(var1);
                     this.renderer
                        .display(
                           var1,
                           var2,
                           this.cache.getCurrentUsername(var1),
                           var3,
                           this.getBehaviors(var1),
                           var4,
                           this.shouldNotifyEveryTime(var1),
                           this.isFullscreenCallUIEnabled(var1)
                        );
                     var82.onDisplayNotification(var2);
                  } catch (var25: Exception) {
                     val var42: Log = Log.INSTANCE;
                     val var59: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var59, "getSimpleName(...)");
                     var42.e(var59, "Unable to display notification", var25);
                     return;
                  }
               } else {
                  try {
                     var82.onSilentNotification(var2);
                  } catch (var24: Exception) {
                     val var43: Log = Log.INSTANCE;
                     val var60: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var60, "getSimpleName(...)");
                     var43.e(var60, "Unable to display notification", var24);
                     return;
                  }
               }

               try {
                  if (!kotlin.jvm.internal.q.c(var2.getType(), "MESSAGE_CREATE")) {
                     return;
                  }

                  var72 = NotificationDataUtilsKt.getKvMessage(var2, var3.get("message") as java.lang.String);
               } catch (var23: Exception) {
                  val var44: Log = Log.INSTANCE;
                  val var61: java.lang.String = NotificationClient.class.getSimpleName();
                  kotlin.jvm.internal.q.g(var61, "getSimpleName(...)");
                  var44.e(var61, "Unable to display notification", var23);
                  return;
               }

               if (var72 != null) {
                  try {
                     var76 = var2.getMessageId-N_6c4I0();
                     var78 = var2.getChannelId-qMVnFVQ();
                  } catch (var22: Exception) {
                     val var45: Log = Log.INSTANCE;
                     val var62: java.lang.String = NotificationClient.class.getSimpleName();
                     kotlin.jvm.internal.q.g(var62, "getSimpleName(...)");
                     var45.e(var62, "Unable to display notification", var22);
                     return;
                  }

                  if (var76 != null && var78 != null) {
                     try {
                        var12 = (Pair)var3.get("receiving_user_id");
                        val var64: StringBuilder = new StringBuilder();
                        var64.append("@account.");
                        var64.append(var12);
                        var65 = var64.toString();
                        var84 = var2.getGuildId-qOKuAAo();
                     } catch (var21: Exception) {
                        val var46: Log = Log.INSTANCE;
                        val var63: java.lang.String = NotificationClient.class.getSimpleName();
                        kotlin.jvm.internal.q.g(var63, "getSimpleName(...)");
                        var46.e(var63, "Unable to display notification", var21);
                        return;
                     }

                     var var47: java.lang.String = null;
                     if (var84 != null) {
                        try {
                           var47 = GuildId.toString-impl(var84.unbox-impl());
                        } catch (var20: Exception) {
                           val var48: Log = Log.INSTANCE;
                           val var66: java.lang.String = NotificationClient.class.getSimpleName();
                           kotlin.jvm.internal.q.g(var66, "getSimpleName(...)");
                           var48.e(var66, "Unable to display notification", var20);
                           return;
                        }
                     }

                     try {
                        var10 = ChannelId.toString-impl(var78.unbox-impl());
                        val var81: java.lang.String = MessageId.toString-impl(var76);
                        val var77: a = Json.d;
                        Json.d.a();
                        DiscordMobileApi.putMessage(var65, var47, var10, var81, var77.c(KvMessageEntry.Companion.serializer(), var72));
                     } catch (var19: Exception) {
                        val var49: Log = Log.INSTANCE;
                        val var67: java.lang.String = NotificationClient.class.getSimpleName();
                        kotlin.jvm.internal.q.g(var67, "getSimpleName(...)");
                        var49.e(var67, "Unable to display notification", var19);
                        return;
                     }
                  }
               }

               try {
                  if (this.updateAndComputeIfShouldRunBackgroundSync(var1)) {
                     HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, "BackgroundSync", 30000L, false, null, true, 24, null);
                  }
               } catch (var18: Exception) {
                  val var50: Log = Log.INSTANCE;
                  val var68: java.lang.String = NotificationClient.class.getSimpleName();
                  kotlin.jvm.internal.q.g(var68, "getSimpleName(...)");
                  var50.e(var68, "Unable to display notification", var18);
               }
            }
         }
      }
   }

   private fun updateAndComputeIfShouldRunBackgroundSync(context: Context): Boolean {
      val var2: Long = System.currentTimeMillis();
      if (var2 < this.cache.getBackgroundSyncRan(var1)) {
         this.cache.setBackgroundSyncRan(var1);
         return true;
      } else if (var2 > this.cache.getBackgroundSyncRan(var1) + 3600000L) {
         this.cache.setBackgroundSyncRan(var1);
         return true;
      } else {
         return false;
      }
   }

   public fun ackReactionNotifications(context: Context, channelId: String) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "channelId");
      this.renderer.handleReactionAcks(var1, var2);
   }

   public fun clearAllNotifications(context: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.renderer.clearAllNotifications(var1);
   }

   public fun getPendingNotification(): Map<String, String?>? {
      var var1: java.util.Map = this.notificationPending;
      if (this.notificationPending != null) {
         this.notificationPending = null;
      } else {
         var1 = null;
      }

      return var1;
   }

   public fun handleIntent(context: Context, intent: Intent) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "intent");
      val var3: NotificationAction.Companion = NotificationAction.Companion;
      val var7: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, G.b(ContentAction.class))) {
         var7 = (b.b(var2, "action_intent_arg_key", ContentAction.class) as Parcelable) as NotificationAction;
      } else {
         var7 = null;
      }

      val var4: ContentAction = var7 as ContentAction;
      val var5: ShortcutData = ShortcutData.Companion.getShortcutIntentData(var2);
      val var6: ContentAction;
      if (var5 != null) {
         var6 = new ContentAction(var5.getTag(), var5.getData());
      } else {
         var6 = null;
      }

      var var8: ContentAction = var4;
      if (var4 == null) {
         var8 = var6;
      }

      if (var8 == null) {
         this.setNotification(null);
      } else {
         if (var8.isLocal()) {
            this.setLocalNotification(var8.getData());
         } else {
            this.setNotification(var8.getData());
         }

         var8.onNotificationActionComplete(var1);
      }
   }

   public fun initNotificationCategories(context: Context, localizedCategoryNames: Map<String, String>, localizedGroupNames: Map<String, String>) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "localizedCategoryNames");
      kotlin.jvm.internal.q.h(var3, "localizedGroupNames");
      this.renderer.initNotificationCategories(var1, var2, var3);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      kotlin.jvm.internal.q.h(var1, "context");
      return this.cache.isLightsEnabled(var1);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      kotlin.jvm.internal.q.h(var1, "context");
      return this.cache.isSoundsEnabled(var1);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      kotlin.jvm.internal.q.h(var1, "context");
      return this.cache.isVibrationsEnabled(var1);
   }

   public fun markNotificationAsDirectReply(context: Context, channelId: Long) {
      kotlin.jvm.internal.q.h(var1, "context");
      val var5: NotificationRenderer = this.renderer;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MESSAGE_CREATE");
      var4.append(var2);
      var5.markNotificationAsDirectReply(var1, var4.toString(), "", true);
   }

   public fun onDirectReplySuccess(context: Context, data: String) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "data");
      val var3: NotificationData = DirectReplyMessage.Companion.toNotificationData(var2);
      val var5: Pair = w.a("type", var3.getType());
      val var4: Pair = w.a("channel_id", java.lang.String.valueOf(var3.getChannelId-qMVnFVQ()));
      var2 = var3.getMessageId-N_6c4I0();
      if (var2 == null) {
         var2 = "null";
      } else {
         var2 = MessageId.toString-impl(var2);
      }

      this.showNotification(var1, var3, q.l(new Pair[]{var5, var4, w.a("message_id", var2)}), false);
   }

   public fun onNotificationReceived(context: Context, data: Map<String, String>) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "data");
      val var4: oa.a.a = oa.a.b;
      val var5: KSerializer = NotificationData.Companion.serializer();
      val var6: java.util.Map = q.x(var2);
      var6.put("time_received", java.lang.String.valueOf(System.currentTimeMillis()));
      val var3: java.lang.String;
      if (this.shouldDisplayNotification.invoke() as java.lang.Boolean) {
         var3 = "background";
      } else {
         var3 = "active";
      }

      var6.put("app_state", var3);
      val var8: NotificationData = var4.d(var5, var6) as NotificationData;
      this.appendNotificationToCacheFile(var1, var8);
      this.showNotification(var1, var8, var2, true);
   }

   public fun setCurrentUser(context: Context, username: String?, userId: String?) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setCurrentUsername(var1, var2);
      this.cache.setCurrentUserId(var1, var3);
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "name");
      this.renderer.setIncomingRingtone(var1, var2);
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setIsAuthed(var1, var2);
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setLightsEnabled(var1, var2);
   }

   public fun setLocalNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "notificationListener");
      this.notificationLocalListener = var1;
   }

   public fun setNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "notificationListener");
      this.notificationListener = var1;
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setNotifyEveryTime(var1, var2);
   }

   public fun setShowFullscreenCallUI(context: Context, enabled: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setFullscreenCallUIEnabled(var1, var2);
   }

   public fun setShowMissedCallNotifications(context: Context, enabled: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setMissedCallNotificationsEnabled(var1, var2);
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setSoundsEnabled(var1, var2);
   }

   public fun setToken(token: String) {
      kotlin.jvm.internal.q.h(var1, "token");
      if (!kotlin.jvm.internal.q.c(this.token, var1)) {
         this.token = var1;
         this.tokenListener.invoke(var1);
      }
   }

   public fun setTokenListener(tokenListener: (String) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "tokenListener");
      this.tokenListener = var1;
      if (this.token != null) {
         var1.invoke(this.token);
      }
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      kotlin.jvm.internal.q.h(var1, "context");
      this.cache.setVibrationsEnabled(var1, var2);
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      kotlin.jvm.internal.q.h(var1, "context");
      return this.cache.shouldNotifyEveryTime(var1);
   }

   public fun showLocalNotification(context: Context, notification: Map<String, Any>) {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "notification");
      this.renderer.displayLocal(var1, var2);
   }

   public companion object {
      private const val NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS: Long
      public final val instance: NotificationClient
   }
}
