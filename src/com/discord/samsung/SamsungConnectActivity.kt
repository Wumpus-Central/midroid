package com.discord.samsung

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import androidx.appcompat.app.b
import com.discord.logging.Log
import com.msc.sa.aidl.ISACallback
import com.msc.sa.aidl.a
import com.msc.sa.aidl.ISACallback.Stub
import kotlin.jvm.internal.q

public class SamsungConnectActivity : b {
   private final lateinit var samsungAccountServiceCallback: ISACallback
   private final var serviceBound: Boolean

   private final val serviceConnection: <unrepresentable> =
      new ServiceConnection(this) {
         final SamsungConnectActivity this$0;

         {
            this.this$0 = var1;
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         // $VF: Could not inline inconsistent finally blocks
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         public void onServiceConnected(ComponentName var1, IBinder var2) {
            SamsungConnectActivity.access$setServiceBound$p(this.this$0, true);
            val var5: a = com.msc.sa.aidl.a.a.a(var2);
            val var4: Log = Log.INSTANCE;
            Log.i$default(Log.INSTANCE, "Samsung", "Samsung Account service connection established", null, 4, null);

            try {
               var40 = SamsungConnectActivity.access$getSamsungAccountServiceCallback$p(this.this$0);
            } catch (var11: java.lang.Throwable) {
               Log.INSTANCE.e("Samsung", "Unable to connect to Samsung", var11);
               SamsungConnectActivity.access$finishWithResult(this.this$0, null, null);
               return;
            }

            var var37: ISACallback = var40;
            if (var40 == null) {
               try {
                  q.y("samsungAccountServiceCallback");
               } catch (var10: java.lang.Throwable) {
                  Log.INSTANCE.e("Samsung", "Unable to connect to Samsung", var10);
                  SamsungConnectActivity.access$finishWithResult(this.this$0, null, null);
                  return;
               }

               var37 = null;
            }

            try {
               var38 = var5.S("97t47j218f", "dummy", "com.discord", var37);
               val var41: StringBuilder = new StringBuilder();
               var41.append("Samsung Account service connection established: ");
               var41.append(var38);
               Log.i$default(var4, "Samsung", var41.toString(), null, 4, null);
            } catch (var9: java.lang.Throwable) {
               Log.INSTANCE.e("Samsung", "Unable to connect to Samsung", var9);
               SamsungConnectActivity.access$finishWithResult(this.this$0, null, null);
               return;
            }

            if (var38 == null) {
               try {
                  SamsungConnectActivity.access$finishedWithRestartRequested(this.this$0);
                  return;
               } catch (var8: java.lang.Throwable) {
                  Log.INSTANCE.e("Samsung", "Unable to connect to Samsung", var8);
                  SamsungConnectActivity.access$finishWithResult(this.this$0, null, null);
                  return;
               }
            } else {
               try {
                  val var42: Bundle = new Bundle();
                  var42.putStringArray("additional", new java.lang.String[]{"api_server_url", "auth_server_url"});
                  val var3: Boolean = var5.f0(1221, var38, var42);
                  val var39: StringBuilder = new StringBuilder();
                  var39.append("Samsung Account service connection established: isReqSucc? ");
                  var39.append(var3);
                  Log.i$default(var4, "Samsung", var39.toString(), null, 4, null);
               } catch (var7: java.lang.Throwable) {
                  Log.INSTANCE.e("Samsung", "Unable to connect to Samsung", var7);
                  SamsungConnectActivity.access$finishWithResult(this.this$0, null, null);
                  return;
               }
            }
         }

         public void onServiceDisconnected(ComponentName var1) {
            Log.i$default(Log.INSTANCE, "Samsung", "Samsung Account service connection unbound", null, 4, null);
            SamsungConnectActivity.access$setServiceBound$p(this.this$0, false);
            this.this$0.finish();
         }
      }

   @JvmStatic
   fun {
      val var0: Intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE").setPackage("com.osp.app.signin");
      q.g(var0, "setPackage(...)");
      serviceIntent = var0;
   }

   private fun createCallback(): Stub {
      return new Stub(this) {
         final SamsungConnectActivity this$0;

         {
            this.this$0 = var1;
         }

         public void onReceiveAccessToken(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceiveAccessToken".toString());
         }

         public void onReceiveAuthCode(int var1, boolean var2, Bundle var3) {
            var var7: java.lang.String = null;
            val var4: java.lang.String;
            if (var3 != null) {
               var4 = var3.getString("authcode");
            } else {
               var4 = null;
            }

            val var5: java.lang.String;
            if (var3 != null) {
               var5 = var3.getString("auth_server_url");
            } else {
               var5 = null;
            }

            val var8: Log = Log.INSTANCE;
            val var6: StringBuilder = new StringBuilder();
            var6.append("Samsung onReceiveAuthCode=");
            var6.append(var2);
            Log.i$default(var8, "Samsung", var6.toString(), null, 4, null);
            if (!var2 || var4 == null || h.x(var4)) {
               val var13: java.lang.String;
               if (var3 != null) {
                  var13 = var3.getString("error_code");
               } else {
                  var13 = null;
               }

               val var11: java.lang.String;
               if (var3 != null) {
                  var11 = var3.getString("error_message");
               } else {
                  var11 = null;
               }

               val var9: StringBuilder = new StringBuilder();
               var9.append("Samsung Account link failure ");
               if (var4 != null) {
                  var7 = h.d1(var4, 4);
               }

               val var10: StringBuilder = new StringBuilder();
               var10.append("[");
               var10.append(var13);
               var10.append(":");
               var10.append(var7);
               var10.append("]: ");
               var10.append(var11);
               var9.append(var10.toString());
               val var12: java.lang.String = var9.toString();
               q.g(var12, "toString(...)");
               Log.w$default(var8, "Samsung", var12, null, 4, null);
            }

            SamsungConnectActivity.access$finishWithResult(this.this$0, var4, var5);
         }

         public void onReceiveChecklistValidation(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceiveAccessToken".toString());
         }

         public void onReceiveDisclaimerAgreement(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceiveDisclaimerAgreement".toString());
         }

         public void onReceivePasswordConfirmation(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceivePasswordConfirmation".toString());
         }

         public void onReceiveRLControlFMM(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceiveRLControlFMM".toString());
         }

         public void onReceiveRubinRequest(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceiveRubinRequest".toString());
         }

         public void onReceiveSCloudAccessToken(int var1, boolean var2, Bundle var3) {
            throw new IllegalStateException("Unexpected call to onReceiveSCloudAccessToken".toString());
         }
      };
   }

   private fun finishWithResult(authCode: String?, authServerUrl: String?) {
      val var4: Log = Log.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("Finishing With Result. AuthCode: ");
      var3.append(var1);
      var3.append(", AuthServerUrl: ");
      var3.append(var2);
      Log.i$default(var4, "Samsung", var3.toString(), null, 4, null);
      if (var1 != null && !h.x(var1) && var2 != null && !h.x(var2)) {
         val var6: Intent = new Intent();
         var6.putExtra("com.discord.samsung.intent.extra.AUTH_CODE", var1);
         var6.putExtra("com.discord.samsung.intent.extra.SERVER_URL", var2);
         this.setResult(-1, var6);
      } else {
         this.setResult(0);
      }

      this.finish();
   }

   private fun finishedWithRestartRequested() {
      Log.i$default(Log.INSTANCE, "Samsung", "finishedWithRestartRequested", null, 4, null);
      this.setResult(
         500,
         new Intent()
            .putExtra("com.discord.samsung.intent.extra.ATTEMPT_COUNT", this.getIntent().getIntExtra("com.discord.samsung.intent.extra.ATTEMPT_COUNT", 0) + 1)
      );
      this.finish();
   }

   private fun startAndBindSamsungAuthService() {
      val var1: Log = Log.INSTANCE;
      Log.i$default(Log.INSTANCE, "Samsung", "Samsung starting SA Service", null, 4, null);
      val var2: Intent = serviceIntent;
      if (this.startService(serviceIntent) == null) {
         Log.e$default(var1, "Samsung", "Samsung Account service could not be started", null, 4, null);
      } else {
         if (!this.bindService(var2, this.serviceConnection, 1)) {
            Log.e$default(var1, "Samsung", "Samsung Account service could not be bound", null, 4, null);
         }
      }
   }

   protected override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      Log.i$default(Log.INSTANCE, "Samsung", "onCreate SamsungConnectActivity", null, 4, null);
      this.samsungAccountServiceCallback = this.createCallback();
      this.startAndBindSamsungAuthService();
   }

