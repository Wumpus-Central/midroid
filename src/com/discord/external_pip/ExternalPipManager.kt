package com.discord.external_pip

import android.app.Activity
import android.app.PictureInPictureParams.Builder
import android.os.Build.VERSION
import android.util.Rational
import eh.r
import eh.s

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
      if (CAN_PIP) {
         var var2: Boolean = false;
         if (var1 != null) {
            var2 = false;
            if (var1.isInPictureInPictureMode()) {
               var2 = true;
            }
         }

         if (var2) {
            enterPipMode$default(this, var1, false, null, 6, null);
         }
      }
   }

   public fun enterPipMode(activity: Activity?, force: Boolean = false, onResult: (r<Unit>) -> Unit = <unrepresentable>.INSTANCE) {
      kotlin.jvm.internal.r.h(var3, "onResult");
      val var4: Boolean;
      if (!this.enabled && !var2) {
         var4 = false;
      } else {
         var4 = true;
      }

      if (!var4 || !CAN_PIP) {
         val var14: r.a = r.k;
         var3.invoke(r.a(r.b(s.a(new Exception("Disabled or unsupported.")))));
      } else {
         val var10: java.lang.Boolean;
         if (var1 != null) {
            try {
               val var15: ExternalPipManager.Companion = Companion;
               val var18: Builder = a.a(new Builder(), this.aspectRatio);
               kotlin.jvm.internal.r.g(var18, "Builder()\n              …tAspectRatio(aspectRatio)");
               var10 = c.a(var1, b.a(ExternalPipManager.Companion.access$setSeamlessResizeEnabledCompat(var15, var18, false)));
            } catch (var9: Exception) {
               val var5: r.a = r.k;
               var3.invoke(r.a(r.b(s.a(var9))));
               return;
            }
         } else {
            var10 = null;
         }

         try {
            if (kotlin.jvm.internal.r.c(var10, java.lang.Boolean.TRUE)) {
               val var13: r.a = r.k;
               var3.invoke(r.a(r.b(Unit.a)));
               return;
            }
         } catch (var8: Exception) {
            val var16: r.a = r.k;
            var3.invoke(r.a(r.b(s.a(var8))));
            return;
         }

         try {
            val var11: r.a = r.k;
            var3.invoke(r.a(r.b(s.a(new Exception("Unable to enter picture in picture mode.")))));
         } catch (var7: Exception) {
            val var17: r.a = r.k;
            var3.invoke(r.a(r.b(s.a(var7))));
         }
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
      if (!kotlin.jvm.internal.r.c(this.aspectRatio, var4)) {
         this.aspectRatio = var4;
         this.refreshPipMode(var1);
      }
   }

   public companion object {
      private final val CAN_PIP: Boolean

      private fun Builder.setSeamlessResizeEnabledCompat(enabled: Boolean): Builder {
         var var3: Builder = var1;
         if (this.isSupported()) {
            var3 = d.a(var1, var2);
         }

         kotlin.jvm.internal.r.g(var3, "if (isSupported()) {\n   …       this\n            }");
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
