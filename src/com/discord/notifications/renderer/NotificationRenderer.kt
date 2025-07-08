package com.discord.notifications.renderer

import A9.q
import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build.VERSION
import android.service.notification.StatusBarNotification
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.Person
import com.discord.icons.IconUrlUtils
import com.discord.image.fresco.FrescoFetchDecodedImageKt
import com.discord.image.fresco.FrescoModuleDiscord
import com.discord.image.fresco.postprocessors.PostProcessor
import com.discord.notifications.actions.intents.ContentAction
import com.discord.notifications.actions.intents.DismissCallAction
import com.discord.notifications.api.NotificationData
import com.discord.notifications.api.NotificationDataDeserializationUtilsKt
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.shortcuts.ShortcutUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import ib.G
import java.util.ArrayList
import java.util.Comparator
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlin.jvm.internal.Ref.ObjectRef
import kotlinx.coroutines.CoroutineScope
import z9.s

public class NotificationRenderer {
   public final var fullscreenIntent: PendingIntent?
      internal set

   private fun getFullscreenIntent(context: Context, notification: NotificationData, notificationDataMap: Map<String, String>): PendingIntent? {
      val var10: Intent = new Intent(var1, IncomingCallActivity.class).addFlags(268468224);
      r.g(var10, "addFlags(...)");
      val var9: Pair = s.a("username", var2.getUserUsername());
      var var8: java.lang.String;
      if (NotificationDataUtilsKt.isCall(var2)) {
         var8 = var2.getChannelName();
      } else {
         val var11: java.lang.String = var2.getChannelName();
         var8 = var2.getGuildName();
         val var12: StringBuilder = new StringBuilder();
         var12.append(var11);
         var12.append(", ");
         var12.append(var8);
         var8 = var12.toString();
      }

      var var5: Boolean;
      label17: {
         var23 = s.a("channelName", var8);
         val var24: Int = var2.getChannelType();
         if (var24 != null) {
            val var4: Int = var24;
            var5 = true;
            if (var4 == 1) {
               break label17;
            }
         }

         var5 = false;
      }

      val var14: Pair = s.a("isDM", var5);
      val var26: Pair = s.a("userAvatar", var2.getUserAvatar());
      val var25: Pair = s.a("userDiscriminator", var2.getUserDiscriminator());
      val var15: Pair = s.a("userId", java.lang.String.valueOf(var2.getUserId-wUX8bhU()));
      val var13: Pair = s.a("guildId", java.lang.String.valueOf(var2.getGuildId-qOKuAAo()));
      val var16: Pair = s.a("userGuildAvatar", var2.getUserGuildAvatar());
      val var17: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      val var18: java.util.Map = q.x(var3);
      var18.put("type", "CALL_CONNECT");
      var18.put("is_fullscreen_call_ui", "true");
      val var27: Pair = s.a("acceptAction", new ContentAction(var17, var18));
      val var21: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      val var28: ChannelId = var2.getChannelId-qMVnFVQ();
      r.e(var28);
      val var6: Long = var28.unbox-impl();
      val var29: GuildId = var2.getGuildId-qOKuAAo();
      val var19: UserId = var2.getUserId-wUX8bhU();
      r.e(var19);
      var10.putExtras(
         D.d.a(
            var9,
            var23,
            var14,
            var26,
            var25,
            var15,
            var13,
            var16,
            var27,
            s.a("dismissAction", new DismissCallAction(var21, var6, true, var29, var19.unbox-impl(), null))
         )
      );
      return PendingIntent.getActivity(var1, 0, var10, 335544320);
   }

   public fun clear(context: Context, notificationTag: String) {
      r.h(var1, "context");
      r.h(var2, "notificationTag");
      NotificationManagerUtilsKt.getNotificationManagerCompat(var1).b(var2, 0);
   }

   public fun clearAllNotifications(context: Context) {
      r.h(var1, "context");
      NotificationManagerUtilsKt.getNotificationManagerCompat(var1).c();
   }

