package com.discord.samsung

import Aa.K
import Aa.f
import R8.n
import R8.s
import Y8.b
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Build.VERSION
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.m
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.samsung.SamsungConnectActivity.Result
import com.facebook.react.bridge.BaseActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import java.util.ArrayList
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import kotlin.Result.a
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.Response
import okhttp3.OkHttpClient.Builder

public class SamsungModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final var connectionPromise: Promise?
   private final val samsungActivityEventListener: <unrepresentable>

   @JvmStatic
   fun {
      val var0: Intent = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT")
         .putExtra("client_id", "97t47j218f")
         .putExtra("progress_theme", "dark");
      q.g(var0, "putExtra(...)");
      disclaimerIntent = var0;
   }

   init {
      q.h(var1, "reactContext");
      super(var1);
      val var2: BaseActivityEventListener = new BaseActivityEventListener(this) {
         final SamsungModule this$0;

         {
            this.this$0 = var1;
         }

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
                     val var16: java.lang.String = var4.getStringExtra("com.discord.samsung.intent.extra.AUTH_CODE");
                     var var8: java.lang.String = var16;
                     if (var16 == null) {
                        var8 = "";
                     }

                     var var12: java.lang.String = var4.getStringExtra("com.discord.samsung.intent.extra.SERVER_URL");
                     if (var12 == null) {
                        var12 = "";
                     }

                     SamsungModule.access$handleAuthResult(this.this$0, new SamsungConnectActivity.Result.Success(var8, var12));
                  }
               }
            } else if (var3 == -1) {
               SamsungModule.resolveConnection$default(this.this$0, null, 1, null);
            } else {
               label44: {
                  if (var4 != null) {
                     val var9: Bundle = var4.getExtras();
                     if (var9 != null) {
                        var10 = var9.getString("error_message");
                        break label44;
                     }
                  }

                  var10 = null;
               }

               var var15: java.lang.String = null;
               if (var4 != null) {
                  val var13: Bundle = var4.getExtras();
                  var15 = null;
                  if (var13 != null) {
                     var15 = var13.getString("error_code");
                  }
               }

               val var14: SamsungModule = this.this$0;
               val var17: StringBuilder = new StringBuilder();
               var17.append("Connection requires disclaimer acceptance. [");
               var17.append(var15);
               var17.append("] ");
               var17.append(var10);
               SamsungModule.access$rejectConnection(var14, new java.lang.Throwable(var17.toString()));
            }
         }
      };
      this.samsungActivityEventListener = var2;
      this.getReactApplicationContext().addActivityEventListener(var2);
   }

   private fun getAccountUrlFromAuthServerUrl(authServerUrl: String): String {
      val var3: java.lang.String = h.e1(var1, 2);
      val var2: Int = var3.hashCode();
      var1 = "https://account.samsung.com";
      if (var2 != 3179) {
         if (var2 != 3248) {
            if (var2 == 3742 && var3.equals("us")) {
               var1 = "https://us.account.samsung.com";
            }
         } else {
            var3.equals("eu");
         }
      } else if (var3.equals("cn")) {
         var1 = "https://account.samsung.cn";
      }

      return var1;
   }

   private fun handleAuthResult(result: Result) {
      if (var1 is SamsungConnectActivity.Result.Success) {
         this.resolveConnection(
            NativeArrayExtensionsKt.nativeArrayOf(
               this.getAccountUrlFromAuthServerUrl((var1 as SamsungConnectActivity.Result.Success).getServerUrl()),
               (var1 as SamsungConnectActivity.Result.Success).getAuthCode()
            )
         );
      } else {
         if (var1 !is SamsungConnectActivity.Result.Failure) {
            throw new n();
         }

         val var6: SamsungConnectActivity.Result.Failure = var1 as SamsungConnectActivity.Result.Failure;
         if ((var1 as SamsungConnectActivity.Result.Failure).isRetryAllowed() && (var1 as SamsungConnectActivity.Result.Failure).getAttemptCount() < 2) {
            val var5: Activity = this.getCurrentActivity();
            q.e(var5);
            val var4: SamsungConnectActivity.Companion = SamsungConnectActivity.Companion;
            val var9: Activity = this.getCurrentActivity();
            q.e(var9);
            var5.startActivityForResult(var4.getIntent(var9, var6.getAttemptCount()), 101);
         } else {
            val var2: Int = var6.getAttemptCount();
            val var3: Boolean = var6.isRetryAllowed();
            val var8: StringBuilder = new StringBuilder();
            var8.append("Attempts: ");
            var8.append(var2);
            var8.append(", Retry: ");
            var8.append(var3);
            this.rejectConnection(new java.lang.Throwable(var8.toString()));
         }
      }
   }

   private fun handleSamsungCallback(response: Response): Uri? {
      var var5: java.lang.String = null;
      val var4: java.lang.String = Response.R(var1, "Location", null, 2, null);
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
            var2 = h.N(var6, "error", false, 2, null);
         }
      }

      if (var2 || !var1.Z0() && !var1.j0()) {
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
         q.h(var1, "clientId");
         q.h(var2, "promise");
         if (q.c(var1, "591317049637339146") && VERSION.SDK_INT >= 28) {
            var3 = true;
            if (h.u(Build.MANUFACTURER, "samsung", true)) {
               break label14;
            }
         }

         var3 = false;
      }

      var2.resolve(var3);
   }

   @ReactMethod
   public fun finishSamsungAuthorization(authCode: String, location: String?, state: String?, promise: Promise) {
      q.h(var1, "authCode");
      q.h(var4, "promise");
      this.connectionPromise = var4;
      val var5: Activity = this.getCurrentActivity();
      q.f(var5, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
      f.d(
         m.a(var5 as LifecycleOwner),
         null,
         null,
         new Function2(var2, this, var3, var1, null) {
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
                  var var3x: Any = b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     try {
                        c.b(var1);
                     } catch (var12: java.lang.Throwable) {
                        var3x = kotlin.Result.k;
                        var1 = kotlin.Result.b(c.a(var12));
                        break label43;
                     }
                  } else {
                     c.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                     val var4: java.lang.String = this.$location;
                     val var6: SamsungModule = this.this$0;
                     val var24: java.lang.String = this.$state;
                     val var5: java.lang.String = this.$authCode;

                     try {
                        val var7: a = kotlin.Result.k;
                        val var8: OkHttpClient = new Builder().k(false).c();
                        val var31: CoroutineDispatcher = K.b();
                        val var9: Function2 = new Function2(var4, var6, var8, var24, var5, null) {
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
                                 val var2x: okhttp3.Request.Builder = new okhttp3.Request.Builder().d();
                                 var1 = this.$location;
                                 q.e(this.$location);
                                 val var9: Uri = SamsungModule.access$handleSamsungCallback(this.this$0, this.$client.b(var2x.l(var1).b()).execute());
                                 if (var9 != null) {
                                    var1 = var9.getQueryParameter("redirect_uri");
                                    if (var1 != null) {
                                       val var4: Pair = s.a("state", this.$state);
                                       val var12: java.lang.String = this.$authCode;
                                       val var3: StringBuilder = new StringBuilder();
                                       var3.append("{\"code\":\"");
                                       var3.append(var12);
                                       var3.append("\"}");
                                       val var16: java.util.Map = S8.q.l(new Pair[]{var4, s.a("code", var3.toString())});
                                       val var13: ArrayList = new ArrayList(var16.size());

                                       for (Entry var5 : var16.entrySet()) {
                                          val var17: java.lang.String = var5.getKey() as java.lang.String;
                                          val var6: java.lang.String = var5.getValue() as java.lang.String;
                                          val var19: StringBuilder = new StringBuilder();
                                          var19.append(var17);
                                          var19.append("=");
                                          var19.append(var6);
                                          var13.add(var19.toString());
                                       }

                                       SamsungModule.access$handleSamsungCallback(
                                          this.this$0,
                                          this.$client
                                             .b(
                                                new okhttp3.Request.Builder()
                                                   .h(
                                                      RequestBody.Companion
                                                         .b(
                                                            i.o0(var13, "&", null, null, 0, null, null, 62, null),
                                                            MediaType.g.a("application/x-www-form-urlencoded")
                                                         )
                                                   )
                                                   .l(var1)
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
                        if (f.g(var31, var9, this) === var3x) {
                           return var3x;
                        }
                     } catch (var11: java.lang.Throwable) {
                        var3x = kotlin.Result.k;
                        var1 = kotlin.Result.b(c.a(var11));
                        break label43;
                     }
                  }

                  label33:
                  try {
                     var1 = kotlin.Result.b(Unit.a);
                  } catch (var10: java.lang.Throwable) {
                     var3x = kotlin.Result.k;
                     var1 = kotlin.Result.b(c.a(var10));
                     break label33;
                  }
               }

               val var29: SamsungModule = this.this$0;
               val var25: java.lang.Throwable = kotlin.Result.e(var1);
               if (var25 != null) {
                  if (var25 is CancellationException) {
                     throw var25;
                  }

                  SamsungModule.access$rejectConnection(var29, var25);
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
      q.h(var1, "promise");
      this.connectionPromise = var1;

      label16:
      try {
         val var8: a = kotlin.Result.k;
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         val var9: SamsungConnectActivity.Companion = SamsungConnectActivity.Companion;
         val var3: Activity = this.getCurrentActivity();
         q.e(var3);
         var7 = kotlin.Result.b(var2.startActivityForResult(SamsungConnectActivity.Companion.getIntent$default(var9, var3, 0, 2, null), 101, Bundle.EMPTY));
      } catch (var4: java.lang.Throwable) {
         val var6: a = kotlin.Result.k;
         var7 = kotlin.Result.b(c.a(var4));
         break label16;
      }

      val var10: java.lang.Throwable = kotlin.Result.e(var7);
      if (var10 != null) {
         this.rejectConnection(var10);
      }
   }

   public open fun getName(): String {
      return "Samsung";
   }

   @ReactMethod
   public fun showConnectionDisclaimer(promise: Promise) {
      q.h(var1, "promise");
      this.connectionPromise = var1;

      label16:
      try {
         val var6: a = kotlin.Result.k;
         var5 = kotlin.Result.b(this.getReactApplicationContext().startActivityForResult(disclaimerIntent, 100, Bundle.EMPTY));
      } catch (var3: java.lang.Throwable) {
         val var2: a = kotlin.Result.k;
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
            q.h(var1, "errorCode");
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