   protected override fun onStop() {
      Log.i$default(Log.INSTANCE, "Samsung", "onStop SamsungConnectActivity", null, 4, null);
      if (this.serviceBound) {
         this.unbindService(this.serviceConnection);
         this.serviceBound = false;
      }

      super.onStop();
   }

   public companion object {
      public const val EXTRA_ATTEMPT_COUNT: String
      public const val EXTRA_REQ_AUTH_PARAM_AUTH_CODE: String
      public const val EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL: String
      private const val LOG_TAG: String
      public const val RESULT_SA_BINDING_FAILED: Int
      private const val SAMSUNG_REQ_ID: Int
      private final val serviceIntent: Intent

      public fun getIntent(context: Context, attemptCount: Int = 0): Intent {
         q.h(var1, "context");
         val var3: Intent = new Intent(var1, SamsungConnectActivity.class).putExtra("com.discord.samsung.intent.extra.ATTEMPT_COUNT", var2).addFlags(65536);
         q.g(var3, "addFlags(...)");
         return var3;
      }
   }

   public sealed class Result protected constructor() {
      public data class Failure(isRetryAllowed: Boolean, attemptCount: Int = 0) : SamsungConnectActivity.Result() {
         public final val attemptCount: Int
         public final val isRetryAllowed: Boolean

