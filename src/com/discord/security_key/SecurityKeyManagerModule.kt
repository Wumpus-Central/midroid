package com.discord.security_key

import android.app.Activity
import android.content.Intent
import androidx.credentials.CredentialManager
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.n
import com.facebook.react.bridge.BaseActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import sk.f

public class SecurityKeyManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val activityEventListener: <unrepresentable>
   private final val credentialManager: CredentialManager
   private final var currentPromise: Promise?
   private final val webauthn: WebAuthn

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.webauthn = new WebAuthn(new Function1(this) {
         {
            super(1, var1, SecurityKeyManagerModule::class.java, "resolve", "resolve(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "p0");
            SecurityKeyManagerModule.access$resolve(super.receiver as SecurityKeyManagerModule, var1);
         }
      }, new Function1(this) {
         {
            super(1, var1, SecurityKeyManagerModule::class.java, "reject", "reject(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "p0");
            SecurityKeyManagerModule.access$reject(super.receiver as SecurityKeyManagerModule, var1);
         }
      });
      val var2: CredentialManager.a = CredentialManager.a;
      var1 = this.getReactApplicationContext();
      q.g(var1, "getReactApplicationContext(...)");
      this.credentialManager = var2.a(var1);
      this.activityEventListener = new BaseActivityEventListener(this) {
         final SecurityKeyManagerModule this$0;

         {
            this.this$0 = var1;
         }

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
      q.h(var1, "data");
      q.h(var2, "promise");
      this.authenticateSecurityKey(var1, var2);
   }

   @ReactMethod
   public fun authenticatePasskey(requestJson: String, promise: Promise) {
      q.h(var1, "requestJson");
      q.h(var2, "promise");
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else {
         this.currentPromise = var2;
         val var3: Activity = this.getCurrentActivity();
         q.f(var3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
         f.d(
            n.a(var3 as LifecycleOwner),
            null,
            null,
            new Function2(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at java.base/java.util.Objects.equals(Objects.java:64)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper$VarInMethod.equals(VarDefinitionHelper.java:1403)
   ,
            3,
            null
         );
      }
   }

   @ReactMethod
   public fun authenticateSecurityKey(data: String, promise: Promise) {
      q.h(var1, "data");
      q.h(var2, "promise");
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else {
         this.currentPromise = var2;
         this.webauthn.authenticateSecurityKey(var1, this.getCurrentActivity());
      }
   }

   public open fun getName(): String {
      return "DCDSecurityKeyManager";
   }

   public open fun initialize() {
      super.initialize();
      this.getReactApplicationContext().addActivityEventListener(this.activityEventListener);
   }

   public open fun invalidate() {
      super.invalidate();
      this.getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
   }

   @ReactMethod
   public fun register(data: String, promise: Promise) {
      q.h(var1, "data");
      q.h(var2, "promise");
      this.registerSecurityKey(var1, var2);
   }

   @ReactMethod
   public fun registerPasskey(requestJson: String, promise: Promise) {
      q.h(var1, "requestJson");
      q.h(var2, "promise");
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else {
         this.currentPromise = var2;
         val var3: Activity = this.getCurrentActivity();
         q.f(var3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
         f.d(
            n.a(var3 as LifecycleOwner),
            null,
            null,
            new Function2(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at java.base/java.util.Objects.equals(Objects.java:64)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper$VarInMethod.equals(VarDefinitionHelper.java:1403)
   ,
            3,
            null
         );
      }
   }

   @ReactMethod
   public fun registerSecurityKey(data: String, promise: Promise) {
      q.h(var1, "data");
      q.h(var2, "promise");
      if (this.currentPromise != null) {
         var2.reject(new java.lang.Throwable("already running"));
      } else {
         this.currentPromise = var2;
         this.webauthn.registerSecurityKey(var1, this.getCurrentActivity());
      }
   }

   private companion object {
      public const val NAME: String
   }
}
