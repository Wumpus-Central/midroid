package com.discord.notifications.renderer

import Ca.v
import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build.VERSION
import android.service.notification.StatusBarNotification
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.NotificationCompat.Action
import androidx.core.app.NotificationCompat.Builder
import androidx.core.app.NotificationCompat.MessagingStyle
import com.discord.icons.IconUrlUtils
import com.discord.image.fresco.FrescoFetchDecodedImageKt
import com.discord.image.fresco.FrescoModuleDiscord
import com.discord.image.fresco.postprocessors.PostProcessor
import com.discord.image.fresco.postprocessors.PostProcessor.Circle
import com.discord.notifications.actions.intents.ContentAction
import com.discord.notifications.actions.intents.DismissCallAction
import com.discord.notifications.api.NotificationData
import com.discord.notifications.api.NotificationDataDeserializationUtilsKt
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt
import com.discord.notifications.renderer.utils.NotificationImageCacheKt
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.shortcuts.ShortcutUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import fc.G
import java.util.ArrayList
import java.util.Comparator
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.jvm.internal.Ref.ObjectRef
import kotlinx.coroutines.CoroutineScope

@SourceDebugExtension(["SMAP\nNotificationRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,458:1\n1863#2,2:459\n1863#2,2:461\n1863#2:463\n1863#2,2:464\n1864#2:466\n1863#2:467\n1863#2,2:468\n1864#2:470\n*S KotlinDebug\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer\n*L\n119#1:459,2\n135#1:461,2\n164#1:463\n168#1:464,2\n164#1:466\n185#1:467\n189#1:468,2\n185#1:470\n*E\n"])
public class NotificationRenderer {
   public final var fullscreenIntent: PendingIntent?
      internal set

