package com.discord.security_key

import android.app.Activity
import android.content.Intent
import android.os.Build.VERSION
import androidx.credentials.CredentialManager
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.m
import com.facebook.react.bridge.BaseActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

public class SecurityKeyManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final var currentPromise: Promise?
   private final val webauthn: WebAuthn
   private final val credentialManager: CredentialManager
   private final val activityEventListener: <unrepresentable>

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
      } else if (VERSION.SDK_INT < 28) {
         var2.reject(new java.lang.Throwable("device does not support passkeys"));
      } else {
         this.currentPromise = var2;
         val var3: Activity = this.getCurrentActivity();
         q.f(var3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
         Na.f.d(
            m.a(var3 as LifecycleOwner),
            null,
            null,
            new Function2(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:829)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:258)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:829)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:251)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
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
      } else if (VERSION.SDK_INT < 28) {
         var2.reject(new java.lang.Throwable("device does not support passkeys"));
      } else {
         this.currentPromise = var2;
         val var3: Activity = this.getCurrentActivity();
         q.f(var3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
         Na.f.d(
            m.a(var3 as LifecycleOwner),
            null,
            null,
            new Function2(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:829)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:258)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:829)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:251)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
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
      public const val TAG: String
   }
}
