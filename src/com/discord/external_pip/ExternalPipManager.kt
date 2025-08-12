package com.discord.external_pip

import android.app.Activity
import android.app.PictureInPictureParams.Builder
import android.os.Build.VERSION
import android.util.Rational
import kotlin.jvm.internal.r

internal class ExternalPipManager {
   private final var enabled: Boolean
   private final var aspectRatio: Rational = new Rational(1, 1)

   @JvmStatic
   fun {
      val var0: Boolean;
      if (VERSION.SDK_INT >= 26) {
         var0 = true;
      } else {
         var0 = false;
      }

      CAN_PIP = var0;
   }

   @JvmStatic
   fun `enterPipMode$lambda$0`(var0: Result): Unit {
      return Unit.a;
   }

   private fun refreshPipMode(activity: Activity?) {
      if (CAN_PIP && var1 != null && var1.isInPictureInPictureMode()) {
         enterPipMode$default(this, var1, false, null, 6, null);
      }
   }

   public fun enterPipMode(activity: Activity?, force: Boolean = false, onResult: (Result<Unit>) -> Unit = new f()) {
      r.h(var3, "onResult");
      if ((this.enabled || var2) && CAN_PIP) {
         val var11: java.lang.Boolean;
         if (var1 != null) {
            try {
               val var4: ExternalPipManager.Companion = Companion;
               e.a();
               val var5: Builder = a.a(d.a(), this.aspectRatio);
               r.g(var5, "setAspectRatio(...)");
               var11 = c.a(var1, b.a(ExternalPipManager.Companion.access$setSeamlessResizeEnabledCompat(var4, var5, false)));
            } catch (var8: Exception) {
               val var10: kotlin.Result.a = Result.k;
               var3.invoke(Result.a(Result.b(kotlin.c.a(var8))));
               return;
            }
         } else {
            var11 = null;
         }

         try {
            if (r.c(var11, java.lang.Boolean.TRUE)) {
               val var16: kotlin.Result.a = Result.k;
               var3.invoke(Result.a(Result.b(Unit.a)));
               return;
            }
         } catch (var7: Exception) {
            val var12: kotlin.Result.a = Result.k;
            var3.invoke(Result.a(Result.b(kotlin.c.a(var7))));
            return;
         }

         try {
            val var14: kotlin.Result.a = Result.k;
            var3.invoke(Result.a(Result.b(kotlin.c.a(new Exception("Unable to enter picture in picture mode.")))));
         } catch (var6: Exception) {
            val var13: kotlin.Result.a = Result.k;
            var3.invoke(Result.a(Result.b(kotlin.c.a(var6))));
         }
      } else {
         val var9: kotlin.Result.a = Result.k;
         var3.invoke(Result.a(Result.b(kotlin.c.a(new Exception("Disabled or unsupported.")))));
      }
   }

   public fun getEnabled(force: Boolean = false): Boolean {
      if ((this.enabled || var1) && CAN_PIP) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun setEnabled(enabled: Boolean) {
      this.enabled = var1;
   }

   public fun setPipAspectRatio(activity: Activity?, numerator: Int, denominator: Int) {
      val var4: Rational = new Rational(var2, var3);
      if (!r.c(this.aspectRatio, var4)) {
         this.aspectRatio = var4;
         this.refreshPipMode(var1);
      }
   }

   public companion object {
      private final val CAN_PIP: Boolean

      private fun Builder.setSeamlessResizeEnabledCompat(enabled: Boolean): Builder {
         var var3: Builder = var1;
         if (this.isSupported()) {
            var3 = g.a(var1, var2);
         }

         r.e(var3);
         return var3;
      }

      public fun isSupported(): Boolean {
         val var1: Boolean;
         if (VERSION.SDK_INT >= 31) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      }
   }
}
