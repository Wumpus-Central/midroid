package com.discord.notifications.renderer

import android.content.Context
import android.net.Uri
import android.os.Build.VERSION
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.k
import androidx.core.app.NotificationChannelCompat.Builder
import com.discord.crash_reporting.CrashReporting
import com.discord.notifications.api.NotificationData
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import java.util.ArrayList
import java.util.LinkedHashMap
import kh.w
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import lh.r
import rh.a

internal object NotificationChannels {
   private const val BASE_CALL_CHANNEL_ID: String = "calls"

   private fun configureCallChannel(
      context: Context,
      legacyChannel: NotificationChannelCompat?,
      builder: Builder,
      ringtoneName: Int? = com.discord.sounds.R.raw.call_ringing
   ) {
      var3 = var3.j(new long[]{100L, 200L, 300L, 400L, 500L, 400L, 300L, 200L, 400L});
      val var5: Boolean;
      if (var2 != null) {
         var5 = var2.a();
      } else {
         var5 = false;
      }

      val var8: NotificationChannelCompat.Builder = var3.g(var5);
      val var10: StringBuilder = new StringBuilder();
      var10.append("android.resource://");
      val var6: java.lang.String = var1.getPackageName();
      val var7: StringBuilder = new StringBuilder();
      var7.append(var6);
      var7.append("/");
      var7.append(var4);
      var10.append(var7.toString());
      var8.h(Uri.parse(var10.toString()), new android.media.AudioAttributes.Builder().setUsage(5).setContentType(2).build());
   }

   private fun configureMediaChannel(legacyChannel: NotificationChannelCompat?, builder: Builder) {
      var var3: Boolean;
      if (var1 != null) {
         var3 = var1.a();
      } else {
         var3 = false;
      }

      var2 = var2.g(var3);
      if (var1 != null) {
         var3 = var1.g();
      } else {
         var3 = false;
      }

      var2 = var2.i(var3);
      var3 = false;
      if (var1 != null) {
         var3 = var1.f();
      }

      var2.e(var3);
   }

   private fun createNotificationChannelGroups(context: Context, localizedGroupNames: Map<String, String>): List<k> {
      val var7: Array<NotificationChannels.ChannelGroup> = NotificationChannels.ChannelGroup.values();
      val var6: ArrayList = new ArrayList(var7.length);
      val var4: Int = var7.length;

      for (int var3 = 0; var3 < var4; var3++) {
         var var10: k;
         label20: {
            val var5: NotificationChannels.ChannelGroup = var7[var3];
            if (var2.containsKey(var7[var3].getId())) {
               val var8: java.lang.CharSequence = var2.get(var5.getId()) as java.lang.CharSequence;
               if (var8 != null && !h.x(var8)) {
                  var10 = new k.c(var5.getGroupId()).c(var2.get(var5.getId()) as java.lang.CharSequence).b(var2.get(var5.getId()) as java.lang.String).a();
                  break label20;
               }
            }

            val var9: k.c = new k.c(var5.getGroupId());
            val var11: NotificationChannels.ChannelGroup.Companion = NotificationChannels.ChannelGroup.Companion;
            var10 = var9.c(NotificationChannels.ChannelGroup.Companion.defaultLabel(var5.getId())).b(var11.defaultLabel(var5.getId())).a();
         }

         var6.add(var10);
      }

      NotificationManagerUtilsKt.getNotificationManagerCompat(var1).d(var6);
      return var6;
   }

   private fun com.discord.notifications.renderer.NotificationChannels.Category.getAndDeleteLegacyNotificationChannel(context: Context): NotificationChannelCompat? {
      var var3: NotificationChannelCompat = null;

      var var5: NotificationChannelCompat;
      try {
         if (var1.getLegacyId() == null) {
            return var3;
         }

         var5 = NotificationManagerUtilsKt.getNotificationManagerCompat(var2).j(var1.getLegacyId());
      } catch (var7: Exception) {
         return null;
      }

      var3 = null;
      if (var5 != null) {
         try {
            NotificationManagerUtilsKt.getNotificationManagerCompat(var2).f(var1.getLegacyId());
         } catch (var6: Exception) {
            return null;
         }

         var3 = var5;
      }

      return var3;
   }

