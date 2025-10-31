package com.discord.samsung

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Build.VERSION
import androidx.lifecycle.LifecycleOwner
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.samsung.SamsungConnectActivity.Result
import com.facebook.react.bridge.BaseActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import fm.p
import fm.v
import java.util.ArrayList
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import jp.f
import jp.k0
import km.b
import kotlin.Result.a
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.Response
import okhttp3.OkHttpClient.Builder

@SourceDebugExtension(["SMAP\nSamsungModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SamsungModule.kt\ncom/discord/samsung/SamsungModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,279:1\n29#2:280\n*S KotlinDebug\n*F\n+ 1 SamsungModule.kt\ncom/discord/samsung/SamsungModule\n*L\n249#1:280\n*E\n"])
public class SamsungModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public final val reactContext: ReactApplicationContext
   private final var connectionPromise: Promise?
   private final val samsungActivityEventListener: <unrepresentable>

   @JvmStatic
   fun {
      val var0: Intent = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT")
         .putExtra("client_id", "97t47j218f")
         .putExtra("progress_theme", "dark");
      disclaimerIntent = var0;
   }

   init {
      this.reactContext = var1;
      val var2: BaseActivityEventListener = new BaseActivityEventListener(this) {
         final SamsungModule this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onActivityResult(Activity var1, int var2, int var3, Intent var4) {
            if (var2 != 100) {
               if (var2 != 101) {
                  super.onActivityResult(var1, var2, var3, var4);
               } else {
                  var2 = 0;
                  if (var3 == 500) {
                     if (var4 != null) {
                        var2 = var4.getIntExtra("com.discord.samsung.intent.extra.ATTEMPT_COUNT", 0);
                     }

                     SamsungModule.access$handleAuthResult(this.this$0, new SamsungConnectActivity.Result.Failure(true, var2));
                  } else if (var4 == null) {
                     SamsungModule.access$handleAuthResult(this.this$0, new SamsungConnectActivity.Result.Failure(false, 0, 2, null));
                  } else {
                     val var17: java.lang.String = var4.getStringExtra("com.discord.samsung.intent.extra.AUTH_CODE");
                     var var9: java.lang.String = var17;
                     if (var17 == null) {
                        var9 = "";
                     }

                     var var14: java.lang.String = var4.getStringExtra("com.discord.samsung.intent.extra.SERVER_URL");
                     if (var14 == null) {
                        var14 = "";
                     }

                     SamsungModule.access$handleAuthResult(this.this$0, new SamsungConnectActivity.Result.Success(var9, var14));
                  }
               }
            } else if (var3 == -1) {
               SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
            } else {
               label47: {
                  if (var4 != null) {
                     val var7: Bundle = var4.getExtras();
                     if (var7 != null) {
                        var8 = var7.getString("error_message");
                        break label47;
                     }
                  }

                  var8 = null;
               }

               var var5: java.lang.String = null;
               if (var4 != null) {
                  val var12: Bundle = var4.getExtras();
                  var5 = null;
                  if (var12 != null) {
                     var5 = var12.getString("error_code");
                  }
               }

               val var16: SamsungModule = this.this$0;
               val var13: StringBuilder = new StringBuilder();
               var13.append("Connection requires disclaimer acceptance. [");
               var13.append(var5);
               var13.append("] ");
               var13.append(var8);
               SamsungModule.access$rejectConnection(var16, new java.lang.Throwable(var13.toString()));
            }
         }
      };
      this.samsungActivityEventListener = var2;
      this.getReactApplicationContext().addActivityEventListener(var2);
   }

   private fun getAccountUrlFromAuthServerUrl(authServerUrl: String): String {
      var1 = StringsKt.e1(var1, 2);
      val var2: Int = var1.hashCode();
      if (var2 != 3179) {
         if (var2 != 3248) {
            if (var2 == 3742 && var1.equals("us")) {
               return "https://us.account.samsung.com";
            }
         } else {
            var1.equals("eu");
         }
      } else if (var1.equals("cn")) {
         return "https://account.samsung.cn";
      }

      return "https://account.samsung.com";
   }

   private fun handleAuthResult(result: Result) {
      if (var1 is SamsungConnectActivity.Result.Success) {
         this.resolveConnection(
            NativeArrayExtensionsKt.nativeArrayOf(
               this.getAccountUrlFromAuthServerUrl((var1 as SamsungConnectActivity.Result.Success).getServerUrl()),
               (var1 as SamsungConnectActivity.Result.Success).getAuthCode()
            )
         );
      } else if (var1 is SamsungConnectActivity.Result.Failure) {
         val var7: SamsungConnectActivity.Result.Failure = var1 as SamsungConnectActivity.Result.Failure;
         if ((var1 as SamsungConnectActivity.Result.Failure).isRetryAllowed() && (var1 as SamsungConnectActivity.Result.Failure).getAttemptCount() < 2) {
            val var4: Activity = this.reactContext.getCurrentActivity();
            val var5: SamsungConnectActivity.Companion = SamsungConnectActivity.Companion;
            val var6: Activity = this.reactContext.getCurrentActivity();
            var4.startActivityForResult(var5.getIntent(var6, var7.getAttemptCount()), 101);
         } else {
            val var2: Int = var7.getAttemptCount();
            val var3: Boolean = var7.isRetryAllowed();
            val var8: StringBuilder = new StringBuilder();
            var8.append("Attempts: ");
            var8.append(var2);
            var8.append(", Retry: ");
            var8.append(var3);
            this.rejectConnection(new java.lang.Throwable(var8.toString()));
         }
      } else {
         throw new p();
      }
   }

   private fun handleSamsungCallback(response: Response): Uri? {
      var var5: java.lang.String = null;
      val var4: java.lang.String = Response.L(var1, "Location", null, 2, null);
      val var8: Uri;
      if (var4 != null) {
         var8 = Uri.parse(var4);
      } else {
         var8 = null;
      }

      var var2: Boolean = false;
      if (var8 != null) {
         val var6: java.lang.String = var8.getQuery();
         var2 = false;
         if (var6 != null) {
            var2 = StringsKt.N(var6, "error", false, 2, null);
         }
      }

      if (var2 || !var1.isSuccessful() && !var1.U()) {
         label29: {
            if (var8 != null) {
               val var9: java.lang.String = var8.getQueryParameter("error");
               var7 = var9;
               if (var9 != null) {
                  break label29;
               }
            }

            var7 = "unknown";
         }

         if (var8 != null) {
            var5 = var8.getQueryParameter("error_description");
         }

         throw new SamsungModule.Companion.SamsungCallbackException(var7, var5);
      } else {
         return var8;
      }
   }

   private fun rejectConnection(throwable: Throwable) {
      if (this.connectionPromise != null) {
         this.connectionPromise.reject(var1);
      }

      this.connectionPromise = null;
   }

   private fun resolveConnection(what: Any? = null) {
      if (this.connectionPromise != null) {
         this.connectionPromise.resolve(var1);
      }

      this.connectionPromise = null;
   }

   @ReactMethod
   public fun checkIfOAuthRequest(clientId: String, promise: Promise) {
      var var3: Boolean;
      label14: {
         if (var1 == "591317049637339146" && VERSION.SDK_INT >= 28) {
            var3 = true;
            if (StringsKt.u(Build.MANUFACTURER, "samsung", true)) {
               break label14;
            }
         }

         var3 = false;
      }

      var2.resolve(var3);
   }

   @ReactMethod
   public fun finishSamsungAuthorization(authCode: String, location: String?, state: String?, promise: Promise) {
      this.connectionPromise = var4;
      val var5: Activity = this.reactContext.getCurrentActivity();
      f.d(
         androidx.lifecycle.p.a(var5 as LifecycleOwner),
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(var2, this, var3, var1, null) {
            final java.lang.String $authCode;
            final java.lang.String $location;
            final java.lang.String $state;
            private Object L$0;
            int label;
            final SamsungModule this$0;

            {
               super(2, var5);
               this.$location = var1;
               this.this$0 = var2x;
               this.$state = var3x;
               this.$authCode = var4;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.$location, this.this$0, this.$state, this.$authCode, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               label43: {
                  val var3x: Any = b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     try {
                        c.b(var1);
                     } catch (var12: java.lang.Throwable) {
                        var1 = kotlin.Result.e;
                        var1 = kotlin.Result.b(c.a(var12));
                        break label43;
                     }
                  } else {
                     c.b(var1);
                     val var24: CoroutineScope = this.L$0 as CoroutineScope;
                     val var5: java.lang.String = this.$location;
                     val var6: SamsungModule = this.this$0;
                     val var25: java.lang.String = this.$state;
                     val var4: java.lang.String = this.$authCode;

                     try {
                        val var7: a = kotlin.Result.e;
                        val var8: OkHttpClient = new Builder().k(false).c();
                        val var9: CoroutineDispatcher = k0.b();
                        val var31: Function2 = new Function2<CoroutineScope, Continuation, Object>(var5, var6, var8, var25, var4, null) {
                           final java.lang.String $authCode;
                           final OkHttpClient $client;
                           final java.lang.String $location;
                           final java.lang.String $state;
                           int label;
                           final SamsungModule this$0;

                           {
                              super(2, var6x);
                              this.$location = var1;
                              this.this$0 = var2x;
                              this.$client = var3x;
                              this.$state = var4x;
                              this.$authCode = var5x;
                           }

                           public final Continuation create(Object var1, Continuation var2) {
                              return new <anonymous constructor>(this.$location, this.this$0, this.$client, this.$state, this.$authCode, var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.e();
                              if (this.label != 0) {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              } else {
                                 c.b(var1);
                                 var1 = new okhttp3.Request.Builder().d();
                                 val var2x: java.lang.String = this.$location;
                                 val var9: Uri = SamsungModule.access$handleSamsungCallback(this.this$0, this.$client.a(var1.l(var2x).b()).execute());
                                 if (var9 != null) {
                                    val var10: java.lang.String = var9.getQueryParameter("redirect_uri");
                                    if (var10 != null) {
                                       val var4: Pair = v.a("state", this.$state);
                                       var var3: java.lang.String = this.$authCode;
                                       val var12: StringBuilder = new StringBuilder();
                                       var12.append("{\"code\":\"");
                                       var12.append(var3);
                                       var12.append("\"}");
                                       val var16: java.util.Map = n0.m(new Pair[]{var4, v.a("code", var12.toString())});
                                       val var13: ArrayList = new ArrayList(var16.size());

                                       for (Entry var5 : var16.entrySet()) {
                                          var3 = var5.getKey() as java.lang.String;
                                          val var19: java.lang.String = var5.getValue() as java.lang.String;
                                          val var6: StringBuilder = new StringBuilder();
                                          var6.append(var3);
                                          var6.append("=");
                                          var6.append(var19);
                                          var13.add(var6.toString());
                                       }

                                       SamsungModule.access$handleSamsungCallback(
                                          this.this$0,
                                          this.$client
                                             .a(
                                                new okhttp3.Request.Builder()
                                                   .h(
                                                      RequestBody.Companion
                                                         .b(
                                                            CollectionsKt.r0(var13, "&", null, null, 0, null, null, 62, null),
                                                            MediaType.g.a("application/x-www-form-urlencoded")
                                                         )
                                                   )
                                                   .l(var10)
                                                   .b()
                                             )
                                             .execute()
                                       );
                                       SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
                                       return Unit.a;
                                    }
                                 }

                                 throw new SamsungModule.Companion.SamsungCallbackException("no_redirect_uri", "No redirect uri returned from GET /callback");
                              }
                           }
                        };
                        this.label = 1;
                        if (f.g(var9, var31, this) === var3x) {
                           return var3x;
                        }
                     } catch (var11: java.lang.Throwable) {
                        var1 = kotlin.Result.e;
                        var1 = kotlin.Result.b(c.a(var11));
                        break label43;
                     }
                  }

                  label33:
                  try {
                     var1 = kotlin.Result.b(Unit.a);
                  } catch (var10: java.lang.Throwable) {
                     var1 = kotlin.Result.e;
                     var1 = kotlin.Result.b(c.a(var10));
                     break label33;
                  }
               }

               val var29: SamsungModule = this.this$0;
               val var28: java.lang.Throwable = kotlin.Result.e(var1);
               if (var28 != null) {
                  if (var28 is CancellationException) {
                     throw var28;
                  }

                  SamsungModule.access$rejectConnection(var29, var28);
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }

   @ReactMethod
   public fun getAccountUrlAndAuthCode(promise: Promise) {
      this.connectionPromise = var1;

      label16:
      try {
         val var7: a = kotlin.Result.e;
         val var10: ReactApplicationContext = this.getReactApplicationContext();
         val var8: SamsungConnectActivity.Companion = SamsungConnectActivity.Companion;
         val var3: Activity = this.reactContext.getCurrentActivity();
         var6 = kotlin.Result.b(var10.startActivityForResult(SamsungConnectActivity.Companion.getIntent$default(var8, var3, 0, 2, null), 101, Bundle.EMPTY));
      } catch (var4: java.lang.Throwable) {
         val var2: a = kotlin.Result.e;
         var6 = kotlin.Result.b(c.a(var4));
         break label16;
      }

      val var9: java.lang.Throwable = kotlin.Result.e(var6);
      if (var9 != null) {
         this.rejectConnection(var9);
      }
   }

   public override fun getName(): String {
      return "Samsung";
   }

   @ReactMethod
   public fun showConnectionDisclaimer(promise: Promise) {
      this.connectionPromise = var1;

      label16:
      try {
         val var6: a = kotlin.Result.e;
         var5 = kotlin.Result.b(this.getReactApplicationContext().startActivityForResult(disclaimerIntent, 100, Bundle.EMPTY));
      } catch (var3: java.lang.Throwable) {
         val var2: a = kotlin.Result.e;
         var5 = kotlin.Result.b(c.a(var3));
         break label16;
      }

      val var7: java.lang.Throwable = kotlin.Result.e(var5);
      if (var7 != null) {
         this.rejectConnection(var7);
      }
   }

   public companion object {
      private final val disclaimerIntent: Intent

      private object RequestCode {
         public const val CONNECTION_DISCLAIMER: Int = 100
         public const val AUTH: Int = 101
      }

      public class SamsungCallbackException(errorCode: String, errorMsg: String?) : IllegalStateException {
         init {
            val var3: StringBuilder = new StringBuilder();
            var3.append("[");
            var3.append(var1);
            var3.append("] ");
            var3.append(var2);
            super(var3.toString());
         }
      }
   }
}
