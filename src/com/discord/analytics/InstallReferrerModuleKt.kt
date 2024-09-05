package com.discord.analytics

import bk.b
import com.android.installreferrer.api.InstallReferrerClient
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function1
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e
import n4.a
import vj.r
import vj.s

@JvmSynthetic
fun `access$await`(var0: InstallReferrerClient, var1: Continuation): Any {
   return await(var0, var1);
}

private suspend fun InstallReferrerClient.await(): Int {
   val var2: e = new e(b.c(var1), 1);
   var2.F();
   val var4: a = new a(var2) {
      final CancellableContinuation $continuation;

      {
         this.$continuation = var1;
      }

      @Override
      public void onInstallReferrerServiceDisconnected() {
         if (this.$continuation.e()) {
            kotlinx.coroutines.CancellableContinuation.a.a(this.$continuation, null, 1, null);
         }
      }

      @Override
      public void onInstallReferrerSetupFinished(int var1) {
         this.$continuation.resumeWith(r.b(var1));
      }
   };
   var2.c(
      new Function1(var0) {
         final InstallReferrerClient $this_await;

         {
            super(1);
            this.$this_await = var1;
         }

         // $VF: Could not inline inconsistent finally blocks
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         public final void invoke(java.lang.Throwable var1) {
            val var2: InstallReferrerClient = this.$this_await;

            try {
               val var6: vj.r.a = r.k;
               var2.a();
               r.b(Unit.a);
            } catch (var3: java.lang.Throwable) {
               val var5: vj.r.a = r.k;
               r.b(s.a(var3));
               return;
            }
         }
      }
   );

   label20:
   try {
      val var3: vj.r.a = r.k;
      var0.d(var4);
      var8 = r.b(Unit.a);
   } catch (var5: java.lang.Throwable) {
      val var7: vj.r.a = r.k;
      var8 = r.b(s.a(var5));
      break label20;
   }

   val var9: java.lang.Throwable = r.e(var8);
   if (var9 != null) {
      var2.resumeWith(r.b(s.a(var9)));
   }

   val var10: Any = var2.z();
   if (var10 === b.f()) {
      g.c(var1);
   }

   return var10;
}
