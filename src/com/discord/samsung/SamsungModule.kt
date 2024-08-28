package com.discord.samsung

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Build.VERSION
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.n
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.samsung.SamsungConnectActivity.Result
import com.facebook.react.bridge.BaseActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import eh.s
import eh.r.a
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineScope
import okhttp3.Response

public class SamsungModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final var connectionPromise: Promise?
   private final val samsungActivityEventListener: <unrepresentable>

   @JvmStatic
   fun {
      val var0: Intent = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT")
         .putExtra("client_id", "97t47j218f")
         .putExtra("progress_theme", "dark");
      r.g(var0, "Intent(\"com.msc.action.s…\"progress_theme\", \"dark\")");
      disclaimerIntent = var0;
   }

   init {
      r.h(var1, "reactContext");
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

               val var17: SamsungModule = this.this$0;
               val var14: StringBuilder = new StringBuilder();
               var14.append("Connection requires disclaimer acceptance. [");
               var14.append(var15);
               var14.append("] ");
               var14.append(var10);
               SamsungModule.access$rejectConnection(var17, new java.lang.Throwable(var14.toString()));
            }
         }
      };
      this.samsungActivityEventListener = var2;
      this.getReactApplicationContext().addActivityEventListener(var2);
   }

   private fun getAccountUrlFromAuthServerUrl(authServerUrl: String): String {
      val var3: java.lang.String = f.b1(var1, 2);
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
               new Object[]{
                  this.getAccountUrlFromAuthServerUrl((var1 as SamsungConnectActivity.Result.Success).getServerUrl()),
                  (var1 as SamsungConnectActivity.Result.Success).getAuthCode()
               }
            )
         );
      } else if (var1 is SamsungConnectActivity.Result.Failure) {
         val var8: SamsungConnectActivity.Result.Failure = var1 as SamsungConnectActivity.Result.Failure;
         if ((var1 as SamsungConnectActivity.Result.Failure).isRetryAllowed() && (var1 as SamsungConnectActivity.Result.Failure).getAttemptCount() < 2) {
            val var6: Activity = this.getCurrentActivity();
            r.e(var6);
            val var5: SamsungConnectActivity.Companion = SamsungConnectActivity.Companion;
            val var4: Activity = this.getCurrentActivity();
            r.e(var4);
            var6.startActivityForResult(var5.getIntent(var4, var8.getAttemptCount()), 101);
         } else {
            val var2: Int = var8.getAttemptCount();
            val var3: Boolean = var8.isRetryAllowed();
            val var9: StringBuilder = new StringBuilder();
            var9.append("Attempts: ");
            var9.append(var2);
            var9.append(", Retry: ");
            var9.append(var3);
            this.rejectConnection(new java.lang.Throwable(var9.toString()));
         }
      }
   }

   private fun handleSamsungCallback(response: Response): Uri? {
      var var5: java.lang.String = null;
      val var4: java.lang.String = Response.I(var1, "Location", null, 2, null);
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
            var2 = f.N(var6, "error", false, 2, null);
         }
      }

      if (var2 || !var1.v0() && !var1.S()) {
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
         r.h(var1, "clientId");
         r.h(var2, "promise");
         if (r.c(var1, "591317049637339146") && VERSION.SDK_INT >= 28) {
            var3 = true;
            if (f.u(Build.MANUFACTURER, "samsung", true)) {
               break label14;
            }
         }

         var3 = false;
      }

      var2.resolve(var3);
   }

   @ReactMethod
   public fun finishSamsungAuthorization(authCode: String, location: String?, state: String?, promise: Promise) {
      r.h(var1, "authCode");
      r.h(var4, "promise");
      this.connectionPromise = var4;
      val var5: Activity = this.getCurrentActivity();
      r.f(var5, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
      kk.f.d(
         n.a(var5 as LifecycleOwner),
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var2, this, var3, var1, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at java.base/java.util.Objects.hash(Objects.java:133)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper$VarInMethod.hashCode(VarDefinitionHelper.java:1408)
   ,
         3,
         null
      );
   }

   @ReactMethod
   public fun getAccountUrlAndAuthCode(promise: Promise) {
      r.h(var1, "promise");
      this.connectionPromise = var1;

      label16:
      try {
         val var7: a = eh.r.k;
         val var10: ReactApplicationContext = this.getReactApplicationContext();
         val var3: SamsungConnectActivity.Companion = SamsungConnectActivity.Companion;
         val var8: Activity = this.getCurrentActivity();
         r.e(var8);
         var6 = eh.r.b(var10.startActivityForResult(SamsungConnectActivity.Companion.getIntent$default(var3, var8, 0, 2, null), 101, Bundle.EMPTY));
      } catch (var4: java.lang.Throwable) {
         val var2: a = eh.r.k;
         var6 = eh.r.b(s.a(var4));
         break label16;
      }

      val var9: java.lang.Throwable = eh.r.e(var6);
      if (var9 != null) {
         this.rejectConnection(var9);
      }
   }

   public open fun getName(): String {
      return "Samsung";
   }

   @ReactMethod
   public fun showConnectionDisclaimer(promise: Promise) {
      r.h(var1, "promise");
      this.connectionPromise = var1;

      label16:
      try {
         val var6: a = eh.r.k;
         var5 = eh.r.b(this.getReactApplicationContext().startActivityForResult(disclaimerIntent, 100, Bundle.EMPTY));
      } catch (var3: java.lang.Throwable) {
         val var2: a = eh.r.k;
         var5 = eh.r.b(s.a(var3));
         break label16;
      }

      val var7: java.lang.Throwable = eh.r.e(var5);
      if (var7 != null) {
         this.rejectConnection(var7);
      }
   }

   public companion object {
      private final val disclaimerIntent: Intent

      private object RequestCode {
         public const val AUTH: Int = 101
         public const val CONNECTION_DISCLAIMER: Int = 100
      }

      public class SamsungCallbackException(errorCode: String, errorMsg: String?) : IllegalStateException {
         init {
            r.h(var1, "errorCode");
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
