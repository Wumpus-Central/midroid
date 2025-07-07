package com.discord.notifications.renderer

import android.app.KeyguardManager
import android.app.KeyguardManager$KeyguardDismissCallback
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.os.Bundle
import android.os.Build.VERSION
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.icons.IconUrlUtils
import com.discord.image.fresco.FrescoFetchDecodedImageKt
import com.discord.image.fresco.postprocessors.PostProcessor
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.notifications.actions.NotificationActions
import com.discord.notifications.actions.intents.ContentAction
import com.discord.notifications.actions.intents.DismissCallAction
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_activities.ReactActivity
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.snowflake.SnowflakeUtils
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import ib.G
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineScope

public class IncomingCallActivity : AppCompatActivity {
   private fun configureActions() {
      ib.f.f(
         null,
         new Function2(this, null) {
            private Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;
            final IncomingCallActivity this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            private static final void invokeSuspend$lambda$1(IncomingCallActivity var0, ContentAction var1x, View var2x) {
               val var4: Intent = IntentUtilsKt.putExtra(
                     new Intent("android.intent.action.VIEW", null, var0.getBaseContext(), ReactActivity.Registry.getMainActivity()), H.b(ContentAction.class)
                  )
                  .addCategory("android.intent.category.HOME")
                  .addFlags(268435456);
               r.g(var4, "addFlags(...)");
               val var3x: Intent = IntentUtilsKt.putIntentParcelable(var4, "action_intent_arg_key", var1x);
               var var5: Any = var0.getSystemService("keyguard");
               r.f(var5, "null cannot be cast to non-null type android.app.KeyguardManager");
               var5 = var5 as KeyguardManager;
               if (VERSION.SDK_INT >= 26) {
                  com.discord.notifications.renderer.c.a(
                     (KeyguardManager)var5, var0, com.discord.notifications.renderer.d.a(new KeyguardManager$KeyguardDismissCallback(var0, var3x) {
                        final Intent $intent;
                        final IncomingCallActivity this$0;

                        {
                           this.this$0 = var1;
                           this.$intent = var2xx;
                        }

                        public void onDismissSucceeded() {
                           super.onDismissSucceeded();
                           this.this$0.getBaseContext().startActivity(this.$intent);
                        }
                     })
                  );
               }
            }

            private static final void invokeSuspend$lambda$3(IncomingCallActivity var0, DismissCallAction var1x, View var2x) {
               val var4: Intent = IntentUtilsKt.putExtra(
                     new Intent("com.discord.intent.action.NOTIFICATION_ACTION", null, var0.getBaseContext(), NotificationActions.class),
                     H.b(DismissCallAction.class)
                  )
                  .addCategory("android.intent.category.HOME");
               r.g(var4, "addCategory(...)");
               val var3x: Intent = IntentUtilsKt.putIntentParcelable(var4, "action_intent_arg_key", var1x);
               var var5: Any = var0.getSystemService("keyguard");
               r.f(var5, "null cannot be cast to non-null type android.app.KeyguardManager");
               var5 = var5 as KeyguardManager;
               if (VERSION.SDK_INT >= 26) {
                  com.discord.notifications.renderer.c.a(
                     (KeyguardManager)var5, var0, com.discord.notifications.renderer.d.a(new KeyguardManager$KeyguardDismissCallback(var0, var3x) {
                        final Intent $intent;
                        final IncomingCallActivity this$0;

                        {
                           this.this$0 = var1;
                           this.$intent = var2x;
                        }

                        public void onDismissSucceeded() {
                           super.onDismissSucceeded();
                           this.this$0.getBaseContext().sendBroadcast(this.$intent);
                           this.this$0.finishAndRemoveTask();
                        }
                     })
                  );
               }
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               var var9: Any = G9.b.e();
               val var3x: DismissCallAction;
               val var4: ImageButton;
               val var5: TextView;
               val var6: ImageButton;
               val var7: TextView;
               var var8: Any;
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  var5 = this.L$5 as TextView;
                  var7 = this.L$4 as TextView;
                  var6 = this.L$3 as ImageButton;
                  var4 = this.L$2 as ImageButton;
                  var3x = this.L$1 as DismissCallAction;
                  var9 = this.L$0 as ContentAction;
                  kotlin.c.b(var1);
                  var8 = var1;
                  var1 = (ContentAction)var9;
               } else {
                  kotlin.c.b(var1);
                  var8 = this.L$0 as CoroutineScope;
                  val var15: Any = com.discord.notifications.renderer.e.a(this.this$0.getIntent(), "acceptAction", ContentAction.class);
                  r.f(var15, "null cannot be cast to non-null type com.discord.notifications.actions.intents.ContentAction");
                  var1 = var15 as ContentAction;
                  val var16: Any = com.discord.notifications.renderer.e.a(this.this$0.getIntent(), "dismissAction", DismissCallAction.class);
                  r.f(var16, "null cannot be cast to non-null type com.discord.notifications.actions.intents.DismissCallAction");
                  var3x = var16 as DismissCallAction;
                  var4 = this.this$0.findViewById(R.id.acceptCallContainer);
                  var6 = this.this$0.findViewById(R.id.declineCallContainer);
                  var7 = this.this$0.findViewById(R.id.acceptCallText);
                  var5 = this.this$0.findViewById(R.id.declineCallText);
                  val var12: Context = this.this$0.getApplicationContext();
                  r.g(var12, "getApplicationContext(...)");
                  val var10: ReactAsset = ReactAsset.CallDisconnect;
                  var var11: Context = this.this$0.getApplicationContext();
                  r.g(var11, "getApplicationContext(...)");
                  val var30: java.lang.String = ReactAssetUtilsKt.getReactImageUrl(var12, var10.getUri(var11));
                  val var13: Context = this.this$0.getApplicationContext();
                  r.g(var13, "getApplicationContext(...)");
                  val var35: ReactAsset = ReactAsset.CallConnect;
                  var11 = this.this$0.getApplicationContext();
                  r.g(var11, "getApplicationContext(...)");
                  val var34: java.lang.String = ReactAssetUtilsKt.getReactImageUrl(var13, var35.getUri(var11));
                  val var32: G = ib.f.b((CoroutineScope)var8, null, null, new Function2(this.this$0, var30, null) {
                     final java.lang.String $callDisconnectUrl;
                     int label;
                     final IncomingCallActivity this$0;

                     {
                        super(2, var3x);
                        this.this$0 = var1;
                        this.$callDisconnectUrl = var2x;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(this.this$0, this.$callDisconnectUrl, var2);
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
                           var1 = this.this$0;
                           var var3: java.lang.String = this.$callDisconnectUrl;
                           this.label = 1;
                           var3 = (java.lang.String)IncomingCallActivity.access$fetchImage(var1, var3, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  var8 = ib.f.b((CoroutineScope)var8, null, null, new Function2(this.this$0, var34, null) {
                     final java.lang.String $callConnectUrl;
                     int label;
                     final IncomingCallActivity this$0;

                     {
                        super(2, var3);
                        this.this$0 = var1;
                        this.$callConnectUrl = var2x;
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(this.this$0, this.$callConnectUrl, var2);
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
                           var1 = this.this$0;
                           var var3: java.lang.String = this.$callConnectUrl;
                           this.label = 1;
                           var3 = (java.lang.String)IncomingCallActivity.access$fetchImage(var1, var3, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  this.L$0 = var1;
                  this.L$1 = var3x;
                  this.L$2 = var4;
                  this.L$3 = var6;
                  this.L$4 = var7;
                  this.L$5 = var5;
                  this.label = 1;
                  var8 = ib.d.b(new G[]{var32, (G)var8}, this);
                  if (var8 === var9) {
                     return var9;
                  }
               }

               val var20: Bitmap = (var8 as java.util.List).get(0) as Bitmap;
               var9 = (var8 as java.util.List).get(1) as Bitmap;
               r.e(var20);
               var8 = Bitmap.createScaledBitmap(var20, 110, 110, true);
               r.g(var8, "createScaledBitmap(...)");
               var6.setImageBitmap((Bitmap)var8);
               var6.setImageTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getWhite()));
               r.e(var9);
               var8 = Bitmap.createScaledBitmap((Bitmap)var9, 110, 110, true);
               r.g(var8, "createScaledBitmap(...)");
               var4.setImageBitmap((Bitmap)var8);
               var4.setImageTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getWhite()));
               var8 = this.this$0.getApplicationContext();
               r.g(var8, "getApplicationContext(...)");
               var4.setContentDescription(I18nUtilsKt.i18nFormat$default((Context)var8, I18nMessage.KEYBIND_DESCRIPTION_MODAL_CALL_ACCEPT, null, 2, null));
               var4.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getStatusPositive()));
               var8 = this.this$0.getApplicationContext();
               r.g(var8, "getApplicationContext(...)");
               var6.setContentDescription(I18nUtilsKt.i18nFormat$default((Context)var8, I18nMessage.KEYBIND_DESCRIPTION_MODAL_CALL_DECLINE, null, 2, null));
               var6.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getStatusDanger()));
               var8 = this.this$0.getApplicationContext();
               r.g(var8, "getApplicationContext(...)");
               var7.setText(I18nUtilsKt.i18nFormat$default((Context)var8, I18nMessage.JOIN_CALL, null, 2, null));
               r.e(var7);
               var8 = DiscordFont.PrimaryMedium;
               DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
               var7.setTextColor(ThemeManagerKt.getTheme().getWhite());
               val var17: Context = this.this$0.getApplicationContext();
               r.g(var17, "getApplicationContext(...)");
               var5.setText(I18nUtilsKt.i18nFormat$default(var17, I18nMessage.DECLINE, null, 2, null));
               r.e(var5);
               DiscordFontUtilsKt.setDiscordFont(var5, (DiscordFont)var8);
               var5.setTextColor(ThemeManagerKt.getTheme().getWhite());
               var4.setOnClickListener(new com.discord.notifications.renderer.f(this.this$0, var1));
               var6.setOnClickListener(new g(this.this$0, var3x));
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   private fun configureUser() {
      ib.f.f(
         null,
         new Function2(this, null) {
            private Object L$0;
            int label;
            final IncomingCallActivity this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var5: Any = G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  var var6: java.lang.String;
                  var var7: CoroutineScope;
                  label27: {
                     kotlin.c.b(var1);
                     var7 = this.L$0 as CoroutineScope;
                     var6 = this.this$0.getIntent().getStringExtra("username");
                     val var11: java.lang.String = this.this$0.getIntent().getStringExtra("userId");
                     if (var11 != null) {
                        val var12: java.lang.Long = SnowflakeUtils.INSTANCE.toSnowflake(var11);
                        if (var12 != null) {
                           var1 = UserId.box-impl(UserId.constructor-impl(var12.longValue()));
                           break label27;
                        }
                     }

                     var1 = null;
                  }

                  val var9: java.lang.String = this.this$0.getIntent().getStringExtra("userAvatar");
                  val var8: java.lang.String = this.this$0.getIntent().getStringExtra("userGuildAvatar");
                  val var16: Int = this.this$0.getIntent().getIntExtra("userDiscriminator", 0);
                  val var10: java.lang.String = this.this$0.getIntent().getStringExtra("guildId");
                  var var3x: GuildId = null;
                  if (var10 != null) {
                     val var19: java.lang.Long = SnowflakeUtils.INSTANCE.toSnowflake(var10);
                     var3x = null;
                     if (var19 != null) {
                        var3x = GuildId.box-impl(GuildId.constructor-impl(var19.longValue()));
                     }
                  }

                  val var18: TextView = this.this$0.findViewById(R.id.userName);
                  var18.setText(var6);
                  r.e(var18);
                  DiscordFontUtilsKt.setDiscordFont(var18, DiscordFont.PrimaryMedium);
                  var18.setTextColor(ThemeManagerKt.getTheme().getWhite());
                  val var14: G = ib.f.b(
                     var7,
                     null,
                     null,
                     new Function2(this.this$0, var8, var3x, var1, var9, var16, null) {
                        final GuildId $guildId;
                        final java.lang.String $userAvatar;
                        final int $userDiscriminator;
                        final java.lang.String $userGuildAvatar;
                        final UserId $userId;
                        int label;
                        final IncomingCallActivity this$0;

                        {
                           super(2, var7x);
                           this.this$0 = var1;
                           this.$userGuildAvatar = var2x;
                           this.$guildId = var3x;
                           this.$userId = var4;
                           this.$userAvatar = var5x;
                           this.$userDiscriminator = var6x;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(
                              this.this$0, this.$userGuildAvatar, this.$guildId, this.$userId, this.$userAvatar, this.$userDiscriminator, var2
                           );
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
                              var1 = this.this$0;
                              var var3: Context = this.this$0.getApplicationContext();
                              r.g(var3, "getApplicationContext(...)");
                              val var6: java.lang.String = IncomingCallActivity.access$getIconUrlForAvatar-r1nfqec(
                                 var1, var3, this.$userGuildAvatar, this.$guildId, this.$userId, this.$userAvatar, this.$userDiscriminator
                              );
                              this.label = 1;
                              var3 = (Context)IncomingCallActivity.access$fetchImage(var1, var6, this);
                              var1 = var3;
                              if (var3 === var4) {
                                 return var4;
                              }
                           }

                           return var1;
                        }
                     },
                     3,
                     null
                  );
                  this.label = 1;
                  var3x = (GuildId)ib.d.b(new G[]{var14}, this);
                  var1 = var3x;
                  if (var3x === var5) {
                     return var5;
                  }
               }

               (this.this$0.findViewById(R.id.imageView) as ImageView).setImageBitmap((var1 as java.util.List).get(0) as Bitmap);
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   private suspend fun fetchImage(uri: String): Bitmap? {
      val var3: Context = this.getApplicationContext();
      r.g(var3, "getApplicationContext(...)");
      return FrescoFetchDecodedImageKt.fetchDecodedImage(var3, var1, PostProcessor.Circle.INSTANCE, true, var2);
   }

   private fun getIconUrlForAvatar(context: Context, userGuildAvatar: String?, guildId: GuildId?, userId: UserId?, userAvatar: String?, userDiscriminator: Int): String {
      val var7: IconUrlUtils = IconUrlUtils.INSTANCE;
      IconUrlUtils.init$default(IconUrlUtils.INSTANCE, var1, null, null, 6, null);
      val var9: java.lang.String = IconUrlUtils.getForGuildMember-2tNb6hE$default(var7, var2, var3, var4, null, false, 24, null);
      var2 = var9;
      if (var9.length() == 0) {
         var2 = IconUrlUtils.getForUser-_fRzTXg$default(var7, var1, var4, var5, var6, false, null, 32, null);
      }

      return var2;
   }

   private fun initView() {
      ib.f.f(null, new Function2(this, null) {
         int label;
         final IncomingCallActivity this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            G9.b.e();
            if (this.label == 0) {
               kotlin.c.b(var1);
               val var2x: Boolean = this.this$0.getIntent().getBooleanExtra("isDM", false);
               var1 = this.this$0.getIntent().getStringExtra("channelName");
               val var3: View = ActivityExtensionsKt.getContentView(this.this$0);
               if (var3 == null) {
                  return Unit.a;
               } else {
                  var3.setBackgroundColor(ThemeManagerKt.getTheme().getRedesignButtonPrimaryBackground());
                  ViewBackgroundUtilsKt.setBackgroundDrawableRes(var3, R.drawable.incoming_call_gradient);
                  IncomingCallActivity.access$configureUser(this.this$0);
                  var var4: TextView = this.this$0.findViewById(R.id.textView);
                  val var8: Context = this.this$0.getApplicationContext();
                  r.g(var8, "getApplicationContext(...)");
                  var4.setText(I18nUtilsKt.i18nFormat$default(var8, I18nMessage.INCOMING_CALL, null, 2, null));
                  r.e(var4);
                  val var9: DiscordFont = DiscordFont.PrimaryMedium;
                  DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
                  val var5: Context = this.this$0.getApplicationContext();
                  r.g(var5, "getApplicationContext(...)");
                  var4.setTextColor(ColorUtilsKt.getColorCompat(var5, com.discord.theme.R.color.primary_330));
                  if (!var2x) {
                     var4 = this.this$0.findViewById(R.id.channelName);
                     var4.setText(var1);
                     r.e(var4);
                     DiscordFontUtilsKt.setDiscordFont(var4, var9);
                     val var7: Context = this.this$0.getApplicationContext();
                     r.g(var7, "getApplicationContext(...)");
                     var4.setTextColor(ColorUtilsKt.getColorCompat(var7, com.discord.theme.R.color.primary_330));
                  }

                  if (VERSION.SDK_INT >= 33) {
                     IncomingCallActivity.access$configureActions(this.this$0);
                  }

                  return Unit.a;
               }
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }, 1, null);
   }

   private fun turnScreenOffAndKeyguardOn() {
      if (VERSION.SDK_INT >= 27) {
         com.discord.notifications.renderer.a.a(this, false);
         b.a(this, false);
      } else {
         this.getWindow().clearFlags(129);
      }
   }

   private fun turnScreenOnAndKeyguardOff() {
      val var1: Int = VERSION.SDK_INT;
      if (VERSION.SDK_INT >= 27) {
         com.discord.notifications.renderer.a.a(this, true);
         b.a(this, true);
      } else {
         this.getWindow().addFlags(129);
      }

      var var2: Any = this.getSystemService("keyguard");
      r.f(var2, "null cannot be cast to non-null type android.app.KeyguardManager");
      var2 = var2 as KeyguardManager;
      if (var1 >= 26) {
         com.discord.notifications.renderer.c.a((KeyguardManager)var2, this, null);
      }
   }

   protected override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      this.setContentView(R.layout.incoming_call_screen);
      this.initView();
      this.turnScreenOnAndKeyguardOff();
      selfIntent = this;
   }

   protected override fun onDestroy() {
      super.onDestroy();
      this.turnScreenOffAndKeyguardOn();
   }

   public companion object {
      public final var selfIntent: AppCompatActivity?
         internal set
   }
}
