package com.discord.notifications.client

import A9.q
import U1.a
import U1.b
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.os.Build.VERSION
import androidx.core.content.c
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
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import z9.s

public class NotificationClient {
   public final var shouldDisplayNotification: () -> Boolean = new a()
   private final var token: String?
   private final var tokenListener: (String) -> Unit = new b()
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
      // 005: astore 6
      // 007: aload 6
      // 009: aload 1
      // 00a: invokevirtual android/content/Context.getCacheDir ()Ljava/io/File;
      // 00d: ldc "notifications_to_track"
      // 00f: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 012: aload 6
      // 014: invokevirtual java/io/File.length ()J
      // 017: lstore 3
      // 018: lload 3
      // 019: ldc2_w 5242880
      // 01c: lcmp
      // 01d: iflt 023
      // 020: aload 0
      // 021: monitorexit
      // 022: return
      // 023: aload 1
      // 024: invokestatic androidx/core/app/NotificationManagerCompat.g (Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;
      // 027: invokevirtual androidx/core/app/NotificationManagerCompat.a ()Z
      // 02a: istore 5
      // 02c: new wb/p
      // 02f: astore 1
      // 030: aload 1
      // 031: invokespecial wb/p.<init> ()V
      // 034: aload 1
      // 035: ldc "push_action_type"
      // 037: aload 2
      // 038: invokevirtual com/discord/notifications/api/NotificationData.getType ()Ljava/lang/String;
      // 03b: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 03e: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 041: pop
      // 042: aload 1
      // 043: ldc "os_enabled"
      // 045: iload 5
      // 047: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 04a: invokestatic wb/g.b (Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;
      // 04d: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 050: pop
      // 051: aload 2
      // 052: invokevirtual com/discord/notifications/api/NotificationData.getTimeReceived ()Ljava/lang/String;
      // 055: astore 7
      // 057: aload 7
      // 059: ifnull 074
      // 05c: aload 1
      // 05d: ldc "timestamp"
      // 05f: aload 7
      // 061: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 064: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 067: pop
      // 068: goto 074
      // 06b: astore 1
      // 06c: goto 262
      // 06f: astore 6
      // 071: goto 244
      // 074: aload 2
      // 075: invokevirtual com/discord/notifications/api/NotificationData.getNotifTypeId ()Ljava/lang/String;
      // 078: astore 7
      // 07a: aload 7
      // 07c: ifnull 08b
      // 07f: aload 1
      // 080: ldc "notif_type_id"
      // 082: aload 7
      // 084: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 087: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 08a: pop
      // 08b: aload 2
      // 08c: invokevirtual com/discord/notifications/api/NotificationData.getNotifInstanceId ()Ljava/lang/String;
      // 08f: astore 7
      // 091: aload 7
      // 093: ifnull 0a2
      // 096: aload 1
      // 097: ldc "notif_instance_id"
      // 099: aload 7
      // 09b: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 09e: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0a1: pop
      // 0a2: aload 2
      // 0a3: invokevirtual com/discord/notifications/api/NotificationData.getJoinId ()Ljava/lang/String;
      // 0a6: astore 7
      // 0a8: aload 7
      // 0aa: ifnull 0b9
      // 0ad: aload 1
      // 0ae: ldc "join_id"
      // 0b0: aload 7
      // 0b2: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0b5: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0b8: pop
      // 0b9: aload 2
      // 0ba: invokevirtual com/discord/notifications/api/NotificationData.getUserId-wUX8bhU ()Lcom/discord/primitives/UserId;
      // 0bd: astore 7
      // 0bf: aload 7
      // 0c1: ifnull 0d6
      // 0c4: aload 1
      // 0c5: ldc "notif_user_id"
      // 0c7: aload 7
      // 0c9: invokevirtual com/discord/primitives/UserId.unbox-impl ()J
      // 0cc: invokestatic com/discord/primitives/UserId.toString-impl (J)Ljava/lang/String;
      // 0cf: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0d2: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0d5: pop
      // 0d6: aload 2
      // 0d7: invokevirtual com/discord/notifications/api/NotificationData.getReceivingUserId-wUX8bhU ()Lcom/discord/primitives/UserId;
      // 0da: astore 7
      // 0dc: aload 7
      // 0de: ifnull 0f4
      // 0e1: aload 1
      // 0e2: ldc_w "receiving_user_id"
      // 0e5: aload 7
      // 0e7: invokevirtual com/discord/primitives/UserId.unbox-impl ()J
      // 0ea: invokestatic com/discord/primitives/UserId.toString-impl (J)Ljava/lang/String;
      // 0ed: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0f0: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0f3: pop
      // 0f4: aload 2
      // 0f5: invokevirtual com/discord/notifications/api/NotificationData.getMessageId-N_6c4I0 ()Ljava/lang/String;
      // 0f8: astore 7
      // 0fa: aload 7
      // 0fc: ifnull 115
      // 0ff: aload 1
      // 100: ldc_w "message_id"
      // 103: aload 7
      // 105: invokestatic com/discord/primitives/MessageId.box-impl (Ljava/lang/String;)Lcom/discord/primitives/MessageId;
      // 108: invokevirtual com/discord/primitives/MessageId.unbox-impl ()Ljava/lang/String;
      // 10b: invokestatic com/discord/primitives/MessageId.toString-impl (Ljava/lang/String;)Ljava/lang/String;
      // 10e: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 111: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 114: pop
      // 115: aload 2
      // 116: invokevirtual com/discord/notifications/api/NotificationData.getMessageType ()Ljava/lang/Integer;
      // 119: astore 7
      // 11b: aload 7
      // 11d: ifnull 133
      // 120: aload 1
      // 121: ldc_w "message_type"
      // 124: aload 7
      // 126: invokevirtual java/lang/Number.intValue ()I
      // 129: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12c: invokestatic wb/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 12f: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 132: pop
      // 133: aload 2
      // 134: invokevirtual com/discord/notifications/api/NotificationData.getGuildId-qOKuAAo ()Lcom/discord/primitives/GuildId;
      // 137: astore 7
      // 139: aload 7
      // 13b: ifnull 151
      // 13e: aload 1
      // 13f: ldc_w "guild_id"
      // 142: aload 7
      // 144: invokevirtual com/discord/primitives/GuildId.unbox-impl ()J
      // 147: invokestatic com/discord/primitives/GuildId.toString-impl (J)Ljava/lang/String;
      // 14a: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 14d: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 150: pop
      // 151: aload 2
      // 152: invokevirtual com/discord/notifications/api/NotificationData.getChannelId-qMVnFVQ ()Lcom/discord/primitives/ChannelId;
      // 155: astore 7
      // 157: aload 7
      // 159: ifnull 16f
      // 15c: aload 1
      // 15d: ldc_w "channel_id"
      // 160: aload 7
      // 162: invokevirtual com/discord/primitives/ChannelId.unbox-impl ()J
      // 165: invokestatic com/discord/primitives/ChannelId.toString-impl (J)Ljava/lang/String;
      // 168: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 16b: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 16e: pop
      // 16f: aload 2
      // 170: invokevirtual com/discord/notifications/api/NotificationData.getChannelType ()Ljava/lang/Integer;
      // 173: astore 7
      // 175: aload 7
      // 177: ifnull 18d
      // 17a: aload 1
      // 17b: ldc_w "channel_type"
      // 17e: aload 7
      // 180: invokevirtual java/lang/Number.intValue ()I
      // 183: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 186: invokestatic wb/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 189: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 18c: pop
      // 18d: aload 2
      // 18e: invokevirtual com/discord/notifications/api/NotificationData.getRelationshipType ()Ljava/lang/Integer;
      // 191: astore 7
      // 193: aload 7
      // 195: ifnull 1ab
      // 198: aload 1
      // 199: ldc_w "rel_type"
      // 19c: aload 7
      // 19e: invokevirtual java/lang/Number.intValue ()I
      // 1a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a4: invokestatic wb/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1a7: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1aa: pop
      // 1ab: aload 2
      // 1ac: invokevirtual com/discord/notifications/api/NotificationData.getMentionType ()Ljava/lang/String;
      // 1af: astore 7
      // 1b1: aload 7
      // 1b3: ifnull 1c3
      // 1b6: aload 1
      // 1b7: ldc_w "mention_type"
      // 1ba: aload 7
      // 1bc: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1bf: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1c2: pop
      // 1c3: aload 2
      // 1c4: invokevirtual com/discord/notifications/api/NotificationData.getAppState ()Ljava/lang/String;
      // 1c7: astore 2
      // 1c8: aload 2
      // 1c9: ifnull 1d8
      // 1cc: aload 1
      // 1cd: ldc_w "app_state"
      // 1d0: aload 2
      // 1d1: invokestatic wb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1d4: invokevirtual wb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1d7: pop
      // 1d8: aload 1
      // 1d9: invokevirtual wb/p.a ()Lkotlinx/serialization/json/JsonObject;
      // 1dc: astore 2
      // 1dd: new java/io/FileOutputStream
      // 1e0: astore 7
      // 1e2: aload 7
      // 1e4: aload 6
      // 1e6: bipush 1
      // 1e7: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;Z)V
      // 1ea: new java/io/BufferedOutputStream
      // 1ed: astore 1
      // 1ee: aload 1
      // 1ef: aload 7
      // 1f1: sipush 8192
      // 1f4: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 1f7: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 1fa: astore 6
      // 1fc: aload 6
      // 1fe: invokeinterface sb/f.a ()Lyb/b; 1
      // 203: pop
      // 204: aload 6
      // 206: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 209: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 20c: aload 2
      // 20d: invokeinterface sb/n.c (Lsb/i;Ljava/lang/Object;)Ljava/lang/String; 3
      // 212: getstatic gb/a.b Ljava/nio/charset/Charset;
      // 215: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 218: astore 2
      // 219: aload 2
      // 21a: ldc_w "getBytes(...)"
      // 21d: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 220: aload 1
      // 221: aload 2
      // 222: invokevirtual java/io/OutputStream.write ([B)V
      // 225: aload 1
      // 226: bipush 10
      // 228: invokevirtual java/io/BufferedOutputStream.write (I)V
      // 22b: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 22e: astore 2
      // 22f: aload 1
      // 230: aconst_null
      // 231: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 234: goto 25f
      // 237: astore 2
      // 238: aload 2
      // 239: athrow
      // 23a: astore 6
      // 23c: aload 1
      // 23d: aload 2
      // 23e: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 241: aload 6
      // 243: athrow
      // 244: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 247: astore 1
      // 248: ldc com/discord/notifications/client/NotificationClient
      // 24a: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 24d: astore 2
      // 24e: aload 2
      // 24f: ldc_w "getSimpleName(...)"
      // 252: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 255: aload 1
      // 256: aload 2
      // 257: ldc_w "Error appending notification to cache file"
      // 25a: aload 6
      // 25c: invokevirtual com/discord/logging/Log.e (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 25f: aload 0
      // 260: monitorexit
      // 261: return
      // 262: aload 0
      // 263: monitorexit
      // 264: aload 1
      // 265: athrow
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

