package com.discord.notifications.renderer

import X9.G
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
import java.util.ArrayList
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.ObjectRef
import kotlinx.coroutines.CoroutineScope
import o8.s
import o8.w

public class NotificationRenderer {
   public final var fullscreenIntent: PendingIntent?
      internal set

   private fun getFullscreenIntent(context: Context, notification: NotificationData, notificationDataMap: Map<String, String>): PendingIntent? {
      val var9: Intent = new Intent(var1, IncomingCallActivity.class).addFlags(268468224);
      q.g(var9, "addFlags(...)");
      val var10: Pair = w.a("username", var2.getUserUsername());
      var var8: java.lang.String;
      if (NotificationDataUtilsKt.isCall(var2)) {
         var8 = var2.getChannelName();
      } else {
         var8 = var2.getChannelName();
         val var12: java.lang.String = var2.getGuildName();
         val var11: StringBuilder = new StringBuilder();
         var11.append(var8);
         var11.append(", ");
         var11.append(var12);
         var8 = var11.toString();
      }

      var var5: Boolean;
      label17: {
         var23 = w.a("channelName", var8);
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

      val var14: Pair = w.a("isDM", var5);
      val var16: Pair = w.a("userAvatar", var2.getUserAvatar());
      val var25: Pair = w.a("userDiscriminator", var2.getUserDiscriminator());
      val var15: Pair = w.a("userId", java.lang.String.valueOf(var2.getUserId-wUX8bhU()));
      val var13: Pair = w.a("guildId", java.lang.String.valueOf(var2.getGuildId-qOKuAAo()));
      val var26: Pair = w.a("userGuildAvatar", var2.getUserGuildAvatar());
      val var17: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      var3 = p8.q.x(var3);
      var3.put("type", "CALL_CONNECT");
      var3.put("is_fullscreen_call_ui", "true");
      val var27: Pair = w.a("acceptAction", new ContentAction(var17, var3));
      val var21: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      val var28: ChannelId = var2.getChannelId-qMVnFVQ();
      q.e(var28);
      val var6: Long = var28.unbox-impl();
      val var29: GuildId = var2.getGuildId-qOKuAAo();
      val var19: UserId = var2.getUserId-wUX8bhU();
      q.e(var19);
      var9.putExtras(
         androidx.core.os.d.a(
            var10,
            var23,
            var14,
            var16,
            var25,
            var15,
            var13,
            var26,
            var27,
            w.a("dismissAction", new DismissCallAction(var21, var6, true, var29, var19.unbox-impl(), null))
         )
      );
      return PendingIntent.getActivity(var1, 0, var9, 335544320);
   }

   public fun clear(context: Context, notificationTag: String) {
      q.h(var1, "context");
      q.h(var2, "notificationTag");
      NotificationManagerUtilsKt.getNotificationManagerCompat(var1).b(var2, 0);
   }

   public fun clearAllNotifications(context: Context) {
      q.h(var1, "context");
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
      q.h(var1, "context");
      q.h(var2, "notification");
      q.h(var4, "notificationDataMap");
      X9.f.f(
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
               var var7: NotificationCompat.Builder = (NotificationCompat.Builder)v8.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  s.b(var1);
               } else {
                  s.b(var1);
                  val var8: CoroutineScope = this.L$0 as CoroutineScope;
                  val var9: ObjectRef = new ObjectRef();
                  var9.j = PostProcessor.Circle.INSTANCE;
                  val var10: ObjectRef = new ObjectRef();
                  var10.j = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
                  if (this.$notification.getImageAttachmentUrl() != null) {
                     val var6: java.lang.String = this.$notification.getImageAttachmentUrl();
                     var1 = var6;
                     if (var6 == null) {
                        var1 = "";
                     }

                     var10.j = var1;
                     var9.j = null;
                  }

                  var1 = X9.f.b(var8, null, null, new Function2(var10, this.$context, var9, null) {
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
                        val var4: Any = v8.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           s.b(var1);
                        } else {
                           s.b(var1);
                           var1 = this.$context;
                           var var3: ObjectRef = this.$postProcessor;
                           val var5: java.lang.String = this.$iconUrl.j as java.lang.String;
                           this.label = 1;
                           var3 = (ObjectRef)<unrepresentable>.access$invokeSuspend$fetchImage(var1, var3, var5, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  var var31: G = X9.f.b(var8, null, null, new Function2(this.$notification, this.$context, var9, null) {
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
                        val var4: Any = v8.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           s.b(var1);
                        } else {
                           s.b(var1);
                           var var3: Context = this.$context;
                           var1 = this.$postProcessor;
                           val var5: java.lang.String = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, this.$context);
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
                  this.label = 1;
                  var31 = (G)X9.d.b(new G[]{var1, var31}, this);
                  var1 = var31;
                  if (var31 === var7) {
                     return var7;
                  }
               }

               val var43: Bitmap = (var1 as java.util.List).get(0) as Bitmap;
               val var45: Bitmap = (var1 as java.util.List).get(1) as Bitmap;
               val var46: java.lang.CharSequence = NotificationDataUtilsKt.getContent(this.$notification, this.$context, false);
               val var3x: Int = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification))
                  + 1;
               var var33: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(
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
                  .w(var46)
                  .D(NotificationDataUtilsKt.getGroupKey(this.$notification))
                  .J(var3x)
                  .F(var43)
                  .z(NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context))
                  .v(NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap));
               q.g(var33, "setContentIntent(...)");
               var7 = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(
                     var33, this.$context, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, this.$context)
                  )
                  .h();
               val var13: NotificationData = this.$notification;
               var var4: Boolean = this.$showFullscreenCallUI;
               val var22: NotificationRenderer = this.this$0;
               val var12: Context = this.$context;
               val var11: java.util.Map = this.$notificationDataMap;
               val var34: java.lang.String = this.$currentUsername;
               val var5: Boolean = this.$makeOrUpdateShortcut;
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  if (var4 && VERSION.SDK_INT >= 26) {
                     var22.setFullscreenIntent(NotificationRenderer.access$getFullscreenIntent(var22, var12, var13, var11));
                     var7.M(1).C(var22.getFullscreenIntent(), true).m(false);
                  }

                  var1 = var13.getChannelName();
                  val var14: Pair = w.a("username", var13.getUserUsername());
                  if (!NotificationDataUtilsKt.isCall(var13)) {
                     val var16: java.lang.String = var13.getGuildName();
                     val var15: StringBuilder = new StringBuilder();
                     var15.append(var1);
                     var15.append(", ");
                     var15.append(var16);
                     var1 = var15.toString();
                  }

                  val var48: Pair = w.a("channelName", var1);
                  val var24: Int = var13.getChannelType();
                  if (var24 != null && var24 == 1) {
                     var4 = true;
                  } else {
                     var4 = false;
                  }

                  var7.c(androidx.core.os.d.a(var14, var48, w.a("isDM", kotlin.coroutines.jvm.internal.b.a(var4))));
               }

               if (NotificationDataUtilsKt.shouldUseMessagingStyle(var13)) {
                  val var47: Person.c = new Person.c();
                  if (var34 != null) {
                     var1 = var34;
                  } else {
                     var1 = I18nUtilsKt.i18nFormat$default(var12, I18nMessage.ME, null, 2, null);
                  }

                  val var26: NotificationCompat.MessagingStyle = new NotificationCompat.MessagingStyle(var47.f((java.lang.CharSequence)var1).e("me").a())
                     .t(NotificationDataUtilsKt.getConversationTitle(var13))
                     .u(NotificationDataUtilsKt.isGroupConversation(var13));
                  val var35: Notification = NotificationManagerUtilsKt.getActiveNotification(var12, NotificationDataUtilsKt.getTag(var13));
                  if (var35 != null) {
                     val var36: NotificationCompat.MessagingStyle = NotificationManagerUtilsKt.getMessagingStyle(var35);
                     if (var36 != null) {
                        val var37: java.util.List = var36.r();
                        if (var37 != null) {
                           val var38: java.util.Iterator = var37.iterator();

                           while (var38.hasNext()) {
                              var26.o(var38.next() as NotificationCompat.MessagingStyle.d);
                           }
                        }
                     }
                  }

                  var26.p(var46, NotificationDataUtilsKt.getSendTime(var13), NotificationDataUtilsKt.getSenderForMessageNotification(var13, var45));
                  var7.Y(var26);
                  if (var5) {
                     q.e(var7);
                     ShortcutUtilsKt.addShortcut(var7, var12, NotificationDataUtilsKt.getShortcutInfo(var13, var12, var11, var43, var45));
                  }
               } else if (NotificationDataUtilsKt.shouldUseBigText(var13)) {
                  var7.Y(new NotificationCompat.f().o(var46));
               }

               val var27: NotificationCompat.Action = NotificationDataUtilsKt.getMarkAsReadAction(var13, var12);
               val var39: NotificationCompat.Action = NotificationDataUtilsKt.getDirectReplyAction(var13, var12);
               var var29: Byte = 0;
               val var40: java.util.List = i.n(
                  new NotificationCompat.Action[]{
                     var27,
                     var39,
                     NotificationDataUtilsKt.getCallAction(var13, var12, false, var11),
                     NotificationDataUtilsKt.getCallAction(var13, var12, true, var11),
                     NotificationDataUtilsKt.getTimedMuteAction(var13, var12, var3x),
                     NotificationDataUtilsKt.getBotDMMuteAction(var13, var12)
                  }
               );
               val var28: ArrayList = new ArrayList();
               val var44: java.util.Iterator = var40.iterator();

               while (var44.hasNext()) {
                  var33 = var7.b(var44.next() as NotificationCompat.Action);
                  if (var33 != null) {
                     var28.add(var33);
                  }
               }

               q.g(var7, "also(...)");
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  var29 = 4;
               }

