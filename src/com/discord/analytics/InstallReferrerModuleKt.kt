@file:SourceDebugExtension(["SMAP\nInstallReferrerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallReferrerModule.kt\ncom/discord/analytics/InstallReferrerModuleKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,98:1\n314#2,11:99\n*S KotlinDebug\n*F\n+ 1 InstallReferrerModule.kt\ncom/discord/analytics/InstallReferrerModuleKt\n*L\n74#1:99,11\n*E\n"])

package com.discord.analytics

import G9.b
import com.android.installreferrer.api.InstallReferrerClient
import com.android.installreferrer.api.InstallReferrerStateListener
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e
import kotlinx.coroutines.CancellableContinuation.a

@JvmSynthetic
fun `access$await`(var0: InstallReferrerClient, var1: Continuation): Any {
   return await(var0, var1);
}

private suspend fun InstallReferrerClient.await(): Int {
   val var2: e = new e(b.c(var1), 1);
   var2.C();
   val var3: InstallReferrerStateListener = new InstallReferrerStateListener(var2) {
      final CancellableContinuation $continuation;

      {
         this.$continuation = var1;
      }

      @Override
      public void onInstallReferrerServiceDisconnected() {
         if (this.$continuation.c()) {
            a.a(this.$continuation, null, 1, null);
         }
      }

      @Override
      public void onInstallReferrerSetupFinished(int var1) {
         this.$continuation.resumeWith(Result.b(var1));
      }
   };
   var2.f(
      new Function1<java.lang.Throwable, Unit>(var0) {
         final InstallReferrerClient $this_await;

         {
            this.$this_await = var1;
         }

         // $VF: Could not inline inconsistent finally blocks
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         public final void invoke(java.lang.Throwable var1) {
            val var5: InstallReferrerClient = this.$this_await;

            try {
               val var2: kotlin.Result.a = Result.e;
               var5.endConnection();
               Result.b(Unit.a);
            } catch (var3: java.lang.Throwable) {
               val var6: kotlin.Result.a = Result.e;
               Result.b(c.a(var3));
               return;
            }
         }
      }
   );

   label20:
   try {
      val var4: kotlin.Result.a = Result.e;
      var0.startConnection(var3);
      var7 = Result.b(Unit.a);
   } catch (var5: java.lang.Throwable) {
      val var10: kotlin.Result.a = Result.e;
      var7 = Result.b(c.a(var5));
      break label20;
   }

   val var8: java.lang.Throwable = Result.e(var7);
   if (var8 != null) {
      var2.resumeWith(Result.b(c.a(var8)));
   }

   val var9: Any = var2.z();
   if (var9 === b.e()) {
      g.c(var1);
   }

   return var9;
}
