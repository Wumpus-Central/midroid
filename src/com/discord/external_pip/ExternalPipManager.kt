package com.discord.external_pip

import android.app.Activity
import android.app.PictureInPictureParams.Builder
import android.os.Build.VERSION
import android.util.Rational
import kotlin.jvm.internal.q
import nh.r
import nh.s

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

   private fun refreshPipMode(activity: Activity?) {
      if (CAN_PIP && var1 != null && var1.isInPictureInPictureMode()) {
         enterPipMode$default(this, var1, false, null, 6, null);
      }
   }

   public fun enterPipMode(activity: Activity?, force: Boolean = false, onResult: (r<Unit>) -> Unit = <unrepresentable>.INSTANCE) {
      q.h(var3, "onResult");
      if ((this.enabled || var2) && CAN_PIP) {
         val var11: java.lang.Boolean;
         if (var1 != null) {
            try {
               val var5: ExternalPipManager.Companion = Companion;
               e.a();
               val var4: Builder = a.a(d.a(), this.aspectRatio);
               q.g(var4, "setAspectRatio(...)");
               var11 = c.a(var1, b.a(ExternalPipManager.Companion.access$setSeamlessResizeEnabledCompat(var5, var4, false)));
            } catch (var8: Exception) {
               val var10: nh.r.a = r.k;
               var3.invoke(r.a(r.b(s.a(var8))));
               return;
            }
         } else {
            var11 = null;
         }

         try {
            if (q.c(var11, java.lang.Boolean.TRUE)) {
               val var16: nh.r.a = r.k;
               var3.invoke(r.a(r.b(Unit.a)));
               return;
            }
         } catch (var7: Exception) {
            val var12: nh.r.a = r.k;
            var3.invoke(r.a(r.b(s.a(var7))));
            return;
         }

         try {
            val var14: nh.r.a = r.k;
            var3.invoke(r.a(r.b(s.a(new Exception("Unable to enter picture in picture mode.")))));
         } catch (var6: Exception) {
            val var13: nh.r.a = r.k;
            var3.invoke(r.a(r.b(s.a(var6))));
         }
      } else {
         val var9: nh.r.a = r.k;
         var3.invoke(r.a(r.b(s.a(new Exception("Disabled or unsupported.")))));
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
      if (!q.c(this.aspectRatio, var4)) {
         this.aspectRatio = var4;
         this.refreshPipMode(var1);
      }
   }

   public companion object {
      private final val CAN_PIP: Boolean

      private fun Builder.setSeamlessResizeEnabledCompat(enabled: Boolean): Builder {
         var var3: Builder = var1;
         if (this.isSupported()) {
            var3 = f.a(var1, var2);
         }

         q.e(var3);
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