               NotificationManagerUtilsKt.notify(
                  NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), var7, var29
               );
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   public fun displayLocal(context: Context, notification: Map<String, Any>) {
      q.h(var1, "context");
      q.h(var2, "notification");
      X9.f.f(
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
               v8.b.e();
               if (this.label == 0) {
                  s.b(var1);
                  var1 = NotificationDataDeserializationUtilsKt.localNotificationData(NotificationData.Companion, this.$notification);
                  val var2x: java.util.Map = p8.q.x(var1.getUserInfo());

                  for (Entry var5 : this.$notification.entrySet()) {
                     val var3: java.lang.String = var5.getKey() as java.lang.String;
                     val var9: Any = var5.getValue();
                     if (var9 is java.lang.String) {
                        var2x.put(var3, var9);
                     }
                  }

                  val var7: NotificationCompat.Builder = new NotificationCompat.Builder(
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
                  q.g(var7, "setAutoCancel(...)");
                  NotificationManagerUtilsKt.notify$default(
                     NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(var1), var7, 0, 4, null
                  );
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
      q.h(var1, "context");
      q.h(var2, "notification");
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
      q.h(var1, "context");
      q.h(var2, "channelIds");
      if (VERSION.SDK_INT >= 26 && !var2.isEmpty()) {
         for (ChannelId var3 : var2) {
            if (var3 != null) {
               val var6: java.util.List = NotificationManagerUtilsKt.getCallNotifications-mJqaSGE(var1, var3.unbox-impl());
               if (var6 != null) {
                  val var4: java.util.Iterator = var6.iterator();

                  while (var4.hasNext()) {
                     val var7: java.lang.String = (var4.next() as StatusBarNotification).getTag();
                     q.g(var7, "getTag(...)");
                     this.clear(var1, var7);
                  }
               }

               val var8: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
               if (IncomingCallActivity.Companion.getSelfIntent() != null) {
                  val var9: AppCompatActivity = var8.getSelfIntent();
                  q.e(var9);
                  var9.finishAndRemoveTask();
               }
            }
         }
      }
   }

   public fun handleCallRingEnd(context: Context, channelIds: List<ChannelId?>) {
      q.h(var1, "context");
      q.h(var2, "channelIds");
      if (VERSION.SDK_INT >= 26 && !var2.isEmpty()) {
         for (ChannelId var9 : var2) {
            if (var9 != null) {
               var2 = NotificationManagerUtilsKt.getCallNotifications-mJqaSGE(var1, var9.unbox-impl());
               if (var2 != null) {
                  for (StatusBarNotification var6 : var2) {
                     var var11: java.lang.String = var6.getNotification().extras.getString("username");
                     if (var11 == null) {
                        return;
                     }

                     q.e(var11);
                     var var3: java.lang.String = var6.getNotification().extras.getString("channelName");
                     val var8: java.lang.String = NotificationDataUtilsKt.getMissedCallText(var1, var11, var6.getNotification().extras.getBoolean("isDM"));
                     val var7: java.lang.String = h.a(var6.getNotification());
                     q.g(var7, "getChannelId(...)");
                     val var16: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var7, var6.getNotification());
                     val var17: NotificationCompat.Builder = var16.q(NotificationChannels.INSTANCE.getSilenceCallChannelId()).w(var8);
                     if (var3 != null) {
                        var11 = var3;
                     }

                     var17.x(var11).h();
                     val var12: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(var1);
                     var3 = var6.getTag();
                     q.g(var3, "getTag(...)");
                     NotificationManagerUtilsKt.notify$default(var12, var3, var16, 0, 4, null);
                  }
               }

               val var13: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
               if (IncomingCallActivity.Companion.getSelfIntent() != null) {
                  val var14: AppCompatActivity = var13.getSelfIntent();
                  q.e(var14);
                  var14.finishAndRemoveTask();
               }
            }
         }
      }
   }

   public fun handleReactionAcks(context: Context, channelId: String) {
      q.h(var1, "context");
      q.h(var2, "channelId");
      if (VERSION.SDK_INT >= 26) {
         val var5: java.util.List = NotificationManagerUtilsKt.getActiveReactionNotifications(var1, var2);
         if (var5 != null) {
            for (StatusBarNotification var3 : var5) {
               val var4: java.lang.String = h.a(var3.getNotification());
               q.g(var4, "getChannelId(...)");
               if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var4, var3.getNotification()).i().getBoolean("ignoreAck", false)) {
                  val var7: java.lang.String = var3.getTag();
                  q.g(var7, "getTag(...)");
                  this.clear(var1, var7);
               }
            }
         }
      }
   }

   public fun initFresco(context: Context) {
      q.h(var1, "context");
      FrescoModuleDiscord.Companion.initializeFresco(var1);
   }

   public fun initIconUrlUtils(context: Context) {
      q.h(var1, "context");
      IconUrlUtils.init$default(IconUrlUtils.INSTANCE, var1, null, null, 6, null);
   }

   public fun initNotificationCategories(context: Context, localizedCategoryNames: Map<String, String>, localizedGroupNames: Map<String, String>) {
      q.h(var1, "context");
      q.h(var2, "localizedCategoryNames");
      q.h(var3, "localizedGroupNames");
      NotificationChannels.INSTANCE.init(var1, var2, var3);
   }

   public fun markNotificationAsDirectReply(context: Context, tag: String, channelId: String, shouldIgnoreAck: Boolean) {
      q.h(var1, "context");
      q.h(var2, "tag");
      q.h(var3, "channelId");
      val var5: Notification = NotificationManagerUtilsKt.getActiveNotification(var1, var2);
      if (var5 != null) {
         val var6: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var3, var5)
            .c(androidx.core.os.d.a(w.a("ignoreAck", var4)));
         q.g(var6, "addExtras(...)");
         NotificationManagerUtilsKt.notify$default(NotificationManagerUtilsKt.getNotificationManagerCompat(var1), var2, var6, 0, 4, null);
      }
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      q.h(var1, "context");
      q.h(var2, "name");
      NotificationChannels.INSTANCE.setIncomingRingtone(var1, var2);
   }

   public companion object {
      public const val CHANNEL_NAME: String
      public const val IGNORE_ACK_KEY: String
      public const val IS_DM: String
      public const val USERNAME: String
   }
}