   @JvmStatic
   fun `shouldDisplayNotification$lambda$0`(): Boolean {
      return true;
   }

   private fun showNotification(context: Context, notificationData: NotificationData, notificationDataMap: Map<String, String>, makeOrUpdateShortcut: Boolean) {
      val var11: CrashReporting = CrashReporting.INSTANCE;
      val var12: Pair = s.a("type", var2.getType());
      val var9: Pair = s.a("channelId", java.lang.String.valueOf(var2.getChannelId-qMVnFVQ()));
      var var8: java.lang.String = var2.getMessageId-N_6c4I0();
      var var10: java.lang.String = "null";
      if (var8 == null) {
         var8 = "null";
      } else {
         var8 = MessageId.toString-impl(var8);
      }

      CrashReporting.addBreadcrumb$default(
         var11, "Kotlin NotificationClient received Notification.", q.l(new Pair[]{var12, var9, s.a("messageId", var8)}), null, 4, null
      );
      if (this.cache.isAuthed(var1)) {
         val var82: SilentNotificationManager = SilentNotificationManager.Companion.get(var1);
         if (r.c(var2.getType(), "CHANNEL_ACK")) {
            this.renderer.handleAcks(var1, var2);
            var82.handleAcks(var2);
         } else if (r.c(var2.getType(), "CALL_RING_END") && this.isMissedCallNotificationsEnabled(var1)) {
            this.renderer.handleCallRingEnd(var1, var2.getAckChannelIds());
         } else if (r.c(var2.getType(), "CALL_ACK") && this.isMissedCallNotificationsEnabled(var1)) {
            this.renderer.handleCallAck(var1, var2.getAckChannelIds());
         } else {
            if (this.shouldDisplayNotification.invoke() as java.lang.Boolean || r.c(var2.getType(), "CALL_RING")) {
               var var7: Boolean;
               try {
                  var7 = var82.shouldDisplayNotification(var2);
                  var70 = var2.getReceivingUserId-wUX8bhU();
               } catch (var33: Exception) {
                  val var51: Log = Log.INSTANCE;
                  val var34: java.lang.String = NotificationClient.class.getSimpleName();
                  r.g(var34, "getSimpleName(...)");
                  var51.e(var34, "Unable to display notification", var33);
                  return;
               }

               label142: {
                  if (var70 != null) {
                     try {
                        var73 = UserId.toString-impl(var70.unbox-impl());
                     } catch (var32: Exception) {
                        val var52: Log = Log.INSTANCE;
                        val var35: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var35, "getSimpleName(...)");
                        var52.e(var35, "Unable to display notification", var32);
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
                     val var53: Log = Log.INSTANCE;
                     val var36: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var36, "getSimpleName(...)");
                     var53.e(var36, "Unable to display notification", var31);
                     return;
                  }
               }

               if (var8 != null) {
                  var var5: Long;
                  var var13: java.lang.String;
                  var var14: java.lang.String;
                  var var15: PushNotificationMonitor;
                  try {
                     var15 = PushNotificationMonitor.INSTANCE;
                     var14 = var2.getType();
                     var5 = System.currentTimeMillis();
                     var13 = NotificationDataUtilsKt.getTitle(var2, var1).toString();
                     var74 = NotificationDataUtilsKt.getContent(var2, var1, true);
                  } catch (var30: Exception) {
                     val var54: Log = Log.INSTANCE;
                     val var37: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var37, "getSimpleName(...)");
                     var54.e(var37, "Unable to display notification", var30);
                     return;
                  }

                  val var75: java.lang.String;
                  if (var74 != null) {
                     try {
                        var75 = var74.toString();
                     } catch (var29: Exception) {
                        val var55: Log = Log.INSTANCE;
                        val var38: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var38, "getSimpleName(...)");
                        var55.e(var38, "Unable to display notification", var29);
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
                     val var56: Log = Log.INSTANCE;
                     val var39: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var39, "getSimpleName(...)");
                     var56.e(var39, "Unable to display notification", var28);
                     return;
                  }

                  if (var17 != null) {
                     try {
                        var10 = MessageId.toString-impl(var17);
                     } catch (var27: Exception) {
                        val var57: Log = Log.INSTANCE;
                        val var40: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var40, "getSimpleName(...)");
                        var57.e(var40, "Unable to display notification", var27);
                        return;
                     }
                  }

                  try {
                     var15.logPushNotification(var1, var8, new PushNotificationMeta(var5, var7 xor true, var14, var13, var75, var16, var10));
                  } catch (var26: Exception) {
                     val var58: Log = Log.INSTANCE;
                     val var41: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var41, "getSimpleName(...)");
                     var58.e(var41, "Unable to display notification", var26);
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
                     val var59: Log = Log.INSTANCE;
                     val var42: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var42, "getSimpleName(...)");
                     var59.e(var42, "Unable to display notification", var25);
                     return;
                  }
               } else {
                  try {
                     var82.onSilentNotification(var2);
                  } catch (var24: Exception) {
                     val var60: Log = Log.INSTANCE;
                     val var43: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var43, "getSimpleName(...)");
                     var60.e(var43, "Unable to display notification", var24);
                     return;
                  }
               }

               try {
                  if (!r.c(var2.getType(), "MESSAGE_CREATE")) {
                     return;
                  }

                  var72 = NotificationDataUtilsKt.getKvMessage(var2, var3.get("message") as java.lang.String);
               } catch (var23: Exception) {
                  val var61: Log = Log.INSTANCE;
                  val var44: java.lang.String = NotificationClient.class.getSimpleName();
                  r.g(var44, "getSimpleName(...)");
                  var61.e(var44, "Unable to display notification", var23);
                  return;
               }

               if (var72 != null) {
                  try {
                     var76 = var2.getMessageId-N_6c4I0();
                     var78 = var2.getChannelId-qMVnFVQ();
                  } catch (var22: Exception) {
                     val var62: Log = Log.INSTANCE;
                     val var45: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var45, "getSimpleName(...)");
                     var62.e(var45, "Unable to display notification", var22);
                     return;
                  }

                  if (var76 != null && var78 != null) {
                     try {
                        val var64: Any = var3.get("receiving_user_id");
                        val var83: StringBuilder = new StringBuilder();
                        var83.append("@account.");
                        var83.append(var64);
                        var65 = var83.toString();
                        var84 = var2.getGuildId-qOKuAAo();
                     } catch (var21: Exception) {
                        val var63: Log = Log.INSTANCE;
                        val var46: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var46, "getSimpleName(...)");
                        var63.e(var46, "Unable to display notification", var21);
                        return;
                     }

                     var var47: java.lang.String = null;
                     if (var84 != null) {
                        try {
                           var47 = GuildId.toString-impl(var84.unbox-impl());
                        } catch (var20: Exception) {
                           val var66: Log = Log.INSTANCE;
                           val var48: java.lang.String = NotificationClient.class.getSimpleName();
                           r.g(var48, "getSimpleName(...)");
                           var66.e(var48, "Unable to display notification", var20);
                           return;
                        }
                     }

                     try {
                        var10 = ChannelId.toString-impl(var78.unbox-impl());
                        val var81: java.lang.String = MessageId.toString-impl(var76);
                        val var77: kotlinx.serialization.json.Json.a = Json.d;
                        Json.d.a();
                        DiscordMobileApi.putMessage(var65, var47, var10, var81, var77.c(KvMessageEntry.Companion.serializer(), var72));
                     } catch (var19: Exception) {
                        val var67: Log = Log.INSTANCE;
                        val var49: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var49, "getSimpleName(...)");
                        var67.e(var49, "Unable to display notification", var19);
                        return;
                     }
                  }
               }

               try {
                  if (this.updateAndComputeIfShouldRunBackgroundSync(var1)) {
                     HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, "BackgroundSync", 30000L, false, null, true, 24, null);
                  }
               } catch (var18: Exception) {
                  val var68: Log = Log.INSTANCE;
                  val var50: java.lang.String = NotificationClient.class.getSimpleName();
                  r.g(var50, "getSimpleName(...)");
                  var68.e(var50, "Unable to display notification", var18);
               }
            }
         }
      }
   }

   @JvmStatic
   fun `tokenListener$lambda$1`(var0: java.lang.String): Unit {
      r.h(var0, "it");
      return Unit.a;
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
      r.h(var1, "context");
      r.h(var2, "channelId");
      this.renderer.handleReactionAcks(var1, var2);
   }

   public fun clearAllNotifications(context: Context) {
      r.h(var1, "context");
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
      r.h(var1, "context");
      r.h(var2, "intent");
      val var3: NotificationAction.Companion = NotificationAction.Companion;
      val var7: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, H.b(ContentAction.class))) {
         var7 = (c.b(var2, "action_intent_arg_key", ContentAction.class) as Parcelable) as NotificationAction;
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
      r.h(var1, "context");
      r.h(var2, "localizedCategoryNames");
      r.h(var3, "localizedGroupNames");
      this.renderer.initNotificationCategories(var1, var2, var3);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.isLightsEnabled(var1);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.isSoundsEnabled(var1);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.isVibrationsEnabled(var1);
   }

   public fun markNotificationAsDirectReply(context: Context, channelId: Long) {
      r.h(var1, "context");
      val var4: NotificationRenderer = this.renderer;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MESSAGE_CREATE");
      var5.append(var2);
      var4.markNotificationAsDirectReply(var1, var5.toString(), "", true);
   }

   public fun onDirectReplySuccess(context: Context, data: String) {
      r.h(var1, "context");
      r.h(var2, "data");
      val var4: NotificationData = DirectReplyMessage.Companion.toNotificationData(var2);
      val var3: Pair = s.a("type", var4.getType());
      val var5: Pair = s.a("channel_id", java.lang.String.valueOf(var4.getChannelId-qMVnFVQ()));
      var2 = var4.getMessageId-N_6c4I0();
      if (var2 == null) {
         var2 = "null";
      } else {
         var2 = MessageId.toString-impl(var2);
      }

      this.showNotification(var1, var4, q.l(new Pair[]{var3, var5, s.a("message_id", var2)}), false);
   }

   public fun onNotificationReceived(context: Context, data: Map<String, String>) {
      r.h(var1, "context");
      r.h(var2, "data");
      val var5: zb.a.a = zb.a.b;
      val var4: KSerializer = NotificationData.Companion.serializer();
      val var6: java.util.Map = q.x(var2);
      var6.put("time_received", java.lang.String.valueOf(System.currentTimeMillis()));
      val var3: java.lang.String;
      if (this.shouldDisplayNotification.invoke() as java.lang.Boolean) {
         var3 = "background";
      } else {
         var3 = "active";
      }

      var6.put("app_state", var3);
      val var8: NotificationData = var5.d(var4, var6) as NotificationData;
      this.appendNotificationToCacheFile(var1, var8);
      this.showNotification(var1, var8, var2, true);
   }

   public fun setCurrentUser(context: Context, username: String?, userId: String?) {
      r.h(var1, "context");
      this.cache.setCurrentUsername(var1, var2);
      this.cache.setCurrentUserId(var1, var3);
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      r.h(var1, "context");
      r.h(var2, "name");
      this.renderer.setIncomingRingtone(var1, var2);
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      r.h(var1, "context");
      this.cache.setIsAuthed(var1, var2);
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      r.h(var1, "context");
      this.cache.setLightsEnabled(var1, var2);
   }

   public fun setLocalNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      r.h(var1, "notificationListener");
      this.notificationLocalListener = var1;
   }

   public fun setNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      r.h(var1, "notificationListener");
      this.notificationListener = var1;
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      r.h(var1, "context");
      this.cache.setNotifyEveryTime(var1, var2);
   }

   public fun setShowFullscreenCallUI(context: Context, enabled: Boolean) {
      r.h(var1, "context");
      this.cache.setFullscreenCallUIEnabled(var1, var2);
   }

   public fun setShowMissedCallNotifications(context: Context, enabled: Boolean) {
      r.h(var1, "context");
      this.cache.setMissedCallNotificationsEnabled(var1, var2);
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      r.h(var1, "context");
      this.cache.setSoundsEnabled(var1, var2);
   }

   public fun setToken(token: String) {
      r.h(var1, "token");
      if (!r.c(this.token, var1)) {
         this.token = var1;
         this.tokenListener.invoke(var1);
      }
   }

   public fun setTokenListener(tokenListener: (String) -> Unit) {
      r.h(var1, "tokenListener");
      this.tokenListener = var1;
      if (this.token != null) {
         var1.invoke(this.token);
      }
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      r.h(var1, "context");
      this.cache.setVibrationsEnabled(var1, var2);
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.shouldNotifyEveryTime(var1);
   }

   public fun showLocalNotification(context: Context, notification: Map<String, Any>) {
      r.h(var1, "context");
      r.h(var2, "notification");
      this.renderer.displayLocal(var1, var2);
   }

   public companion object {
      private const val NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS: Long
      public final val instance: NotificationClient
   }
}
