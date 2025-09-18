package com.discord.notifications.client

import A9.s
import T1.a
import T1.b
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
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json

@SourceDebugExtension(["SMAP\nNotificationClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationClient.kt\ncom/discord/notifications/client/NotificationClient\n+ 2 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 3 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 6 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,413:1\n86#2,2:414\n89#2,2:417\n14#3:416\n1#4:419\n113#5:420\n113#5:425\n27#6,4:421\n*S KotlinDebug\n*F\n+ 1 NotificationClient.kt\ncom/discord/notifications/client/NotificationClient\n*L\n60#1:414,2\n60#1:417,2\n60#1:416\n300#1:420\n399#1:425\n379#1:421,4\n*E\n"])
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
      // 02c: new qb/p
      // 02f: astore 1
      // 030: aload 1
      // 031: invokespecial qb/p.<init> ()V
      // 034: aload 1
      // 035: ldc "push_action_type"
      // 037: aload 2
      // 038: invokevirtual com/discord/notifications/api/NotificationData.getType ()Ljava/lang/String;
      // 03b: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 03e: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 041: pop
      // 042: aload 1
      // 043: ldc "os_enabled"
      // 045: iload 5
      // 047: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 04a: invokestatic qb/g.b (Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;
      // 04d: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 050: pop
      // 051: aload 2
      // 052: invokevirtual com/discord/notifications/api/NotificationData.getTimeReceived ()Ljava/lang/String;
      // 055: astore 7
      // 057: aload 7
      // 059: ifnull 073
      // 05c: aload 1
      // 05d: ldc "timestamp"
      // 05f: aload 7
      // 061: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 064: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 067: pop
      // 068: goto 073
      // 06b: astore 1
      // 06c: goto 263
      // 06f: astore 1
      // 070: goto 244
      // 073: aload 2
      // 074: invokevirtual com/discord/notifications/api/NotificationData.getNotifTypeId ()Ljava/lang/String;
      // 077: astore 7
      // 079: aload 7
      // 07b: ifnull 08a
      // 07e: aload 1
      // 07f: ldc "notif_type_id"
      // 081: aload 7
      // 083: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 086: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 089: pop
      // 08a: aload 2
      // 08b: invokevirtual com/discord/notifications/api/NotificationData.getNotifInstanceId ()Ljava/lang/String;
      // 08e: astore 7
      // 090: aload 7
      // 092: ifnull 0a1
      // 095: aload 1
      // 096: ldc "notif_instance_id"
      // 098: aload 7
      // 09a: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 09d: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0a0: pop
      // 0a1: aload 2
      // 0a2: invokevirtual com/discord/notifications/api/NotificationData.getJoinId ()Ljava/lang/String;
      // 0a5: astore 7
      // 0a7: aload 7
      // 0a9: ifnull 0b8
      // 0ac: aload 1
      // 0ad: ldc "join_id"
      // 0af: aload 7
      // 0b1: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0b4: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0b7: pop
      // 0b8: aload 2
      // 0b9: invokevirtual com/discord/notifications/api/NotificationData.getUserId-wUX8bhU ()Lcom/discord/primitives/UserId;
      // 0bc: astore 7
      // 0be: aload 7
      // 0c0: ifnull 0d5
      // 0c3: aload 1
      // 0c4: ldc "notif_user_id"
      // 0c6: aload 7
      // 0c8: invokevirtual com/discord/primitives/UserId.unbox-impl ()J
      // 0cb: invokestatic com/discord/primitives/UserId.toString-impl (J)Ljava/lang/String;
      // 0ce: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0d1: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0d4: pop
      // 0d5: aload 2
      // 0d6: invokevirtual com/discord/notifications/api/NotificationData.getReceivingUserId-wUX8bhU ()Lcom/discord/primitives/UserId;
      // 0d9: astore 7
      // 0db: aload 7
      // 0dd: ifnull 0f3
      // 0e0: aload 1
      // 0e1: ldc_w "receiving_user_id"
      // 0e4: aload 7
      // 0e6: invokevirtual com/discord/primitives/UserId.unbox-impl ()J
      // 0e9: invokestatic com/discord/primitives/UserId.toString-impl (J)Ljava/lang/String;
      // 0ec: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0ef: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 0f2: pop
      // 0f3: aload 2
      // 0f4: invokevirtual com/discord/notifications/api/NotificationData.getMessageId-N_6c4I0 ()Ljava/lang/String;
      // 0f7: astore 7
      // 0f9: aload 7
      // 0fb: ifnull 114
      // 0fe: aload 1
      // 0ff: ldc_w "message_id"
      // 102: aload 7
      // 104: invokestatic com/discord/primitives/MessageId.box-impl (Ljava/lang/String;)Lcom/discord/primitives/MessageId;
      // 107: invokevirtual com/discord/primitives/MessageId.unbox-impl ()Ljava/lang/String;
      // 10a: invokestatic com/discord/primitives/MessageId.toString-impl (Ljava/lang/String;)Ljava/lang/String;
      // 10d: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 110: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 113: pop
      // 114: aload 2
      // 115: invokevirtual com/discord/notifications/api/NotificationData.getMessageType ()Ljava/lang/Integer;
      // 118: astore 7
      // 11a: aload 7
      // 11c: ifnull 132
      // 11f: aload 1
      // 120: ldc_w "message_type"
      // 123: aload 7
      // 125: invokevirtual java/lang/Number.intValue ()I
      // 128: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12b: invokestatic qb/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 12e: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 131: pop
      // 132: aload 2
      // 133: invokevirtual com/discord/notifications/api/NotificationData.getGuildId-qOKuAAo ()Lcom/discord/primitives/GuildId;
      // 136: astore 7
      // 138: aload 7
      // 13a: ifnull 150
      // 13d: aload 1
      // 13e: ldc_w "guild_id"
      // 141: aload 7
      // 143: invokevirtual com/discord/primitives/GuildId.unbox-impl ()J
      // 146: invokestatic com/discord/primitives/GuildId.toString-impl (J)Ljava/lang/String;
      // 149: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 14c: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 14f: pop
      // 150: aload 2
      // 151: invokevirtual com/discord/notifications/api/NotificationData.getChannelId-qMVnFVQ ()Lcom/discord/primitives/ChannelId;
      // 154: astore 7
      // 156: aload 7
      // 158: ifnull 16e
      // 15b: aload 1
      // 15c: ldc_w "channel_id"
      // 15f: aload 7
      // 161: invokevirtual com/discord/primitives/ChannelId.unbox-impl ()J
      // 164: invokestatic com/discord/primitives/ChannelId.toString-impl (J)Ljava/lang/String;
      // 167: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 16a: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 16d: pop
      // 16e: aload 2
      // 16f: invokevirtual com/discord/notifications/api/NotificationData.getChannelType ()Ljava/lang/Integer;
      // 172: astore 7
      // 174: aload 7
      // 176: ifnull 18c
      // 179: aload 1
      // 17a: ldc_w "channel_type"
      // 17d: aload 7
      // 17f: invokevirtual java/lang/Number.intValue ()I
      // 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 185: invokestatic qb/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 188: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 18b: pop
      // 18c: aload 2
      // 18d: invokevirtual com/discord/notifications/api/NotificationData.getRelationshipType ()Ljava/lang/Integer;
      // 190: astore 7
      // 192: aload 7
      // 194: ifnull 1aa
      // 197: aload 1
      // 198: ldc_w "rel_type"
      // 19b: aload 7
      // 19d: invokevirtual java/lang/Number.intValue ()I
      // 1a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a3: invokestatic qb/g.c (Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1a6: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1a9: pop
      // 1aa: aload 2
      // 1ab: invokevirtual com/discord/notifications/api/NotificationData.getMentionType ()Ljava/lang/String;
      // 1ae: astore 7
      // 1b0: aload 7
      // 1b2: ifnull 1c2
      // 1b5: aload 1
      // 1b6: ldc_w "mention_type"
      // 1b9: aload 7
      // 1bb: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1be: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1c1: pop
      // 1c2: aload 2
      // 1c3: invokevirtual com/discord/notifications/api/NotificationData.getAppState ()Ljava/lang/String;
      // 1c6: astore 2
      // 1c7: aload 2
      // 1c8: ifnull 1d7
      // 1cb: aload 1
      // 1cc: ldc_w "app_state"
      // 1cf: aload 2
      // 1d0: invokestatic qb/g.d (Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1d3: invokevirtual qb/p.b (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
      // 1d6: pop
      // 1d7: aload 1
      // 1d8: invokevirtual qb/p.a ()Lkotlinx/serialization/json/JsonObject;
      // 1db: astore 2
      // 1dc: new java/io/FileOutputStream
      // 1df: astore 7
      // 1e1: aload 7
      // 1e3: aload 6
      // 1e5: bipush 1
      // 1e6: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;Z)V
      // 1e9: new java/io/BufferedOutputStream
      // 1ec: astore 1
      // 1ed: aload 1
      // 1ee: aload 7
      // 1f0: sipush 8192
      // 1f3: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;I)V
      // 1f6: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 1f9: astore 6
      // 1fb: aload 6
      // 1fd: invokeinterface mb/f.a ()Lsb/b; 1
      // 202: pop
      // 203: aload 6
      // 205: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 208: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 20b: aload 2
      // 20c: invokeinterface mb/n.c (Lmb/i;Ljava/lang/Object;)Ljava/lang/String; 3
      // 211: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 214: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 217: astore 2
      // 218: aload 2
      // 219: ldc_w "getBytes(...)"
      // 21c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 21f: aload 1
      // 220: aload 2
      // 221: invokevirtual java/io/OutputStream.write ([B)V
      // 224: aload 1
      // 225: bipush 10
      // 227: invokevirtual java/io/BufferedOutputStream.write (I)V
      // 22a: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 22d: astore 2
      // 22e: aload 1
      // 22f: aconst_null
      // 230: invokestatic K9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 233: goto 260
      // 236: astore 6
      // 238: aload 6
      // 23a: athrow
      // 23b: astore 2
      // 23c: aload 1
      // 23d: aload 6
      // 23f: invokestatic K9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 242: aload 2
      // 243: athrow
      // 244: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 247: astore 6
      // 249: ldc com/discord/notifications/client/NotificationClient
      // 24b: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 24e: astore 2
      // 24f: aload 2
      // 250: ldc_w "getSimpleName(...)"
      // 253: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 256: aload 6
      // 258: aload 2
      // 259: ldc_w "Error appending notification to cache file"
      // 25c: aload 1
      // 25d: invokevirtual com/discord/logging/Log.e (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 260: aload 0
      // 261: monitorexit
      // 262: return
      // 263: aload 0
      // 264: monitorexit
      // 265: aload 1
      // 266: athrow
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
      val var9: CrashReporting = CrashReporting.INSTANCE;
      val var11: Pair = s.a("type", var2.getType());
      val var12: Pair = s.a("channelId", java.lang.String.valueOf(var2.getChannelId-qMVnFVQ()));
      var var8: java.lang.String = var2.getMessageId-N_6c4I0();
      var var10: java.lang.String = "null";
      if (var8 == null) {
         var8 = "null";
      } else {
         var8 = MessageId.toString-impl(var8);
      }

      CrashReporting.addBreadcrumb$default(
         var9, "Kotlin NotificationClient received Notification.", L.l(new Pair[]{var11, var12, s.a("messageId", var8)}), null, 4, null
      );
      if (this.cache.isAuthed(var1)) {
         val var82: SilentNotificationManager = SilentNotificationManager.Companion.get(var1);
         if (var2.getType() == "CHANNEL_ACK") {
            this.renderer.handleAcks(var1, var2);
            var82.handleAcks(var2);
         } else if (var2.getType() == "CALL_RING_END") {
            this.renderer.handleCallRingEnd(var1, var2.getAckChannelIds());
         } else if (var2.getType() == "CALL_ACK") {
            this.renderer.handleCallAck(var1, var2.getAckChannelIds());
         } else {
            if (this.shouldDisplayNotification.invoke() as java.lang.Boolean || var2.getType() == "CALL_RING") {
               var var7: Boolean;
               try {
                  var7 = var82.shouldDisplayNotification(var2);
                  var70 = var2.getReceivingUserId-wUX8bhU();
               } catch (var33: Exception) {
                  val var34: Log = Log.INSTANCE;
                  val var50: java.lang.String = NotificationClient.class.getSimpleName();
                  var34.e(var50, "Unable to display notification", var33);
                  return;
               }

               label138: {
                  if (var70 != null) {
                     try {
                        var73 = UserId.toString-impl(var70.unbox-impl());
                     } catch (var32: Exception) {
                        val var35: Log = Log.INSTANCE;
                        val var51: java.lang.String = NotificationClient.class.getSimpleName();
                        var35.e(var51, "Unable to display notification", var32);
                        return;
                     }

                     var8 = var73;
                     if (var73 != null) {
                        break label138;
                     }
                  }

                  try {
                     var8 = this.cache.getCurrentUserId(var1);
                  } catch (var31: Exception) {
                     val var36: Log = Log.INSTANCE;
                     val var52: java.lang.String = NotificationClient.class.getSimpleName();
                     var36.e(var52, "Unable to display notification", var31);
                     return;
                  }
               }

               if (var8 != null) {
                  var var5: Long;
                  var var13: java.lang.String;
                  var var14: PushNotificationMonitor;
                  var var15: java.lang.String;
                  try {
                     var14 = PushNotificationMonitor.INSTANCE;
                     var13 = var2.getType();
                     var5 = System.currentTimeMillis();
                     var15 = NotificationDataUtilsKt.getTitle(var2, var1).toString();
                     var74 = NotificationDataUtilsKt.getContent(var2, var1, true);
                  } catch (var30: Exception) {
                     val var37: Log = Log.INSTANCE;
                     val var53: java.lang.String = NotificationClient.class.getSimpleName();
                     var37.e(var53, "Unable to display notification", var30);
                     return;
                  }

                  val var75: java.lang.String;
                  if (var74 != null) {
                     try {
                        var75 = var74.toString();
                     } catch (var29: Exception) {
                        val var38: Log = Log.INSTANCE;
                        val var54: java.lang.String = NotificationClient.class.getSimpleName();
                        var38.e(var54, "Unable to display notification", var29);
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
                     val var55: java.lang.String = NotificationClient.class.getSimpleName();
                     var39.e(var55, "Unable to display notification", var28);
                     return;
                  }

                  if (var17 != null) {
                     try {
                        var10 = MessageId.toString-impl(var17);
                     } catch (var27: Exception) {
                        val var40: Log = Log.INSTANCE;
                        val var56: java.lang.String = NotificationClient.class.getSimpleName();
                        var40.e(var56, "Unable to display notification", var27);
                        return;
                     }
                  }

                  try {
                     var14.logPushNotification(var1, var8, new PushNotificationMeta(var5, var7 xor true, var13, var15, var75, var16, var10));
                  } catch (var26: Exception) {
                     val var41: Log = Log.INSTANCE;
                     val var57: java.lang.String = NotificationClient.class.getSimpleName();
                     var41.e(var57, "Unable to display notification", var26);
                     return;
                  }
               }

               if (var7) {
                  try {
                     this.renderer.initIconUrlUtils(var1);
                     this.renderer.initFresco(var1);
                     this.renderer
                        .display(var1, var2, this.cache.getCurrentUsername(var1), var3, this.getBehaviors(var1), var4, this.shouldNotifyEveryTime(var1));
                     var82.onDisplayNotification(var2);
                  } catch (var25: Exception) {
                     val var42: Log = Log.INSTANCE;
                     val var58: java.lang.String = NotificationClient.class.getSimpleName();
                     var42.e(var58, "Unable to display notification", var25);
                     return;
                  }
               } else {
                  try {
                     var82.onSilentNotification(var2);
                  } catch (var24: Exception) {
                     val var43: Log = Log.INSTANCE;
                     val var59: java.lang.String = NotificationClient.class.getSimpleName();
                     var43.e(var59, "Unable to display notification", var24);
                     return;
                  }
               }

               try {
                  if (!(var2.getType() == "MESSAGE_CREATE")) {
                     return;
                  }

                  var72 = NotificationDataUtilsKt.getKvMessage(var2, var3.get("message") as java.lang.String);
               } catch (var23: Exception) {
                  val var44: Log = Log.INSTANCE;
                  val var60: java.lang.String = NotificationClient.class.getSimpleName();
                  var44.e(var60, "Unable to display notification", var23);
                  return;
               }

               if (var72 != null) {
                  try {
                     var76 = var2.getMessageId-N_6c4I0();
                     var78 = var2.getChannelId-qMVnFVQ();
                  } catch (var22: Exception) {
                     val var45: Log = Log.INSTANCE;
                     val var61: java.lang.String = NotificationClient.class.getSimpleName();
                     var45.e(var61, "Unable to display notification", var22);
                     return;
                  }

                  if (var76 != null && var78 != null) {
                     try {
                        val var67: Any = var3.get("receiving_user_id");
                        val var83: StringBuilder = new StringBuilder();
                        var83.append("@account.");
                        var83.append(var67);
                        var68 = var83.toString();
                        var84 = var2.getGuildId-qOKuAAo();
                     } catch (var21: Exception) {
                        val var46: Log = Log.INSTANCE;
                        val var62: java.lang.String = NotificationClient.class.getSimpleName();
                        var46.e(var62, "Unable to display notification", var21);
                        return;
                     }

                     var var63: java.lang.String = null;
                     if (var84 != null) {
                        try {
                           var63 = GuildId.toString-impl(var84.unbox-impl());
                        } catch (var20: Exception) {
                           val var47: Log = Log.INSTANCE;
                           val var64: java.lang.String = NotificationClient.class.getSimpleName();
                           var47.e(var64, "Unable to display notification", var20);
                           return;
                        }
                     }

                     try {
                        var10 = ChannelId.toString-impl(var78.unbox-impl());
                        val var77: java.lang.String = MessageId.toString-impl(var76);
                        val var81: kotlinx.serialization.json.Json.a = Json.d;
                        Json.d.a();
                        DiscordMobileApi.putMessage(var68, var63, var10, var77, var81.c(KvMessageEntry.Companion.serializer(), var72));
                     } catch (var19: Exception) {
                        val var48: Log = Log.INSTANCE;
                        val var65: java.lang.String = NotificationClient.class.getSimpleName();
                        var48.e(var65, "Unable to display notification", var19);
                        return;
                     }
                  }
               }

               try {
                  if (this.updateAndComputeIfShouldRunBackgroundSync(var1)) {
                     HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, "BackgroundSync", 30000L, false, null, true, 24, null);
                  }
               } catch (var18: Exception) {
                  val var49: Log = Log.INSTANCE;
                  val var66: java.lang.String = NotificationClient.class.getSimpleName();
                  var49.e(var66, "Unable to display notification", var18);
               }
            }
         }
      }
   }

   @JvmStatic
   fun `tokenListener$lambda$1`(var0: java.lang.String): Unit {
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
      this.renderer.handleReactionAcks(var1, var2);
   }

   public fun clearAllNotifications(context: Context) {
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
      val var3: NotificationAction.Companion = NotificationAction.Companion;
      val var7: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, ContentAction::class)) {
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
      this.renderer.initNotificationCategories(var1, var2, var3);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      return this.cache.isLightsEnabled(var1);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      return this.cache.isSoundsEnabled(var1);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      return this.cache.isVibrationsEnabled(var1);
   }

   public fun markNotificationAsDirectReply(context: Context, channelId: Long) {
      val var4: NotificationRenderer = this.renderer;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MESSAGE_CREATE");
      var5.append(var2);
      var4.markNotificationAsDirectReply(var1, var5.toString(), "", true);
   }

   public fun onDirectReplySuccess(context: Context, data: String) {
      val var4: NotificationData = DirectReplyMessage.Companion.toNotificationData(var2);
      val var5: Pair = s.a("type", var4.getType());
      val var3: Pair = s.a("channel_id", java.lang.String.valueOf(var4.getChannelId-qMVnFVQ()));
      var2 = var4.getMessageId-N_6c4I0();
      if (var2 == null) {
         var2 = "null";
      } else {
         var2 = MessageId.toString-impl(var2);
      }

      this.showNotification(var1, var4, L.l(new Pair[]{var5, var3, s.a("message_id", var2)}), false);
   }

   public fun onNotificationReceived(context: Context, data: Map<String, String>) {
      val var4: tb.a.a = tb.a.b;
      val var6: KSerializer = NotificationData.Companion.serializer();
      val var5: java.util.Map = L.x(var2);
      var5.put("time_received", java.lang.String.valueOf(System.currentTimeMillis()));
      val var3: java.lang.String;
      if (this.shouldDisplayNotification.invoke() as java.lang.Boolean) {
         var3 = "background";
      } else {
         var3 = "active";
      }

      var5.put("app_state", var3);
      val var8: NotificationData = var4.d(var6, var5) as NotificationData;
      this.appendNotificationToCacheFile(var1, var8);
      this.showNotification(var1, var8, var2, true);
   }

   public fun setCurrentUser(context: Context, username: String?, userId: String?) {
      this.cache.setCurrentUsername(var1, var2);
      this.cache.setCurrentUserId(var1, var3);
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      this.renderer.setIncomingRingtone(var1, var2);
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      this.cache.setIsAuthed(var1, var2);
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      this.cache.setLightsEnabled(var1, var2);
   }

   public fun setLocalNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      this.notificationLocalListener = var1;
   }

   public fun setNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      this.notificationListener = var1;
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      this.cache.setNotifyEveryTime(var1, var2);
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      this.cache.setSoundsEnabled(var1, var2);
   }

   public fun setToken(token: String) {
      if (!(this.token == var1)) {
         this.token = var1;
         this.tokenListener.invoke(var1);
      }
   }

   public fun setTokenListener(tokenListener: (String) -> Unit) {
      this.tokenListener = var1;
      if (this.token != null) {
         var1.invoke(this.token);
      }
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      this.cache.setVibrationsEnabled(var1, var2);
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      return this.cache.shouldNotifyEveryTime(var1);
   }

   public fun showLocalNotification(context: Context, notification: Map<String, Any>) {
      this.renderer.displayLocal(var1, var2);
   }

   public companion object {
      private const val NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS: Long
      public final val instance: NotificationClient
   }
}
