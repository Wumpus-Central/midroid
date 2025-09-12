package com.discord.notifications.renderer

import android.app.KeyguardManager
import android.app.KeyguardManager.KeyguardDismissCallback
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
import com.discord.image.fresco.FrescoModuleDiscord
import com.discord.image.fresco.postprocessors.PostProcessor.Circle
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
import fc.G
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope

public class IncomingCallActivity : AppCompatActivity {
   private fun configureActions() {
      fc.f.f(
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, null) {
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
                     new Intent("android.intent.action.VIEW", null, var0.getBaseContext(), ReactActivity.Registry.getMainActivity()), ContentAction::class
                  )
                  .addCategory("android.intent.category.HOME")
                  .addFlags(268435456);
               val var3x: Intent = IntentUtilsKt.putIntentParcelable(var4, "action_intent_arg_key", var1x);
               var var5: Any = var0.getSystemService("keyguard");
               var5 = var5 as KeyguardManager;
               if (VERSION.SDK_INT >= 26) {
                  c.a((KeyguardManager)var5, var0, d.a(new KeyguardDismissCallback(var0, var3x) {
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
                  }));
               }
            }

            private static final void invokeSuspend$lambda$3(IncomingCallActivity var0, DismissCallAction var1x, View var2x) {
               val var4: Intent = IntentUtilsKt.putExtra(
                     new Intent("com.discord.intent.action.NOTIFICATION_ACTION", null, var0.getBaseContext(), NotificationActions.class),
                     DismissCallAction::class
                  )
                  .addCategory("android.intent.category.HOME");
               val var3x: Intent = IntentUtilsKt.putIntentParcelable(var4, "action_intent_arg_key", var1x);
               var var5: Any = var0.getSystemService("keyguard");
               var5 = var5 as KeyguardManager;
               if (VERSION.SDK_INT >= 26) {
                  c.a((KeyguardManager)var5, var0, d.a(new KeyguardDismissCallback(var0, var3x) {
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
                  }));
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
               var var9: Any = Ha.b.e();
               val var3x: DismissCallAction;
               val var4: ContentAction;
               val var5: ImageButton;
               val var6: ImageButton;
               val var7: TextView;
               var var8: Any;
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  var9 = this.L$5 as TextView;
                  var7 = this.L$4 as TextView;
                  var6 = this.L$3 as ImageButton;
                  var5 = this.L$2 as ImageButton;
                  var3x = this.L$1 as DismissCallAction;
                  var4 = this.L$0 as ContentAction;
                  kotlin.c.b(var1);
                  var8 = var1;
                  var1 = (TextView)var9;
               } else {
                  kotlin.c.b(var1);
                  var8 = this.L$0 as CoroutineScope;
                  val var15: Any = e.a(this.this$0.getIntent(), "acceptAction", ContentAction.class);
                  var4 = var15 as ContentAction;
                  val var16: Any = e.a(this.this$0.getIntent(), "dismissAction", DismissCallAction.class);
                  var3x = var16 as DismissCallAction;
                  var5 = this.this$0.findViewById(R.id.acceptCallContainer) as ImageButton;
                  var6 = this.this$0.findViewById(R.id.declineCallContainer) as ImageButton;
                  var7 = this.this$0.findViewById(R.id.acceptCallText) as TextView;
                  var1 = this.this$0.findViewById(R.id.declineCallText) as TextView;
                  var var12: Context = this.this$0.getApplicationContext();
                  val var10: ReactAsset = ReactAsset.CallDisconnect;
                  val var11: Context = this.this$0.getApplicationContext();
                  val var32: java.lang.String = ReactAssetUtilsKt.getReactImageUrl(var12, var10.getUri(var11));
                  var12 = this.this$0.getApplicationContext();
                  val var13: ReactAsset = ReactAsset.CallConnect;
                  val var30: Context = this.this$0.getApplicationContext();
                  val var31: java.lang.String = ReactAssetUtilsKt.getReactImageUrl(var12, var13.getUri(var30));
                  val var34: G = fc.f.b((CoroutineScope)var8, null, null, new Function2<CoroutineScope, Continuation, Object>(this.this$0, var32, null) {
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
                        val var4: Any = Ha.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           kotlin.c.b(var1);
                        } else {
                           kotlin.c.b(var1);
                           var var3: IncomingCallActivity = this.this$0;
                           var1 = this.$callDisconnectUrl;
                           this.label = 1;
                           var3 = (IncomingCallActivity)IncomingCallActivity.access$fetchImage(var3, var1, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  var8 = fc.f.b((CoroutineScope)var8, null, null, new Function2<CoroutineScope, Continuation, Object>(this.this$0, var31, null) {
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
                        val var4: Any = Ha.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           kotlin.c.b(var1);
                        } else {
                           kotlin.c.b(var1);
                           var var3: IncomingCallActivity = this.this$0;
                           var1 = this.$callConnectUrl;
                           this.label = 1;
                           var3 = (IncomingCallActivity)IncomingCallActivity.access$fetchImage(var3, var1, this);
                           var1 = var3;
                           if (var3 === var4) {
                              return var4;
                           }
                        }

                        return var1;
                     }
                  }, 3, null);
                  this.L$0 = var4;
                  this.L$1 = var3x;
                  this.L$2 = var5;
                  this.L$3 = var6;
                  this.L$4 = var7;
                  this.L$5 = var1;
                  this.label = 1;
                  var8 = fc.d.b(new G[]{var34, (G)var8}, this);
                  if (var8 === var9) {
                     return var9;
                  }
               }

               val var20: Bitmap = (var8 as java.util.List).get(0) as Bitmap;
               var9 = (var8 as java.util.List).get(1) as Bitmap;
               var8 = Bitmap.createScaledBitmap(var20, 110, 110, true);
               var6.setImageBitmap((Bitmap)var8);
               var6.setImageTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getWhite()));
               var8 = Bitmap.createScaledBitmap((Bitmap)var9, 110, 110, true);
               var5.setImageBitmap((Bitmap)var8);
               var5.setImageTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getWhite()));
               var8 = this.this$0.getApplicationContext();
               var5.setContentDescription(I18nUtilsKt.i18nFormat$default((Context)var8, I18nMessage.KEYBIND_DESCRIPTION_MODAL_CALL_ACCEPT, null, 2, null));
               var5.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getStatusPositive()));
               var8 = this.this$0.getApplicationContext();
               var6.setContentDescription(I18nUtilsKt.i18nFormat$default((Context)var8, I18nMessage.KEYBIND_DESCRIPTION_MODAL_CALL_DECLINE, null, 2, null));
               var6.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getStatusDanger()));
               var8 = this.this$0.getApplicationContext();
               var7.setText(I18nUtilsKt.i18nFormat$default((Context)var8, I18nMessage.JOIN_CALL, null, 2, null));
               var8 = DiscordFont.PrimaryMedium;
               DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
               var7.setTextColor(ThemeManagerKt.getTheme().getWhite());
               val var17: Context = this.this$0.getApplicationContext();
               var1.setText(I18nUtilsKt.i18nFormat$default(var17, I18nMessage.DECLINE, null, 2, null));
               DiscordFontUtilsKt.setDiscordFont(var1, (DiscordFont)var8);
               var1.setTextColor(ThemeManagerKt.getTheme().getWhite());
               var5.setOnClickListener(new f(this.this$0, var4));
               var6.setOnClickListener(new g(this.this$0, var3x));
               return Unit.a;
            }
         },
         1,
         null
      );
   }

   private fun configureUser() {
      fc.f.f(
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, null) {
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
               val var5: Any = Ha.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  var var6: CoroutineScope;
                  var var7: java.lang.String;
                  label27: {
                     kotlin.c.b(var1);
                     var6 = this.L$0 as CoroutineScope;
                     var7 = this.this$0.getIntent().getStringExtra("username");
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

                  val var18: TextView = this.this$0.findViewById(R.id.userName) as TextView;
                  var18.setText(var7);
                  DiscordFontUtilsKt.setDiscordFont(var18, DiscordFont.PrimaryMedium);
                  var18.setTextColor(ThemeManagerKt.getTheme().getWhite());
                  val var14: G = fc.f.b(
                     var6,
                     null,
                     null,
                     new Function2<CoroutineScope, Continuation, Object>(this.this$0, var8, var3x, var1, var9, var16, null) {
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
                           val var4: Any = Ha.b.e();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }

                              kotlin.c.b(var1);
                           } else {
                              kotlin.c.b(var1);
                              var1 = this.this$0;
                              var var3: Context = this.this$0.getApplicationContext();
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
                  var3x = (GuildId)fc.d.b(new G[]{var14}, this);
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
      val var4: com.discord.image.fresco.FrescoModuleDiscord.Companion = FrescoModuleDiscord.Companion;
      var var3: Context = this.getApplicationContext();
      var4.initializeFresco(var3);
      var3 = this.getApplicationContext();
      return FrescoFetchDecodedImageKt.fetchDecodedImage(var3, var1, Circle.INSTANCE, true, var2);
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
      fc.f.f(null, new Function2<CoroutineScope, Continuation, Object>(this, null) {
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
            Ha.b.e();
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
                  val var8: TextView = this.this$0.findViewById(R.id.textView) as TextView;
                  val var4: Context = this.this$0.getApplicationContext();
                  var8.setText(I18nUtilsKt.i18nFormat$default(var4, I18nMessage.INCOMING_CALL, null, 2, null));
                  val var10: DiscordFont = DiscordFont.PrimaryMedium;
                  DiscordFontUtilsKt.setDiscordFont(var8, DiscordFont.PrimaryMedium);
                  val var5: Context = this.this$0.getApplicationContext();
                  var8.setTextColor(ColorUtilsKt.getColorCompat(var5, com.discord.theme.R.color.primary_330));
                  if (!var2x) {
                     val var9: TextView = this.this$0.findViewById(R.id.channelName) as TextView;
                     var9.setText(var1);
                     DiscordFontUtilsKt.setDiscordFont(var9, var10);
                     val var7: Context = this.this$0.getApplicationContext();
                     var9.setTextColor(ColorUtilsKt.getColorCompat(var7, com.discord.theme.R.color.primary_330));
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
         a.a(this, false);
         b.a(this, false);
      } else {
         this.getWindow().clearFlags(129);
      }
   }

   private fun turnScreenOnAndKeyguardOff() {
      val var1: Int = VERSION.SDK_INT;
      if (VERSION.SDK_INT >= 27) {
         a.a(this, true);
         b.a(this, true);
      } else {
         this.getWindow().addFlags(129);
      }

      var var2: Any = this.getSystemService("keyguard");
      var2 = var2 as KeyguardManager;
      if (var1 >= 26) {
         c.a((KeyguardManager)var2, this, null);
      }
   }

   protected open fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      this.setContentView(R.layout.incoming_call_screen);
      this.initView();
      this.turnScreenOnAndKeyguardOff();
      selfIntent = this;
   }

   protected open fun onDestroy() {
      super.onDestroy();
      this.turnScreenOffAndKeyguardOn();
   }

   public companion object {
      public final var selfIntent: AppCompatActivity?
         internal set
   }
}