   private fun getCallChannel(context: Context): NotificationChannelCompat? {
      for (NotificationChannelCompat var3 : NotificationManagerUtilsKt.getNotificationManagerCompat(var1).n()) {
         val var2: java.lang.String = var3.b();
         q.g(var2, "getId(...)");
         if (h.H(var2, "calls", false, 2, null)) {
            return var3;
         }
      }

      return null;
   }

   private fun getCallChannelId(context: Context): String {
      val var3: NotificationChannelCompat = this.getCallChannel(var1);
      val var4: java.lang.String;
      if (var3 != null) {
         var4 = var3.b();
      } else {
         var4 = null;
      }

      var var2: java.lang.String = var4;
      if (var4 == null) {
         var2 = "calls";
      }

      return var2;
   }

   private fun com.discord.notifications.renderer.NotificationChannels.CallRingtone.getChannelId(): String {
      val var4: java.lang.String;
      if (NotificationChannels.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()] == 1) {
         val var3: java.lang.String = NotificationChannels.CallRingtone.Default.getId();
         val var2: StringBuilder = new StringBuilder();
         var2.append("calls_");
         var2.append(var3);
         var4 = var2.toString();
      } else {
         val var5: java.lang.String = var1.getId();
         val var6: StringBuilder = new StringBuilder();
         var6.append("calls_");
         var6.append(var5);
         var4 = var6.toString();
      }