   public fun display(
      context: Context,
      notification: NotificationData,
      currentUsername: String?,
      notificationDataMap: Map<String, String>,
      behaviors: NotificationBehaviors?,
      makeOrUpdateShortcut: Boolean,
      notifyEveryTime: Boolean,
      showFullscreenCallUI: Boolean
   ) {
      r.h(var1, "context");
      r.h(var2, "notification");
      r.h(var4, "notificationDataMap");
      ib.f.f(
         null,
         new Function2(var2, var1, var7, var4, var5, var8, this, var3, var6, null) {
            final NotificationBehaviors $behaviors;
            final Context $context;
            final java.lang.String $currentUsername;
            final boolean $makeOrUpdateShortcut;
            final NotificationData $notification;
            final java.util.Map<java.lang.String, java.lang.String> $notificationDataMap;
            final boolean $notifyEveryTime;
            final boolean $showFullscreenCallUI;
            private Object L$0;
            int label;
            final NotificationRenderer this$0;

            {
               super(2, var10);
               this.$notification = var1;
               this.$context = var2x;
               this.$notifyEveryTime = var3x;
               this.$notificationDataMap = var4;
               this.$behaviors = var5;
               this.$showFullscreenCallUI = var6;
               this.this$0 = var7;
               this.$currentUsername = var8;
               this.$makeOrUpdateShortcut = var9;
            }

            private static final Object invokeSuspend$fetchImage(Context var0, ObjectRef var1x, java.lang.String var2x, Continuation var3x) {
               return FrescoFetchDecodedImageKt.fetchDecodedImage(var0, var2x, var1x.j as PostProcessor, true, var3x);
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(
                  this.$notification,
                  this.$context,
                  this.$notifyEveryTime,
                  this.$notificationDataMap,
                  this.$behaviors,
                  this.$showFullscreenCallUI,
                  this.this$0,
                  this.$currentUsername,
                  this.$makeOrUpdateShortcut,
                  var2
               );
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               var var7: NotificationCompat.Builder = (NotificationCompat.Builder)G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  val var9: CoroutineScope = this.L$0 as CoroutineScope;
                  val var8: ObjectRef = new ObjectRef();
                  var8.j = PostProcessor.Circle.INSTANCE;
                  val var10: ObjectRef = new ObjectRef();
                  var10.j = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
                  if (this.$notification.getImageAttachmentUrl() != null) {
                     val var6: java.lang.String = this.$notification.getImageAttachmentUrl();
                     var1 = var6;
                     if (var6 == null) {
                        var1 = "";
                     }

                     var10.j = var1;
                     var8.j = null;
                  }

                  var1 = ib.f.b(var9, null, null, new Function2(var10, this.$context, var8, null) {
                     final Context $context;
                     final ObjectRef $iconUrl;
                     final ObjectRef $postProcessor;
                     int label;

                     {
                        super(2, var4);
                        this.$iconUrl = var1;
                        this.$context = var2x;
                        this.$postProcessor = var3x;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(this.$iconUrl, this.$context, this.$postProcessor, var2);
                     }

                     public final Object invoke(CoroutineScope var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        val var4: Any = G9.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           kotlin.c.b(var1);
                        } else {
                           kotlin.c.b(var1);
                           var var3: Context = this.$context;
                           var1 = this.$postProcessor;
                           val var5: java.lang.String = this.$iconUrl.j as java.lang.String;
                           this.label = 1;
                           var3 = (Context)<unrepresentable>.access$invokeSuspend$fetchImage(var3, var1, var5, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  var var36: G = ib.f.b(var9, null, null, new Function2(this.$notification, this.$context, var8, null) {
                     final Context $context;
                     final NotificationData $notification;
                     final ObjectRef $postProcessor;
                     int label;

                     {
                        super(2, var4);
                        this.$notification = var1;
                        this.$context = var2x;
                        this.$postProcessor = var3x;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(this.$notification, this.$context, this.$postProcessor, var2);
                     }

                     public final Object invoke(CoroutineScope var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        val var4: Any = G9.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           kotlin.c.b(var1);
                        } else {
                           kotlin.c.b(var1);
                           val var5: Context = this.$context;
                           var var3: ObjectRef = this.$postProcessor;
                           var1 = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, this.$context);
                           this.label = 1;
                           var3 = (ObjectRef)<unrepresentable>.access$invokeSuspend$fetchImage(var5, var3, var1, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  this.label = 1;
                  var36 = (G)ib.d.b(new G[]{var1, var36}, this);
                  var1 = var36;
                  if (var36 === var7) {
                     return var7;
                  }
               }

               val var46: Bitmap = var1.get(0) as Bitmap;
               val var48: Bitmap = var1.get(1) as Bitmap;
               val var49: java.lang.CharSequence = NotificationDataUtilsKt.getContent(this.$notification, this.$context, false);
               val var3x: Int = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification))
                  + 1;
               val var21: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(
                     this.$context,
                     NotificationChannels.INSTANCE.getNotificationChannelId(this.$notification, this.$context),
                     NotificationManagerUtilsKt.getActiveNotification(this.$context, NotificationDataUtilsKt.getTag(this.$notification))
                  )
                  .m(true)
                  .L(this.$notifyEveryTime xor true)
                  .T(NotificationDataUtilsKt.getSmallIcon(this.$notification))
                  .s(ColorUtilsKt.getColorCompat(this.$context, com.discord.theme.R.color.brand_500))
                  .p(NotificationDataUtilsKt.getNotificationCategory(this.$notification))
                  .x(NotificationDataUtilsKt.getTitle(this.$notification, this.$context))
                  .w(var49)
                  .D(NotificationDataUtilsKt.getGroupKey(this.$notification))
                  .J(var3x)
                  .F(var46)
                  .z(NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context))
                  .v(NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap));
               r.g(var21, "setContentIntent(...)");
               var7 = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(
                     var21, this.$context, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, this.$context)
                  )
                  .h();
               val var13: NotificationData = this.$notification;
               var var4: Boolean = this.$showFullscreenCallUI;
               val var22: NotificationRenderer = this.this$0;
               val var11: Context = this.$context;
               val var12: java.util.Map = this.$notificationDataMap;
               val var39: java.lang.String = this.$currentUsername;
               val var5: Boolean = this.$makeOrUpdateShortcut;
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  if (var4 && VERSION.SDK_INT >= 26) {
                     var22.setFullscreenIntent(NotificationRenderer.access$getFullscreenIntent(var22, var11, var13, var12));
                     var7.M(1).C(var22.getFullscreenIntent(), true).m(false);
                  }

                  var1 = var13.getChannelName();
                  val var14: Pair = s.a("username", var13.getUserUsername());
                  if (!NotificationDataUtilsKt.isCall(var13)) {
                     val var16: java.lang.String = var13.getGuildName();
                     val var15: StringBuilder = new StringBuilder();
                     var15.append(var1);
                     var15.append(", ");
                     var15.append(var16);
                     var1 = var15.toString();
                  }

                  val var51: Pair = s.a("channelName", var1);
                  val var24: Int = var13.getChannelType();
                  if (var24 != null && var24 == 1) {
                     var4 = true;
                  } else {
                     var4 = false;
                  }

                  var7.c(D.d.a(var14, var51, s.a("isDM", kotlin.coroutines.jvm.internal.b.a(var4))));
               }

               if (NotificationDataUtilsKt.shouldUseMessagingStyle(var13)) {
                  val var50: Person.c = new Person.c();
                  if (var39 != null) {
                     var1 = var39;
                  } else {
                     var1 = I18nUtilsKt.i18nFormat$default(var11, I18nMessage.ME, null, 2, null);
                  }

                  label86: {
                     var40 = new NotificationCompat.MessagingStyle(var50.f((java.lang.CharSequence)var1).e("me").a())
                        .s(NotificationDataUtilsKt.getConversationTitle(var13))
                        .t(NotificationDataUtilsKt.isGroupConversation(var13));
                     val var26: Notification = NotificationManagerUtilsKt.getActiveNotification(var11, NotificationDataUtilsKt.getTag(var13));
                     if (var26 != null) {
                        val var27: NotificationCompat.MessagingStyle = NotificationManagerUtilsKt.getMessagingStyle(var26);
                        if (var27 != null) {
                           var1 = var27.q();
                           if (var1 != null) {
                              var1 = kotlin.collections.i.V0(var1);
                              if (var1 != null) {
                                 break label86;
                              }
                           }
                        }
                     }

                     var1 = new ArrayList();
                  }

                  var1.add(
                     new NotificationCompat.MessagingStyle.d(
                        var49, NotificationDataUtilsKt.getSendTime(var13), NotificationDataUtilsKt.getSenderForMessageNotification(var13, var48)
                     )
                  );
                  if (var1.size() > 1) {
                     kotlin.collections.i.z(var1, new Comparator() {
                        @Override
                        public final int compare(T var1, T var2x) {
                           return D9.a.d((var1 as NotificationCompat.MessagingStyle.d).i(), (var2x as NotificationCompat.MessagingStyle.d).i());
                        }
                     });
                  }

                  val var30: java.util.Iterator = var1.iterator();

                  while (var30.hasNext()) {
                     var40.o(var30.next() as NotificationCompat.MessagingStyle.d);
                  }

                  var7.Y(var40);
                  if (var5) {
                     r.e(var7);
                     ShortcutUtilsKt.addShortcut(var7, var11, NotificationDataUtilsKt.getShortcutInfo(var13, var11, var12, var46, var48));
                  }
               } else if (NotificationDataUtilsKt.shouldUseBigText(var13)) {
                  var7.Y(new NotificationCompat.f().o(var49));
               }

               val var31: NotificationCompat.Action = NotificationDataUtilsKt.getMarkAsReadAction(var13, var11);
               val var41: NotificationCompat.Action = NotificationDataUtilsKt.getDirectReplyAction(var13, var11);
               var var34: Byte = 0;
               val var42: java.util.List = kotlin.collections.i.n(
                  new NotificationCompat.Action[]{
                     var31,
                     var41,
                     NotificationDataUtilsKt.getCallAction(var13, var11, false, var12),
                     NotificationDataUtilsKt.getCallAction(var13, var11, true, var12),
                     NotificationDataUtilsKt.getTimedMuteAction(var13, var11, var3x),
                     NotificationDataUtilsKt.getBotDMMuteAction(var13, var11)
                  }
               );
               val var32: ArrayList = new ArrayList();
               val var47: java.util.Iterator = var42.iterator();

               while (var47.hasNext()) {
                  val var43: NotificationCompat.Builder = var7.b(var47.next() as NotificationCompat.Action);
                  if (var43 != null) {
                     var32.add(var43);
                  }
               }

               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  var34 = 4;
               }

               val var44: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context);
               val var33: java.lang.String = NotificationDataUtilsKt.getTag(this.$notification);
               r.e(var7);
               NotificationManagerUtilsKt.notify(var44, var33, var7, var34);
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   public fun displayLocal(context: Context, notification: Map<String, Any>) {
      r.h(var1, "context");
      r.h(var2, "notification");
      ib.f.f(
         null,
         new Function2(var2, var1, null) {
            final Context $context;
            final java.util.Map<java.lang.String, Object> $notification;
            int label;

            {
               super(2, var3);
               this.$notification = var1;
               this.$context = var2x;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$notification, this.$context, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               G9.b.e();
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  var1 = NotificationDataDeserializationUtilsKt.localNotificationData(NotificationData.Companion, this.$notification);
                  val var2x: java.util.Map = q.x(var1.getUserInfo());

                  for (Entry var5 : this.$notification.entrySet()) {
                     val var4: java.lang.String = var5.getKey() as java.lang.String;
                     val var11: Any = var5.getValue();
                     if (var11 is java.lang.String) {
                        var2x.put(var4, var11);
                     }
                  }

                  val var10: NotificationCompat.Builder = new NotificationCompat.Builder(
                        this.$context, NotificationChannels.INSTANCE.getNotificationChannelId(var1, this.$context)
                     )
                     .T(NotificationDataUtilsKt.getSmallIcon(var1))
                     .s(ColorUtilsKt.getColorCompat(this.$context, com.discord.theme.R.color.brand_500))
                     .p(NotificationDataUtilsKt.getNotificationCategory(var1))
                     .x(var1.getTitle())
                     .w(var1.getSubtitle())
                     .D(NotificationDataUtilsKt.getGroupKey(var1))
                     .S(var1.getSilent())
                     .M(0)
                     .v(NotificationDataUtilsKt.getContentPendingIntent(var1, this.$context, var2x))
                     .m(true);
                  val var8: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context);
                  val var7: java.lang.String = NotificationDataUtilsKt.getTag(var1);
                  r.e(var10);
                  NotificationManagerUtilsKt.notify$default(var8, var7, var10, 0, 4, null);
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         1,
         null
      );
   }

   public fun handleAcks(context: Context, notification: NotificationData) {
      r.h(var1, "context");
      r.h(var2, "notification");
      val var3: java.util.Iterator = var2.getAckChannelIds().iterator();

      while (var3.hasNext()) {
         var var4: java.lang.String = ChannelId.toString-impl((var3.next() as ChannelId).unbox-impl());
         val var5: StringBuilder = new StringBuilder();
         var5.append("MESSAGE_CREATE");
         var5.append(var4);
         var4 = var5.toString();
         val var7: NotificationChannels = NotificationChannels.INSTANCE;
         if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(
               var1, NotificationChannels.INSTANCE.getNotificationChannelId(var2, var1), NotificationManagerUtilsKt.getActiveNotification(var1, var4)
            )
            .i()
            .getBoolean("ignoreAck", false)) {
            this.clear(var1, var4);
         } else {
            this.markNotificationAsDirectReply(var1, var4, var7.getNotificationChannelId(var2, var1), false);
         }
      }
   }

   public fun handleCallAck(context: Context, channelIds: List<ChannelId?>) {
      r.h(var1, "context");
      r.h(var2, "channelIds");
      if (VERSION.SDK_INT >= 26 && !var2.isEmpty()) {
         for (ChannelId var3 : var2) {
            if (var3 != null) {
               val var6: java.util.List = NotificationManagerUtilsKt.getCallNotifications-mJqaSGE(var1, var3.unbox-impl());
               if (var6 != null) {
                  val var4: java.util.Iterator = var6.iterator();

                  while (var4.hasNext()) {
                     val var7: java.lang.String = (var4.next() as StatusBarNotification).getTag();
                     r.g(var7, "getTag(...)");
                     this.clear(var1, var7);
                  }
               }

               val var8: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
               if (IncomingCallActivity.Companion.getSelfIntent() != null) {
                  val var9: AppCompatActivity = var8.getSelfIntent();
                  r.e(var9);
                  var9.finishAndRemoveTask();
               }
            }
         }
      }
   }

   public fun handleCallRingEnd(context: Context, channelIds: List<ChannelId?>) {
      r.h(var1, "context");
      r.h(var2, "channelIds");
      if (VERSION.SDK_INT >= 26 && !var2.isEmpty()) {
         for (ChannelId var9 : var2) {
            if (var9 != null) {
               var2 = NotificationManagerUtilsKt.getCallNotifications-mJqaSGE(var1, var9.unbox-impl());
               if (var2 != null) {
                  for (StatusBarNotification var7 : var2) {
                     var var3: java.lang.String = var7.getNotification().extras.getString("username");
                     if (var3 == null) {
                        return;
                     }

                     var var11: java.lang.String = var7.getNotification().extras.getString("channelName");
                     val var8: java.lang.String = NotificationDataUtilsKt.getMissedCallText(var1, var3, var7.getNotification().extras.getBoolean("isDM"));
                     val var6: java.lang.String = j.a(var7.getNotification());
                     r.g(var6, "getChannelId(...)");
                     val var16: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var6, var7.getNotification());
                     val var17: NotificationCompat.Builder = var16.q(NotificationChannels.INSTANCE.getSilenceCallChannelId()).w(var8);
                     if (var11 == null) {
                        var11 = var3;
                     }

                     var17.x(var11).h();
                     val var12: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(var1);
                     var3 = var7.getTag();
                     r.g(var3, "getTag(...)");
                     NotificationManagerUtilsKt.notify$default(var12, var3, var16, 0, 4, null);
                  }
               }

               val var13: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
               if (IncomingCallActivity.Companion.getSelfIntent() != null) {
                  val var14: AppCompatActivity = var13.getSelfIntent();
                  r.e(var14);
                  var14.finishAndRemoveTask();
               }
            }
         }
      }
   }

   public fun handleReactionAcks(context: Context, channelId: String) {
      r.h(var1, "context");
      r.h(var2, "channelId");
      if (VERSION.SDK_INT >= 26) {
         val var5: java.util.List = NotificationManagerUtilsKt.getActiveReactionNotifications(var1, var2);
         if (var5 != null) {
            for (StatusBarNotification var4 : var5) {
               var var3: java.lang.String = j.a(var4.getNotification());
               r.g(var3, "getChannelId(...)");
               if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var3, var4.getNotification()).i().getBoolean("ignoreAck", false)) {
                  var3 = var4.getTag();
                  r.g(var3, "getTag(...)");
                  this.clear(var1, var3);
               }
            }
         }
      }
   }

   public fun initFresco(context: Context) {
      r.h(var1, "context");
      FrescoModuleDiscord.Companion.initializeFresco(var1);
   }

   public fun initIconUrlUtils(context: Context) {
      r.h(var1, "context");
      IconUrlUtils.init$default(IconUrlUtils.INSTANCE, var1, null, null, 6, null);
   }

   public fun initNotificationCategories(context: Context, localizedCategoryNames: Map<String, String>, localizedGroupNames: Map<String, String>) {
      r.h(var1, "context");
      r.h(var2, "localizedCategoryNames");
      r.h(var3, "localizedGroupNames");
      NotificationChannels.INSTANCE.init(var1, var2, var3);
   }

   public fun markNotificationAsDirectReply(context: Context, tag: String, channelId: String, shouldIgnoreAck: Boolean) {
      r.h(var1, "context");
      r.h(var2, "tag");
      r.h(var3, "channelId");
      val var5: Notification = NotificationManagerUtilsKt.getActiveNotification(var1, var2);
      if (var5 != null) {
         val var7: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var3, var5).c(D.d.a(s.a("ignoreAck", var4)));
         val var6: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(var1);
         r.e(var7);
         NotificationManagerUtilsKt.notify$default(var6, var2, var7, 0, 4, null);
      }
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      r.h(var1, "context");
      r.h(var2, "name");
      NotificationChannels.INSTANCE.setIncomingRingtone(var1, var2);
   }

   public companion object {
      public const val IGNORE_ACK_KEY: String
      public const val USERNAME: String
      public const val CHANNEL_NAME: String
      public const val IS_DM: String
   }
}
