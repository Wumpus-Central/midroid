package com.discord.notifications.renderer

import B9.s
import android.app.Notification
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
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
import com.discord.notifications.renderer.utils.NotificationImageCacheKt
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.shortcuts.ShortcutUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import db.G
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
      val var9: Pair = s.a("username", var2.getUserUsername());
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

      var var7: Boolean;
      label17: {
         var23 = s.a("channelName", var8);
         val var24: Int = var2.getChannelType();
         if (var24 != null) {
            val var4: Int = var24;
            var7 = true;
            if (var4 == 1) {
               break label17;
            }
         }

         var7 = false;
      }

      val var13: Pair = s.a("isDM", var7);
      val var26: Pair = s.a("userAvatar", var2.getUserAvatar());
      val var15: Pair = s.a("userDiscriminator", var2.getUserDiscriminator());
      val var16: Pair = s.a("userId", java.lang.String.valueOf(var2.getUserId-wUX8bhU()));
      val var14: Pair = s.a("guildId", java.lang.String.valueOf(var2.getGuildId-qOKuAAo()));
      val var25: Pair = s.a("userGuildAvatar", var2.getUserGuildAvatar());
      val var17: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      val var18: java.util.Map = L.x(var3);
      var18.put("type", "CALL_CONNECT");
      var18.put("is_fullscreen_call_ui", "true");
      val var27: Pair = s.a("acceptAction", new ContentAction(var17, var18));
      val var21: java.lang.String = NotificationDataUtilsKt.getTag(var2);
      val var28: ChannelId = var2.getChannelId-qMVnFVQ();
      val var5: Long = var28.unbox-impl();
      val var29: GuildId = var2.getGuildId-qOKuAAo();
      val var19: UserId = var2.getUserId-wUX8bhU();
      var10.putExtras(
         D.d.a(
            var9,
            var23,
            var13,
            var26,
            var15,
            var16,
            var14,
            var25,
            var27,
            s.a("dismissAction", new DismissCallAction(var21, var5, true, var29, var19.unbox-impl(), null))
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
      db.f.f(
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
                     var var8: Any = G9.b.e();
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
                        val var34: CoroutineScope = this.L$0 as CoroutineScope;
                        val var31: ObjectRef = new ObjectRef();
                        var31.element = PostProcessor.Circle.INSTANCE;
                        val var9: ObjectRef = new ObjectRef();
                        var9.element = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
                        if (this.$notification.getImageAttachmentUrl() != null) {
                           val var24: java.lang.String = this.$notification.getImageAttachmentUrl();
                           var var18: java.lang.String = var24;
                           if (var24 == null) {
                              var18 = "";
                           }

                           var9.element = var18;
                           var31.element = null;
                        }

                        val var19: G = db.f.b(var34, null, null, new Function2<CoroutineScope, Continuation, Object>(var9, this.$context, var31, null) {
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
                                 var1 = this.$iconUrl.element as java.lang.String;
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
                        val var25: G = db.f.b(
                           var34, null, null, new Function2<CoroutineScope, Continuation, Object>(this.$notification, this.$context, var31, null) {
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
                                 val var4: Any = G9.b.e();
                                 if (this.label != 0) {
                                    if (this.label != 1) {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }

                                    kotlin.c.b(var1);
                                 } else {
                                    kotlin.c.b(var1);
                                    var var3: Context = this.$context;
                                    val var5: ObjectRef = this.$postProcessor;
                                    var1 = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, this.$context);
                                    this.label = 1;
                                    var3 = (Context)<unrepresentable>.access$invokeSuspend$fetchImage(var3, var5, var1, this);
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
                        var5 = (Bitmap)db.d.b(new G[]{var19, var25}, this);
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

               val var50: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(
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
               val var10: NotificationCompat.Builder = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(
                     var50, this.$context, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, this.$context)
                  )
                  .h();
               val var13: NotificationData = this.$notification;
               val var41: NotificationRenderer = this.this$0;
               val var11: Context = this.$context;
               val var12: java.util.Map = this.$notificationDataMap;
               val var51: java.lang.String = this.$currentUsername;
               val var4: Boolean = this.$makeOrUpdateShortcut;
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  if (VERSION.SDK_INT >= 26) {
                     var41.setFullscreenIntent(NotificationRenderer.access$getFullscreenIntent(var41, var11, var13, var12));
                     var10.M(1).C(var41.getFullscreenIntent(), true).m(false);
                  }

                  var var42: java.lang.String = var13.getChannelName();
                  val var14: Pair = s.a("username", var13.getUserUsername());
                  if (!NotificationDataUtilsKt.isCall(var13)) {
                     val var15: java.lang.String = var13.getGuildName();
                     val var16: StringBuilder = new StringBuilder();
                     var16.append(var42);
                     var16.append(", ");
                     var16.append(var15);
                     var42 = var16.toString();
                  }

                  val var43: Pair = s.a("channelName", var42);
                  val var55: Int = var13.getChannelType();
                  val var3x: Boolean;
                  if (var55 != null && var55 == 1) {
                     var3x = true;
                  } else {
                     var3x = false;
                  }

                  var10.c(D.d.a(var14, var43, s.a("isDM", kotlin.coroutines.jvm.internal.b.a(var3x))));
               }

               if (NotificationDataUtilsKt.shouldUseMessagingStyle(var13)) {
                  val var53: Person.c = new Person.c();
                  var var44: Any;
                  if (var51 != null) {
                     var44 = var51;
                  } else {
                     var44 = I18nUtilsKt.i18nFormat$default(var11, I18nMessage.ME, null, 2, null);
                  }

                  label96: {
                     var52 = new NotificationCompat.MessagingStyle(var53.f(var44).e("me").a())
                        .s(NotificationDataUtilsKt.getConversationTitle(var13))
                        .t(NotificationDataUtilsKt.isGroupConversation(var13));
                     var44 = NotificationManagerUtilsKt.getActiveNotification(var11, NotificationDataUtilsKt.getTag(var13));
                     if (var44 != null) {
                        var44 = NotificationManagerUtilsKt.getMessagingStyle((Notification)var44);
                        if (var44 != null) {
                           val var47: java.util.List = var44.q();
                           if (var47 != null) {
                              var44 = CollectionsKt.V0(var47);
                              if (var44 != null) {
                                 break label96;
                              }
                           }
                        }
                     }

                     var44 = new ArrayList();
                  }

                  if (var36 != null) {
                     val var54: Uri = var36.a() as Uri;
                     val var56: java.lang.String = var36.b() as java.lang.String;
                     val var37: NotificationCompat.MessagingStyle.d = new NotificationCompat.MessagingStyle.d(
                        "", NotificationDataUtilsKt.getSendTime(var13), NotificationDataUtilsKt.getSenderForMessageNotification(var13, var5)
                     );
                     var37.j(var56, var54);
                     var44.add(var37);
                  }

                  var44.add(
                     new NotificationCompat.MessagingStyle.d(
                        var6, NotificationDataUtilsKt.getSendTime(var13), NotificationDataUtilsKt.getSenderForMessageNotification(var13, var5)
                     )
                  );
                  if (var44.size() > 1) {
                     CollectionsKt.z((java.util.List)var44, new Comparator() {
                        @Override
                        public final int compare(T var1, T var2x) {
                           return E9.a.d((var1 as NotificationCompat.MessagingStyle.d).i(), (var2x as NotificationCompat.MessagingStyle.d).i());
                        }
                     });
                  }

                  val var32: java.util.Iterator = var44.iterator();

                  while (var32.hasNext()) {
                     var52.o(var32.next() as NotificationCompat.MessagingStyle.d);
                  }

                  var10.Y(var52);
                  if (var4) {
                     ShortcutUtilsKt.addShortcut(var10, var11, NotificationDataUtilsKt.getShortcutInfo(var13, var11, var12, var1, var5));
                  }
               } else if (NotificationDataUtilsKt.shouldUseBigText(var13)) {
                  var10.Y(new NotificationCompat.f().o(var6));
               }

               val var28: java.util.List = CollectionsKt.n(
                  new NotificationCompat.Action[]{
                     NotificationDataUtilsKt.getMarkAsReadAction(var13, var11),
                     NotificationDataUtilsKt.getDirectReplyAction(var13, var11),
                     NotificationDataUtilsKt.getCallAction(var13, var11, false, var12),
                     NotificationDataUtilsKt.getCallAction(var13, var11, true, var12),
                     NotificationDataUtilsKt.getTimedMuteAction(var13, var11, var22),
                     NotificationDataUtilsKt.getBotDMMuteAction(var13, var11)
                  }
               );
               val var20: ArrayList = new ArrayList();
               val var33: java.util.Iterator = var28.iterator();

               while (var33.hasNext()) {
                  val var29: NotificationCompat.Builder = var10.b(var33.next() as NotificationCompat.Action);
                  if (var29 != null) {
                     var20.add(var29);
                  }
               }

               val var23: Byte;
               if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                  var23 = 4;
               } else {
                  var23 = 0;
               }

               val var30: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context);
               val var21: java.lang.String = NotificationDataUtilsKt.getTag(this.$notification);
               NotificationManagerUtilsKt.notify(var30, var21, var10, var23);
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   public fun displayLocal(context: Context, notification: Map<String, Any>) {
      db.f.f(
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
               G9.b.e();
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  var1 = NotificationDataDeserializationUtilsKt.localNotificationData(NotificationData.Companion, this.$notification);
                  val var2x: java.util.Map = L.x(var1.getUserInfo());

                  for (Entry var5 : this.$notification.entrySet()) {
                     val var4: java.lang.String = var5.getKey() as java.lang.String;
                     val var11: Any = var5.getValue();
                     if (var11 is java.lang.String) {
                        var2x.put(var4, var11);
                     }
                  }

                  val var8: NotificationCompat.Builder = new NotificationCompat.Builder(
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
         val var5: java.lang.String = ChannelId.toString-impl((var3.next() as ChannelId).unbox-impl());
         val var4: StringBuilder = new StringBuilder();
         var4.append("MESSAGE_CREATE");
         var4.append(var5);
         val var6: java.lang.String = var4.toString();
         val var7: NotificationChannels = NotificationChannels.INSTANCE;
         if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(
               var1, NotificationChannels.INSTANCE.getNotificationChannelId(var2, var1), NotificationManagerUtilsKt.getActiveNotification(var1, var6)
            )
            .i()
            .getBoolean("ignoreAck", false)) {
            this.clear(var1, var6);
         } else {
            this.markNotificationAsDirectReply(var1, var6, var7.getNotificationChannelId(var2, var1), false);
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
                  for (StatusBarNotification var7 : var2) {
                     var var11: java.lang.String = var7.getNotification().extras.getString("username");
                     if (var11 == null) {
                        return;
                     }

                     var var3: java.lang.String = var7.getNotification().extras.getString("channelName");
                     val var8: java.lang.String = NotificationDataUtilsKt.getMissedCallText(var1, var11, var7.getNotification().extras.getBoolean("isDM"));
                     val var6: java.lang.String = j.a(var7.getNotification());
                     val var16: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var6, var7.getNotification());
                     val var17: NotificationCompat.Builder = var16.q(NotificationChannels.INSTANCE.getSilenceCallChannelId()).w(var8);
                     if (var3 != null) {
                        var11 = var3;
                     }

                     var17.x(var11).h();
                     val var12: NotificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(var1);
                     var3 = var7.getTag();
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
         val var7: NotificationCompat.Builder = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(var1, var3, var5).c(D.d.a(s.a("ignoreAck", var4)));
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