   private fun getFullscreenIntent(context: Context, notification: NotificationData, notificationDataMap: Map<String, String>): PendingIntent? {
      val var10: Intent = new Intent(var1, IncomingCallActivity.class).addFlags(268468224);
      val var9: Pair = v.a("username", var2.getUserUsername());
      var var8: java.lang.String;
      if (NotificationDataUtilsKt.isCall(var2)) {
         var8 = var2.getChannelName();
      } else {
         var8 = var2.getChannelName();
         val var11: java.lang.String = var2.getGuildName();
         val var12: StringBuilder = new StringBuilder();
         var12.append(var8);
         var12.append(", ");
         var12.append(var11);
         var8 = var12.toString();
      }

      var var5: Boolean;
      label17: {
         var23 = v.a("channelName", var8);
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

      val var26: Pair = v.a("isDM", var5);
      val var15: Pair = v.a("userAvatar", var2.getUserAvatar());
      val var14: Pair = v.a("userDiscriminator", var2.getUserDiscriminator());
      val var13: Pair = v.a("userId", java.lang.String.valueOf(var2.getUserId-wUX8bhU()));
      val var16: Pair = v.a("guildId", java.lang.String.valueOf(var2.getGuildId-qOKuAAo()));
      val var25: Pair = v.a("userGuildAvatar", var2.getUserGuildAvatar());
      var var17: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      var3 = O.y(var3);
      var3.put("type", "CALL_CONNECT");
      var3.put("is_fullscreen_call_ui", "true");
      val var21: Pair = v.a("acceptAction", new ContentAction(var17, var3));
      var17 = NotificationDataUtilsKt.getTag(var2);
      val var28: ChannelId = var2.getChannelId-qMVnFVQ();
      val var6: Long = var28.unbox-impl();
      val var29: GuildId = var2.getGuildId-qOKuAAo();
      val var19: UserId = var2.getUserId-wUX8bhU();
      var10.putExtras(
         v0.d.a(
            new Pair[]{
               var9,
               var23,
               var26,
               var15,
               var14,
               var13,
               var16,
               var25,
               var21,
               v.a("dismissAction", new DismissCallAction(var17, var6, true, var29, var19.unbox-impl(), null))
            }
         )
      );
      return PendingIntent.getActivity(var1, 0, var10, 335544320);
   }

   public fun clear(context: Context, notificationTag: String) {
      NotificationManagerUtilsKt.getNotificationManagerCompat(var1).b(var2, 0);
   }

   public fun clearAllNotifications(context: Context) {
      NotificationManagerUtilsKt.getNotificationManagerCompat(var1).c();
   }

   public fun display(
      context: Context,
      notification: NotificationData,
      currentUsername: String?,
      notificationDataMap: Map<String, String>,
      behaviors: NotificationBehaviors?,
      makeOrUpdateShortcut: Boolean,
      notifyEveryTime: Boolean
   ) {
      fc.f.f(
         null,
         new Function2<CoroutineScope, Continuation, Object>(var2, var1, var7, var4, var5, this, var3, var6, null) {
            final NotificationBehaviors $behaviors;
            final Context $context;
            final java.lang.String $currentUsername;
            final boolean $makeOrUpdateShortcut;
            final NotificationData $notification;
            final java.util.Map<java.lang.String, java.lang.String> $notificationDataMap;
            final boolean $notifyEveryTime;
            int I$0;
            private Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final NotificationRenderer this$0;

            {
               super(2, var9);
               this.$notification = var1;
               this.$context = var2x;
               this.$notifyEveryTime = var3x;
               this.$notificationDataMap = var4;
               this.$behaviors = var5;
               this.this$0 = var6;
               this.$currentUsername = var7;
               this.$makeOrUpdateShortcut = var8;
            }

            private static final Object invokeSuspend$fetchImage(Context var0, ObjectRef<PostProcessor> var1x, java.lang.String var2x, Continuation var3x) {
               return FrescoFetchDecodedImageKt.fetchDecodedImage(var0, var2x, var1x.element as PostProcessor, true, var3x);
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(
                  this.$notification,
                  this.$context,
                  this.$notifyEveryTime,
                  this.$notificationDataMap,
                  this.$behaviors,
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
               var var5: Bitmap;
               var var6: java.lang.CharSequence;
               var var22: Int;
               var var36: Pair;
               label119: {
                  label122: {
                     var var8: Any = Ha.b.e();
                     if (this.label != 0) {
                        if (this.label != 1) {
                           if (this.label != 2) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           var22 = this.I$0;
                           var6 = this.L$2 as java.lang.CharSequence;
                           var5 = this.L$1 as Bitmap;
                           var8 = this.L$0 as Bitmap;
                           kotlin.c.b(var1);
                           var7 = var1;
                           var1 = (Bitmap)var8;
                           break label122;
                        }

                        kotlin.c.b(var1);
                     } else {
                        kotlin.c.b(var1);
                        val var31: CoroutineScope = this.L$0 as CoroutineScope;
                        val var34: ObjectRef = new ObjectRef();
                        var34.element = Circle.INSTANCE;
                        val var9: ObjectRef = new ObjectRef();
                        var9.element = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
                        if (this.$notification.getImageAttachmentUrl() != null) {
                           val var24: java.lang.String = this.$notification.getImageAttachmentUrl();
                           var var18: java.lang.String = var24;
                           if (var24 == null) {
                              var18 = "";
                           }

                           var9.element = var18;
                           var34.element = null;
                        }

                        val var19: G = fc.f.b(var31, null, null, new Function2<CoroutineScope, Continuation, Object>(var9, this.$context, var34, null) {
                           final Context $context;
                           final ObjectRef<java.lang.String> $iconUrl;
                           final ObjectRef<PostProcessor> $postProcessor;
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
                              val var4: Any = Ha.b.e();
                              if (this.label != 0) {
                                 if (this.label != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                 }

                                 kotlin.c.b(var1);
                              } else {
                                 kotlin.c.b(var1);
                                 var var3: Context = this.$context;
                                 var1 = this.$postProcessor;
                                 val var5: java.lang.String = this.$iconUrl.element as java.lang.String;
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
                        val var25: G = fc.f.b(
                           var31, null, null, new Function2<CoroutineScope, Continuation, Object>(this.$notification, this.$context, var34, null) {
                              final Context $context;
                              final NotificationData $notification;
                              final ObjectRef<PostProcessor> $postProcessor;
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
                                 val var4: Any = Ha.b.e();
                                 if (this.label != 0) {
                                    if (this.label != 1) {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }

                                    kotlin.c.b(var1);
                                 } else {
                                    kotlin.c.b(var1);
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
                           }, 3, null
                        );
                        this.label = 1;
                        var5 = (Bitmap)fc.d.b(new G[]{var19, var25}, this);
                        var1 = var5;
                        if (var5 === var8) {
                           return var8;
                        }
                     }

                     var1 = (var1 as java.util.List).get(0) as Bitmap;
                     var5 = (var1 as java.util.List).get(1) as Bitmap;
                     var6 = NotificationDataUtilsKt.getContent(this.$notification, this.$context, false);
                     var22 = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification))
                        + 1;
                     val var35: java.lang.String = this.$notification.getErgoImageAttachmentUrl();
                     if (var35 == null) {
                        var36 = null;
                        break label119;
                     }

                     val var49: Context = this.$context;
                     this.L$0 = var1;
                     this.L$1 = var5;
                     this.L$2 = var6;
                     this.I$0 = var22;
                     this.label = 2;
                     var7 = NotificationImageCacheKt.storeRemoteImageViaFileProvider(var49, var35, this);
                     if (var7 === var8) {
                        return var8;
                     }
                  }

                  var36 = var7 as Pair;
               }

               var var40: Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(
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
                  .w(var6)
                  .D(NotificationDataUtilsKt.getGroupKey(this.$notification))
                  .J(var22)
                  .F(var1)
                  .z(NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context))
                  .v(NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap));
               val var10: Builder = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(
                     var40, this.$context, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, this.$context)
                  )
                  .h();
               val var12: NotificationData = this.$notification;
               val var41: NotificationRenderer = this.this$0;
               val var13: Context = this.$context;
               val var11: java.util.Map = this.$notificationDataMap;
               val var51: java.lang.String = this.$currentUsername;
               val var4: Boolean = this.$makeOrUpdateShortcut;
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  if (VERSION.SDK_INT >= 26) {
                     var41.setFullscreenIntent(NotificationRenderer.access$getFullscreenIntent(var41, var13, var12, var11));
                     var10.M(1).C(var41.getFullscreenIntent(), true).m(false);
                  }

                  var var42: java.lang.String = var12.getChannelName();
                  val var14: Pair = v.a("username", var12.getUserUsername());
                  if (!NotificationDataUtilsKt.isCall(var12)) {
                     val var16: java.lang.String = var12.getGuildName();
                     val var15: StringBuilder = new StringBuilder();
                     var15.append(var42);
                     var15.append(", ");
                     var15.append(var16);
                     var42 = var15.toString();
                  }

                  val var55: Pair = v.a("channelName", var42);
                  val var43: Int = var12.getChannelType();
                  val var3x: Boolean;
                  if (var43 != null && var43 == 1) {
                     var3x = true;
                  } else {
                     var3x = false;
                  }

                  var10.c(v0.d.a(new Pair[]{var14, var55, v.a("isDM", kotlin.coroutines.jvm.internal.b.a(var3x))}));
               }

               if (NotificationDataUtilsKt.shouldUseMessagingStyle(var12)) {
                  val var53: androidx.core.app.Person.c = new androidx.core.app.Person.c();
                  if (var51 != null) {
                     var40 = var51;
                  } else {
                     var40 = I18nUtilsKt.i18nFormat$default(var13, I18nMessage.ME, null, 2, null);
                  }

                  label96: {
                     var52 = new MessagingStyle(var53.f(var40).e("me").a())
                        .s(NotificationDataUtilsKt.getConversationTitle(var12))
                        .t(NotificationDataUtilsKt.isGroupConversation(var12));
                     val var45: Notification = NotificationManagerUtilsKt.getActiveNotification(var13, NotificationDataUtilsKt.getTag(var12));
                     if (var45 != null) {
                        val var46: MessagingStyle = NotificationManagerUtilsKt.getMessagingStyle(var45);
                        if (var46 != null) {
                           val var47: java.util.List = var46.q();
                           if (var47 != null) {
                              var48 = CollectionsKt.Z0(var47);
                              if (var48 != null) {
                                 break label96;
                              }
                           }
                        }
                     }

                     var48 = new ArrayList();
                  }

                  if (var36 != null) {
                     val var54: Uri = var36.a() as Uri;
                     val var37: java.lang.String = var36.b() as java.lang.String;
                     val var56: androidx.core.app.NotificationCompat.MessagingStyle.d = new androidx.core.app.NotificationCompat.MessagingStyle.d(
                        "", NotificationDataUtilsKt.getSendTime(var12), NotificationDataUtilsKt.getSenderForMessageNotification(var12, var5)
                     );
                     var56.j(var37, var54);
                     var48.add(var56);
                  }

                  var48.add(
                     new androidx.core.app.NotificationCompat.MessagingStyle.d(
                        var6, NotificationDataUtilsKt.getSendTime(var12), NotificationDataUtilsKt.getSenderForMessageNotification(var12, var5)
                     )
                  );
                  if (var48.size() > 1) {
                     CollectionsKt.z(
                        (java.util.List)var48,
                        new Comparator() {
                           @Override
                           public final int compare(T var1, T var2x) {
                              return Fa.a.d(
                                 (var1 as androidx.core.app.NotificationCompat.MessagingStyle.d).i(),
                                 (var2x as androidx.core.app.NotificationCompat.MessagingStyle.d).i()
                              );
                           }
                        }
                     );
                  }

                  val var32: java.util.Iterator = var48.iterator();

                  while (var32.hasNext()) {
                     var52.o(var32.next() as androidx.core.app.NotificationCompat.MessagingStyle.d);
                  }

                  var10.Y(var52);
                  if (var4) {
                     ShortcutUtilsKt.addShortcut(var10, var13, NotificationDataUtilsKt.getShortcutInfo(var12, var13, var11, var1, var5));
                  }
               } else if (NotificationDataUtilsKt.shouldUseBigText(var12)) {
                  var10.Y(new androidx.core.app.NotificationCompat.f().o(var6));
               }

               val var28: java.util.List = CollectionsKt.n(
                  new Action[]{
                     NotificationDataUtilsKt.getMarkAsReadAction(var12, var13),
                     NotificationDataUtilsKt.getDirectReplyAction(var12, var13),
                     NotificationDataUtilsKt.getCallAction(var12, var13, false, var11),
                     NotificationDataUtilsKt.getCallAction(var12, var13, true, var11),
                     NotificationDataUtilsKt.getTimedMuteAction(var12, var13, var22),
                     NotificationDataUtilsKt.getBotDMMuteAction(var12, var13)
                  }
               );
               val var20: ArrayList = new ArrayList();
               val var29: java.util.Iterator = var28.iterator();

               while (var29.hasNext()) {
                  val var33: Builder = var10.b(var29.next() as Action);
                  if (var33 != null) {
                     var20.add(var33);
                  }
               }

               val var23: Byte;
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  var23 = 4;
               } else {
                  var23 = 0;
               }

               val var21: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context);
               val var30: java.lang.String = NotificationDataUtilsKt.getTag(this.$notification);
               NotificationManagerUtilsKt.notify(var21, var30, var10, var23);
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   public fun displayLocal(context: Context, notification: Map<String, Any>) {
      fc.f.f(
         null,
         new Function2<CoroutineScope, Continuation, Object>(var2, var1, null) {
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
               Ha.b.e();
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  var1 = NotificationDataDeserializationUtilsKt.localNotificationData(NotificationData.Companion, this.$notification);
                  val var2x: java.util.Map = O.y(var1.getUserInfo());

                  for (Entry var5 : this.$notification.entrySet()) {
                     val var3: java.lang.String = var5.getKey() as java.lang.String;
                     val var11: Any = var5.getValue();
                     if (var11 is java.lang.String) {
                        var2x.put(var3, var11);
                     }
                  }

                  val var8: Builder = new Builder(this.$context, NotificationChannels.INSTANCE.getNotificationChannelId(var1, this.$context))
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
                  val var10: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context);
                  val var7: java.lang.String = NotificationDataUtilsKt.getTag(var1);
                  NotificationManagerUtilsKt.notify$default(var10, var7, var8, 0, 4, null);
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
      if (VERSION.SDK_INT >= 26 && !var2.isEmpty()) {
         for (ChannelId var3 : var2) {
            if (var3 != null) {
               val var6: java.util.List = NotificationManagerUtilsKt.getCallNotifications-mJqaSGE(var1, var3.unbox-impl());
               if (var6 != null) {
                  val var7: java.util.Iterator = var6.iterator();

                  while (var7.hasNext()) {
                     val var4: java.lang.String = (var7.next() as StatusBarNotification).getTag();
                     this.clear(var1, var4);
                  }
               }

               val var8: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
               if (IncomingCallActivity.Companion.getSelfIntent() != null) {
                  val var9: AppCompatActivity = var8.getSelfIntent();
                  var9.finishAndRemoveTask();
               }
            }
         }
      }
   }

   public fun handleCallRingEnd(context: Context, channelIds: List<ChannelId?>) {
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

                     var var3: java.lang.String = var6.getNotification().extras.getString("channelName");
                     val var8: java.lang.String = NotificationDataUtilsKt.getMissedCallText(var1, var11, var6.getNotification().extras.getBoolean("isDM"));
                     val var7: java.lang.String = j.a(var6.getNotification());
                     val var16: Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var7, var6.getNotification());
                     val var17: Builder = var16.q(NotificationChannels.INSTANCE.getSilenceCallChannelId()).w(var8);
                     if (var3 != null) {
                        var11 = var3;
                     }

                     var17.x(var11).h();
                     val var12: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(var1);
                     var3 = var6.getTag();
                     NotificationManagerUtilsKt.notify$default(var12, var3, var16, 0, 4, null);
                  }
               }

               val var13: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
               if (IncomingCallActivity.Companion.getSelfIntent() != null) {
                  val var14: AppCompatActivity = var13.getSelfIntent();
                  var14.finishAndRemoveTask();
               }
            }
         }
      }
   }

   public fun handleReactionAcks(context: Context, channelId: String) {
      if (VERSION.SDK_INT >= 26) {
         val var5: java.util.List = NotificationManagerUtilsKt.getActiveReactionNotifications(var1, var2);
         if (var5 != null) {
            for (StatusBarNotification var3 : var5) {
               val var4: java.lang.String = j.a(var3.getNotification());
               if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var4, var3.getNotification()).i().getBoolean("ignoreAck", false)) {
                  val var7: java.lang.String = var3.getTag();
                  this.clear(var1, var7);
               }
            }
         }
      }
   }

   public fun initFresco(context: Context) {
      FrescoModuleDiscord.Companion.initializeFresco(var1);
   }

   public fun initIconUrlUtils(context: Context) {
      IconUrlUtils.init$default(IconUrlUtils.INSTANCE, var1, null, null, 6, null);
   }

   public fun initNotificationCategories(context: Context, localizedCategoryNames: Map<String, String>, localizedGroupNames: Map<String, String>) {
      NotificationChannels.INSTANCE.init(var1, var2, var3);
   }

   public fun markNotificationAsDirectReply(context: Context, tag: String, channelId: String, shouldIgnoreAck: Boolean) {
      val var5: Notification = NotificationManagerUtilsKt.getActiveNotification(var1, var2);
      if (var5 != null) {
         val var7: Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var3, var5).c(v0.d.a(new Pair[]{v.a("ignoreAck", var4)}));
         val var6: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(var1);
         NotificationManagerUtilsKt.notify$default(var6, var2, var7, 0, 4, null);
      }
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      NotificationChannels.INSTANCE.setIncomingRingtone(var1, var2);
   }

   public companion object {
      public const val IGNORE_ACK_KEY: String
      public const val USERNAME: String
      public const val CHANNEL_NAME: String
      public const val IS_DM: String
   }
}
