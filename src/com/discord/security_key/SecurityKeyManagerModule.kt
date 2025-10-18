package com.discord.security_key

import android.app.Activity
import android.content.Intent
import android.os.Build.VERSION
import androidx.credentials.CredentialManager
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.p
import com.facebook.react.bridge.BaseActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope

public class SecurityKeyManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public final val reactContext: ReactApplicationContext
   private final var currentPromise: Promise?
   private final val webauthn: WebAuthn
   private final val credentialManager: CredentialManager
   private final val activityEventListener: <unrepresentable>

   init {
      this.reactContext = var1;
      this.webauthn = new WebAuthn(new Function1<java.lang.String, Unit>(this) {
         {
            super(1, var1, SecurityKeyManagerModule::class.java, "resolve", "resolve(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            SecurityKeyManagerModule.access$resolve(super.receiver as SecurityKeyManagerModule, var1);
         }
      }, new Function1<java.lang.String, Unit>(this) {
         {
            super(1, var1, SecurityKeyManagerModule::class.java, "reject", "reject(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            SecurityKeyManagerModule.access$reject(super.receiver as SecurityKeyManagerModule, var1);
         }
      });
      val var2: androidx.credentials.CredentialManager.a = CredentialManager.a;
      var1 = this.getReactApplicationContext();
      this.credentialManager = var2.a(var1);
      this.activityEventListener = new BaseActivityEventListener(this) {
         final SecurityKeyManagerModule this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onActivityResult(Activity var1, int var2, int var3, Intent var4) {
            SecurityKeyManagerModule.access$getWebauthn$p(this.this$0).onActivityResult(var2, var3, var4);
         }
      };
   }

   private fun reject(message: String) {
      this.reject(new java.lang.Throwable(var1));
   }

   private fun reject(e: Throwable) {
      if (this.currentPromise != null) {
         this.currentPromise.reject(var1);
      }

      this.currentPromise = null;
   }

   private fun resolve(data: String) {
      if (this.currentPromise != null) {
         this.currentPromise.resolve(var1);
      }

      this.currentPromise = null;
   }

   @ReactMethod
   public fun authenticate(data: String, promise: Promise) {
      this.authenticateSecurityKey(var1, var2);
   }

   @ReactMethod
   public fun authenticatePasskey(requestJson: String, promise: Promise) {
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else if (VERSION.SDK_INT < 28) {
         var2.reject(new java.lang.Throwable("device does not support passkeys"));
      } else {
         this.currentPromise = var2;
         val var3: Activity = this.reactContext.getCurrentActivity();
         gc.f.d(
            p.a(var3 as LifecycleOwner),
            null,
            null,
            new Function2<CoroutineScope, Continuation, Object>(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
            3,
            null
         );
      }
   }

   @ReactMethod
   public fun authenticateSecurityKey(data: String, promise: Promise) {
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else {
         this.currentPromise = var2;
         this.webauthn.authenticateSecurityKey(var1, this.reactContext.getCurrentActivity());
      }
   }

   public override fun getName(): String {
      return "DCDSecurityKeyManager";
   }

   public override fun initialize() {
      super.initialize();
      this.getReactApplicationContext().addActivityEventListener(this.activityEventListener);
   }

   public override fun invalidate() {
      super.invalidate();
      this.getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
   }

   @ReactMethod
   public fun register(data: String, promise: Promise) {
      this.registerSecurityKey(var1, var2);
   }

   @ReactMethod
   public fun registerPasskey(requestJson: String, promise: Promise) {
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else if (VERSION.SDK_INT < 28) {
         var2.reject(new java.lang.Throwable("device does not support passkeys"));
      } else {
         this.currentPromise = var2;
         val var3: Activity = this.reactContext.getCurrentActivity();
         gc.f.d(
            p.a(var3 as LifecycleOwner),
            null,
            null,
            new Function2<CoroutineScope, Continuation, Object>(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
            3,
            null
         );
      }
   }

   @ReactMethod
   public fun registerSecurityKey(data: String, promise: Promise) {
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else {
         this.currentPromise = var2;
         this.webauthn.registerSecurityKey(var1, this.reactContext.getCurrentActivity());
      }
   }

   private companion object {
      public const val TAG: String
   }
}
