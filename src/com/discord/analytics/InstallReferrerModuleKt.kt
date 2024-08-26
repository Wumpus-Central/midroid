package com.discord.analytics

import com.android.installreferrer.api.InstallReferrerClient
import eh.r
import eh.s
import kh.b
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function1
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e
import v2.a

@JvmSynthetic
fun `access$await`(var0: InstallReferrerClient, var1: Continuation): Any {
   return await(var0, var1);
}

private suspend fun InstallReferrerClient.await(): Int {
   val var2: e = new e(b.b(var1), 1);
   var2.D();
   val var4: a = new a(var2) {
      final CancellableContinuation<Integer> $continuation;

      {
         this.$continuation = var1;
      }

      @Override
      public void onInstallReferrerServiceDisconnected() {
         if (this.$continuation.b()) {
            kotlinx.coroutines.CancellableContinuation.a.a(this.$continuation, null, 1, null);
         }
      }

      @Override
      public void onInstallReferrerSetupFinished(int var1) {
         this.$continuation.resumeWith(r.b(var1));
      }
   };
   var2.j(
      new Function1<java.lang.Throwable, Unit>(var0) {
         final InstallReferrerClient $this_await;

         {
            super(1);
            this.$this_await = var1;
         }

         // $VF: Could not inline inconsistent finally blocks
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         public final void invoke(java.lang.Throwable var1) {
            val var5: InstallReferrerClient = this.$this_await;

            try {
               val var6: eh.r.a = r.k;
               var5.a();
               r.b(Unit.a);
            } catch (var3: java.lang.Throwable) {
               val var2: eh.r.a = r.k;
               r.b(s.a(var3));
               return;
            }
         }
      }
   );

   label20:
   try {
      val var10: eh.r.a = r.k;
      var0.d(var4);
      var7 = r.b(Unit.a);
   } catch (var5: java.lang.Throwable) {
      val var3: eh.r.a = r.k;
      var7 = r.b(s.a(var5));
      break label20;
   }

   val var8: java.lang.Throwable = r.e(var7);
   if (var8 != null) {
      var2.resumeWith(r.b(s.a(var8)));
   }

   val var9: Any = var2.A();
   if (var9 === b.c()) {
      g.c(var1);
   }

   return var9;
}