         init {
            this.isRetryAllowed = var1;
            this.attemptCount = var2;
         }

         public operator fun component1(): Boolean {
            return this.isRetryAllowed;
         }

         public operator fun component2(): Int {
            return this.attemptCount;
         }

         public fun copy(isRetryAllowed: Boolean = var0.isRetryAllowed, attemptCount: Int = var0.attemptCount): com.discord.samsung.SamsungConnectActivity.Result.Failure {
            return new SamsungConnectActivity.Result.Failure(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is SamsungConnectActivity.Result.Failure) {
               return false;
            } else {
               var1 = var1;
               if (this.isRetryAllowed != var1.isRetryAllowed) {
                  return false;
               } else {
                  return this.attemptCount == var1.attemptCount;
               }
            }
         }

         public override fun hashCode(): Int {
            return java.lang.Boolean.hashCode(this.isRetryAllowed) * 31 + Integer.hashCode(this.attemptCount);
         }

         public override fun toString(): String {
            val var2: Boolean = this.isRetryAllowed;
            val var1: Int = this.attemptCount;
            val var3: StringBuilder = new StringBuilder();
            var3.append("Failure(isRetryAllowed=");
            var3.append(var2);
            var3.append(", attemptCount=");
            var3.append(var1);
            var3.append(")");
            return var3.toString();
         }
      }

      public data class Success(authCode: String, serverUrl: String) : SamsungConnectActivity.Result {
         public final val authCode: String
         public final val serverUrl: String

         init {
            q.h(var1, "authCode");
            q.h(var2, "serverUrl");
            super(null);
            this.authCode = var1;
            this.serverUrl = var2;
         }

         public operator fun component1(): String {
            return this.authCode;
         }

         public operator fun component2(): String {
            return this.serverUrl;
         }

         public fun copy(authCode: String = var0.authCode, serverUrl: String = var0.serverUrl): com.discord.samsung.SamsungConnectActivity.Result.Success {
            q.h(var1, "authCode");
            q.h(var2, "serverUrl");
            return new SamsungConnectActivity.Result.Success(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is SamsungConnectActivity.Result.Success) {
               return false;
            } else {
               var1 = var1;
               if (!q.c(this.authCode, var1.authCode)) {
                  return false;
               } else {
                  return q.c(this.serverUrl, var1.serverUrl);
               }
            }
         }

         public override fun hashCode(): Int {
            return this.authCode.hashCode() * 31 + this.serverUrl.hashCode();
         }

         public override fun toString(): String {
            val var3: java.lang.String = this.authCode;
            val var2: java.lang.String = this.serverUrl;
            val var1: StringBuilder = new StringBuilder();
            var1.append("Success(authCode=");
            var1.append(var3);
            var1.append(", serverUrl=");
            var1.append(var2);
            var1.append(")");
            return var1.toString();
         }
      }
   }
}