      return var4;
   }

   private fun migrateOrCreateNotificationChannel(
      context: Context,
      category: com.discord.notifications.renderer.NotificationChannels.Category,
      brandColor: Int,
      localizedCategoryNames: Map<String, String>,
      onConfigure: (NotificationChannelCompat?, Builder) -> Unit = <unrepresentable>.INSTANCE
   ): NotificationChannelCompat? {
      val var9: NotificationChannelCompat = this.getAndDeleteLegacyNotificationChannel(var2, var1);
      if (!var4.containsKey(var2.getId())) {
         NotificationManagerUtilsKt.getNotificationManagerCompat(var1).f(var2.getId());
         return null;
      } else {
         val var10: java.lang.CharSequence = var4.get(var2.getId()) as java.lang.CharSequence;
         val var16: java.lang.String;
         if (var10 != null && !h.x(var10)) {
            var16 = var4.get(var2.getId()) as java.lang.String;
         } else {
            var16 = NotificationChannels.Category.Companion.defaultLabel(var2);
         }

         val var11: java.lang.String;
         if (NotificationChannels.WhenMappings.$EnumSwitchMapping$1[var2.ordinal()] == 1) {
            var11 = this.getCallChannelId(var1);
         } else {
            var11 = var2.getId();
         }

         val var12: NotificationChannelCompat.Builder = new NotificationChannelCompat.Builder(var11, var2.getImportance())
            .f(var16)
            .b(var16)
            .c(var2.getGroup().getGroupId());
         var var7: Boolean;
         if (var9 != null) {
            var7 = var9.a();
         } else {
            var7 = true;
         }

         val var13: NotificationChannelCompat.Builder = var12.g(var7);
         if (var9 != null) {
            var7 = var9.g();
         } else {
            var7 = true;
         }

         val var14: NotificationChannelCompat.Builder = var13.i(var7);
         var7 = true;
         if (var9 != null) {
            var7 = var9.f();
         }

         val var15: NotificationChannelCompat.Builder = var14.e(var7).d(var3);
         q.e(var15);
         var5.invoke(var9, var15);
         return var15.a();
      }
   }

   public fun NotificationData.getNotificationChannelId(context: Context): String {
      q.h(var1, "<this>");
      q.h(var2, "context");
      if (q.c(var1.getType(), "CALL_RING")) {
         return this.getCallChannelId(var2);
      } else {
         val var5: java.lang.String = var1.getType();
         switch (var5.hashCode()) {
            case -1502317553:
               if (var5.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
                  return NotificationChannels.Category.Companion.fromTrackingType(var1.getTrackingType()).getId();
               }
               break;
            case -1489275252:
               if (var5.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
                  return NotificationChannels.Category.GuildEventStart.getId();
               }
               break;
            case -1327124998:
               if (var5.equals("RELATIONSHIP_ADD")) {
                  return NotificationChannels.Category.FriendRequests.getId();
               }
               break;
            case -1263316859:
               if (var5.equals("STAGE_INSTANCE_CREATE")) {
                  return NotificationChannels.Category.StageStart.getId();
               }
               break;
            case -437641071:
               if (var5.equals("FORUM_THREAD_CREATED")) {
                  return NotificationChannels.Category.ForumThreadCreated.getId();
               }
               break;
            case -45642698:
               if (var5.equals("FRIEND_SUGGESTION_CREATE")) {
                  return NotificationChannels.Category.Social.getId();
               }
               break;
            case 998188116:
               if (var5.equals("MESSAGE_CREATE")) {
                  val var4: Int = var1.getChannelType();
                  val var6: NotificationChannels.Category;
                  if ((var4 == null || var4 != 3) && (var4 == null || var4 != 1)) {
                     var6 = NotificationChannels.Category.Messages;
                  } else {
                     var6 = NotificationChannels.Category.MessagesDirect;
                  }

                  return var6.getId();
               }
               break;
            case 1471047007:
               if (var5.equals("LOCAL_NOTIFICATION")) {
                  return NotificationChannels.Category.SystemMessages.getId();
               }
            default:
         }

         return NotificationChannels.Category.Other.getId();
      }
   }

   public fun getSilenceCallChannelId(): String {
      return NotificationChannels.Category.Social.getId();
   }

   public fun init(context: Context, localizedCategoryNames: Map<String, String>, localizedGroupNames: Map<String, String>) {
      q.h(var1, "context");
      q.h(var2, "localizedCategoryNames");
      q.h(var3, "localizedGroupNames");
      val var5: Int = ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.brand);
      val var14: java.util.List = this.createNotificationChannelGroups(var1, var3);
      val var9: Array<NotificationChannels.Category> = NotificationChannels.Category.values();
      val var8: ArrayList = new ArrayList();
      val var6: Int = var9.length;

      for (int var4 = 0; var4 < var6; var4++) {
         val var17: NotificationChannelCompat = INSTANCE.migrateOrCreateNotificationChannel(var1, var9[var4], var5, var2, new Function2(var9[var4], var1) {
            final NotificationChannels.Category $category;
            final Context $context;

            {
               super(2);
               this.$category = var1;
               this.$context = var2;
            }

            public final void invoke(NotificationChannelCompat var1, NotificationChannelCompat.Builder var2) {
               q.h(var2, "builder");
               val var3: Int = WhenMappings.$EnumSwitchMapping$0[this.$category.ordinal()];
               if (var3 != 1) {
                  if (var3 == 2) {
                     NotificationChannels.access$configureMediaChannel(NotificationChannels.INSTANCE, var1, var2);
                  }
               } else {
                  NotificationChannels.configureCallChannel$default(NotificationChannels.INSTANCE, this.$context, var1, var2, null, 8, null);
               }
            }
         });
         if (var17 != null) {
            var8.add(var17);
         }
      }

      try {
         NotificationManagerUtilsKt.getNotificationManagerCompat(var1).e(var8);
      } catch (var12: Exception) {
         val var16: CrashReporting = CrashReporting.INSTANCE;
         val var13: LinkedHashMap = new LinkedHashMap(f.c(r.d(i.v(var14, 10)), 16));

         for (k var11 : var14) {
            val var18: java.lang.String = java.lang.String.valueOf(var11.b());
            val var7: Boolean;
            if (NotificationManagerUtilsKt.getNotificationManagerCompat(var1).k(var11.a()) != null) {
               var7 = true;
            } else {
               var7 = false;
            }

            val var19: Pair = w.a(var18, java.lang.String.valueOf(var7));
            var13.put(var19.c(), var19.d());
         }

         CrashReporting.addBreadcrumb$default(var16, "Failed to create notification group or channel", var13, null, 4, null);
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var12, false, 2, null);
      }
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      q.h(var1, "context");
      q.h(var2, "name");
      if (VERSION.SDK_INT >= 26) {
         val var4: ArrayList = new ArrayList();
         val var8: NotificationChannels.CallRingtone = NotificationChannels.CallRingtone.Companion.fromName(var2);

         for (NotificationChannelCompat var5 : NotificationManagerUtilsKt.getNotificationManagerCompat(var1).n()) {
            val var6: java.lang.String = var5.b();
            q.g(var6, "getId(...)");
            if (h.H(var6, "calls", false, 2, null)) {
               q.e(var5);
               var4.add(var5);
            }
         }

         if (!var4.isEmpty()) {
            val var11: NotificationChannelCompat = var4.get(0) as NotificationChannelCompat;
            val var14: NotificationChannelCompat.Builder = new NotificationChannelCompat.Builder(this.getChannelId(var8), var11.c())
               .f(java.lang.String.valueOf(var11.d()))
               .b(java.lang.String.valueOf(var11.d()))
               .c(NotificationChannels.Category.Calls.getGroup().getGroupId())
               .i(var11.g())
               .e(var11.f())
               .d(ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.brand));
            val var13: NotificationChannels = INSTANCE;
            q.e(var14);
            var13.configureCallChannel(var1, var11, var14, var8.getResource());
            val var9: NotificationChannelCompat = var14.a();
            q.g(var9, "build(...)");

            for (NotificationChannelCompat var10 : var4) {
               NotificationManagerUtilsKt.getNotificationManagerCompat(var1).f(var10.b());
            }

            NotificationManagerUtilsKt.getNotificationManagerCompat(var1).e(i.e(var9));
         }
      }
   }

   private enum class CallRingtone(id: String, resource: Int) {
      Default("default", com.discord.sounds.R.raw.call_ringing),
      Halloween("halloween", com.discord.sounds.R.raw.call_ringing_halloween)
      public final val id: String
      public final val resource: Int
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private NotificationChannels.CallRingtone[] $VALUES;
      @JvmStatic
      public NotificationChannels.CallRingtone.Companion Companion = new NotificationChannels.CallRingtone.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<NotificationChannels.CallRingtone> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      init {
         this.id = var3;
         this.resource = var4;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun fromName(name: String): com.discord.notifications.renderer.NotificationChannels.CallRingtone {
            q.h(var1, "name");
            val var2: NotificationChannels.CallRingtone;
            if (q.c(var1, "call_ringing_halloween")) {
               var2 = NotificationChannels.CallRingtone.Halloween;
            } else {
               var2 = NotificationChannels.CallRingtone.Default;
            }

            return var2;
         }
      }
   }

   private enum class Category(id: String,
      importance: Int,
      group: com.discord.notifications.renderer.NotificationChannels.ChannelGroup,
      legacyId: String? = null
   ) {
      Calls("calls", 4, NotificationChannels.ChannelGroup.Realtime, "Calls"),
      ForumThreadCreated("forumThreadCreated", 4, NotificationChannels.ChannelGroup.Server, "Forum Post Create"),
      FriendRequests,
      GameDetection,
      GuildEventStart,
      GuildHighlights,
      MediaConnections,
      Messages,
      MessagesDirect("directMessages", 4, NotificationChannels.ChannelGroup.Social, "DirectMessages"),
      Other("default", 1, NotificationChannels.ChannelGroup.Other, null),
      OtherHighPriority,
      OtherServerNotifications,
      Polls,
      Social,
      StageStart,
      SystemMessages
      public final val group: com.discord.notifications.renderer.NotificationChannels.ChannelGroup
      public final val id: String
      public final val importance: Int
      public final val legacyId: String?
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private NotificationChannels.Category[] $VALUES;
      @JvmStatic
      public NotificationChannels.Category.Companion Companion = new NotificationChannels.Category.Companion(null);

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      @JvmStatic
      fun {
         var var0: NotificationChannels.ChannelGroup = NotificationChannels.ChannelGroup.Realtime;
         MediaConnections = new NotificationChannels.Category("mediaConnections", 3, var0, "Media Connections");
         GameDetection = new NotificationChannels.Category("gameDetection", 1, var0, "Game Detection");
         var0 = NotificationChannels.ChannelGroup.Social;
         FriendRequests = new NotificationChannels.Category("friendRequests", 4, var0, null);
         Polls = new NotificationChannels.Category("polls", 3, var0, null, 8, null);
         Social = new NotificationChannels.Category("social", 2, var0, "Social");
         var0 = NotificationChannels.ChannelGroup.Server;
         GuildEventStart = new NotificationChannels.Category("guildEventLive", 4, var0, "Guild Event Live");
         GuildHighlights = new NotificationChannels.Category("guildHighlights", 4, var0, null);
         Messages = new NotificationChannels.Category("messages", 4, var0, "Messages");
         OtherServerNotifications = new NotificationChannels.Category("other", 2, var0, "General");
         StageStart = new NotificationChannels.Category("stageLive", 4, var0, "Stage Live");
         var0 = NotificationChannels.ChannelGroup.Other;
         SystemMessages = new NotificationChannels.Category("systemMessages", 4, var0, null);
         OtherHighPriority = new NotificationChannels.Category("otherHighPriority", 4, var0, "GeneralHigh");
         val var4: Array<NotificationChannels.Category> = $values();
         $VALUES = var4;
         $ENTRIES = a.a(var4);
      }

      init {
         this.id = var3;
         this.importance = var4;
         this.group = var5;
         this.legacyId = var6;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun defaultLabel(category: com.discord.notifications.renderer.NotificationChannels.Category): String {
            q.h(var1, "category");
            var var2: java.lang.String;
            switch (NotificationChannels.Category.Companion.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()]) {
               case 1:
                  var2 = "Incoming calls";
                  break;
               case 2:
                  var2 = "Voice connected";
                  break;
               case 3:
                  var2 = "Messages";
                  break;
               case 4:
                  var2 = "Direct messages";
                  break;
               case 5:
                  var2 = "Friend requests";
                  break;
               case 6:
                  var2 = "Polls";
                  break;
               case 7:
                  var2 = "Social";
                  break;
               case 8:
                  var2 = "Game detection";
                  break;
               case 9:
                  var2 = "Stage notifications";
                  break;
               case 10:
                  var2 = "Discord system messages";
                  break;
               case 11:
                  var2 = "Forum notifications";
                  break;
               case 12:
                  var2 = "Event notifications";
                  break;
               case 13:
                  var2 = "Server highlights";
                  break;
               case 14:
                  var2 = "Other server notifications";
                  break;
               default:
                  var2 = "Other";
            }

            return var2;
         }

         public fun fromTrackingType(trackingType: String?): com.discord.notifications.renderer.NotificationChannels.Category {
            if (var1 != null) {
               switch (var1.hashCode()) {
                  case -1760014021:
                     if (var1.equals("generic_friend_request_reminder")) {
                        return NotificationChannels.Category.Social;
                     }
                     break;
                  case -1433897036:
                     if (var1.equals("suspicious_session")) {
                        return NotificationChannels.Category.SystemMessages;
                     }
                     break;
                  case -1372753926:
                     if (var1.equals("trending_content_push")) {
                        return NotificationChannels.Category.GuildHighlights;
                     }
                     break;
                  case -198753646:
                     if (var1.equals("nudge_new_friend_dm_push")) {
                        return NotificationChannels.Category.Social;
                     }
                     break;
                  case -171132358:
                     if (var1.equals("poll_ended")) {
                        return NotificationChannels.Category.Polls;
                     }
                     break;
                  case 533975599:
                     if (var1.equals("home_lifecycle_push")) {
                        return NotificationChannels.Category.OtherServerNotifications;
                     }
                     break;
                  case 1308493743:
                     if (var1.equals("GUILD_STREAM_START")) {
                        return NotificationChannels.Category.Social;
                     }
                     break;
                  case 1323738094:
                     if (var1.equals("generic_home_featured_message")) {
                        return NotificationChannels.Category.OtherServerNotifications;
                     }
                     break;
                  case 1428648131:
                     if (var1.equals("top_messages_push")) {
                        return NotificationChannels.Category.OtherServerNotifications;
                     }
                     break;
                  case 1581734347:
                     if (var1.equals("generic_missed_message")) {
                        return NotificationChannels.Category.OtherServerNotifications;
                     }
                  default:
               }
            }

            return NotificationChannels.Category.Other;
         }
      }
   }

   private enum class ChannelGroup(id: String, groupId: String) {
      Other("other", "444_other"),
      Realtime("realtime", "111_realtime"),
      Server("server", "333_server"),
      Social("social", "222_social")
      public final val groupId: String
      public final val id: String
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private NotificationChannels.ChannelGroup[] $VALUES;
      @JvmStatic
      public NotificationChannels.ChannelGroup.Companion Companion = new NotificationChannels.ChannelGroup.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<NotificationChannels.ChannelGroup> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      init {
         this.id = var3;
         this.groupId = var4;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun defaultLabel(id: String): String {
            q.h(var1, "id");
            val var2: Int = var1.hashCode();
            if (var2 != -905826493) {
               if (var2 != -897050771) {
                  if (var2 == -859198101 && var1.equals("realtime")) {
                     return "Real-time";
                  }
               } else if (var1.equals("social")) {
                  return "Social";
               }
            } else if (var1.equals("server")) {
               return "Server";
            }

            return "Other";
         }
      }
   }
}
